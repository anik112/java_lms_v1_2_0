-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 13, 2018 at 05:20 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `lms_update_v120`
--
CREATE DATABASE IF NOT EXISTS `lms_update_v120` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `lms_update_v120`;

-- --------------------------------------------------------

--
-- Table structure for table `author`
--

CREATE TABLE IF NOT EXISTS `author` (
`id` int(11) NOT NULL,
  `author_name` varchar(30) NOT NULL,
  `date_of_birth` varchar(30) DEFAULT NULL,
  `date_of_dead` varchar(30) DEFAULT NULL,
  `about` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `author`
--

INSERT INTO `author` (`id`, `author_name`, `date_of_birth`, `date_of_dead`, `about`) VALUES
(1, 'anik', '20/1/19', '29/3/40', 'My name is anik'),
(2, 'shuvo', '20/1/19', '29/3/40', 'My name is shuvo'),
(3, 'shila', '4,5,1998', 'Day,Month,Year', 'se onek valo ekjon manus.'),
(4, 'rudro', '7,2,1996', 'Day,Month,Year', 'se onek valo ekjon manus.'),
(5, 'shojib', '4,6,2001', '6,11,2004', 'good author'),
(6, 'boby', '7,1,1996', 'Still Alive', 'she is a good person'),
(7, 'pranto', '15,1,1996', 'Still Alive', 'he is a good writer.'),
(8, 'shuvo', '20/1/19', '29/3/40', 'My name is shuvo'),
(9, 'shuvo', '20/1/19', '29/3/40', 'My name is shuvo'),
(10, 'moriom', '4,5,1998', 'Still Alive', 'moriom, dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `book_information`
--

CREATE TABLE IF NOT EXISTS `book_information` (
`id` int(11) NOT NULL,
  `book_name` varchar(30) NOT NULL,
  `book_code` varchar(30) NOT NULL,
  `author_name` varchar(30) DEFAULT NULL,
  `publisher_name` varchar(30) DEFAULT NULL,
  `edition` varchar(30) DEFAULT NULL,
  `unit_price` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `total_price` int(11) NOT NULL,
  `rack_no` int(11) DEFAULT NULL,
  `issn_no` varchar(30) NOT NULL,
  `category` varchar(30) DEFAULT NULL,
  `purchase_date` varchar(30) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book_information`
--

INSERT INTO `book_information` (`id`, `book_name`, `book_code`, `author_name`, `publisher_name`, `edition`, `unit_price`, `qty`, `total_price`, `rack_no`, `issn_no`, `category`, `purchase_date`) VALUES
(1, 'java', '1231', 'pranto', 'dimatrik pokasoni', 'sec', 112, 11, 1231, 112, '12312314', 'computer', 'November 25 2017'),
(2, 'c++', '4536', 'pranto', 'ABC publishoni', 'Sps', 342, 28, 360, 14, '313123123312', 'computer', 'November 28 2017'),
(4, 'c#', '1123', 'anik', 'ABC publishoni', 'Sps', 443, 33, 500, 4, '234523542134', 'ddr', 'November 28 2017'),
(5, 'english', '3342', 'santu', 'rokomari', 'Sps', 112, 0, 130, 3, '23123454556', 'elt', 'November 28 2017'),
(6, 'bangla', '1231', 'shojib', 'ABC publishoni', 'sec', 120, 11, 140, 2, '12345678', 'computer', 'January 07 2018'),
(7, 'php', '342', 'anik', 'dimatrik pokasoni', 'Sps', 300, 50, 310, 2, '355628183', 'computer', 'January 11 2018');

-- --------------------------------------------------------

--
-- Table structure for table `book_issue`
--

CREATE TABLE IF NOT EXISTS `book_issue` (
`id` int(11) NOT NULL,
  `book_id` varchar(30) NOT NULL,
  `library_member_id` int(11) NOT NULL,
  `issue_date` varchar(30) NOT NULL,
  `expire_date` varchar(30) NOT NULL,
  `return_date` varchar(30) NOT NULL,
  `qty` int(11) NOT NULL,
  `_status` varchar(30) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book_issue`
--

INSERT INTO `book_issue` (`id`, `book_id`, `library_member_id`, `issue_date`, `expire_date`, `return_date`, `qty`, `_status`) VALUES
(5, '4536', 5647, 'December 16 2017', '662018', '662018', 2, 'anik'),
(6, '1231', 990, 'January 07 2018', '322017', '332017', 1, 'shuvo');

-- --------------------------------------------------------

--
-- Table structure for table `book_recive`
--

CREATE TABLE IF NOT EXISTS `book_recive` (
`id` int(11) NOT NULL,
  `book_id` varchar(30) NOT NULL,
  `library_member_id` int(11) NOT NULL,
  `submit_date` varchar(30) NOT NULL,
  `qty` int(11) NOT NULL,
  `submit_by` varchar(30) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book_recive`
--

INSERT INTO `book_recive` (`id`, `book_id`, `library_member_id`, `submit_date`, `qty`, `submit_by`) VALUES
(1, '1231', 443, 'November 27 2017', 1, 'admin'),
(2, '1231', 4320, 'November 27 2017', 2, 'Select Librarian'),
(3, '1231', 443, 'December 04 2017', 1, 'Select Librarian'),
(4, '1231', 432, 'December 15 2017', 1, 'Select Librarian'),
(5, '4536', 432, 'December 16 2017', 1, 'Select Librarian'),
(6, '1231', 4320, 'January 07 2018', 2, 'shuvo'),
(7, '342', 990, 'January 13 2018', 2, 'piash');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
`id` int(11) NOT NULL,
  `category_name` varchar(30) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `category_name`) VALUES
(1, 'computer'),
(2, 'arc'),
(3, 'elt'),
(6, 'lst'),
(11, 'ddr');

-- --------------------------------------------------------

--
-- Table structure for table `edition`
--

CREATE TABLE IF NOT EXISTS `edition` (
`id` int(11) NOT NULL,
  `edition_name` varchar(30) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `edition`
--

INSERT INTO `edition` (`id`, `edition_name`) VALUES
(7, 'Sps'),
(10, 'sec'),
(11, 'thrd');

-- --------------------------------------------------------

--
-- Table structure for table `librarianaccount`
--

CREATE TABLE IF NOT EXISTS `librarianaccount` (
`id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `code_number` int(11) NOT NULL,
  `mobile_no` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `house_no` varchar(30) DEFAULT NULL,
  `road_no` varchar(30) DEFAULT NULL,
  `block_or_village` varchar(30) DEFAULT NULL,
  `thana` varchar(30) DEFAULT NULL,
  `district` varchar(30) DEFAULT NULL,
  `division` varchar(30) DEFAULT NULL,
  `shift` varchar(30) NOT NULL,
  `user_name` varchar(30) NOT NULL,
  `user_password` varchar(30) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `librarianaccount`
--

INSERT INTO `librarianaccount` (`id`, `name`, `code_number`, `mobile_no`, `email`, `house_no`, `road_no`, `block_or_village`, `thana`, `district`, `division`, `shift`, `user_name`, `user_password`) VALUES
(2, 'shuvo', 562, '019883526', 'shuvoSS@gmail.com', '#42', '#3', 'dagonvuiya', 'dagonvuiya', 'Feni', 'Ctg', '', '', ''),
(3, 'piash', 4523, '01987263', 'palpiash@gmail.com', '#4', '#5', 'surikora', 'chddogram', 'comilla', 'Ctg', '', '', ''),
(5, 'anik', 423, '01826995639', 'paulanik112@gmail.com', '#34', '#66', 'surikora', 'chddogram', 'comilla', 'Ctg', 'Morning', 'anik', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `library_member`
--

CREATE TABLE IF NOT EXISTS `library_member` (
`id` int(11) NOT NULL,
  `member_name` varchar(30) NOT NULL,
  `member_id` int(11) NOT NULL,
  `mobile_number` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `house_no` varchar(30) DEFAULT NULL,
  `road_no` varchar(30) DEFAULT NULL,
  `block_or_village` varchar(30) DEFAULT NULL,
  `thana` varchar(30) DEFAULT NULL,
  `district` varchar(30) DEFAULT NULL,
  `division` varchar(30) DEFAULT NULL,
  `report` varchar(30) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `library_member`
--

INSERT INTO `library_member` (`id`, `member_name`, `member_id`, `mobile_number`, `email`, `house_no`, `road_no`, `block_or_village`, `thana`, `district`, `division`, `report`) VALUES
(1, 'anik', 4320, '01826995639', 'paulanik112@gmail.com', '#34', '#29', 'surikora', 'chddogram', 'comilla', 'Ctg', 'bad'),
(2, 'shuvo', 432, '017837263', 'shuvo.we@gmail.com', '#32', '#22', 'dagonvuiya', 'feni', 'Feni', 'Ctg', NULL),
(3, 'shila', 5647, '01826374', 'shila2@gmail.com', '#45', '#56', 'pachdona', 'nosindi', 'Norshingdi', 'Dhaka', 'good'),
(4, 'kal', 990, '092834123', 'asdasd@wd.gmail.com', '213', '13', 'dasd', 'asd', 'Norshingdi', 'Dhaka', 'bad');

-- --------------------------------------------------------

--
-- Table structure for table `publisher`
--

CREATE TABLE IF NOT EXISTS `publisher` (
`id` int(11) NOT NULL,
  `publisher_name` varchar(30) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `publisher`
--

INSERT INTO `publisher` (`id`, `publisher_name`) VALUES
(1, 'dimatrik pokasoni'),
(2, 'rokomari'),
(3, 'ABC publishoni'),
(5, 'kakamoni');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `author`
--
ALTER TABLE `author`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `book_information`
--
ALTER TABLE `book_information`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `issn_no` (`issn_no`);

--
-- Indexes for table `book_issue`
--
ALTER TABLE `book_issue`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `book_recive`
--
ALTER TABLE `book_recive`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `edition`
--
ALTER TABLE `edition`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `librarianaccount`
--
ALTER TABLE `librarianaccount`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `library_member`
--
ALTER TABLE `library_member`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `publisher`
--
ALTER TABLE `publisher`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `author`
--
ALTER TABLE `author`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `book_information`
--
ALTER TABLE `book_information`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `book_issue`
--
ALTER TABLE `book_issue`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `book_recive`
--
ALTER TABLE `book_recive`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `edition`
--
ALTER TABLE `edition`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `librarianaccount`
--
ALTER TABLE `librarianaccount`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `library_member`
--
ALTER TABLE `library_member`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `publisher`
--
ALTER TABLE `publisher`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
