package org.dows.org.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.org.open.PostOrgDepartmentEntityRequest;
import org.dows.org.open.PostOrgDepartmentEntityResponse;
import org.dows.org.open.PutOrgDepartmentEntityRequest;
import org.dows.org.open.PutOrgDepartmentEntityResponse;
import org.dows.org.open.DeleteOrgDepartmentEntityRequest;
import org.dows.org.open.DeleteOrgDepartmentEntityResponse;
import org.dows.org.open.GetOrgDepartmentEntityRequest;
import org.dows.org.open.GetOrgDepartmentEntityResponse;
import org.dows.org.open.GetOrgDepartmentPageRequest;
import org.dows.org.open.GetOrgDepartmentPageResponse;
import org.dows.org.open.GetOrgDepartmentListRequest;
import org.dows.org.open.GetOrgDepartmentListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOrgDepartmentRest", description = "部门")
@RestController
public class OpenOrgDepartmentRest{

    @PostMapping("open/org/department/entity")
    @Operation(summary = "创建")
    public PostOrgDepartmentEntityResponse postEntity(@RequestBody PostOrgDepartmentEntityRequest postOrgDepartmentEntityRequest){
        return null;
    }

    @PutMapping("open/org/department/entity")
    @Operation(summary = "修改")
    public void putEntity(@RequestBody PutOrgDepartmentEntityRequest putOrgDepartmentEntityRequest){
        
    }

    @DeleteMapping("open/org/department/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteOrgDepartmentEntityRequest deleteOrgDepartmentEntityRequest){
        
    }

    @GetMapping("open/org/department/entity")
    @Operation(summary = "查询")
    public GetOrgDepartmentEntityResponse getEntity( GetOrgDepartmentEntityRequest getOrgDepartmentEntityRequest){
        return null;
    }

    @GetMapping("open/org/department/page")
    @Operation(summary = "分页")
    public GetOrgDepartmentPageResponse getPage( GetOrgDepartmentPageRequest getOrgDepartmentPageRequest){
        return null;
    }

    @GetMapping("open/org/department/list")
    @Operation(summary = "列表")
    public GetOrgDepartmentListResponse getList( GetOrgDepartmentListRequest getOrgDepartmentListRequest){
        return null;
    }

}