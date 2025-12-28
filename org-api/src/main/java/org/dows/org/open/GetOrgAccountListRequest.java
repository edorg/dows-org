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
@Schema(description = "GetOrgAccountListRequest 对象")
public class GetOrgAccountListRequest {

    @Schema(description = "昵称")
    private String nickname;

    @Schema(description = "账号标识[邮箱|手机号|openid]")
    private String identifier;

}