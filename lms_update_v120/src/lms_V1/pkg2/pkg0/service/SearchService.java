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
import lms_V1.pkg2.pkg0.domain.Author;
import lms_V1.pkg2.pkg0.domain.BookInformation;
import lms_V1.pkg2.pkg0.domain.BookIssue;
import lms_V1.pkg2.pkg0.domain.BookRecive;
import lms_V1.pkg2.pkg0.domain.Category;
import lms_V1.pkg2.pkg0.domain.Edition;
import lms_V1.pkg2.pkg0.domain.LibraryMember;
import lms_V1.pkg2.pkg0.domain.Publisher;

/**
 *
 * @author anik
 */
public class SearchService {

    private Connection connection;

    public SearchService() {
        connection = DBconnect.getConnection();
    }

    public List<BookInformation> searchBookRecordByIssnNo(String issnNo) {

        BookInformation bookInformation;
        List<BookInformation> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_information WHERE issn_no=?");
            statement.setString(1, issnNo);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookInformation = new BookInformation();

                bookInformation.setId(resultSet.getInt(1));
                bookInformation.setName(resultSet.getString(2));
                bookInformation.setBookCode(resultSet.getString(3));
                bookInformation.setAuthor(resultSet.getString(4));
                bookInformation.setPublisher(resultSet.getString(5));
                bookInformation.setEdition(resultSet.getString(6));
                bookInformation.setUnitPrice(resultSet.getInt(7));
                bookInformation.setQty(resultSet.getInt(8));
                bookInformation.setTotalPrice(resultSet.getInt(9));
                bookInformation.setRackNO(resultSet.getInt(10));
                bookInformation.setIssnNo(resultSet.getString(11));
                bookInformation.setCategory(resultSet.getString(12));
                bookInformation.setPurchaseDate(resultSet.getString(13));

                list.add(bookInformation);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<BookInformation> searchBookRecordByBookCode(String bookCode) {

        BookInformation bookInformation;
        List<BookInformation> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_information WHERE book_code=?");
            statement.setString(1, bookCode);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookInformation = new BookInformation();

                bookInformation.setId(resultSet.getInt(1));
                bookInformation.setName(resultSet.getString(2));
                bookInformation.setBookCode(resultSet.getString(3));
                bookInformation.setAuthor(resultSet.getString(4));
                bookInformation.setPublisher(resultSet.getString(5));
                bookInformation.setEdition(resultSet.getString(6));
                bookInformation.setUnitPrice(resultSet.getInt(7));
                bookInformation.setQty(resultSet.getInt(8));
                bookInformation.setTotalPrice(resultSet.getInt(9));
                bookInformation.setRackNO(resultSet.getInt(10));
                bookInformation.setIssnNo(resultSet.getString(11));
                bookInformation.setCategory(resultSet.getString(12));
                bookInformation.setPurchaseDate(resultSet.getString(13));

                list.add(bookInformation);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<BookInformation> searchBookRecordByRackNo(int rackNo) {

        BookInformation bookInformation;
        List<BookInformation> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_information WHERE rack_no=?");
            statement.setInt(1, rackNo);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookInformation = new BookInformation();

                bookInformation.setId(resultSet.getInt(1));
                bookInformation.setName(resultSet.getString(2));
                bookInformation.setBookCode(resultSet.getString(3));
                bookInformation.setAuthor(resultSet.getString(4));
                bookInformation.setPublisher(resultSet.getString(5));
                bookInformation.setEdition(resultSet.getString(6));
                bookInformation.setUnitPrice(resultSet.getInt(7));
                bookInformation.setQty(resultSet.getInt(8));
                bookInformation.setTotalPrice(resultSet.getInt(9));
                bookInformation.setRackNO(resultSet.getInt(10));
                bookInformation.setIssnNo(resultSet.getString(11));
                bookInformation.setCategory(resultSet.getString(12));
                bookInformation.setPurchaseDate(resultSet.getString(13));

                list.add(bookInformation);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<BookInformation> searchBookRecordByCategory(String category) {

        BookInformation bookInformation;
        List<BookInformation> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_information WHERE category=?");
            statement.setString(1, category);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookInformation = new BookInformation();

                bookInformation.setId(resultSet.getInt(1));
                bookInformation.setName(resultSet.getString(2));
                bookInformation.setBookCode(resultSet.getString(3));
                bookInformation.setAuthor(resultSet.getString(4));
                bookInformation.setPublisher(resultSet.getString(5));
                bookInformation.setEdition(resultSet.getString(6));
                bookInformation.setUnitPrice(resultSet.getInt(7));
                bookInformation.setQty(resultSet.getInt(8));
                bookInformation.setTotalPrice(resultSet.getInt(9));
                bookInformation.setRackNO(resultSet.getInt(10));
                bookInformation.setIssnNo(resultSet.getString(11));
                bookInformation.setCategory(resultSet.getString(12));
                bookInformation.setPurchaseDate(resultSet.getString(13));

                list.add(bookInformation);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<BookInformation> searchBookRecordByPurchaseDate(String purchaseDate) {

        BookInformation bookInformation;
        List<BookInformation> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_information WHERE purchase_date=?");
            statement.setString(1, purchaseDate);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookInformation = new BookInformation();

                bookInformation.setId(resultSet.getInt(1));
                bookInformation.setName(resultSet.getString(2));
                bookInformation.setBookCode(resultSet.getString(3));
                bookInformation.setAuthor(resultSet.getString(4));
                bookInformation.setPublisher(resultSet.getString(5));
                bookInformation.setEdition(resultSet.getString(6));
                bookInformation.setUnitPrice(resultSet.getInt(7));
                bookInformation.setQty(resultSet.getInt(8));
                bookInformation.setTotalPrice(resultSet.getInt(9));
                bookInformation.setRackNO(resultSet.getInt(10));
                bookInformation.setIssnNo(resultSet.getString(11));
                bookInformation.setCategory(resultSet.getString(12));
                bookInformation.setPurchaseDate(resultSet.getString(13));

                list.add(bookInformation);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<LibraryMember> searchLibraryMemberInformationByMemberId(int memberId) {

        LibraryMember libraryMember;
        List<LibraryMember> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM library_member WHERE member_id=?");
            statement.setInt(1, memberId);
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

                list.add(libraryMember);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<LibraryMember> searchLibraryMemberInformationByMemberName(String memberName) {

        LibraryMember libraryMember;
        List<LibraryMember> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM library_member WHERE member_name=?");
            statement.setString(1, memberName);
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

                list.add(libraryMember);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<LibraryMember> searchLibraryMemberInformationByMemberThana(String thana) {

        LibraryMember libraryMember;
        List<LibraryMember> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM library_member WHERE thana=?");
            statement.setString(1, thana);
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

                list.add(libraryMember);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<BookRecive> searchBookReciveListBySubmitLibrarian(String librarianName) {

        BookRecive bookRecive;
        List<BookRecive> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_recive WHERE submit_by=?");
            statement.setString(1, librarianName);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookRecive = new BookRecive();

                bookRecive.setId(resultSet.getInt(1));
                bookRecive.setBookId(resultSet.getString(2));
                bookRecive.setLibMemberId(resultSet.getInt(3));
                bookRecive.setSubmitDate(resultSet.getString(4));
                bookRecive.setQty(resultSet.getInt(5));
                bookRecive.setSubmitBy(resultSet.getString(6));

                list.add(bookRecive);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookReciveService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<BookRecive> searchBookReciveListBySubmitDate(String submitDate) {

        BookRecive bookRecive;
        List<BookRecive> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_recive WHERE submit_date=?");
            statement.setString(1, submitDate);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookRecive = new BookRecive();

                bookRecive.setId(resultSet.getInt(1));
                bookRecive.setBookId(resultSet.getString(2));
                bookRecive.setLibMemberId(resultSet.getInt(3));
                bookRecive.setSubmitDate(resultSet.getString(4));
                bookRecive.setQty(resultSet.getInt(5));
                bookRecive.setSubmitBy(resultSet.getString(6));

                list.add(bookRecive);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookReciveService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<BookRecive> searchBookReciveListByMemberId(int memberId) {

        BookRecive bookRecive;
        List<BookRecive> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_recive WHERE library_member_id=?");
            statement.setInt(1, memberId);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookRecive = new BookRecive();

                bookRecive.setId(resultSet.getInt(1));
                bookRecive.setBookId(resultSet.getString(2));
                bookRecive.setLibMemberId(resultSet.getInt(3));
                bookRecive.setSubmitDate(resultSet.getString(4));
                bookRecive.setQty(resultSet.getInt(5));
                bookRecive.setSubmitBy(resultSet.getString(6));

                list.add(bookRecive);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookReciveService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<BookIssue> selectIssueBookListByIssueDate(String issueDate) {

        BookIssue bookIssue;
        List<BookIssue> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_issue WHERE issue_date=?");
            statement.setString(1, issueDate);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookIssue = new BookIssue();

                bookIssue.setId(resultSet.getInt(1));
                bookIssue.setBookId(resultSet.getString(2));
                bookIssue.setLibraryMemberId(resultSet.getInt(3));
                bookIssue.setIssueDate(resultSet.getString(4));
                bookIssue.setExpireDate(resultSet.getString(5));
                bookIssue.setReturnDate(resultSet.getString(6));
                bookIssue.setQty(resultSet.getInt(7));
                bookIssue.setStatus(resultSet.getString(8));

                list.add(bookIssue);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<BookIssue> selectIssueBookListByReturnDate(String returnDate) {

        BookIssue bookIssue;
        List<BookIssue> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM book_issue WHERE return_date=?");
            statement.setString(1, returnDate);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                bookIssue = new BookIssue();

                bookIssue.setId(resultSet.getInt(1));
                bookIssue.setBookId(resultSet.getString(2));
                bookIssue.setLibraryMemberId(resultSet.getInt(3));
                bookIssue.setIssueDate(resultSet.getString(4));
                bookIssue.setExpireDate(resultSet.getString(5));
                bookIssue.setReturnDate(resultSet.getString(6));
                bookIssue.setQty(resultSet.getInt(7));
                bookIssue.setStatus(resultSet.getString(8));

                list.add(bookIssue);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<Author> searchAuthorListByName(String authorName) {

        List<Author> authorList = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM author WHERE author_name=?");
            statement.setString(1, authorName);
            ResultSet result;
            result = statement.executeQuery();

            while (result.next()) {

                Author author = new Author();

                author.setId(result.getInt(1));
                author.setName(result.getString(2));
                author.setDateOfBirth(result.getString(3));
                author.setDateOfDead(result.getString(4));
                author.setAbout(result.getString(5));

                authorList.add(author);
            }

        } catch (SQLException e) {
            Logger.getLogger(AuthorService.class.getName()).log(Level.SEVERE, null, e);
        }

        return authorList;
    }

    public List<Publisher> searchPublisherListByName(String publisherName) {

        Publisher publisher;
        List<Publisher> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM publisher WHERE publisher_name=?");
            statement.setString(1, publisherName);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                publisher = new Publisher();
                publisher.setId(resultSet.getInt(1));
                publisher.setName(resultSet.getString(2));

                list.add(publisher);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PublisherService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Edition> searchEditionListByName(String editionName) {

        Edition edition;
        List<Edition> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM edition WHERE edition_name=?");
            statement.setString(1, editionName);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                edition = new Edition();

                edition.setId(resultSet.getInt(1));
                edition.setName(resultSet.getString(2));

                list.add(edition);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EditionService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public List<Category> searchCategoryListByName(String categoryName) {

        Category category;
        List<Category> list = new ArrayList<>();

        try {

            PreparedStatement statement;
            statement = connection.prepareStatement("SELECT * FROM category WHERE category_name=?");
            statement.setString(1, categoryName);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                category = new Category();
                category.setId(resultSet.getInt(1));
                category.setName(resultSet.getString(2));

                list.add(category);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
    
    
    public Set<LibraryMember> getMemberSet() {
        Set<LibraryMember> list = new HashSet<>();

        try {
            LibraryMember libraryMember;
            PreparedStatement stmt = connection.prepareStatement("SELECT thana FROM library_member");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                libraryMember=new LibraryMember();
                libraryMember.getAddressInfo().setThana(rs.getString(1));
                list.add(libraryMember);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
