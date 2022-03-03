package com.shenyy.package1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/prodSeason")
@Api(tags = "生产季接口")
public class ProdSeasonController {
    @PostMapping(value = "/getSeasonList")
    @ApiOperation(value = "获取生产季列表", notes = "获取全部生产季编号")
    public List<String> getSeasonList() {
        ArrayList<String> prodSeasonList = new ArrayList<>();
        return prodSeasonList;
    }
}
