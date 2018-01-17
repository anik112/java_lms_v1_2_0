/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.dao;

import java.util.List;
import lms_V1.pkg2.pkg0.domain.Author;

/**
 *
 * @author anik
 */
public interface AuthorDao {

    /**
     * <saveAuthorInformation(Author author)/> this method save all author
     * information,
     * <deleteAuthorInformation(int id)/> this method delete author information,
     * <List<Author> getAuthorList()/> this method return author list;
     *
     * @param author
     */
    public void saveAuthorInformation(Author author);

    public void deleteAuthorInformation(int id);

    public List<Author> getAuthorList();

}
