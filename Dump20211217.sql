CREATE DATABASE  IF NOT EXISTS `sqa` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `sqa`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: sqa
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `calam`
--

DROP TABLE IF EXISTS `calam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `calam` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Giobatdau` time NOT NULL,
  `Gioketthuc` time NOT NULL,
  `Thuong` float NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calam`
--

LOCK TABLES `calam` WRITE;
/*!40000 ALTER TABLE `calam` DISABLE KEYS */;
INSERT INTO `calam` VALUES (1,'07:00:00','15:00:00',0),(2,'15:00:00','24:00:00',0),(3,'00:00:00','07:00:00',100);
/*!40000 ALTER TABLE `calam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoadon` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Note` varchar(255) DEFAULT NULL,
  `Ngaythanhtoan` date DEFAULT NULL,
  `Tongtien` float DEFAULT NULL,
  `khachhangID` int NOT NULL,
  `nvltID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKhoadonAndKhachhang` (`khachhangID`),
  KEY `FKhoadonAndNhanvien` (`nvltID`),
  CONSTRAINT `FKhoadonAndKhachhang` FOREIGN KEY (`khachhangID`) REFERENCES `khachhang` (`ID`),
  CONSTRAINT `FKhoadonAndNhanvien` FOREIGN KEY (`nvltID`) REFERENCES `nhanvien` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Sdt` varchar(255) NOT NULL,
  `Hoten` varchar(255) NOT NULL,
  `Ngaysinh` date NOT NULL,
  `Diemtichluy` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'0123456789','Nguyen Khach A','2000-10-10','0'),(2,'0438465763','Nguyen Khach B','2001-10-01','100'),(3,'0239822188','Khach Hang C','1993-11-04','0'),(4,'0982375828','Khach Hang D','1999-04-03','0'),(5,'0947384758','Khach Hang E','1993-04-05','0'),(6,'0965783984','Khach Hang H','2013-05-17','0'),(7,'0965783444','Khach Hang Nam','2016-02-17','5');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhahangkaraoke`
--

DROP TABLE IF EXISTS `nhahangkaraoke`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhahangkaraoke` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Ten` varchar(255) NOT NULL,
  `Sdt` varchar(255) NOT NULL,
  `Diachi` varchar(255) NOT NULL,
  `Mota` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhahangkaraoke`
--

LOCK TABLES `nhahangkaraoke` WRITE;
/*!40000 ALTER TABLE `nhahangkaraoke` DISABLE KEYS */;
INSERT INTO `nhahangkaraoke` VALUES (1,'Karaoke99','0945555555','ha noi','vip');
/*!40000 ALTER TABLE `nhahangkaraoke` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Sdt` varchar(255) NOT NULL,
  `Cmnd` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Diachi` varchar(255) NOT NULL,
  `Hoten` varchar(255) NOT NULL,
  `Ngaysinh` date NOT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Chucvu` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'0945555135','034099999999','thuanhacong99@gmail.com','phung khoang','Ha Cong Thuan','1999-12-13','thuanhc','1999','NV'),(2,'0948888888','034888888888','quanly@gmail.com','cau giay','Nguyen Quan Ly','1991-12-12','quanly','1991','QL'),(3,'0948992883','034777777777','nhanvien1@gmail.com','ha dong','Nhan Vien A','1992-10-02','nhanvien1','1999','NV'),(4,'0942382377','034764832818','abc@gmail.com','mo lao','Tran Thi Nhung','1994-12-05','nhung','1999','NV'),(5,'0938272377','034527482888','abcd@gmail.com','dong da','Nguyen Thi Lua','1994-12-12','lua','1999','NV'),(6,'0948573881','034588293828','abcde@gmail.com','ha dong','Phan Van Bach','1999-04-02','bach','1999','NV'),(7,'0984713722','034785848398','abcegk@gmail.com','mo lao','Dinh Cong Manh','1999-03-05','manh','1999','NV');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvienca`
--

DROP TABLE IF EXISTS `nhanvienca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvienca` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `nhanvienID` int NOT NULL,
  `calamID` int NOT NULL,
  `Trangthai` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKnhanviencaAndNhanvien` (`nhanvienID`),
  KEY `FKnhanviencaAndCalam` (`calamID`),
  CONSTRAINT `FKnhanviencaAndCalam` FOREIGN KEY (`calamID`) REFERENCES `calam` (`ID`),
  CONSTRAINT `FKnhanviencaAndNhanvien` FOREIGN KEY (`nhanvienID`) REFERENCES `nhanvien` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvienca`
--

LOCK TABLES `nhanvienca` WRITE;
/*!40000 ALTER TABLE `nhanvienca` DISABLE KEYS */;
INSERT INTO `nhanvienca` VALUES (6,1,1,1),(7,3,2,0),(8,4,3,0),(9,5,1,0),(10,6,2,0),(11,7,3,0),(12,1,2,1),(13,1,3,1);
/*!40000 ALTER TABLE `nhanvienca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanviencaphongdat`
--

DROP TABLE IF EXISTS `nhanviencaphongdat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanviencaphongdat` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `nhanviencaID` int NOT NULL,
  `phongdatID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKnhanviencaphongdatAndNhanvienca` (`nhanviencaID`),
  KEY `FKnhanviencaphongdatAndPhongdat` (`phongdatID`),
  CONSTRAINT `FKnhanviencaphongdatAndNhanvienca` FOREIGN KEY (`nhanviencaID`) REFERENCES `nhanvienca` (`ID`),
  CONSTRAINT `FKnhanviencaphongdatAndPhongdat` FOREIGN KEY (`phongdatID`) REFERENCES `phongdat` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanviencaphongdat`
