/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.dao;

import java.util.List;
import lms_V1.pkg2.pkg0.domain.BookInformation;

/**
 *
 * @author anik
 */
public interface BookInformationDao {

    /**
     * <saveBookInformation(BookInformation bookInformation)/> this method save
     * all BookInformation information,
     * <updateBookInformation(BookInformation bookInformation)/> this method
     * update BookInformation information,
     * <deleteBookInformation(int id)/> this method delete BookInformation
     * information, <List<BookInformation> getBookInformation()/> this method
     * return BookInformaton list;
     *
     * @param bookInformation
     */
    public void saveBookInformation(BookInformation bookInformation);

    public void updateBookInformation(BookInformation bookInformation);

    public void deleteBookInformation(int id);

    public List<BookInformation> getBookInformation();

}
