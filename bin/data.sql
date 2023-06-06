-- MySQL dump 10.16  Distrib 10.1.26-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: db
-- ------------------------------------------------------
-- Server version	10.1.26-MariaDB-0+deb9u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Attacker`
--

DROP TABLE IF EXISTS `Attacker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Attacker` (
  `AIp` varchar(14) DEFAULT NULL,
  `Cname` varchar(8) DEFAULT NULL,
  `Nname` varchar(6) DEFAULT NULL,
  `tym` varchar(19) DEFAULT NULL,
  `Energy` tinyint(4) DEFAULT NULL
); ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Attacker`
--

LOCK TABLES `Attacker` WRITE;
/*!40000 ALTER TABLE `Attacker` DISABLE KEYS */;
INSERT INTO `Attacker` VALUES ('169.254.86.217','Cluster2','Node11','26/11/2018 17:25:04',0),('169.254.86.217','Cluster2','Node10','26/11/2018 17:27:17',0);
/*!40000 ALTER TABLE `Attacker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cluster1`
--

DROP TABLE IF EXISTS `Cluster1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cluster1` (
  `Number` tinyint(4) DEFAULT NULL,
  `Nname` varchar(5) DEFAULT NULL,
  `Energy` mediumint(9) DEFAULT NULL,
  `Distance` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cluster1`
--

LOCK TABLES `Cluster1` WRITE;
/*!40000 ALTER TABLE `Cluster1` DISABLE KEYS */;
INSERT INTO `Cluster1` VALUES (1,'Node1',9171,5),(2,'Node2',13450,3),(3,'Node3',30000,5),(4,'Node4',122943,9),(5,'Node5',78000,2),(6,'Node6',456,5),(7,'Node7',40000,7),(8,'Node8',12340,4);
/*!40000 ALTER TABLE `Cluster1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cluster2`
--

DROP TABLE IF EXISTS `Cluster2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cluster2` (
  `Number` tinyint(4) DEFAULT NULL,
  `Nname` varchar(6) DEFAULT NULL,
  `Energy` mediumint(9) DEFAULT NULL,
  `Distance` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cluster2`
--

LOCK TABLES `Cluster2` WRITE;
/*!40000 ALTER TABLE `Cluster2` DISABLE KEYS */;
INSERT INTO `Cluster2` VALUES (1,'Node9',45106,5),(2,'Node10',0,3),(3,'Node11',0,5),(4,'Node12',3450,9),(5,'Node13',32440,2),(6,'Node14',25643,5),(7,'Node15',50000,7),(8,'Node16',25643,4);
/*!40000 ALTER TABLE `Cluster2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cluster3`
--

DROP TABLE IF EXISTS `Cluster3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cluster3` (
  `Number` tinyint(4) DEFAULT NULL,
  `Nname` varchar(6) DEFAULT NULL,
  `Energy` mediumint(9) DEFAULT NULL,
  `Distance` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cluster3`
--

LOCK TABLES `Cluster3` WRITE;
/*!40000 ALTER TABLE `Cluster3` DISABLE KEYS */;
INSERT INTO `Cluster3` VALUES (1,'Node17',46676,5),(2,'Node18',46947,3),(3,'Node19',46454,5),(4,'Node20',44709,9),(5,'Node21',42870,2),(6,'Node22',45659,5),(7,'Node23',43874,7),(8,'Node24',45643,4);
/*!40000 ALTER TABLE `Cluster3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cluster4`
--

DROP TABLE IF EXISTS `Cluster4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cluster4` (
  `Number` tinyint(4) DEFAULT NULL,
  `Nname` varchar(6) DEFAULT NULL,
  `Energy` mediumint(9) DEFAULT NULL,
  `Distance` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cluster4`
--

LOCK TABLES `Cluster4` WRITE;
/*!40000 ALTER TABLE `Cluster4` DISABLE KEYS */;
INSERT INTO `Cluster4` VALUES (1,'Node25',67000,5),(2,'Node26',27990,3),(3,'Node27',878289,5),(4,'Node28',26394,9),(5,'Node29',13509,2),(6,'Node30',13509,5),(7,'Node31',875167,7),(8,'Node32',5643,4);
/*!40000 ALTER TABLE `Cluster4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RoutingPath`
--

DROP TABLE IF EXISTS `RoutingPath`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RoutingPath` (
  `Frm` varchar(8) DEFAULT NULL,
  `Too` varchar(11) DEFAULT NULL,
  `path` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RoutingPath`
--

LOCK TABLES `RoutingPath` WRITE;
/*!40000 ALTER TABLE `RoutingPath` DISABLE KEYS */;
INSERT INTO `RoutingPath` VALUES ('Cluster1','Cluster2','Node4-> '),('Cluster2','Cluster3','Node10-> '),('Cluster3','Cluster4','Node23-> '),('Cluster4','Destination','Node27-> '),('Cluster1','Cluster2','Node4-> '),('Cluster2','Cluster3','Node10-> '),('Cluster3','Cluster4','Node23-> '),('Cluster4','Destination','Node31-> '),('Cluster1','Cluster2','Node4-> '),('Cluster2','Cluster3','Node10-> '),('Cluster3','Cluster4','Node23-> '),('Cluster4','Destination','Node27-> '),('Cluster1','Cluster2','Node4-> '),('Cluster2','Cluster3','Node9-> '),('Cluster3','Cluster4','Node21-> '),('Cluster4','Destination','Node31-> ');
/*!40000 ALTER TABLE `RoutingPath` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TDelay`
--

DROP TABLE IF EXISTS `TDelay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TDelay` (
  `Fname` varchar(13) DEFAULT NULL,
  `Destination` varchar(6) DEFAULT NULL,
  `Utime` varchar(19) DEFAULT NULL,
  `Delay` int(11) DEFAULT NULL,
  `th` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TDelay`
--

LOCK TABLES `TDelay` WRITE;
/*!40000 ALTER TABLE `TDelay` DISABLE KEYS */;
INSERT INTO `TDelay` VALUES ('test.java','Dest A','26/11/2018 17:07:24',46800300,'2.0178318821052633E7'),('Attacker.java','Dest A','26/11/2018 17:24:27',62400400,'1.305639754801798E7'),('Attacker.java','Dest B','26/11/2018 17:27:02',78000500,'1.6320496935022477E7'),('Attacker.java','Dest C','26/11/2018 17:28:25',31200200,'6528198.77400899');
/*!40000 ALTER TABLE `TDelay` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-22 15:20:25
