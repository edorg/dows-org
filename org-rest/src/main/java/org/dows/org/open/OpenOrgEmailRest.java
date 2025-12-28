package org.dows.org.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.org.open.PostOrgEmailEntityRequest;
import org.dows.org.open.PostOrgEmailEntityResponse;
import org.dows.org.open.PutOrgEmailEntityRequest;
import org.dows.org.open.PutOrgEmailEntityResponse;
import org.dows.org.open.DeleteOrgEmailEntityRequest;
import org.dows.org.open.DeleteOrgEmailEntityResponse;
import org.dows.org.open.GetOrgEmailListRequest;
import org.dows.org.open.GetOrgEmailListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOrgEmailRest", description = "组织邮箱")
@RestController
public class OpenOrgEmailRest{

    @PostMapping("open/org/email/entity")
    @Operation(summary = "保存")
    public PostOrgEmailEntityResponse postEntity(@RequestBody PostOrgEmailEntityRequest postOrgEmailEntityRequest){
        return null;
    }

    @PutMapping("open/org/email/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOrgEmailEntityRequest putOrgEmailEntityRequest){
        
    }

    @DeleteMapping("open/org/email/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteOrgEmailEntityRequest deleteOrgEmailEntityRequest){
        
    }

    @GetMapping("open/org/email/list")
    @Operation(summary = "列表")
    public GetOrgEmailListResponse getList( GetOrgEmailListRequest getOrgEmailListRequest){
        return null;
    }

}