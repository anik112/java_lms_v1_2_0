/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.domain;

import lms_V1.pkg2.pkg0.photoType.AddressInfo;
import lms_V1.pkg2.pkg0.photoType.ContactInfo;

/**
 *
 * @author anik
 */
public class LibrarianAccount {

    private int id;
    private String name;
    private int codeNumber;
    private ContactInfo contactInfo;
    private AddressInfo addressInfo;
    private String shift;
    private String userName;
    private String password;

    public LibrarianAccount() {
        contactInfo = new ContactInfo();
        addressInfo = new AddressInfo();
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

    public int getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setContactInfo(String mobileNo, String email) {
        //this.contactInfo=new ContactInfo();
        this.contactInfo.setMobileNumber(mobileNo);
        this.contactInfo.setEmail(email);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddressInfo(String houseNo, String roadNo, String blockOrVillage, String thana, String district, String division) {
        //this.addressInfo = new AddressInfo();
        this.addressInfo.setHouseNo(houseNo);
        this.addressInfo.setRoadNo(roadNo);
        this.addressInfo.setBlockOrVillage(blockOrVillage);
        this.addressInfo.setThana(thana);
        this.addressInfo.setDistrict(district);
        this.addressInfo.setDivision(division);

    }
}
