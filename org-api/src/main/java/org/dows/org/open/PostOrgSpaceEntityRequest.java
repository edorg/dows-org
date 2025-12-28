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
@Schema(description = "PostOrgSpaceEntityRequest 对象")
public class PostOrgSpaceEntityRequest {

    @Schema(description = "组织实例ID")
    private Long orgInstanceId;

    @Schema(description = "父节点ID")
    private Long pid;

    @Schema(description = "组织树ID")
    private Long orgTreeId;

    @Schema(description = "空间名")
    private String spaceName;

    @Schema(description = "共享模式[0:共享当前空间，1:共享所有子空间]")
    private Integer shared;

    @Schema(description = "应用id")
    private String app_id;

}