package com.shenyy.package1.controller;

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

@RestController
@RequestMapping("/plantBlock")
@Api(tags = "种植区块接口")
public class PlantBlockController {
    //批次编号 => 种植区块列表
    @PostMapping(value = "/getPlantBlockListByBatch")
    @ApiOperation(value = "获取种植区块列表", notes = "依据批次编号获取种植区块列表")
    public ResultWrapper<List<PlantBlock>> getPlantBlockListByBatch(@ApiParam(value = "批次编号") @RequestParam(value = "batchCode") String batchCode) {
        ArrayList<PlantBlock> plantBlockList = new ArrayList<>();
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //添加种植区块
    @PostMapping(value = "/addPlantBlock")
    @ApiOperation(value = "添加种植区块", notes = "添加种植区块")
    public ResultWrapper addPlantBlock(@ApiParam(value = "批次id") @RequestParam(value = "batchId") String batchId,
                                       @ApiParam(value = "图片id") @RequestParam(value = "picId") Integer picId,
                                       @ApiParam(value = "品种id") @RequestParam(value = "varietyId", required = false) String varietyId,
                                       @ApiParam(value = "中心点纬度") @RequestParam(value = "latitude") Double latitude,
                                       @ApiParam(value = "中心点经度") @RequestParam(value = "longitude") Double longitude,
                                       @ApiParam(value = "四角经纬度坐标") @RequestParam(value = "coordinateParams") String coordinateParams,
                                       @ApiParam(value = "出苗数") @RequestParam(value = "emergenceNum") Integer emergenceNum,
                                       @ApiParam(value = "播种数") @RequestParam(value = "seedNum") Integer seedNum,
                                       @ApiParam(value = "出苗率") @RequestParam(value = "emergenceRate") Double emergenceRate
    ) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //删除种植区块
    @PostMapping(value = "/deletePlantBlock")
    @ApiOperation(value = "删除种植区块", notes = "删除种植区块")
    public ResultWrapper deletePlantBlock(@ApiParam(value = "种植区块id") @RequestParam(value = "plantBlockId") Integer plantBlockId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //修改种植区块
    @PostMapping(value = "/updatePlantBlock")
    @ApiOperation(value = "修改种植区块", notes = "修改种植区块")
    public ResultWrapper updatePlantBlock(@ApiParam(value = "种植区块id") @RequestParam(value = "plantBlockId") Integer plantBlockId,
                                          @ApiParam(value = "种植区块参数") @RequestParam(value = "plantBlockParams") String plantBlockParams) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }

    //种植区块id => 种植区块信息
    @PostMapping(value = "/getPlantBlockInfoById")
    @ApiOperation(value = "获取种植区块信息", notes = "依据种植区块id获取种植区块信息")
    public ResultWrapper<PlantBlock> getPlantBlockInfoById(@ApiParam(value = "种植区块id") @RequestParam(value = "plantBlockId") String plantBlockId) {
        ResultWrapper resultWrapper = new ResultWrapper();
        //TODO
        return resultWrapper;
    }
}
