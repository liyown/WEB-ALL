/*
SQLyog Community v13.2.1 (64 bit)
MySQL - 5.7.44 : Database - schedule_system
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`schedule_system` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `schedule_system`;

/*Table structure for table `sys_schedule` */

DROP TABLE IF EXISTS `sys_schedule`;

CREATE TABLE `sys_schedule` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `title` varchar(20) DEFAULT NULL,
  `completed` int(1) DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `sys_schedule` */

insert  into `sys_schedule`(`sid`,`uid`,`title`,`completed`) values 
(15,1,'请编辑',0),
(16,1,'请编辑',0),
(17,1,'请编辑',0),
(18,1,'请编辑',0);

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(10) DEFAULT NULL,
  `user_pwd` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE,
  UNIQUE KEY `username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `sys_user` */

insert  into `sys_user`(`uid`,`username`,`user_pwd`) values 
(1,'liuyaowen','e10adc3949ba59abbe56e057f20f883e'),
(2,'qweqwe','4297f44b13955235245b2497399d7a93'),
(4,'liuyaowu','e10adc3949ba59abbe56e057f20f883e'),
(5,'qqqqqqq','c8837b23ff8aaa8a2dde915473ce0991'),
(6,'qqqqqqqq','c8837b23ff8aaa8a2dde915473ce0991'),
(7,'qqqqqqqqq','c8837b23ff8aaa8a2dde915473ce0991'),
(8,'lyw','123456');

/*Table structure for table `kkk` */

DROP TABLE IF EXISTS `kkk`;

/*!50001 DROP VIEW IF EXISTS `kkk` */;
/*!50001 DROP TABLE IF EXISTS `kkk` */;

/*!50001 CREATE TABLE  `kkk`(
 `username` int(11) 
)*/;

/*View structure for view kkk */

/*!50001 DROP TABLE IF EXISTS `kkk` */;
/*!50001 DROP VIEW IF EXISTS `kkk` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `kkk` AS select `sys_schedule`.`sid` AS `username` from (`sys_schedule` join `sys_user`) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
