/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.view;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import lms_V1.pkg2.pkg0.domain.Author;
import lms_V1.pkg2.pkg0.domain.BookInformation;
import lms_V1.pkg2.pkg0.domain.BookIssue;
import lms_V1.pkg2.pkg0.domain.BookRecive;
import lms_V1.pkg2.pkg0.domain.Category;
import lms_V1.pkg2.pkg0.domain.Edition;
import lms_V1.pkg2.pkg0.domain.LibrarianAccount;
import lms_V1.pkg2.pkg0.domain.LibraryMember;
import lms_V1.pkg2.pkg0.domain.Publisher;
import lms_V1.pkg2.pkg0.service.AuthorService;
import lms_V1.pkg2.pkg0.service.AvailableBookService;
import lms_V1.pkg2.pkg0.service.BookInformationService;
import lms_V1.pkg2.pkg0.service.BookIssueService;
import lms_V1.pkg2.pkg0.service.BookReciveService;
import lms_V1.pkg2.pkg0.service.CategoryService;
import lms_V1.pkg2.pkg0.service.EditionService;
import lms_V1.pkg2.pkg0.service.LibrarianService;
import lms_V1.pkg2.pkg0.service.LibraryMemberService;
import lms_V1.pkg2.pkg0.service.PublisherService;
import lms_V1.pkg2.pkg0.service.SearchService;

/**
 *
 * @author anik
 */
public class MainFream extends javax.swing.JFrame {

    /**
     * All local variable and class object
     */
    private int mainPanHight = 0;
    private int mainPanWidth = 0;
    private String currentDate;
    private SimpleDateFormat showDate;
    private SimpleDateFormat showDay;
    private String bookIssueBookId;
    private int bookIssueMemberId = 0;
    private int librarianID = 0;
    private int totalBook = 0;
    private int totalIssueBook = 0;
    private int totalReciveBook = 0;
    private int totalMember = 0;
    private int lognValue = 0000;

    private Author author; // Create Author class object
    private AuthorService authorService; // Create AuthorService class object
    private Edition edition; // Create Edition class object
    private EditionService editionService; // Create EditionService class object 
    private Publisher publisher; // Create Publisher class object
    private PublisherService publisherService; // Create PulisherService object
    private Category category; // Create Category class object
    private CategoryService categoryService; // Create CategoryService object
    private LibraryMember libraryMember; // Create LibraryMember class object
    private LibraryMemberService libraryMemberService; // Create LibraryMemberService class object
    private BookInformation bookInformation; // Create BookInformation class object
    private BookInformationService bookInformationService; // Create BookInformationService class object
    private BookIssue bookIssue; // Create BookIssue class object
    private BookIssueService bookIssueService; // Create BookIssueService class object
    private BookRecive bookRecive; // Create BookRecive class object
    private BookReciveService bookReciveService; // Create BookReciveService class object
    private AvailableBookService availableBookService; // Create AvailableBookService class object
    private SearchService searchService; // Create SearchService class object
    private LibrarianAccount librarianAccount; // Create LibrarianAccount class object
    private LibrarianService librarianService; // Create LibrarianService class object

