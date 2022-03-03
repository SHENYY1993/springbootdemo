package com.shenyy.package1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/variety")
@Api(tags = "品种接口")
public class VarietyController {
    @PostMapping(value = "/getVarietyList")
    @ApiOperation(value = "获取品种列表", notes = "获取全部品种编号")
    public List<String> getVarietyList() {
        ArrayList<String> varietyList = new ArrayList<>();
        return varietyList;
    }
}
