/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.28 : Database - moviedb(test)
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`moviedb(test)` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `moviedb(test)`;

/*Table structure for table `image` */

DROP TABLE IF EXISTS `image`;

CREATE TABLE `image` (
  `id` bigint(20) NOT NULL,
  `image_name` varchar(45) NOT NULL,
  `image_url` varchar(45) NOT NULL COMMENT 'id\n图片名\n图片url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `image` */

/*Table structure for table `movie` */

DROP TABLE IF EXISTS `movie`;

CREATE TABLE `movie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(45) NOT NULL,
  `movie_resouse_url` varchar(255) DEFAULT NULL,
  `image_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`,`image_id`),
  KEY `fk_movie_image1_idx` (`image_id`),
  CONSTRAINT `fk_movie_image1` FOREIGN KEY (`image_id`) REFERENCES `image` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `movie` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户表\nid\n用户名\nemail\n密码\n创建日期',
  `username` varchar(16) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`email`,`password`) values (3,'GaryPotter','1183111702@qq.com','hewei123'),(4,'南宫霸天','1037889020@qq.com','hewei123');

/*Table structure for table `user_comment_movie` */

DROP TABLE IF EXISTS `user_comment_movie`;

CREATE TABLE `user_comment_movie` (
  `id` bigint(20) NOT NULL COMMENT '用户评论打分表\nid\n用户id\n电影id\n评论内容 可为空\n评论时间\n评价',
  `user_id` bigint(20) NOT NULL,
  `movie_id` bigint(20) NOT NULL,
  `comment` tinytext,
  `comment_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `score` double NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_has_movie_movie1_idx` (`movie_id`),
  KEY `fk_user_has_movie_user_idx` (`user_id`),
  CONSTRAINT `fk_user_has_movie_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_has_movie_movie1` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_comment_movie` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
