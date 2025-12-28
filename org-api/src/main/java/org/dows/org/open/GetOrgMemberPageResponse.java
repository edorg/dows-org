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
@Schema(description = "GetOrgMemberPageResponse 对象")
public class GetOrgMemberPageResponse {

    @Schema(description = "组织成员ID")
    private Long orgMemberId;

    @Schema(description = "组织实例ID")
    private Long orgInstanceId;

    @Schema(description = "组织树ID")
    private Long orgTreeId;

    @Schema(description = "组织信息ID")
    private Long orgInfoId;

    @Schema(description = "账号实例ID")
    private Long accountInstanceId;

    @Schema(description = "用户ID")
    private Long userInstanceId;

    @Schema(description = "昵称")
    private String nickname;

    @Schema(description = "用户名")
    private String userName;

    @Schema(description = "组织岗位ID")
    private Long orgPositionId;

    @Schema(description = "岗位编号[P_6位数字]")
    private String positionNo;

    @Schema(description = "岗位名称[java高级工程师,架构师]")
    private String positionName;

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