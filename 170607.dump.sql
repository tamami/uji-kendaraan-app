-- MySQL dump 10.13  Distrib 5.5.55, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: uji_kendaraan
-- ------------------------------------------------------
-- Server version	5.5.55-0ubuntu0.14.04.1

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
-- Current Database: `uji_kendaraan`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `uji_kendaraan` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `uji_kendaraan`;

--
-- Table structure for table `dat_user`
--

DROP TABLE IF EXISTS `dat_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dat_user` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dat_user`
--

LOCK TABLES `dat_user` WRITE;
/*!40000 ALTER TABLE `dat_user` DISABLE KEYS */;
INSERT INTO `dat_user` VALUES ('admin','admin');
/*!40000 ALTER TABLE `dat_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `data_adm_kendaraan`
--

DROP TABLE IF EXISTS `data_adm_kendaraan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data_adm_kendaraan` (
  `id` int(11) NOT NULL,
  `nama_pemilik` varchar(30) DEFAULT NULL,
  `alamat` varchar(30) DEFAULT NULL,
  `merk` varchar(20) DEFAULT NULL,
  `tipe` varchar(20) DEFAULT NULL,
  `tahun_pembuatan` varchar(4) DEFAULT NULL,
  `id_jns_kendaraan` int(11) DEFAULT NULL,
  `id_jns_bahan_bakar` int(11) DEFAULT NULL,
  `id_jns_rumah` int(11) DEFAULT NULL,
  `noken` varchar(10) DEFAULT NULL,
  `no_uji` varchar(8) NOT NULL,
  `no_rangka` varchar(30) DEFAULT NULL,
  `no_mesin` varchar(30) DEFAULT NULL,
  `id_bahan_karoseri` int(11) DEFAULT NULL,
  `tgl_rekam` date DEFAULT NULL,
  PRIMARY KEY (`id`,`no_uji`),
  KEY `idx1_no_uji` (`no_uji`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_adm_kendaraan`
--

LOCK TABLES `data_adm_kendaraan` WRITE;
/*!40000 ALTER TABLE `data_adm_kendaraan` DISABLE KEYS */;
INSERT INTO `data_adm_kendaraan` VALUES (1,'H. AGUS S','BBK SENTRAL','MITSUBISHI','T120SSBC','2015',2,1,4,'D1961BK','BD190330','MHMV5WY2EFK-003736','4G15L-49722',3,'2017-06-03');
/*!40000 ALTER TABLE `data_adm_kendaraan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ref_bahan_bakar`
--

DROP TABLE IF EXISTS `ref_bahan_bakar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ref_bahan_bakar` (
  `id` int(11) NOT NULL,
  `bahan_bakar` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ref_bahan_bakar`
--

LOCK TABLES `ref_bahan_bakar` WRITE;
/*!40000 ALTER TABLE `ref_bahan_bakar` DISABLE KEYS */;
INSERT INTO `ref_bahan_bakar` VALUES (1,'BENSIN'),(2,'SOLAR');
/*!40000 ALTER TABLE `ref_bahan_bakar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ref_bahan_karoseri`
--

DROP TABLE IF EXISTS `ref_bahan_karoseri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ref_bahan_karoseri` (
  `id` int(11) NOT NULL,
  `bahan` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ref_bahan_karoseri`
--

LOCK TABLES `ref_bahan_karoseri` WRITE;
/*!40000 ALTER TABLE `ref_bahan_karoseri` DISABLE KEYS */;
INSERT INTO `ref_bahan_karoseri` VALUES (1,'KAYU'),(2,'FIBER'),(3,'BESI PLAT'),(4,'ALUMINIUM');
/*!40000 ALTER TABLE `ref_bahan_karoseri` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ref_biaya_buku_uji`
--

DROP TABLE IF EXISTS `ref_biaya_buku_uji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ref_biaya_buku_uji` (
  `id` int(11) NOT NULL,
  `tarif` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ref_biaya_buku_uji`
--

LOCK TABLES `ref_biaya_buku_uji` WRITE;
/*!40000 ALTER TABLE `ref_biaya_buku_uji` DISABLE KEYS */;
INSERT INTO `ref_biaya_buku_uji` VALUES (1,10000);
/*!40000 ALTER TABLE `ref_biaya_buku_uji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ref_jns_kendaraan`
--

DROP TABLE IF EXISTS `ref_jns_kendaraan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ref_jns_kendaraan` (
  `id` int(11) NOT NULL,
  `jns_kendaraan` varchar(30) DEFAULT NULL,
  `tarif_pemeriksaan` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ref_jns_kendaraan`
--

LOCK TABLES `ref_jns_kendaraan` WRITE;
/*!40000 ALTER TABLE `ref_jns_kendaraan` DISABLE KEYS */;
INSERT INTO `ref_jns_kendaraan` VALUES (1,'MOBIL PENUMPANG',10000),(2,'MOBIL BIS',20000),(3,'MOBIL BARANG',20000);
/*!40000 ALTER TABLE `ref_jns_kendaraan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ref_jns_rumah`
--

DROP TABLE IF EXISTS `ref_jns_rumah`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ref_jns_rumah` (
  `id` int(11) NOT NULL,
  `jns_rumah` varchar(30) DEFAULT NULL,
  `id_jns_kendaraan` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`,`id_jns_kendaraan`),
  KEY `id_jns_kendaraan` (`id_jns_kendaraan`),
  CONSTRAINT `ref_jns_rumah_ibfk_1` FOREIGN KEY (`id_jns_kendaraan`) REFERENCES `ref_jns_kendaraan` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ref_jns_rumah`
--

LOCK TABLES `ref_jns_rumah` WRITE;
/*!40000 ALTER TABLE `ref_jns_rumah` DISABLE KEYS */;
INSERT INTO `ref_jns_rumah` VALUES (1,'TAXI',1),(1,'BIS',2),(1,'TRUCK',3),(2,'OTOLET',1),(2,'BIS MICRO',2),(2,'PICK UP',3),(3,'BIS MINI',2),(3,'TANGKI',3),(4,'ANGKOT',2),(4,'BOX',3),(5,'BT. WAGON',3),(6,'HEAD TRAKTOR',3),(7,'K. GANDENGAN',3),(8,'K. TEMPELAN',3),(9,'DUMP TRUCK',3),(10,'PICK UP DOUBLE',3),(11,'MIXER',3),(12,'MOLEN',3),(13,'AMBULANCE',3),(14,'DEREK',3);
/*!40000 ALTER TABLE `ref_jns_rumah` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ref_pejabat`
--

DROP TABLE IF EXISTS `ref_pejabat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ref_pejabat` (
  `nip` varchar(18) NOT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `jabatan` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ref_pejabat`
--

LOCK TABLES `ref_pejabat` WRITE;
/*!40000 ALTER TABLE `ref_pejabat` DISABLE KEYS */;
INSERT INTO `ref_pejabat` VALUES ('196808291996011002','NANDAR ARKANDAR, S.AP','KASIR PRPKB');
/*!40000 ALTER TABLE `ref_pejabat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `skrd`
--

DROP TABLE IF EXISTS `skrd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `skrd` (
  `id` int(11) NOT NULL,
  `no_uji` varchar(8) DEFAULT NULL,
  `jns_pengujian` varchar(10) DEFAULT 'BERKALA',
  `biaya_pemeriksaan` decimal(10,0) DEFAULT NULL,
  `biaya_buku_uji` decimal(10,0) DEFAULT NULL,
  `biaya_tanda_uji` decimal(10,0) DEFAULT NULL,
  `biaya_tanda_samping` decimal(10,0) DEFAULT NULL,
  `denda_adm` decimal(10,0) DEFAULT NULL,
  `tgl_pemeriksaan` date DEFAULT NULL,
  `habis_uji_lalu` date DEFAULT NULL,
  `habis_uji_yad` date DEFAULT NULL,
  `nip_pejabat` varchar(18) DEFAULT '196808291996011002',
  PRIMARY KEY (`id`),
  KEY `no_uji` (`no_uji`),
  CONSTRAINT `skrd_ibfk_1` FOREIGN KEY (`no_uji`) REFERENCES `data_adm_kendaraan` (`no_uji`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skrd`
--

LOCK TABLES `skrd` WRITE;
/*!40000 ALTER TABLE `skrd` DISABLE KEYS */;
INSERT INTO `skrd` VALUES (1,'BD190330','BERKALA',20000,0,10000,15000,0,'2017-06-03','2017-06-10','2017-12-03','196808291996011002');
/*!40000 ALTER TABLE `skrd` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-07  8:28:45
