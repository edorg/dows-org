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
@Schema(description = "GetOrgResourceListResponse 对象")
public class GetOrgResourceListResponse {

    @Schema(description = "组织资源ID")
    private Long orgResourceId;

    @Schema(description = "组织实例ID")
    private Long orgInstanceId;

    @Schema(description = "组织空间ID")
    private Long orgSpaceId;

    @Schema(description = "引用的资源ID，可以来自[hrm,oss,exam...]")
    private Long referenceId;

    @Schema(description = "引用资源名，可以来自[hrm,exam]表")
    private String referenceSource;

    @Schema(description = "来源类型[.....]")
    private String referenceType;

    @Schema(description = "内容资源")
    private String contentLink;

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