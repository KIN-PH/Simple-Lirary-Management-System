-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2025 at 03:12 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookinventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_account`
--

CREATE TABLE `admin_account` (
  `pk` int(11) NOT NULL,
  `firstname` text DEFAULT NULL,
  `lastname` text DEFAULT NULL,
  `email` text DEFAULT NULL,
  `contactnumber` int(11) DEFAULT NULL,
  `username` text DEFAULT NULL,
  `password` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_account`
--

INSERT INTO `admin_account` (`pk`, `firstname`, `lastname`, `email`, `contactnumber`, `username`, `password`) VALUES
(1, 'admin', '1', 'admi@gmail.com', 123, 'admin', 'admin'),
(2, 'admin2', 'admin2', 'admin2@gmail.com', 12321, 'admin2', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `pk` int(11) NOT NULL,
  `booktitle` text NOT NULL,
  `status` enum('available','borrowed') NOT NULL,
  `category` text NOT NULL,
  `author` text NOT NULL,
  `dateregistered` text NOT NULL,
  `studentid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`pk`, `booktitle`, `status`, `category`, `author`, `dateregistered`, `studentid`) VALUES
(1, 'Harry Potter Volume 1', 'available', 'Fictional', 'Charles Darwin', '2025-04-16', NULL),
(2, 'Harry Potter Volume 2', 'available', 'Fictional', 'Charles Darwin', '2025-04-16', NULL),
(3, 'Harry Potter 3', 'available', 'Fictional', 'Charles Darwin', '2025-04-17', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `borrowed_history`
--

CREATE TABLE `borrowed_history` (
  `pk` int(11) NOT NULL,
  `bookid` int(11) NOT NULL,
  `studentid` int(11) NOT NULL,
  `dateborrowed` text NOT NULL,
  `returningdate` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `borrowed_history`
--

INSERT INTO `borrowed_history` (`pk`, `bookid`, `studentid`, `dateborrowed`, `returningdate`) VALUES
(1, 1, 1, '2025-04-16', '2025-04-17'),
(2, 2, 5, '2025-04-16', '2025-04-18'),
(3, 1, 1, 'studentid', 'studentid'),
(4, 2, 5, 'studentid', 'studentid'),
(5, 1, 1, '123', '123'),
(6, 1, 5, '123', '123'),
(7, 1, 1, '123', '123');

-- --------------------------------------------------------

--
-- Table structure for table `student_account`
--

CREATE TABLE `student_account` (
  `pk` int(11) NOT NULL,
  `studentid` text NOT NULL,
  `fullname` text NOT NULL,
  `contactnumber` text NOT NULL,
  `email` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_account`
--

INSERT INTO `student_account` (`pk`, `studentid`, `fullname`, `contactnumber`, `email`) VALUES
(1, '1', 'Wilkin Bunnag', '182913123', 'sample@gmail.com'),
(5, '5', 'Daniel Narciso', '12345', 'daniel@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_account`
--
ALTER TABLE `admin_account`
  ADD PRIMARY KEY (`pk`);

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`pk`);

--
-- Indexes for table `borrowed_history`
--
ALTER TABLE `borrowed_history`
  ADD PRIMARY KEY (`pk`);

--
-- Indexes for table `student_account`
--
ALTER TABLE `student_account`
  ADD PRIMARY KEY (`pk`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_account`
--
ALTER TABLE `admin_account`
  MODIFY `pk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `pk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `borrowed_history`
--
ALTER TABLE `borrowed_history`
  MODIFY `pk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `student_account`
--
ALTER TABLE `student_account`
  MODIFY `pk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
