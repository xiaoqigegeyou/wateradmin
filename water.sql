/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : water

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 09/07/2021 14:24:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '品牌名',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '单价',
  `message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '对品牌的描述',
  `image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像，暂无图片上传功能，一律使用公网图片地址',
  `capacity` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '容量',
  `warranty` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '保质期',
  `composition` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '成分',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of brand
-- ----------------------------
INSERT INTO `brand` VALUES (1, '怡宝', 3.00, '饮用纯净水！你我的怡宝', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=4139493697,2051141879&fm=26&gp=0.jpg', '1L', '12月', NULL);
INSERT INTO `brand` VALUES (2, '娃哈哈', 2.00, '优质健康水，认准娃哈哈', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3259700116,453446467&fm=26&gp=0.jpg', '1L', '12月', NULL);
INSERT INTO `brand` VALUES (3, '屈臣氏', 2.00, '高温 蒸馏 清纯 安心', 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1491150645,720922086&fm=26&gp=0.jpg', '1L', '12月', NULL);
INSERT INTO `brand` VALUES (4, '景田', 1.00, '饮用纯净水，清润解渴', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1732658025,1082673643&fm=26&gp=0.jpg', '500ml', '12月', NULL);
INSERT INTO `brand` VALUES (5, '雀巢优活', 1.00, '雀巢品质，万千信赖', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2751925452,1639241100&fm=26&gp=0.jpg', '500ml', '12月', NULL);
INSERT INTO `brand` VALUES (6, '冰露', 1.00, '补水，追求高品质', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2696988418,3979327880&fm=26&gp=0.jpg', '500ml', '12月', NULL);
INSERT INTO `brand` VALUES (7, '正广和', 3.00, '百年上海，你我信赖', 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3151705205,13779484&fm=26&gp=0.jpg', '1L', '12月', NULL);

-- ----------------------------
-- Table structure for deliver
-- ----------------------------
DROP TABLE IF EXISTS `deliver`;
CREATE TABLE `deliver`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `tell` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '电话',
  `sex` varchar(225) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '性别',
  `rate` decimal(10, 2) NULL DEFAULT 0.00 COMMENT '平均分',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of deliver
-- ----------------------------
INSERT INTO `deliver` VALUES (1, '薛佛世', '18304784667', '男', 1.67);
INSERT INTO `deliver` VALUES (2, '张灶冲', '13048593775', '男', 3.00);
INSERT INTO `deliver` VALUES (3, '文壮翔', '15087639485', '男', 3.50);
INSERT INTO `deliver` VALUES (4, '贺易', '19384750338', '女', 3.00);

-- ----------------------------
-- Table structure for inandout
-- ----------------------------
DROP TABLE IF EXISTS `inandout`;
CREATE TABLE `inandout`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '仓库地点',
  `bid` int(0) NULL DEFAULT NULL COMMENT '品牌id',
  `inNumber` int(10) UNSIGNED ZEROFILL NULL DEFAULT 0000000000 COMMENT '进货量',
  `outNumber` int(10) UNSIGNED ZEROFILL NULL DEFAULT 0000000000 COMMENT '出货量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of inandout
-- ----------------------------
INSERT INTO `inandout` VALUES (1, '1号仓库', 1, 0000000100, 0000000008);
INSERT INTO `inandout` VALUES (2, '1号仓库', 2, 0000000004, 0000000004);
INSERT INTO `inandout` VALUES (3, '1号仓库', 3, 0000000100, 0000000018);
INSERT INTO `inandout` VALUES (4, '1号仓库', 4, 0000000100, 0000000004);
INSERT INTO `inandout` VALUES (5, '1号仓库', 5, 0000000100, 0000000004);
INSERT INTO `inandout` VALUES (6, '1号仓库', 6, 0000000100, 0000000014);
INSERT INTO `inandout` VALUES (7, '2号仓库', 7, 0000000004, 0000000001);

-- ----------------------------
-- Table structure for inwater
-- ----------------------------
DROP TABLE IF EXISTS `inwater`;
CREATE TABLE `inwater`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `bid` int(0) NULL DEFAULT NULL COMMENT '品牌id',
  `inTime` datetime(0) NULL DEFAULT NULL COMMENT '入库时间',
  `proTime` datetime(0) NULL DEFAULT NULL COMMENT '生产日期',
  `inNumber` int(0) NULL DEFAULT NULL COMMENT '入库数量',
  `did` int(0) NULL DEFAULT NULL COMMENT '经手员工',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of inwater
-- ----------------------------
INSERT INTO `inwater` VALUES (5, 7, '2021-04-28 21:39:54', '2021-04-28 00:00:00', 3, 2);
INSERT INTO `inwater` VALUES (6, 6, '2021-04-28 21:40:07', '2021-04-28 00:00:00', 100, 1);
INSERT INTO `inwater` VALUES (7, 5, '2021-04-28 21:40:19', '2021-04-28 00:00:00', 100, 3);
INSERT INTO `inwater` VALUES (8, 4, '2021-04-28 21:40:29', '2021-04-28 00:00:00', 100, 4);
INSERT INTO `inwater` VALUES (9, 3, '2021-04-28 21:40:41', '2021-04-21 00:00:00', 100, 1);
INSERT INTO `inwater` VALUES (10, 2, '2021-04-28 21:40:55', '2021-03-18 00:00:00', 4, 1);
INSERT INTO `inwater` VALUES (11, 1, '2021-04-28 21:41:09', '2021-04-13 00:00:00', 100, 3);
INSERT INTO `inwater` VALUES (12, 7, '2021-04-28 21:44:18', '2021-04-14 00:00:00', 1, 3);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tell` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '水品牌名',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '总价',
  `person` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '送水人',
  `starttime` datetime(0) NULL DEFAULT NULL COMMENT '订单开始时间',
  `appointmenttime` datetime(0) NULL DEFAULT NULL COMMENT '预约时间',
  `endtime` datetime(0) NULL DEFAULT NULL COMMENT '订单结束时间',
  `addr` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '地址',
  `rate` decimal(10, 2) NULL DEFAULT NULL COMMENT '订单评价分',
  `flag` int(0) NULL DEFAULT 1 COMMENT '订单状态标识 1 配送中 2 已送达 3 已评价',
  `text` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注',
  `uid` int(0) NULL DEFAULT NULL COMMENT '对应用户id',
  `did` int(0) NULL DEFAULT NULL COMMENT '对应送水人id',
  `number` int(0) NULL DEFAULT NULL COMMENT '购买数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 46 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (17, '李四', '15063185664', '娃哈哈', 2.00, '张灶冲', '2021-02-24 16:48:40', '2021-02-24 16:53:55', '2021-02-24 16:53:56', '北京三里屯', 4.00, 3, '很好', 6, 2, 1);
INSERT INTO `order` VALUES (18, '李四', '15063185664', '屈臣氏', 2.00, '张灶冲', '2021-02-24 16:52:05', '2021-02-24 16:53:55', '2021-02-24 16:53:54', '北京三里屯', 3.00, 3, NULL, 6, 2, 1);
INSERT INTO `order` VALUES (22, '李四', '15063185664', '雀巢优活', 4.00, '文壮翔', '2021-02-27 00:59:16', '2021-02-27 00:59:26', '2021-02-27 16:48:28', '北京三里屯', 3.00, 3, '', 6, 3, 4);
INSERT INTO `order` VALUES (23, '李四', '15063185664', '正广和', 3.00, '贺易', '2021-02-27 16:32:45', '2021-02-27 16:32:52', '2021-02-27 16:45:30', '北京三里屯', 5.00, 3, '非常好', 6, 4, 1);
INSERT INTO `order` VALUES (24, '李四', '15063185664', '屈臣氏', 2.00, '薛佛世', '2021-02-27 17:05:01', '2021-02-27 17:05:05', '2021-02-27 17:21:46', '北京三里屯', 1.00, 3, '不行', 6, 1, 1);
INSERT INTO `order` VALUES (25, '李四', '15063185664', '冰露', 9.00, '文壮翔', '2021-02-27 17:05:01', '2021-02-27 17:05:16', '2021-02-27 17:21:50', '北京三里屯', 4.00, 3, 'good', 6, 3, 9);
INSERT INTO `order` VALUES (26, '李四', '15063185664', '怡宝', 12.00, '文壮翔', '2021-02-27 23:23:30', '2021-02-28 23:23:42', NULL, '北京三里屯', NULL, 1, NULL, 6, 3, 4);
INSERT INTO `order` VALUES (27, '张三', '15063185666', '屈臣氏', 10.00, '文壮翔', '2021-02-27 23:24:18', '2021-02-27 23:24:23', '2021-03-02 16:50:49', '山东省威海市长清区山东交通学院', NULL, 2, NULL, 3, 3, 5);
INSERT INTO `order` VALUES (28, '张三', '15063185666', '冰露', 3.00, '张灶冲', '2021-02-27 23:24:34', '2021-02-27 23:24:42', '2021-03-02 16:48:49', '山东省威海市长清区山东交通学院', 3.00, 3, '', 3, 2, 3);
INSERT INTO `order` VALUES (29, '张三', '15063185666', '屈臣氏', 8.00, '薛佛世', '2021-02-27 23:24:34', '2021-02-28 23:24:49', '2021-03-02 16:48:52', '山东省威海市长清区山东交通学院', 3.00, 3, '', 3, 1, 4);
INSERT INTO `order` VALUES (30, '张三', '15063185666', '正广和', 39.00, '张灶冲', '2021-02-27 23:24:34', '2021-02-27 23:25:22', '2021-02-27 23:25:46', '山东省威海市长清区山东交通学院', 2.00, 3, '太慢', 3, 2, 13);
INSERT INTO `order` VALUES (31, '李四', '15063185660', '娃哈哈', 2.00, '张灶冲', '2021-03-01 12:12:54', '2021-03-01 12:13:04', NULL, '北京三里屯', NULL, 1, NULL, 6, 2, 1);
INSERT INTO `order` VALUES (32, '张三', '15063185666', '怡宝', 6.00, '薛佛世', '2021-03-02 16:50:18', '2021-03-02 16:50:26', NULL, '山东省 威海市 长清区 山东交通学院', NULL, 1, NULL, 3, 1, 2);
INSERT INTO `order` VALUES (33, '张三', '15063185666', '屈臣氏', 12.00, '贺易', '2021-03-02 16:56:33', '2021-03-18 16:56:39', NULL, '山东省 威海市 长清区 山东交通学院', NULL, 1, NULL, 3, 4, 6);
INSERT INTO `order` VALUES (34, '张三', '15063185666', '娃哈哈', 2.00, '薛佛世', '2021-03-02 16:56:33', '2021-03-02 16:58:07', NULL, '山东省 威海市 长清区 山东交通学院', NULL, 1, NULL, 3, 1, 1);
INSERT INTO `order` VALUES (35, '张三', '15063185666', '娃哈哈', 2.00, '薛佛世', '2021-03-02 17:31:41', '2021-03-02 17:31:44', '2021-03-02 17:34:52', '山东省 威海市 长清区 山东交通学院', 1.00, 3, '', 3, 1, 1);
INSERT INTO `order` VALUES (36, '李四', '15063185664', '屈臣氏', 2.00, '贺易', '2021-03-03 23:23:33', '2021-03-31 23:23:43', '2021-03-03 23:23:57', '北京市 朝阳区 三里屯', 1.00, 3, '慢', 6, 4, 1);
INSERT INTO `order` VALUES (37, '李四', '15063185664', '怡宝', 3.00, '张灶冲', '2021-04-05 19:15:29', '2021-04-05 19:15:42', NULL, '北京市 朝阳区 三里屯', NULL, 1, NULL, 6, 2, 1);
INSERT INTO `order` VALUES (38, '小韩', '15063185663', '怡宝', 3.00, '薛佛世', '2021-04-05 23:12:43', '2021-04-05 23:12:50', NULL, '山东省 济南市 市中区 111', NULL, 1, NULL, 8, 1, 1);
INSERT INTO `order` VALUES (39, '李四', '15063185664', '景田', 3.00, '文壮翔', '2021-04-28 21:28:42', '2021-04-28 21:28:54', NULL, '山东省 济南市 长清区 山东交通学院', NULL, 1, NULL, 6, 3, 3);
INSERT INTO `order` VALUES (40, '李四', '15063185664', '景田', 1.00, '贺易', '2021-04-28 21:29:06', '2021-04-28 21:35:14', NULL, '山东省 济南市 长清区 山东交通学院', NULL, 1, NULL, 6, 4, 1);

-- ----------------------------
-- Table structure for outwater
-- ----------------------------
DROP TABLE IF EXISTS `outwater`;
CREATE TABLE `outwater`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `bid` int(0) NULL DEFAULT NULL COMMENT '品牌id',
  `outTime` datetime(0) NULL DEFAULT NULL COMMENT '出库时间',
  `outNumber` int(0) NULL DEFAULT NULL COMMENT '出库数量',
  `did` int(0) NULL DEFAULT NULL COMMENT '经手员工',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of outwater
-- ----------------------------
INSERT INTO `outwater` VALUES (1, 4, '2021-04-28 21:29:06', 1, 4);
INSERT INTO `outwater` VALUES (4, 4, '2021-04-28 21:28:42', 3, 3);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `tell` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '电话',
  `pass` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `roles` int(0) NULL DEFAULT 2 COMMENT '角色 1 admin 2 normal',
  `area` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '地区',
  `addr` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '详细地址',
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '性别 ',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像，暂无图片上传功能，一律使用公网图片地址',
  PRIMARY KEY (`id`, `tell`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (2, 'admin', '15063185665', '111', 1, NULL, NULL, '男', 'https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif');
INSERT INTO `user` VALUES (3, '张三', '15063185666', '111', 2, NULL, '山东省 威海市 长清区 山东交通学院', '男', 'https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif');
INSERT INTO `user` VALUES (6, '李四', '15063185664', '111', 2, '山东省,济南市,长清区', '山东交通学院', '女', '');
INSERT INTO `user` VALUES (8, '小韩', '15063185663', '111', 2, '山东省,济南市,市中区', '111', '男', NULL);
INSERT INTO `user` VALUES (13, '小黄', '15063185660', '111', 2, '福建省,莆田市,秀屿区', '芜湖', '女', NULL);

SET FOREIGN_KEY_CHECKS = 1;