--

LOCK TABLES `nhanviencaphongdat` WRITE;
/*!40000 ALTER TABLE `nhanviencaphongdat` DISABLE KEYS */;
/*!40000 ALTER TABLE `nhanviencaphongdat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phong`
--

DROP TABLE IF EXISTS `phong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phong` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Ten` varchar(255) NOT NULL,
  `Co` varchar(255) NOT NULL,
  `Hang` varchar(255) NOT NULL,
  `Gia` float NOT NULL,
  `Mota` varchar(255) DEFAULT NULL,
  `nhahangkaraokeID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKphongAndNhahangkaraoke` (`nhahangkaraokeID`),
  CONSTRAINT `FKphongAndNhahangkaraoke` FOREIGN KEY (`nhahangkaraokeID`) REFERENCES `nhahangkaraoke` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phong`
--

LOCK TABLES `phong` WRITE;
/*!40000 ALTER TABLE `phong` DISABLE KEYS */;
INSERT INTO `phong` VALUES (1,'402','Vua','Thuong',300,NULL,1),(2,'304','Lon','VIP',600,NULL,1);
/*!40000 ALTER TABLE `phong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phongdat`
--

DROP TABLE IF EXISTS `phongdat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phongdat` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Giovao` time NOT NULL,
  `Giora` time NOT NULL,
  `Trangthai` int NOT NULL,
  `Ngaydat` date NOT NULL,
  `phongID` int NOT NULL,
  `hoadonID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKphongdatAndPhong` (`phongID`),
  KEY `FKphongdatAndHoadon` (`hoadonID`),
  CONSTRAINT `FKphongdatAndHoadon` FOREIGN KEY (`hoadonID`) REFERENCES `hoadon` (`ID`),
  CONSTRAINT `FKphongdatAndPhong` FOREIGN KEY (`phongID`) REFERENCES `phong` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phongdat`
--

LOCK TABLES `phongdat` WRITE;
/*!40000 ALTER TABLE `phongdat` DISABLE KEYS */;
/*!40000 ALTER TABLE `phongdat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-17 23:58:11