    /**
     * Creates new form MainFream
     */
    public MainFream() {

        this.setTitle("Main page ( LMS )");
        initComponents(); // call mehod initComponents()

        txtBookReciveSearchBar.setForeground(new Color(153, 153, 153)); // set search bar text color
        txtBookReciveSearchBar.setText("Search By Member Code..."); // set text in search bar

        showDateAndDay(); // show date and day

        displayLibraryMemberInformationWithInTable();
        displayLibrarianInformationWithInTable();
        displayBookInformationWithInTable();
        displayBookIssueWithInTable();
        displayAuthorInformationWithInTable();
        displayEditionInformationWithInTable();
        displayPublisherInformationWithInTable();
        displayCatagoryInformationWithInTable();

        displayAuthorListInBookInfo();
        displayPublisherListInBookInfo();
        displayEditionListInBookInfo();
        displayCategoryListInBookInfo();
        displayBookListInBookIssue();
        displayLibraryMemberListInBookIssue();

        showAllAvailableBookInTable();
        showCategoriListInSearchPanForSearchBookInformation();
        showMemberListInSearchPanForSearchBookInformation();
        showTopBookListInDeshbord();
        showTotalCalInDeshbord();
        showStudentListInDeshbord();
        showLibrarianSetInRecivePanel();
        showLibrarianSetInIssuePanel();
        showLibrarianSetInSearchPanel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupForSearchPanel = new javax.swing.ButtonGroup();
        buttonGroupForLibrarianAccountPan = new javax.swing.ButtonGroup();
        dashBordScrolBar = new javax.swing.JScrollBar();
        bookAvaliBordScrolBar = new javax.swing.JScrollBar();
        issueBookScrolBar = new javax.swing.JScrollBar();
        bookReciveScrolBar = new javax.swing.JScrollBar();
        addBookScrolBar = new javax.swing.JScrollBar();
        addMemberScrolBar = new javax.swing.JScrollBar();
        createBookDtlsScrolBar = new javax.swing.JScrollBar();
        deleteRecordScrolBar = new javax.swing.JScrollBar();
        searchPanelScrolBar = new javax.swing.JScrollBar();
        superUserScrolBar = new javax.swing.JScrollBar();
        adminInfoDtlsScrolBar = new javax.swing.JScrollBar();
        topPanel = new javax.swing.JPanel();
        topUpPanel = new javax.swing.JPanel();
        btnRefreshAllInformation = new javax.swing.JButton();
        lblShowAllBookRecord = new javax.swing.JLabel();
        lblShowAllMemberRecord = new javax.swing.JLabel();
        lblShowAllIssueBookRecord = new javax.swing.JLabel();
        buttomDownPanel = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        btnPanDashboard = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        btnPanBookAvailCheck = new javax.swing.JPanel();
        lblBookAvailCheck = new javax.swing.JLabel();
        btnPanIssueBook = new javax.swing.JPanel();
        lblIssueBook = new javax.swing.JLabel();
        btnPanBookRecive = new javax.swing.JPanel();
        lblBookRecive = new javax.swing.JLabel();
        btnPanAddBookRecord = new javax.swing.JPanel();
        lblAddBookRecord = new javax.swing.JLabel();
        btnPanAddMemeberRecord = new javax.swing.JPanel();
        lblAddMemberRecord = new javax.swing.JLabel();
        btnPanCreateOtherDetails = new javax.swing.JPanel();
        lblCreateOtherDetails = new javax.swing.JLabel();
        btnPanDeleteAllRecord = new javax.swing.JPanel();
        lblDeleteAllRecord = new javax.swing.JLabel();
        btnPanSearchAllRecord = new javax.swing.JPanel();
        lblSearchAllRecord = new javax.swing.JLabel();
        btnPanCreateAdminAccount = new javax.swing.JPanel();
        lblCreateAdminAccount = new javax.swing.JLabel();
        btnPanSuperUserInformation = new javax.swing.JPanel();
        lblSupeUserInformation = new javax.swing.JLabel();
        lblShowTime = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        btnAboutUs = new javax.swing.JButton();
        jPanel49 = new javax.swing.JPanel();
        mainPan = new javax.swing.JPanel();
        jpanDashboard = new javax.swing.JPanel();
        scPanDashBord = new javax.swing.JScrollPane();
        subPanDashBord = new javax.swing.JPanel();
        panDeshbordShowBookList = new javax.swing.JPanel();
        panBook2 = new javax.swing.JPanel();
        lblDeshbordBookName2 = new javax.swing.JLabel();
        lblDeshbordBookCode2 = new javax.swing.JLabel();
        lblDeshbordAuthorName2 = new javax.swing.JLabel();
        lblDeshbordPublishername2 = new javax.swing.JLabel();
        lblDeshbordUnitPrice2 = new javax.swing.JLabel();
        lblDeshbordTotalPrice2 = new javax.swing.JLabel();
        panBook4 = new javax.swing.JPanel();
        lblDeshbordBookName4 = new javax.swing.JLabel();
        lblDeshbordTotalPrice4 = new javax.swing.JLabel();
        lblDeshbordPublisherName4 = new javax.swing.JLabel();
        lblDeshbordUnitPrice4 = new javax.swing.JLabel();
        lblDeshbordAuthorName4 = new javax.swing.JLabel();
        lblDeshbordBookCode4 = new javax.swing.JLabel();
        panBook1 = new javax.swing.JPanel();
        lblDeshbordBookName1 = new javax.swing.JLabel();
        lblDeshbordBookCode1 = new javax.swing.JLabel();
        lblDeshbordAuthorName1 = new javax.swing.JLabel();
        lblDeshBordPublishaerName1 = new javax.swing.JLabel();
        lblDeshbordUnitPrice1 = new javax.swing.JLabel();
        lblDeshbordTotalPrice1 = new javax.swing.JLabel();
        panBook3 = new javax.swing.JPanel();
        lblDeshbordBookName3 = new javax.swing.JLabel();
        lblDeshbordBookCode3 = new javax.swing.JLabel();
        lblDeshbordAuthorName3 = new javax.swing.JLabel();
        lblDeshbordPublisharName3 = new javax.swing.JLabel();
        lblDshbordUnitPrice3 = new javax.swing.JLabel();
        lblDeshbordTotalPrice3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDeshbordShowTotalIssueNumber = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblDeshbordShowTotalBookNumber = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblDeshbordShowTotalReciveNumber = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblDeshbordShowTotalMemberNumber = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        panDeshbordMemberList = new javax.swing.JPanel();
        panDeshbordMember4 = new javax.swing.JPanel();
        lblDeshbordMemberName4 = new javax.swing.JLabel();
        lblDeshbordMemberID4 = new javax.swing.JLabel();
        lblDeshbordMemberMobileNo4 = new javax.swing.JLabel();
        lblDeshbordMemberEmail4 = new javax.swing.JLabel();
        panDeshbordMember3 = new javax.swing.JPanel();
        lblDeshbordMemberName3 = new javax.swing.JLabel();
        lblDeshbordMemberID3 = new javax.swing.JLabel();
        lblDeshbordMemberMobileNo3 = new javax.swing.JLabel();
        lblDeshbordMemberEmail3 = new javax.swing.JLabel();
        panDeshbordMember2 = new javax.swing.JPanel();
        lblDeshbordMemberName2 = new javax.swing.JLabel();
        lblDeshbordMemberID2 = new javax.swing.JLabel();
        lblDeshbordMemberMobileNo2 = new javax.swing.JLabel();
        lblDeshbordMemberEmail2 = new javax.swing.JLabel();
        panDeshbordMember1 = new javax.swing.JPanel();
        lblDeshbordMemberName1 = new javax.swing.JLabel();
        lblDeshbordMemberID1 = new javax.swing.JLabel();
        lblDeshborMemberMobileNo1 = new javax.swing.JLabel();
        lblDeshbordMemberEmail1 = new javax.swing.JLabel();
        jpanBookAvaliCheck = new javax.swing.JPanel();
        scPanBookAvaliCheck = new javax.swing.JScrollPane();
        subPanBookAvailCheck = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblShowAvailableBookList = new javax.swing.JTable();
        jPanel35 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        btnRefreshTableAvailBookList = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblDisplayAllBookListInAvailPan = new javax.swing.JTable();
        jPanel36 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        btnRefreshTableForShowAllBookInfo = new javax.swing.JButton();
        txtAvailableBookSearchBar = new javax.swing.JTextField();
        btnSearchAvailableBook = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jpanIssueBook = new javax.swing.JPanel();
        scPanIssueBookRecord = new javax.swing.JScrollPane();
        subPanIssueBook = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtBookIssueQty = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lblShowMsgBookIssue = new javax.swing.JLabel();
        comboBookIssueBookId = new javax.swing.JComboBox<>();
        comboBookIssueMemberId = new javax.swing.JComboBox<>();
        comboBookIssueSubmitLibrarian = new javax.swing.JComboBox<>();
        btnAddBookIssueRecord = new javax.swing.JButton();
        comboReturnDayForBookIssue = new javax.swing.JComboBox<>();
        comboReturnMonthForBookIssue = new javax.swing.JComboBox<>();
        comboReturnYearForBookIssue = new javax.swing.JComboBox<>();
        comboExptDayForBookIssue = new javax.swing.JComboBox<>();
        comboExptMonthForBookIssue = new javax.swing.JComboBox<>();
        comboExptYearForBookIssue = new javax.swing.JComboBox<>();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblDisplayBookIssue = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jpanBookRecive = new javax.swing.JPanel();
        scPanBookRecive = new javax.swing.JScrollPane();
        subPanBookRecive = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblDisplayShowIssuBookInBookRecive = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        btnBookReciveSearch = new javax.swing.JButton();
        txtBookReciveSearchBar = new javax.swing.JTextField();
        btnReciveBook = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblDisplayBookRecive = new javax.swing.JTable();
        comboSubmitLibrarianForBookRecive = new javax.swing.JComboBox<>();
        btnReportMember = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jpanAddBookRecord = new javax.swing.JPanel();
        scPanAddBookRecord = new javax.swing.JScrollPane();
        subPanAddBookRecord = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBookRecordQty = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBookRecordUnitPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBookRecordBookCode = new javax.swing.JTextField();
        txtBookRecordTotalPrice = new javax.swing.JTextField();
        txtBookRecordRackNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBookRecordIssnNo = new javax.swing.JTextField();
        txtBookRecordBookName = new javax.swing.JTextField();
        btnAddRecord = new javax.swing.JButton();
        btnEditeRecord = new javax.swing.JButton();
        lblBookRecordShowMsg = new javax.swing.JLabel();
        comboBookRecordAuthorList = new javax.swing.JComboBox<>();
        comboBookRecordPublisherList = new javax.swing.JComboBox<>();
        comboBookRecordEditionList = new javax.swing.JComboBox<>();
        comboBookRecordCategoryList = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplayBookInfo = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jpanAddMemberRecord = new javax.swing.JPanel();
        scPanAddMemberRecord = new javax.swing.JScrollPane();
        subPanAddMemberRecord = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        txtMemberHouseNo = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMemberBlockOrVillage = new javax.swing.JTextField();
        txtMemberEmail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtMemberRoadNo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtMemberCardNo = new javax.swing.JTextField();
        txtMemberThana = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtMemberName = new javax.swing.JTextField();
        btnAddMemberRecord = new javax.swing.JButton();
        btnEditMemberRecord = new javax.swing.JButton();
        lblMemberShowMsg = new javax.swing.JLabel();
        comboMemberDistrict = new javax.swing.JComboBox<>();
        comboMemberDivision = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDisplayMemberInfo = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jpanCreateBookDetails = new javax.swing.JPanel();
        scPanAddOtherRecord = new javax.swing.JScrollPane();
        subPanOtherRecord = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txtAutorName = new javax.swing.JTextField();
        btnAddAutorRecord = new javax.swing.JButton();
        lblShowMsgAuthor = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        comboDayForAuthorBirth = new javax.swing.JComboBox<>();
        comboMonthForAuthorBirth = new javax.swing.JComboBox<>();
        comboYearForAuthorBirth = new javax.swing.JComboBox<>();
        comboDayForAuthorDeath = new javax.swing.JComboBox<>();
        comboMonthForAuthorDeath = new javax.swing.JComboBox<>();
        comboYearForAuthorDeath = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAbout = new javax.swing.JTextArea();
        checkBoxAliveForAuthor = new javax.swing.JCheckBox();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDisplayAuthor = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        txtPublisherName = new javax.swing.JTextField();
        btnAddPublisherRecord = new javax.swing.JButton();
        lblShowMsgPublisher = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDisplayPublisher = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txtCatagoryName = new javax.swing.JTextField();
        btnAddCatagoryRecord = new javax.swing.JButton();
        lblShowMsgCatagory = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblDisplayCatagory = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtEditionName = new javax.swing.JTextField();
        btnAddEditionRecord = new javax.swing.JButton();
        lblShowMsgEdition = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblDisplayEdition = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        jpanDeleteRecord = new javax.swing.JPanel();
        scPanDeleteRecord = new javax.swing.JScrollPane();
        subPanDeleteRecord = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblDisplayAuthorRecordForDel = new javax.swing.JTable();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblDisplayPublisharRecordForDel = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblDisplayBookRecordForDlt = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblDisplayMemberRecordForDlt = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblDisplayBookReciveRecordForDel = new javax.swing.JTable();
        txtSearchBarForDltBookRecord = new javax.swing.JTextField();
        btnSearchForDltBookRecord = new javax.swing.JButton();
        txtSearchBarForDelMemberRecord = new javax.swing.JTextField();
        btnSearchForDelMemberRecord = new javax.swing.JButton();
        txtSearchBarForBookReciveRecord = new javax.swing.JTextField();
        btnSearchForDelBookReciveRecord = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        btnDeleteSeltBookRecord = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        btnDeleteSeltMemberRecord = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        txtSearchBarForAuthorRecord = new javax.swing.JTextField();
        btnDeleteSeltBookReciveRecord = new javax.swing.JButton();
        btnSearchAuthorRecordForDlt = new javax.swing.JButton();
        btnDeleteAuthorRecord = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        txtSearchBarForPublisherRecord = new javax.swing.JTextField();
        btnSearchPublisharRecordForDel = new javax.swing.JButton();
        btnDeleteSeltPublisherRecord = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        txtSearchBarForEditionRecord = new javax.swing.JTextField();
        btnSearchEditionRecordForDel = new javax.swing.JButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        tblDisplayEditionRecordForDel = new javax.swing.JTable();
        btnDeleteSeltEditionRecord = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        txtSearchBarForCatagoryRecord = new javax.swing.JTextField();
        jScrollPane24 = new javax.swing.JScrollPane();
        tblDisplayCatagoryRecordForDel = new javax.swing.JTable();
        btnDeleteSeltCatagoryRecord = new javax.swing.JButton();
        btnSearchCatagoryRecordForDel = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jpanSearchRecord = new javax.swing.JPanel();
        scPanSearchRecord = new javax.swing.JScrollPane();
        subPanSearchRecord = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        txtBookRecordSearchBar = new javax.swing.JTextField();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblDisplayBookRecordInSearchPan = new javax.swing.JTable();
        jLabel99 = new javax.swing.JLabel();
        txtMemberRecordSearchBar = new javax.swing.JTextField();
        jScrollPane27 = new javax.swing.JScrollPane();
        tblDisplayMemberRecordInSearchPan = new javax.swing.JTable();
        txtBookReciveRecordInSearchPan = new javax.swing.JTextField();
        jScrollPane28 = new javax.swing.JScrollPane();
        tblDisplayBookReciveRecordInSearchPan = new javax.swing.JTable();
        jLabel101 = new javax.swing.JLabel();
        txtIssueBookSearchBar = new javax.swing.JTextField();
        jScrollPane29 = new javax.swing.JScrollPane();
        tblDisplayIssueBookInSearchPan = new javax.swing.JTable();
        radioBtnIssnNo = new javax.swing.JRadioButton();
        jLabel102 = new javax.swing.JLabel();
        radioBtnBookCode = new javax.swing.JRadioButton();
        radioBtnRackNo = new javax.swing.JRadioButton();
        radioBtnSelectCategory = new javax.swing.JRadioButton();
        radioBtnSelectPurchaseDate = new javax.swing.JRadioButton();
        comboCategoryListForSearchBookRecord = new javax.swing.JComboBox<>();
        comboDayForBookRecordInSearchPan = new javax.swing.JComboBox<>();
        comboMonthForBookRecordInSearchPan = new javax.swing.JComboBox<>();
        comboYearForBookRecordInSearchPan = new javax.swing.JComboBox<>();
        btnSeachBookRecordInSearchPan = new javax.swing.JButton();
        radioBtnMemberId = new javax.swing.JRadioButton();
        radioBtnMemberName = new javax.swing.JRadioButton();
        radioBtnSelectThana = new javax.swing.JRadioButton();
        comboMemberThanaInSearchPan = new javax.swing.JComboBox<>();
        btnSearchemberRecordInSearchPan = new javax.swing.JButton();
        radioBtnSelectSubmintLibrarian = new javax.swing.JRadioButton();
        jLabel104 = new javax.swing.JLabel();
        radioBtnSelectSubmitDate = new javax.swing.JRadioButton();
        cobmoCategoryInSearchPan = new javax.swing.JComboBox<>();
        comboDayForBookReciveInSearchPan = new javax.swing.JComboBox<>();
        comboMonthForBookReciveInSearchPan = new javax.swing.JComboBox<>();
        comboYearForBookReciveInSearchPan = new javax.swing.JComboBox<>();
        btnSearchBookReciveRecordInSearchPan = new javax.swing.JButton();
        comboIssueYearForIssueBookInSearchPan = new javax.swing.JComboBox<>();
        comboIssueMonthForIssueBookInSearchPan = new javax.swing.JComboBox<>();
        comboIssueDayForIssuBookInSearchPan = new javax.swing.JComboBox<>();
        redioBtnSelectIssueDateForSearchBookReciveRecord = new javax.swing.JRadioButton();
        radioBtnSelecteReturnDateForSearchIssueRecord = new javax.swing.JRadioButton();
        comboReturnDayForIssueBookInSearchPan = new javax.swing.JComboBox<>();
        combooReturnMonthForIssueBookInSearchPan = new javax.swing.JComboBox<>();
        comboReturnYearForIssueBookInSearchPan = new javax.swing.JComboBox<>();
        btnSearchBookIssueInSearchPan = new javax.swing.JButton();
        radioBtnSelecMemberId = new javax.swing.JRadioButton();
        btnClearSearchRecord4 = new javax.swing.JButton();
        btnClearSearchRecord3 = new javax.swing.JButton();
        btnClearSearchRecord1 = new javax.swing.JButton();
        btnClearSearchRecord2 = new javax.swing.JButton();
        lblShowMsgForSearchBookRecord = new javax.swing.JLabel();
        lblShowMsgForSearchMemberRecord = new javax.swing.JLabel();
        lblShowMsgForSearchBookReciveRecord = new javax.swing.JLabel();
        lblShowMsgForSearchIssueBookRecord = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jpanSuperUserInformation = new javax.swing.JPanel();
        scPanSuperUserInformation = new javax.swing.JScrollPane();
        subPanSuperUserInformation = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel110 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jpanShowAdminInformation = new javax.swing.JPanel();
        scPanShowAdminInformation = new javax.swing.JScrollPane();
        subPanSowAdminInformation = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        tblDisplayLibrarianAccountInAdminInfoPan = new javax.swing.JTable();
        jPanel40 = new javax.swing.JPanel();
        txtLibrarianAccountSearchBarInAdminPan = new javax.swing.JTextField();
        btnSearchLibrarianAccountInAdminPan = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        lblShowLibrarianNameInAdminPan = new javax.swing.JLabel();
        lblShowLibrarianCodeNoInAdminPan = new javax.swing.JLabel();
        lblShowLibrarianMobileNumberInAdminPan = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        lblShowLibrarianEmailInAdminPan = new javax.swing.JLabel();
        lblShowLibrarianAddressInAdminPan = new javax.swing.JLabel();
        lblShowDelLibrarianAccountPan1 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        btnClearDelShowAdminInfoPan = new javax.swing.JButton();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jpanAboutThis = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();

        dashBordScrolBar.setUnitIncrement(50);
        dashBordScrolBar.setValueIsAdjusting(true);

        bookAvaliBordScrolBar.setUnitIncrement(50);
        bookAvaliBordScrolBar.setValueIsAdjusting(true);

        issueBookScrolBar.setUnitIncrement(50);
        issueBookScrolBar.setValueIsAdjusting(true);

        bookReciveScrolBar.setUnitIncrement(50);
        bookReciveScrolBar.setValueIsAdjusting(true);

        addBookScrolBar.setUnitIncrement(50);
        addBookScrolBar.setValueIsAdjusting(true);

        addMemberScrolBar.setUnitIncrement(50);
        addMemberScrolBar.setValueIsAdjusting(true);

        createBookDtlsScrolBar.setUnitIncrement(50);
        createBookDtlsScrolBar.setValueIsAdjusting(true);

        deleteRecordScrolBar.setUnitIncrement(50);
        deleteRecordScrolBar.setValueIsAdjusting(true);

        searchPanelScrolBar.setUnitIncrement(50);
        searchPanelScrolBar.setValueIsAdjusting(true);

        superUserScrolBar.setUnitIncrement(50);
        superUserScrolBar.setValueIsAdjusting(true);

        adminInfoDtlsScrolBar.setUnitIncrement(50);
        adminInfoDtlsScrolBar.setValueIsAdjusting(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(1197, 750));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        topPanel.setBackground(new java.awt.Color(255, 255, 255));

        topUpPanel.setBackground(new java.awt.Color(42, 53, 57));

        btnRefreshAllInformation.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshAllInformation.setFont(new java.awt.Font("SimSun", 1, 15)); // NOI18N
        btnRefreshAllInformation.setForeground(new java.awt.Color(255, 0, 0));
        btnRefreshAllInformation.setText("Refresh");
        btnRefreshAllInformation.setBorder(null);
        btnRefreshAllInformation.setBorderPainted(false);
        btnRefreshAllInformation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshAllInformation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefreshAllInformation.setIconTextGap(5);
        btnRefreshAllInformation.setOpaque(false);
        btnRefreshAllInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshAllInformationActionPerformed(evt);
            }
        });

        lblShowAllBookRecord.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblShowAllBookRecord.setForeground(new java.awt.Color(0, 255, 255));
        lblShowAllBookRecord.setText("| Show Book Record");
        lblShowAllBookRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowAllBookRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowAllBookRecordMouseClicked(evt);
            }
        });

        lblShowAllMemberRecord.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblShowAllMemberRecord.setForeground(new java.awt.Color(0, 255, 255));
        lblShowAllMemberRecord.setText("| Show Member Record");
        lblShowAllMemberRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowAllMemberRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowAllMemberRecordMouseClicked(evt);
            }
        });

        lblShowAllIssueBookRecord.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblShowAllIssueBookRecord.setForeground(new java.awt.Color(0, 255, 255));
        lblShowAllIssueBookRecord.setText("| Show IssueBook Record");
        lblShowAllIssueBookRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowAllIssueBookRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowAllIssueBookRecordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topUpPanelLayout = new javax.swing.GroupLayout(topUpPanel);
        topUpPanel.setLayout(topUpPanelLayout);
        topUpPanelLayout.setHorizontalGroup(
            topUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topUpPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblShowAllIssueBookRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblShowAllMemberRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblShowAllBookRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefreshAllInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topUpPanelLayout.setVerticalGroup(
            topUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnRefreshAllInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(lblShowAllBookRecord)
                .addComponent(lblShowAllMemberRecord)
                .addComponent(lblShowAllIssueBookRecord))
        );

        buttomDownPanel.setBackground(new java.awt.Color(42, 53, 57));
        buttomDownPanel.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel153.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setText("2017-18 All Rights Reserved.( Library Management System )");

        javax.swing.GroupLayout buttomDownPanelLayout = new javax.swing.GroupLayout(buttomDownPanel);
        buttomDownPanel.setLayout(buttomDownPanelLayout);
        buttomDownPanelLayout.setHorizontalGroup(
            buttomDownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttomDownPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel153)
                .addContainerGap())
        );
        buttomDownPanelLayout.setVerticalGroup(
            buttomDownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel153, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        buttonPanel.setBackground(new java.awt.Color(2, 136, 187));

        btnPanDashboard.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPanDashboardMouseClicked(evt);
            }
        });

        lblDashboard.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setText("   Dashboard");
        lblDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDashboard.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblDashboardMouseMoved(evt);
            }
        });
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDashboardMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblDashboardMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnPanDashboardLayout = new javax.swing.GroupLayout(btnPanDashboard);
        btnPanDashboard.setLayout(btnPanDashboardLayout);
        btnPanDashboardLayout.setHorizontalGroup(
            btnPanDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPanDashboardLayout.setVerticalGroup(
            btnPanDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDashboard)
        );

        btnPanBookAvailCheck.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookAvailCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPanBookAvailCheckMouseClicked(evt);
            }
        });

        lblBookAvailCheck.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        lblBookAvailCheck.setForeground(new java.awt.Color(255, 255, 255));
        lblBookAvailCheck.setText("   Book availability check");
        lblBookAvailCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBookAvailCheck.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBookAvailCheckMouseMoved(evt);
            }
        });
        lblBookAvailCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBookAvailCheckMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBookAvailCheckMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnPanBookAvailCheckLayout = new javax.swing.GroupLayout(btnPanBookAvailCheck);
        btnPanBookAvailCheck.setLayout(btnPanBookAvailCheckLayout);
        btnPanBookAvailCheckLayout.setHorizontalGroup(
            btnPanBookAvailCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBookAvailCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPanBookAvailCheckLayout.setVerticalGroup(
            btnPanBookAvailCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBookAvailCheck)
        );

        btnPanIssueBook.setBackground(new java.awt.Color(2, 136, 187));
        btnPanIssueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPanIssueBookMouseClicked(evt);
            }
        });

        lblIssueBook.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        lblIssueBook.setForeground(new java.awt.Color(255, 255, 255));
        lblIssueBook.setText("   Issue Book");
        lblIssueBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIssueBook.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblIssueBookMouseMoved(evt);
            }
        });
        lblIssueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIssueBookMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblIssueBookMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnPanIssueBookLayout = new javax.swing.GroupLayout(btnPanIssueBook);
        btnPanIssueBook.setLayout(btnPanIssueBookLayout);
        btnPanIssueBookLayout.setHorizontalGroup(
            btnPanIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIssueBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPanIssueBookLayout.setVerticalGroup(
            btnPanIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIssueBook)
        );

        btnPanBookRecive.setBackground(new java.awt.Color(2, 136, 187));

        lblBookRecive.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        lblBookRecive.setForeground(new java.awt.Color(255, 255, 255));
        lblBookRecive.setText("   Book receive");
        lblBookRecive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBookRecive.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBookReciveMouseMoved(evt);
            }
        });
        lblBookRecive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBookReciveMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBookReciveMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnPanBookReciveLayout = new javax.swing.GroupLayout(btnPanBookRecive);
        btnPanBookRecive.setLayout(btnPanBookReciveLayout);
        btnPanBookReciveLayout.setHorizontalGroup(
            btnPanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBookRecive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPanBookReciveLayout.setVerticalGroup(
            btnPanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPanBookReciveLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBookRecive))
        );

        btnPanAddBookRecord.setBackground(new java.awt.Color(2, 136, 187));

        lblAddBookRecord.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        lblAddBookRecord.setForeground(new java.awt.Color(255, 255, 255));
        lblAddBookRecord.setText("   Add book record");
        lblAddBookRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddBookRecord.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblAddBookRecordMouseMoved(evt);
            }
        });
        lblAddBookRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddBookRecordMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAddBookRecordMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnPanAddBookRecordLayout = new javax.swing.GroupLayout(btnPanAddBookRecord);
        btnPanAddBookRecord.setLayout(btnPanAddBookRecordLayout);
        btnPanAddBookRecordLayout.setHorizontalGroup(
            btnPanAddBookRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddBookRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPanAddBookRecordLayout.setVerticalGroup(
            btnPanAddBookRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddBookRecord)
        );

        btnPanAddMemeberRecord.setBackground(new java.awt.Color(2, 136, 187));

        lblAddMemberRecord.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        lblAddMemberRecord.setForeground(new java.awt.Color(255, 255, 255));
        lblAddMemberRecord.setText("   Add member record");
        lblAddMemberRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddMemberRecord.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblAddMemberRecordMouseMoved(evt);
            }
        });
        lblAddMemberRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMemberRecordMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAddMemberRecordMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnPanAddMemeberRecordLayout = new javax.swing.GroupLayout(btnPanAddMemeberRecord);
        btnPanAddMemeberRecord.setLayout(btnPanAddMemeberRecordLayout);
        btnPanAddMemeberRecordLayout.setHorizontalGroup(
            btnPanAddMemeberRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAddMemberRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPanAddMemeberRecordLayout.setVerticalGroup(
            btnPanAddMemeberRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPanAddMemeberRecordLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAddMemberRecord))
        );

        btnPanCreateOtherDetails.setBackground(new java.awt.Color(2, 136, 187));

        lblCreateOtherDetails.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        lblCreateOtherDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateOtherDetails.setText("   Create book other details");
        lblCreateOtherDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreateOtherDetails.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCreateOtherDetailsMouseMoved(evt);
            }
        });
        lblCreateOtherDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateOtherDetailsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCreateOtherDetailsMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnPanCreateOtherDetailsLayout = new javax.swing.GroupLayout(btnPanCreateOtherDetails);
        btnPanCreateOtherDetails.setLayout(btnPanCreateOtherDetailsLayout);
        btnPanCreateOtherDetailsLayout.setHorizontalGroup(
            btnPanCreateOtherDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreateOtherDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
        );
        btnPanCreateOtherDetailsLayout.setVerticalGroup(
            btnPanCreateOtherDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreateOtherDetails, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        btnPanDeleteAllRecord.setBackground(new java.awt.Color(2, 136, 187));

        lblDeleteAllRecord.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        lblDeleteAllRecord.setForeground(new java.awt.Color(255, 255, 255));
        lblDeleteAllRecord.setText("   Delete Record");
        lblDeleteAllRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeleteAllRecord.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblDeleteAllRecordMouseMoved(evt);
            }
        });
        lblDeleteAllRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteAllRecordMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblDeleteAllRecordMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnPanDeleteAllRecordLayout = new javax.swing.GroupLayout(btnPanDeleteAllRecord);
        btnPanDeleteAllRecord.setLayout(btnPanDeleteAllRecordLayout);
        btnPanDeleteAllRecordLayout.setHorizontalGroup(
            btnPanDeleteAllRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeleteAllRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPanDeleteAllRecordLayout.setVerticalGroup(
            btnPanDeleteAllRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeleteAllRecord)
        );

        btnPanSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));

        lblSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        lblSearchAllRecord.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        lblSearchAllRecord.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchAllRecord.setText("   Search Record");
        lblSearchAllRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSearchAllRecord.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblSearchAllRecordMouseMoved(evt);
            }
        });
        lblSearchAllRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchAllRecordMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSearchAllRecordMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnPanSearchAllRecordLayout = new javax.swing.GroupLayout(btnPanSearchAllRecord);
        btnPanSearchAllRecord.setLayout(btnPanSearchAllRecordLayout);
        btnPanSearchAllRecordLayout.setHorizontalGroup(
            btnPanSearchAllRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSearchAllRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPanSearchAllRecordLayout.setVerticalGroup(
            btnPanSearchAllRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPanSearchAllRecordLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSearchAllRecord))
        );

        btnPanCreateAdminAccount.setBackground(new java.awt.Color(2, 136, 187));

        lblCreateAdminAccount.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        lblCreateAdminAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateAdminAccount.setText("   Admin Account");
        lblCreateAdminAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreateAdminAccount.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCreateAdminAccountMouseMoved(evt);
            }
        });
        lblCreateAdminAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateAdminAccountMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCreateAdminAccountMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnPanCreateAdminAccountLayout = new javax.swing.GroupLayout(btnPanCreateAdminAccount);
        btnPanCreateAdminAccount.setLayout(btnPanCreateAdminAccountLayout);
        btnPanCreateAdminAccountLayout.setHorizontalGroup(
            btnPanCreateAdminAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreateAdminAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPanCreateAdminAccountLayout.setVerticalGroup(
            btnPanCreateAdminAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPanCreateAdminAccountLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCreateAdminAccount))
        );

        btnPanSuperUserInformation.setBackground(new java.awt.Color(2, 136, 187));

        lblSupeUserInformation.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        lblSupeUserInformation.setForeground(new java.awt.Color(255, 255, 255));
        lblSupeUserInformation.setText("   Super USER Info");
        lblSupeUserInformation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSupeUserInformation.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblSupeUserInformationMouseMoved(evt);
            }
        });
        lblSupeUserInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSupeUserInformationMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSupeUserInformationMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnPanSuperUserInformationLayout = new javax.swing.GroupLayout(btnPanSuperUserInformation);
        btnPanSuperUserInformation.setLayout(btnPanSuperUserInformationLayout);
        btnPanSuperUserInformationLayout.setHorizontalGroup(
            btnPanSuperUserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSupeUserInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPanSuperUserInformationLayout.setVerticalGroup(
            btnPanSuperUserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSupeUserInformation)
        );

        lblShowTime.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblShowTime.setForeground(new java.awt.Color(255, 255, 255));
        lblShowTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowTime.setText("15");
        lblShowTime.setToolTipText("");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        lblDate.setFont(new java.awt.Font("SimSun", 0, 16)); // NOI18N
        lblDate.setForeground(new java.awt.Color(204, 255, 153));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDate.setText("day......");
        lblDate.setToolTipText("");

        lblDay.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblDay.setForeground(new java.awt.Color(102, 255, 255));
        lblDay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDay.setText("day......");
        lblDay.setToolTipText("");

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        btnAboutUs.setFont(new java.awt.Font("Sakkal Majalla", 1, 20)); // NOI18N
        btnAboutUs.setForeground(new java.awt.Color(153, 255, 255));
        btnAboutUs.setText("About This.....?");
        btnAboutUs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        btnAboutUs.setContentAreaFilled(false);
        btnAboutUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAboutUs.setFocusable(false);
        btnAboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAboutUs.setRequestFocusEnabled(false);
        btnAboutUs.setVerifyInputWhenFocusTarget(false);
        btnAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsActionPerformed(evt);
            }
        });

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPanDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanBookAvailCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanIssueBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanBookRecive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanAddBookRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanAddMemeberRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanCreateOtherDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanSearchAllRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanCreateAdminAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanSuperUserInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanDeleteAllRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblShowTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblShowTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPanDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPanBookAvailCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanIssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanBookRecive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPanAddBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanAddMemeberRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanCreateOtherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPanDeleteAllRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanSearchAllRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanCreateAdminAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPanSuperUserInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAboutUs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPan.setBackground(new java.awt.Color(255, 255, 255));

        jpanDashboard.setBackground(new java.awt.Color(204, 51, 255));
        jpanDashboard.setOpaque(false);
        jpanDashboard.setPreferredSize(new java.awt.Dimension(996, 683));

        scPanDashBord.setBorder(null);
        scPanDashBord.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scPanDashBord.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scPanDashBord.setName(""); // NOI18N
        scPanDashBord.setPreferredSize(new java.awt.Dimension(996, 678));
        scPanDashBord.setVerticalScrollBar(dashBordScrolBar);

        subPanDashBord.setBackground(new java.awt.Color(255, 255, 255));
        subPanDashBord.setPreferredSize(new java.awt.Dimension(1161, 1300));

        panDeshbordShowBookList.setBackground(new java.awt.Color(255, 255, 255));
        panDeshbordShowBookList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        panBook2.setBackground(new java.awt.Color(0, 148, 193));
        panBook2.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordBookName2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblDeshbordBookName2.setForeground(new java.awt.Color(255, 255, 0));
        lblDeshbordBookName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordBookCode2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordBookCode2.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordBookCode2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordAuthorName2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordAuthorName2.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordAuthorName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordPublishername2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordPublishername2.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordPublishername2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordUnitPrice2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordUnitPrice2.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordUnitPrice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordTotalPrice2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordTotalPrice2.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordTotalPrice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panBook2Layout = new javax.swing.GroupLayout(panBook2);
        panBook2.setLayout(panBook2Layout);
        panBook2Layout.setHorizontalGroup(
            panBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBook2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeshbordBookName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordBookCode2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordAuthorName2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordPublishername2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordUnitPrice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordTotalPrice2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap())
        );
        panBook2Layout.setVerticalGroup(
            panBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBook2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblDeshbordBookName2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblDeshbordBookCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblDeshbordAuthorName2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshbordPublishername2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshbordUnitPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshbordTotalPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panBook4.setBackground(new java.awt.Color(0, 148, 193));
        panBook4.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordBookName4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblDeshbordBookName4.setForeground(new java.awt.Color(255, 255, 0));
        lblDeshbordBookName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordTotalPrice4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordTotalPrice4.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordTotalPrice4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordPublisherName4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordPublisherName4.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordPublisherName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordUnitPrice4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordUnitPrice4.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordUnitPrice4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordAuthorName4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordAuthorName4.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordAuthorName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordBookCode4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordBookCode4.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordBookCode4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panBook4Layout = new javax.swing.GroupLayout(panBook4);
        panBook4.setLayout(panBook4Layout);
        panBook4Layout.setHorizontalGroup(
            panBook4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeshbordPublisherName4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDeshbordUnitPrice4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDeshbordTotalPrice4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBook4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDeshbordBookName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblDeshbordAuthorName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDeshbordBookCode4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panBook4Layout.setVerticalGroup(
            panBook4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBook4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblDeshbordBookName4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblDeshbordBookCode4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblDeshbordAuthorName4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshbordPublisherName4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshbordUnitPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshbordTotalPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        panBook1.setBackground(new java.awt.Color(0, 148, 193));
        panBook1.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordBookName1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblDeshbordBookName1.setForeground(new java.awt.Color(255, 255, 0));
        lblDeshbordBookName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordBookCode1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordBookCode1.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordBookCode1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordAuthorName1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordAuthorName1.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordAuthorName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshBordPublishaerName1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshBordPublishaerName1.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshBordPublishaerName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordUnitPrice1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordUnitPrice1.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordUnitPrice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordTotalPrice1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordTotalPrice1.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordTotalPrice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panBook1Layout = new javax.swing.GroupLayout(panBook1);
        panBook1.setLayout(panBook1Layout);
        panBook1Layout.setHorizontalGroup(
            panBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBook1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeshbordBookName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordBookCode1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordAuthorName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshBordPublishaerName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordUnitPrice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordTotalPrice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap())
        );
        panBook1Layout.setVerticalGroup(
            panBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBook1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblDeshbordBookName1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblDeshbordBookCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblDeshbordAuthorName1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshBordPublishaerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshbordUnitPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshbordTotalPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panBook3.setBackground(new java.awt.Color(0, 148, 193));
        panBook3.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordBookName3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblDeshbordBookName3.setForeground(new java.awt.Color(255, 255, 0));
        lblDeshbordBookName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordBookCode3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordBookCode3.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordBookCode3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordAuthorName3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordAuthorName3.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordAuthorName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordPublisharName3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordPublisharName3.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordPublisharName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDshbordUnitPrice3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDshbordUnitPrice3.setForeground(new java.awt.Color(255, 255, 255));
        lblDshbordUnitPrice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblDeshbordTotalPrice3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblDeshbordTotalPrice3.setForeground(new java.awt.Color(255, 255, 255));
        lblDeshbordTotalPrice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panBook3Layout = new javax.swing.GroupLayout(panBook3);
        panBook3.setLayout(panBook3Layout);
        panBook3Layout.setHorizontalGroup(
            panBook3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBook3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBook3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeshbordBookName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordBookCode3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordAuthorName3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordPublisharName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDshbordUnitPrice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordTotalPrice3, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addContainerGap())
        );
        panBook3Layout.setVerticalGroup(
            panBook3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBook3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblDeshbordBookName3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblDeshbordBookCode3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblDeshbordAuthorName3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshbordPublisharName3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDshbordUnitPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshbordTotalPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panDeshbordShowBookListLayout = new javax.swing.GroupLayout(panDeshbordShowBookList);
        panDeshbordShowBookList.setLayout(panDeshbordShowBookListLayout);
        panDeshbordShowBookListLayout.setHorizontalGroup(
            panDeshbordShowBookListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDeshbordShowBookListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panBook1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBook2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBook3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBook4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panDeshbordShowBookListLayout.setVerticalGroup(
            panDeshbordShowBookListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDeshbordShowBookListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDeshbordShowBookListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panBook3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBook2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBook1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBook4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 120, 95));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordShowTotalIssueNumber.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        lblDeshbordShowTotalIssueNumber.setForeground(new java.awt.Color(102, 0, 51));
        lblDeshbordShowTotalIssueNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeshbordShowTotalIssueNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeshbordShowTotalIssueNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("SimSun", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("[ Library Management System ]");

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText(":: TOP 4 Book List ::");

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("SimSun", 0, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 153, 204));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("The WORLD is a BOOK, And Those who do not TRAVEL read only a page.");

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 153, 204));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("........Saint Augustine");

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText(":: Total Book ::");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 0), 2));

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText(":: Total Issue ::");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 0), 2));

        jPanel7.setBackground(new java.awt.Color(255, 120, 95));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordShowTotalBookNumber.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        lblDeshbordShowTotalBookNumber.setForeground(new java.awt.Color(102, 0, 51));
        lblDeshbordShowTotalBookNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeshbordShowTotalBookNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeshbordShowTotalBookNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 120, 95));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordShowTotalReciveNumber.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        lblDeshbordShowTotalReciveNumber.setForeground(new java.awt.Color(102, 0, 51));
        lblDeshbordShowTotalReciveNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeshbordShowTotalReciveNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeshbordShowTotalReciveNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 120, 95));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordShowTotalMemberNumber.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        lblDeshbordShowTotalMemberNumber.setForeground(new java.awt.Color(102, 0, 51));
        lblDeshbordShowTotalMemberNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeshbordShowTotalMemberNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeshbordShowTotalMemberNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        jLabel111.setBackground(new java.awt.Color(255, 255, 255));
        jLabel111.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(102, 102, 102));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText(":: Total Recive ::");
        jLabel111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 0), 2));

        jLabel114.setBackground(new java.awt.Color(255, 255, 255));
        jLabel114.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(102, 102, 102));
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText(":: Total Member ::");
        jLabel114.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 0), 2));

        jLabel115.setBackground(new java.awt.Color(255, 255, 255));
        jLabel115.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(51, 153, 0));
        jLabel115.setText(">> Top 4 Member List ::");

        panDeshbordMemberList.setBackground(new java.awt.Color(255, 255, 255));
        panDeshbordMemberList.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 3), "                         ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 18))); // NOI18N

        panDeshbordMember4.setBackground(new java.awt.Color(255, 255, 255));
        panDeshbordMember4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), null, null));
        panDeshbordMember4.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordMemberName4.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberName4.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshbordMemberID4.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberID4.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshbordMemberMobileNo4.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberMobileNo4.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshbordMemberEmail4.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberEmail4.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panDeshbordMember4Layout = new javax.swing.GroupLayout(panDeshbordMember4);
        panDeshbordMember4.setLayout(panDeshbordMember4Layout);
        panDeshbordMember4Layout.setHorizontalGroup(
            panDeshbordMember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDeshbordMember4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDeshbordMemberName4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeshbordMemberID4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeshbordMemberMobileNo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeshbordMemberEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panDeshbordMember4Layout.setVerticalGroup(
            panDeshbordMember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDeshbordMember4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDeshbordMember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDeshbordMemberEmail4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordMemberMobileNo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panDeshbordMember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDeshbordMemberName4, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(lblDeshbordMemberID4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panDeshbordMember3.setBackground(new java.awt.Color(255, 255, 255));
        panDeshbordMember3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), null, null));
        panDeshbordMember3.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordMemberName3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberName3.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshbordMemberID3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberID3.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshbordMemberMobileNo3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberMobileNo3.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshbordMemberEmail3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberEmail3.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panDeshbordMember3Layout = new javax.swing.GroupLayout(panDeshbordMember3);
        panDeshbordMember3.setLayout(panDeshbordMember3Layout);
        panDeshbordMember3Layout.setHorizontalGroup(
            panDeshbordMember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDeshbordMember3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDeshbordMemberName3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeshbordMemberID3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeshbordMemberMobileNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeshbordMemberEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panDeshbordMember3Layout.setVerticalGroup(
            panDeshbordMember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDeshbordMember3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDeshbordMember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDeshbordMemberEmail3, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lblDeshbordMemberMobileNo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeshbordMemberName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panDeshbordMember3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblDeshbordMemberID3)))
                .addContainerGap())
        );

        panDeshbordMember2.setBackground(new java.awt.Color(255, 255, 255));
        panDeshbordMember2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), null, null));
        panDeshbordMember2.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordMemberName2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberName2.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshbordMemberID2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberID2.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshbordMemberMobileNo2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberMobileNo2.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshbordMemberEmail2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberEmail2.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panDeshbordMember2Layout = new javax.swing.GroupLayout(panDeshbordMember2);
        panDeshbordMember2.setLayout(panDeshbordMember2Layout);
        panDeshbordMember2Layout.setHorizontalGroup(
            panDeshbordMember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDeshbordMember2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDeshbordMemberName2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeshbordMemberID2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeshbordMemberMobileNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeshbordMemberEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panDeshbordMember2Layout.setVerticalGroup(
            panDeshbordMember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDeshbordMember2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDeshbordMember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDeshbordMemberEmail2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lblDeshbordMemberMobileNo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panDeshbordMember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDeshbordMemberName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDeshbordMemberID2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panDeshbordMember1.setBackground(new java.awt.Color(255, 255, 255));
        panDeshbordMember1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), null, null));
        panDeshbordMember1.setForeground(new java.awt.Color(255, 255, 255));

        lblDeshbordMemberName1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberName1.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshbordMemberID1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberID1.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshborMemberMobileNo1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshborMemberMobileNo1.setForeground(new java.awt.Color(0, 153, 153));

        lblDeshbordMemberEmail1.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lblDeshbordMemberEmail1.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panDeshbordMember1Layout = new javax.swing.GroupLayout(panDeshbordMember1);
        panDeshbordMember1.setLayout(panDeshbordMember1Layout);
        panDeshbordMember1Layout.setHorizontalGroup(
            panDeshbordMember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDeshbordMember1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDeshbordMemberName1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeshbordMemberID1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeshborMemberMobileNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeshbordMemberEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panDeshbordMember1Layout.setVerticalGroup(
            panDeshbordMember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDeshbordMember1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDeshbordMember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeshbordMemberEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lblDeshborMemberMobileNo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panDeshbordMember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDeshbordMemberName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDeshbordMemberID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout panDeshbordMemberListLayout = new javax.swing.GroupLayout(panDeshbordMemberList);
        panDeshbordMemberList.setLayout(panDeshbordMemberListLayout);
        panDeshbordMemberListLayout.setHorizontalGroup(
            panDeshbordMemberListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDeshbordMemberListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDeshbordMemberListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panDeshbordMember2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panDeshbordMember1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panDeshbordMember3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panDeshbordMember4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panDeshbordMemberListLayout.setVerticalGroup(
            panDeshbordMemberListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDeshbordMemberListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panDeshbordMember1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDeshbordMember2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDeshbordMember3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDeshbordMember4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout subPanDashBordLayout = new javax.swing.GroupLayout(subPanDashBord);
        subPanDashBord.setLayout(subPanDashBordLayout);
        subPanDashBordLayout.setHorizontalGroup(
            subPanDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanDashBordLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(subPanDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, subPanDashBordLayout.createSequentialGroup()
                        .addGroup(subPanDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(subPanDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(subPanDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(subPanDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panDeshbordMemberList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, subPanDashBordLayout.createSequentialGroup()
                        .addGroup(subPanDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panDeshbordShowBookList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );
        subPanDashBordLayout.setVerticalGroup(
            subPanDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanDashBordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(23, 23, 23)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDeshbordShowBookList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(subPanDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(subPanDashBordLayout.createSequentialGroup()
                        .addGroup(subPanDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(jLabel53)
                            .addComponent(jLabel111)
                            .addComponent(jLabel114))
                        .addGap(0, 0, 0)
                        .addGroup(subPanDashBordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDeshbordMemberList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        scPanDashBord.setViewportView(subPanDashBord);

        javax.swing.GroupLayout jpanDashboardLayout = new javax.swing.GroupLayout(jpanDashboard);
        jpanDashboard.setLayout(jpanDashboardLayout);
        jpanDashboardLayout.setHorizontalGroup(
            jpanDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanDashBord, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        jpanDashboardLayout.setVerticalGroup(
            jpanDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanDashBord, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        jpanBookAvaliCheck.setBackground(new java.awt.Color(153, 51, 255));
        jpanBookAvaliCheck.setPreferredSize(new java.awt.Dimension(996, 683));

        scPanBookAvaliCheck.setBorder(null);
        scPanBookAvaliCheck.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scPanBookAvaliCheck.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scPanBookAvaliCheck.setPreferredSize(new java.awt.Dimension(996, 678));
        scPanBookAvaliCheck.setVerticalScrollBar(bookAvaliBordScrolBar);

        subPanBookAvailCheck.setBackground(new java.awt.Color(255, 255, 255));
        subPanBookAvailCheck.setPreferredSize(new java.awt.Dimension(1161, 1150));

        jLabel55.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("|  Show Available Book");

        tblShowAvailableBookList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        tblShowAvailableBookList.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tblShowAvailableBookList.setForeground(new java.awt.Color(51, 153, 255));
        tblShowAvailableBookList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Book Code", "Author Name", "Publisher Name", "Edition", "Qty", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblShowAvailableBookList.setColumnSelectionAllowed(true);
        tblShowAvailableBookList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblShowAvailableBookList.setFillsViewportHeight(true);
        tblShowAvailableBookList.setGridColor(new java.awt.Color(204, 204, 255));
        tblShowAvailableBookList.setIntercellSpacing(new java.awt.Dimension(50, 10));
        tblShowAvailableBookList.setRowHeight(60);
        jScrollPane12.setViewportView(tblShowAvailableBookList);
        tblShowAvailableBookList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblShowAvailableBookList.getColumnModel().getColumnCount() > 0) {
            tblShowAvailableBookList.getColumnModel().getColumn(0).setResizable(false);
            tblShowAvailableBookList.getColumnModel().getColumn(1).setResizable(false);
            tblShowAvailableBookList.getColumnModel().getColumn(2).setResizable(false);
            tblShowAvailableBookList.getColumnModel().getColumn(3).setResizable(false);
            tblShowAvailableBookList.getColumnModel().getColumn(4).setResizable(false);
            tblShowAvailableBookList.getColumnModel().getColumn(5).setResizable(false);
            tblShowAvailableBookList.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel35.setBackground(new java.awt.Color(204, 102, 255));

        jLabel42.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Book Code");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel56.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Author Name");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel57.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Book Name");
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel58.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Publisher Name");
        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel59.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Edition");
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel60.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Qty");
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel61.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Category");
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel59)
                        .addComponent(jLabel60)
                        .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );

        btnRefreshTableAvailBookList.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        btnRefreshTableAvailBookList.setForeground(new java.awt.Color(204, 102, 255));
        btnRefreshTableAvailBookList.setText("| Refresh Table ??");
        btnRefreshTableAvailBookList.setBorder(null);
        btnRefreshTableAvailBookList.setContentAreaFilled(false);
        btnRefreshTableAvailBookList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshTableAvailBookList.setFocusPainted(false);
        btnRefreshTableAvailBookList.setFocusable(false);
        btnRefreshTableAvailBookList.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnRefreshTableAvailBookList.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnRefreshTableAvailBookList.setRequestFocusEnabled(false);
        btnRefreshTableAvailBookList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshTableAvailBookListMouseClicked(evt);
            }
        });
        btnRefreshTableAvailBookList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableAvailBookListActionPerformed(evt);
            }
        });

        tblDisplayAllBookListInAvailPan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        tblDisplayAllBookListInAvailPan.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tblDisplayAllBookListInAvailPan.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayAllBookListInAvailPan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "------------------------", " ------------------------", " --------------------------", " --------------------------", " -------------------------", " --------------------------", " --------------------------"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayAllBookListInAvailPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayAllBookListInAvailPan.setFillsViewportHeight(true);
        tblDisplayAllBookListInAvailPan.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayAllBookListInAvailPan.setIntercellSpacing(new java.awt.Dimension(50, 10));
        tblDisplayAllBookListInAvailPan.setRowHeight(60);
        tblDisplayAllBookListInAvailPan.setShowVerticalLines(false);
        jScrollPane13.setViewportView(tblDisplayAllBookListInAvailPan);
        tblDisplayAllBookListInAvailPan.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblDisplayAllBookListInAvailPan.getColumnModel().getColumnCount() > 0) {
            tblDisplayAllBookListInAvailPan.getColumnModel().getColumn(0).setResizable(false);
            tblDisplayAllBookListInAvailPan.getColumnModel().getColumn(1).setResizable(false);
            tblDisplayAllBookListInAvailPan.getColumnModel().getColumn(2).setResizable(false);
            tblDisplayAllBookListInAvailPan.getColumnModel().getColumn(3).setResizable(false);
            tblDisplayAllBookListInAvailPan.getColumnModel().getColumn(4).setResizable(false);
            tblDisplayAllBookListInAvailPan.getColumnModel().getColumn(5).setResizable(false);
            tblDisplayAllBookListInAvailPan.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel36.setBackground(new java.awt.Color(255, 0, 0));

        jLabel62.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Book Code");
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel63.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Author Name");
        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel64.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Book Name");
        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel65.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Publisher Name");
        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel66.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Edition");
        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel67.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Qty");
        jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel68.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Category");
        jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel65)
                        .addComponent(jLabel66)
                        .addComponent(jLabel67)
                        .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnRefreshTableForShowAllBookInfo.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        btnRefreshTableForShowAllBookInfo.setForeground(new java.awt.Color(255, 51, 51));
        btnRefreshTableForShowAllBookInfo.setText("| Refresh Table ??");
        btnRefreshTableForShowAllBookInfo.setBorder(null);
        btnRefreshTableForShowAllBookInfo.setContentAreaFilled(false);
        btnRefreshTableForShowAllBookInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshTableForShowAllBookInfo.setFocusPainted(false);
        btnRefreshTableForShowAllBookInfo.setFocusable(false);
        btnRefreshTableForShowAllBookInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnRefreshTableForShowAllBookInfo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnRefreshTableForShowAllBookInfo.setRequestFocusEnabled(false);
        btnRefreshTableForShowAllBookInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshTableForShowAllBookInfoMouseClicked(evt);
            }
        });
        btnRefreshTableForShowAllBookInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableForShowAllBookInfoActionPerformed(evt);
            }
        });

        txtAvailableBookSearchBar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtAvailableBookSearchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAvailableBookSearchBarMouseClicked(evt);
            }
        });
        txtAvailableBookSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAvailableBookSearchBarKeyTyped(evt);
            }
        });

        btnSearchAvailableBook.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSearchAvailableBook.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchAvailableBook.setText("Search");
        btnSearchAvailableBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchAvailableBook.setContentAreaFilled(false);
        btnSearchAvailableBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchAvailableBook.setFocusPainted(false);
        btnSearchAvailableBook.setFocusable(false);
        btnSearchAvailableBook.setRequestFocusEnabled(false);
        btnSearchAvailableBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAvailableBookActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 153, 153));
        jLabel32.setText("| Search Book Available, Using ISSN No......>>");

        jLabel69.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(102, 102, 102));
        jLabel69.setText("| Show All Book Information In This Table.....>>");

        jLabel71.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 153, 204));
        jLabel71.setText("| So many BOOKS, So little time.      ......Frank Zappa");

        javax.swing.GroupLayout subPanBookAvailCheckLayout = new javax.swing.GroupLayout(subPanBookAvailCheck);
        subPanBookAvailCheck.setLayout(subPanBookAvailCheckLayout);
        subPanBookAvailCheckLayout.setHorizontalGroup(
            subPanBookAvailCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanBookAvailCheckLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(subPanBookAvailCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subPanBookAvailCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRefreshTableForShowAllBookInfo)
                        .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(subPanBookAvailCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRefreshTableAvailBookList)
                        .addComponent(jScrollPane12)
                        .addComponent(jPanel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(subPanBookAvailCheckLayout.createSequentialGroup()
                            .addComponent(txtAvailableBookSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSearchAvailableBook, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        subPanBookAvailCheckLayout.setVerticalGroup(
            subPanBookAvailCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanBookAvailCheckLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanBookAvailCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearchAvailableBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAvailableBookSearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnRefreshTableAvailBookList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefreshTableForShowAllBookInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        scPanBookAvaliCheck.setViewportView(subPanBookAvailCheck);

        javax.swing.GroupLayout jpanBookAvaliCheckLayout = new javax.swing.GroupLayout(jpanBookAvaliCheck);
        jpanBookAvaliCheck.setLayout(jpanBookAvaliCheckLayout);
        jpanBookAvaliCheckLayout.setHorizontalGroup(
            jpanBookAvaliCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanBookAvaliCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        jpanBookAvaliCheckLayout.setVerticalGroup(
            jpanBookAvaliCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanBookAvaliCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpanIssueBook.setBackground(new java.awt.Color(102, 255, 0));
        jpanIssueBook.setPreferredSize(new java.awt.Dimension(996, 683));

        scPanIssueBookRecord.setBackground(new java.awt.Color(255, 255, 255));
        scPanIssueBookRecord.setBorder(null);
        scPanIssueBookRecord.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scPanIssueBookRecord.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scPanIssueBookRecord.setPreferredSize(new java.awt.Dimension(996, 678));
        scPanIssueBookRecord.setVerticalScrollBar(issueBookScrolBar);

        subPanIssueBook.setBackground(new java.awt.Color(255, 255, 255));
        subPanIssueBook.setPreferredSize(new java.awt.Dimension(1161, 889));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel25.setPreferredSize(new java.awt.Dimension(478, 381));

        jLabel17.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Member Id/Name:");

        jLabel29.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Qty:");

        txtBookIssueQty.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtBookIssueQty.setForeground(new java.awt.Color(102, 102, 102));

        jLabel31.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Submit By:");

        jLabel39.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("Book Id/Name:");

        jLabel40.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("Return Date:");

        jLabel41.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("Expire Date:");

        lblShowMsgBookIssue.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblShowMsgBookIssue.setForeground(new java.awt.Color(255, 0, 255));
        lblShowMsgBookIssue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowMsgBookIssue.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "[ Message ]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        comboBookIssueBookId.setEditable(true);
        comboBookIssueBookId.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboBookIssueBookId.setForeground(new java.awt.Color(102, 102, 102));
        comboBookIssueBookId.setFocusable(false);
        comboBookIssueBookId.setVerifyInputWhenFocusTarget(false);
        comboBookIssueBookId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBookIssueBookIdItemStateChanged(evt);
            }
        });

        comboBookIssueMemberId.setEditable(true);
        comboBookIssueMemberId.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboBookIssueMemberId.setForeground(new java.awt.Color(102, 102, 102));
        comboBookIssueMemberId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBookIssueMemberIdItemStateChanged(evt);
            }
        });

        comboBookIssueSubmitLibrarian.setEditable(true);
        comboBookIssueSubmitLibrarian.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboBookIssueSubmitLibrarian.setForeground(new java.awt.Color(102, 102, 102));

        btnAddBookIssueRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnAddBookIssueRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnAddBookIssueRecord.setText("Add Record");
        btnAddBookIssueRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnAddBookIssueRecord.setContentAreaFilled(false);
        btnAddBookIssueRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddBookIssueRecord.setFocusPainted(false);
        btnAddBookIssueRecord.setFocusable(false);
        btnAddBookIssueRecord.setRequestFocusEnabled(false);
        btnAddBookIssueRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBookIssueRecordMouseClicked(evt);
            }
        });
        btnAddBookIssueRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookIssueRecordActionPerformed(evt);
            }
        });

        comboReturnDayForBookIssue.setEditable(true);
        comboReturnDayForBookIssue.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboReturnDayForBookIssue.setForeground(new java.awt.Color(102, 102, 102));
        comboReturnDayForBookIssue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        comboReturnMonthForBookIssue.setEditable(true);
        comboReturnMonthForBookIssue.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboReturnMonthForBookIssue.setForeground(new java.awt.Color(102, 102, 102));
        comboReturnMonthForBookIssue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        comboReturnYearForBookIssue.setEditable(true);
        comboReturnYearForBookIssue.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboReturnYearForBookIssue.setForeground(new java.awt.Color(102, 102, 102));
        comboReturnYearForBookIssue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2015", "2016", "2017", "2018", "2019", "2020" }));

        comboExptDayForBookIssue.setEditable(true);
        comboExptDayForBookIssue.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboExptDayForBookIssue.setForeground(new java.awt.Color(102, 102, 102));
        comboExptDayForBookIssue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        comboExptMonthForBookIssue.setEditable(true);
        comboExptMonthForBookIssue.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboExptMonthForBookIssue.setForeground(new java.awt.Color(102, 102, 102));
        comboExptMonthForBookIssue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        comboExptYearForBookIssue.setEditable(true);
        comboExptYearForBookIssue.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboExptYearForBookIssue.setForeground(new java.awt.Color(102, 102, 102));
        comboExptYearForBookIssue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2015", "2016", "2017", "2018", "2019", "2020" }));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel39)
                    .addComponent(jLabel31)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAddBookIssueRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboBookIssueMemberId, 0, 226, Short.MAX_VALUE)
                                    .addComponent(comboBookIssueBookId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel29))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addComponent(comboExptDayForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboExptMonthForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboExptYearForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtBookIssueQty))
                                .addGap(0, 114, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(comboReturnDayForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboReturnMonthForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboReturnYearForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lblShowMsgBookIssue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(comboBookIssueSubmitLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBookIssueBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboExptDayForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboExptMonthForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboExptYearForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBookIssueMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookIssueQty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBookIssueSubmitLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboReturnDayForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboReturnMonthForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboReturnYearForBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblShowMsgBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddBookIssueRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        tblDisplayBookIssue.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayBookIssue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Id", "Member Id", "Issue Date", "Return Date", "Expire Date", "Qty", "Submit By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayBookIssue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayBookIssue.setFillsViewportHeight(true);
        tblDisplayBookIssue.setShowHorizontalLines(false);
        tblDisplayBookIssue.setShowVerticalLines(false);
        jScrollPane9.setViewportView(tblDisplayBookIssue);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel43.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setText("|  Book Issue");

        jLabel46.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 153, 204));
        jLabel46.setText("| A room without BOOKS is like a body without a soul.     ......Marcus Tullius Cicero");

        javax.swing.GroupLayout subPanIssueBookLayout = new javax.swing.GroupLayout(subPanIssueBook);
        subPanIssueBook.setLayout(subPanIssueBookLayout);
        subPanIssueBookLayout.setHorizontalGroup(
            subPanIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanIssueBookLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(subPanIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subPanIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE))
                    .addComponent(jLabel46))
                .addGap(124, 124, 124))
        );
        subPanIssueBookLayout.setVerticalGroup(
            subPanIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanIssueBookLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        scPanIssueBookRecord.setViewportView(subPanIssueBook);

        javax.swing.GroupLayout jpanIssueBookLayout = new javax.swing.GroupLayout(jpanIssueBook);
        jpanIssueBook.setLayout(jpanIssueBookLayout);
        jpanIssueBookLayout.setHorizontalGroup(
            jpanIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanIssueBookRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        jpanIssueBookLayout.setVerticalGroup(
            jpanIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanIssueBookRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpanBookRecive.setBackground(new java.awt.Color(204, 51, 255));
        jpanBookRecive.setPreferredSize(new java.awt.Dimension(996, 683));

        scPanBookRecive.setBorder(null);
        scPanBookRecive.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scPanBookRecive.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scPanBookRecive.setPreferredSize(new java.awt.Dimension(996, 678));
        scPanBookRecive.setVerticalScrollBar(bookReciveScrolBar);

        subPanBookRecive.setBackground(new java.awt.Color(255, 255, 255));
        subPanBookRecive.setPreferredSize(new java.awt.Dimension(1161, 889));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        tblDisplayShowIssuBookInBookRecive.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayShowIssuBookInBookRecive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Id", "Member Id", "Issue Date", "Return Date", "Expire Date", "Qty", "Submit By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayShowIssuBookInBookRecive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayShowIssuBookInBookRecive.setFillsViewportHeight(true);
        tblDisplayShowIssuBookInBookRecive.setShowVerticalLines(false);
        jScrollPane10.setViewportView(tblDisplayShowIssuBookInBookRecive);
        if (tblDisplayShowIssuBookInBookRecive.getColumnModel().getColumnCount() > 0) {
            tblDisplayShowIssuBookInBookRecive.getColumnModel().getColumn(3).setHeaderValue("Issue Date");
            tblDisplayShowIssuBookInBookRecive.getColumnModel().getColumn(5).setHeaderValue("Expire Date");
        }

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel47.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setText("|  Book Recive");

        btnBookReciveSearch.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnBookReciveSearch.setForeground(new java.awt.Color(102, 102, 102));
        btnBookReciveSearch.setText("Search");
        btnBookReciveSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnBookReciveSearch.setContentAreaFilled(false);
        btnBookReciveSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBookReciveSearch.setFocusPainted(false);
        btnBookReciveSearch.setFocusable(false);
        btnBookReciveSearch.setRequestFocusEnabled(false);
        btnBookReciveSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookReciveSearchMouseClicked(evt);
            }
        });
        btnBookReciveSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookReciveSearchActionPerformed(evt);
            }
        });

        txtBookReciveSearchBar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtBookReciveSearchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBookReciveSearchBarMouseClicked(evt);
            }
        });

        btnReciveBook.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnReciveBook.setForeground(new java.awt.Color(102, 102, 102));
        btnReciveBook.setText("Recive Book");
        btnReciveBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnReciveBook.setContentAreaFilled(false);
        btnReciveBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReciveBook.setFocusPainted(false);
        btnReciveBook.setFocusable(false);
        btnReciveBook.setRequestFocusEnabled(false);
        btnReciveBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReciveBookMouseClicked(evt);
            }
        });
        btnReciveBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciveBookActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Submit By:");

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "[ Show All Recive Information ]", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        tblDisplayBookRecive.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayBookRecive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Id", "Member Id", "Submit Date", "Qty", "Submit By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayBookRecive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayBookRecive.setFillsViewportHeight(true);
        tblDisplayBookRecive.setShowHorizontalLines(false);
        tblDisplayBookRecive.setShowVerticalLines(false);
        jScrollPane11.setViewportView(tblDisplayBookRecive);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        comboSubmitLibrarianForBookRecive.setEditable(true);
        comboSubmitLibrarianForBookRecive.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboSubmitLibrarianForBookRecive.setForeground(new java.awt.Color(102, 102, 102));

        btnReportMember.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        btnReportMember.setForeground(new java.awt.Color(153, 153, 153));
        btnReportMember.setText("| Report Selected Member ?");
        btnReportMember.setBorder(null);
        btnReportMember.setContentAreaFilled(false);
        btnReportMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportMember.setFocusPainted(false);
        btnReportMember.setFocusable(false);
        btnReportMember.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnReportMember.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnReportMember.setRequestFocusEnabled(false);
        btnReportMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportMemberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportMemberMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReportMemberMouseReleased(evt);
            }
        });
        btnReportMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportMemberActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 153, 204));
        jLabel70.setText("| A room without BOOKS is like a body without a soul.     ......Marcus Tullius Cicero");

        jLabel72.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(102, 102, 102));
        jLabel72.setText("| Search record using Member ID......>>>");

        javax.swing.GroupLayout subPanBookReciveLayout = new javax.swing.GroupLayout(subPanBookRecive);
        subPanBookRecive.setLayout(subPanBookReciveLayout);
        subPanBookReciveLayout.setHorizontalGroup(
            subPanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanBookReciveLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(subPanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanBookReciveLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReportMember)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanBookReciveLayout.createSequentialGroup()
                        .addGroup(subPanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(subPanBookReciveLayout.createSequentialGroup()
                                .addComponent(txtBookReciveSearchBar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBookReciveSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(subPanBookReciveLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboSubmitLibrarianForBookRecive, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReciveBook, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(131, 131, 131))
                    .addGroup(subPanBookReciveLayout.createSequentialGroup()
                        .addGroup(subPanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72)
                            .addComponent(jLabel70))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        subPanBookReciveLayout.setVerticalGroup(
            subPanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanBookReciveLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(subPanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(btnReportMember, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70)
                .addGap(38, 38, 38)
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookReciveSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookReciveSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReciveBook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSubmitLibrarianForBookRecive, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        scPanBookRecive.setViewportView(subPanBookRecive);

        javax.swing.GroupLayout jpanBookReciveLayout = new javax.swing.GroupLayout(jpanBookRecive);
        jpanBookRecive.setLayout(jpanBookReciveLayout);
        jpanBookReciveLayout.setHorizontalGroup(
            jpanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanBookRecive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanBookReciveLayout.setVerticalGroup(
            jpanBookReciveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanBookRecive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpanAddBookRecord.setBackground(new java.awt.Color(255, 204, 0));
        jpanAddBookRecord.setPreferredSize(new java.awt.Dimension(996, 683));

        scPanAddBookRecord.setBorder(null);
        scPanAddBookRecord.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scPanAddBookRecord.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scPanAddBookRecord.setPreferredSize(new java.awt.Dimension(996, 678));
        scPanAddBookRecord.setVerticalScrollBar(addBookScrolBar);

        subPanAddBookRecord.setBackground(new java.awt.Color(255, 255, 255));
        subPanAddBookRecord.setPreferredSize(new java.awt.Dimension(1161, 889));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Book code:");

        txtBookRecordQty.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtBookRecordQty.setForeground(new java.awt.Color(102, 102, 102));

        jLabel12.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Category:");

        jLabel7.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Unit Price:");

        jLabel10.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Rack No:");

        txtBookRecordUnitPrice.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtBookRecordUnitPrice.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Qty:");

        jLabel3.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Author:");

        jLabel11.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("ISSN No:");

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Book Name:");

        jLabel5.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Publisher:");

        jLabel6.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Edition:");

        txtBookRecordBookCode.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtBookRecordBookCode.setForeground(new java.awt.Color(102, 102, 102));

        txtBookRecordTotalPrice.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtBookRecordTotalPrice.setForeground(new java.awt.Color(102, 102, 102));

        txtBookRecordRackNo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtBookRecordRackNo.setForeground(new java.awt.Color(102, 102, 102));

        jLabel9.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Total Price:");

        txtBookRecordIssnNo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtBookRecordIssnNo.setForeground(new java.awt.Color(102, 102, 102));

        txtBookRecordBookName.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtBookRecordBookName.setForeground(new java.awt.Color(102, 102, 102));

        btnAddRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnAddRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnAddRecord.setText("Add Record");
        btnAddRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnAddRecord.setContentAreaFilled(false);
        btnAddRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddRecord.setFocusPainted(false);
        btnAddRecord.setFocusable(false);
        btnAddRecord.setRequestFocusEnabled(false);
        btnAddRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecordActionPerformed(evt);
            }
        });

        btnEditeRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnEditeRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnEditeRecord.setText("Edit Record");
        btnEditeRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnEditeRecord.setContentAreaFilled(false);
        btnEditeRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditeRecord.setFocusPainted(false);
        btnEditeRecord.setFocusable(false);
        btnEditeRecord.setRequestFocusEnabled(false);
        btnEditeRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditeRecordActionPerformed(evt);
            }
        });

        lblBookRecordShowMsg.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblBookRecordShowMsg.setForeground(new java.awt.Color(255, 0, 255));
        lblBookRecordShowMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookRecordShowMsg.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "[ Message ]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        comboBookRecordAuthorList.setEditable(true);
        comboBookRecordAuthorList.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboBookRecordAuthorList.setForeground(new java.awt.Color(102, 102, 102));
        comboBookRecordAuthorList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Author Name" }));
        comboBookRecordAuthorList.setFocusable(false);
        comboBookRecordAuthorList.setVerifyInputWhenFocusTarget(false);

        comboBookRecordPublisherList.setEditable(true);
        comboBookRecordPublisherList.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboBookRecordPublisherList.setForeground(new java.awt.Color(102, 102, 102));
        comboBookRecordPublisherList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Publisher Name" }));
        comboBookRecordPublisherList.setFocusable(false);
        comboBookRecordPublisherList.setVerifyInputWhenFocusTarget(false);

        comboBookRecordEditionList.setEditable(true);
        comboBookRecordEditionList.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboBookRecordEditionList.setForeground(new java.awt.Color(102, 102, 102));
        comboBookRecordEditionList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Edition" }));
        comboBookRecordEditionList.setFocusable(false);
        comboBookRecordEditionList.setVerifyInputWhenFocusTarget(false);

        comboBookRecordCategoryList.setEditable(true);
        comboBookRecordCategoryList.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboBookRecordCategoryList.setForeground(new java.awt.Color(102, 102, 102));
        comboBookRecordCategoryList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        comboBookRecordCategoryList.setFocusable(false);
        comboBookRecordCategoryList.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtBookRecordBookName)
                        .addComponent(txtBookRecordBookCode)
                        .addComponent(comboBookRecordAuthorList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBookRecordPublisherList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBookRecordEditionList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBookRecordUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBookRecordTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookRecordQty, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBookRecordRackNo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookRecordIssnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBookRecordCategoryList, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAddRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditeRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBookRecordShowMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBookRecordBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookRecordBookCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBookRecordAuthorList, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBookRecordPublisherList, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBookRecordEditionList, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookRecordUnitPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookRecordQty)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookRecordTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookRecordRackNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookRecordIssnNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBookRecordCategoryList, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(lblBookRecordShowMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditeRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        tblDisplayBookInfo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayBookInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Name", "Book code", "Author", "Publisher", "Edition", "Unit Price", "Qty", "Total Price", "Rack No", "ISSN no", "Category", "Purchase Date"
            }
        ));
        tblDisplayBookInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayBookInfo.setFillsViewportHeight(true);
        tblDisplayBookInfo.setShowHorizontalLines(false);
        tblDisplayBookInfo.setShowVerticalLines(false);
        tblDisplayBookInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayBookInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisplayBookInfo);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel16.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("|  Add Book Record");

        jLabel30.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 153, 204));
        jLabel30.setText("| There is no friend as loyal as a book.     .....Ernest Hemingway");

        javax.swing.GroupLayout subPanAddBookRecordLayout = new javax.swing.GroupLayout(subPanAddBookRecord);
        subPanAddBookRecord.setLayout(subPanAddBookRecordLayout);
        subPanAddBookRecordLayout.setHorizontalGroup(
            subPanAddBookRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanAddBookRecordLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(subPanAddBookRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        subPanAddBookRecordLayout.setVerticalGroup(
            subPanAddBookRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanAddBookRecordLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        scPanAddBookRecord.setViewportView(subPanAddBookRecord);

        javax.swing.GroupLayout jpanAddBookRecordLayout = new javax.swing.GroupLayout(jpanAddBookRecord);
        jpanAddBookRecord.setLayout(jpanAddBookRecordLayout);
        jpanAddBookRecordLayout.setHorizontalGroup(
            jpanAddBookRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanAddBookRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanAddBookRecordLayout.setVerticalGroup(
            jpanAddBookRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanAddBookRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpanAddMemberRecord.setBackground(new java.awt.Color(102, 204, 255));
        jpanAddMemberRecord.setPreferredSize(new java.awt.Dimension(996, 683));

        scPanAddMemberRecord.setBorder(null);
        scPanAddMemberRecord.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scPanAddMemberRecord.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scPanAddMemberRecord.setPreferredSize(new java.awt.Dimension(996, 678));
        scPanAddMemberRecord.setVerticalScrollBar(addMemberScrolBar);

        subPanAddMemberRecord.setBackground(new java.awt.Color(255, 255, 255));
        subPanAddMemberRecord.setPreferredSize(new java.awt.Dimension(1161, 889));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        txtMemberHouseNo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtMemberHouseNo.setForeground(new java.awt.Color(102, 102, 102));

        txtMobileNo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtMobileNo.setForeground(new java.awt.Color(102, 102, 102));

        jLabel15.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Member Card:");

        txtMemberBlockOrVillage.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtMemberBlockOrVillage.setForeground(new java.awt.Color(102, 102, 102));

        txtMemberEmail.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtMemberEmail.setForeground(new java.awt.Color(102, 102, 102));

        jLabel19.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Road NO:");

        jLabel20.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("District:");

        txtMemberRoadNo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtMemberRoadNo.setForeground(new java.awt.Color(102, 102, 102));

        jLabel21.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Block/Village:");

        jLabel22.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Mobile No:");

        jLabel23.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Division:");

        jLabel24.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Member Name:");

        jLabel25.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Email:");

        jLabel26.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("House No:");

        txtMemberCardNo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtMemberCardNo.setForeground(new java.awt.Color(102, 102, 102));

        txtMemberThana.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtMemberThana.setForeground(new java.awt.Color(102, 102, 102));

        jLabel27.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Thana:");

        txtMemberName.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtMemberName.setForeground(new java.awt.Color(102, 102, 102));

        btnAddMemberRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnAddMemberRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnAddMemberRecord.setText("Add Record");
        btnAddMemberRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnAddMemberRecord.setContentAreaFilled(false);
        btnAddMemberRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddMemberRecord.setFocusPainted(false);
        btnAddMemberRecord.setFocusable(false);
        btnAddMemberRecord.setRequestFocusEnabled(false);
        btnAddMemberRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemberRecordActionPerformed(evt);
            }
        });

        btnEditMemberRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnEditMemberRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnEditMemberRecord.setText("Edit Record");
        btnEditMemberRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnEditMemberRecord.setContentAreaFilled(false);
        btnEditMemberRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditMemberRecord.setFocusPainted(false);
        btnEditMemberRecord.setFocusable(false);
        btnEditMemberRecord.setRequestFocusEnabled(false);
        btnEditMemberRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMemberRecordActionPerformed(evt);
            }
        });

        lblMemberShowMsg.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblMemberShowMsg.setForeground(new java.awt.Color(255, 0, 255));
        lblMemberShowMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemberShowMsg.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "[ Message ]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        comboMemberDistrict.setEditable(true);
        comboMemberDistrict.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboMemberDistrict.setForeground(new java.awt.Color(102, 102, 102));
        comboMemberDistrict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select District", "Dhaka", "Norshingdi", "Feni", "comilla", "Nogaon", "Tangail", "Jamalpur" }));
        comboMemberDistrict.setFocusable(false);
        comboMemberDistrict.setVerifyInputWhenFocusTarget(false);

        comboMemberDivision.setEditable(true);
        comboMemberDivision.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboMemberDivision.setForeground(new java.awt.Color(102, 102, 102));
        comboMemberDivision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Division", "Dhaka", "Rajshahi", "Ctg", "khulna" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel24)
                            .addComponent(jLabel22)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMemberName)
                            .addComponent(txtMemberCardNo)
                            .addComponent(txtMobileNo)
                            .addComponent(txtMemberEmail)
                            .addComponent(txtMemberHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMemberRoadNo)
                            .addComponent(txtMemberBlockOrVillage)
                            .addComponent(txtMemberThana)
                            .addComponent(comboMemberDistrict, 0, 208, Short.MAX_VALUE)
                            .addComponent(comboMemberDivision, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMemberShowMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addComponent(btnAddMemberRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditMemberRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(77, 77, 77))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMemberName)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemberCardNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMobileNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemberEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemberHouseNo))
                        .addGap(303, 303, 303))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemberRoadNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemberBlockOrVillage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemberThana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMemberDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMemberDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMemberShowMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddMemberRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditMemberRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        tblDisplayMemberInfo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayMemberInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name", "Member Card No", "Mobile No", "Email", "House No", "Road No", "Block/Village", "Thana", "District", "Division", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayMemberInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayMemberInfo.setFillsViewportHeight(true);
        tblDisplayMemberInfo.setShowHorizontalLines(false);
        tblDisplayMemberInfo.setShowVerticalLines(false);
        tblDisplayMemberInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayMemberInfoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDisplayMemberInfo);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel28.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("|  Add Member Record");

        jLabel48.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 153, 204));
        jLabel48.setText("| I have always imagined that Paradise will be a kind of library.    .....Jorge Luis Borges");

        javax.swing.GroupLayout subPanAddMemberRecordLayout = new javax.swing.GroupLayout(subPanAddMemberRecord);
        subPanAddMemberRecord.setLayout(subPanAddMemberRecordLayout);
        subPanAddMemberRecordLayout.setHorizontalGroup(
            subPanAddMemberRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanAddMemberRecordLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(subPanAddMemberRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        subPanAddMemberRecordLayout.setVerticalGroup(
            subPanAddMemberRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanAddMemberRecordLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        scPanAddMemberRecord.setViewportView(subPanAddMemberRecord);

        javax.swing.GroupLayout jpanAddMemberRecordLayout = new javax.swing.GroupLayout(jpanAddMemberRecord);
        jpanAddMemberRecord.setLayout(jpanAddMemberRecordLayout);
        jpanAddMemberRecordLayout.setHorizontalGroup(
            jpanAddMemberRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanAddMemberRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanAddMemberRecordLayout.setVerticalGroup(
            jpanAddMemberRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanAddMemberRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpanCreateBookDetails.setBackground(new java.awt.Color(153, 153, 0));
        jpanCreateBookDetails.setPreferredSize(new java.awt.Dimension(996, 683));

        scPanAddOtherRecord.setBorder(null);
        scPanAddOtherRecord.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scPanAddOtherRecord.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scPanAddOtherRecord.setPreferredSize(new java.awt.Dimension(996, 678));
        scPanAddOtherRecord.setVerticalScrollBar(createBookDtlsScrolBar);

        subPanOtherRecord.setBackground(new java.awt.Color(255, 255, 255));
        subPanOtherRecord.setPreferredSize(new java.awt.Dimension(1161, 1312));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "[ Add Author ]", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 18), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel34.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Author Name:");

        txtAutorName.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtAutorName.setForeground(new java.awt.Color(102, 102, 102));

        btnAddAutorRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnAddAutorRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnAddAutorRecord.setText("Add Record");
        btnAddAutorRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnAddAutorRecord.setContentAreaFilled(false);
        btnAddAutorRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddAutorRecord.setFocusPainted(false);
        btnAddAutorRecord.setFocusable(false);
        btnAddAutorRecord.setRequestFocusEnabled(false);
        btnAddAutorRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAutorRecordActionPerformed(evt);
            }
        });

        lblShowMsgAuthor.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblShowMsgAuthor.setForeground(new java.awt.Color(255, 0, 255));
        lblShowMsgAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowMsgAuthor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "[ Message ]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel44.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("Date Of Birth:");

        jLabel45.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Date Of Death:");

        comboDayForAuthorBirth.setEditable(true);
        comboDayForAuthorBirth.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboDayForAuthorBirth.setForeground(new java.awt.Color(102, 102, 102));
        comboDayForAuthorBirth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        comboMonthForAuthorBirth.setEditable(true);
        comboMonthForAuthorBirth.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboMonthForAuthorBirth.setForeground(new java.awt.Color(102, 102, 102));
        comboMonthForAuthorBirth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        comboYearForAuthorBirth.setEditable(true);
        comboYearForAuthorBirth.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboYearForAuthorBirth.setForeground(new java.awt.Color(102, 102, 102));
        comboYearForAuthorBirth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004" }));

        comboDayForAuthorDeath.setEditable(true);
        comboDayForAuthorDeath.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboDayForAuthorDeath.setForeground(new java.awt.Color(102, 102, 102));
        comboDayForAuthorDeath.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        comboMonthForAuthorDeath.setEditable(true);
        comboMonthForAuthorDeath.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboMonthForAuthorDeath.setForeground(new java.awt.Color(102, 102, 102));
        comboMonthForAuthorDeath.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        comboYearForAuthorDeath.setEditable(true);
        comboYearForAuthorDeath.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboYearForAuthorDeath.setForeground(new java.awt.Color(102, 102, 102));
        comboYearForAuthorDeath.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004" }));

        txtAreaAbout.setColumns(20);
        txtAreaAbout.setRows(5);
        txtAreaAbout.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "[ About  ( MAX 100 Word ) ]", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jScrollPane2.setViewportView(txtAreaAbout);

        checkBoxAliveForAuthor.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        checkBoxAliveForAuthor.setSelected(true);
        checkBoxAliveForAuthor.setText("Still Alive");
        checkBoxAliveForAuthor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        checkBoxAliveForAuthor.setBorderPainted(true);
        checkBoxAliveForAuthor.setContentAreaFilled(false);
        checkBoxAliveForAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkBoxAliveForAuthor.setIconTextGap(20);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(comboDayForAuthorBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboMonthForAuthorBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboYearForAuthorBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtAutorName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addComponent(comboDayForAuthorDeath, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMonthForAuthorDeath, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboYearForAuthorDeath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addContainerGap(164, Short.MAX_VALUE)
                        .addComponent(checkBoxAliveForAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(lblShowMsgAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(btnAddAutorRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAutorName)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDayForAuthorBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMonthForAuthorBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboYearForAuthorBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDayForAuthorDeath, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMonthForAuthorDeath, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboYearForAuthorDeath, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxAliveForAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblShowMsgAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddAutorRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel17.setPreferredSize(new java.awt.Dimension(549, 182));

        tblDisplayAuthor.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayAuthor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Author Name", "Date Of Birth", "Date Of Death", "About"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayAuthor.setFillsViewportHeight(true);
        tblDisplayAuthor.setShowHorizontalLines(false);
        tblDisplayAuthor.setShowVerticalLines(false);
        jScrollPane5.setViewportView(tblDisplayAuthor);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel38.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("|  Add Other Record");

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "[ Add Publisher ]", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 18), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel35.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("Publisher Name:");

        txtPublisherName.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtPublisherName.setForeground(new java.awt.Color(102, 102, 102));

        btnAddPublisherRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnAddPublisherRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnAddPublisherRecord.setText("Add Record");
        btnAddPublisherRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnAddPublisherRecord.setContentAreaFilled(false);
        btnAddPublisherRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddPublisherRecord.setFocusPainted(false);
        btnAddPublisherRecord.setFocusable(false);
        btnAddPublisherRecord.setRequestFocusEnabled(false);
        btnAddPublisherRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPublisherRecordActionPerformed(evt);
            }
        });

        lblShowMsgPublisher.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblShowMsgPublisher.setForeground(new java.awt.Color(255, 0, 255));
        lblShowMsgPublisher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowMsgPublisher.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "[ Message ]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddPublisherRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(lblShowMsgPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPublisherName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPublisherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblShowMsgPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddPublisherRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        tblDisplayPublisher.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayPublisher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Publisher Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayPublisher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayPublisher.setFillsViewportHeight(true);
        tblDisplayPublisher.setShowHorizontalLines(false);
        tblDisplayPublisher.setShowVerticalLines(false);
        jScrollPane6.setViewportView(tblDisplayPublisher);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "[ Add Catagory ]", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 18), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel36.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("Catagory Name:");

        txtCatagoryName.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtCatagoryName.setForeground(new java.awt.Color(102, 102, 102));

        btnAddCatagoryRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnAddCatagoryRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnAddCatagoryRecord.setText("Add Record");
        btnAddCatagoryRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnAddCatagoryRecord.setContentAreaFilled(false);
        btnAddCatagoryRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCatagoryRecord.setFocusPainted(false);
        btnAddCatagoryRecord.setFocusable(false);
        btnAddCatagoryRecord.setRequestFocusEnabled(false);
        btnAddCatagoryRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCatagoryRecordActionPerformed(evt);
            }
        });

        lblShowMsgCatagory.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblShowMsgCatagory.setForeground(new java.awt.Color(255, 0, 255));
        lblShowMsgCatagory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowMsgCatagory.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "[ Message ]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddCatagoryRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(lblShowMsgCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCatagoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCatagoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblShowMsgCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCatagoryRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        tblDisplayCatagory.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayCatagory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Catagory  Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayCatagory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayCatagory.setFillsViewportHeight(true);
        tblDisplayCatagory.setShowHorizontalLines(false);
        tblDisplayCatagory.setShowVerticalLines(false);
        jScrollPane7.setViewportView(tblDisplayCatagory);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "[ Add Edition ]", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 18), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel37.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Edition:");

        txtEditionName.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtEditionName.setForeground(new java.awt.Color(102, 102, 102));

        btnAddEditionRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnAddEditionRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnAddEditionRecord.setText("Add Record");
        btnAddEditionRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnAddEditionRecord.setContentAreaFilled(false);
        btnAddEditionRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEditionRecord.setFocusPainted(false);
        btnAddEditionRecord.setFocusable(false);
        btnAddEditionRecord.setRequestFocusEnabled(false);
        btnAddEditionRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEditionRecordActionPerformed(evt);
            }
        });

        lblShowMsgEdition.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblShowMsgEdition.setForeground(new java.awt.Color(255, 0, 255));
        lblShowMsgEdition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowMsgEdition.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2), "[ Message ]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SimSun", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEditionName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(lblShowMsgEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(btnAddEditionRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditionName))
                .addGap(18, 18, 18)
                .addComponent(lblShowMsgEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddEditionRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        tblDisplayEdition.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayEdition.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Edition Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayEdition.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayEdition.setFillsViewportHeight(true);
        tblDisplayEdition.setShowHorizontalLines(false);
        tblDisplayEdition.setShowVerticalLines(false);
        jScrollPane8.setViewportView(tblDisplayEdition);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel49.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 153, 204));
        jLabel49.setText("| Good friends, good books, and a sleepy conscience: this is the ideal life.     .....Mark Twain");

        javax.swing.GroupLayout subPanOtherRecordLayout = new javax.swing.GroupLayout(subPanOtherRecord);
        subPanOtherRecord.setLayout(subPanOtherRecordLayout);
        subPanOtherRecordLayout.setHorizontalGroup(
            subPanOtherRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanOtherRecordLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(subPanOtherRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanOtherRecordLayout.createSequentialGroup()
                        .addGroup(subPanOtherRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(subPanOtherRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(subPanOtherRecordLayout.createSequentialGroup()
                        .addGroup(subPanOtherRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel49))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        subPanOtherRecordLayout.setVerticalGroup(
            subPanOtherRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanOtherRecordLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel38)
                .addGroup(subPanOtherRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanOtherRecordLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanOtherRecordLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(subPanOtherRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(subPanOtherRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(subPanOtherRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subPanOtherRecordLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        scPanAddOtherRecord.setViewportView(subPanOtherRecord);

        javax.swing.GroupLayout jpanCreateBookDetailsLayout = new javax.swing.GroupLayout(jpanCreateBookDetails);
        jpanCreateBookDetails.setLayout(jpanCreateBookDetailsLayout);
        jpanCreateBookDetailsLayout.setHorizontalGroup(
            jpanCreateBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanAddOtherRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanCreateBookDetailsLayout.setVerticalGroup(
            jpanCreateBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanAddOtherRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpanDeleteRecord.setBackground(new java.awt.Color(51, 153, 255));
        jpanDeleteRecord.setPreferredSize(new java.awt.Dimension(996, 683));

        scPanDeleteRecord.setBorder(null);
        scPanDeleteRecord.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scPanDeleteRecord.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scPanDeleteRecord.setName(""); // NOI18N
        scPanDeleteRecord.setPreferredSize(new java.awt.Dimension(996, 678));
        scPanDeleteRecord.setVerticalScrollBar(deleteRecordScrolBar);

        subPanDeleteRecord.setBackground(new java.awt.Color(255, 255, 255));
        subPanDeleteRecord.setPreferredSize(new java.awt.Dimension(1161, 2890));

        tblDisplayAuthorRecordForDel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        tblDisplayAuthorRecordForDel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tblDisplayAuthorRecordForDel.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayAuthorRecordForDel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Author Name", "Date Of Birth", "Date Of Dead/ Live", "About"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayAuthorRecordForDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayAuthorRecordForDel.setFillsViewportHeight(true);
        tblDisplayAuthorRecordForDel.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayAuthorRecordForDel.setIntercellSpacing(new java.awt.Dimension(50, 10));
        tblDisplayAuthorRecordForDel.setRowHeight(60);
        tblDisplayAuthorRecordForDel.setShowVerticalLines(false);
        jScrollPane14.setViewportView(tblDisplayAuthorRecordForDel);
        tblDisplayAuthorRecordForDel.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel83.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(51, 51, 51));
        jLabel83.setText("|  Delete All Record");

        tblDisplayPublisharRecordForDel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        tblDisplayPublisharRecordForDel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tblDisplayPublisharRecordForDel.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayPublisharRecordForDel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Publishar Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayPublisharRecordForDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayPublisharRecordForDel.setFillsViewportHeight(true);
        tblDisplayPublisharRecordForDel.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayPublisharRecordForDel.setIntercellSpacing(new java.awt.Dimension(50, 10));
        tblDisplayPublisharRecordForDel.setRowHeight(60);
        tblDisplayPublisharRecordForDel.setShowVerticalLines(false);
        jScrollPane15.setViewportView(tblDisplayPublisharRecordForDel);
        tblDisplayPublisharRecordForDel.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        tblDisplayBookRecordForDlt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        tblDisplayBookRecordForDlt.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tblDisplayBookRecordForDlt.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayBookRecordForDlt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Name", "Book Code", "Author Name", "Publishar Name", "Edition", "Unit Price", "Qty", "Total Price", "Rack No", "Issn No", "Category", "Purchase Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayBookRecordForDlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayBookRecordForDlt.setFillsViewportHeight(true);
        tblDisplayBookRecordForDlt.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayBookRecordForDlt.setRowHeight(60);
        tblDisplayBookRecordForDlt.setShowVerticalLines(false);
        jScrollPane16.setViewportView(tblDisplayBookRecordForDlt);
        tblDisplayBookRecordForDlt.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        tblDisplayMemberRecordForDlt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        tblDisplayMemberRecordForDlt.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tblDisplayMemberRecordForDlt.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayMemberRecordForDlt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name", "Member Code", "Mobile Number", "Email", "House No", "Road No", "Block/Village", "Thana", "District", "Devision"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayMemberRecordForDlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayMemberRecordForDlt.setFillsViewportHeight(true);
        tblDisplayMemberRecordForDlt.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayMemberRecordForDlt.setRowHeight(60);
        tblDisplayMemberRecordForDlt.setShowVerticalLines(false);
        jScrollPane17.setViewportView(tblDisplayMemberRecordForDlt);
        tblDisplayMemberRecordForDlt.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblDisplayMemberRecordForDlt.getColumnModel().getColumnCount() > 0) {
            tblDisplayMemberRecordForDlt.getColumnModel().getColumn(0).setResizable(false);
        }

        tblDisplayBookReciveRecordForDel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        tblDisplayBookReciveRecordForDel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tblDisplayBookReciveRecordForDel.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayBookReciveRecordForDel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book ID", "Member ID", "Submit Date", "Qty", "Submit BY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayBookReciveRecordForDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayBookReciveRecordForDel.setFillsViewportHeight(true);
        tblDisplayBookReciveRecordForDel.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayBookReciveRecordForDel.setIntercellSpacing(new java.awt.Dimension(50, 10));
        tblDisplayBookReciveRecordForDel.setRowHeight(60);
        tblDisplayBookReciveRecordForDel.setShowVerticalLines(false);
        jScrollPane18.setViewportView(tblDisplayBookReciveRecordForDel);
        tblDisplayBookReciveRecordForDel.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        txtSearchBarForDltBookRecord.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtSearchBarForDltBookRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchBarForDltBookRecordMouseClicked(evt);
            }
        });

        btnSearchForDltBookRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSearchForDltBookRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchForDltBookRecord.setText("Search");
        btnSearchForDltBookRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchForDltBookRecord.setContentAreaFilled(false);
        btnSearchForDltBookRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchForDltBookRecord.setFocusPainted(false);
        btnSearchForDltBookRecord.setFocusable(false);
        btnSearchForDltBookRecord.setRequestFocusEnabled(false);
        btnSearchForDltBookRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchForDltBookRecordActionPerformed(evt);
            }
        });

        txtSearchBarForDelMemberRecord.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtSearchBarForDelMemberRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchBarForDelMemberRecordMouseClicked(evt);
            }
        });

        btnSearchForDelMemberRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSearchForDelMemberRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchForDelMemberRecord.setText("Search");
        btnSearchForDelMemberRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchForDelMemberRecord.setContentAreaFilled(false);
        btnSearchForDelMemberRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchForDelMemberRecord.setFocusPainted(false);
        btnSearchForDelMemberRecord.setFocusable(false);
        btnSearchForDelMemberRecord.setRequestFocusEnabled(false);
        btnSearchForDelMemberRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchForDelMemberRecordActionPerformed(evt);
            }
        });

        txtSearchBarForBookReciveRecord.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtSearchBarForBookReciveRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchBarForBookReciveRecordMouseClicked(evt);
            }
        });

        btnSearchForDelBookReciveRecord.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSearchForDelBookReciveRecord.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchForDelBookReciveRecord.setText("Search");
        btnSearchForDelBookReciveRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchForDelBookReciveRecord.setContentAreaFilled(false);
        btnSearchForDelBookReciveRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchForDelBookReciveRecord.setFocusPainted(false);
        btnSearchForDelBookReciveRecord.setFocusable(false);
        btnSearchForDelBookReciveRecord.setRequestFocusEnabled(false);
        btnSearchForDelBookReciveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchForDelBookReciveRecordActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(153, 153, 153));
        jLabel88.setText("| Search record, using ISSN no.");

        btnDeleteSeltBookRecord.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        btnDeleteSeltBookRecord.setForeground(new java.awt.Color(255, 0, 51));
        btnDeleteSeltBookRecord.setText("[ Delete Seleceted Record ?? ]");
        btnDeleteSeltBookRecord.setBorder(null);
        btnDeleteSeltBookRecord.setContentAreaFilled(false);
        btnDeleteSeltBookRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteSeltBookRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSeltBookRecordActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(153, 153, 153));
        jLabel89.setText("| Search record, using Member Code no.");

        btnDeleteSeltMemberRecord.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        btnDeleteSeltMemberRecord.setForeground(new java.awt.Color(255, 0, 51));
        btnDeleteSeltMemberRecord.setText("[ Delete Seleceted Record ?? ]");
        btnDeleteSeltMemberRecord.setBorder(null);
        btnDeleteSeltMemberRecord.setContentAreaFilled(false);
        btnDeleteSeltMemberRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteSeltMemberRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSeltMemberRecordActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(153, 153, 153));
        jLabel90.setText("| Search record, using Member Code no.");

        jLabel91.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(153, 153, 153));
        jLabel91.setText("| Search record, using author name.");

        txtSearchBarForAuthorRecord.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtSearchBarForAuthorRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchBarForAuthorRecordMouseClicked(evt);
            }
        });

        btnDeleteSeltBookReciveRecord.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        btnDeleteSeltBookReciveRecord.setForeground(new java.awt.Color(255, 0, 51));
        btnDeleteSeltBookReciveRecord.setText("[ Delete Seleceted Record ?? ]");
        btnDeleteSeltBookReciveRecord.setBorder(null);
        btnDeleteSeltBookReciveRecord.setContentAreaFilled(false);
        btnDeleteSeltBookReciveRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteSeltBookReciveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSeltBookReciveRecordActionPerformed(evt);
            }
        });

        btnSearchAuthorRecordForDlt.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSearchAuthorRecordForDlt.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchAuthorRecordForDlt.setText("Search");
        btnSearchAuthorRecordForDlt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchAuthorRecordForDlt.setContentAreaFilled(false);
        btnSearchAuthorRecordForDlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchAuthorRecordForDlt.setFocusPainted(false);
        btnSearchAuthorRecordForDlt.setFocusable(false);
        btnSearchAuthorRecordForDlt.setRequestFocusEnabled(false);
        btnSearchAuthorRecordForDlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAuthorRecordForDltActionPerformed(evt);
            }
        });

        btnDeleteAuthorRecord.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        btnDeleteAuthorRecord.setForeground(new java.awt.Color(255, 0, 51));
        btnDeleteAuthorRecord.setText("[ Delete Seleceted Record ?? ]");
        btnDeleteAuthorRecord.setBorder(null);
        btnDeleteAuthorRecord.setContentAreaFilled(false);
        btnDeleteAuthorRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteAuthorRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAuthorRecordActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(153, 153, 153));
        jLabel92.setText("| Search record, using publisher name.");

        txtSearchBarForPublisherRecord.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtSearchBarForPublisherRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchBarForPublisherRecordMouseClicked(evt);
            }
        });

        btnSearchPublisharRecordForDel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSearchPublisharRecordForDel.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchPublisharRecordForDel.setText("Search");
        btnSearchPublisharRecordForDel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchPublisharRecordForDel.setContentAreaFilled(false);
        btnSearchPublisharRecordForDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchPublisharRecordForDel.setFocusPainted(false);
        btnSearchPublisharRecordForDel.setFocusable(false);
        btnSearchPublisharRecordForDel.setRequestFocusEnabled(false);
        btnSearchPublisharRecordForDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPublisharRecordForDelActionPerformed(evt);
            }
        });

        btnDeleteSeltPublisherRecord.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        btnDeleteSeltPublisherRecord.setForeground(new java.awt.Color(255, 0, 51));
        btnDeleteSeltPublisherRecord.setText("[ Delete Seleceted Record ?? ]");
        btnDeleteSeltPublisherRecord.setBorder(null);
        btnDeleteSeltPublisherRecord.setContentAreaFilled(false);
        btnDeleteSeltPublisherRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteSeltPublisherRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSeltPublisherRecordActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(102, 102, 102));
        jLabel93.setText("| Delete Edition Record.....>>");

        txtSearchBarForEditionRecord.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtSearchBarForEditionRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchBarForEditionRecordMouseClicked(evt);
            }
        });

        btnSearchEditionRecordForDel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSearchEditionRecordForDel.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchEditionRecordForDel.setText("Search");
        btnSearchEditionRecordForDel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchEditionRecordForDel.setContentAreaFilled(false);
        btnSearchEditionRecordForDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchEditionRecordForDel.setFocusPainted(false);
        btnSearchEditionRecordForDel.setFocusable(false);
        btnSearchEditionRecordForDel.setRequestFocusEnabled(false);
        btnSearchEditionRecordForDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEditionRecordForDelActionPerformed(evt);
            }
        });

        tblDisplayEditionRecordForDel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        tblDisplayEditionRecordForDel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tblDisplayEditionRecordForDel.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayEditionRecordForDel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Edition Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayEditionRecordForDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayEditionRecordForDel.setFillsViewportHeight(true);
        tblDisplayEditionRecordForDel.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayEditionRecordForDel.setIntercellSpacing(new java.awt.Dimension(50, 10));
        tblDisplayEditionRecordForDel.setRowHeight(60);
        tblDisplayEditionRecordForDel.setShowVerticalLines(false);
        jScrollPane23.setViewportView(tblDisplayEditionRecordForDel);
        tblDisplayEditionRecordForDel.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblDisplayEditionRecordForDel.getColumnModel().getColumnCount() > 0) {
            tblDisplayEditionRecordForDel.getColumnModel().getColumn(0).setResizable(false);
        }

        btnDeleteSeltEditionRecord.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        btnDeleteSeltEditionRecord.setForeground(new java.awt.Color(255, 0, 51));
        btnDeleteSeltEditionRecord.setText("[ Delete Seleceted Record ?? ]");
        btnDeleteSeltEditionRecord.setBorder(null);
        btnDeleteSeltEditionRecord.setContentAreaFilled(false);
        btnDeleteSeltEditionRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteSeltEditionRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSeltEditionRecordActionPerformed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(153, 153, 153));
        jLabel94.setText("| Search record, using catagory name.");

        txtSearchBarForCatagoryRecord.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtSearchBarForCatagoryRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchBarForCatagoryRecordMouseClicked(evt);
            }
        });

        tblDisplayCatagoryRecordForDel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        tblDisplayCatagoryRecordForDel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        tblDisplayCatagoryRecordForDel.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayCatagoryRecordForDel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayCatagoryRecordForDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayCatagoryRecordForDel.setFillsViewportHeight(true);
        tblDisplayCatagoryRecordForDel.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayCatagoryRecordForDel.setIntercellSpacing(new java.awt.Dimension(50, 10));
        tblDisplayCatagoryRecordForDel.setRowHeight(60);
        tblDisplayCatagoryRecordForDel.setShowVerticalLines(false);
        jScrollPane24.setViewportView(tblDisplayCatagoryRecordForDel);
        tblDisplayCatagoryRecordForDel.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblDisplayCatagoryRecordForDel.getColumnModel().getColumnCount() > 0) {
            tblDisplayCatagoryRecordForDel.getColumnModel().getColumn(0).setResizable(false);
        }

        btnDeleteSeltCatagoryRecord.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        btnDeleteSeltCatagoryRecord.setForeground(new java.awt.Color(255, 0, 51));
        btnDeleteSeltCatagoryRecord.setText("[ Delete Seleceted Record ?? ]");
        btnDeleteSeltCatagoryRecord.setBorder(null);
        btnDeleteSeltCatagoryRecord.setContentAreaFilled(false);
        btnDeleteSeltCatagoryRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteSeltCatagoryRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSeltCatagoryRecordActionPerformed(evt);
            }
        });

        btnSearchCatagoryRecordForDel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSearchCatagoryRecordForDel.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchCatagoryRecordForDel.setText("Search");
        btnSearchCatagoryRecordForDel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchCatagoryRecordForDel.setContentAreaFilled(false);
        btnSearchCatagoryRecordForDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchCatagoryRecordForDel.setFocusPainted(false);
        btnSearchCatagoryRecordForDel.setFocusable(false);
        btnSearchCatagoryRecordForDel.setRequestFocusEnabled(false);
        btnSearchCatagoryRecordForDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCatagoryRecordForDelActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 153, 204));
        jLabel73.setText("| Good friends, good books, and a sleepy conscience: this is the ideal life.     .....Mark Twain");

        jLabel97.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(153, 153, 153));
        jLabel97.setText("| Search record, using Edition Name.");

        jLabel100.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(102, 102, 102));
        jLabel100.setText("| Delete Book Record.....>>");

        jLabel103.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(102, 102, 102));
        jLabel103.setText("| Delete Member Record.....>>");

        jLabel105.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(102, 102, 102));
        jLabel105.setText("| Delete Book Recive Record.....>>");

        jLabel122.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(102, 102, 102));
        jLabel122.setText("| Delete Author Record.....>>");

        jLabel123.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(102, 102, 102));
        jLabel123.setText("| Delete Publisher Record.....>>");

        jLabel124.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(102, 102, 102));
        jLabel124.setText("| Delete Catagory Record.....>>");

        jLabel125.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(153, 153, 153));
        jLabel125.setText("| first select row, then click [ Delete Seleceted Record ?? ] button.");

        jLabel126.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(153, 153, 153));
        jLabel126.setText("| first select row, then click [ Delete Seleceted Record ?? ] button.");

        jLabel127.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(153, 153, 153));
        jLabel127.setText("| first select row, then click [ Delete Seleceted Record ?? ] button.");

        jLabel128.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(153, 153, 153));
        jLabel128.setText("| first select row, then click [ Delete Seleceted Record ?? ] button.");

        jLabel129.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(153, 153, 153));
        jLabel129.setText("| first select row, then click [ Delete Seleceted Record ?? ] button.");

        jLabel130.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(153, 153, 153));
        jLabel130.setText("| first select row, then click [ Delete Seleceted Record ?? ] button.");

        jLabel142.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(153, 153, 153));
        jLabel142.setText("| first select row, then click [ Delete Seleceted Record ?? ] button.");

        javax.swing.GroupLayout subPanDeleteRecordLayout = new javax.swing.GroupLayout(subPanDeleteRecord);
        subPanDeleteRecord.setLayout(subPanDeleteRecordLayout);
        subPanDeleteRecordLayout.setHorizontalGroup(
            subPanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanDeleteRecordLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(subPanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel142)
                    .addComponent(jLabel130)
                    .addComponent(jLabel129)
                    .addComponent(jLabel128)
                    .addComponent(jLabel127)
                    .addComponent(jLabel126)
                    .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(btnDeleteSeltCatagoryRecord)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subPanDeleteRecordLayout.createSequentialGroup()
                        .addComponent(txtSearchBarForCatagoryRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchCatagoryRecordForDel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDeleteSeltEditionRecord)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subPanDeleteRecordLayout.createSequentialGroup()
                        .addComponent(txtSearchBarForEditionRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchEditionRecordForDel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDeleteSeltPublisherRecord)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subPanDeleteRecordLayout.createSequentialGroup()
                        .addComponent(txtSearchBarForPublisherRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchPublisharRecordForDel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDeleteAuthorRecord)
                    .addComponent(btnDeleteSeltBookReciveRecord)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteSeltMemberRecord)
                    .addComponent(btnDeleteSeltBookRecord)
                    .addGroup(subPanDeleteRecordLayout.createSequentialGroup()
                        .addComponent(txtSearchBarForDltBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchForDltBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanDeleteRecordLayout.createSequentialGroup()
                        .addComponent(txtSearchBarForDelMemberRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchForDelMemberRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanDeleteRecordLayout.createSequentialGroup()
                        .addComponent(txtSearchBarForBookReciveRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchForDelBookReciveRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanDeleteRecordLayout.createSequentialGroup()
                        .addComponent(txtSearchBarForAuthorRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchAuthorRecordForDlt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel83)
                    .addComponent(jLabel125)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                    .addComponent(jScrollPane15)
                    .addComponent(jScrollPane14)
                    .addComponent(jScrollPane18)
                    .addComponent(jScrollPane17)
                    .addComponent(jScrollPane16)
                    .addComponent(jScrollPane24))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        subPanDeleteRecordLayout.setVerticalGroup(
            subPanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanDeleteRecordLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchBarForDltBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchForDltBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteSeltBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(subPanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchBarForDelMemberRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchForDelMemberRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteSeltMemberRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(subPanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchBarForBookReciveRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchForDelBookReciveRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteSeltBookReciveRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(subPanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchBarForAuthorRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchAuthorRecordForDlt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteAuthorRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchBarForPublisherRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchPublisharRecordForDel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteSeltPublisherRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchBarForEditionRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchEditionRecordForDel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteSeltEditionRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchBarForCatagoryRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchCatagoryRecordForDel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteSeltCatagoryRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        scPanDeleteRecord.setViewportView(subPanDeleteRecord);

        javax.swing.GroupLayout jpanDeleteRecordLayout = new javax.swing.GroupLayout(jpanDeleteRecord);
        jpanDeleteRecord.setLayout(jpanDeleteRecordLayout);
        jpanDeleteRecordLayout.setHorizontalGroup(
            jpanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanDeleteRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanDeleteRecordLayout.setVerticalGroup(
            jpanDeleteRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanDeleteRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpanSearchRecord.setBackground(new java.awt.Color(204, 204, 204));
        jpanSearchRecord.setPreferredSize(new java.awt.Dimension(996, 683));

        scPanSearchRecord.setBorder(null);
        scPanSearchRecord.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scPanSearchRecord.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scPanSearchRecord.setPreferredSize(new java.awt.Dimension(996, 678));
        scPanSearchRecord.setVerticalScrollBar(searchPanelScrolBar);

        subPanSearchRecord.setBackground(new java.awt.Color(255, 255, 255));
        subPanSearchRecord.setPreferredSize(new java.awt.Dimension(1161, 2500));

        jLabel96.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(51, 51, 51));
        jLabel96.setText("|  Search All Record");

        jLabel98.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(102, 102, 102));
        jLabel98.setText("| Search Book Record.....>>");

        txtBookRecordSearchBar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtBookRecordSearchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBookRecordSearchBarMouseClicked(evt);
            }
        });

        tblDisplayBookRecordInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayBookRecordInSearchPan.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayBookRecordInSearchPan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Name", "Book Code", "Author Name", "Publisher Name", "Edition", "Unit Price", "Qty", "Total Price", "Rack No", "Issn No", "Category", "Purchase Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayBookRecordInSearchPan.setColumnSelectionAllowed(true);
        tblDisplayBookRecordInSearchPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayBookRecordInSearchPan.setFillsViewportHeight(true);
        tblDisplayBookRecordInSearchPan.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayBookRecordInSearchPan.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tblDisplayBookRecordInSearchPan.setRowHeight(40);
        tblDisplayBookRecordInSearchPan.setShowVerticalLines(false);
        jScrollPane26.setViewportView(tblDisplayBookRecordInSearchPan);
        tblDisplayBookRecordInSearchPan.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel99.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(102, 102, 102));
        jLabel99.setText("| Search Member Record.....>>");

        txtMemberRecordSearchBar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtMemberRecordSearchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMemberRecordSearchBarMouseClicked(evt);
            }
        });

        tblDisplayMemberRecordInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayMemberRecordInSearchPan.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayMemberRecordInSearchPan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member Name", "Member Id", "Mobile Number", "Email", "House No", "Road No", "Block/Village", "Thana", "District", "Division"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayMemberRecordInSearchPan.setColumnSelectionAllowed(true);
        tblDisplayMemberRecordInSearchPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayMemberRecordInSearchPan.setFillsViewportHeight(true);
        tblDisplayMemberRecordInSearchPan.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayMemberRecordInSearchPan.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tblDisplayMemberRecordInSearchPan.setRowHeight(40);
        tblDisplayMemberRecordInSearchPan.setShowVerticalLines(false);
        jScrollPane27.setViewportView(tblDisplayMemberRecordInSearchPan);
        tblDisplayMemberRecordInSearchPan.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        txtBookReciveRecordInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtBookReciveRecordInSearchPan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBookReciveRecordInSearchPanMouseClicked(evt);
            }
        });

        tblDisplayBookReciveRecordInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayBookReciveRecordInSearchPan.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayBookReciveRecordInSearchPan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book ID", "Member ID", "Submit Date", "Qty", "Submit BY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayBookReciveRecordInSearchPan.setColumnSelectionAllowed(true);
        tblDisplayBookReciveRecordInSearchPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayBookReciveRecordInSearchPan.setFillsViewportHeight(true);
        tblDisplayBookReciveRecordInSearchPan.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayBookReciveRecordInSearchPan.setIntercellSpacing(new java.awt.Dimension(50, 10));
        tblDisplayBookReciveRecordInSearchPan.setRowHeight(60);
        tblDisplayBookReciveRecordInSearchPan.setShowVerticalLines(false);
        jScrollPane28.setViewportView(tblDisplayBookReciveRecordInSearchPan);
        tblDisplayBookReciveRecordInSearchPan.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel101.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(102, 102, 102));
        jLabel101.setText("| Search ISSUE Book Record.....>>");

        txtIssueBookSearchBar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtIssueBookSearchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIssueBookSearchBarMouseClicked(evt);
            }
        });

        tblDisplayIssueBookInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayIssueBookInSearchPan.setForeground(new java.awt.Color(51, 153, 255));
        tblDisplayIssueBookInSearchPan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book ID", "Member ID", "Issue Date", "Expt Date", "Return Date", "Qty", "About"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayIssueBookInSearchPan.setColumnSelectionAllowed(true);
        tblDisplayIssueBookInSearchPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayIssueBookInSearchPan.setFillsViewportHeight(true);
        tblDisplayIssueBookInSearchPan.setGridColor(new java.awt.Color(204, 204, 255));
        tblDisplayIssueBookInSearchPan.setIntercellSpacing(new java.awt.Dimension(50, 10));
        tblDisplayIssueBookInSearchPan.setRowHeight(60);
        tblDisplayIssueBookInSearchPan.setShowVerticalLines(false);
        jScrollPane29.setViewportView(tblDisplayIssueBookInSearchPan);
        tblDisplayIssueBookInSearchPan.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        radioBtnIssnNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnIssnNo);
        radioBtnIssnNo.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnIssnNo.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnIssnNo.setText("ISSN No");
        radioBtnIssnNo.setContentAreaFilled(false);

        jLabel102.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(153, 153, 153));
        jLabel102.setText("| Search book record, Select redio button and give value in search bar.");

        radioBtnBookCode.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnBookCode);
        radioBtnBookCode.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnBookCode.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnBookCode.setText("Book Code");
        radioBtnBookCode.setContentAreaFilled(false);

        radioBtnRackNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnRackNo);
        radioBtnRackNo.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnRackNo.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnRackNo.setText("Rack No");
        radioBtnRackNo.setContentAreaFilled(false);

        radioBtnSelectCategory.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnSelectCategory);
        radioBtnSelectCategory.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnSelectCategory.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnSelectCategory.setText("Select Category");
        radioBtnSelectCategory.setContentAreaFilled(false);

        radioBtnSelectPurchaseDate.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnSelectPurchaseDate);
        radioBtnSelectPurchaseDate.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnSelectPurchaseDate.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnSelectPurchaseDate.setText("Select Purchase date");
        radioBtnSelectPurchaseDate.setContentAreaFilled(false);

        comboCategoryListForSearchBookRecord.setEditable(true);
        comboCategoryListForSearchBookRecord.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboCategoryListForSearchBookRecord.setForeground(new java.awt.Color(102, 102, 102));
        comboCategoryListForSearchBookRecord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        comboCategoryListForSearchBookRecord.setFocusable(false);
        comboCategoryListForSearchBookRecord.setVerifyInputWhenFocusTarget(false);
        comboCategoryListForSearchBookRecord.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCategoryListForSearchBookRecordItemStateChanged(evt);
            }
        });

        comboDayForBookRecordInSearchPan.setEditable(true);
        comboDayForBookRecordInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboDayForBookRecordInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboDayForBookRecordInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        comboMonthForBookRecordInSearchPan.setEditable(true);
        comboMonthForBookRecordInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboMonthForBookRecordInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboMonthForBookRecordInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "DecemBer" }));

        comboYearForBookRecordInSearchPan.setEditable(true);
        comboYearForBookRecordInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboYearForBookRecordInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboYearForBookRecordInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2015", "2016", "2017", "2018", "2019", "2020" }));

        btnSeachBookRecordInSearchPan.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSeachBookRecordInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        btnSeachBookRecordInSearchPan.setText("Search");
        btnSeachBookRecordInSearchPan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSeachBookRecordInSearchPan.setContentAreaFilled(false);
        btnSeachBookRecordInSearchPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeachBookRecordInSearchPan.setFocusPainted(false);
        btnSeachBookRecordInSearchPan.setFocusable(false);
        btnSeachBookRecordInSearchPan.setRequestFocusEnabled(false);
        btnSeachBookRecordInSearchPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachBookRecordInSearchPanActionPerformed(evt);
            }
        });

        radioBtnMemberId.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnMemberId);
        radioBtnMemberId.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnMemberId.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnMemberId.setText("Member ID");
        radioBtnMemberId.setContentAreaFilled(false);

        radioBtnMemberName.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnMemberName);
        radioBtnMemberName.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnMemberName.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnMemberName.setText("Member Name");
        radioBtnMemberName.setContentAreaFilled(false);

        radioBtnSelectThana.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnSelectThana);
        radioBtnSelectThana.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnSelectThana.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnSelectThana.setText("Select Thana");
        radioBtnSelectThana.setContentAreaFilled(false);

        comboMemberThanaInSearchPan.setEditable(true);
        comboMemberThanaInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboMemberThanaInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboMemberThanaInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select thana" }));
        comboMemberThanaInSearchPan.setFocusable(false);
        comboMemberThanaInSearchPan.setVerifyInputWhenFocusTarget(false);
        comboMemberThanaInSearchPan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMemberThanaInSearchPanItemStateChanged(evt);
            }
        });

        btnSearchemberRecordInSearchPan.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSearchemberRecordInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchemberRecordInSearchPan.setText("Search");
        btnSearchemberRecordInSearchPan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchemberRecordInSearchPan.setContentAreaFilled(false);
        btnSearchemberRecordInSearchPan.setFocusPainted(false);
        btnSearchemberRecordInSearchPan.setFocusable(false);
        btnSearchemberRecordInSearchPan.setRequestFocusEnabled(false);
        btnSearchemberRecordInSearchPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchemberRecordInSearchPanActionPerformed(evt);
            }
        });

        radioBtnSelectSubmintLibrarian.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnSelectSubmintLibrarian);
        radioBtnSelectSubmintLibrarian.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnSelectSubmintLibrarian.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnSelectSubmintLibrarian.setText("Select submit librarian");
        radioBtnSelectSubmintLibrarian.setContentAreaFilled(false);

        jLabel104.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(102, 102, 102));
        jLabel104.setText("| Search Book Recive Record.....>>");

        radioBtnSelectSubmitDate.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnSelectSubmitDate);
        radioBtnSelectSubmitDate.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnSelectSubmitDate.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnSelectSubmitDate.setText("Select submit date");
        radioBtnSelectSubmitDate.setContentAreaFilled(false);

        cobmoCategoryInSearchPan.setEditable(true);
        cobmoCategoryInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        cobmoCategoryInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        cobmoCategoryInSearchPan.setFocusable(false);
        cobmoCategoryInSearchPan.setVerifyInputWhenFocusTarget(false);
        cobmoCategoryInSearchPan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cobmoCategoryInSearchPanItemStateChanged(evt);
            }
        });

        comboDayForBookReciveInSearchPan.setEditable(true);
        comboDayForBookReciveInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboDayForBookReciveInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboDayForBookReciveInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        comboMonthForBookReciveInSearchPan.setEditable(true);
        comboMonthForBookReciveInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboMonthForBookReciveInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboMonthForBookReciveInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "DecemBer" }));

        comboYearForBookReciveInSearchPan.setEditable(true);
        comboYearForBookReciveInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboYearForBookReciveInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboYearForBookReciveInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2015", "2016", "2017", "2018", "2019", "2020" }));

        btnSearchBookReciveRecordInSearchPan.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSearchBookReciveRecordInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchBookReciveRecordInSearchPan.setText("Search");
        btnSearchBookReciveRecordInSearchPan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchBookReciveRecordInSearchPan.setContentAreaFilled(false);
        btnSearchBookReciveRecordInSearchPan.setFocusPainted(false);
        btnSearchBookReciveRecordInSearchPan.setFocusable(false);
        btnSearchBookReciveRecordInSearchPan.setRequestFocusEnabled(false);
        btnSearchBookReciveRecordInSearchPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookReciveRecordInSearchPanActionPerformed(evt);
            }
        });

        comboIssueYearForIssueBookInSearchPan.setEditable(true);
        comboIssueYearForIssueBookInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboIssueYearForIssueBookInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboIssueYearForIssueBookInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2015", "2016", "2017", "2018", "2019", "2020" }));

        comboIssueMonthForIssueBookInSearchPan.setEditable(true);
        comboIssueMonthForIssueBookInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboIssueMonthForIssueBookInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboIssueMonthForIssueBookInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "DecemBer" }));

        comboIssueDayForIssuBookInSearchPan.setEditable(true);
        comboIssueDayForIssuBookInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboIssueDayForIssuBookInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboIssueDayForIssuBookInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        redioBtnSelectIssueDateForSearchBookReciveRecord.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(redioBtnSelectIssueDateForSearchBookReciveRecord);
        redioBtnSelectIssueDateForSearchBookReciveRecord.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        redioBtnSelectIssueDateForSearchBookReciveRecord.setForeground(new java.awt.Color(255, 102, 102));
        redioBtnSelectIssueDateForSearchBookReciveRecord.setText("Select issue date");
        redioBtnSelectIssueDateForSearchBookReciveRecord.setContentAreaFilled(false);

        radioBtnSelecteReturnDateForSearchIssueRecord.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnSelecteReturnDateForSearchIssueRecord);
        radioBtnSelecteReturnDateForSearchIssueRecord.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnSelecteReturnDateForSearchIssueRecord.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnSelecteReturnDateForSearchIssueRecord.setText("Select return date");
        radioBtnSelecteReturnDateForSearchIssueRecord.setContentAreaFilled(false);

        comboReturnDayForIssueBookInSearchPan.setEditable(true);
        comboReturnDayForIssueBookInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboReturnDayForIssueBookInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboReturnDayForIssueBookInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        combooReturnMonthForIssueBookInSearchPan.setEditable(true);
        combooReturnMonthForIssueBookInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        combooReturnMonthForIssueBookInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        combooReturnMonthForIssueBookInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        comboReturnYearForIssueBookInSearchPan.setEditable(true);
        comboReturnYearForIssueBookInSearchPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        comboReturnYearForIssueBookInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        comboReturnYearForIssueBookInSearchPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2015", "2016", "2017", "2018", "2019", "2020" }));

        btnSearchBookIssueInSearchPan.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSearchBookIssueInSearchPan.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchBookIssueInSearchPan.setText("Search");
        btnSearchBookIssueInSearchPan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchBookIssueInSearchPan.setContentAreaFilled(false);
        btnSearchBookIssueInSearchPan.setFocusPainted(false);
        btnSearchBookIssueInSearchPan.setFocusable(false);
        btnSearchBookIssueInSearchPan.setRequestFocusEnabled(false);
        btnSearchBookIssueInSearchPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookIssueInSearchPanActionPerformed(evt);
            }
        });

        radioBtnSelecMemberId.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupForSearchPanel.add(radioBtnSelecMemberId);
        radioBtnSelecMemberId.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        radioBtnSelecMemberId.setForeground(new java.awt.Color(255, 102, 102));
        radioBtnSelecMemberId.setText("Member ID");
        radioBtnSelecMemberId.setContentAreaFilled(false);

        btnClearSearchRecord4.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        btnClearSearchRecord4.setForeground(new java.awt.Color(0, 153, 204));
        btnClearSearchRecord4.setText("| CLEAR |");
        btnClearSearchRecord4.setBorder(null);
        btnClearSearchRecord4.setContentAreaFilled(false);
        btnClearSearchRecord4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearSearchRecord4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearSearchRecord4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearSearchRecord4MouseExited(evt);
            }
        });
        btnClearSearchRecord4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSearchRecord4ActionPerformed(evt);
            }
        });

        btnClearSearchRecord3.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        btnClearSearchRecord3.setForeground(new java.awt.Color(0, 153, 204));
        btnClearSearchRecord3.setText("| CLEAR |");
        btnClearSearchRecord3.setBorder(null);
        btnClearSearchRecord3.setContentAreaFilled(false);
        btnClearSearchRecord3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearSearchRecord3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearSearchRecord3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearSearchRecord3MouseExited(evt);
            }
        });
        btnClearSearchRecord3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSearchRecord3ActionPerformed(evt);
            }
        });

        btnClearSearchRecord1.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        btnClearSearchRecord1.setForeground(new java.awt.Color(0, 153, 204));
        btnClearSearchRecord1.setText("| CLEAR |");
        btnClearSearchRecord1.setBorder(null);
        btnClearSearchRecord1.setContentAreaFilled(false);
        btnClearSearchRecord1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearSearchRecord1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearSearchRecord1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearSearchRecord1MouseExited(evt);
            }
        });
        btnClearSearchRecord1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSearchRecord1ActionPerformed(evt);
            }
        });

        btnClearSearchRecord2.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        btnClearSearchRecord2.setForeground(new java.awt.Color(0, 153, 204));
        btnClearSearchRecord2.setText("| CLEAR |");
        btnClearSearchRecord2.setBorder(null);
        btnClearSearchRecord2.setContentAreaFilled(false);
        btnClearSearchRecord2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearSearchRecord2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearSearchRecord2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearSearchRecord2MouseExited(evt);
            }
        });
        btnClearSearchRecord2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSearchRecord2ActionPerformed(evt);
            }
        });

        lblShowMsgForSearchBookRecord.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        lblShowMsgForSearchBookRecord.setForeground(new java.awt.Color(51, 153, 255));

        lblShowMsgForSearchMemberRecord.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        lblShowMsgForSearchMemberRecord.setForeground(new java.awt.Color(51, 153, 255));

        lblShowMsgForSearchBookReciveRecord.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        lblShowMsgForSearchBookReciveRecord.setForeground(new java.awt.Color(51, 153, 255));

        lblShowMsgForSearchIssueBookRecord.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        lblShowMsgForSearchIssueBookRecord.setForeground(new java.awt.Color(51, 153, 255));

        jLabel74.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 153, 204));
        jLabel74.setText("| So many BOOKS, So little time.      ......Frank Zappa");

        jLabel119.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(153, 153, 153));
        jLabel119.setText("| Search member record, Select redio button and give value in search bar.");

        jLabel120.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(153, 153, 153));
        jLabel120.setText("| Search book recive record, Select redio button and give value in search bar.");

        jLabel121.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(153, 153, 153));
        jLabel121.setText("| Search book issue record, Select redio button and give value in search bar.");

        javax.swing.GroupLayout subPanSearchRecordLayout = new javax.swing.GroupLayout(subPanSearchRecord);
        subPanSearchRecord.setLayout(subPanSearchRecordLayout);
        subPanSearchRecordLayout.setHorizontalGroup(
            subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane26)
                    .addComponent(jScrollPane27)
                    .addComponent(jScrollPane28)
                    .addComponent(jScrollPane29)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanSearchRecordLayout.createSequentialGroup()
                        .addComponent(redioBtnSelectIssueDateForSearchBookReciveRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboIssueDayForIssuBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboIssueMonthForIssueBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboIssueYearForIssueBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(649, 649, 649))
                    .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                        .addComponent(txtIssueBookSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchBookIssueInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearSearchRecord4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                        .addComponent(txtBookRecordSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSeachBookRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearSearchRecord1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                        .addComponent(txtBookReciveRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchBookReciveRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearSearchRecord3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                        .addComponent(txtMemberRecordSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchemberRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearSearchRecord2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                        .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel121)
                            .addComponent(jLabel120)
                            .addComponent(jLabel119)
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowMsgForSearchIssueBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowMsgForSearchBookReciveRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowMsgForSearchMemberRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowMsgForSearchBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioBtnBookCode)
                                    .addComponent(radioBtnRackNo)
                                    .addComponent(radioBtnIssnNo))
                                .addGap(50, 50, 50)
                                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(radioBtnSelectPurchaseDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioBtnSelectCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                                        .addComponent(comboDayForBookRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboMonthForBookRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(comboYearForBookRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(comboCategoryListForSearchBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                                .addComponent(radioBtnSelecteReturnDateForSearchIssueRecord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboReturnDayForIssueBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combooReturnMonthForIssueBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboReturnYearForIssueBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(radioBtnMemberId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioBtnMemberName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addComponent(radioBtnSelectThana)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMemberThanaInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radioBtnSelecMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioBtnSelectSubmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioBtnSelectSubmintLibrarian))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(subPanSearchRecordLayout.createSequentialGroup()
                                        .addComponent(comboDayForBookReciveInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboMonthForBookReciveInSearchPan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboYearForBookReciveInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cobmoCategoryInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel102)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        subPanSearchRecordLayout.setVerticalGroup(
            subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanSearchRecordLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnBookCode)
                    .addComponent(radioBtnSelectCategory)
                    .addComponent(comboCategoryListForSearchBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioBtnSelectPurchaseDate)
                    .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboDayForBookRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboMonthForBookRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboYearForBookRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radioBtnIssnNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnRackNo)
                .addGap(10, 10, 10)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookRecordSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeachBookRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearSearchRecord1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblShowMsgForSearchBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnMemberId)
                    .addComponent(radioBtnSelectThana)
                    .addComponent(comboMemberThanaInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnMemberName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemberRecordSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchemberRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearSearchRecord2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblShowMsgForSearchMemberRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(radioBtnSelecMemberId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cobmoCategoryInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnSelectSubmintLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnSelectSubmitDate)
                    .addComponent(comboDayForBookReciveInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMonthForBookReciveInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboYearForBookReciveInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookReciveRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchBookReciveRecordInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearSearchRecord3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblShowMsgForSearchBookReciveRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redioBtnSelectIssueDateForSearchBookReciveRecord)
                    .addComponent(comboIssueDayForIssuBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboIssueMonthForIssueBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboIssueYearForIssueBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnSelecteReturnDateForSearchIssueRecord)
                    .addComponent(comboReturnDayForIssueBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combooReturnMonthForIssueBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboReturnYearForIssueBookInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(subPanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIssueBookSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchBookIssueInSearchPan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearSearchRecord4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblShowMsgForSearchIssueBookRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        scPanSearchRecord.setViewportView(subPanSearchRecord);

        javax.swing.GroupLayout jpanSearchRecordLayout = new javax.swing.GroupLayout(jpanSearchRecord);
        jpanSearchRecord.setLayout(jpanSearchRecordLayout);
        jpanSearchRecordLayout.setHorizontalGroup(
            jpanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanSearchRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanSearchRecordLayout.setVerticalGroup(
            jpanSearchRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanSearchRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpanSuperUserInformation.setBackground(new java.awt.Color(0, 255, 0));
        jpanSuperUserInformation.setPreferredSize(new java.awt.Dimension(996, 683));

        scPanSuperUserInformation.setBorder(null);
        scPanSuperUserInformation.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scPanSuperUserInformation.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scPanSuperUserInformation.setPreferredSize(new java.awt.Dimension(996, 678));
        scPanSuperUserInformation.setVerticalScrollBar(superUserScrolBar);

        subPanSuperUserInformation.setBackground(new java.awt.Color(255, 255, 255));
        subPanSuperUserInformation.setPreferredSize(new java.awt.Dimension(1161, 970));

        jLabel86.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(51, 51, 51));
        jLabel86.setText("|  Super user information");

        jLabel75.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 153, 204));
        jLabel75.setText("| Jiddu Krishnamurti");

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(204, 0, 204));
        jTextArea6.setRows(5);
        jTextArea6.setText("\nThere is no end to education.\nIt is not that you read a book,\npass an examination, and finish\nwith education. The whole of life,\nfrom the moment you are born to the\nmoment you die, is a process of leraning.");
        jTextArea6.setMargin(new java.awt.Insets(5, 40, 5, 5));
        jScrollPane25.setViewportView(jTextArea6);

        jLabel109.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(51, 51, 51));
        jLabel109.setText("Address:");

        jLabel106.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(51, 51, 51));
        jLabel106.setText("Mobile Number:");

        jLabel95.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(51, 51, 51));
        jLabel95.setText("Email:");

        jLabel87.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(51, 51, 51));
        jLabel87.setText("Name:");

        jLabel107.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(51, 51, 51));
        jLabel107.setText("Post:");

        jLabel118.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 51, 0));
        jLabel118.setText("Student");

        jLabel108.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(51, 51, 51));
        jLabel108.setText("Institute:");

        jLabel117.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 51, 0));
        jLabel117.setText("01826995639");

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(204, 0, 204));
        jTextArea5.setRows(5);
        jTextArea5.setText("house no: 112\nroad no: fuler_naori road\nvillage: surikora\npost office: gunoboti\nthana: chddogram\njila: comilla\n");
        jTextArea5.setMargin(new java.awt.Insets(5, 20, 5, 5));
        jScrollPane22.setViewportView(jTextArea5);

        jLabel110.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 51, 0));
        jLabel110.setText("Institute Of Computer Since & Tecnology");

        jLabel112.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 51, 0));
        jLabel112.setText("Anik");

        jLabel113.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 51, 0));
        jLabel113.setText("paulanik112@gmail.com");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel107)
                        .addComponent(jLabel108)
                        .addComponent(jLabel95)
                        .addComponent(jLabel87)
                        .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel106)
                        .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel112)
                .addGap(23, 23, 23)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel117)
                .addGap(18, 18, 18)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel113)
                .addGap(18, 18, 18)
                .addComponent(jLabel108)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110)
                .addGap(18, 18, 18)
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel118)
                .addGap(56, 56, 56)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout subPanSuperUserInformationLayout = new javax.swing.GroupLayout(subPanSuperUserInformation);
        subPanSuperUserInformation.setLayout(subPanSuperUserInformationLayout);
        subPanSuperUserInformationLayout.setHorizontalGroup(
            subPanSuperUserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanSuperUserInformationLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(subPanSuperUserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75)
                    .addComponent(jLabel86)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(457, Short.MAX_VALUE))
        );
        subPanSuperUserInformationLayout.setVerticalGroup(
            subPanSuperUserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanSuperUserInformationLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        scPanSuperUserInformation.setViewportView(subPanSuperUserInformation);

        javax.swing.GroupLayout jpanSuperUserInformationLayout = new javax.swing.GroupLayout(jpanSuperUserInformation);
        jpanSuperUserInformation.setLayout(jpanSuperUserInformationLayout);
        jpanSuperUserInformationLayout.setHorizontalGroup(
            jpanSuperUserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanSuperUserInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanSuperUserInformationLayout.setVerticalGroup(
            jpanSuperUserInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanSuperUserInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpanShowAdminInformation.setBackground(new java.awt.Color(255, 51, 204));
        jpanShowAdminInformation.setPreferredSize(new java.awt.Dimension(996, 683));

        scPanShowAdminInformation.setBorder(null);
        scPanShowAdminInformation.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scPanShowAdminInformation.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scPanShowAdminInformation.setPreferredSize(new java.awt.Dimension(996, 678));
        scPanShowAdminInformation.setVerticalScrollBar(adminInfoDtlsScrolBar);

        subPanSowAdminInformation.setBackground(new java.awt.Color(255, 255, 255));
        subPanSowAdminInformation.setPreferredSize(new java.awt.Dimension(1161, 1400));

        jLabel116.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(51, 51, 51));
        jLabel116.setText("|  Create Librarian Account");

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        tblDisplayLibrarianAccountInAdminInfoPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblDisplayLibrarianAccountInAdminInfoPan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Librarian Name", "Librarian Card No", "Mobile No", "Email", "House No", "Road No", "Block/Village", "Thana", "District", "Division", "Shift"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayLibrarianAccountInAdminInfoPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDisplayLibrarianAccountInAdminInfoPan.setFillsViewportHeight(true);
        tblDisplayLibrarianAccountInAdminInfoPan.setShowHorizontalLines(false);
        tblDisplayLibrarianAccountInAdminInfoPan.setShowVerticalLines(false);
        tblDisplayLibrarianAccountInAdminInfoPan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayLibrarianAccountInAdminInfoPanMouseClicked(evt);
            }
        });
        jScrollPane30.setViewportView(tblDisplayLibrarianAccountInAdminInfoPan);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane30)
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane30, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "[ Delete Librarian Account ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SimSun", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        txtLibrarianAccountSearchBarInAdminPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        txtLibrarianAccountSearchBarInAdminPan.setForeground(new java.awt.Color(51, 51, 51));

        btnSearchLibrarianAccountInAdminPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        btnSearchLibrarianAccountInAdminPan.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchLibrarianAccountInAdminPan.setText("Search");
        btnSearchLibrarianAccountInAdminPan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        btnSearchLibrarianAccountInAdminPan.setContentAreaFilled(false);
        btnSearchLibrarianAccountInAdminPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchLibrarianAccountInAdminPan.setFocusable(false);
        btnSearchLibrarianAccountInAdminPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchLibrarianAccountInAdminPanActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        jLabel131.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(102, 102, 102));
        jLabel131.setText("Librarian Name:");

        jLabel132.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(102, 102, 102));
        jLabel132.setText("Librarian Code:");

        jLabel133.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(102, 102, 102));
        jLabel133.setText("Mobile No:");

        jLabel134.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(102, 102, 102));
        jLabel134.setText("Email:");

        lblShowLibrarianNameInAdminPan.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblShowLibrarianNameInAdminPan.setForeground(new java.awt.Color(0, 153, 102));

        lblShowLibrarianCodeNoInAdminPan.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblShowLibrarianCodeNoInAdminPan.setForeground(new java.awt.Color(0, 153, 102));

        lblShowLibrarianMobileNumberInAdminPan.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblShowLibrarianMobileNumberInAdminPan.setForeground(new java.awt.Color(0, 153, 102));

        jLabel135.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(102, 102, 102));
        jLabel135.setText("Address:");

        lblShowLibrarianEmailInAdminPan.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblShowLibrarianEmailInAdminPan.setForeground(new java.awt.Color(0, 153, 102));

        lblShowLibrarianAddressInAdminPan.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblShowLibrarianAddressInAdminPan.setForeground(new java.awt.Color(0, 153, 102));
        lblShowLibrarianAddressInAdminPan.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblShowDelLibrarianAccountPan1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        lblShowDelLibrarianAccountPan1.setForeground(new java.awt.Color(255, 51, 51));
        lblShowDelLibrarianAccountPan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel132)
                    .addComponent(jLabel131)
                    .addComponent(jLabel133)
                    .addComponent(jLabel134))
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(lblShowLibrarianNameInAdminPan, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblShowLibrarianCodeNoInAdminPan, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowLibrarianMobileNumberInAdminPan, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowLibrarianEmailInAdminPan, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblShowLibrarianAddressInAdminPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblShowDelLibrarianAccountPan1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShowLibrarianNameInAdminPan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowLibrarianCodeNoInAdminPan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowLibrarianMobileNumberInAdminPan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowLibrarianEmailInAdminPan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblShowLibrarianAddressInAdminPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblShowDelLibrarianAccountPan1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        jLabel136.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(51, 51, 51));
        jLabel136.setText(">> Search By Librarian Code NO: >>");

        btnClearDelShowAdminInfoPan.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        btnClearDelShowAdminInfoPan.setForeground(new java.awt.Color(0, 153, 204));
        btnClearDelShowAdminInfoPan.setText("| CLEAR |");
        btnClearDelShowAdminInfoPan.setBorder(null);
        btnClearDelShowAdminInfoPan.setContentAreaFilled(false);
        btnClearDelShowAdminInfoPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearDelShowAdminInfoPan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearDelShowAdminInfoPanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearDelShowAdminInfoPanMouseExited(evt);
            }
        });
        btnClearDelShowAdminInfoPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearDelShowAdminInfoPanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLibrarianAccountSearchBarInAdminPan, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchLibrarianAccountInAdminPan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(btnClearDelShowAdminInfoPan)))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLibrarianAccountSearchBarInAdminPan)
                    .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchLibrarianAccountInAdminPan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClearDelShowAdminInfoPan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jLabel137.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(51, 51, 51));
        jLabel137.setText("> Search Librarian Account: ");

        jLabel138.setFont(new java.awt.Font("SimSun", 0, 16)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(51, 51, 51));
        jLabel138.setText("* Search librarian account from database...");

        jLabel139.setFont(new java.awt.Font("SimSun", 0, 16)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(51, 51, 51));
        jLabel139.setText("* If you want search librarian record than,");

        jLabel140.setFont(new java.awt.Font("SimSun", 0, 16)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(51, 51, 51));
        jLabel140.setText(">> Search by Librarian CODE NO:");

        jLabel76.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 153, 204));
        jLabel76.setText("| A room without BOOKS is like a body without a soul.     ......Marcus Tullius Cicero");

        jLabel141.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(51, 51, 51));
        jLabel141.setText("> All Librarian Account: ");

        javax.swing.GroupLayout subPanSowAdminInformationLayout = new javax.swing.GroupLayout(subPanSowAdminInformation);
        subPanSowAdminInformation.setLayout(subPanSowAdminInformationLayout);
        subPanSowAdminInformationLayout.setHorizontalGroup(
            subPanSowAdminInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanSowAdminInformationLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(subPanSowAdminInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel141)
                    .addComponent(jLabel76)
                    .addGroup(subPanSowAdminInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel137)
                        .addGroup(subPanSowAdminInformationLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(subPanSowAdminInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel139)
                                .addComponent(jLabel138)
                                .addGroup(subPanSowAdminInformationLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel140))))
                        .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        subPanSowAdminInformationLayout.setVerticalGroup(
            subPanSowAdminInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanSowAdminInformationLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jLabel141)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jLabel137)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel138)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel140)
                .addGap(49, 49, 49)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        scPanShowAdminInformation.setViewportView(subPanSowAdminInformation);

        javax.swing.GroupLayout jpanShowAdminInformationLayout = new javax.swing.GroupLayout(jpanShowAdminInformation);
        jpanShowAdminInformation.setLayout(jpanShowAdminInformationLayout);
        jpanShowAdminInformationLayout.setHorizontalGroup(
            jpanShowAdminInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanShowAdminInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanShowAdminInformationLayout.setVerticalGroup(
            jpanShowAdminInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPanShowAdminInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpanAboutThis.setBackground(new java.awt.Color(0, 102, 255));
        jpanAboutThis.setPreferredSize(new java.awt.Dimension(996, 683));

        jPanel3.setBackground(new java.awt.Color(71, 144, 255));

        jPanel4.setBackground(new java.awt.Color(109, 167, 255));

        jPanel27.setBackground(new java.awt.Color(150, 192, 255));

        jPanel30.setBackground(new java.awt.Color(197, 220, 255));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel4.setText("About This ::");

        jLabel13.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel13.setText("Application Name:");

        jLabel14.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 102));
        jLabel14.setText("Library management system");

        jLabel77.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel77.setText("Release Date:");

        jLabel78.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 51, 102));
        jLabel78.setText("12-january-2018");

        jLabel79.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel79.setText("Version:");

        jLabel80.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 51, 102));
        jLabel80.setText("1.2.0");

        jLabel81.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel81.setText("Database:");

        jLabel82.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 51, 102));
        jLabel82.setText("/localhost");

        jLabel84.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel84.setText("System:");

        jLabel143.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 51, 102));
        jLabel143.setText("Windows 7/8/10 x86/x64; Cp3000-5000; en_US()");

        jLabel144.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel144.setText("Biuld Number:");

        jLabel145.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 51, 102));
        jLabel145.setText("0199735692305");

        jLabel146.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(102, 102, 0));
        jLabel146.setText("2017-18 All Rights Reserved. Library Management System");

        jLabel147.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(0, 204, 204));
        jLabel147.setText("Anik paul");

        jLabel148.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel148.setText("Student Name:");

        jLabel149.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(0, 204, 204));
        jLabel149.setText("Institute of computer since & technology");

        jLabel150.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel150.setText("Institute Name:");

        jLabel151.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel151.setText("Email:");

        jLabel152.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(0, 204, 204));
        jLabel152.setText("paulanik112@gmail.com");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4))
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel77)
                                    .addComponent(jLabel79)
                                    .addComponent(jLabel81)
                                    .addComponent(jLabel84)
                                    .addComponent(jLabel144)
                                    .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel150)
                                    .addComponent(jLabel151))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel80)
                                    .addComponent(jLabel82)
                                    .addComponent(jLabel143)
                                    .addComponent(jLabel145)
                                    .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel149)
                                    .addComponent(jLabel152))))
                        .addGap(0, 215, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel146)))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jLabel78))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpanAboutThisLayout = new javax.swing.GroupLayout(jpanAboutThis);
        jpanAboutThis.setLayout(jpanAboutThisLayout);
        jpanAboutThisLayout.setHorizontalGroup(
            jpanAboutThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanAboutThisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanAboutThisLayout.setVerticalGroup(
            jpanAboutThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanAboutThisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanLayout = new javax.swing.GroupLayout(mainPan);
        mainPan.setLayout(mainPanLayout);
        mainPanLayout.setHorizontalGroup(
            mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanBookAvaliCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanIssueBook, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanBookRecive, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanAddBookRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanAddMemberRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanCreateBookDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanDeleteRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanSearchRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanSuperUserInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanShowAdminInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanAboutThis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
        );
        mainPanLayout.setVerticalGroup(
            mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanBookAvaliCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanIssueBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanBookRecive, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanAddBookRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanAddMemberRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanCreateBookDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanDeleteRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanSearchRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanSuperUserInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanShowAdminInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(mainPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanAboutThis, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttomDownPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                    .addComponent(topUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(topUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttomDownPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPanDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPanDashboardMouseClicked
        // TODO add your handling code here: 
    }//GEN-LAST:event_btnPanDashboardMouseClicked

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        // TODO add your handling code here:

        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add sub panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        mainPan.add(jpanDashboard);
        mainPan.repaint();
        mainPan.revalidate();

        //<editor-fold defaultstate="collapsed" desc="change button_panel color on mouse click">
        btnPanDashboard.setBackground(new java.awt.Color(11, 77, 125));
        btnPanBookAvailCheck.setBackground(new java.awt.Color(2, 136, 187));
        btnPanIssueBook.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookRecive.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddBookRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddMemeberRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateOtherDetails.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDeleteAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateAdminAccount.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSuperUserInformation.setBackground(new java.awt.Color(2, 136, 187));
//</editor-fold>

    }//GEN-LAST:event_lblDashboardMouseClicked

    private void btnPanBookAvailCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPanBookAvailCheckMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPanBookAvailCheckMouseClicked

    private void btnPanIssueBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPanIssueBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPanIssueBookMouseClicked

    private void lblBookAvailCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookAvailCheckMouseClicked
        // TODO add your handling code here:

        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        mainPan.add(jpanBookAvaliCheck);
        mainPan.repaint();
        mainPan.revalidate();

        //<editor-fold defaultstate="collapsed" desc="change button_panel color on mouse click">
        btnPanBookAvailCheck.setBackground(new java.awt.Color(11, 77, 125));
        btnPanDashboard.setBackground(new java.awt.Color(2, 136, 187));
        btnPanIssueBook.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookRecive.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddBookRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddMemeberRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateOtherDetails.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDeleteAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateAdminAccount.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSuperUserInformation.setBackground(new java.awt.Color(2, 136, 187));
//</editor-fold>

    }//GEN-LAST:event_lblBookAvailCheckMouseClicked

    private void lblIssueBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIssueBookMouseClicked
        // TODO add your handling code here:

        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        mainPan.add(jpanIssueBook);
        mainPan.repaint();
        mainPan.revalidate();

        //<editor-fold defaultstate="collapsed" desc="change button_panel color on mouse click">
        btnPanIssueBook.setBackground(new java.awt.Color(11, 77, 125));
        btnPanBookAvailCheck.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDashboard.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookRecive.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddBookRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddMemeberRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateOtherDetails.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDeleteAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateAdminAccount.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSuperUserInformation.setBackground(new java.awt.Color(2, 136, 187));
//</editor-fold>

    }//GEN-LAST:event_lblIssueBookMouseClicked

    private void lblDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseEntered

    }//GEN-LAST:event_lblDashboardMouseEntered

    private void lblDashboardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseReleased
        // TODO add your handling code here:
        lblDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//</editor-fold>
    }//GEN-LAST:event_lblDashboardMouseReleased

    private void lblDashboardMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseMoved
        // TODO add your handling code here:
        lblDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//</editor-fold>

    }//GEN-LAST:event_lblDashboardMouseMoved

    private void lblBookAvailCheckMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookAvailCheckMouseReleased
        // TODO add your handling code here:

        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//</editor-fold>

    }//GEN-LAST:event_lblBookAvailCheckMouseReleased

    private void lblBookAvailCheckMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookAvailCheckMouseMoved
        // TODO add your handling code here:

        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//</editor-fold>

    }//GEN-LAST:event_lblBookAvailCheckMouseMoved

    private void lblIssueBookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIssueBookMouseReleased
        // TODO add your handling code here:

        lblIssueBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//</editor-fold>

    }//GEN-LAST:event_lblIssueBookMouseReleased

    private void lblIssueBookMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIssueBookMouseMoved
        // TODO add your handling code here:

        lblIssueBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//</editor-fold>

    }//GEN-LAST:event_lblIssueBookMouseMoved

    // set window size
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        /*       
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();
        
        mainPan.add(jpanDashboard);
        mainPan.repaint();
        mainPan.revalidate();

        jpanDashboard.setSize(mainPanWidth, mainPanHight);*/
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);


    }//GEN-LAST:event_formWindowOpened

    private void lblBookReciveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookReciveMouseMoved
        // TODO add your handling code here:

        lblBookRecive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//</editor-fold>

    }//GEN-LAST:event_lblBookReciveMouseMoved

    private void lblBookReciveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookReciveMouseClicked
        // TODO add your handling code here:

        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        mainPan.add(jpanBookRecive);
        mainPan.repaint();
        mainPan.revalidate();

        //<editor-fold defaultstate="collapsed" desc="change button_panel color on mouse click">
        btnPanBookRecive.setBackground(new java.awt.Color(11, 77, 125));
        btnPanBookAvailCheck.setBackground(new java.awt.Color(2, 136, 187));
        btnPanIssueBook.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDashboard.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddBookRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddMemeberRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateOtherDetails.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDeleteAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateAdminAccount.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSuperUserInformation.setBackground(new java.awt.Color(2, 136, 187));
