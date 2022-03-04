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
    public ResultWrapper<List<Batch>> getBatchListBySFV(@ApiParam(value = "生产季id") @RequestParam(value = "prodSeasonId") Integer prodSeasonId,
                                                        @ApiParam(value = "田间号id") @RequestParam(value = "fieldId") Integer fieldId,
                                                        @ApiParam(value = "品种id") @RequestParam(value = "varietyId", required = false) Integer varietyId) {
        ArrayList<Batch> batchList = new ArrayList<>();
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //添加批次
    @PostMapping(value = "/addBatch")
    @ApiOperation(value = "添加批次", notes = "添加批次")
    public ResultWrapper addBatch(@ApiParam(value = "日期") @RequestParam(value = "date") Date date,
                                  @ApiParam(value = "生产季id") @RequestParam(value = "prodSeasonId") Integer prodSeasonId,
                                  @ApiParam(value = "田间号id") @RequestParam(value = "fieldId") Integer fieldId,
                                  @ApiParam(value = "品种id") @RequestParam(value = "varietyId", required = false) Integer varietyId
//                                  @ApiParam(value = "请求消息id") @RequestParam(value = "requestMsgId") String requestMsgId,
//                                  @ApiParam(value = "返回消息id") @RequestParam(value = "replyMsgId") String replyMsgId
    ) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //删除批次
    @PostMapping(value = "/deleteBatch")
    @ApiOperation(value = "删除批次", notes = "删除批次")
    public ResultWrapper deleteBatch(@ApiParam(value = "批次id") @RequestParam(value = "batchId") Integer batchId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //修改批次
    @PostMapping(value = "/updateBatch")
    @ApiOperation(value = "修改批次", notes = "修改批次")
    public ResultWrapper updateBatch(@ApiParam(value = "批次id") @RequestParam(value = "batchId") Integer batchId,
                                     @ApiParam(value = "批次参数") @RequestParam(value = "batchParams") String batchParams) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //批次编号 => 批次信息
    @PostMapping(value = "/getBatchInfoById")
    @ApiOperation(value = "获取批次信息", notes = "依据批次id获取批次信息")
    public ResultWrapper<Batch> getBatchInfoById(@ApiParam(value = "批次id") @RequestParam(value = "batchId") Integer batchId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

}
