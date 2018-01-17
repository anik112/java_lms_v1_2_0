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
import lms_V1.pkg2.pkg0.dao.BookIssueDao;
import lms_V1.pkg2.pkg0.domain.BookIssue;
import lms_V1.pkg2.pkg0.domain.BookRecive;

/**
 *
 * @author anik
 */
public class BookIssueService implements BookIssueDao {

    private Connection connection;

    /**
     * Called --- constructor and get Database connection,
     */
    public BookIssueService() {
        connection = DBconnect.getConnection();
    }

    @Override
    public void saveIssueBook(BookIssue bookIssue) {
        try {

            if (bookIssue.getLibraryMemberId() > 0) {

                PreparedStatement statement;
                statement = connection.prepareStatement("INSERT INTO book_issue (book_id,library_member_id,issue_date,expire_date,return_date,qty,_status) VALUES (?,?,?,?,?,?,?)");

                statement.setString(1, bookIssue.getBookId());
                statement.setInt(2, bookIssue.getLibraryMemberId());
                statement.setString(3, bookIssue.getIssueDate());
                statement.setString(4, bookIssue.getExpireDate());
                statement.setString(5, bookIssue.getReturnDate());
                statement.setInt(6, bookIssue.getQty());
                statement.setString(7, bookIssue.getStatus());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(BookInformationService.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void deleteIssueBook(int id) {

        try {

            if (id > 0) {

                PreparedStatement statement;
                statement = connection.prepareStatement("DELETE FROM book_issue WHERE id=?");

                statement.setInt(1, id);

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(BookInformationService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public List<BookIssue> getIssueBookList() {

        BookIssue bookIssue;
        List<BookIssue> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_issue");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookIssue = new BookIssue();

                bookIssue.setId(resultSet.getInt(1));
                bookIssue.setBookId(resultSet.getString(2));
                bookIssue.setLibraryMemberId(resultSet.getInt(3));
                bookIssue.setIssueDate(resultSet.getString(4));
                bookIssue.setExpireDate(resultSet.getString(5));
                bookIssue.setReturnDate(resultSet.getString(6));
                bookIssue.setQty(resultSet.getInt(7));
                bookIssue.setStatus(resultSet.getString(8));

                list.add(bookIssue);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<BookIssue> getIssueBookListOderByLibMemberId(int id) {

        BookRecive bookRecive = new BookRecive();

        BookIssue bookIssue;
        List<BookIssue> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_issue WHERE library_member_id=?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookIssue = new BookIssue();

                bookIssue.setId(resultSet.getInt(1));
                bookIssue.setBookId(resultSet.getString(2));
                bookIssue.setLibraryMemberId(resultSet.getInt(3));
                bookIssue.setIssueDate(resultSet.getString(4));
                bookIssue.setExpireDate(resultSet.getString(5));
                bookIssue.setReturnDate(resultSet.getString(6));
                bookIssue.setQty(resultSet.getInt(7));
                bookIssue.setStatus(resultSet.getString(8));

                list.add(bookIssue);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public int updateQtyInBookInfoTable(String bookId, int currentQty) {

        int mainQty = 0;
        int tampQty = 0;

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

        if (mainQty > currentQty) {
            tampQty = mainQty - currentQty;
        }else{
            tampQty=0;
        }

        try {

            if ( tampQty != 0) {

                PreparedStatement statement;
                statement = connection.prepareStatement("UPDATE book_information SET qty=? WHERE book_code=?");

                statement.setInt(1, tampQty);
                statement.setString(2, bookId);
                
                statement.executeUpdate();
                return 101;
            }else{
                return 0;
            }

        } catch (SQLException e) {
            Logger.getLogger(BookInformationService.class.getName()).log(Level.SEVERE, null, e);
        }
        return 0;
    }

}
