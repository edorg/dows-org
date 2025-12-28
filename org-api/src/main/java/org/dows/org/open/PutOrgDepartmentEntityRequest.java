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
@Schema(description = "PutOrgDepartmentEntityRequest 对象")
public class PutOrgDepartmentEntityRequest {

    @Schema(description = "组织树ID")
    private Long orgTreeId;

    @Schema(description = "父ID")
    private Long parentId;

    @Schema(description = "组织实例ID")
    private Long orgInstanceId;

    @Schema(description = "组织名")
    private String name;

    @Schema(description = "组织编码")
    private String code;

    @Schema(description = "组织头像")
    private String avatar;

    @Schema(description = "ID路径")
    private String idPath;

    @Schema(description = "名称路径")
    private String namePath;

    @Schema(description = "层级")
    private Integer level;

    @Schema(description = "更新者ID")
    private Long updateId;

}