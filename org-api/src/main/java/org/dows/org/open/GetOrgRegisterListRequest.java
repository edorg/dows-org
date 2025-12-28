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
@Schema(description = "GetOrgRegisterListRequest 对象")
public class GetOrgRegisterListRequest {

    @Schema(description = "账号实例ID")
    private Long accountInstanceId;

    @Schema(description = "社会统一信用代码")
    private String creditNo;

    @Schema(description = "组织地址")
    private String orgAddress;

    @Schema(description = "联系电话")
    private String phoneNum;

    @Schema(description = "联系人")
    private String contacts;

    @Schema(description = "人员规模")
    private Integer headcount;

    @Schema(description = "认证状态[0:未认证，1:已认证]")
    private Boolean state;

    @Schema(description = "认证开始时间")
    private LocalDateTime approvedStartTime;

    @Schema(description = "认证结束时间")
    private LocalDateTime approvedEndTime;

}