package org.dows.org.open;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Schema(description = "GetOrgRegisterListResponse 对象")
public class GetOrgRegisterListResponse {

    @Schema(description = "组织实例ID")
    private Long orgInstanceId;

    @Schema(description = "账号实例ID")
    private Long accountInstanceId;

    @Schema(description = "社会统一信用代码")
    private String creditNo;

    @Schema(description = "组织地址")
    private String orgAddress;

    @Schema(description = "组织logo")
    private String logo;

    @Schema(description = "组织简介")
    private String introduction;

    @Schema(description = "组织邮箱")
    private String email;

    @Schema(description = "联系电话")
    private String phoneNum;

    @Schema(description = "联系人")
    private String contacts;

    @Schema(description = "组织规模[小，中，大...]")
    private Integer orgScale;

    @Schema(description = "组织类型[0:个体,1:公司,2:....]")
    private Integer orgType;

    @Schema(description = "人员规模")
    private Integer headcount;

    @Schema(description = "认证状态[0:未认证，1:已认证]")
    private Boolean state;

    @Schema(description = "认证时间")
    private LocalDateTime approvedTime;

    @Schema(description = "版本号")
    private Integer revision;

    @Schema(description = "应用id")
    private String app_id;

    @Schema(description = "时间戳")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "删除时间")
    private LocalDateTime deleteTime;

    @Schema(description = "创建者ID")
    private Long createId;

    @Schema(description = "更新者ID")
    private Long updateId;

}