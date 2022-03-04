package com.shenyy.package1.controller;

import com.shenyy.package1.bean.Picture;
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
@RequestMapping("/sqsController")
@Api(tags = "SQS消息队列服务请求接口")
public class SQSController {
    //批次图片处理sqs
    @PostMapping(value = "/sendBatchSQSMessage")
    @ApiOperation(value = "批次图片SQS消息队列服务请求", notes = "依据批次id批次图片SQS消息队列服务请求")
    public ResultWrapper sendBatchSQSMessage(@ApiParam(value = "批次id") @RequestParam(value = "batchId") Integer batchId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }
}
