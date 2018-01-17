/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.dao;

import java.util.List;
import lms_V1.pkg2.pkg0.domain.BookIssue;

/**
 *
 * @author anik
 */
public interface BookIssueDao {

    /**
     * <saveIssueBook(BookIssue bookIssue)/> this method save all BookIssue
     * information,
     * <deleteIssueBook(int id)/> this method delete book issue information,
     * <List<BookIssue> getIssueBookList()/> this method return BookIssue list,
     *
     * @param bookIssue
     */
    public void saveIssueBook(BookIssue bookIssue);

    public void deleteIssueBook(int id);

    public List<BookIssue> getIssueBookList();

}
