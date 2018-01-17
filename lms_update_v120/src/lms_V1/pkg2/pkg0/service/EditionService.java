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
import lms_V1.pkg2.pkg0.dao.EditionDao;
import lms_V1.pkg2.pkg0.domain.Edition;

/**
 *
 * @author anik
 */
public class EditionService implements EditionDao {

    private Connection connection;
    private Edition edition;

    /**
     * Called --- constructor and get Database connection,
     */
    public EditionService() {
        connection = DBconnect.getConnection();
    }

    /**
     * [ saveEdition() ] This method save data in database in selected table,
     *
     * @param edition
     */
    @Override
    public void saveEdition(Edition edition) {

        try {

            if (edition.getName() != null) {

                PreparedStatement statement;
                statement = connection.prepareStatement("INSERT INTO edition(edition_name) VALUES (?)");

                statement.setString(1, edition.getName());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(EditionService.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * [ deeleteEdition() ] This method delete data in database in selected
     * table,
     *
     * @param id
     */
    @Override
    public void deleteEdition(int id) {

        try {

            if (id > 0) {

                PreparedStatement statement;
                statement = connection.prepareStatement("DELETE FROM edition WHERE id=?");

                statement.setInt(1, id);

                statement.executeUpdate();

            }
        } catch (SQLException ex) {
            Logger.getLogger(EditionService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * [ getEditionList() ] this method get all data from selected table and
     * return a list,
     *
     * @return
     */
    @Override
    public List<Edition> getEditionList() {

        List<Edition> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM edition");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                edition = new Edition();

                edition.setId(resultSet.getInt(1));
                edition.setName(resultSet.getString(2));

                list.add(edition);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EditionService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    
    public Set<Edition> getEditionSet() {
        Set<Edition> list = new HashSet<>();

        try {
            Edition edition;
            PreparedStatement stmt = connection.prepareStatement("select *from edition");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                edition=new Edition();
                edition.setName(rs.getString(2));
                list.add(edition);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Edition.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
