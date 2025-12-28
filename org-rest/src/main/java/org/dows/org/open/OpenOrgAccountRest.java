package org.dows.org.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.org.open.PostOrgAccountEntityRequest;
import org.dows.org.open.PostOrgAccountEntityResponse;
import org.dows.org.open.PutOrgAccountEntityRequest;
import org.dows.org.open.PutOrgAccountEntityResponse;
import org.dows.org.open.DeleteOrgAccountEntityRequest;
import org.dows.org.open.DeleteOrgAccountEntityResponse;
import org.dows.org.open.GetOrgAccountListRequest;
import org.dows.org.open.GetOrgAccountListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOrgAccountRest", description = "组织账号")
@RestController
public class OpenOrgAccountRest{

    @PostMapping("open/org/account/entity")
    @Operation(summary = "保存")
    public PostOrgAccountEntityResponse postEntity(@RequestBody PostOrgAccountEntityRequest postOrgAccountEntityRequest){
        return null;
    }

    @PutMapping("open/org/account/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOrgAccountEntityRequest putOrgAccountEntityRequest){
        
    }

    @DeleteMapping("open/org/account/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteOrgAccountEntityRequest deleteOrgAccountEntityRequest){
        
    }

    @GetMapping("open/org/account/list")
    @Operation(summary = "列表")
    public GetOrgAccountListResponse getList( GetOrgAccountListRequest getOrgAccountListRequest){
        return null;
    }

}