/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.service;

import connection.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lms_V1.pkg2.pkg0.dao.BookReciveDao;
import lms_V1.pkg2.pkg0.domain.BookRecive;

/**
 *
 * @author anik
 */
public class BookReciveService implements BookReciveDao {

    private Connection connection;

    public BookReciveService() {
        connection = DBconnect.getConnection();
    }

    @Override
    public void saveBookRecive(BookRecive bookRecive) {

        try {

            if (bookRecive != null) {

                PreparedStatement statement;
                statement = connection.prepareStatement("INSERT INTO book_recive (book_id,library_member_id,submit_date,qty,submit_by) VALUES (?,?,?,?,?)");

                statement.setString(1, bookRecive.getBookId());
                statement.setInt(2, bookRecive.getLibMemberId());
                statement.setString(3, bookRecive.getSubmitDate());
                statement.setInt(4, bookRecive.getQty());
                statement.setString(5, bookRecive.getSubmitBy());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(BookReciveService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public void deleteBookRecive(int id) {

        try {

            if (id > 0) {

                PreparedStatement statement;
                statement = connection.prepareStatement("DELETE FROM book_recive WHERE id=?");

                statement.setInt(1, id);

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(BookReciveService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public List<BookRecive> getBookReciveList() {
        
        
        BookRecive bookRecive;
        List<BookRecive> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_recive");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                
                bookRecive=new BookRecive();
                
                bookRecive.setId(resultSet.getInt(1));
                bookRecive.setBookId(resultSet.getString(2));
                bookRecive.setLibMemberId(resultSet.getInt(3));
                bookRecive.setSubmitDate(resultSet.getString(4));
                bookRecive.setQty(resultSet.getInt(5));
                bookRecive.setSubmitBy(resultSet.getString(6));
                
                list.add(bookRecive);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookReciveService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public void updateQtyInBookReciveTable(String bookId, int currentQty){
        
        int mainQty = 0;

        try {

            if (bookId != null) {

                PreparedStatement statement;
                statement = connection.prepareStatement("SELECT qty FROM book_information WHERE book_code=?");
                statement.setString(1, bookId);
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    mainQty = Integer.parseInt(resultSet.getString(1));
                    //System.out.println(mainQty);
                }
            }

        } catch (SQLException e) {
            Logger.getLogger(BookInformationService.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        try {

            if ( currentQty != 0) {

                PreparedStatement statement;
                statement = connection.prepareStatement("UPDATE book_information SET qty=? WHERE book_code=?");

                statement.setInt(1, mainQty+currentQty);
                statement.setString(2, bookId);
                
                statement.executeUpdate();
            }

        } catch (SQLException e) {
            Logger.getLogger(BookInformationService.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }

}
