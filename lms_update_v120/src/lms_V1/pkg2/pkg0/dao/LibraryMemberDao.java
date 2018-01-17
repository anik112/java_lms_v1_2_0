/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.dao;

import java.util.List;
import lms_V1.pkg2.pkg0.domain.LibraryMember;

/**
 *
 * @author anik
 */
public interface LibraryMemberDao {

    /**
     * <saveLibraryMemberInformation(LibraryMember libraryMember)/> this method
     * save all LibraryMember information,
     * <updateLibraryMemberInformation(LibraryMember libraryMember)/> this
     * method update LibraryMember information,
     * <deleteLibraryMemberInformation(int id)/> this method delete
     * LibraryMember information, <List<LibraryMember>
     * getLibraryMemberInformationList()/> this method return LibraryMember
     * list;
     *
     * @param libraryMember
     */
    public void saveLibraryMemberInformation(LibraryMember libraryMember);

    public void updateLibraryMemberInformation(LibraryMember libraryMember);

    public void deleteLibraryMemberInformation(int id);

    public List<LibraryMember> getLibraryMemberInformationList();

}