//</editor-fold>
    }//GEN-LAST:event_lblBookReciveMouseClicked

    private void lblBookReciveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookReciveMouseReleased
        // TODO add your handling code here:

        lblBookRecive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//</editor-fold>


    }//GEN-LAST:event_lblBookReciveMouseReleased

    private void lblAddBookRecordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddBookRecordMouseMoved
        // TODO add your handling code here:

        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//</editor-fold>

    }//GEN-LAST:event_lblAddBookRecordMouseMoved

    private void lblAddBookRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddBookRecordMouseClicked
        // TODO add your handling code here:

        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        mainPan.add(jpanAddBookRecord);
        mainPan.repaint();
        mainPan.revalidate();

        //<editor-fold defaultstate="collapsed" desc="change button_panel color on mouse click">
        btnPanAddBookRecord.setBackground(new java.awt.Color(11, 77, 125));
        btnPanBookAvailCheck.setBackground(new java.awt.Color(2, 136, 187));
        btnPanIssueBook.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookRecive.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDashboard.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddMemeberRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateOtherDetails.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDeleteAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateAdminAccount.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSuperUserInformation.setBackground(new java.awt.Color(2, 136, 187));
//</editor-fold>


    }//GEN-LAST:event_lblAddBookRecordMouseClicked

    private void lblAddBookRecordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddBookRecordMouseReleased
        // TODO add your handling code here:

        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//</editor-fold>

    }//GEN-LAST:event_lblAddBookRecordMouseReleased

    private void lblAddMemberRecordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMemberRecordMouseMoved
        // TODO add your handling code here:

        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
