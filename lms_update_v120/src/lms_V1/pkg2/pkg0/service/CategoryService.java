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
import lms_V1.pkg2.pkg0.dao.CategoryDao;
import lms_V1.pkg2.pkg0.domain.Category;

/**
 *
 * @author anik
 */
public class CategoryService implements CategoryDao {

    private Connection connection;

    /**
     * Called --- constructor and get Database connection,
     */
    public CategoryService() {
        connection = DBconnect.getConnection();
    }

    /**
     * [ saveCategory() ] This method save data in database in selected table,
     *
     * @param category
     */
    @Override
    public void saveCategory(Category category) {
        try {

            if (category.getName() != null) {

                PreparedStatement statement;
                statement = connection.prepareStatement("INSERT INTO category(category_name) VALUES (?)");

                statement.setString(1, category.getName());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * [ deleteCategory() ] This method delete data in database in selected
     * table,
     *
     * @param id
     */
    @Override
    public void deleteCategory(int id) {

        try {

            if (id > 0) {

                PreparedStatement statement;
                statement = connection.prepareStatement("DELETE FROM category WHERE id=?");

                statement.setInt(1, id);

                statement.executeUpdate();

            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * [ getCategoryList() ] this method get all data from selected table and
     * return a list,
     *
     * @return
     */
    @Override
    public List<Category> getCategoryList() {

        Category category;
        List<Category> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM category");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                category = new Category();
                category.setId(resultSet.getInt(1));
                category.setName(resultSet.getString(2));

                list.add(category);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public Set<Category> getCategorySet() {
        Set<Category> list = new HashSet<>();

        try {
            Category category;
            PreparedStatement stmt = connection.prepareStatement("select *from category");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                category = new Category();
                category.setName(rs.getString(2));
                list.add(category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
