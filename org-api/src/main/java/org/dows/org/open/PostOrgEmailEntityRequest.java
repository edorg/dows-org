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
@Schema(description = "PostOrgEmailEntityRequest 对象")
public class PostOrgEmailEntityRequest {

    @Schema(description = "组织实例ID")
    private Long orgInstanceId;

    @Schema(description = "组织树ID")
    private Long orgTreeId;

    @Schema(description = "企业邮箱")
    private String email;

    @Schema(description = "JSON配置")
    private String configJson;

    @Schema(description = "描述")
    private String description;

    @Schema(description = "邮箱类型[收件，发件,...]")
    private Integer emailType;

}