//</editor-fold>

    }//GEN-LAST:event_lblAddMemberRecordMouseMoved

    private void lblAddMemberRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMemberRecordMouseClicked
        // TODO add your handling code here:

        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        mainPan.add(jpanAddMemberRecord);
        mainPan.repaint();
        mainPan.revalidate();

        //<editor-fold defaultstate="collapsed" desc="chenge button_panel color on mouse click">
        btnPanAddMemeberRecord.setBackground(new java.awt.Color(11, 77, 125));
        btnPanBookAvailCheck.setBackground(new java.awt.Color(2, 136, 187));
        btnPanIssueBook.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookRecive.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddBookRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDashboard.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateOtherDetails.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDeleteAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateAdminAccount.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSuperUserInformation.setBackground(new java.awt.Color(2, 136, 187));
//</editor-fold>


    }//GEN-LAST:event_lblAddMemberRecordMouseClicked

    private void lblAddMemberRecordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMemberRecordMouseReleased
        // TODO add your handling code here:

        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //</editor-fold>

    }//GEN-LAST:event_lblAddMemberRecordMouseReleased

    private void lblCreateOtherDetailsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateOtherDetailsMouseMoved
        // TODO add your handling code here:

        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //</editor-fold>

    }//GEN-LAST:event_lblCreateOtherDetailsMouseMoved


    private void lblCreateOtherDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateOtherDetailsMouseClicked
        // TODO add your handling code here:

        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        mainPan.add(jpanCreateBookDetails);
        mainPan.repaint();
        mainPan.revalidate();

        //<editor-fold defaultstate="collapsed" desc="chenge button_panel color on mouse clicked">
        btnPanCreateOtherDetails.setBackground(new java.awt.Color(11, 77, 125));
        btnPanBookAvailCheck.setBackground(new java.awt.Color(2, 136, 187));
        btnPanIssueBook.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookRecive.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddBookRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddMemeberRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDashboard.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDeleteAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateAdminAccount.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSuperUserInformation.setBackground(new java.awt.Color(2, 136, 187));
