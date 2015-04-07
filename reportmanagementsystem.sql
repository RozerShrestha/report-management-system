-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 07, 2015 at 10:21 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `reportmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE IF NOT EXISTS `faculty` (
  `faculty_id` int(5) NOT NULL AUTO_INCREMENT,
  `faculty_name` varchar(10) NOT NULL,
  PRIMARY KEY (`faculty_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`faculty_id`, `faculty_name`) VALUES
(1, 'BIM'),
(2, 'BBA'),
(3, 'BSCCSIT'),
(4, 'BBS');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `user_id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `position` varchar(22) NOT NULL,
  `password` varchar(22) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`user_id`, `username`, `position`, `password`) VALUES
(2, 'naresh shrestha', 'management', 'naresh'),
(5, 'niyam shrestha', 'management', 'niyam'),
(6, 'bijesh shrestha', 'teacher', 'bijesh'),
(7, 'santosh dhungana', 'teacher', 'santosh'),
(8, 'rozer shrestha', 'student', 'rozer'),
(9, 'aarati shrestha', 'student', 'aarati'),
(10, 'anjeela shrestha', 'student', 'anjeela'),
(11, 'satya bahadur shrestha', 'management', 'satya'),
(12, 'Sujan Malla', 'student', 'sujan');

-- --------------------------------------------------------

--
-- Table structure for table `semester`
--

CREATE TABLE IF NOT EXISTS `semester` (
  `semester_id` int(10) NOT NULL AUTO_INCREMENT,
  `semester_name` varchar(10) NOT NULL,
  PRIMARY KEY (`semester_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=34 ;

--
-- Dumping data for table `semester`
--

INSERT INTO `semester` (`semester_id`, `semester_name`) VALUES
(1, 'BIM1st'),
(2, 'BIM2nd'),
(3, 'BIM3rd'),
(4, 'BIM4th'),
(5, 'BIM5th'),
(6, 'BIM6th'),
(7, 'BIM7th'),
(8, 'BIM8th'),
(9, 'BBA1st'),
(10, 'BBA2nd'),
(11, 'BBA3rd'),
(12, 'BBA4th'),
(13, 'BBA5th'),
(14, 'BBA6th'),
(15, 'BBA7th'),
(16, 'BBA8th'),
(17, 'BSCCSIT1st'),
(18, 'BSCCSIT2nd'),
(19, 'BSCCSIT3rd'),
(20, 'BSCCSIT4th'),
(21, 'BSCCSIT5th'),
(22, 'BSCCSIT6th'),
(23, 'BSCCSIT7th'),
(24, 'BSCCSIT8th'),
(26, 'BBS2nd'),
(27, 'BBS3rd'),
(28, 'BBS4th'),
(29, 'BBS5th'),
(30, 'BBS6th'),
(31, 'BBS7th'),
(32, 'BBS8th'),
(33, 'BBS1st');

-- --------------------------------------------------------

--
-- Table structure for table `student_bim7th`
--

