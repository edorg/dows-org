package org.dows.org.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("org_info")
public class OrgInfoEntity extends CrudEntity<OrgInfoEntity> {

    @Schema(title = "组织信息ID")
    private Long orgInfoId;
    @Schema(title = "组织实例ID")
    private Long orgInstanceId;
    @Schema(title = "组织树ID")
    private Long orgTreeId;
    @Schema(title = "组织角色ID")
    private Long orgRoleId;
    @Schema(title = "负责人账号ID")
    private Long leaderId;
    @Schema(title = "组织地址ID")
    private Long orgAddressId;
    @Schema(title = "负责人")
    private String leaderName;
    @Schema(title = "人员数量")
    private Integer headcount;
    @Schema(title = "组织介绍")
    private String introduce;
    @Schema(title = "组织信息JSON")
    private String orgInfo;
    @Schema(title = "版本号")
    private Integer revision;
    @Schema(title = "应用id")
    private String appId;
    @Schema(title = "时间戳")
    private LocalDateTime createTime;
    @Schema(title = "更新时间")
    private LocalDateTime updateTime;
    @Schema(title = "删除时间")
    private LocalDateTime deleteTime;
    @Schema(title = "创建者ID")
    private Long createId;
    @Schema(title = "更新者ID")
    private Long updateId;
}