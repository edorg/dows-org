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
@Table("org_resource")
public class OrgResourceEntity extends CrudEntity<OrgResourceEntity> {

    @Schema(title = "组织资源ID")
    private Long orgResourceId;
    @Schema(title = "组织实例ID")
    private Long orgInstanceId;
    @Schema(title = "组织空间ID")
    private Long orgSpaceId;
    @Schema(title = "引用的资源ID，可以来自[hrm,oss,exam...]")
    private Long referenceId;
    @Schema(title = "引用资源名，可以来自[hrm,exam]表")
    private String referenceSource;
    @Schema(title = "来源类型[.....]")
    private String referenceType;
    @Schema(title = "内容资源")
    private String contentLink;
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