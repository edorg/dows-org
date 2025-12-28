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
@Table("org_instance")
public class OrgInstanceEntity extends CrudEntity<OrgInstanceEntity> {

    @Schema(title = "组织实例ID")
    private Long orgInstanceId;
    @Schema(title = "账号实例ID")
    private Long accountInstanceId;
    @Schema(title = "社会统一信用代码")
    private String creditNo;
    @Schema(title = "组织地址")
    private String orgAddress;
    @Schema(title = "组织logo")
    private String logo;
    @Schema(title = "组织简介")
    private String introduction;
    @Schema(title = "组织邮箱")
    private String email;
    @Schema(title = "联系电话")
    private String phoneNum;
    @Schema(title = "联系人")
    private String contacts;
    @Schema(title = "组织规模[小，中，大...]")
    private Integer orgScale;
    @Schema(title = "组织类型[0:个体,1:公司,2:....]")
    private Integer orgType;
    @Schema(title = "人员规模")
    private Integer headcount;
    @Schema(title = "认证状态[0:未认证，1:已认证]")
    private Boolean state;
    @Schema(title = "认证时间")
    private LocalDateTime approvedTime;
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