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
public class LibraryMember {
    
    private int id;
    private String  memberName;
    private int cardNo;
    private ContactInfo contactInfo;
    private AddressInfo addressInfo;
    private String report;

    public LibraryMember() {
        contactInfo=new ContactInfo();
        addressInfo=new AddressInfo();
    }

    public int getId() {
        return id;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String mobileNo,String email) {
        //this.contactInfo=new ContactInfo();
        this.contactInfo.setMobileNumber(mobileNo);
        this.contactInfo.setEmail(email);
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(String houseNo,String roadNo,String blockOrVillage,String thana,String district,String division) {
        //this.addressInfo = new AddressInfo();
        this.addressInfo.setHouseNo(houseNo);
        this.addressInfo.setRoadNo(roadNo);
        this.addressInfo.setBlockOrVillage(blockOrVillage);
        this.addressInfo.setThana(thana);
        this.addressInfo.setDistrict(district);
        this.addressInfo.setDivision(division);
        
    }
    
    
    
    
    
}