//</editor-fold>

    }//GEN-LAST:event_lblCreateOtherDetailsMouseClicked


    private void lblCreateOtherDetailsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateOtherDetailsMouseReleased
        // TODO add your handling code here:

        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //</editor-fold>

    }//GEN-LAST:event_lblCreateOtherDetailsMouseReleased

    private void lblDeleteAllRecordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteAllRecordMouseMoved
        // TODO add your handling code here:
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //</editor-fold>
    }//GEN-LAST:event_lblDeleteAllRecordMouseMoved

    private void lblDeleteAllRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteAllRecordMouseClicked
        // TODO add your handling code here:  

        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        mainPan.add(jpanDeleteRecord);
        mainPan.repaint();
        mainPan.revalidate();

        //<editor-fold defaultstate="collapsed" desc="chenge button_panel color on mouse clicked">
        btnPanCreateOtherDetails.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookAvailCheck.setBackground(new java.awt.Color(2, 136, 187));
        btnPanIssueBook.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookRecive.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddBookRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddMemeberRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDashboard.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDeleteAllRecord.setBackground(new java.awt.Color(11, 77, 125));
        btnPanSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateAdminAccount.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSuperUserInformation.setBackground(new java.awt.Color(2, 136, 187));
//</editor-fold>

    }//GEN-LAST:event_lblDeleteAllRecordMouseClicked

    private void lblDeleteAllRecordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteAllRecordMouseReleased
        // TODO add your handling code here:
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //</editor-fold>
    }//GEN-LAST:event_lblDeleteAllRecordMouseReleased

    private void lblSearchAllRecordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchAllRecordMouseMoved
        // TODO add your handling code here:
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //</editor-fold>
    }//GEN-LAST:event_lblSearchAllRecordMouseMoved

    private void lblSearchAllRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchAllRecordMouseClicked
        // TODO add your handling code here:  

        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        mainPan.add(jpanSearchRecord);
        mainPan.repaint();
        mainPan.revalidate();

        //<editor-fold defaultstate="collapsed" desc="chenge button_panel color on mouse clicked">
        btnPanCreateOtherDetails.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookAvailCheck.setBackground(new java.awt.Color(2, 136, 187));
        btnPanIssueBook.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookRecive.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddBookRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddMemeberRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDashboard.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDeleteAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSearchAllRecord.setBackground(new java.awt.Color(11, 77, 125));
        btnPanCreateAdminAccount.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSuperUserInformation.setBackground(new java.awt.Color(2, 136, 187));
//</editor-fold>

    }//GEN-LAST:event_lblSearchAllRecordMouseClicked

    private void lblSearchAllRecordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchAllRecordMouseReleased
        // TODO add your handling code here:
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //</editor-fold>
    }//GEN-LAST:event_lblSearchAllRecordMouseReleased

    private void lblSupeUserInformationMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupeUserInformationMouseMoved
        // TODO add your handling code here:
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //</editor-fold>
    }//GEN-LAST:event_lblSupeUserInformationMouseMoved

    private void lblSupeUserInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupeUserInformationMouseClicked
        // TODO add your handling code here:

        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        mainPan.add(jpanSuperUserInformation);
        mainPan.repaint();
        mainPan.revalidate();

        //<editor-fold defaultstate="collapsed" desc="chenge button_panel color on mouse clicked">
        btnPanCreateOtherDetails.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookAvailCheck.setBackground(new java.awt.Color(2, 136, 187));
        btnPanIssueBook.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookRecive.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddBookRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddMemeberRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDashboard.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDeleteAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateAdminAccount.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSuperUserInformation.setBackground(new java.awt.Color(11, 77, 125));
//</editor-fold>

    }//GEN-LAST:event_lblSupeUserInformationMouseClicked

    private void lblSupeUserInformationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupeUserInformationMouseReleased
        // TODO add your handling code here:
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //</editor-fold>
    }//GEN-LAST:event_lblSupeUserInformationMouseReleased

    private void txtBookReciveSearchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBookReciveSearchBarMouseClicked
        // TODO add your handling code here:
        txtBookReciveSearchBar.setForeground(new Color(51, 51, 51));
        txtBookReciveSearchBar.setText(null);
    }//GEN-LAST:event_txtBookReciveSearchBarMouseClicked

    private void btnBookReciveSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookReciveSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBookReciveSearchMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

        /*         mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();
        
        mainPan.add(jpanDashboard);
        mainPan.add(jpanIssueBook);
        mainPan.add(jpanBookRecive);
        mainPan.add(jpanBookAvaliCheck);
        mainPan.add(jpanAddBookRecord);
        mainPan.add(jpanAddMemberRecord);
        mainPan.add(jpanCreateBookDetails);
        
        mainPan.repaint();
        mainPan.revalidate();*/

    }//GEN-LAST:event_formWindowActivated

    private void btnReciveBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciveBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReciveBookMouseClicked

    private void btnAddBookIssueRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBookIssueRecordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBookIssueRecordMouseClicked

    // This method from Book_Recive penal
    private void btnReportMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMemberMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_btnReportMemberMouseClicked

//<editor-fold defaultstate="collapsed" desc="Author Information [ Seve, Desplay in Table, Refresh Table, Reset Information ]">
    private void btnAddAutorRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAutorRecordActionPerformed
        // TODO add your handling code here:

        String DateOfBirth;
        String DateOfDeath;

        //<editor-fold defaultstate="collapsed" desc="Set Date Of Birth & Death">
        DateOfBirth = comboDayForAuthorBirth.getSelectedItem().toString()
                + "," + comboMonthForAuthorBirth.getSelectedItem().toString()
                + "," + comboYearForAuthorBirth.getSelectedItem().toString();

        if (checkBoxAliveForAuthor.isSelected()) {
            DateOfDeath = checkBoxAliveForAuthor.getText();
        } else {
            DateOfDeath = comboDayForAuthorDeath.getSelectedItem().toString()
                    + "," + comboMonthForAuthorDeath.getSelectedItem().toString()
                    + "," + comboYearForAuthorDeath.getSelectedItem().toString();
        }
        //</editor-fold>

        /**
         * [ saveAuthorInformation(author) ] this method save information in
         * database, Author() this constructor take agreement and set variable
         * value, [ clearTableForAuthorInformation() ] this method clear table
         * information, [ resetAuthorInformation() ] this method clear in
         * selected values, [ displayAuthorInformationWithInTable() ] this
         * method add all information in table,
         */
        author = new Author(
                txtAutorName.getText(),
                DateOfBirth,
                DateOfDeath,
                txtAreaAbout.getText()
        );

        if (txtAutorName.getText() != null) {
            authorService = new AuthorService();
            authorService.saveAuthorInformation(author);

            lblShowMsgAuthor.setText("Record add successful");
        } else {
            lblShowMsgAuthor.setText("Please re-type all information");
        }
        clearTableForAuthorInformation();
        resetAuthorInformation();

    }//GEN-LAST:event_btnAddAutorRecordActionPerformed

    private void displayAuthorInformationWithInTable() {

        authorService = new AuthorService();

        List<Author> getAuthorList = authorService.getAuthorList();
        DefaultTableModel model = (DefaultTableModel) tblDisplayAuthor.getModel();
        Object[] row = new Object[5];

        for (int i = 0; i < getAuthorList.size(); i++) {

            row[0] = getAuthorList.get(i).getId();
            row[1] = getAuthorList.get(i).getName();
            row[2] = getAuthorList.get(i).getDateOfBirth();
            row[3] = getAuthorList.get(i).getDateOfDead();
            row[4] = getAuthorList.get(i).getAbout();

            model.addRow(row);
        }
    }

    private void clearTableForAuthorInformation() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayAuthor.getModel();
        model.setRowCount(0);

        displayAuthorInformationWithInTable();

    }

    private void resetAuthorInformation() {

        txtAutorName.setText(null);
        txtAreaAbout.setText(null);

        comboDayForAuthorBirth.setSelectedIndex(0);
        comboMonthForAuthorBirth.setSelectedIndex(0);
        comboYearForAuthorBirth.setSelectedIndex(0);

        comboDayForAuthorDeath.setSelectedIndex(0);
        comboMonthForAuthorDeath.setSelectedIndex(0);
        comboYearForAuthorDeath.setSelectedIndex(0);
        checkBoxAliveForAuthor.setSelected(true);
    }
//</editor-fold>
    //
//<editor-fold defaultstate="collapsed" desc="Edition Information [ Seve, Desplay in Table, Refresh Table, Reset Information ]">
    private void btnAddEditionRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEditionRecordActionPerformed
        // TODO add your handling code here:

        /**
         * [ saveEdition(edition) ] this method save information in database,
         * Edition() this constructor take agreement and set variable value, [
         * clearTableForEditionInformation() ] this method clear table
         * information, [ resetEditionInformation() ] this method clear in
         * selected values, [ displayEditionInformationWithInTable() ] this
         * method add all information in table,
         */
        edition = new Edition(txtEditionName.getText());

        editionService = new EditionService();
        editionService.saveEdition(edition);

        lblShowMsgEdition.setText("Record add successful");
        clearTableForEditionInformation();
        resetEditionInformation();

    }//GEN-LAST:event_btnAddEditionRecordActionPerformed

    private void displayEditionInformationWithInTable() {

        editionService = new EditionService();

        List<Edition> getEditionList = editionService.getEditionList();
        DefaultTableModel model = (DefaultTableModel) tblDisplayEdition.getModel();
        Object[] row = new Object[2];

        for (int i = 0; i < getEditionList.size(); i++) {

            row[0] = getEditionList.get(i).getId();
            row[1] = getEditionList.get(i).getName();

            model.addRow(row);
        }

    }

    private void clearTableForEditionInformation() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayEdition.getModel();
        model.setRowCount(0);

        displayEditionInformationWithInTable();

    }

    private void resetEditionInformation() {
        txtEditionName.setText(null);
    }
//</editor-fold>
    //
//<editor-fold defaultstate="collapsed" desc="Publisher Information [ Seve, Desplay in Table, Refresh Table, Reset Information ]">
    private void btnAddPublisherRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPublisherRecordActionPerformed
        // TODO add your handling code here:

        /**
         * [ savePublisher(publisher) ] this method save information in
         * database, Publisher() this constructor take agreement and set
         * variable value, [ clearTableForPublisherInformation() ] this method
         * clear table information, [ resetPublisherInformation() ] this method
         * clear in selected values, [ displayPublisherInformationWithInTable()
         * ] this method add all information in table,
         */
        publisher = new Publisher(txtPublisherName.getText());

        if (txtPublisherName.getText() != null) {
            publisherService = new PublisherService();
            publisherService.savePublisher(publisher);

            lblShowMsgPublisher.setText("Record add successful");
        } else {
            lblShowMsgPublisher.setText("Please retype all information");
        }
        clearTableForPublisherInformation();
        resetPublisherInformation();

    }//GEN-LAST:event_btnAddPublisherRecordActionPerformed

    private void displayPublisherInformationWithInTable() {

        publisherService = new PublisherService();

        List<Publisher> getPublishers = publisherService.getPublisherList();
        DefaultTableModel model = (DefaultTableModel) tblDisplayPublisher.getModel();
        Object[] row = new Object[2];

        for (int i = 0; i < getPublishers.size(); i++) {

            row[0] = getPublishers.get(i).getId();
            row[1] = getPublishers.get(i).getName();

            model.addRow(row);
        }

    }

    private void clearTableForPublisherInformation() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayPublisher.getModel();
        model.setRowCount(0);

        displayPublisherInformationWithInTable();

    }

    private void resetPublisherInformation() {
        txtPublisherName.setText(null);
    }
