/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.domain;

import java.util.logging.Logger;

/**
 *
 * @author anik
 */
public class BookInformation {
    
    
    private int id;
    private String name;
    private String bookCode;
    private String author;
    private String publisher;
    private String edition;
    private int unitPrice;
    private int qty;
    private int totalPrice;
    private int rackNO;
    private String issnNo;
    private String category;
    private String purchaseDate;

    
    
    
    public BookInformation() {
    }

    public BookInformation(String name, String bookCode, String author, String publisher, String edition, int unitPrice, int qty, int totalPrice, int rackNO, String issnNo, String category, String purchaseDate) {
        this.name = name;
        this.bookCode = bookCode;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.totalPrice = totalPrice;
        this.rackNO = rackNO;
        this.issnNo = issnNo;
        this.category = category;
        this.purchaseDate = purchaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getRackNO() {
        return rackNO;
    }

    public void setRackNO(int rackNO) {
        this.rackNO = rackNO;
    }

    public String getIssnNo() {
        return issnNo;
    }

    public void setIssnNo(String issnNo) {
        this.issnNo = issnNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
    
    
    
    
}
