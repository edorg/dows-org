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
@Table("org_member")
public class OrgMemberEntity extends CrudEntity<OrgMemberEntity> {

    @Schema(title = "组织成员ID")
    private Long orgMemberId;
    @Schema(title = "组织实例ID")
    private Long orgInstanceId;
    @Schema(title = "组织树ID")
    private Long orgTreeId;
    @Schema(title = "组织信息ID")
    private Long orgInfoId;
    @Schema(title = "账号实例ID")
    private Long accountInstanceId;
    @Schema(title = "用户ID")
    private Long userInstanceId;
    @Schema(title = "昵称")
    private String nickname;
    @Schema(title = "用户名")
    private String userName;
    @Schema(title = "组织岗位ID")
    private Long orgPositionId;
    @Schema(title = "岗位编号[P_6位数字]")
    private String positionNo;
    @Schema(title = "岗位名称[java高级工程师,架构师]")
    private String positionName;
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