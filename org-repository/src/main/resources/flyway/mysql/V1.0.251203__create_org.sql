-- 若库不存在创建一个
CREATE DATABASE IF NOT EXISTS `org`;
USE `org`;

drop table if exists `org_instance`;
CREATE TABLE IF NOT EXISTS `org_instance`(
    `org_instance_id` bigint(19) NOT NULL COMMENT '组织实例ID',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '账号实例ID',
    `credit_no` varchar(64) DEFAULT NULL COMMENT '社会统一信用代码',
    `org_address` varchar(64) DEFAULT NULL COMMENT '组织地址',
    `logo` varchar(64) DEFAULT NULL COMMENT '组织logo',
    `introduction` varchar(64) DEFAULT NULL COMMENT '组织简介',
    `email` varchar(64) DEFAULT NULL COMMENT '组织邮箱',
    `phone_num` varchar(64) DEFAULT NULL COMMENT '联系电话',
    `contacts` varchar(64) DEFAULT NULL COMMENT '联系人',
    `org_scale` integer(11) DEFAULT NULL COMMENT '组织规模[小，中，大...]',
    `org_type` integer(11) DEFAULT NULL COMMENT '组织类型[0:个体,1:公司,2:....]',
    `headcount` integer(11) DEFAULT NULL COMMENT '人员规模',
    `state` tinyint(4) DEFAULT NULL COMMENT '认证状态[0:未认证，1:已认证]',
    `approved_time` datetime DEFAULT NULL COMMENT '认证时间',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`org_instance_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `org_address`;
CREATE TABLE IF NOT EXISTS `org_address`(
    `org_address_id` bigint(19) NOT NULL COMMENT '组织地址ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `org_tree_id` bigint(19) DEFAULT NULL COMMENT '组织树ID',
    `country` varchar(64) DEFAULT NULL COMMENT '国家',
    `province` varchar(64) DEFAULT NULL COMMENT '省',
    `city` varchar(64) DEFAULT NULL COMMENT '市',
    `district` varchar(64) DEFAULT NULL COMMENT '区',
    `street` varchar(64) DEFAULT NULL COMMENT '街道',
    `building_no` varchar(64) DEFAULT NULL COMMENT '建筑号',
    `room_no` varchar(64) DEFAULT NULL COMMENT '房号',
    `address` varchar(64) DEFAULT NULL COMMENT '详细地址',
    `state` integer(11) DEFAULT NULL COMMENT '状态',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`org_address_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `org_tree`;
CREATE TABLE IF NOT EXISTS `org_tree`(
    `org_tree_id` bigint(19) NOT NULL COMMENT '组织树ID',
    `parent_id` bigint(19) DEFAULT NULL COMMENT '父ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `name` varchar(64) DEFAULT NULL COMMENT '组织名',
    `code` varchar(64) DEFAULT NULL COMMENT '组织编码',
    `avatar` varchar(64) DEFAULT NULL COMMENT '组织头像',
    `id_path` varchar(64) DEFAULT NULL COMMENT 'ID路径',
    `name_path` varchar(64) DEFAULT NULL COMMENT '名称路径',
    `level` integer(11) DEFAULT NULL COMMENT '层级',
    `org_property` integer(11) DEFAULT NULL COMMENT '组织性质[0:内部,1:外部]',
    `sorted` integer(11) DEFAULT NULL COMMENT '排序',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`org_tree_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `org_info`;
CREATE TABLE IF NOT EXISTS `org_info`(
    `org_info_id` bigint(19) NOT NULL COMMENT '组织信息ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `org_tree_id` bigint(19) DEFAULT NULL COMMENT '组织树ID',
    `org_role_id` bigint(19) DEFAULT NULL COMMENT '组织角色ID',
    `leader_id` bigint(19) DEFAULT NULL COMMENT '负责人账号ID',
    `org_address_id` bigint(19) DEFAULT NULL COMMENT '组织地址ID',
    `leader_name` varchar(64) DEFAULT NULL COMMENT '负责人',
    `headcount` integer(11) DEFAULT NULL COMMENT '人员数量',
    `introduce` varchar(64) DEFAULT NULL COMMENT '组织介绍',
    `org_info` varchar(64) DEFAULT NULL COMMENT '组织信息JSON',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`org_info_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `org_position`;
CREATE TABLE IF NOT EXISTS `org_position`(
    `org_position_id` bigint(19) NOT NULL COMMENT '组织岗位ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `org_tree_id` bigint(19) DEFAULT NULL COMMENT '组织树ID',
    `org_info_id` bigint(19) DEFAULT NULL COMMENT '组织信息ID',
    `org_address_id` bigint(19) DEFAULT NULL COMMENT '组织地址ID',
    `position_type` integer(11) DEFAULT NULL COMMENT '岗位类型[1:兼职，2:全职，...]',
    `position_no` varchar(64) DEFAULT NULL COMMENT '岗位编号[P_6位数字]',
    `position_name` varchar(64) DEFAULT NULL COMMENT '岗位名称[java高级工程师,架构师]',
    `description` text DEFAULT NULL COMMENT '岗位描述',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`org_position_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `org_email`;
CREATE TABLE IF NOT EXISTS `org_email`(
    `org_email_id` bigint(19) NOT NULL COMMENT '组织邮箱ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `org_tree_id` bigint(19) DEFAULT NULL COMMENT '组织树ID',
    `email` varchar(64) DEFAULT NULL COMMENT '企业邮箱',
    `config_json` varchar(64) DEFAULT NULL COMMENT 'JSON配置',
    `description` varchar(64) DEFAULT NULL COMMENT '描述',
    `email_type` integer(11) DEFAULT NULL COMMENT '邮箱类型[收件，发件,...]',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`org_email_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `org_member`;
CREATE TABLE IF NOT EXISTS `org_member`(
    `org_member_id` bigint(19) NOT NULL COMMENT '组织成员ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `org_tree_id` bigint(19) DEFAULT NULL COMMENT '组织树ID',
    `org_info_id` bigint(19) DEFAULT NULL COMMENT '组织信息ID',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '账号实例ID',
    `user_instance_id` bigint(19) DEFAULT NULL COMMENT '用户ID',
    `nickname` varchar(64) DEFAULT NULL COMMENT '昵称',
    `user_name` varchar(64) DEFAULT NULL COMMENT '用户名',
    `org_position_id` bigint(19) DEFAULT NULL COMMENT '组织岗位ID',
    `position_no` varchar(64) DEFAULT NULL COMMENT '岗位编号[P_6位数字]',
    `position_name` varchar(64) DEFAULT NULL COMMENT '岗位名称[java高级工程师,架构师]',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`org_member_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `org_account`;
CREATE TABLE IF NOT EXISTS `org_account`(
    `account_register_id` bigint(19) DEFAULT NULL COMMENT '账号登记ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `org_tree_id` bigint(19) DEFAULT NULL COMMENT '组织树ID',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '账号实例ID',
    `nickname` varchar(64) DEFAULT NULL COMMENT '昵称',
    `identifier` varchar(64) DEFAULT NULL COMMENT '账号标识[邮箱|手机号|openid]',
    `identifier_type` integer(11) DEFAULT NULL COMMENT '标识类型[email,phone,openid]',
    `account_type` integer(11) DEFAULT NULL COMMENT '账号类型',
    `department` varchar(64) DEFAULT NULL COMMENT '部门',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`account_register_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `org_role`;
CREATE TABLE IF NOT EXISTS `org_role`(
    `org_role_id` bigint(19) NOT NULL COMMENT '组织角色ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `org_tree_id` bigint(19) DEFAULT NULL COMMENT '组织树ID',
    `rbac_role_id` bigint(19) DEFAULT NULL COMMENT '角色实例ID',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`org_role_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `org_space`;
CREATE TABLE IF NOT EXISTS `org_space`(
    `org_space_id` bigint(19) NOT NULL COMMENT '组织空间ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `pid` bigint(19) DEFAULT NULL COMMENT '父节点ID',
    `org_tree_id` bigint(19) DEFAULT NULL COMMENT '组织树ID',
    `space_name` varchar(64) DEFAULT NULL COMMENT '空间名',
    `shared` integer(11) DEFAULT NULL COMMENT '共享模式[0:共享当前空间，1:共享所有子空间]',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`org_space_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `org_resource`;
CREATE TABLE IF NOT EXISTS `org_resource`(
    `org_resource_id` bigint(19) NOT NULL COMMENT '组织资源ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `org_space_id` bigint(19) DEFAULT NULL COMMENT '组织空间ID',
    `reference_id` bigint(19) DEFAULT NULL COMMENT '引用的资源ID，可以来自[hrm,oss,exam...]',
    `reference_source` varchar(64) DEFAULT NULL COMMENT '引用资源名，可以来自[hrm,exam]表',
    `reference_type` varchar(64) DEFAULT NULL COMMENT '来源类型[.....]',
    `content_link` varchar(64) DEFAULT NULL COMMENT '内容资源',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`org_resource_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `org_okr`;
CREATE TABLE IF NOT EXISTS `org_okr`(
    `org_okr` bigint(19) DEFAULT NULL COMMENT '组织目标ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织实例ID',
    `org_tree_id` bigint(19) DEFAULT NULL COMMENT '组织树ID',
    `ork_objective_id` bigint(19) DEFAULT NULL COMMENT '目标ID',
    `objective_title` varchar(64) DEFAULT NULL COMMENT '目标标题',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`org_okr`)
) ENGINE=InnoDB COMMENT='';


