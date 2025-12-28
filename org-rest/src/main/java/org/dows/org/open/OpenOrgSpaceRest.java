package org.dows.org.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.org.open.PostOrgSpaceEntityRequest;
import org.dows.org.open.PostOrgSpaceEntityResponse;
import org.dows.org.open.PutOrgSpaceEntityRequest;
import org.dows.org.open.PutOrgSpaceEntityResponse;
import org.dows.org.open.DeleteOrgSpaceEntityRequest;
import org.dows.org.open.DeleteOrgSpaceEntityResponse;
import org.dows.org.open.GetOrgSpaceEntityRequest;
import org.dows.org.open.GetOrgSpaceEntityResponse;
import org.dows.org.open.GetOrgSpacePageRequest;
import org.dows.org.open.GetOrgSpacePageResponse;
import org.dows.org.open.GetOrgSpaceListRequest;
import org.dows.org.open.GetOrgSpaceListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOrgSpaceRest", description = "空间")
@RestController
public class OpenOrgSpaceRest{

    @PostMapping("open/org/space/entity")
    @Operation(summary = "创建")
    public PostOrgSpaceEntityResponse postEntity(@RequestBody PostOrgSpaceEntityRequest postOrgSpaceEntityRequest){
        return null;
    }

    @PutMapping("open/org/space/entity")
    @Operation(summary = "修改")
    public void putEntity(@RequestBody PutOrgSpaceEntityRequest putOrgSpaceEntityRequest){
        
    }

    @DeleteMapping("open/org/space/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteOrgSpaceEntityRequest deleteOrgSpaceEntityRequest){
        
    }

    @GetMapping("open/org/space/entity")
    @Operation(summary = "查询")
    public GetOrgSpaceEntityResponse getEntity( GetOrgSpaceEntityRequest getOrgSpaceEntityRequest){
        return null;
    }

    @GetMapping("open/org/space/page")
    @Operation(summary = "分页")
    public GetOrgSpacePageResponse getPage( GetOrgSpacePageRequest getOrgSpacePageRequest){
        return null;
    }

    @GetMapping("open/org/space/list")
    @Operation(summary = "列表")
    public GetOrgSpaceListResponse getList( GetOrgSpaceListRequest getOrgSpaceListRequest){
        return null;
    }

}