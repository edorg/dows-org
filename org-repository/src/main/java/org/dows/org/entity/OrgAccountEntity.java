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
@Table("org_account")
public class OrgAccountEntity extends CrudEntity<OrgAccountEntity> {

    @Schema(title = "账号登记ID")
    private Long accountRegisterId;
    @Schema(title = "组织实例ID")
    private Long orgInstanceId;
    @Schema(title = "组织树ID")
    private Long orgTreeId;
    @Schema(title = "账号实例ID")
    private Long accountInstanceId;
    @Schema(title = "昵称")
    private String nickname;
    @Schema(title = "账号标识[邮箱|手机号|openid]")
    private String identifier;
    @Schema(title = "标识类型[email,phone,openid]")
    private Integer identifierType;
    @Schema(title = "账号类型")
    private Integer accountType;
    @Schema(title = "部门")
    private String department;
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