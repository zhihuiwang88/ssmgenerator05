/*
Navicat MySQL Data Transfer

Source Server         : gongan
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : weather

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2020-03-04 15:42:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pa_data
-- ----------------------------
DROP TABLE IF EXISTS `pa_data`;
CREATE TABLE `pa_data` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `version` varchar(64) DEFAULT NULL,
  `session_id` varchar(256) DEFAULT NULL,
  `data_obj_id` varchar(32) DEFAULT NULL,
  `conditiones` varchar(128) DEFAULT NULL,
  `order_by` varchar(128) DEFAULT NULL,
  `fieldes` varchar(128) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
