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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import lms_V1.pkg2.pkg0.dao.BookInformationDao;
import lms_V1.pkg2.pkg0.domain.BookInformation;

/**
 *
 * @author anik
 */
public class BookInformationService implements BookInformationDao {

    private Connection connection;

    /**
     * Called --- constructor and get Database connection,
     */
    public BookInformationService() {
        connection = DBconnect.getConnection();
    }

    /**
     * [ saveBookInformation() ] This method save data in database in selected
     * table,
     *
     * @param bookInformation
     */
    @Override
    public void saveBookInformation(BookInformation bookInformation) {

        try {

            if (bookInformation.getName() != null) {

                PreparedStatement statement;
                statement = connection.prepareStatement("INSERT INTO book_information (book_name,book_code,author_name,publisher_name,edition,unit_price,qty,total_price,rack_no,issn_no,category,purchase_date) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");

                statement.setString(1, bookInformation.getName());
                statement.setString(2, bookInformation.getBookCode());
                statement.setString(3, bookInformation.getAuthor());
                statement.setString(4, bookInformation.getPublisher());
                statement.setString(5, bookInformation.getEdition());
                statement.setInt(6, bookInformation.getUnitPrice());
                statement.setInt(7, bookInformation.getQty());
                statement.setInt(8, bookInformation.getTotalPrice());
                statement.setInt(9, bookInformation.getRackNO());
                statement.setString(10, bookInformation.getIssnNo());
                statement.setString(11, bookInformation.getCategory());
                statement.setString(12, bookInformation.getPurchaseDate());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(BookInformationService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    /**
     * [ updateLibraryMemberInformation() ] This method update data in database
     * in selected table,
     *
     * @param bookInformation
     */
    @Override
    public void updateBookInformation(BookInformation bookInformation) {

        try {

            if (bookInformation.getName() != null) {

                PreparedStatement statement;
                statement = connection.prepareStatement("UPDATE book_information SET book_name=?,book_code=?,author_name=?,publisher_name=?,edition=?,unit_price=?,qty=?,total_price=?,rack_no=?,issn_no=?,category=?,purchase_date=? WHERE id=?");

                statement.setString(1, bookInformation.getName());
                statement.setString(2, bookInformation.getBookCode());
                statement.setString(3, bookInformation.getAuthor());
                statement.setString(4, bookInformation.getPublisher());
                statement.setString(5, bookInformation.getEdition());
                statement.setInt(6, bookInformation.getUnitPrice());
                statement.setInt(7, bookInformation.getQty());
                statement.setInt(8, bookInformation.getTotalPrice());
                statement.setInt(9, bookInformation.getRackNO());
                statement.setString(10, bookInformation.getIssnNo());
                statement.setString(11, bookInformation.getCategory());
                statement.setString(12, bookInformation.getPurchaseDate());
                statement.setInt(13, bookInformation.getId());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(BookInformationService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    /**
     * [ updateLibraryMemberInformation() ] This method update data in database
     * in selected table,
     *
     * @param id
     */
    @Override
    public void deleteBookInformation(int id) {

        try {

            if (id > 0) {

                PreparedStatement statement;
                statement = connection.prepareStatement("DELETE FROM book_information WHERE id=?");

                statement.setInt(1, id);

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(BookInformationService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public List<BookInformation> getBookInformation() {

        BookInformation bookInformation;
        List<BookInformation> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_information");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookInformation = new BookInformation();

                bookInformation.setId(resultSet.getInt(1));
                bookInformation.setName(resultSet.getString(2));
                bookInformation.setBookCode(resultSet.getString(3));
                bookInformation.setAuthor(resultSet.getString(4));
                bookInformation.setPublisher(resultSet.getString(5));
                bookInformation.setEdition(resultSet.getString(6));
                bookInformation.setUnitPrice(resultSet.getInt(7));
                bookInformation.setQty(resultSet.getInt(8));
                bookInformation.setTotalPrice(resultSet.getInt(9));
                bookInformation.setRackNO(resultSet.getInt(10));
                bookInformation.setIssnNo(resultSet.getString(11));
                bookInformation.setCategory(resultSet.getString(12));
                bookInformation.setPurchaseDate(resultSet.getString(13));

                list.add(bookInformation);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    
    
    public List<BookInformation> getBooListForDeshbord() {

        BookInformation bookInformation;
        List<BookInformation> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT book_name,book_code,author_name,publisher_name,unit_price,total_price FROM book_information ORDER BY qty DESC LIMIT 4;");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookInformation = new BookInformation();

                bookInformation.setName(resultSet.getString(1));
                bookInformation.setBookCode(resultSet.getString(2));
                bookInformation.setAuthor(resultSet.getString(3));
                bookInformation.setPublisher(resultSet.getString(4));
                bookInformation.setUnitPrice(resultSet.getInt(5));
                bookInformation.setTotalPrice(resultSet.getInt(6));
                list.add(bookInformation);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
    
    
    public Set<BookInformation> getBookInformationSet() {
        Set<BookInformation> list = new HashSet<>();

        try {
            BookInformation bookInformation;
            PreparedStatement stmt = connection.prepareStatement("select * from book_information");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bookInformation = new BookInformation();
                bookInformation.setName(rs.getString(2));
                bookInformation.setBookCode(rs.getString(3));
                if ((rs.getInt(8)) > 0) {
                    bookInformation.setQty(rs.getInt(8));
                    list.add(bookInformation);
                } else {
                    bookInformation.setQty(0);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
