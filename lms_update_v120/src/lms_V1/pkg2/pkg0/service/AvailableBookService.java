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
import lms_V1.pkg2.pkg0.domain.BookInformation;

/**
 *
 * @author anik
 */
public class AvailableBookService {

    private Connection connection;

    public AvailableBookService() {
        connection = DBconnect.getConnection();
    }

    public List<BookInformation> getBookInformationForSearchTable(String issn_no) {

        BookInformation bookInformation;
        List<BookInformation> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT book_name,book_code,author_name,publisher_name,edition,qty,category FROM book_information WHERE issn_no=?");
            statement.setString(1, issn_no);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookInformation = new BookInformation();

                bookInformation.setName(resultSet.getString(1));
                bookInformation.setBookCode(resultSet.getString(2));
                bookInformation.setAuthor(resultSet.getString(3));
                bookInformation.setPublisher(resultSet.getString(4));
                bookInformation.setEdition(resultSet.getString(5));

                if ((resultSet.getInt(6)) > 0) {
                    bookInformation.setQty(resultSet.getInt(6));
                }else{
                    bookInformation.setQty(000000000);
                }
                
                bookInformation.setCategory(resultSet.getString(7));

                list.add(bookInformation);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<BookInformation> getBookInformationForAllAvailabelTable() {

        BookInformation bookInformation;
        List<BookInformation> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT book_name,book_code,author_name,publisher_name,edition,qty,category FROM book_information ORDER BY qty DESC LIMIT 100");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookInformation = new BookInformation();

                bookInformation.setName(resultSet.getString(1));
                bookInformation.setBookCode(resultSet.getString(2));
                bookInformation.setAuthor(resultSet.getString(3));
                bookInformation.setPublisher(resultSet.getString(4));
                bookInformation.setEdition(resultSet.getString(5));
                bookInformation.setQty(resultSet.getInt(6));
                bookInformation.setCategory(resultSet.getString(7));

                list.add(bookInformation);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

}
