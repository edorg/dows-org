package org.dows.org.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.org.open.PostOrgAddressEntityRequest;
import org.dows.org.open.PostOrgAddressEntityResponse;
import org.dows.org.open.PutOrgAddressEntityRequest;
import org.dows.org.open.PutOrgAddressEntityResponse;
import org.dows.org.open.DeleteOrgAddressEntityRequest;
import org.dows.org.open.DeleteOrgAddressEntityResponse;
import org.dows.org.open.GetOrgAddressEntityRequest;
import org.dows.org.open.GetOrgAddressEntityResponse;
import org.dows.org.open.GetOrgAddressListRequest;
import org.dows.org.open.GetOrgAddressListResponse;
import org.dows.org.open.GetOrgAddressPageRequest;
import org.dows.org.open.GetOrgAddressPageResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOrgAddressRest", description = "地址")
@RestController
public class OpenOrgAddressRest{

    @PostMapping("open/org/address/entity")
    @Operation(summary = "登记地址")
    public PostOrgAddressEntityResponse postEntity(@RequestBody PostOrgAddressEntityRequest postOrgAddressEntityRequest){
        return null;
    }

    @PutMapping("open/org/address/entity")
    @Operation(summary = "修改地址")
    public void putEntity(@RequestBody PutOrgAddressEntityRequest putOrgAddressEntityRequest){
        
    }

    @DeleteMapping("open/org/address/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteOrgAddressEntityRequest deleteOrgAddressEntityRequest){
        
    }

    @GetMapping("open/org/address/entity")
    @Operation(summary = "查询地址")
    public GetOrgAddressEntityResponse getEntity( GetOrgAddressEntityRequest getOrgAddressEntityRequest){
        return null;
    }

    @GetMapping("open/org/address/list")
    @Operation(summary = "地址列表")
    public GetOrgAddressListResponse getList( GetOrgAddressListRequest getOrgAddressListRequest){
        return null;
    }

    @GetMapping("open/org/address/page")
    @Operation(summary = "地址分页")
    public GetOrgAddressPageResponse getPage( GetOrgAddressPageRequest getOrgAddressPageRequest){
        return null;
    }

}