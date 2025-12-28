package org.dows.org.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.org.open.PostOrgRegisterEntityResponse;
import org.dows.org.open.PutOrgRegisterEntityResponse;
import org.dows.org.open.GetOrgRegisterEntityRequest;
import org.dows.org.open.GetOrgRegisterEntityResponse;
import org.dows.org.open.GetOrgRegisterPageRequest;
import org.dows.org.open.GetOrgRegisterPageResponse;
import org.dows.org.open.GetOrgRegisterListRequest;
import org.dows.org.open.GetOrgRegisterListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOrgRegisterRest", description = "组织登记")
@RestController
public class OpenOrgRegisterRest{

    @GetMapping("open/org/register/entity")
    @Operation(summary = "查询")
    public GetOrgRegisterEntityResponse getEntity( GetOrgRegisterEntityRequest getOrgRegisterEntityRequest){
        return null;
    }

    @GetMapping("open/org/register/page")
    @Operation(summary = "分页")
    public GetOrgRegisterPageResponse getPage( GetOrgRegisterPageRequest getOrgRegisterPageRequest){
        return null;
    }

    @GetMapping("open/org/register/list")
    @Operation(summary = "组织列表")
    public GetOrgRegisterListResponse getList( GetOrgRegisterListRequest getOrgRegisterListRequest){
        return null;
    }

}