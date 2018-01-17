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
import lms_V1.pkg2.pkg0.dao.AuthorDao;
import lms_V1.pkg2.pkg0.dao.LmsSecurity;
import lms_V1.pkg2.pkg0.domain.Author;

/**
 *
 * @author anik
 */
public class AuthorService implements AuthorDao {

    private final Connection connect;

    public AuthorService() {
        this.connect = DBconnect.getConnection();
    }

    @Override
    public void saveAuthorInformation(Author author) {

        try {

            if (author.getName() != null) {

                PreparedStatement statement = connect.prepareStatement("INSERT INTO author(author_name,date_of_birth,date_of_dead,about) VALUES (?,?,?,?)");

                statement.setString(1, author.getName());
                statement.setString(2, author.getDateOfBirth());
                statement.setString(3, author.getDateOfDead());
                statement.setString(4, author.getAbout());

                statement.executeUpdate();
            }

        } catch (SQLException e) {
            Logger.getLogger(AuthorService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public void deleteAuthorInformation(int id) {
        try {

            if (id > 0) {

                PreparedStatement statement;
                statement = connect.prepareStatement("DELETE FROM author WHERE id=?");
                
                statement.setInt(1, id);

                statement.executeUpdate();
            }
        } catch (SQLException e) {
            Logger.getLogger(AuthorService.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public List<Author> getAuthorList() {
        
        List<Author> authorList=new ArrayList<>();
        
        try {
            
            PreparedStatement statement;
            statement=connect.prepareStatement("SELECT * FROM author");
            ResultSet result;
            result=statement.executeQuery();
            
            while (result.next()) {                
                
                Author author=new Author();
                
                author.setId(result.getInt(1));
                author.setName(result.getString(2));
                author.setDateOfBirth(result.getString(3));
                author.setDateOfDead(result.getString(4));
                author.setAbout(result.getString(5));
                
                authorList.add(author);
            }
            
            
        } catch (SQLException e) {
            Logger.getLogger(AuthorService.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return authorList;
    }
    
    
    public Set<Author> getAuthorSet() {
        Set<Author> list = new HashSet<>();
        
        try {
            Author author;
            PreparedStatement stmt = connect.prepareStatement("select *from author");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                author=new Author();
                author.setName(rs.getString(2));
                list.add(author);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
}
