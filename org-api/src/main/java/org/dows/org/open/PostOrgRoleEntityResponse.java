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
@Schema(description = "PostOrgRoleEntityResponse 对象")
public class PostOrgRoleEntityResponse {

    @Schema(description = "组织角色ID")
    private Long orgRoleId;

}