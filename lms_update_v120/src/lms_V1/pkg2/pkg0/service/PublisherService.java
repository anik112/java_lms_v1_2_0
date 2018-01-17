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
import lms_V1.pkg2.pkg0.dao.PublisherDao;
import lms_V1.pkg2.pkg0.domain.Publisher;

/**
 *
 * @author anik
 */
public class PublisherService implements PublisherDao {

    private Connection connection;

    /**
     * Called --- constructor and get Database connection,
     */
    public PublisherService() {
        connection = DBconnect.getConnection();
    }

    /**
     * [ savePublisher() ] This method save data in database in selected table,
     *
     * @param publisher
     */
    @Override
    public void savePublisher(Publisher publisher) {

        try {

            if (publisher.getName() != null) {

                PreparedStatement statement;
                statement = connection.prepareStatement("INSERT INTO publisher(publisher_name) VALUES (?)");

                statement.setString(1, publisher.getName());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    /**
     * [ deletePublisher() ] This method delete data in database in selected
     * table,
     *
     * @param id
     */
    @Override
    public void deletePublisher(int id) {
        try {

            if (id > 0) {

                PreparedStatement statement;
                statement = connection.prepareStatement("DELETE FROM publisher WHERE id=?");

                statement.setInt(1, id);

                statement.executeUpdate();

            }
        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * [ getPublisherList() ] this method get all data from selected table and
     * return a list,
     *
     * @return
     */
    @Override
    public List<Publisher> getPublisherList() {

        Publisher publisher;
        List<Publisher> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM publisher");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                publisher = new Publisher();
                publisher.setId(resultSet.getInt(1));
                publisher.setName(resultSet.getString(2));

                list.add(publisher);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Set<Publisher> getPublisherSet() {
        Set<Publisher> list = new HashSet<>();

        try {
            Publisher publisher;
            PreparedStatement stmt = connection.prepareStatement("select *from publisher");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                publisher = new Publisher();
                publisher.setName(rs.getString(2));
                list.add(publisher);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
