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
@Schema(description = "PostOrgAccountEntityRequest 对象")
public class PostOrgAccountEntityRequest {

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

}