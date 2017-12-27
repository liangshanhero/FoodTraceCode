CREATE DATABASE  IF NOT EXISTS `db_9griddiary` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_9griddiary`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: db_9griddiary
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
-- Table structure for table `tb_diary`
--

DROP TABLE IF EXISTS `tb_diary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_diary` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(60) NOT NULL,
  `address` varchar(50) NOT NULL COMMENT '日记保存的地址',
  `writeTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '时间',
  `userid` int(10) unsigned NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_diary`
--

LOCK TABLES `tb_diary` WRITE;
/*!40000 ALTER TABLE `tb_diary` DISABLE KEYS */;
INSERT INTO `tb_diary` VALUES (6,'请在此输入标题','-1625618782951844312','2012-05-26 01:40:10',1),(8,'请在此输入标题','-5039247624120215442','2012-05-27 02:26:47',1),(9,'心情不错','241344336121425196','2012-05-28 06:00:43',1),(10,'无题','2030326276105596531','2012-05-28 06:03:08',1),(11,'无尽的牵挂','-2201304326449572193','2012-05-28 06:09:18',2),(14,'心情很好','7076008621496558673','2012-06-09 08:31:07',1),(19,'请在此输入标题','660882937452585817','2012-05-28 03:11:30',1);
/*!40000 ALTER TABLE `tb_diary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_user`
--

DROP TABLE IF EXISTS `tb_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `pwd` varchar(50) NOT NULL COMMENT '密码',
  `email` varchar(100) DEFAULT NULL COMMENT 'E-mail',
  `question` varchar(45) DEFAULT NULL COMMENT '密码提示问题',
  `answer` varchar(45) DEFAULT NULL COMMENT '提示问题答案',
  `city` varchar(30) DEFAULT NULL COMMENT '所在地',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=gbk;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_user`
--

LOCK TABLES `tb_user` WRITE;
/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
INSERT INTO `tb_user` VALUES (1,'mr','mrsoft',NULL,'','',''),(2,'wgh','111',NULL,'我的工作单位','明日科技','长春'),(3,'qq','w123456','wgh717@sohu.com','6','6','长春'),(4,'h','hhhhhh','wgh717@sohu.com','','','北京'),(5,'w','wwwwww','www@sina.com','','','北京'),(6,'qiqi','qq123456','wgh8007@163.com','我的工作单位','明日科技','长春'),(8,'888','wwwwww','www@si.com','','','葫芦岛'),(9,'q61','q111111','wgh@s.com','','','长春'),(10,'qqqq','qqqqqq','wgh@sohu.com','1','1','北京');
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-06-26 16:40:42
