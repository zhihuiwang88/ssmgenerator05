/*
Navicat MySQL Data Transfer

Source Server         : gongan
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : weather

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2020-03-05 10:14:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for operations_params
-- ----------------------------
DROP TABLE IF EXISTS `operations_params`;
CREATE TABLE `operations_params` (
  `id` int(64) NOT NULL AUTO_INCREMENT,
  `operation_type` varchar(64) DEFAULT NULL,
  `operation_id` varchar(64) DEFAULT NULL,
  `source_id` varchar(64) DEFAULT NULL,
  `data_obj_id` varchar(64) DEFAULT NULL,
  `conditiones` varchar(64) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;