//</editor-fold>
    //
//<editor-fold defaultstate="collapsed" desc="Catagory Information [ Seve, Desplay in Table, Refresh Table, Reset Information ]">
    private void btnAddCatagoryRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCatagoryRecordActionPerformed
        // TODO add your handling code here:

        /**
         * [ saveCategory(category) ] this method save information in database,
         * Publisher() this constructor take agreement and set variable value, [
         * clearTableForCatagoryInformation() ] this method clear table
         * information, [ resetCatagoryInformation() ] this method clear in
         * selected values, [ displayCatagoryInformationWithInTable() ] this
         * method add all information in table,
         */
        category = new Category(txtCatagoryName.getText());
        categoryService = new CategoryService();
        categoryService.saveCategory(category);

        lblShowMsgCatagory.setText("Record add successful");
        clearTableForCatagoryInformation();
        resetCatagoryInformation();


    }//GEN-LAST:event_btnAddCatagoryRecordActionPerformed

    private void displayCatagoryInformationWithInTable() {

        categoryService = new CategoryService();

        List<Category> getCategorys = categoryService.getCategoryList();
        DefaultTableModel model = (DefaultTableModel) tblDisplayCatagory.getModel();
        Object[] row = new Object[2];

        for (int i = 0; i < getCategorys.size(); i++) {

            row[0] = getCategorys.get(i).getId();
            row[1] = getCategorys.get(i).getName();

            model.addRow(row);
        }

    }

    private void clearTableForCatagoryInformation() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayCatagory.getModel();
        model.setRowCount(0);

        displayCatagoryInformationWithInTable();

    }

    private void resetCatagoryInformation() {
        txtCatagoryName.setText(null);
    }
//</editor-fold>
    //
//<editor-fold defaultstate="collapsed" desc="MemberRecord Information [ Seve, update, Desplay in Table, Refresh Table, Reset Information ]">
    private void btnAddMemberRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberRecordActionPerformed
        // TODO add your handling code here:

        /**
         * [ saveLibraryMemberInformation(author) ] this method save information
         * in database, LibraryMember() this constructor take agreement and set
         * variable value, [ clearTableForAuthorInformation() ] this method
         * clear table information, [ resetAuthorInformation() ] this method
         * clear in selected values, [ displayAuthorInformationWithInTable() ]
         * this method add all information in table,
         */
        libraryMember = new LibraryMember();
        libraryMember.setMemberName(txtMemberName.getText());
        libraryMember.setCardNo(Integer.parseInt(txtMemberCardNo.getText()));
        libraryMember.setContactInfo(txtMobileNo.getText(), txtMemberEmail.getText());
        libraryMember.setAddressInfo(
                txtMemberHouseNo.getText(),
                txtMemberRoadNo.getText(),
                txtMemberBlockOrVillage.getText(),
                txtMemberThana.getText(),
                comboMemberDistrict.getSelectedItem().toString(),
                comboMemberDivision.getSelectedItem().toString()
        );

        libraryMemberService = new LibraryMemberService();
        libraryMemberService.saveLibraryMemberInformation(libraryMember);

        lblMemberShowMsg.setText("Record add successful");
        clearTableForLibraryMemberInformation();
        resetLibraryMemberInformation();

    }//GEN-LAST:event_btnAddMemberRecordActionPerformed

    private void btnEditMemberRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMemberRecordActionPerformed
        // TODO add your handling code here:

        /**
         * [ updateLibraryMemberInformation(author) ] this method save
         * information in database, Author() this constructor take agreement and
         * set variable value, [ clearTableForAuthorInformation() ] this method
         * clear table information, [ resetAuthorInformation() ] this method
         * clear in selected values, [ displayAuthorInformationWithInTable() ]
         * this method add all information in table,
         */
        libraryMember = new LibraryMember();
        libraryMember.setMemberName(txtMemberName.getText());
        libraryMember.setCardNo(Integer.parseInt(txtMemberCardNo.getText()));
        libraryMember.setContactInfo(txtMobileNo.getText(), txtMemberEmail.getText());
        libraryMember.setAddressInfo(
                txtMemberHouseNo.getText(),
                txtMemberRoadNo.getText(),
                txtMemberBlockOrVillage.getText(),
                txtMemberThana.getText(),
                comboMemberDistrict.getSelectedItem().toString(),
                comboMemberDivision.getSelectedItem().toString()
        );

        int row = tblDisplayMemberInfo.getSelectedRow();
        TableModel model = tblDisplayMemberInfo.getModel();

        libraryMember.setId(Integer.parseInt(model.getValueAt(row, 0).toString()));

        libraryMemberService = new LibraryMemberService();
        libraryMemberService.updateLibraryMemberInformation(libraryMember);

        lblMemberShowMsg.setText("Record update successful");

        clearTableForLibraryMemberInformation();
        resetLibraryMemberInformation();


    }//GEN-LAST:event_btnEditMemberRecordActionPerformed

    private void tblDisplayMemberInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayMemberInfoMouseClicked
        // TODO add your handling code here:

        int row = tblDisplayMemberInfo.getSelectedRow();
        TableModel model = tblDisplayMemberInfo.getModel();

        txtMemberName.setText(model.getValueAt(row, 1).toString());
        txtMemberCardNo.setText(model.getValueAt(row, 2).toString());
        txtMobileNo.setText(model.getValueAt(row, 3).toString());
        txtMemberEmail.setText(model.getValueAt(row, 4).toString());
        txtMemberHouseNo.setText(model.getValueAt(row, 5).toString());
        txtMemberRoadNo.setText(model.getValueAt(row, 6).toString());
        txtMemberBlockOrVillage.setText(model.getValueAt(row, 7).toString());
        txtMemberThana.setText(model.getValueAt(row, 8).toString());
        comboMemberDistrict.setSelectedItem(model.getValueAt(row, 9).toString());
        comboMemberDivision.setSelectedItem(model.getValueAt(row, 10).toString());


    }//GEN-LAST:event_tblDisplayMemberInfoMouseClicked

    private void displayLibraryMemberInformationWithInTable() {

        libraryMemberService = new LibraryMemberService();

        List<LibraryMember> getLibraryMember = libraryMemberService.getLibraryMemberInformationList();
        DefaultTableModel model = (DefaultTableModel) tblDisplayMemberInfo.getModel();
        Object[] row = new Object[12];

        totalMember = getLibraryMember.size();

        for (int i = 0; i < getLibraryMember.size(); i++) {

            row[0] = getLibraryMember.get(i).getId();
            row[1] = getLibraryMember.get(i).getMemberName();
            row[2] = getLibraryMember.get(i).getCardNo();
            row[3] = getLibraryMember.get(i).getContactInfo().getMobileNumber();
            row[4] = getLibraryMember.get(i).getContactInfo().getEmail();
            row[5] = getLibraryMember.get(i).getAddressInfo().getHouseNo();
            row[6] = getLibraryMember.get(i).getAddressInfo().getRoadNo();
            row[7] = getLibraryMember.get(i).getAddressInfo().getBlockOrVillage();
            row[8] = getLibraryMember.get(i).getAddressInfo().getThana();
            row[9] = getLibraryMember.get(i).getAddressInfo().getDistrict();
            row[10] = getLibraryMember.get(i).getAddressInfo().getDivision();
            row[11] = getLibraryMember.get(i).getReport();

            model.addRow(row);
        }
    }

    private void clearTableForLibraryMemberInformation() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayMemberInfo.getModel();
        model.setRowCount(0);

        displayLibraryMemberInformationWithInTable();

    }

    private void resetLibraryMemberInformation() {

        txtMemberName.setText(null);
        txtMemberCardNo.setText(null);
        txtMobileNo.setText(null);
        txtMemberEmail.setText(null);
        txtMemberHouseNo.setText(null);
        txtMemberRoadNo.setText(null);
        txtMemberBlockOrVillage.setText(null);
        txtMemberThana.setText(null);
        comboMemberDistrict.setSelectedIndex(0);
        comboMemberDivision.setSelectedIndex(0);

    }

//</editor-fold>
    //
//<editor-fold defaultstate="collapsed" desc="BookInformation Information [ Seve, update, Desplay in Table, Refresh Table, Reset Information ]">
    private void btnAddRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecordActionPerformed
        // TODO add your handling code here:

        bookInformation = new BookInformation(
                txtBookRecordBookName.getText(),
                txtBookRecordBookCode.getText(),
                comboBookRecordAuthorList.getSelectedItem().toString(),
                comboBookRecordPublisherList.getSelectedItem().toString(),
                comboBookRecordEditionList.getSelectedItem().toString(),
                Integer.parseInt(txtBookRecordUnitPrice.getText()),
                Integer.parseInt(txtBookRecordQty.getText()),
                Integer.parseInt(txtBookRecordTotalPrice.getText()),
                Integer.parseInt(txtBookRecordRackNo.getText()),
                txtBookRecordIssnNo.getText(),
                comboBookRecordCategoryList.getSelectedItem().toString(),
                currentDate
        );

        bookInformationService = new BookInformationService();
        bookInformationService.saveBookInformation(bookInformation);

        lblBookRecordShowMsg.setText("Record add successful");

        clearTableForBookInformation();
        resetBookInformation();

    }//GEN-LAST:event_btnAddRecordActionPerformed

    private void btnEditeRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditeRecordActionPerformed
        // TODO add your handling code here:

        bookInformation = new BookInformation(
                txtBookRecordBookName.getText(),
                txtBookRecordBookCode.getText(),
                comboBookRecordAuthorList.getSelectedItem().toString(),
                comboBookRecordPublisherList.getSelectedItem().toString(),
                comboBookRecordEditionList.getSelectedItem().toString(),
                Integer.parseInt(txtBookRecordUnitPrice.getText()),
                Integer.parseInt(txtBookRecordQty.getText()),
                Integer.parseInt(txtBookRecordTotalPrice.getText()),
                Integer.parseInt(txtBookRecordRackNo.getText()),
                txtBookRecordIssnNo.getText(),
                comboBookRecordCategoryList.getSelectedItem().toString(),
                currentDate
        );

        bookInformationService = new BookInformationService();

        int row = tblDisplayBookInfo.getSelectedRow();
        TableModel model = tblDisplayBookInfo.getModel();
        bookInformation.setId(Integer.parseInt(model.getValueAt(row, 0).toString()));

        bookInformationService.updateBookInformation(bookInformation);

        lblBookRecordShowMsg.setText("Record update successful");

        clearTableForBookInformation();
        resetBookInformation();


    }//GEN-LAST:event_btnEditeRecordActionPerformed

    private void tblDisplayBookInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayBookInfoMouseClicked
        // TODO add your handling code here:

        int row = tblDisplayBookInfo.getSelectedRow();
        TableModel model = tblDisplayBookInfo.getModel();

        txtBookRecordBookName.setText(model.getValueAt(row, 1).toString());
        txtBookRecordBookCode.setText(model.getValueAt(row, 2).toString());
        comboBookRecordAuthorList.setSelectedItem(model.getValueAt(row, 3).toString());
        comboBookRecordPublisherList.setSelectedItem(model.getValueAt(row, 4).toString());
        comboBookRecordEditionList.setSelectedItem(model.getValueAt(row, 5).toString());
        txtBookRecordUnitPrice.setText(model.getValueAt(row, 6).toString());
        txtBookRecordQty.setText(model.getValueAt(row, 7).toString());
        txtBookRecordTotalPrice.setText(model.getValueAt(row, 8).toString());
        txtBookRecordRackNo.setText(model.getValueAt(row, 9).toString());
        txtBookRecordIssnNo.setText(model.getValueAt(row, 10).toString());
        comboBookRecordCategoryList.setSelectedItem(model.getValueAt(row, 11));


    }//GEN-LAST:event_tblDisplayBookInfoMouseClicked

    private void displayBookInformationWithInTable() {

        bookInformationService = new BookInformationService();

        List<BookInformation> getBookInformation = bookInformationService.getBookInformation();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBookInfo.getModel();
        Object[] row = new Object[13];

        totalBook = getBookInformation.size();

        for (int i = 0; i < getBookInformation.size(); i++) {

            row[0] = getBookInformation.get(i).getId();
            row[1] = getBookInformation.get(i).getName();
            row[2] = getBookInformation.get(i).getBookCode();
            row[3] = getBookInformation.get(i).getAuthor();
            row[4] = getBookInformation.get(i).getPublisher();
            row[5] = getBookInformation.get(i).getEdition();
            row[6] = getBookInformation.get(i).getUnitPrice();
            row[7] = getBookInformation.get(i).getQty();
            row[8] = getBookInformation.get(i).getTotalPrice();
            row[9] = getBookInformation.get(i).getRackNO();
            row[10] = getBookInformation.get(i).getIssnNo();
            row[11] = getBookInformation.get(i).getCategory();
            row[12] = getBookInformation.get(i).getPurchaseDate();

            model.addRow(row);
        }
    }

    private void clearTableForBookInformation() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayBookInfo.getModel();
        model.setRowCount(0);

        displayBookInformationWithInTable();

    }

    private void resetBookInformation() {

        txtBookRecordBookName.setText(null);
        txtBookRecordBookCode.setText(null);
        comboBookRecordAuthorList.setSelectedIndex(0);
        comboBookRecordPublisherList.setSelectedIndex(0);
        comboBookRecordEditionList.setSelectedIndex(0);
        txtBookRecordUnitPrice.setText(null);
        txtBookRecordQty.setText(null);
        txtBookRecordTotalPrice.setText(null);
        txtBookRecordRackNo.setText(null);
        txtBookRecordIssnNo.setText(null);
        comboBookRecordCategoryList.setSelectedIndex(0);

    }

    public void displayAuthorListInBookInfo() {
        authorService = new AuthorService();

        Set<Author> authorList = authorService.getAuthorSet();

        authorList.forEach((a) -> {
            comboBookRecordAuthorList.addItem(a.getName());
        });

    }

    public void displayPublisherListInBookInfo() {
        publisherService = new PublisherService();

        Set<Publisher> publisherList = publisherService.getPublisherSet();

        publisherList.forEach((p) -> {
            comboBookRecordPublisherList.addItem(p.getName());
        });

    }

    public void displayEditionListInBookInfo() {
        editionService = new EditionService();

        Set<Edition> editionList = editionService.getEditionSet();

        editionList.forEach((e) -> {
            comboBookRecordEditionList.addItem(e.getName());
        });

    }

    public void displayCategoryListInBookInfo() {
        categoryService = new CategoryService();

        Set<Category> categoryList = categoryService.getCategorySet();

        categoryList.forEach((c) -> {
            comboBookRecordCategoryList.addItem(c.getName());
        });

    }

//</editor-fold>
    //
//<editor-fold defaultstate="collapsed" desc="BookIssue Information [ Seve, update, Desplay in Table, Refresh Table, Reset Information ]">
    private void btnAddBookIssueRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookIssueRecordActionPerformed
        // TODO add your handling code here:

        bookIssue = new BookIssue(
                bookIssueBookId,
                bookIssueMemberId,
                currentDate,
                comboExptDayForBookIssue.getSelectedItem().toString()
                + "" + comboExptMonthForBookIssue.getSelectedItem().toString()
                + "" + comboExptYearForBookIssue.getSelectedItem().toString(),
                comboReturnDayForBookIssue.getSelectedItem().toString()
                + "" + comboReturnMonthForBookIssue.getSelectedItem().toString()
                + "" + comboReturnYearForBookIssue.getSelectedItem().toString(),
                Integer.parseInt(txtBookIssueQty.getText()),
                comboBookIssueSubmitLibrarian.getSelectedItem().toString()
        );

        bookIssueService = new BookIssueService();

        if (bookIssueService.updateQtyInBookInfoTable(bookIssueBookId, Integer.parseInt(txtBookIssueQty.getText())) == 101) {
            bookIssueService.saveIssueBook(bookIssue);
            lblShowMsgBookIssue.setText("Record add successful");
        } else {
            lblShowMsgBookIssue.setText("! Wrong given Qty, // PLease Check This Book Qty In Aviable Book//");
        }

        clearTableForBookIssue();
        resetBookIssue();

    }//GEN-LAST:event_btnAddBookIssueRecordActionPerformed

    private void comboBookIssueBookIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBookIssueBookIdItemStateChanged
        // TODO add your handling code here:
        String bookID = comboBookIssueBookId.getItemAt(comboBookIssueBookId.getSelectedIndex());
        bookIssueBookId = bookID.split(",")[0];
        //System.out.println(bookIssueBookId);

    }//GEN-LAST:event_comboBookIssueBookIdItemStateChanged

    private void comboBookIssueMemberIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBookIssueMemberIdItemStateChanged
        // TODO add your handling code here:
        String memberID = comboBookIssueMemberId.getItemAt(comboBookIssueMemberId.getSelectedIndex());
        String id = memberID.split(",")[0];
        bookIssueMemberId = Integer.parseInt(id);
        //System.out.println(bookIssueMemberId);

    }//GEN-LAST:event_comboBookIssueMemberIdItemStateChanged

    private void displayBookIssueWithInTable() {

        bookIssueService = new BookIssueService();

        List<BookIssue> getBookIssue = bookIssueService.getIssueBookList();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBookIssue.getModel();
        Object[] row = new Object[8];

        totalIssueBook = getBookIssue.size();

        for (int i = 0; i < getBookIssue.size(); i++) {

            row[0] = getBookIssue.get(i).getId();
            row[1] = getBookIssue.get(i).getBookId();
            row[2] = getBookIssue.get(i).getLibraryMemberId();
            row[3] = getBookIssue.get(i).getIssueDate();
            row[4] = getBookIssue.get(i).getReturnDate();
            row[5] = getBookIssue.get(i).getExpireDate();
            row[6] = getBookIssue.get(i).getQty();
            row[7] = getBookIssue.get(i).getStatus();

            model.addRow(row);
        }
    }

    private void clearTableForBookIssue() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayBookIssue.getModel();
        model.setRowCount(0);

        displayBookIssueWithInTable();

    }

    private void resetBookIssue() {

        comboBookIssueBookId.setSelectedIndex(0);
        comboBookIssueMemberId.setSelectedIndex(0);
        comboBookIssueSubmitLibrarian.setSelectedIndex(0);
        comboReturnDayForBookIssue.setSelectedIndex(0);
        comboReturnMonthForBookIssue.setSelectedIndex(0);
        comboReturnYearForBookIssue.setSelectedIndex(0);
        comboExptDayForBookIssue.setSelectedIndex(0);
        comboExptMonthForBookIssue.setSelectedIndex(0);
        comboExptYearForBookIssue.setSelectedIndex(0);
        txtBookIssueQty.setText(null);

    }

    public void displayBookListInBookIssue() {
        bookInformationService = new BookInformationService();

        Set<BookInformation> bookInformationList = bookInformationService.getBookInformationSet();

        bookInformationList.forEach((b) -> {
            comboBookIssueBookId.addItem(b.getBookCode() + "," + b.getName());
        });

    }

    public void displayLibraryMemberListInBookIssue() {
        libraryMemberService = new LibraryMemberService();

        Set<LibraryMember> libraryMemberList = libraryMemberService.getLibraryMemberionSet();

        libraryMemberList.forEach((l) -> {
            comboBookIssueMemberId.addItem(String.valueOf(l.getCardNo()) + "," + l.getMemberName());
        });

    }

    private void showLibrarianSetInIssuePanel() {
        librarianService = new LibrarianService();

        Set<LibrarianAccount> librarianInformationList = librarianService.getLibrarianInfoSet();

        librarianInformationList.forEach((l) -> {
            comboBookIssueSubmitLibrarian.addItem(l.getName());
        });
    }

//</editor-fold>
    //
//<editor-fold defaultstate="collapsed" desc="BookRecive Information [ Seve, update, Desplay in Table, Refresh Table, Reset Information ]">
    private void btnReciveBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciveBookActionPerformed
        // TODO add your handling code here:

        int row = tblDisplayShowIssuBookInBookRecive.getSelectedRow();
        TableModel model = tblDisplayShowIssuBookInBookRecive.getModel();

        bookRecive = new BookRecive(
                model.getValueAt(row, 1).toString(),
                Integer.parseInt(model.getValueAt(row, 2).toString()),
                currentDate,
                Integer.parseInt(model.getValueAt(row, 6).toString()),
                comboSubmitLibrarianForBookRecive.getSelectedItem().toString()
        );

        bookReciveService = new BookReciveService();
        bookReciveService.saveBookRecive(bookRecive);

        bookReciveService.updateQtyInBookReciveTable(model.getValueAt(row, 1).toString(), Integer.parseInt(model.getValueAt(row, 6).toString()));

        bookIssueService = new BookIssueService();
        bookIssueService.deleteIssueBook(Integer.parseInt(model.getValueAt(row, 0).toString()));

        clearTableForShowIssuBookInBookRecive();
        clearTableForBookRecive();

    }//GEN-LAST:event_btnReciveBookActionPerformed

    private void btnBookReciveSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookReciveSearchActionPerformed
        // TODO add your handling code here:

        bookIssueService = new BookIssueService();

        List<BookIssue> getBookIssue = bookIssueService.getIssueBookListOderByLibMemberId(Integer.parseInt(txtBookReciveSearchBar.getText()));
        DefaultTableModel model = (DefaultTableModel) tblDisplayShowIssuBookInBookRecive.getModel();
        Object[] row = new Object[8];

        for (int i = 0; i < getBookIssue.size(); i++) {

            row[0] = getBookIssue.get(i).getId();
            row[1] = getBookIssue.get(i).getBookId();
            row[2] = getBookIssue.get(i).getLibraryMemberId();
            row[3] = getBookIssue.get(i).getIssueDate();
            row[4] = getBookIssue.get(i).getReturnDate();
            row[5] = getBookIssue.get(i).getExpireDate();
            row[6] = getBookIssue.get(i).getQty();
            row[7] = getBookIssue.get(i).getStatus();

            model.addRow(row);
        }


    }//GEN-LAST:event_btnBookReciveSearchActionPerformed

    private void displayBookReciveWithInTable() {

        bookReciveService = new BookReciveService();

        List<BookRecive> getBookRecive = bookReciveService.getBookReciveList();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBookRecive.getModel();
        Object[] row = new Object[6];

        totalReciveBook = getBookRecive.size();

        for (int i = 0; i < getBookRecive.size(); i++) {

            row[0] = getBookRecive.get(i).getId();
            row[1] = getBookRecive.get(i).getBookId();
            row[2] = getBookRecive.get(i).getLibMemberId();
            row[3] = getBookRecive.get(i).getSubmitDate();
            row[4] = getBookRecive.get(i).getQty();
            row[5] = getBookRecive.get(i).getSubmitBy();

            model.addRow(row);
        }
    }

    private void clearTableForBookRecive() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayBookRecive.getModel();
        model.setRowCount(0);

        displayBookReciveWithInTable();

    }

    private void clearTableForShowIssuBookInBookRecive() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayShowIssuBookInBookRecive.getModel();
        model.setRowCount(0);

    }

    private void showLibrarianSetInRecivePanel() {
        librarianService = new LibrarianService();

        Set<LibrarianAccount> librarianInformationList = librarianService.getLibrarianInfoSet();

        librarianInformationList.forEach((l) -> {
            comboSubmitLibrarianForBookRecive.addItem(l.getName());
        });
    }
//</editor-fold>
    //
//<editor-fold defaultstate="collapsed" desc="AvailableBook Information [ Seve, update, Desplay in Table, Refresh Table, Reset Information ]">
    private void btnRefreshTableAvailBookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshTableAvailBookListMouseClicked
        // TODO add your handling code here:
        resetAvailableBookTable();
    }//GEN-LAST:event_btnRefreshTableAvailBookListMouseClicked

    private void btnRefreshTableForShowAllBookInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshTableForShowAllBookInfoMouseClicked
        // TODO add your handling code here:
        resetAvailableBookTable();
    }//GEN-LAST:event_btnRefreshTableForShowAllBookInfoMouseClicked

    private void txtAvailableBookSearchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAvailableBookSearchBarMouseClicked
        // TODO add your handling code here:
        txtAvailableBookSearchBar.setText(null);
    }//GEN-LAST:event_txtAvailableBookSearchBarMouseClicked

    private void btnSearchAvailableBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAvailableBookActionPerformed
        // TODO add your handling code here:

        DefaultTableModel _model = (DefaultTableModel) tblShowAvailableBookList.getModel();
        _model.setRowCount(0);

        DefaultTableModel m_model = (DefaultTableModel) tblDisplayAllBookListInAvailPan.getModel();
        m_model.setRowCount(0);

        showAllAvailableBookInTable();

        availableBookService = new AvailableBookService();

        List<BookInformation> getList = availableBookService.getBookInformationForSearchTable(txtAvailableBookSearchBar.getText());
        DefaultTableModel model = (DefaultTableModel) tblShowAvailableBookList.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < getList.size(); i++) {

            row[0] = getList.get(i).getName();
            row[1] = getList.get(i).getBookCode();
            row[2] = getList.get(i).getAuthor();
            row[3] = getList.get(i).getPublisher();
            row[4] = getList.get(i).getEdition();
            if ((getList.get(i).getQty()) > 0) {
                row[5] = getList.get(i).getQty();
            } else {
                row[5] = "NULL";
            }
            row[6] = getList.get(i).getCategory();

            model.addRow(row);
        }

    }//GEN-LAST:event_btnSearchAvailableBookActionPerformed

    private void showAllAvailableBookInTable() {

        availableBookService = new AvailableBookService();

        List<BookInformation> getList = availableBookService.getBookInformationForAllAvailabelTable();
        DefaultTableModel model = (DefaultTableModel) tblDisplayAllBookListInAvailPan.getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < getList.size(); i++) {

            row[0] = getList.get(i).getName();
            row[1] = getList.get(i).getBookCode();
            row[2] = getList.get(i).getAuthor();
            row[3] = getList.get(i).getPublisher();
            row[4] = getList.get(i).getEdition();
            row[5] = getList.get(i).getQty();
            row[6] = getList.get(i).getCategory();

            model.addRow(row);
        }

    }

    private void resetAvailableBookTable() {
        DefaultTableModel _model = (DefaultTableModel) tblShowAvailableBookList.getModel();
        _model.setRowCount(0);

        DefaultTableModel m_model = (DefaultTableModel) tblDisplayAllBookListInAvailPan.getModel();
        m_model.setRowCount(0);

        showAllAvailableBookInTable();
    }
//</editor-fold>


    private void lblCreateAdminAccountMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAdminAccountMouseReleased
        // TODO add your handling code here:
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //</editor-fold>
    }//GEN-LAST:event_lblCreateAdminAccountMouseReleased

    private void lblCreateAdminAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAdminAccountMouseClicked
        // TODO add your handling code here:

        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        if (lognValue == 112345) {
            //System.out.println("In user Panel");
            //lblCreateAdminAccount.setText("   Admin Account");
            mainPan.add(jpanShowAdminInformation);
            mainPan.repaint();
            mainPan.revalidate();
        } else if (lognValue == 543211) {
            //lblCreateAdminAccount.setText("   Create Admin Account");
            mainPan.add(jpanShowAdminInformation);
            mainPan.repaint();
            mainPan.revalidate();
            new CreateLibrarianAccount().setVisible(true);
        }

        //<editor-fold defaultstate="collapsed" desc="chenge button_panel color on mouse clicked">
        btnPanCreateOtherDetails.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookAvailCheck.setBackground(new java.awt.Color(2, 136, 187));
        btnPanIssueBook.setBackground(new java.awt.Color(2, 136, 187));
        btnPanBookRecive.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddBookRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanAddMemeberRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDashboard.setBackground(new java.awt.Color(2, 136, 187));
        btnPanDeleteAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanSearchAllRecord.setBackground(new java.awt.Color(2, 136, 187));
        btnPanCreateAdminAccount.setBackground(new java.awt.Color(11, 77, 125));
        btnPanSuperUserInformation.setBackground(new java.awt.Color(2, 136, 187));
//</editor-fold>

    }//GEN-LAST:event_lblCreateAdminAccountMouseClicked

    private void lblCreateAdminAccountMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAdminAccountMouseMoved
        // TODO add your handling code here:
        lblCreateAdminAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1));

        //<editor-fold defaultstate="collapsed" desc="Create Empty Border">
        lblBookAvailCheck.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblIssueBook.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblBookRecive.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddBookRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblAddMemberRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblCreateOtherDetails.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblDeleteAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSupeUserInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        lblSearchAllRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //</editor-fold>
    }//GEN-LAST:event_lblCreateAdminAccountMouseMoved
//
//<editor-fold defaultstate="collapsed" desc="{ search information for Delete from delete panel }">
    private void txtSearchBarForDltBookRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchBarForDltBookRecordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarForDltBookRecordMouseClicked

    private void btnSearchForDltBookRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchForDltBookRecordActionPerformed
        // TODO add your handling code here:

        /**
         * This method show all Book Information in Delete Panel, Search
         * information by ( ISSN no ), and show information in table
         */
        searchService = new SearchService();

        List<BookInformation> getBookInformation = searchService.searchBookRecordByIssnNo(txtSearchBarForDltBookRecord.getText());
        DefaultTableModel model = (DefaultTableModel) tblDisplayBookRecordForDlt.getModel();
        Object[] row = new Object[13];

        for (int i = 0; i < getBookInformation.size(); i++) {

            row[0] = getBookInformation.get(i).getId();
            row[1] = getBookInformation.get(i).getName();
            row[2] = getBookInformation.get(i).getBookCode();
            row[3] = getBookInformation.get(i).getAuthor();
            row[4] = getBookInformation.get(i).getPublisher();
            row[5] = getBookInformation.get(i).getEdition();
            row[6] = getBookInformation.get(i).getUnitPrice();
            row[7] = getBookInformation.get(i).getQty();
            row[8] = getBookInformation.get(i).getTotalPrice();
            row[9] = getBookInformation.get(i).getRackNO();
            row[10] = getBookInformation.get(i).getIssnNo();
            row[11] = getBookInformation.get(i).getCategory();
            row[12] = getBookInformation.get(i).getPurchaseDate();

            model.addRow(row);
        }

    }//GEN-LAST:event_btnSearchForDltBookRecordActionPerformed

    private void txtSearchBarForDelMemberRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchBarForDelMemberRecordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarForDelMemberRecordMouseClicked

    private void btnSearchForDelMemberRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchForDelMemberRecordActionPerformed
        // TODO add your handling code here:

        /**
         * This method show all Member Information in Delete Panel, Search
         * information by ( Member ID ), and show information in table
         */
        searchService = new SearchService();

        List<LibraryMember> getLibraryMember = searchService.searchLibraryMemberInformationByMemberId(Integer.parseInt(txtSearchBarForDelMemberRecord.getText()));
        DefaultTableModel model = (DefaultTableModel) tblDisplayMemberRecordForDlt.getModel();
        Object[] row = new Object[11];

        for (int i = 0; i < getLibraryMember.size(); i++) {

            row[0] = getLibraryMember.get(i).getId();
            row[1] = getLibraryMember.get(i).getMemberName();
            row[2] = getLibraryMember.get(i).getCardNo();
            row[3] = getLibraryMember.get(i).getContactInfo().getMobileNumber();
            row[4] = getLibraryMember.get(i).getContactInfo().getEmail();
            row[5] = getLibraryMember.get(i).getAddressInfo().getHouseNo();
            row[6] = getLibraryMember.get(i).getAddressInfo().getRoadNo();
            row[7] = getLibraryMember.get(i).getAddressInfo().getBlockOrVillage();
            row[8] = getLibraryMember.get(i).getAddressInfo().getThana();
            row[9] = getLibraryMember.get(i).getAddressInfo().getDistrict();
            row[10] = getLibraryMember.get(i).getAddressInfo().getDivision();

            model.addRow(row);
        }

    }//GEN-LAST:event_btnSearchForDelMemberRecordActionPerformed

    private void txtSearchBarForBookReciveRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchBarForBookReciveRecordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarForBookReciveRecordMouseClicked

    private void btnSearchForDelBookReciveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchForDelBookReciveRecordActionPerformed
        // TODO add your handling code here:

        /**
         * This method show all Book receive Information in Delete Panel, Search
         * information by ( ISSN no ), and show information in table
         */
        searchService = new SearchService();

        // get BookRecive list from searchSearvice
        List<BookRecive> getBookRecive = searchService.searchBookReciveListByMemberId(Integer.parseInt(txtSearchBarForBookReciveRecord.getText()));
        // get model from table
        DefaultTableModel model = (DefaultTableModel) tblDisplayBookReciveRecordForDel.getModel();
        // set row
        Object[] row = new Object[6];
        // set data in table
        for (int i = 0; i < getBookRecive.size(); i++) {

            row[0] = getBookRecive.get(i).getId();
            row[1] = getBookRecive.get(i).getBookId();
            row[2] = getBookRecive.get(i).getLibMemberId();
            row[3] = getBookRecive.get(i).getSubmitDate();
            row[4] = getBookRecive.get(i).getQty();
            row[5] = getBookRecive.get(i).getSubmitBy();

            model.addRow(row);
        }

    }//GEN-LAST:event_btnSearchForDelBookReciveRecordActionPerformed

    private void txtSearchBarForAuthorRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchBarForAuthorRecordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarForAuthorRecordMouseClicked

    private void btnSearchAuthorRecordForDltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAuthorRecordForDltActionPerformed
        // TODO add your handling code here:

        /**
         * This method show all Author Information in Delete Panel, Search
         * information by ( Author name ), and show information in table
         */
        searchService = new SearchService();

        // get Author list from searchSeavice
        List<Author> getAuthorList = searchService.searchAuthorListByName(txtSearchBarForAuthorRecord.getText());
        // get model from table
        DefaultTableModel model = (DefaultTableModel) tblDisplayAuthorRecordForDel.getModel();
        // set row
        Object[] row = new Object[5];
        // Set data in table
        for (int i = 0; i < getAuthorList.size(); i++) {

            row[0] = getAuthorList.get(i).getId();
            row[1] = getAuthorList.get(i).getName();
            row[2] = getAuthorList.get(i).getDateOfBirth();
            row[3] = getAuthorList.get(i).getDateOfDead();
            row[4] = getAuthorList.get(i).getAbout();

            model.addRow(row);
        }

    }//GEN-LAST:event_btnSearchAuthorRecordForDltActionPerformed

    private void txtSearchBarForPublisherRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchBarForPublisherRecordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarForPublisherRecordMouseClicked

    private void btnSearchPublisharRecordForDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPublisharRecordForDelActionPerformed
        // TODO add your handling code here:

        /**
         * This method show all Publisher Information in Delete Panel, Search
         * information by ( Publisher name ), and show information in table
         */
        searchService = new SearchService();

        // get publishar list from searchService
        List<Publisher> getPublishers = searchService.searchPublisherListByName(txtSearchBarForPublisherRecord.getText());
        // get model from table
        DefaultTableModel model = (DefaultTableModel) tblDisplayPublisharRecordForDel.getModel();
        // set row
        Object[] row = new Object[2];

        // set data in table
        for (int i = 0; i < getPublishers.size(); i++) {

            row[0] = getPublishers.get(i).getId();
            row[1] = getPublishers.get(i).getName();

            model.addRow(row);
        }

    }//GEN-LAST:event_btnSearchPublisharRecordForDelActionPerformed

    private void txtSearchBarForEditionRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchBarForEditionRecordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarForEditionRecordMouseClicked

    private void btnSearchEditionRecordForDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEditionRecordForDelActionPerformed
        // TODO add your handling code here:

        /**
         * This method show all Edition Information in Delete Panel, Search
         * information by ( Edition name ), and show information in table
         */
        searchService = new SearchService();

        // get Edition list from sarchService class
        List<Edition> getEditionList = searchService.searchEditionListByName(txtSearchBarForEditionRecord.getText());
        //  get model from table
        DefaultTableModel model = (DefaultTableModel) tblDisplayEditionRecordForDel.getModel();
        // set row size
        Object[] row = new Object[2];

        for (int i = 0; i < getEditionList.size(); i++) {

            row[0] = getEditionList.get(i).getId();
            row[1] = getEditionList.get(i).getName();

            model.addRow(row);
        }

    }//GEN-LAST:event_btnSearchEditionRecordForDelActionPerformed

    private void txtSearchBarForCatagoryRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchBarForCatagoryRecordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarForCatagoryRecordMouseClicked


    private void btnSearchCatagoryRecordForDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCatagoryRecordForDelActionPerformed
        // TODO add your handling code here:

        /**
         * This method show all Category Information in Delete Panel, Search
         * information by ( Category name ), and show information in table
         */
        searchService = new SearchService();

        // get Category list from sarchService class
        List<Category> getCategorys = searchService.searchCategoryListByName(txtSearchBarForCatagoryRecord.getText());
        // get table mode 
        DefaultTableModel model = (DefaultTableModel) tblDisplayCatagoryRecordForDel.getModel();
        // set row
        Object[] row = new Object[2];
        // add row in table
        for (int i = 0; i < getCategorys.size(); i++) {

            row[0] = getCategorys.get(i).getId();
            row[1] = getCategorys.get(i).getName();

            model.addRow(row);
        }

    }//GEN-LAST:event_btnSearchCatagoryRecordForDelActionPerformed
