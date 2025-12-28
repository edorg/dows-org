package org.dows.org.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("org_role")
public class OrgRoleEntity extends CrudEntity<OrgRoleEntity> {

    @Schema(title = "组织角色ID")
    private Long orgRoleId;
    @Schema(title = "组织实例ID")
    private Long orgInstanceId;
    @Schema(title = "组织树ID")
    private Long orgTreeId;
    @Schema(title = "角色实例ID")
    private Long rbacRoleId;
    @Schema(title = "版本号")
    private Integer revision;
    @Schema(title = "应用id")
    private String appId;
    @Schema(title = "时间戳")
    private LocalDateTime createTime;
    @Schema(title = "更新时间")
    private LocalDateTime updateTime;
    @Schema(title = "删除时间")
    private LocalDateTime deleteTime;
    @Schema(title = "创建者ID")
    private Long createId;
    @Schema(title = "更新者ID")
    private Long updateId;
}