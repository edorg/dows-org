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
@Schema(description = "GetOrgSpacePageRequest 对象")
public class GetOrgSpacePageRequest {

    @Schema(description = "空间名")
    private String spaceName;

    @Schema(description = "共享模式[0:共享当前空间，1:共享所有子空间]")
    private Integer shared;

}