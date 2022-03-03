package com.shenyy.package1.controller;

import com.shenyy.package1.bean.Batch;
import com.shenyy.package1.bean.ResultWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/batch")
@Api(tags = "拍摄批次接口")
public class BatchController {
    //生产季编号，田间号，品种编号 => 批次编号列表
    @PostMapping(value = "/getBatchListBySFV")
    @ApiOperation(value = "获取批次列表", notes = "依据生产季&田间号&品种获取批次列表")
    public ResultWrapper<List<String>> getBatchListBySFV(@ApiParam(value = "生产季编号") @RequestParam(value = "prodSeasonCode") String prodSeasonCode,
                                                         @ApiParam(value = "田间号") @RequestParam(value = "fieldCode") String fieldCode,
                                                         @ApiParam(value = "品种编号") @RequestParam(value = "varietyCode") String varietyCode) {
        ArrayList<String> batchList = new ArrayList<>();
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //添加批次
    @PostMapping(value = "/addBatch")
    @ApiOperation(value = "添加批次", notes = "添加批次")
    public ResultWrapper addBatch(@ApiParam(value = "生产季编号") @RequestParam(value = "prodSeasonCode") String prodSeasonCode,
                                  @ApiParam(value = "田间号") @RequestParam(value = "fieldCode") String fieldCode,
                                  @ApiParam(value = "品种编号") @RequestParam(value = "varietyCode", required = false) String varietyCode,
                                  @ApiParam(value = "日期") @RequestParam(value = "date") Date date) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //删除批次
    @PostMapping(value = "/deleteBatch")
    @ApiOperation(value = "删除批次", notes = "删除批次")
    public ResultWrapper deleteBatch(@ApiParam(value = "批次编号") @RequestParam(value = "batchCode") String batchCode) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //修改批次
    @PostMapping(value = "/updateBatch")
    @ApiOperation(value = "修改批次", notes = "修改批次")
    public ResultWrapper updateBatch(@ApiParam(value = "批次编号") @RequestParam(value = "batchCode") String batchCode,
                                     @ApiParam(value = "批次") @RequestParam(value = "batch") String batchData) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //批次编号 => 批次信息
    @PostMapping(value = "/getBatchInfo")
    @ApiOperation(value = "获取批次信息", notes = "依据批次编号获取批次信息")
    public ResultWrapper<Batch> getBatchInfoId(@ApiParam(value = "批次编号") @RequestParam(value = "batchCode") String batchCode) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

}
