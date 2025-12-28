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
@Table("org_address")
public class OrgAddressEntity extends CrudEntity<OrgAddressEntity> {

    @Schema(title = "组织地址ID")
    private Long orgAddressId;
    @Schema(title = "组织实例ID")
    private Long orgInstanceId;
    @Schema(title = "组织树ID")
    private Long orgTreeId;
    @Schema(title = "国家")
    private String country;
    @Schema(title = "省")
    private String province;
    @Schema(title = "市")
    private String city;
    @Schema(title = "区")
    private String district;
    @Schema(title = "街道")
    private String street;
    @Schema(title = "建筑号")
    private String buildingNo;
    @Schema(title = "房号")
    private String roomNo;
    @Schema(title = "详细地址")
    private String address;
    @Schema(title = "状态")
    private Integer state;
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