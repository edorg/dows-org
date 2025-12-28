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
@Schema(description = "PostOrgResourceEntityRequest 对象")
public class PostOrgResourceEntityRequest {

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

}