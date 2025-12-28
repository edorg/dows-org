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
@Schema(description = "GetOrgPositionListRequest 对象")
public class GetOrgPositionListRequest {

    @Schema(description = "组织实例ID")
    private Long orgInstanceId;

    @Schema(description = "组织树ID")
    private Long orgTreeId;

    @Schema(description = "组织信息ID")
    private Long orgInfoId;

    @Schema(description = "组织地址ID")
    private Long orgAddressId;

    @Schema(description = "岗位类型[1:兼职，2:全职，...]")
    private Integer positionType;

    @Schema(description = "岗位编号[P_6位数字]")
    private String positionNo;

    @Schema(description = "岗位名称[java高级工程师,架构师]")
    private String positionName;

}