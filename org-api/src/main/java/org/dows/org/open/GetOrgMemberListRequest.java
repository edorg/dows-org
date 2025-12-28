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
@Schema(description = "GetOrgMemberListRequest 对象")
public class GetOrgMemberListRequest {

    @Schema(description = "")
    private String orgName组织名称;

    @Schema(description = "部门名称")
    private String orgTreeName;

    @Schema(description = "昵称")
    private String nickname;

    @Schema(description = "用户名")
    private String userName;

    @Schema(description = "岗位编号[P_6位数字]")
    private String positionNo;

    @Schema(description = "岗位名称[java高级工程师,架构师]")
    private String positionName;

}