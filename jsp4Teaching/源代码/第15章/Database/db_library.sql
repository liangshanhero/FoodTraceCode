CREATE DATABASE  IF NOT EXISTS `db_library` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_library`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: db_library
-- ------------------------------------------------------
-- Server version	5.5.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_booktype`
--

DROP TABLE IF EXISTS `tb_booktype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_booktype` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `typename` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  `days` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_booktype`
--

LOCK TABLES `tb_booktype` WRITE;
/*!40000 ALTER TABLE `tb_booktype` DISABLE KEYS */;
INSERT INTO `tb_booktype` VALUES (4,'网络编程',20),(5,'数据库开发',15),(6,'移动开发',30);
/*!40000 ALTER TABLE `tb_booktype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_reader`
--

DROP TABLE IF EXISTS `tb_reader`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_reader` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET gbk DEFAULT NULL,
  `sex` varchar(4) CHARACTER SET gbk DEFAULT NULL,
  `barcode` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  `vocation` varchar(50) CHARACTER SET gbk DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `paperType` varchar(10) CHARACTER SET gbk DEFAULT NULL,
  `paperNO` varchar(20) CHARACTER SET gbk DEFAULT NULL,
  `tel` varchar(20) CHARACTER SET gbk DEFAULT NULL,
  `email` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `createDate` date DEFAULT NULL,
  `operator` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  `remark` text CHARACTER SET gbk,
  `typeid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_reader`
--

