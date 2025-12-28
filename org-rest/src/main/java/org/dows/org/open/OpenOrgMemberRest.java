package org.dows.org.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.org.open.PostOrgMemberEntityRequest;
import org.dows.org.open.PostOrgMemberEntityResponse;
import org.dows.org.open.PutOrgMemberEntityRequest;
import org.dows.org.open.PutOrgMemberEntityResponse;
import org.dows.org.open.DeleteOrgMemberEntityRequest;
import org.dows.org.open.DeleteOrgMemberEntityResponse;
import org.dows.org.open.GetOrgMemberListRequest;
import org.dows.org.open.GetOrgMemberListResponse;
import org.dows.org.open.GetOrgMemberPageRequest;
import org.dows.org.open.GetOrgMemberPageResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOrgMemberRest", description = "组织成员")
@RestController
public class OpenOrgMemberRest{

    @PostMapping("open/org/member/entity")
    @Operation(summary = "保存")
    public PostOrgMemberEntityResponse postEntity(@RequestBody PostOrgMemberEntityRequest postOrgMemberEntityRequest){
        return null;
    }

    @PutMapping("open/org/member/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOrgMemberEntityRequest putOrgMemberEntityRequest){
        
    }

    @DeleteMapping("open/org/member/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteOrgMemberEntityRequest deleteOrgMemberEntityRequest){
        
    }

    @GetMapping("open/org/member/list")
    @Operation(summary = "列表")
    public GetOrgMemberListResponse getList( GetOrgMemberListRequest getOrgMemberListRequest){
        return null;
    }

    @GetMapping("open/org/member/page")
    @Operation(summary = "分页")
    public GetOrgMemberPageResponse getPage( GetOrgMemberPageRequest getOrgMemberPageRequest){
        return null;
    }

}