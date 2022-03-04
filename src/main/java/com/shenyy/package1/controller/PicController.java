package com.shenyy.package1.controller;

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
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/picture")
@Api(tags = "图片接口")
public class PicController {
    //批次编号 => 图片列表
    @PostMapping(value = "/getPictureListByBatch")
    @ApiOperation(value = "获取图片列表", notes = "依据批次id获取图片列表")
    public ResultWrapper<List<Picture>> getPictureListByBatch(@ApiParam(value = "批次id") @RequestParam(value = "batchId") Integer batchId) {
        ArrayList<Picture> pictureInfoList = new ArrayList<>();
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //添加一批图片
    @PostMapping(value = "/addPictures")
    @ApiOperation(value = "添加图片", notes = "添加图片")
    public ResultWrapper<List<Map<String, String>>> addPictures(@ApiParam(value = "图片名称列表") @RequestParam(value = "picNameList") String picNameList,
                                                                @ApiParam(value = "批次id") @RequestParam(value = "batchId") Integer batchId,
                                                                @ApiParam(value = "生产季id") @RequestParam(value = "prodSeasonId") Integer prodSeasonId,
                                                                @ApiParam(value = "田间号id") @RequestParam(value = "fieldId") Integer fieldId,
                                                                @ApiParam(value = "批次日期") @RequestParam(value = "date") Date date
    ) {
        List<Map<String, String>> awsUrlList = new ArrayList<>();
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

//    //添加图片
//    @PostMapping(value = "/addPicture")
//    @ApiOperation(value = "添加图片", notes = "添加图片")
//    public ResultWrapper addPicture(@ApiParam(value = "图片名称") @RequestParam(value = "picName") String picName,
//                                    @ApiParam(value = "图片key") @RequestParam(value = "picKey") String picKey,
//                                    @ApiParam(value = "图片url") @RequestParam(value = "picUrl") String picUrl,
//                                    @ApiParam(value = "纬度") @RequestParam(value = "latitude") Double latitude,
//                                    @ApiParam(value = "经度") @RequestParam(value = "longitude") Double longitude,
//                                    @ApiParam(value = "高度") @RequestParam(value = "altitude") Double altitude,
//                                    @ApiParam(value = "图片宽度（pix）") @RequestParam(value = "width") Integer width,
//                                    @ApiParam(value = "图片高度（pix）") @RequestParam(value = "height") Integer height,
//                                    @ApiParam(value = "图片状态") @RequestParam(value = "status") Integer status,
//                                    @ApiParam(value = "四角经纬度坐标") @RequestParam(value = "coordinateParams", required = false) String coordinateParams,
//                                    @ApiParam(value = "批次id") @RequestParam(value = "batchId") Integer batchId,
//                                    @ApiParam(value = "抽样点出苗数") @RequestParam(value = "emergenceNum", required = false) Integer emergenceNum,
//                                    @ApiParam(value = "抽样点出苗率") @RequestParam(value = "emergenceRate", required = false) Double emergenceRate,
//                                    @ApiParam(value = "抽样点种植密度（株/公顷）") @RequestParam(value = "plantingDensityCal", required = false) Double plantingDensityCal
//    ) {
//        ResultWrapper resultWrapper = new ResultWrapper();
//        //TODO
//        return resultWrapper;
//    }

    //删除图片
    @PostMapping(value = "/deletePicture")
    @ApiOperation(value = "删除图片", notes = "删除图片")
    public ResultWrapper deletePicture(@ApiParam(value = "图片id") @RequestParam(value = "picId") Integer picId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //修改图片
    @PostMapping(value = "/updatePicture")
    @ApiOperation(value = "修改图片", notes = "修改图片")
    public ResultWrapper updatePicture(@ApiParam(value = "图片id") @RequestParam(value = "picId") Integer picId,
                                       @ApiParam(value = "图片参数") @RequestParam(value = "picParams") String picParams) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //图片id => 图片
    @PostMapping(value = "/getPictureById")
    @ApiOperation(value = "获取图片", notes = "依据图片id获取图片")
    public ResultWrapper<Picture> getPictureById(@ApiParam(value = "图片id") @RequestParam(value = "pictureId") Integer pictureId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //批次id&种植区块id => 图片
    @PostMapping(value = "/getPictureByBatchandBlock")
    @ApiOperation(value = "获取图片", notes = "依据批次id和种植区块id获取图片")
    public ResultWrapper<Picture> getPictureByBatchandBlock(@ApiParam(value = "批次id") @RequestParam(value = "batchId") Integer batchId,
                                                            @ApiParam(value = "种植区块id") @RequestParam(value = "plantBlockId") Integer plantBlockId
    ) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }
}