//</editor-fold>
//
//<editor-fold defaultstate="collapsed" desc="{ Search panel [ Search all data ]  }">

    private void txtBookRecordSearchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBookRecordSearchBarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookRecordSearchBarMouseClicked

    private void txtMemberRecordSearchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMemberRecordSearchBarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberRecordSearchBarMouseClicked

    private void txtBookReciveRecordInSearchPanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBookReciveRecordInSearchPanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookReciveRecordInSearchPanMouseClicked

    private void txtIssueBookSearchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIssueBookSearchBarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIssueBookSearchBarMouseClicked

    private void btnSeachBookRecordInSearchPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachBookRecordInSearchPanActionPerformed
        // TODO add your handling code here:

        //--> This method show all Book Information in Delete Panel,
        //--> Search Book information by ( Book Code, ISSN no, Rack No, Category, Purchase Date)
        //--> And show information in table.
        /**
         * method: 1.searchBookRecordByBookCode(); 2.searchBookRecordByIssnNo();
         * 3.searchBookRecordByRackNo(); 4.searchBookRecordByCategory();
         * 5.searchBookRecordByPurchaseDate(); this all method come from-
         * SearchService Class.
         */
        searchService = new SearchService();
        List<BookInformation> getBookInformation = null; // create book Information list,
        // get table model from tblDisplayBookRecordInSearchPan table.
        DefaultTableModel model = (DefaultTableModel) tblDisplayBookRecordInSearchPan.getModel();
        Object[] row = new Object[13]; // create object array.

        // If radio button book code is selected then:
        // Search information by BOOK_CODE.
        if (radioBtnBookCode.isSelected()) {
            model.setRowCount(0); // Row count 0.
            /**
             * Call search method from searchServic Method {
             * searchBookRecordByBookCode(String book_code) }
             *
             * @return ( BookInformation List )
             */
            getBookInformation = searchService.searchBookRecordByBookCode(txtBookRecordSearchBar.getText());
        } // If radio button issn no is seleced then:
        // Search information by ISSN_NO.
        else if (radioBtnIssnNo.isSelected()) {
            model.setRowCount(0);
            getBookInformation = searchService.searchBookRecordByIssnNo(txtBookRecordSearchBar.getText());
        } // If radio button rack no is selected then:
        // Search information by RACK_NO.
        else if (radioBtnRackNo.isSelected()) {
            model.setRowCount(0); // row count 0.
            /**
             * call search method from searchService Method {
             * searchBookRecordByRackNo(int rack_no) }
             *
             * @return ( BookInformation list )
             */
            getBookInformation = searchService.searchBookRecordByRackNo(Integer.parseInt(txtBookRecordSearchBar.getText()));
        } // If radio button category is selected then:
        // Search information by CATEGORY.
        else if (radioBtnSelectCategory.isSelected()) {
            model.setRowCount(0);// row count 0
            /**
             * call search method from searchService Method {
             * searchBookRecordByCategory(String category) }
             *
             * @return ( Category list )
             */
            getBookInformation = searchService.searchBookRecordByCategory(comboCategoryListForSearchBookRecord.getSelectedItem().toString());
            txtBookRecordSearchBar.setText(comboCategoryListForSearchBookRecord.getSelectedItem().toString());
        } // If radio button purchase date is selected
        // Search information PURCHASE_DATE.
        else if (radioBtnSelectPurchaseDate.isSelected()) {
            model.setRowCount(0); // row count 0
            /**
             * call search method from searchService Method {
             * searchBookRecordByPurchaseDate(String purchase_date) }
             */
            String searchDate // set search date
                    = comboMonthForBookRecordInSearchPan.getSelectedItem().toString()
                    + " " + comboDayForBookRecordInSearchPan.getSelectedItem().toString()
                    + " " + comboYearForBookRecordInSearchPan.getSelectedItem().toString();

            getBookInformation = searchService.searchBookRecordByPurchaseDate(searchDate);
            txtBookRecordSearchBar.setText(searchDate);
        } // Other hand:
        /**
         * Set row count 0, Show massage in label,
         *
         */
        else {
            model.setRowCount(0); // model count 0
            txtBookRecordSearchBar.setForeground(Color.red); // set foreground color
            txtBookRecordSearchBar.setText("// Please 1st Select Any Item And Give Value //");
            getBookInformation = new ArrayList<>(); // initilaze list
        }

        // If getBookInformation is not null then,
        // set information in table
        if (getBookInformation != null) {

            // check size, and start loop
            for (int i = 0; i < getBookInformation.size(); i++) {

                row[0] = getBookInformation.get(i).getId();
                row[1] = getBookInformation.get(i).getName();
                row[2] = getBookInformation.get(i).getBookCode();
                row[3] = getBookInformation.get(i).getAuthor();
                row[4] = getBookInformation.get(i).getPublisher();
                row[5] = getBookInformation.get(i).getEdition();
                row[6] = getBookInformation.get(i).getUnitPrice();
                row[7] = getBookInformation.get(i).getQty();
                row[8] = getBookInformation.get(i).getTotalPrice();
                row[9] = getBookInformation.get(i).getRackNO();
                row[10] = getBookInformation.get(i).getIssnNo();
                row[11] = getBookInformation.get(i).getCategory();
                row[12] = getBookInformation.get(i).getPurchaseDate();

                model.addRow(row);
            }
        } else {
            txtBookRecordSearchBar.setForeground(Color.red);
            txtBookRecordSearchBar.setText(":: NO data in database ::");
        }


    }//GEN-LAST:event_btnSeachBookRecordInSearchPanActionPerformed

    /**
     * showCategpryListInSearchPanForSearchBookInformation(), this method show
     * category list in combo box, under search panel
     */
    private void showCategoriListInSearchPanForSearchBookInformation() {

        categoryService = new CategoryService();

        Set<Category> categoryList = categoryService.getCategorySet();

        // For each loop for show data in combo box
        categoryList.forEach((c) -> {
            comboCategoryListForSearchBookRecord.addItem(c.getName());
        });

    }

    private void btnSearchemberRecordInSearchPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchemberRecordInSearchPanActionPerformed
        // TODO add your handling code here:

        //--> This method show all Book Information in Delete Panel,
        //--> Search Book information by ( Book Code, ISSN no, Rack No, Category, Purchase Date)
        //--> And show information in table.
        /**
         * method: 1.searchBookRecordByBookCode(); 2.searchBookRecordByIssnNo();
         * 3.searchBookRecordByRackNo(); 4.searchBookRecordByCategory();
         * 5.searchBookRecordByPurchaseDate(); this all method come from-
         * SearchService Class.
         */
        searchService = new SearchService();
        List<LibraryMember> getLibraryMember = null; // create Library Member list
        // get table model from table
        DefaultTableModel model = (DefaultTableModel) tblDisplayMemberRecordInSearchPan.getModel();
        Object[] row = new Object[11]; // create object array

        // If member is is selected then:
        if (radioBtnMemberId.isSelected()) {
            model.setRowCount(0); // roew count 0,
            // call searchLibraryMemberInformationByMemberId method from searchService
            getLibraryMember = searchService.searchLibraryMemberInformationByMemberId(Integer.parseInt(txtMemberRecordSearchBar.getText()));
        } // If Member name is selected then:
        else if (radioBtnMemberName.isSelected()) {
            model.setRowCount(0); // tow count 0.
            // call searchLibraryMemberInformationByMemberName mathod from searchService
            getLibraryMember = searchService.searchLibraryMemberInformationByMemberName(txtMemberRecordSearchBar.getText());
        } // If thana is selected then:
        else if (radioBtnSelectThana.isSelected()) {
            model.setRowCount(0); // row count 0
            // call searchLibraryMemberInformationByMemberThana from searchService
            getLibraryMember = searchService.searchLibraryMemberInformationByMemberThana(comboMemberThanaInSearchPan.getSelectedItem().toString());
        } // on the other hand
        else {
            model.setRowCount(0); // reset table
            // Show message in text pan
            txtMemberRecordSearchBar.setForeground(Color.red);
            txtMemberRecordSearchBar.setText("// Please 1st Select Any Item And Give Value //");
            getLibraryMember = new ArrayList<>();
        }

        // If grtLibraryMember is not null then:
        if (getLibraryMember != null) {
            // start loop
            for (int i = 0; i < getLibraryMember.size(); i++) {

                row[0] = getLibraryMember.get(i).getId();
                row[1] = getLibraryMember.get(i).getMemberName();
                row[2] = getLibraryMember.get(i).getCardNo();
                row[3] = getLibraryMember.get(i).getContactInfo().getMobileNumber();
                row[4] = getLibraryMember.get(i).getContactInfo().getEmail();
                row[5] = getLibraryMember.get(i).getAddressInfo().getHouseNo();
                row[6] = getLibraryMember.get(i).getAddressInfo().getRoadNo();
                row[7] = getLibraryMember.get(i).getAddressInfo().getBlockOrVillage();
                row[8] = getLibraryMember.get(i).getAddressInfo().getThana();
                row[9] = getLibraryMember.get(i).getAddressInfo().getDistrict();
                row[10] = getLibraryMember.get(i).getAddressInfo().getDivision();

                model.addRow(row);
            }
        } else {
            // Show message
            txtMemberRecordSearchBar.setForeground(Color.red);
            txtMemberRecordSearchBar.setText(":: NO data in database ::");
        }


    }//GEN-LAST:event_btnSearchemberRecordInSearchPanActionPerformed

    // Show Thana list in combo box, under search panel.
    private void showMemberListInSearchPanForSearchBookInformation() {

        searchService = new SearchService();

        Set<LibraryMember> memberList = searchService.getMemberSet();

        // for each loop for show data in combo box
        memberList.forEach((c) -> {
            comboMemberThanaInSearchPan.addItem(c.getAddressInfo().getThana());
        });

    }


    private void btnSearchBookReciveRecordInSearchPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBookReciveRecordInSearchPanActionPerformed
        // TODO add your handling code here:

        //--> This method show all Book Information in Delete Panel,
        //--> Search Book information by ( Book Code, ISSN no, Rack No, Category, Purchase Date)
        //--> And show information in table.
        /**
         * method: 1.searchBookRecordByBookCode(); 2.searchBookRecordByIssnNo();
         * 3.searchBookRecordByRackNo(); 4.searchBookRecordByCategory();
         * 5.searchBookRecordByPurchaseDate(); this all method come from-
         * SearchService Class.
         */
        searchService = new SearchService();
        List<BookRecive> getBookRecive = null; // create BookRecive list
        // get table model from table
        DefaultTableModel model = (DefaultTableModel) tblDisplayBookReciveRecordInSearchPan.getModel();
        Object[] row = new Object[8]; // create object array

        // if member id is selected then:
        if (radioBtnSelecMemberId.isSelected()) {
            model.setRowCount(0); // reset table
            // call searchBookReciveListByMemberId from searchService
            getBookRecive = searchService.searchBookReciveListByMemberId(Integer.parseInt(txtBookReciveRecordInSearchPan.getText()));
        } // If submit librarian is selected then:
        else if (radioBtnSelectSubmintLibrarian.isSelected()) {
            model.setRowCount(0); // reset table
            // call searchBookReciveListBySubmitLibrarian from searchSerivce
            getBookRecive = searchService.searchBookReciveListBySubmitLibrarian(cobmoCategoryInSearchPan.getSelectedItem().toString());
        } // If submit date is selected then:
        else if (radioBtnSelectSubmitDate.isSelected()) {
            model.setRowCount(0); // reset table
            // set search date
            String searchDate = comboMonthForBookReciveInSearchPan.getSelectedItem().toString()
                    + " " + comboDayForBookReciveInSearchPan.getSelectedItem().toString()
                    + " " + comboYearForBookReciveInSearchPan.getSelectedItem().toString();
            // call searchBookReciveListBySubmitDate from searchService
            getBookRecive = searchService.searchBookReciveListBySubmitDate(searchDate);
        } // On the other hand
        else {
            model.setRowCount(0); // reset table
            // Show message in text pan
            txtBookReciveRecordInSearchPan.setForeground(Color.red);
            txtBookReciveRecordInSearchPan.setText("// Please 1st Select Any Item And Give Value //");
            getBookRecive = new ArrayList<>();
        }

        // If book Recive is not null then:
        if (getBookRecive != null) {
            // work loop for desplay information in table
            for (int i = 0; i < getBookRecive.size(); i++) {

                row[0] = getBookRecive.get(i).getId();
                row[1] = getBookRecive.get(i).getBookId();
                row[2] = getBookRecive.get(i).getLibMemberId();
                row[3] = getBookRecive.get(i).getSubmitDate();
                row[4] = getBookRecive.get(i).getQty();
                row[5] = getBookRecive.get(i).getSubmitBy();

                model.addRow(row);
            }
        } else {
            // Show message
            txtBookReciveRecordInSearchPan.setForeground(Color.red);
            txtBookReciveRecordInSearchPan.setText(":: NO data in database ::");
        }
    }//GEN-LAST:event_btnSearchBookReciveRecordInSearchPanActionPerformed

    // Show Librarian list in combo box,  under search panel
    private void showLibrarianSetInSearchPanel() {
        librarianService = new LibrarianService();

        Set<LibrarianAccount> librarianInformationList = librarianService.getLibrarianInfoSet();

        librarianInformationList.forEach((l) -> {
            cobmoCategoryInSearchPan.addItem(l.getName());
        });
    }

    private void btnSearchBookIssueInSearchPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBookIssueInSearchPanActionPerformed
        // TODO add your handling code here:

        //--> This method show all Book Information in Delete Panel,
        //--> Search Book information by ( Book Code, ISSN no, Rack No, Category, Purchase Date)
        //--> And show information in table.
        /**
         * method: 1.searchBookRecordByBookCode(); 2.searchBookRecordByIssnNo();
         * 3.searchBookRecordByRackNo(); 4.searchBookRecordByCategory();
         * 5.searchBookRecordByPurchaseDate(); this all method come from-
         * SearchService Class.
         */
        searchService = new SearchService();
        List<BookIssue> getBookIssue = null;  // create BookIssue  list
        // get table model from table
        DefaultTableModel model = (DefaultTableModel) tblDisplayIssueBookInSearchPan.getModel();
        Object[] row = new Object[8]; // create object array

        // If select issue date then:
        if (redioBtnSelectIssueDateForSearchBookReciveRecord.isSelected()) {
            model.setRowCount(0); // reset table
            // Set issue date in a variable
            String searchDate = comboIssueMonthForIssueBookInSearchPan.getSelectedItem().toString()
                    + " " + comboIssueDayForIssuBookInSearchPan.getSelectedItem().toString()
                    + " " + comboIssueYearForIssueBookInSearchPan.getSelectedItem().toString();
            // call selectIssueBookListByIssyeDate  from search service
            getBookIssue = searchService.selectIssueBookListByIssueDate(searchDate);
        } // If return date is selected then:
        else if (radioBtnSelecteReturnDateForSearchIssueRecord.isSelected()) {
            model.setRowCount(0);  // reset table
            // set searchDate in a variable
            String searchDate = comboReturnDayForIssueBookInSearchPan.getSelectedItem().toString()
                    + "-" + combooReturnMonthForIssueBookInSearchPan.getSelectedItem().toString()
                    + "-" + comboReturnYearForIssueBookInSearchPan.getSelectedItem().toString();
            // call selectIssueBookListByReturnDate from searchService
            getBookIssue = searchService.selectIssueBookListByReturnDate(searchDate);
        } // On the other hand
        else {
            model.setRowCount(0); // reset table
            // show message
            txtIssueBookSearchBar.setForeground(Color.red);
            txtIssueBookSearchBar.setText("// Please 1st Select Any Item And Give Value //");
            getBookIssue = new ArrayList<>();
        }

        // If getBookIssue is not null then:
        if (getBookIssue != null) {
            // Work loop for desplay all information in table
            for (int i = 0; i < getBookIssue.size(); i++) {

                row[0] = getBookIssue.get(i).getId();
                row[1] = getBookIssue.get(i).getBookId();
                row[2] = getBookIssue.get(i).getLibraryMemberId();
                row[3] = getBookIssue.get(i).getIssueDate();
                row[4] = getBookIssue.get(i).getReturnDate();
                row[5] = getBookIssue.get(i).getExpireDate();
                row[6] = getBookIssue.get(i).getQty();
                row[7] = getBookIssue.get(i).getStatus();

                model.addRow(row);
            }
        }

    }//GEN-LAST:event_btnSearchBookIssueInSearchPanActionPerformed
//</editor-fold>
//    
//<editor-fold defaultstate="collapsed" desc=" Delete Information { Book Information, Member Information, Book Recive Information, Author, Publisher, Edition, Category }">
    private void btnDeleteSeltBookRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSeltBookRecordActionPerformed
        // TODO add your handling code here:

        bookInformationService = new BookInformationService();

        int row = tblDisplayBookRecordForDlt.getSelectedRow();
        TableModel model = tblDisplayBookRecordForDlt.getModel();

        bookInformationService.deleteBookInformation(Integer.parseInt(model.getValueAt(row, 0).toString()));

        DefaultTableModel model_re = (DefaultTableModel) tblDisplayBookRecordForDlt.getModel();
        model_re.setRowCount(0);
    }//GEN-LAST:event_btnDeleteSeltBookRecordActionPerformed

    private void btnDeleteSeltMemberRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSeltMemberRecordActionPerformed
        // TODO add your handling code here:

        libraryMemberService = new LibraryMemberService();

        int row = tblDisplayMemberRecordForDlt.getSelectedRow();
        TableModel model = tblDisplayMemberRecordForDlt.getModel();

        libraryMemberService.deleteLibraryMemberInformation(Integer.parseInt(model.getValueAt(row, 0).toString()));

        DefaultTableModel model_re = (DefaultTableModel) tblDisplayMemberRecordForDlt.getModel();
        model_re.setRowCount(0);

    }//GEN-LAST:event_btnDeleteSeltMemberRecordActionPerformed

    private void btnDeleteSeltBookReciveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSeltBookReciveRecordActionPerformed
        // TODO add your handling code here:

        bookReciveService = new BookReciveService();

        int row = tblDisplayBookReciveRecordForDel.getSelectedRow();
        TableModel model = tblDisplayBookReciveRecordForDel.getModel();

        bookReciveService.deleteBookRecive(Integer.parseInt(model.getValueAt(row, 0).toString()));

        DefaultTableModel model_re = (DefaultTableModel) tblDisplayBookReciveRecordForDel.getModel();
        model_re.setRowCount(0);

    }//GEN-LAST:event_btnDeleteSeltBookReciveRecordActionPerformed

    private void btnDeleteAuthorRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAuthorRecordActionPerformed
        // TODO add your handling code here:
        authorService = new AuthorService();

        int row = tblDisplayAuthorRecordForDel.getSelectedRow();
        TableModel model = tblDisplayAuthorRecordForDel.getModel();

        authorService.deleteAuthorInformation(Integer.parseInt(model.getValueAt(row, 0).toString()));

        DefaultTableModel model_re = (DefaultTableModel) tblDisplayAuthorRecordForDel.getModel();
        model_re.setRowCount(0);

    }//GEN-LAST:event_btnDeleteAuthorRecordActionPerformed

    private void btnDeleteSeltPublisherRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSeltPublisherRecordActionPerformed
        // TODO add your handling code here:

        publisherService = new PublisherService();

        int row = tblDisplayPublisharRecordForDel.getSelectedRow();
        TableModel model = tblDisplayPublisharRecordForDel.getModel();

        publisherService.deletePublisher(Integer.parseInt(model.getValueAt(row, 0).toString()));

        DefaultTableModel model_re = (DefaultTableModel) tblDisplayPublisharRecordForDel.getModel();
        model_re.setRowCount(0);

    }//GEN-LAST:event_btnDeleteSeltPublisherRecordActionPerformed

    private void btnDeleteSeltEditionRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSeltEditionRecordActionPerformed
        // TODO add your handling code here:

        editionService = new EditionService();

        int row = tblDisplayEditionRecordForDel.getSelectedRow();
        TableModel model = tblDisplayEditionRecordForDel.getModel();

        editionService.deleteEdition(Integer.parseInt(model.getValueAt(row, 0).toString()));

        DefaultTableModel model_re = (DefaultTableModel) tblDisplayEditionRecordForDel.getModel();
        model_re.setRowCount(0);

    }//GEN-LAST:event_btnDeleteSeltEditionRecordActionPerformed

    private void btnDeleteSeltCatagoryRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSeltCatagoryRecordActionPerformed
        // TODO add your handling code here:

        categoryService = new CategoryService();

        int row = tblDisplayCatagoryRecordForDel.getSelectedRow();
        TableModel model = tblDisplayCatagoryRecordForDel.getModel();

        categoryService.deleteCategory(Integer.parseInt(model.getValueAt(row, 0).toString()));

        DefaultTableModel model_re = (DefaultTableModel) tblDisplayCatagoryRecordForDel.getModel();
        model_re.setRowCount(0);

    }//GEN-LAST:event_btnDeleteSeltCatagoryRecordActionPerformed
//</editor-fold>
//
//<editor-fold defaultstate="collapsed" desc="{Item state change}">
    private void comboCategoryListForSearchBookRecordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoryListForSearchBookRecordItemStateChanged
        // TODO add your handling code here:
        txtBookRecordSearchBar.setText(comboCategoryListForSearchBookRecord.getSelectedItem().toString());
    }//GEN-LAST:event_comboCategoryListForSearchBookRecordItemStateChanged

    private void comboMemberThanaInSearchPanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMemberThanaInSearchPanItemStateChanged
        // TODO add your handling code here:
        txtMemberRecordSearchBar.setText(comboMemberThanaInSearchPan.getSelectedItem().toString());
    }//GEN-LAST:event_comboMemberThanaInSearchPanItemStateChanged

    private void cobmoCategoryInSearchPanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cobmoCategoryInSearchPanItemStateChanged
        // TODO add your handling code here:
        txtBookReciveRecordInSearchPan.setText(cobmoCategoryInSearchPan.getSelectedItem().toString());
    }//GEN-LAST:event_cobmoCategoryInSearchPanItemStateChanged
//</editor-fold>
//
//<editor-fold defaultstate="collapsed" desc="{This method from Book_Recive panel}">
    private void btnReportMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMemberMouseEntered
        // TODO add your handling code here:
        btnReportMember.setForeground(Color.red);
    }//GEN-LAST:event_btnReportMemberMouseEntered

    // This method From Book_Recive Panel
    private void btnReportMemberMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMemberMouseReleased
        // TODO add your handling code here:
        btnReportMember.setForeground(Color.GREEN);
        //btnReportMember.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_btnReportMemberMouseReleased

    // This method From Book_Recive Panel
    private void btnReportMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMemberMouseExited
        // TODO add your handling code here:
        btnReportMember.setForeground(new java.awt.Color(153, 153, 153));
    }//GEN-LAST:event_btnReportMemberMouseExited
//</editor-fold>


    private void txtAvailableBookSearchBarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvailableBookSearchBarKeyTyped
        // TODO add your handling code here:

//        txtAvailableBookSearchBar.setForeground(new Color(153, 153, 153));
//        txtAvailableBookSearchBar.setText("Search By Member Code...");
//        if(txtAvailableBookSearchBar.getText().length()){      
//        }
    }//GEN-LAST:event_txtAvailableBookSearchBarKeyTyped

//
//<editor-fold defaultstate="collapsed" desc=" Clear table in Search panel">
    private void btnClearSearchRecord4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearSearchRecord4MouseEntered
        // TODO add your handling code here:
        btnClearSearchRecord4.setForeground(new Color(255, 102, 0));
    }//GEN-LAST:event_btnClearSearchRecord4MouseEntered

    private void btnClearSearchRecord4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearSearchRecord4MouseExited
        // TODO add your handling code here:
        btnClearSearchRecord4.setForeground(new Color(0, 153, 204));
    }//GEN-LAST:event_btnClearSearchRecord4MouseExited

    /**
     * clear book record search panel
     *
     * @param evt
     */
    private void btnClearSearchRecord4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSearchRecord4ActionPerformed
        // TODO add your handling code here:

        txtBookRecordSearchBar.setText(null);
        txtMemberRecordSearchBar.setText(null);
        txtBookReciveRecordInSearchPan.setText(null);
        txtIssueBookSearchBar.setText(null);

        DefaultTableModel model1 = (DefaultTableModel) tblDisplayBookRecordInSearchPan.getModel();
        model1.setRowCount(0);

        DefaultTableModel model2 = (DefaultTableModel) tblDisplayMemberRecordInSearchPan.getModel();
        model2.setRowCount(0);

        DefaultTableModel model3 = (DefaultTableModel) tblDisplayBookReciveRecordInSearchPan.getModel();
        model3.setRowCount(0);

        DefaultTableModel model4 = (DefaultTableModel) tblDisplayIssueBookInSearchPan.getModel();
        model4.setRowCount(0);

        showCategoriListInSearchPanForSearchBookInformation();
        showMemberListInSearchPanForSearchBookInformation();

    }//GEN-LAST:event_btnClearSearchRecord4ActionPerformed

    private void btnClearSearchRecord3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearSearchRecord3MouseEntered
        // TODO add your handling code here:
        btnClearSearchRecord3.setForeground(new Color(255, 102, 0));
    }//GEN-LAST:event_btnClearSearchRecord3MouseEntered

    private void btnClearSearchRecord3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearSearchRecord3MouseExited
        // TODO add your handling code here:
        btnClearSearchRecord3.setForeground(new Color(0, 153, 204));
    }//GEN-LAST:event_btnClearSearchRecord3MouseExited

    /**
     * clear issue book search panel
     *
     * @param evt
     */
    private void btnClearSearchRecord3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSearchRecord3ActionPerformed
        // TODO add your handling code here:

        txtBookRecordSearchBar.setText(null);
        txtMemberRecordSearchBar.setText(null);
        txtBookReciveRecordInSearchPan.setText(null);
        txtIssueBookSearchBar.setText(null);

        DefaultTableModel model1 = (DefaultTableModel) tblDisplayBookRecordInSearchPan.getModel();
        model1.setRowCount(0);

        DefaultTableModel model2 = (DefaultTableModel) tblDisplayMemberRecordInSearchPan.getModel();
        model2.setRowCount(0);

        DefaultTableModel model3 = (DefaultTableModel) tblDisplayBookReciveRecordInSearchPan.getModel();
        model3.setRowCount(0);

        DefaultTableModel model4 = (DefaultTableModel) tblDisplayIssueBookInSearchPan.getModel();
        model4.setRowCount(0);

        showCategoriListInSearchPanForSearchBookInformation();
        showMemberListInSearchPanForSearchBookInformation();

    }//GEN-LAST:event_btnClearSearchRecord3ActionPerformed

    private void btnClearSearchRecord1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearSearchRecord1MouseEntered
        // TODO add your handling code here:
        btnClearSearchRecord1.setForeground(new Color(255, 102, 0));
    }//GEN-LAST:event_btnClearSearchRecord1MouseEntered

    private void btnClearSearchRecord1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearSearchRecord1MouseExited
        // TODO add your handling code here:
        btnClearSearchRecord1.setForeground(new Color(0, 153, 204));
    }//GEN-LAST:event_btnClearSearchRecord1MouseExited

    /**
     * clear book record search panel
     *
     * @param evt
     */
    private void btnClearSearchRecord1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSearchRecord1ActionPerformed
        // TODO add your handling code here:
        txtBookRecordSearchBar.setText(null);
        txtMemberRecordSearchBar.setText(null);
        txtBookReciveRecordInSearchPan.setText(null);
        txtIssueBookSearchBar.setText(null);

        DefaultTableModel model1 = (DefaultTableModel) tblDisplayBookRecordInSearchPan.getModel();
        model1.setRowCount(0);

        DefaultTableModel model2 = (DefaultTableModel) tblDisplayMemberRecordInSearchPan.getModel();
        model2.setRowCount(0);

        DefaultTableModel model3 = (DefaultTableModel) tblDisplayBookReciveRecordInSearchPan.getModel();
        model3.setRowCount(0);

        DefaultTableModel model4 = (DefaultTableModel) tblDisplayIssueBookInSearchPan.getModel();
        model4.setRowCount(0);

        showCategoriListInSearchPanForSearchBookInformation();
        showMemberListInSearchPanForSearchBookInformation();

    }//GEN-LAST:event_btnClearSearchRecord1ActionPerformed

    private void btnClearSearchRecord2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearSearchRecord2MouseEntered
        // TODO add your handling code here:
        btnClearSearchRecord2.setForeground(new Color(255, 102, 0));
    }//GEN-LAST:event_btnClearSearchRecord2MouseEntered

    private void btnClearSearchRecord2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearSearchRecord2MouseExited
        // TODO add your handling code here:
        btnClearSearchRecord2.setForeground(new Color(0, 153, 204));
    }//GEN-LAST:event_btnClearSearchRecord2MouseExited

    /**
     * clear book record search panel
     *
     * @param evt
     */
    private void btnClearSearchRecord2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSearchRecord2ActionPerformed
        // TODO add your handling code here:

        txtBookRecordSearchBar.setText(null);
        txtMemberRecordSearchBar.setText(null);
        txtBookReciveRecordInSearchPan.setText(null);
        txtIssueBookSearchBar.setText(null);

        DefaultTableModel model1 = (DefaultTableModel) tblDisplayBookRecordInSearchPan.getModel();
        model1.setRowCount(0);

        DefaultTableModel model2 = (DefaultTableModel) tblDisplayMemberRecordInSearchPan.getModel();
        model2.setRowCount(0);

        DefaultTableModel model3 = (DefaultTableModel) tblDisplayBookReciveRecordInSearchPan.getModel();
        model3.setRowCount(0);

        DefaultTableModel model4 = (DefaultTableModel) tblDisplayIssueBookInSearchPan.getModel();
        model4.setRowCount(0);

        showCategoriListInSearchPanForSearchBookInformation();
        showMemberListInSearchPanForSearchBookInformation();

    }//GEN-LAST:event_btnClearSearchRecord2ActionPerformed
