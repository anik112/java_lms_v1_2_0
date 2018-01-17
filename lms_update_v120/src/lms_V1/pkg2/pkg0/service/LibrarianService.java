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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import lms_V1.pkg2.pkg0.domain.LibrarianAccount;

/**
 *
 * @author anik
 */
public class LibrarianService {

    private final Connection connection;

    public LibrarianService() {
        connection = DBconnect.getConnection();
    }

    public void saveLibrarianInformation(LibrarianAccount librarianAccount) {

        try {

            if (librarianAccount.getName() != null) {

                PreparedStatement statement;
                statement = connection.prepareStatement("INSERT INTO librarianaccount (name,code_number,mobile_no,email,house_no,road_no,block_or_village,thana,district,division,shift,user_name,user_password) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");

                statement.setString(1, librarianAccount.getName());
                statement.setInt(2, librarianAccount.getCodeNumber());
                statement.setString(3, librarianAccount.getContactInfo().getMobileNumber());
                statement.setString(4, librarianAccount.getContactInfo().getEmail());
                statement.setString(5, librarianAccount.getAddressInfo().getHouseNo());
                statement.setString(6, librarianAccount.getAddressInfo().getRoadNo());
                statement.setString(7, librarianAccount.getAddressInfo().getBlockOrVillage());
                statement.setString(8, librarianAccount.getAddressInfo().getThana());
                statement.setString(9, librarianAccount.getAddressInfo().getDistrict());
                statement.setString(10, librarianAccount.getAddressInfo().getDivision());
                statement.setString(11, librarianAccount.getShift());
                statement.setString(12, librarianAccount.getUserName());
                statement.setString(13, librarianAccount.getPassword());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(LibrarianService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void deleteLibrarianInformation(int id) {

        try {

            if (id > 0) {

                PreparedStatement statement;
                statement = connection.prepareStatement("DELETE FROM librarianaccount WHERE id=?");
                statement.setInt(1, id);
                statement.executeUpdate();
            }

        } catch (SQLException e) {
            Logger.getLogger(LibrarianService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public List<LibrarianAccount> getLibrarianInformationList() {

        LibrarianAccount librarianAccount;
        List<LibrarianAccount> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM librarianaccount");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                librarianAccount = new LibrarianAccount();

                librarianAccount.setId(resultSet.getInt(1));
                librarianAccount.setName(resultSet.getString(2));
                librarianAccount.setCodeNumber(resultSet.getInt(3));
                librarianAccount.setContactInfo(
                        resultSet.getString(4),
                        resultSet.getString(5)
                );
                librarianAccount.setAddressInfo(
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9),
                        resultSet.getString(10),
                        resultSet.getString(11)
                );
                librarianAccount.setShift(resultSet.getString(12));
                librarianAccount.setUserName(resultSet.getString(13));
                librarianAccount.setPassword(resultSet.getString(14));

                list.add(librarianAccount);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LibrarianService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public LibrarianAccount searchLibrarianAccountByCodeNo(int codeNo) {

        LibrarianAccount librarianAccount = new LibrarianAccount();

        if (codeNo > 0) {

            try {

                PreparedStatement stmt = connection.prepareStatement("SELECT * FROM librarianaccount WHERE code_number=?");
                stmt.setInt(1, codeNo);
                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()) {

                    librarianAccount.setId(resultSet.getInt(1));
                    if (resultSet.getString(2) == null) {
                        librarianAccount.setName(null);
                    } else {
                        librarianAccount.setName(resultSet.getString(2));
                    }
                    librarianAccount.setCodeNumber(resultSet.getInt(3));
                    librarianAccount.setContactInfo(
                            resultSet.getString(4),
                            resultSet.getString(5)
                    );
                    librarianAccount.setAddressInfo(
                            resultSet.getString(6),
                            resultSet.getString(7),
                            resultSet.getString(8),
                            resultSet.getString(9),
                            resultSet.getString(10),
                            resultSet.getString(11)
                    );
                    librarianAccount.setShift(resultSet.getString(12));
                }

            } catch (SQLException ex) {
                Logger.getLogger(LibrarianService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return librarianAccount;
    }

    public Set<LibrarianAccount> getLibrarianInfoSet() {
        Set<LibrarianAccount> list = new HashSet<>();

        try {
            LibrarianAccount librarianAccount;
            PreparedStatement stmt = connection.prepareStatement("select name from librarianaccount");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                librarianAccount = new LibrarianAccount();
                librarianAccount.setName(rs.getString(1));
                list.add(librarianAccount);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibrarianService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean checkLogin(String user_name, String password) {

        String time;
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

        Date d = new Date();
        time = sdf.format(d);

        try {
            LibrarianAccount librarianAccount;
            PreparedStatement stmt = connection.prepareStatement("select shift,user_password from librarianaccount WHERE user_name=?");
            stmt.setString(1, user_name);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                if (password.equals(rs.getString(2))) {
                    return true;
                } else {
                    return false;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(LibrarianService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

}
