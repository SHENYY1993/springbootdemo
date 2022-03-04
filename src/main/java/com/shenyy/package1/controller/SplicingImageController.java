package com.shenyy.package1.controller;

import com.shenyy.package1.bean.Picture;
import com.shenyy.package1.bean.ResultWrapper;
import com.shenyy.package1.bean.SplicingImage;
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
@RequestMapping("/splicingImage")
@Api(tags = "拼接图接口")
public class SplicingImageController {
    //添加拼接图
    @PostMapping(value = "/addSplicingImage")
    @ApiOperation(value = "添加拼接图", notes = "添加拼接图")
    public ResultWrapper addSplicingImage(@ApiParam(value = "图片名称") @RequestParam(value = "splicingImageName") String splicingImageName,
                                          @ApiParam(value = "图片key") @RequestParam(value = "splicingImageKey") String splicingImageKey,
                                          @ApiParam(value = "图片url") @RequestParam(value = "splicingImageUrl") String splicingImageUrl,
                                          @ApiParam(value = "纬度") @RequestParam(value = "latitude") Double latitude,
                                          @ApiParam(value = "经度") @RequestParam(value = "longitude") Double longitude,
                                          @ApiParam(value = "高度") @RequestParam(value = "altitude") Double altitude,
                                          @ApiParam(value = "图片宽度（pix）") @RequestParam(value = "width") Integer width,
                                          @ApiParam(value = "图片高度（pix）") @RequestParam(value = "height") Integer height,
                                          @ApiParam(value = "图片状态") @RequestParam(value = "status") Integer status,
                                          @ApiParam(value = "四角经纬度坐标") @RequestParam(value = "coordinateParams", required = false) String coordinateParams,
                                          @ApiParam(value = "批次id") @RequestParam(value = "batchId") Integer batchId
    ) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //删除拼接图
    @PostMapping(value = "/deleteSplicingImage")
    @ApiOperation(value = "删除拼接图", notes = "删除拼接图")
    public ResultWrapper deleteSplicingImage(@ApiParam(value = "拼接图id") @RequestParam(value = "picId") Integer picId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //修改拼接图
    @PostMapping(value = "/updateSplicingImage")
    @ApiOperation(value = "修改拼接图", notes = "修改拼接图")
    public ResultWrapper updateSplicingImage(@ApiParam(value = "拼接图id") @RequestParam(value = "splicingImageId") Integer splicingImageId,
                                             @ApiParam(value = "拼接图参数") @RequestParam(value = "splicingImageParams") String splicingImageParams) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //拼接图id => 拼接图信息
    @PostMapping(value = "/getSplicingImageById")
    @ApiOperation(value = "获取拼接图", notes = "依据拼接图id获取拼接图")
    public ResultWrapper<SplicingImage> getSplicingImageById(@ApiParam(value = "拼接图id") @RequestParam(value = "splicingImageId") String splicingImageId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }
}
