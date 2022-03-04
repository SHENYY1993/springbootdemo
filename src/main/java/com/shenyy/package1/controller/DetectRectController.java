package com.shenyy.package1.controller;

import com.shenyy.package1.bean.DetectRect;
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
@RequestMapping("/detectRect")
@Api(tags = "植株检测框接口")
public class DetectRectController {
    //添加图片检测框
    @PostMapping(value = "/addDetectRect")
    @ApiOperation(value = "添加单个检测框", notes = "添加检测框")
    public ResultWrapper addDetectRect(@ApiParam(value = "左上角x坐标（pix）") @RequestParam(value = "topLeftX") Integer topLeftX,
                                       @ApiParam(value = "左上角y坐标（pix）") @RequestParam(value = "topLeftY") Integer topLeftY,
                                       @ApiParam(value = "右下角x坐标（pix）") @RequestParam(value = "btmRightX") Integer btmRightX,
                                       @ApiParam(value = "右下角y坐标（pix）") @RequestParam(value = "btmRightY") Integer btmRightY,
                                       @ApiParam(value = "置信度") @RequestParam(value = "confidence") Double confidence,
                                       @ApiParam(value = "纬度") @RequestParam(value = "latitude") Double latitude,
                                       @ApiParam(value = "经度") @RequestParam(value = "longitude") Double longitude,
                                       @ApiParam(value = "图片id") @RequestParam(value = "picId") Integer picId,
                                       @ApiParam(value = "种植区块id") @RequestParam(value = "blockId") Integer blockId,
                                       @ApiParam(value = "生长阶段") @RequestParam(value = "growthStage") String growthStage
                                       ){
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //删除植株检测框
    @PostMapping(value = "/deleteDetectRect")
    @ApiOperation(value = "删除植株检测框", notes = "删除植株检测框")
    public ResultWrapper deleteDetectRect(@ApiParam(value = "植株检测框id") @RequestParam(value = "detectRectId") Integer detectRectId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //修改植株检测框
    @PostMapping(value = "/updateDetectRect")
    @ApiOperation(value = "修改植株检测框", notes = "修改植株检测框")
    public ResultWrapper updatePicture(@ApiParam(value = "植株检测框id") @RequestParam(value = "detectRectId") Integer detectRectId,
                                       @ApiParam(value = "植株检测框参数") @RequestParam(value = "detectRectParams") String detectRectParams) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //依据图片id查询植株检测框列表
    @PostMapping(value = "/getDetectRectListByPicId")
    @ApiOperation(value = "获取植株检测框", notes = "依据图片id查询植株检测框列表")
    public ResultWrapper<List<DetectRect>> getDetectRectListByPicId(@ApiParam(value = "图片id") @RequestParam(value = "picId") Integer picId) {
        ArrayList<DetectRect> detectRectList = new ArrayList<>();
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //依据种植区块id查询植株检测框列表
    @PostMapping(value = "/getDetectRectListByBlockId")
    @ApiOperation(value = "获取植株检测框", notes = "依据种植区块id查询植株检测框列表")
    public ResultWrapper<List<DetectRect>> getDetectRectListByBlockId(@ApiParam(value = "种植区块id") @RequestParam(value = "blockId") Integer blockId) {
        ArrayList<DetectRect> detectRectList = new ArrayList<>();
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }
}
