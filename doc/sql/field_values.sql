/*
Navicat MySQL Data Transfer

Source Server         : gongan
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : weather

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2020-03-04 17:18:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for field_values
-- ----------------------------
DROP TABLE IF EXISTS `field_values`;
CREATE TABLE `field_values` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `field` varchar(32) DEFAULT NULL,
  `value` varchar(32) DEFAULT NULL,
  `is_code` varchar(8) DEFAULT NULL,
  `code_value` varchar(32) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;
