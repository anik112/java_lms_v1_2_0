/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.dao;

import java.util.List;
import lms_V1.pkg2.pkg0.domain.BookRecive;

/**
 *
 * @author anik
 */
public interface BookReciveDao {

    /**
     * <saveBookRecive(BookRecive bookRecive)/> this method save all BookRecive
     * information,
     * <deleteBookRecive(int id)/> this method delete BookRecive information,
     * <List<BookRecive> getBookReciveList()/> this method return BookRecive
     * list,
     *
     * @param bookRecive
     */
    public void saveBookRecive(BookRecive bookRecive);

    public void deleteBookRecive(int id);

    public List<BookRecive> getBookReciveList();

}
