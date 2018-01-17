/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.domain;

/**
 *
 * @author anik
 */
public class BookIssue {
    
    
    private int id;
    private String bookId;
    private int libraryMemberId;
    private String issueDate;
    private String ExpireDate;
    private String ReturnDate;
    private int qty;
    private String status;

    public BookIssue() {
    }

    public BookIssue(String bookId, int libraryMemberId, String issueDate, String ExpireDate, String ReturnDate, int qty, String status) {
        this.bookId = bookId;
        this.libraryMemberId = libraryMemberId;
        this.issueDate = issueDate;
        this.ExpireDate = ExpireDate;
        this.ReturnDate = ReturnDate;
        this.qty = qty;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getLibraryMemberId() {
        return libraryMemberId;
    }

    public void setLibraryMemberId(int libraryMemberId) {
        this.libraryMemberId = libraryMemberId;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpireDate() {
        return ExpireDate;
    }

    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
}
