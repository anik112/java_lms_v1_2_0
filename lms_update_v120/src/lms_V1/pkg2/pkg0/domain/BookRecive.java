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
public class BookRecive {
 
    
    private int id;
    private String bookId; 
    private int libMemberId;
    private String submitDate;
    private int qty;
    private String submitBy;

    public BookRecive() {
    }

    public BookRecive(String bookId, int libMemberId, String submitDate, int qty, String submitBy) {
        this.bookId = bookId;
        this.libMemberId = libMemberId;
        this.submitDate = submitDate;
        this.qty = qty;
        this.submitBy = submitBy;
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

    public int getLibMemberId() {
        return libMemberId;
    }

    public void setLibMemberId(int libMemberId) {
        this.libMemberId = libMemberId;
    }

    public String getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getSubmitBy() {
        return submitBy;
    }

    public void setSubmitBy(String submitBy) {
        this.submitBy = submitBy;
    }
    
    

  
    
    
}
