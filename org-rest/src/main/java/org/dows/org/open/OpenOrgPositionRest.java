package org.dows.org.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.org.open.PostOrgPositionEntityRequest;
import org.dows.org.open.PostOrgPositionEntityResponse;
import org.dows.org.open.PutOrgPositionEntityRequest;
import org.dows.org.open.PutOrgPositionEntityResponse;
import org.dows.org.open.DeleteOrgPositionEntityRequest;
import org.dows.org.open.DeleteOrgPositionEntityResponse;
import org.dows.org.open.GetOrgPositionEntityRequest;
import org.dows.org.open.GetOrgPositionEntityResponse;
import org.dows.org.open.GetOrgPositionPageRequest;
import org.dows.org.open.GetOrgPositionPageResponse;
import org.dows.org.open.GetOrgPositionListRequest;
import org.dows.org.open.GetOrgPositionListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOrgPositionRest", description = "岗位")
@RestController
public class OpenOrgPositionRest{

    @PostMapping("open/org/position/entity")
    @Operation(summary = "创建")
    public PostOrgPositionEntityResponse postEntity(@RequestBody PostOrgPositionEntityRequest postOrgPositionEntityRequest){
        return null;
    }

    @PutMapping("open/org/position/entity")
    @Operation(summary = "修改")
    public void putEntity(@RequestBody PutOrgPositionEntityRequest putOrgPositionEntityRequest){
        
    }

    @DeleteMapping("open/org/position/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteOrgPositionEntityRequest deleteOrgPositionEntityRequest){
        
    }

    @GetMapping("open/org/position/entity")
    @Operation(summary = "查询")
    public GetOrgPositionEntityResponse getEntity( GetOrgPositionEntityRequest getOrgPositionEntityRequest){
        return null;
    }

    @GetMapping("open/org/position/page")
    @Operation(summary = "分页")
    public GetOrgPositionPageResponse getPage( GetOrgPositionPageRequest getOrgPositionPageRequest){
        return null;
    }

    @GetMapping("open/org/position/list")
    @Operation(summary = "列表")
    public GetOrgPositionListResponse getList( GetOrgPositionListRequest getOrgPositionListRequest){
        return null;
    }

}