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
@Table("org_position")
public class OrgPositionEntity extends CrudEntity<OrgPositionEntity> {

    @Schema(title = "组织岗位ID")
    private Long orgPositionId;
    @Schema(title = "组织实例ID")
    private Long orgInstanceId;
    @Schema(title = "组织树ID")
    private Long orgTreeId;
    @Schema(title = "组织信息ID")
    private Long orgInfoId;
    @Schema(title = "组织地址ID")
    private Long orgAddressId;
    @Schema(title = "岗位类型[1:兼职，2:全职，...]")
    private Integer positionType;
    @Schema(title = "岗位编号[P_6位数字]")
    private String positionNo;
    @Schema(title = "岗位名称[java高级工程师,架构师]")
    private String positionName;
    @Schema(title = "岗位描述")
    private Object description;
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