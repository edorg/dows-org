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
@Schema(description = "GetOrgResourceListRequest 对象")
public class GetOrgResourceListRequest {

    @Schema(description = "引用资源名，可以来自[hrm,exam]表")
    private String referenceSource;

    @Schema(description = "来源类型[.....]")
    private String referenceType;

    @Schema(description = "内容资源")
    private String contentLink;

}