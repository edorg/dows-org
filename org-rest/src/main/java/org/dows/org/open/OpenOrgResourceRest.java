package org.dows.org.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.org.open.PostOrgResourceEntityRequest;
import org.dows.org.open.PostOrgResourceEntityResponse;
import org.dows.org.open.PutOrgResourceEntityRequest;
import org.dows.org.open.PutOrgResourceEntityResponse;
import org.dows.org.open.DeleteOrgResourceEntityRequest;
import org.dows.org.open.DeleteOrgResourceEntityResponse;
import org.dows.org.open.GetOrgResourceListRequest;
import org.dows.org.open.GetOrgResourceListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOrgResourceRest", description = "组织资源")
@RestController
public class OpenOrgResourceRest{

    @PostMapping("open/org/resource/entity")
    @Operation(summary = "保存")
    public PostOrgResourceEntityResponse postEntity(@RequestBody PostOrgResourceEntityRequest postOrgResourceEntityRequest){
        return null;
    }

    @PutMapping("open/org/resource/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOrgResourceEntityRequest putOrgResourceEntityRequest){
        
    }

    @DeleteMapping("open/org/resource/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteOrgResourceEntityRequest deleteOrgResourceEntityRequest){
        
    }

    @GetMapping("open/org/resource/list")
    @Operation(summary = "列表")
    public GetOrgResourceListResponse getList( GetOrgResourceListRequest getOrgResourceListRequest){
        return null;
    }

}