//</editor-fold>
//
//<editor-fold defaultstate="collapsed" desc=" Code for Librarian panel ">
    private void btnClearDelShowAdminInfoPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearDelShowAdminInfoPanActionPerformed
        // TODO add your handling code here:
        clearLibrarianSearchOption();
        clearTableForLibrarianInformation();
    }//GEN-LAST:event_btnClearDelShowAdminInfoPanActionPerformed

    private void btnClearDelShowAdminInfoPanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearDelShowAdminInfoPanMouseExited
        // TODO add your handling code here:
        btnClearDelShowAdminInfoPan.setForeground(new Color(0, 153, 204));
    }//GEN-LAST:event_btnClearDelShowAdminInfoPanMouseExited

    private void btnClearDelShowAdminInfoPanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearDelShowAdminInfoPanMouseEntered
        // TODO add your handling code here:
        btnClearDelShowAdminInfoPan.setForeground(new Color(255, 102, 0));
    }//GEN-LAST:event_btnClearDelShowAdminInfoPanMouseEntered

    /**
     * this method search librarian account and show data. from librarian panel.
     *
     * @param evt
     */
    private void btnSearchLibrarianAccountInAdminPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchLibrarianAccountInAdminPanActionPerformed
        // TODO add your handling code here:

        librarianService = new LibrarianService();

        librarianAccount = librarianService.searchLibrarianAccountByCodeNo(Integer.parseInt(txtLibrarianAccountSearchBarInAdminPan.getText()));
        if (librarianAccount.getName() != null) {
            librarianID = librarianAccount.getId();
            lblShowLibrarianNameInAdminPan.setText(librarianAccount.getName());
            lblShowLibrarianCodeNoInAdminPan.setText(String.valueOf(librarianAccount.getCodeNumber()));
            lblShowLibrarianMobileNumberInAdminPan.setText(librarianAccount.getContactInfo().getMobileNumber());
            lblShowLibrarianEmailInAdminPan.setText(librarianAccount.getContactInfo().getEmail());
            lblShowLibrarianAddressInAdminPan.setText(
                    librarianAccount.getAddressInfo().getHouseNo()
                    + ", " + librarianAccount.getAddressInfo().getRoadNo()
                    + ", " + librarianAccount.getAddressInfo().getBlockOrVillage()
                    + ", " + librarianAccount.getAddressInfo().getThana()
                    + ", " + librarianAccount.getAddressInfo().getDistrict()
                    + ", " + librarianAccount.getAddressInfo().getDivision()
            );
            lblShowDelLibrarianAccountPan1.setText(null);
        } else {
            lblShowDelLibrarianAccountPan1.setText("This code number not available in databese");
        }

    }//GEN-LAST:event_btnSearchLibrarianAccountInAdminPanActionPerformed

    private void displayLibrarianInformationWithInTable() {

        librarianService = new LibrarianService();

        List<LibrarianAccount> getLibrarian = librarianService.getLibrarianInformationList();
        DefaultTableModel model = (DefaultTableModel) tblDisplayLibrarianAccountInAdminInfoPan.getModel();
        Object[] row = new Object[12];

        for (int i = 0; i < getLibrarian.size(); i++) {

            row[0] = getLibrarian.get(i).getId();
            row[1] = getLibrarian.get(i).getName();
            row[2] = getLibrarian.get(i).getCodeNumber();
            row[3] = getLibrarian.get(i).getContactInfo().getMobileNumber();
            row[4] = getLibrarian.get(i).getContactInfo().getEmail();
            row[5] = getLibrarian.get(i).getAddressInfo().getHouseNo();
            row[6] = getLibrarian.get(i).getAddressInfo().getRoadNo();
            row[7] = getLibrarian.get(i).getAddressInfo().getBlockOrVillage();
            row[8] = getLibrarian.get(i).getAddressInfo().getThana();
            row[9] = getLibrarian.get(i).getAddressInfo().getDistrict();
            row[10] = getLibrarian.get(i).getAddressInfo().getDivision();
            row[11] = getLibrarian.get(i).getShift();

            model.addRow(row);
        }
    }

    private void clearTableForLibrarianInformation() {

        DefaultTableModel model = (DefaultTableModel) tblDisplayLibrarianAccountInAdminInfoPan.getModel();
        model.setRowCount(0);

        displayLibrarianInformationWithInTable();

    }
//</editor-fold>

    /**
     * clear librarian Search option
     */
    private void clearLibrarianSearchOption() {

        lblShowLibrarianNameInAdminPan.setText(null);
        lblShowLibrarianCodeNoInAdminPan.setText(null);
        lblShowLibrarianMobileNumberInAdminPan.setText(null);
        lblShowLibrarianEmailInAdminPan.setText(null);
        lblShowLibrarianAddressInAdminPan.setText(null);
        lblShowDelLibrarianAccountPan1.setText(null);
        clearTableForLibrarianInformation();
    }


    private void tblDisplayLibrarianAccountInAdminInfoPanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayLibrarianAccountInAdminInfoPanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDisplayLibrarianAccountInAdminInfoPanMouseClicked

    private void btnRefreshTableAvailBookListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableAvailBookListActionPerformed
        // TODO add your handling code here:
        DefaultTableModel _model = (DefaultTableModel) tblShowAvailableBookList.getModel();
        _model.setRowCount(0);

        DefaultTableModel m_model = (DefaultTableModel) tblDisplayAllBookListInAvailPan.getModel();
        m_model.setRowCount(0);

        showAllAvailableBookInTable();
    }//GEN-LAST:event_btnRefreshTableAvailBookListActionPerformed

    private void btnRefreshTableForShowAllBookInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableForShowAllBookInfoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel _model = (DefaultTableModel) tblShowAvailableBookList.getModel();
        _model.setRowCount(0);

        DefaultTableModel m_model = (DefaultTableModel) tblDisplayAllBookListInAvailPan.getModel();
        m_model.setRowCount(0);

        showAllAvailableBookInTable();
    }//GEN-LAST:event_btnRefreshTableForShowAllBookInfoActionPerformed

    private void lblShowAllIssueBookRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowAllIssueBookRecordMouseClicked
        // TODO add your handling code here:
        new ShowIssueBook().setVisible(true);
    }//GEN-LAST:event_lblShowAllIssueBookRecordMouseClicked

    private void lblShowAllMemberRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowAllMemberRecordMouseClicked
        // TODO add your handling code here:
        new ShowAllMemberList().setVisible(true);
    }//GEN-LAST:event_lblShowAllMemberRecordMouseClicked

    private void lblShowAllBookRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowAllBookRecordMouseClicked
        // TODO add your handling code here:
        new ShowAllBookInformation().setVisible(true);
    }//GEN-LAST:event_lblShowAllBookRecordMouseClicked

    /**
     * This method Refresh all information in this program,
     *
     * @param evt
     */
    //<editor-fold defaultstate="collapsed" desc=" This method Refresh all information ">
    private void btnRefreshAllInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshAllInformationActionPerformed
        // TODO add your handling code here:

        // From Deshbord
        showTopBookListInDeshbord();
        showTotalCalInDeshbord();
        showStudentListInDeshbord();

        // From Available Book
        resetAvailableBookTable();

        // From Issue Book
        clearTableForBookIssue();
        resetBookIssue();
        displayBookListInBookIssue();
        displayLibraryMemberListInBookIssue();
        showLibrarianSetInIssuePanel();

        // From Book recive
        clearTableForBookRecive();
        clearTableForShowIssuBookInBookRecive();
        showLibrarianSetInRecivePanel();

        // From add book
        clearTableForBookInformation();
        resetBookInformation();
        displayAuthorListInBookInfo();
        displayPublisherListInBookInfo();
        displayEditionListInBookInfo();
        displayCategoryListInBookInfo();

        // From add Member
        clearTableForLibraryMemberInformation();
        resetLibraryMemberInformation();

        // From create author
        clearTableForAuthorInformation();
        resetAuthorInformation();

        // From add edition
        clearTableForEditionInformation();
        resetEditionInformation();

        // From add publisher
        clearTableForPublisherInformation();
        resetPublisherInformation();

        // From add catagory 
        clearTableForCatagoryInformation();
        resetCatagoryInformation();

        // From librarian system
        clearLibrarianSearchOption();
        clearTableForLibrarianInformation();

        // From search panel
        showCategoriListInSearchPanForSearchBookInformation();
        showMemberListInSearchPanForSearchBookInformation();
        showLibrarianSetInSearchPanel();

        // From librarian panel
        clearTableForLibrarianInformation();
    }//GEN-LAST:event_btnRefreshAllInformationActionPerformed
//</editor-fold>
    //
    //<editor-fold defaultstate="collapsed" desc=" This method from Book_Recive panel [[ Report member ]]">
    private void btnReportMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportMemberActionPerformed
        //TODO add your handling code here:
        int row = tblDisplayShowIssuBookInBookRecive.getSelectedRow(); // Get selected row from table.
        TableModel model = tblDisplayShowIssuBookInBookRecive.getModel();// get table model form table.

        // give member id in this method, and edit member [ Report ] information.
        libraryMemberService.editMemberReport(Integer.parseInt(model.getValueAt(row, 2).toString()));
    }//GEN-LAST:event_btnReportMemberActionPerformed
//</editor-fold>
    
    
    /**
     * Add about us panel, in main panel.
     * @param evt 
     */
    private void btnAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsActionPerformed
        // TODO add your handling code here:
        
        
        /**
         * Add the panel in main panel,
         *
         * < removeAll() /> this method remove all panel in main panel,
         * < repaint() /> this method repaint all panel in main panel,
         * < revalidate() /> ,
         * < add() /> this method add panel in main panel.
         */
        mainPan.removeAll();
        mainPan.repaint();
        mainPan.revalidate();

        mainPan.add(jpanAboutThis);
        mainPan.repaint();
        mainPan.revalidate();
           
    }//GEN-LAST:event_btnAboutUsActionPerformed


    /**
     * Show All Information in Deshbord, From DESHBORD panel,
     */
    //<editor-fold defaultstate="collapsed" desc="Show_all information in Deshbord">
    /**
     * @showTopBookListInDeshbord(), this method show book list in deshbord,
     */
    private void showTopBookListInDeshbord() {

        bookInformationService = new BookInformationService();// Create new object.

        List<BookInformation> getInfo = bookInformationService.getBooListForDeshbord();// get book information list.

        // Set all information in label in deshbord pan,
        lblDeshbordBookName1.setText(getInfo.get(0).getName());
        lblDeshbordBookCode1.setText(getInfo.get(0).getBookCode());
        lblDeshbordAuthorName1.setText(getInfo.get(0).getAuthor());
        lblDeshBordPublishaerName1.setText(getInfo.get(0).getPublisher());
        lblDeshbordUnitPrice1.setText(String.valueOf(getInfo.get(0).getUnitPrice()));
        lblDeshbordTotalPrice1.setText(String.valueOf(getInfo.get(0).getTotalPrice()));

        lblDeshbordBookName2.setText(getInfo.get(1).getName());
        lblDeshbordBookCode2.setText(getInfo.get(1).getBookCode());
        lblDeshbordAuthorName2.setText(getInfo.get(1).getAuthor());
        lblDeshbordPublishername2.setText(getInfo.get(1).getPublisher());
        lblDeshbordUnitPrice2.setText(String.valueOf(getInfo.get(1).getUnitPrice()));
        lblDeshbordTotalPrice2.setText(String.valueOf(getInfo.get(1).getTotalPrice()));

        lblDeshbordBookName3.setText(getInfo.get(2).getName());
        lblDeshbordBookCode3.setText(getInfo.get(2).getBookCode());
        lblDeshbordAuthorName3.setText(getInfo.get(2).getAuthor());
        lblDeshbordPublisharName3.setText(getInfo.get(2).getPublisher());
        lblDshbordUnitPrice3.setText(String.valueOf(getInfo.get(2).getUnitPrice()));
        lblDeshbordTotalPrice3.setText(String.valueOf(getInfo.get(2).getTotalPrice()));

        lblDeshbordBookName4.setText(getInfo.get(3).getName());
        lblDeshbordBookCode4.setText(getInfo.get(3).getBookCode());
        lblDeshbordAuthorName4.setText(getInfo.get(3).getAuthor());
        lblDeshbordPublisherName4.setText(getInfo.get(3).getPublisher());
        lblDeshbordUnitPrice4.setText(String.valueOf(getInfo.get(3).getUnitPrice()));
        lblDeshbordTotalPrice4.setText(String.valueOf(getInfo.get(3).getTotalPrice()));

    }

    /**
     * @showTotalCalInDeshbord(), this method show total number list in
     * deshbord,
     */
    private void showTotalCalInDeshbord() {

        clearTableForLibraryMemberInformation();// Call method for clear library_information_table.
        clearTableForBookInformation();// Call method for clear book_information_table.
        clearTableForBookIssue();// Call method for clear book_issue_table.
        clearTableForBookRecive();// Call method for clear book_recive_table.

        lblDeshbordShowTotalBookNumber.setText(String.valueOf(totalBook));// Set total book number in deshbord.
        lblDeshbordShowTotalIssueNumber.setText(String.valueOf(totalIssueBook));// Set total issue book number in deshbord.
        lblDeshbordShowTotalMemberNumber.setText(String.valueOf(totalMember));// Set total member number in deshbord.
        lblDeshbordShowTotalReciveNumber.setText(String.valueOf(totalReciveBook));// Set total recive book number in deshbord.
    }

    /**
     * @showStudentListInDeshbord(), this method show Student list in deshbord,
     */
    private void showStudentListInDeshbord() {

        libraryMemberService = new LibraryMemberService();// create new object.

        List<LibraryMember> getMember = libraryMemberService.getLibraryMemberInformationListForDeshbord();// get member list.

        for (int i = 0; i < getMember.size(); i++) {

            if (i == 0) {
                lblDeshbordMemberName1.setText(getMember.get(0).getMemberName());
                lblDeshbordMemberID1.setText(String.valueOf(getMember.get(0).getCardNo()));
                lblDeshborMemberMobileNo1.setText(getMember.get(0).getContactInfo().getMobileNumber());
                lblDeshbordMemberEmail1.setText(getMember.get(0).getContactInfo().getEmail());
            }

            if (i == 1) {
                lblDeshbordMemberName2.setText(getMember.get(1).getMemberName());
                lblDeshbordMemberID2.setText(String.valueOf(getMember.get(1).getCardNo()));
                lblDeshbordMemberMobileNo2.setText(getMember.get(1).getContactInfo().getMobileNumber());
                lblDeshbordMemberEmail2.setText(getMember.get(1).getContactInfo().getEmail());
            }
            if (i == 2) {
                lblDeshbordMemberName3.setText(getMember.get(2).getMemberName());
                lblDeshbordMemberID3.setText(String.valueOf(getMember.get(2).getCardNo()));
                lblDeshbordMemberMobileNo3.setText(getMember.get(2).getContactInfo().getMobileNumber());
                lblDeshbordMemberEmail3.setText(getMember.get(2).getContactInfo().getEmail());
            }
            if (i == 3) {
                lblDeshbordMemberName4.setText(getMember.get(3).getMemberName());
                lblDeshbordMemberID4.setText(String.valueOf(getMember.get(3).getCardNo()));
                lblDeshbordMemberMobileNo4.setText(getMember.get(3).getContactInfo().getMobileNumber());
                lblDeshbordMemberEmail4.setText(getMember.get(3).getContactInfo().getEmail());
            }
        }

    }
//</editor-fold>
    //
    //<editor-fold defaultstate="collapsed" desc="{This method set Date and day}">

    private void showDateAndDay() {

        Date date = new Date();

        showDate = new SimpleDateFormat("MMMM dd yyyy");
        currentDate = showDate.format(date);
        lblDate.setText(showDate.format(date));
        //System.out.println(showDate.format(date));

        showDay = new SimpleDateFormat("EEEE");
        lblDay.setText("[ " + showDay.format(date) + " ]");
        //System.out.println(showDay.format(date));
    }

    //</editor-fold>
    //
    //<editor-fold defaultstate="collapsed" desc=" This method set login status ">
    public void setValue(String loginStatus) {

        if (loginStatus.equals("user")) {
            lognValue = 112345;
        } else if (loginStatus.equals("superUser")) {
            lognValue = 543211;
        } else {
            lognValue = 0;
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="{This method from Book_Recive panel}">//</editor-fold>
////    /**
////     * @param args the command line arguments
////     */
//    public static void main(String args[]) {
////        /* Set the Nimbus look and feel */
////        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
////        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
////         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
////         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainFream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainFream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainFream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainFream.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
////
////        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new MainFream().setVisible(true);
//            }
//        });
//    }
    
    
    
    //<editor-fold defaultstate="collapsed" desc="{ variables declaration }">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar addBookScrolBar;
    private javax.swing.JScrollBar addMemberScrolBar;
    private javax.swing.JScrollBar adminInfoDtlsScrolBar;
    private javax.swing.JScrollBar bookAvaliBordScrolBar;
    private javax.swing.JScrollBar bookReciveScrolBar;
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JButton btnAddAutorRecord;
    private javax.swing.JButton btnAddBookIssueRecord;
    private javax.swing.JButton btnAddCatagoryRecord;
    private javax.swing.JButton btnAddEditionRecord;
    private javax.swing.JButton btnAddMemberRecord;
    private javax.swing.JButton btnAddPublisherRecord;
    private javax.swing.JButton btnAddRecord;
    private javax.swing.JButton btnBookReciveSearch;
    private javax.swing.JButton btnClearDelShowAdminInfoPan;
    private javax.swing.JButton btnClearSearchRecord1;
    private javax.swing.JButton btnClearSearchRecord2;
    private javax.swing.JButton btnClearSearchRecord3;
    private javax.swing.JButton btnClearSearchRecord4;
    private javax.swing.JButton btnDeleteAuthorRecord;
    private javax.swing.JButton btnDeleteSeltBookReciveRecord;
    private javax.swing.JButton btnDeleteSeltBookRecord;
    private javax.swing.JButton btnDeleteSeltCatagoryRecord;
    private javax.swing.JButton btnDeleteSeltEditionRecord;
    private javax.swing.JButton btnDeleteSeltMemberRecord;
    private javax.swing.JButton btnDeleteSeltPublisherRecord;
    private javax.swing.JButton btnEditMemberRecord;
    private javax.swing.JButton btnEditeRecord;
    private javax.swing.JPanel btnPanAddBookRecord;
    private javax.swing.JPanel btnPanAddMemeberRecord;
    private javax.swing.JPanel btnPanBookAvailCheck;
    private javax.swing.JPanel btnPanBookRecive;
    private javax.swing.JPanel btnPanCreateAdminAccount;
    private javax.swing.JPanel btnPanCreateOtherDetails;
    private javax.swing.JPanel btnPanDashboard;
    private javax.swing.JPanel btnPanDeleteAllRecord;
    private javax.swing.JPanel btnPanIssueBook;
    private javax.swing.JPanel btnPanSearchAllRecord;
    private javax.swing.JPanel btnPanSuperUserInformation;
    private javax.swing.JButton btnReciveBook;
    private javax.swing.JButton btnRefreshAllInformation;
    private javax.swing.JButton btnRefreshTableAvailBookList;
    private javax.swing.JButton btnRefreshTableForShowAllBookInfo;
    private javax.swing.JButton btnReportMember;
    private javax.swing.JButton btnSeachBookRecordInSearchPan;
    private javax.swing.JButton btnSearchAuthorRecordForDlt;
    private javax.swing.JButton btnSearchAvailableBook;
    private javax.swing.JButton btnSearchBookIssueInSearchPan;
    private javax.swing.JButton btnSearchBookReciveRecordInSearchPan;
    private javax.swing.JButton btnSearchCatagoryRecordForDel;
    private javax.swing.JButton btnSearchEditionRecordForDel;
    private javax.swing.JButton btnSearchForDelBookReciveRecord;
    private javax.swing.JButton btnSearchForDelMemberRecord;
    private javax.swing.JButton btnSearchForDltBookRecord;
    private javax.swing.JButton btnSearchLibrarianAccountInAdminPan;
    private javax.swing.JButton btnSearchPublisharRecordForDel;
    private javax.swing.JButton btnSearchemberRecordInSearchPan;
    private javax.swing.JPanel buttomDownPanel;
    private javax.swing.ButtonGroup buttonGroupForLibrarianAccountPan;
    private javax.swing.ButtonGroup buttonGroupForSearchPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JCheckBox checkBoxAliveForAuthor;
    private javax.swing.JComboBox<String> cobmoCategoryInSearchPan;
    private javax.swing.JComboBox<String> comboBookIssueBookId;
    private javax.swing.JComboBox<String> comboBookIssueMemberId;
    private javax.swing.JComboBox<String> comboBookIssueSubmitLibrarian;
    private javax.swing.JComboBox<String> comboBookRecordAuthorList;
    private javax.swing.JComboBox<String> comboBookRecordCategoryList;
    private javax.swing.JComboBox<String> comboBookRecordEditionList;
    private javax.swing.JComboBox<String> comboBookRecordPublisherList;
    private javax.swing.JComboBox<String> comboCategoryListForSearchBookRecord;
    private javax.swing.JComboBox<String> comboDayForAuthorBirth;
    private javax.swing.JComboBox<String> comboDayForAuthorDeath;
    private javax.swing.JComboBox<String> comboDayForBookReciveInSearchPan;
    private javax.swing.JComboBox<String> comboDayForBookRecordInSearchPan;
    private javax.swing.JComboBox<String> comboExptDayForBookIssue;
    private javax.swing.JComboBox<String> comboExptMonthForBookIssue;
    private javax.swing.JComboBox<String> comboExptYearForBookIssue;
    private javax.swing.JComboBox<String> comboIssueDayForIssuBookInSearchPan;
    private javax.swing.JComboBox<String> comboIssueMonthForIssueBookInSearchPan;
    private javax.swing.JComboBox<String> comboIssueYearForIssueBookInSearchPan;
    private javax.swing.JComboBox<String> comboMemberDistrict;
    private javax.swing.JComboBox<String> comboMemberDivision;
    private javax.swing.JComboBox<String> comboMemberThanaInSearchPan;
    private javax.swing.JComboBox<String> comboMonthForAuthorBirth;
    private javax.swing.JComboBox<String> comboMonthForAuthorDeath;
    private javax.swing.JComboBox<String> comboMonthForBookReciveInSearchPan;
    private javax.swing.JComboBox<String> comboMonthForBookRecordInSearchPan;
    private javax.swing.JComboBox<String> comboReturnDayForBookIssue;
    private javax.swing.JComboBox<String> comboReturnDayForIssueBookInSearchPan;
    private javax.swing.JComboBox<String> comboReturnMonthForBookIssue;
    private javax.swing.JComboBox<String> comboReturnYearForBookIssue;
    private javax.swing.JComboBox<String> comboReturnYearForIssueBookInSearchPan;
    private javax.swing.JComboBox<String> comboSubmitLibrarianForBookRecive;
    private javax.swing.JComboBox<String> comboYearForAuthorBirth;
    private javax.swing.JComboBox<String> comboYearForAuthorDeath;
    private javax.swing.JComboBox<String> comboYearForBookReciveInSearchPan;
    private javax.swing.JComboBox<String> comboYearForBookRecordInSearchPan;
    private javax.swing.JComboBox<String> combooReturnMonthForIssueBookInSearchPan;
    private javax.swing.JScrollBar createBookDtlsScrolBar;
    private javax.swing.JScrollBar dashBordScrolBar;
    private javax.swing.JScrollBar deleteRecordScrolBar;
    private javax.swing.JScrollBar issueBookScrolBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JPanel jpanAboutThis;
    private javax.swing.JPanel jpanAddBookRecord;
    private javax.swing.JPanel jpanAddMemberRecord;
    private javax.swing.JPanel jpanBookAvaliCheck;
    private javax.swing.JPanel jpanBookRecive;
    private javax.swing.JPanel jpanCreateBookDetails;
    private javax.swing.JPanel jpanDashboard;
    private javax.swing.JPanel jpanDeleteRecord;
    private javax.swing.JPanel jpanIssueBook;
    private javax.swing.JPanel jpanSearchRecord;
    private javax.swing.JPanel jpanShowAdminInformation;
    private javax.swing.JPanel jpanSuperUserInformation;
    private javax.swing.JLabel lblAddBookRecord;
    private javax.swing.JLabel lblAddMemberRecord;
    private javax.swing.JLabel lblBookAvailCheck;
    private javax.swing.JLabel lblBookRecive;
    private javax.swing.JLabel lblBookRecordShowMsg;
    private javax.swing.JLabel lblCreateAdminAccount;
    private javax.swing.JLabel lblCreateOtherDetails;
    private javax.swing.JLabel lblDashboard;
    public static javax.swing.JLabel lblDate;
    public static javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblDeleteAllRecord;
    private javax.swing.JLabel lblDeshBordPublishaerName1;
    private javax.swing.JLabel lblDeshborMemberMobileNo1;
    private javax.swing.JLabel lblDeshbordAuthorName1;
    private javax.swing.JLabel lblDeshbordAuthorName2;
    private javax.swing.JLabel lblDeshbordAuthorName3;
    private javax.swing.JLabel lblDeshbordAuthorName4;
    private javax.swing.JLabel lblDeshbordBookCode1;
    private javax.swing.JLabel lblDeshbordBookCode2;
    private javax.swing.JLabel lblDeshbordBookCode3;
    private javax.swing.JLabel lblDeshbordBookCode4;
    private javax.swing.JLabel lblDeshbordBookName1;
    private javax.swing.JLabel lblDeshbordBookName2;
    private javax.swing.JLabel lblDeshbordBookName3;
    private javax.swing.JLabel lblDeshbordBookName4;
    private javax.swing.JLabel lblDeshbordMemberEmail1;
    private javax.swing.JLabel lblDeshbordMemberEmail2;
    private javax.swing.JLabel lblDeshbordMemberEmail3;
    private javax.swing.JLabel lblDeshbordMemberEmail4;
    private javax.swing.JLabel lblDeshbordMemberID1;
    private javax.swing.JLabel lblDeshbordMemberID2;
    private javax.swing.JLabel lblDeshbordMemberID3;
    private javax.swing.JLabel lblDeshbordMemberID4;
    private javax.swing.JLabel lblDeshbordMemberMobileNo2;
    private javax.swing.JLabel lblDeshbordMemberMobileNo3;
    private javax.swing.JLabel lblDeshbordMemberMobileNo4;
    private javax.swing.JLabel lblDeshbordMemberName1;
    private javax.swing.JLabel lblDeshbordMemberName2;
    private javax.swing.JLabel lblDeshbordMemberName3;
    private javax.swing.JLabel lblDeshbordMemberName4;
    private javax.swing.JLabel lblDeshbordPublisharName3;
    private javax.swing.JLabel lblDeshbordPublisherName4;
    private javax.swing.JLabel lblDeshbordPublishername2;
    private javax.swing.JLabel lblDeshbordShowTotalBookNumber;
    private javax.swing.JLabel lblDeshbordShowTotalIssueNumber;
    private javax.swing.JLabel lblDeshbordShowTotalMemberNumber;
    private javax.swing.JLabel lblDeshbordShowTotalReciveNumber;
    private javax.swing.JLabel lblDeshbordTotalPrice1;
    private javax.swing.JLabel lblDeshbordTotalPrice2;
    private javax.swing.JLabel lblDeshbordTotalPrice3;
    private javax.swing.JLabel lblDeshbordTotalPrice4;
    private javax.swing.JLabel lblDeshbordUnitPrice1;
    private javax.swing.JLabel lblDeshbordUnitPrice2;
    private javax.swing.JLabel lblDeshbordUnitPrice4;
    private javax.swing.JLabel lblDshbordUnitPrice3;
    private javax.swing.JLabel lblIssueBook;
    private javax.swing.JLabel lblMemberShowMsg;
    private javax.swing.JLabel lblSearchAllRecord;
    private javax.swing.JLabel lblShowAllBookRecord;
    private javax.swing.JLabel lblShowAllIssueBookRecord;
    private javax.swing.JLabel lblShowAllMemberRecord;
    private javax.swing.JLabel lblShowDelLibrarianAccountPan1;
    private javax.swing.JLabel lblShowLibrarianAddressInAdminPan;
    private javax.swing.JLabel lblShowLibrarianCodeNoInAdminPan;
    private javax.swing.JLabel lblShowLibrarianEmailInAdminPan;
    private javax.swing.JLabel lblShowLibrarianMobileNumberInAdminPan;
    private javax.swing.JLabel lblShowLibrarianNameInAdminPan;
    private javax.swing.JLabel lblShowMsgAuthor;
    private javax.swing.JLabel lblShowMsgBookIssue;
    private javax.swing.JLabel lblShowMsgCatagory;
    private javax.swing.JLabel lblShowMsgEdition;
    private javax.swing.JLabel lblShowMsgForSearchBookReciveRecord;
    private javax.swing.JLabel lblShowMsgForSearchBookRecord;
    private javax.swing.JLabel lblShowMsgForSearchIssueBookRecord;
    private javax.swing.JLabel lblShowMsgForSearchMemberRecord;
    private javax.swing.JLabel lblShowMsgPublisher;
    public static javax.swing.JLabel lblShowTime;
    private javax.swing.JLabel lblSupeUserInformation;
    private javax.swing.JPanel mainPan;
    private javax.swing.JPanel panBook1;
    private javax.swing.JPanel panBook2;
    private javax.swing.JPanel panBook3;
    private javax.swing.JPanel panBook4;
    private javax.swing.JPanel panDeshbordMember1;
    private javax.swing.JPanel panDeshbordMember2;
    private javax.swing.JPanel panDeshbordMember3;
    private javax.swing.JPanel panDeshbordMember4;
    private javax.swing.JPanel panDeshbordMemberList;
    private javax.swing.JPanel panDeshbordShowBookList;
    private javax.swing.JRadioButton radioBtnBookCode;
    private javax.swing.JRadioButton radioBtnIssnNo;
    private javax.swing.JRadioButton radioBtnMemberId;
    private javax.swing.JRadioButton radioBtnMemberName;
    private javax.swing.JRadioButton radioBtnRackNo;
    private javax.swing.JRadioButton radioBtnSelecMemberId;
    private javax.swing.JRadioButton radioBtnSelectCategory;
    private javax.swing.JRadioButton radioBtnSelectPurchaseDate;
    private javax.swing.JRadioButton radioBtnSelectSubmintLibrarian;
    private javax.swing.JRadioButton radioBtnSelectSubmitDate;
    private javax.swing.JRadioButton radioBtnSelectThana;
    private javax.swing.JRadioButton radioBtnSelecteReturnDateForSearchIssueRecord;
    private javax.swing.JRadioButton redioBtnSelectIssueDateForSearchBookReciveRecord;
    private javax.swing.JScrollPane scPanAddBookRecord;
    private javax.swing.JScrollPane scPanAddMemberRecord;
    private javax.swing.JScrollPane scPanAddOtherRecord;
    private javax.swing.JScrollPane scPanBookAvaliCheck;
    private javax.swing.JScrollPane scPanBookRecive;
    private javax.swing.JScrollPane scPanDashBord;
    private javax.swing.JScrollPane scPanDeleteRecord;
    private javax.swing.JScrollPane scPanIssueBookRecord;
    private javax.swing.JScrollPane scPanSearchRecord;
    private javax.swing.JScrollPane scPanShowAdminInformation;
    private javax.swing.JScrollPane scPanSuperUserInformation;
    private javax.swing.JScrollBar searchPanelScrolBar;
    private javax.swing.JPanel subPanAddBookRecord;
    private javax.swing.JPanel subPanAddMemberRecord;
    private javax.swing.JPanel subPanBookAvailCheck;
    private javax.swing.JPanel subPanBookRecive;
    private javax.swing.JPanel subPanDashBord;
    private javax.swing.JPanel subPanDeleteRecord;
    private javax.swing.JPanel subPanIssueBook;
    private javax.swing.JPanel subPanOtherRecord;
    private javax.swing.JPanel subPanSearchRecord;
    private javax.swing.JPanel subPanSowAdminInformation;
    private javax.swing.JPanel subPanSuperUserInformation;
    private javax.swing.JScrollBar superUserScrolBar;
    private javax.swing.JTable tblDisplayAllBookListInAvailPan;
    private javax.swing.JTable tblDisplayAuthor;
    private javax.swing.JTable tblDisplayAuthorRecordForDel;
    private javax.swing.JTable tblDisplayBookInfo;
    private javax.swing.JTable tblDisplayBookIssue;
    private javax.swing.JTable tblDisplayBookRecive;
    private javax.swing.JTable tblDisplayBookReciveRecordForDel;
    private javax.swing.JTable tblDisplayBookReciveRecordInSearchPan;
    private javax.swing.JTable tblDisplayBookRecordForDlt;
    private javax.swing.JTable tblDisplayBookRecordInSearchPan;
    private javax.swing.JTable tblDisplayCatagory;
    private javax.swing.JTable tblDisplayCatagoryRecordForDel;
    private javax.swing.JTable tblDisplayEdition;
    private javax.swing.JTable tblDisplayEditionRecordForDel;
    private javax.swing.JTable tblDisplayIssueBookInSearchPan;
    private javax.swing.JTable tblDisplayLibrarianAccountInAdminInfoPan;
    private javax.swing.JTable tblDisplayMemberInfo;
    private javax.swing.JTable tblDisplayMemberRecordForDlt;
    private javax.swing.JTable tblDisplayMemberRecordInSearchPan;
    private javax.swing.JTable tblDisplayPublisharRecordForDel;
    private javax.swing.JTable tblDisplayPublisher;
    private javax.swing.JTable tblDisplayShowIssuBookInBookRecive;
    private javax.swing.JTable tblShowAvailableBookList;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel topUpPanel;
    private javax.swing.JTextArea txtAreaAbout;
    private javax.swing.JTextField txtAutorName;
    private javax.swing.JTextField txtAvailableBookSearchBar;
    private javax.swing.JTextField txtBookIssueQty;
    private javax.swing.JTextField txtBookReciveRecordInSearchPan;
    private javax.swing.JTextField txtBookReciveSearchBar;
    private javax.swing.JTextField txtBookRecordBookCode;
    private javax.swing.JTextField txtBookRecordBookName;
    private javax.swing.JTextField txtBookRecordIssnNo;
    private javax.swing.JTextField txtBookRecordQty;
    private javax.swing.JTextField txtBookRecordRackNo;
    private javax.swing.JTextField txtBookRecordSearchBar;
    private javax.swing.JTextField txtBookRecordTotalPrice;
    private javax.swing.JTextField txtBookRecordUnitPrice;
    private javax.swing.JTextField txtCatagoryName;
    private javax.swing.JTextField txtEditionName;
    private javax.swing.JTextField txtIssueBookSearchBar;
    private javax.swing.JTextField txtLibrarianAccountSearchBarInAdminPan;
    private javax.swing.JTextField txtMemberBlockOrVillage;
    private javax.swing.JTextField txtMemberCardNo;
    private javax.swing.JTextField txtMemberEmail;
    private javax.swing.JTextField txtMemberHouseNo;
    private javax.swing.JTextField txtMemberName;
    private javax.swing.JTextField txtMemberRecordSearchBar;
    private javax.swing.JTextField txtMemberRoadNo;
    private javax.swing.JTextField txtMemberThana;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtPublisherName;
    private javax.swing.JTextField txtSearchBarForAuthorRecord;
    private javax.swing.JTextField txtSearchBarForBookReciveRecord;
    private javax.swing.JTextField txtSearchBarForCatagoryRecord;
    private javax.swing.JTextField txtSearchBarForDelMemberRecord;
    private javax.swing.JTextField txtSearchBarForDltBookRecord;
    private javax.swing.JTextField txtSearchBarForEditionRecord;
    private javax.swing.JTextField txtSearchBarForPublisherRecord;
    // End of variables declaration//GEN-END:variables
//</editor-fold>

}
