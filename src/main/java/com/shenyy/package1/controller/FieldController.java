package com.shenyy.package1.controller;

import com.shenyy.package1.bean.Field;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/field")
@Api(tags = "田间号（地块）接口")
public class FieldController {
    //生产季编号 => 田间号列表
    @PostMapping(value = "/getFieldListBySeason")
    @ApiOperation(value = "依据生产季获取田间号列表", notes = "获取田间号列表")
    public List<String> getFieldListBySeason(@ApiParam(value = "生产季编号") @RequestParam(value = "prodSeasonCode") String prodSeasonCode) {
        ArrayList<String> fieldList = new ArrayList<>();
        //TODO
        return fieldList;
    }

    //品种编号 => 田间号列表
    @PostMapping(value = "/getFieldListByVariety")
    @ApiOperation(value = "依据品种获取田间号列表", notes = "获取田间号列表")
    public List<String> getFieldListByVariety(@ApiParam(value = "品种编号") @RequestParam(value = "varietyCode") String varietyCode) {
        ArrayList<String> fieldList = new ArrayList<>();
        //TODO
        return fieldList;
    }

    //生产季编号，品种编号 => 田间号列表
    @PostMapping(value = "/getFieldListBySV")
    @ApiOperation(value = "依据生产季&品种获取田间号列表", notes = "获取田间号列表")
    public List<String> getFieldListBySV(@ApiParam(value = "生产季编号") @RequestParam(value = "prodSeasonCode") String prodSeasonCode,
                                         @ApiParam(value = "品种编号") @RequestParam(value = "varietyCode") String varietyCode) {
        ArrayList<String> fieldList = new ArrayList<>();
        //TODO
        return fieldList;
    }

    //田间号 => 田间号对应地块信息
    @PostMapping(value = "/getSingleFieldInfo")
    @ApiOperation(value = "依据品种获取田间号列表", notes = "获取田间号列表")
    public Field getSingleFieldInfo(@ApiParam(value = "田间号") @RequestParam(value = "fieldCode") String fieldCode) {
        Field fieldInfo = new Field();
        //TODO
        return fieldInfo;
    }
}
