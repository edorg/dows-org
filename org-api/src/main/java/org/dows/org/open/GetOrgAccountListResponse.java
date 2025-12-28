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
@Schema(description = "GetOrgAccountListResponse 对象")
public class GetOrgAccountListResponse {

    @Schema(description = "账号登记ID")
    private Long accountRegisterId;

    @Schema(description = "组织实例ID")
    private Long orgInstanceId;

    @Schema(description = "组织树ID")
    private Long orgTreeId;

    @Schema(description = "账号实例ID")
    private Long accountInstanceId;

    @Schema(description = "昵称")
    private String nickname;

    @Schema(description = "账号标识[邮箱|手机号|openid]")
    private String identifier;

    @Schema(description = "标识类型[email,phone,openid]")
    private Integer identifierType;

    @Schema(description = "账号类型")
    private Integer accountType;

    @Schema(description = "部门")
    private String department;

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