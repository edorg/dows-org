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
@Schema(description = "GetOrgDepartmentPageResponse 对象")
public class GetOrgDepartmentPageResponse {

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

    @Schema(description = "组织性质[0:内部,1:外部]")
    private Integer orgProperty;

    @Schema(description = "排序")
    private Integer sorted;

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