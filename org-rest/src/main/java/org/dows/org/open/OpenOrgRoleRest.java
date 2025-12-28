package org.dows.org.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.org.open.PostOrgRoleEntityRequest;
import org.dows.org.open.PostOrgRoleEntityResponse;
import org.dows.org.open.PutOrgRoleEntityRequest;
import org.dows.org.open.PutOrgRoleEntityResponse;
import org.dows.org.open.DeleteOrgRoleEntityRequest;
import org.dows.org.open.DeleteOrgRoleEntityResponse;
import org.dows.org.open.GetOrgRoleListRequest;
import org.dows.org.open.GetOrgRoleListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOrgRoleRest", description = "组织角色")
@RestController
public class OpenOrgRoleRest{

    @PostMapping("open/org/role/entity")
    @Operation(summary = "保存")
    public PostOrgRoleEntityResponse postEntity(@RequestBody PostOrgRoleEntityRequest postOrgRoleEntityRequest){
        return null;
    }

    @PutMapping("open/org/role/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOrgRoleEntityRequest putOrgRoleEntityRequest){
        
    }

    @DeleteMapping("open/org/role/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteOrgRoleEntityRequest deleteOrgRoleEntityRequest){
        
    }

    @GetMapping("open/org/role/list")
    @Operation(summary = "列表")
    public GetOrgRoleListResponse getList( GetOrgRoleListRequest getOrgRoleListRequest){
        return null;
    }

}