CREATE TABLE IF NOT EXISTS `student_bim7th` (
  `student_id` int(10) NOT NULL AUTO_INCREMENT,
  `subject` varchar(50) NOT NULL,
  `class` varchar(11) NOT NULL,
  `name` varchar(22) NOT NULL,
  `roll` int(5) NOT NULL,
  `assignment` int(5) NOT NULL,
  `report` int(5) NOT NULL,
  `midterm` int(5) NOT NULL,
  `presentation` int(5) NOT NULL,
  `preboard` int(5) NOT NULL,
  `total` int(5) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1225 ;

--
-- Dumping data for table `student_bim7th`
--

INSERT INTO `student_bim7th` (`student_id`, `subject`, `class`, `name`, `roll`, `assignment`, `report`, `midterm`, `presentation`, `preboard`, `total`) VALUES
(6, 'human resource management', 'bim1st', 'Anish Maharjan', 6, 20, 20, 0, 10, 15, 85),
(7, 'human resource management', 'bim1st', 'aarati shrestha', 7, 10, 20, 17, 13, 18, 78),
(8, 'High Speed and Multimedia Networking', 'bim1st', 'Rabindra Basnet', 8, 10, 10, 10, 10, 10, 50),
(9, 'IT Enterpreneur', 'bim7th', 'Rozer Shrestha', 21, 10, 10, 10, 10, 10, 50),
(10, 'IT Enterpreneur', 'bim7th', 'aarati shrestha', 1, 20, 20, 10, 20, 20, 90),
(13, 'High Speed and Multimedia Networking', 'bim7th', 'rashmee', 17, 23, 26, 24, 15, 15, 98),
(14, 'High Speed and Multimedia Networking', 'bim7th', 'sabin', 12, 5, 5, 5, 5, 5, 25),
(16, 'High Speed and Multimedia Networking', 'bim7th', 'Bizu Maharjan', 20, 18, 20, 18, 20, 20, 96),
(17, 'High Speed and Multimedia Networking', 'bim7th', 'Sadikchya Shrestha', 13, 13, 20, 18, 17, 19, 80),
(18, 'High Speed and Multimedia Networking', 'bim7th', 'swasti', 31, 20, 20, 20, 20, 20, 100),
(19, 'Critical thinking and Decision making ', 'bim7th', 'Manisha Mahat', 25, 10, 10, 10, 10, 10, 50),
(20, 'Critical thinking and Decision making ', 'bim7th', 'Sirish Manandhar', 30, 20, 15, 20, 10, 15, 75),
(21, 'management information system', 'bim7th', 'rozer shrestha', 21, 20, 20, 10, 20, 20, 90),
(22, 'management information system', 'bim7th', 'Richa Pradhan', 16, 20, 20, 20, 20, 10, 90),
(23, 'High Speed and Multimedia Networking', 'bim7th', 'Saroj Duwadi', 25, 20, 20, 20, 10, 20, 90),
(24, 'management information system', 'bim7th', 'aarati', 1, 20, 15, 20, 20, 20, 95),
(26, 'management information system', 'bim7th', 'Rojeena Shrestha', 15, 20, 20, 20, 15, 15, 90),
(27, 'management information system', 'bim7th', 'Aarati Shrestha', 1, 20, 20, 20, 20, 10, 90),
(28, 'IT_Enterpreneur', 'bim7th', 'Namrata Shrestha', 18, 20, 20, 20, 20, 20, 100),
(29, 'IT Enterpreneur', 'bim7th', 'Namrata Shrestha', 18, 20, 20, 20, 20, 20, 20),
(30, 'Organization Relation', 'bim7th', 'rozer shrestha', 21, 20, 18, 15, 20, 15, 85),
(32, 'Organization Relation', 'bim7th', 'Aarati Shrestha', 1, 15, 15, 15, 15, 15, 75),
(33, 'Organization Relation', 'bim7th', 'Rabindra Basnet', 18, 20, 15, 10, 20, 20, 85),
(34, 'Human Resource Management', 'bim7th', 'Rashmee Shrestha', 15, 20, 20, 20, 20, 15, 80),
(35, 'Management Information System', 'bim7th', 'Anish Maharjan', 3, 20, 20, 20, 20, 20, 100),
(36, 'Organization Relation', 'bim1st', 'Anjeela Shrestha', 2, 20, 17, 0, 0, 0, 0),
(1221, 'High Speed and Multimedia Networking', 'bim1st', 'Anjeela Shrestha', 5, 15, 15, 15, 15, 15, 75),
(1222, 'Human Resource Management', 'bim7th', 'Rojeena Shrestha', 20, 10, 20, 15, 15, 20, 80),
(1223, 'High Speed and Multimedia Networking', 'bim7th', 'Govinda Dahal', 5, 20, 15, 20, 20, 20, 95),
(1224, 'Human Resource Management', 'bim7th', 'Rojeena Shrestha', 15, 20, 20, 20, 20, 20, 100);

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE IF NOT EXISTS `subject` (
  `subject_id` int(10) NOT NULL AUTO_INCREMENT,
  `faculty_id` int(10) NOT NULL,
  `semester_id` int(10) NOT NULL,
  `subject_name` varchar(50) NOT NULL,
  PRIMARY KEY (`subject_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`subject_id`, `faculty_id`, `semester_id`, `subject_name`) VALUES
(1, 1, 7, 'High Speed and Multimedia Networking'),
(2, 1, 7, 'Management Information System'),
(3, 1, 7, 'IT Enterpreneur and Supply Chain Management'),
(4, 1, 7, 'Human Resource Management'),
(5, 1, 7, 'Critical Thinking and Decision Making'),
(6, 1, 7, 'Organization Relation');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE IF NOT EXISTS `teacher` (
  `teacher_id` int(5) NOT NULL AUTO_INCREMENT,
  `faculty_id` int(5) NOT NULL,
  `semester_id` int(5) NOT NULL,
  `teacher_name` varchar(50) NOT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`teacher_id`, `faculty_id`, `semester_id`, `teacher_name`) VALUES
(1, 1, 7, 'Santosh Dhungana');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
