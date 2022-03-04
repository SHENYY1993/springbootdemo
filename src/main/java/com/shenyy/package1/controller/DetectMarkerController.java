package com.shenyy.package1.controller;

import com.shenyy.package1.bean.DetectMarker;
import com.shenyy.package1.bean.DetectRect;
import com.shenyy.package1.bean.ResultWrapper;
import com.shenyy.package1.util.ResultUtils;
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
@RequestMapping(value = "/detectMarker")
@Api(tags = "标记物检测框接口")
public class DetectMarkerController {
    //添加标记物检测框
    @PostMapping(value = "/addDetectMarker")
    @ApiOperation(value = "添加标记物检测框", notes = "添加标记物检测框")
    public ResultWrapper addDetectMarker(@ApiParam(value = "左上角x坐标（pix）") @RequestParam(value = "topLeftX") Integer topLeftX,
                                         @ApiParam(value = "左上角y坐标（pix）") @RequestParam(value = "topLeftY") Integer topLeftY,
                                         @ApiParam(value = "右下角x坐标（pix）") @RequestParam(value = "btmRightX") Integer btmRightX,
                                         @ApiParam(value = "右下角y坐标（pix）") @RequestParam(value = "btmRightY") Integer btmRightY,
                                         @ApiParam(value = "置信度") @RequestParam(value = "confidence") Double confidence,
                                         @ApiParam(value = "纬度") @RequestParam(value = "latitude") Double latitude,
                                         @ApiParam(value = "经度") @RequestParam(value = "longitude") Double longitude,
                                         @ApiParam(value = "图片id") @RequestParam(value = "picId") Integer picId
    ) {
        //TODO
        return ResultUtils.asSuccess("1");
    }

    //删除标记物检测框
    @PostMapping(value = "/deleteDetectMarker")
    @ApiOperation(value = "删除标记物检测框", notes = "删除标记物检测框")
    public ResultWrapper deleteDetectMarker(@ApiParam(value = "标记物检测框id") @RequestParam(value = "detectMarkerId") Integer detectMarkerId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //修改标记物检测框
    @PostMapping(value = "/updateDetectMarker")
    @ApiOperation(value = "修改标记物检测框", notes = "修改标记物检测框")
    public ResultWrapper updateDetectMarker(@ApiParam(value = "标记物检测框id") @RequestParam(value = "detectMarkerId") Integer detectMarkerId,
                                            @ApiParam(value = "标记物检测框参数") @RequestParam(value = "detectMarkerParams") String detectMarkerParams) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //依据图片id查询标记物检测框列表
    @PostMapping(value = "/getDetectMarkerListByPicId")
    @ApiOperation(value = "获取标记物检测框", notes = "依据图片id查询标记物检测框列表")
    public ResultWrapper<List<DetectMarker>> getDetectMarkerListByPicId(@ApiParam(value = "图片id") @RequestParam(value = "picId") Integer picId) {
        ArrayList<DetectMarker> detectMarkerList = new ArrayList<>();
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }
}