LOCK TABLES `tb_reader` WRITE;
/*!40000 ALTER TABLE `tb_reader` DISABLE KEYS */;
INSERT INTO `tb_reader` VALUES (4,'琦琦','女','20120224000001','学生','2010-07-10','身份证','220104201007100001','84978981','wgh717@sohu.com','2012-02-24','mr','无',4),(5,'wgh','女','20120224000002','程序员','1980-07-10','工作证','20010228','84978981','wgh717@sohu.com','2012-02-24','mr','无',4),(6,'uui','男','iuoui','',NULL,'身份证','iuoi','','nmb','2012-02-24','mr','',4),(7,'无语','男','123456789','学生','1990-07-17','学生证','20100000001','','mingrisoft@mingrisoft.com','2012-06-20','mr','无',4);
/*!40000 ALTER TABLE `tb_reader` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_publishing`
--

DROP TABLE IF EXISTS `tb_publishing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_publishing` (
  `ISBN` varchar(20) CHARACTER SET gbk NOT NULL COMMENT 'ISBN号',
  `pubname` varchar(30) CHARACTER SET gbk DEFAULT NULL COMMENT '出版社名称',
  PRIMARY KEY (`ISBN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_publishing`
--

LOCK TABLES `tb_publishing` WRITE;
/*!40000 ALTER TABLE `tb_publishing` DISABLE KEYS */;
INSERT INTO `tb_publishing` VALUES ('111','机械工业出版社'),('115','人民邮电出版社'),('302','清华大学出版社');
/*!40000 ALTER TABLE `tb_publishing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_giveback`
--

DROP TABLE IF EXISTS `tb_giveback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_giveback` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `readerid` int(11) DEFAULT NULL,
  `bookid` int(11) DEFAULT NULL,
  `backTime` date DEFAULT NULL,
  `operator` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_giveback`
--

LOCK TABLES `tb_giveback` WRITE;
/*!40000 ALTER TABLE `tb_giveback` DISABLE KEYS */;
INSERT INTO `tb_giveback` VALUES (3,4,7,'2012-02-24','mr'),(4,4,7,'2012-06-19','mr'),(5,5,8,'2012-06-20','mr');
/*!40000 ALTER TABLE `tb_giveback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_readertype`
--

DROP TABLE IF EXISTS `tb_readertype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_readertype` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET gbk DEFAULT NULL,
  `number` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_readertype`
--

LOCK TABLES `tb_readertype` WRITE;
/*!40000 ALTER TABLE `tb_readertype` DISABLE KEYS */;
INSERT INTO `tb_readertype` VALUES (4,'学生',1),(5,'程序员',3);
/*!40000 ALTER TABLE `tb_readertype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_parameter`
--

DROP TABLE IF EXISTS `tb_parameter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_parameter` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cost` int(10) unsigned DEFAULT NULL,
  `validity` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_parameter`
--

LOCK TABLES `tb_parameter` WRITE;
/*!40000 ALTER TABLE `tb_parameter` DISABLE KEYS */;
INSERT INTO `tb_parameter` VALUES (1,30,6);
/*!40000 ALTER TABLE `tb_parameter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_manager`
--

DROP TABLE IF EXISTS `tb_manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_manager` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  `PWD` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_manager`
--

LOCK TABLES `tb_manager` WRITE;
/*!40000 ALTER TABLE `tb_manager` DISABLE KEYS */;
INSERT INTO `tb_manager` VALUES (1,'mr','mrsoft'),(7,'wgh','111'),(9,'admin','111');
/*!40000 ALTER TABLE `tb_manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_bookcase`
--

DROP TABLE IF EXISTS `tb_bookcase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_bookcase` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_bookcase`
--

LOCK TABLES `tb_bookcase` WRITE;
/*!40000 ALTER TABLE `tb_bookcase` DISABLE KEYS */;
INSERT INTO `tb_bookcase` VALUES (4,'左A-1'),(5,'左A-2'),(6,'右A-1'),(7,'中A-1');
/*!40000 ALTER TABLE `tb_bookcase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_borrow`
--

DROP TABLE IF EXISTS `tb_borrow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_borrow` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `readerid` int(10) unsigned DEFAULT NULL,
  `bookid` int(10) DEFAULT NULL,
  `borrowTime` date DEFAULT NULL,
  `backTime` date DEFAULT NULL,
  `operator` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  `ifback` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_borrow`
--

LOCK TABLES `tb_borrow` WRITE;
/*!40000 ALTER TABLE `tb_borrow` DISABLE KEYS */;
INSERT INTO `tb_borrow` VALUES (7,4,7,'2012-02-24','2012-03-16','mr',1),(9,5,8,'2012-02-24','2012-07-10','mr',1),(10,4,11,'2012-06-20','2012-07-10','mr',0);
/*!40000 ALTER TABLE `tb_borrow` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_library`
--

DROP TABLE IF EXISTS `tb_library`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_library` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `libraryname` varchar(50) CHARACTER SET gbk DEFAULT NULL,
  `curator` varchar(10) CHARACTER SET gbk DEFAULT NULL,
  `tel` varchar(20) CHARACTER SET gbk DEFAULT NULL,
  `address` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `email` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `url` varchar(100) CHARACTER SET gbk DEFAULT NULL,
  `createDate` date DEFAULT NULL,
  `introduce` text CHARACTER SET gbk,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_library`
--

LOCK TABLES `tb_library` WRITE;
/*!40000 ALTER TABLE `tb_library` DISABLE KEYS */;
INSERT INTO `tb_library` VALUES (1,'博研图书馆','mr','0431-84978981','长春市东盛大街89号','mingrisoft@mingsoft.com','http://www.mingrisoft.com','1999-12-12','本市拥有计算机类图书最多的图书馆。');
/*!40000 ALTER TABLE `tb_library` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_bookinfo`
--

DROP TABLE IF EXISTS `tb_bookinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_bookinfo` (
  `barcode` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  `bookname` varchar(70) CHARACTER SET gbk DEFAULT NULL,
  `typeid` int(10) unsigned DEFAULT NULL,
  `author` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  `translator` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  `ISBN` varchar(20) CHARACTER SET gbk DEFAULT NULL,
  `price` float(8,2) DEFAULT NULL,
  `page` int(10) unsigned DEFAULT NULL,
  `bookcase` int(10) unsigned DEFAULT NULL,
  `inTime` date DEFAULT NULL,
  `operator` varchar(30) CHARACTER SET gbk DEFAULT NULL,
  `del` tinyint(1) DEFAULT '0',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_bookinfo`
--

LOCK TABLES `tb_bookinfo` WRITE;
/*!40000 ALTER TABLE `tb_bookinfo` DISABLE KEYS */;
INSERT INTO `tb_bookinfo` VALUES ('9787302210337','Java Web开发实战宝典',4,'王国辉','','302',89.00,834,4,'2011-02-24','mr',0,7),('9787115195975','Java Web开发典型模块大全',4,'王国辉、王毅、王殊宇','','115',89.00,752,5,'2011-02-24','mr',0,8),('4521212','njknjn',5,'mnm','','115',11.00,0,4,'2011-02-24','mr',1,9),('gf','gfhgf',4,'','','111',26.00,0,4,'2011-02-24','mr',1,10),('123456789','Android开发宝典',4,'王国辉、李伟','','111',79.00,675,5,'2012-06-19','mr',0,11),('1','1212',4,'21','212','111',21.00,121,4,'2012-06-19','mr',1,12);
/*!40000 ALTER TABLE `tb_bookinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_purview`
--

DROP TABLE IF EXISTS `tb_purview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_purview` (
  `id` int(11) NOT NULL,
  `sysset` tinyint(1) DEFAULT '0',
  `readerset` tinyint(1) DEFAULT '0',
  `bookset` tinyint(1) DEFAULT '0',
  `borrowback` tinyint(1) DEFAULT '0',
  `sysquery` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_purview`
--

LOCK TABLES `tb_purview` WRITE;
/*!40000 ALTER TABLE `tb_purview` DISABLE KEYS */;
INSERT INTO `tb_purview` VALUES (1,1,1,1,1,1),(7,0,1,1,1,1),(9,1,1,1,0,0);
/*!40000 ALTER TABLE `tb_purview` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-06-26 15:38:29
