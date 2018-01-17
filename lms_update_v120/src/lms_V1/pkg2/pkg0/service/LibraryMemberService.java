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
import lms_V1.pkg2.pkg0.dao.LibraryMemberDao;
import lms_V1.pkg2.pkg0.domain.LibraryMember;

/**
 *
 * @author anik
 */
public class LibraryMemberService implements LibraryMemberDao {

    private final Connection connection;

    /**
     * Called --- constructor and get Database connection,
     */
    public LibraryMemberService() {
        connection = DBconnect.getConnection();
    }

    /**
     * [ saveLibraryMemberInformation() ] This method save data in database in
     * selected table,
     *
     * @param libraryMember
     */
    @Override
    public void saveLibraryMemberInformation(LibraryMember libraryMember) {

        try {

            if (libraryMember.getMemberName() != null) {

                PreparedStatement statement;
                statement = connection.prepareStatement("INSERT INTO library_member (member_name,member_id,mobile_number,email,house_no,road_no,block_or_village,thana,district,division,report) VALUES (?,?,?,?,?,?,?,?,?,?,'good')");

                statement.setString(1, libraryMember.getMemberName());
                statement.setInt(2, libraryMember.getCardNo());
                statement.setString(3, libraryMember.getContactInfo().getMobileNumber());
                statement.setString(4, libraryMember.getContactInfo().getEmail());
                statement.setString(5, libraryMember.getAddressInfo().getHouseNo());
                statement.setString(6, libraryMember.getAddressInfo().getRoadNo());
                statement.setString(7, libraryMember.getAddressInfo().getBlockOrVillage());
                statement.setString(8, libraryMember.getAddressInfo().getThana());
                statement.setString(9, libraryMember.getAddressInfo().getDistrict());
                statement.setString(10, libraryMember.getAddressInfo().getDivision());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(LibraryMemberService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    /**
     * [ updateLibraryMemberInformation() ] This method update data in database
     * in selected table,
     *
     * @param libraryMember
     */
    @Override
    public void updateLibraryMemberInformation(LibraryMember libraryMember) {

        try {

            if (libraryMember.getMemberName() != null) {

                PreparedStatement statement;
                statement = connection.prepareStatement("UPDATE library_member SET member_name=?,member_id=?,mobile_number=?,email=?,house_no=?,road_no=?,block_or_village=?,thana=?,district=?,division=? WHERE id=?");

                statement.setString(1, libraryMember.getMemberName());
                statement.setInt(2, libraryMember.getCardNo());
                statement.setString(3, libraryMember.getContactInfo().getMobileNumber());
                statement.setString(4, libraryMember.getContactInfo().getEmail());
                statement.setString(5, libraryMember.getAddressInfo().getHouseNo());
                statement.setString(6, libraryMember.getAddressInfo().getRoadNo());
                statement.setString(7, libraryMember.getAddressInfo().getBlockOrVillage());
                statement.setString(8, libraryMember.getAddressInfo().getThana());
                statement.setString(9, libraryMember.getAddressInfo().getDistrict());
                statement.setString(10, libraryMember.getAddressInfo().getDivision());
                statement.setInt(11, libraryMember.getId());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(LibraryMemberService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    /**
     * [ deleteLibraryMemberInformation() ] This method delete data in database
     * in selected table,
     *
     * @param id
     */
    @Override
    public void deleteLibraryMemberInformation(int id) {

        try {

            if (id > 0) {

                PreparedStatement statement;
                statement = connection.prepareStatement("DELETE FROM library_member WHERE id=?");

                statement.setInt(1, id);

                statement.executeUpdate();

            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryMemberService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * [ getLibraryMemberInformationList() ] this method get all data from
     * selected table and return a list,
     *
     * @return list
     */
    @Override
    public List<LibraryMember> getLibraryMemberInformationList() {

        LibraryMember libraryMember;
        List<LibraryMember> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM library_member");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                libraryMember = new LibraryMember();

                libraryMember.setId(resultSet.getInt(1));
                libraryMember.setMemberName(resultSet.getString(2));
                libraryMember.setCardNo(resultSet.getInt(3));
                libraryMember.setContactInfo(
                        resultSet.getString(4),
                        resultSet.getString(5)
                );
                libraryMember.setAddressInfo(
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9),
                        resultSet.getString(10),
                        resultSet.getString(11)
                );
                libraryMember.setReport(resultSet.getString(12));
                list.add(libraryMember);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LibraryMemberService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Set<LibraryMember> getLibraryMemberionSet() {
        Set<LibraryMember> list = new HashSet<>();

        try {
            LibraryMember libraryMember;
            PreparedStatement stmt = connection.prepareStatement("select * from library_member");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                libraryMember = new LibraryMember();
                libraryMember.setMemberName(rs.getString(2));
                libraryMember.setCardNo(rs.getInt(3));
                list.add(libraryMember);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<LibraryMember> getLibraryMemberInformationListForDeshbord() {

        LibraryMember libraryMember;
        List<LibraryMember> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT member_name,member_id,mobile_number,email FROM library_member WHERE report=? LIMIT 4");
            statement.setString(1, "good");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                libraryMember = new LibraryMember();

                libraryMember.setMemberName(resultSet.getString(1));
                libraryMember.setCardNo(resultSet.getInt(2));
                libraryMember.setContactInfo(
                        resultSet.getString(3),
                        resultSet.getString(4)
                );
                list.add(libraryMember);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LibraryMemberService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void editMemberReport(int id) {

        try {
            PreparedStatement statement;
            statement = connection.prepareStatement("UPDATE library_member SET report=? WHERE member_id=?");
            statement.setString(1, "bad");
            statement.setInt(2, id);
            statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(LibraryMemberService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
