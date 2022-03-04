package com.shenyy.package1.controller;

import com.shenyy.package1.bean.DetectReport;
import com.shenyy.package1.bean.Picture;
import com.shenyy.package1.bean.PlantBlock;
import com.shenyy.package1.bean.ResultWrapper;
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
@RequestMapping("/report")
@Api(tags = "检测报告接口")
public class ReportController {
    //获取试验田所选批次检测报告
    @PostMapping(value = "/getTestFieldDetectReportByBatch")
    @ApiOperation(value = "获取试验田所选批次检测报告", notes = "依据批次id获取试验田所选批次检测报告")
    public ResultWrapper<DetectReport<PlantBlock>> getTestFieldDetectReportByBatch(@ApiParam(value = "批次id") @RequestParam(value = "batchId") Integer batchId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //获取大田所选批次检测报告
    @PostMapping(value = "/getProdFieldDetectReportByBatch")
    @ApiOperation(value = "获取大田所选批次检测报告", notes = "依据批次id获取大田所选批次检测报告")
    public ResultWrapper<DetectReport<Picture>> getProdFieldDetectReportByBatch(@ApiParam(value = "批次id") @RequestParam(value = "batchId") Integer batchId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }
}
