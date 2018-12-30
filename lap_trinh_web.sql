/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50051
 Source Host           : localhost:3306
 Source Schema         : lap_trinh_web

 Target Server Type    : MySQL
 Target Server Version : 50051
 File Encoding         : 65001

 Date: 22/11/2018 09:04:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_bill
-- ----------------------------
DROP TABLE IF EXISTS `tbl_bill`;
CREATE TABLE `tbl_bill`  (
  `id_bill` bigint(11) NOT NULL,
  `id_user` bigint(11) NOT NULL,
  `totalcart` double(255, 0) NOT NULL,
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `address` longtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY USING BTREE (`id_bill`)
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_bill
-- ----------------------------
INSERT INTO `tbl_bill` VALUES (1546012324812, 1545995448306, 160, 'nguyenlinh', 'Phung Hung - Ha Dong', '2018-12-28 22:52:04');
INSERT INTO `tbl_bill` VALUES (1546007595070, 1545995401811, 100, '1111111', 'dinhtienkiet', '2018-12-28 21:33:15');
INSERT INTO `tbl_bill` VALUES (1546008112756, 1545995448306, 90, '111111', 'nguyenlinh', '2018-12-28 21:41:52');
INSERT INTO `tbl_bill` VALUES (1546011568679, 1545995401811, 120, 'dinhtienkiet', 'Tran Phu - Ha Dong', '2018-12-28 22:39:28');
INSERT INTO `tbl_bill` VALUES (1546013292419, 1545995320370, 200, 'doanhtu', 'Trieu Khuc - Ha Dong', '2018-12-28 23:08:12');
INSERT INTO `tbl_bill` VALUES (1, 1545995320370, 770, 'doanhtu', 'Trieu Khuc - Ha Dong', '2018-09-10 01:39:36');
INSERT INTO `tbl_bill` VALUES (2, 1545995448306, 430, 'nguyenlinh', 'Phung Hung - Ha Dong', '2018-09-17 01:40:08');
INSERT INTO `tbl_bill` VALUES (3, 1545995448306, 150, 'nguyenlinh', 'Phung Hung - Ha Dong', '2018-12-27 01:40:28');
INSERT INTO `tbl_bill` VALUES (4, 1545995401811, 400, 'dinhtienkiet', 'Tran Phu - Ha Dong', '2018-09-25 01:40:04');
INSERT INTO `tbl_bill` VALUES (5, 1545995320370, 360, 'doanhtu', 'Trieu Khuc - Ha Dong', '2018-10-03 01:39:56');
INSERT INTO `tbl_bill` VALUES (1546059578607, 1545995320370, 100, 'doanhtu', 'Tan Trieu', '2018-12-29 11:59:38');
INSERT INTO `tbl_bill` VALUES (1546086484475, 1545995401811, 180, 'dinhtienkiet', 'Ha Dong - Ha Noi', '2018-12-29 19:28:04');
INSERT INTO `tbl_bill` VALUES (1546089735740, 1545995320370, 190, 'doanhtu', 'Ha Noi', '2018-12-29 20:22:15');
INSERT INTO `tbl_bill` VALUES (1546090898757, 1545995401811, 20, 'dinhtienkiet', 'Ha Noi', '2018-12-29 20:41:38');
INSERT INTO `tbl_bill` VALUES (1546091991156, 1545995401811, 20, 'dinhtienkiet', 'Phung Hung', '2018-12-29 21:00:35');
INSERT INTO `tbl_bill` VALUES (1546139758439, 1546139659341, 280, 'dnhung', 'Ha Dong', '2018-12-30 10:15:58');

-- ----------------------------
-- Table structure for tbl_billdetail
-- ----------------------------
DROP TABLE IF EXISTS `tbl_billdetail`;
CREATE TABLE `tbl_billdetail`  (
  `id_bill` bigint(11) NOT NULL,
  `id_sp` bigint(11) NOT NULL,
  `gia_sp` double(20, 0) NOT NULL,
  `soluong` int(20) NOT NULL,
  `datedetail` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_billdetail
-- ----------------------------
INSERT INTO `tbl_billdetail` VALUES (3, 3, 30, 5, '27/12/2018');
INSERT INTO `tbl_billdetail` VALUES (3, 5, 60, 1, '27/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546011568679, 2, 40, 2, '28/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546011568679, 1, 20, 2, '28/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546012324812, 4, 50, 2, '28/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546012324812, 1, 20, 3, '28/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1, 1, 20, 6, '10/09/2018');
INSERT INTO `tbl_billdetail` VALUES (1, 3, 30, 10, '10/09/2018');
INSERT INTO `tbl_billdetail` VALUES (1, 4, 50, 7, '10/09/2018');
INSERT INTO `tbl_billdetail` VALUES (2, 2, 40, 7, '17/09/2018');
INSERT INTO `tbl_billdetail` VALUES (2, 4, 50, 3, '17/09/2018');
INSERT INTO `tbl_billdetail` VALUES (4, 1, 20, 10, '25/09/2018');
INSERT INTO `tbl_billdetail` VALUES (4, 2, 40, 5, '25/09/2018');
INSERT INTO `tbl_billdetail` VALUES (5, 5, 60, 3, '03/08/2019');
INSERT INTO `tbl_billdetail` VALUES (5, 3, 30, 6, '03/08/2019');
INSERT INTO `tbl_billdetail` VALUES (1546013292419, 1, 20, 2, '28/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546013292419, 2, 40, 1, '28/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546013292419, 5, 60, 2, '28/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546059578607, 1, 20, 5, '29/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546086484475, 1, 20, 1, '29/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546086484475, 3, 30, 2, '29/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546086484475, 4, 50, 2, '29/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546089735740, 1, 20, 2, '29/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546089735740, 4, 50, 3, '29/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546090898757, 1, 20, 1, '29/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546091991156, 1, 20, 1, '29/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546139758439, 3, 30, 2, '30/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546139758439, 4, 50, 2, '30/12/2018');
INSERT INTO `tbl_billdetail` VALUES (1546139758439, 5, 60, 2, '30/12/2018');

-- ----------------------------
-- Table structure for tbl_sanpham
-- ----------------------------
DROP TABLE IF EXISTS `tbl_sanpham`;
CREATE TABLE `tbl_sanpham`  (
  `id_sp` bigint(11) NOT NULL,
  `ten_sp` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `anh_sp` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `gia_sp` double(255, 0) NOT NULL,
  PRIMARY KEY USING BTREE (`id_sp`)
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_sanpham
-- ----------------------------
INSERT INTO `tbl_sanpham` VALUES (1, 'sanpham1', 'img/product/pro.jpg', 20);
INSERT INTO `tbl_sanpham` VALUES (2, 'sanpham2', 'img/product/pro-1.jpg', 40);
INSERT INTO `tbl_sanpham` VALUES (3, 'sanpham3', 'img/product/pro-2.jpg', 30);
INSERT INTO `tbl_sanpham` VALUES (4, 'sanpham4', 'img/product/pro-3.jpg', 50);
INSERT INTO `tbl_sanpham` VALUES (5, 'sanpham5', 'img/product/pro-4.jpg', 60);

-- ----------------------------
-- Table structure for tbl_taikhoan
-- ----------------------------
DROP TABLE IF EXISTS `tbl_taikhoan`;
CREATE TABLE `tbl_taikhoan`  (
  `id_user` bigint(11) NOT NULL,
  `user_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_pass` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_role` bigint(255) NOT NULL,
  PRIMARY KEY USING BTREE (`id_user`)
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_taikhoan
-- ----------------------------
INSERT INTO `tbl_taikhoan` VALUES (1546140178801, 'demo', '81dc9bdb52d04dc20036dbd8313ed055', 0);
INSERT INTO `tbl_taikhoan` VALUES (1545995448306, 'nguyenlinh', '81dc9bdb52d04dc20036dbd8313ed055', 0);
INSERT INTO `tbl_taikhoan` VALUES (1546139659341, 'dnhung', '81dc9bdb52d04dc20036dbd8313ed055', 0);
INSERT INTO `tbl_taikhoan` VALUES (1545995401811, 'dinhtienkiet', '81dc9bdb52d04dc20036dbd8313ed055', 0);
INSERT INTO `tbl_taikhoan` VALUES (1545995320370, 'doanhtu', '81dc9bdb52d04dc20036dbd8313ed055', 0);
INSERT INTO `tbl_taikhoan` VALUES (1545995081516, 'Admin', '21232f297a57a5a743894a0e4a801fc3', 1);

SET FOREIGN_KEY_CHECKS = 1;
