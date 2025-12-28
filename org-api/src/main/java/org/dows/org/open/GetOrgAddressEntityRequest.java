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
@Schema(description = "GetOrgAddressEntityRequest 对象")
public class GetOrgAddressEntityRequest {

    @Schema(description = "组织地址ID")
    private Long orgAddressId;

}