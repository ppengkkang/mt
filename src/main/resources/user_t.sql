/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.0.180
 Source Server Type    : MySQL
 Source Server Version : 50623
 Source Host           : 192.168.0.180
 Source Database       : fuwuhao

 Target Server Type    : MySQL
 Target Server Version : 50623
 File Encoding         : utf-8

 Date: 10/13/2016 15:47:18 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user_t`
-- ----------------------------
DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t` (
  `user_name` varchar(20) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user_t`
-- ----------------------------
BEGIN;
INSERT INTO `user_t` VALUES ('user1', '123456', '1', '10');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
