package com.shenyy.package1.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "PlantBlock", description = "种植区块数据类")
public class PlantBlock {
    @ApiModelProperty(value = "id",notes = "种植区块id")
    private Integer id;
    @ApiModelProperty(value = "批次id")
    private Integer batchId;
    @ApiModelProperty(value = "中心点纬度")
    private Double latitude;
    @ApiModelProperty(value = "中心点经度")
    private Double longitude;
    @ApiModelProperty(value = "左上角纬度")
    private Double topLeftLat;
    @ApiModelProperty(value = "左上角经度")
    private Double topLeftlng;
    @ApiModelProperty(value = "右上角纬度")
    private Double topRightLat;
    @ApiModelProperty(value = "右上角经度")
    private Double topRightLng;
    @ApiModelProperty(value = "左下角纬度")
    private Double btmLeftLat;
    @ApiModelProperty(value = "左下角经度")
    private Double btmLeftlng;
    @ApiModelProperty(value = "右下角纬度")
    private Double btmRightLat;
    @ApiModelProperty(value = "右下角经度")
    private Double btmRightLng;
    @ApiModelProperty(value = "品种id")
    private Integer varietyId;
    @ApiModelProperty(value = "出苗数")
    private Integer emergenceNum;
    @ApiModelProperty(value = "播种数")
    private Integer seedNum;
    @ApiModelProperty(value = "出苗率")
    private Double emergenceRate;
    @ApiModelProperty(value = "图片id")
    private Integer picId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getTopLeftLat() {
        return topLeftLat;
    }

    public void setTopLeftLat(Double topLeftLat) {
        this.topLeftLat = topLeftLat;
    }

    public Double getTopLeftlng() {
        return topLeftlng;
    }

    public void setTopLeftlng(Double topLeftlng) {
        this.topLeftlng = topLeftlng;
    }

    public Double getTopRightLat() {
        return topRightLat;
    }

    public void setTopRightLat(Double topRightLat) {
        this.topRightLat = topRightLat;
    }

    public Double getTopRightLng() {
        return topRightLng;
    }

    public void setTopRightLng(Double topRightLng) {
        this.topRightLng = topRightLng;
    }

    public Double getBtmLeftLat() {
        return btmLeftLat;
    }

    public void setBtmLeftLat(Double btmLeftLat) {
        this.btmLeftLat = btmLeftLat;
    }

    public Double getBtmLeftlng() {
        return btmLeftlng;
    }

    public void setBtmLeftlng(Double btmLeftlng) {
        this.btmLeftlng = btmLeftlng;
    }

    public Double getBtmRightLat() {
        return btmRightLat;
    }

    public void setBtmRightLat(Double btmRightLat) {
        this.btmRightLat = btmRightLat;
    }

    public Double getBtmRightLng() {
        return btmRightLng;
    }

    public void setBtmRightLng(Double btmRightLng) {
        this.btmRightLng = btmRightLng;
    }

    public Integer getVarietyId() {
        return varietyId;
    }

    public void setVarietyId(Integer varietyId) {
        this.varietyId = varietyId;
    }

    public Integer getEmergenceNum() {
        return emergenceNum;
    }

    public void setEmergenceNum(Integer emergenceNum) {
        this.emergenceNum = emergenceNum;
    }

    public Integer getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(Integer seedNum) {
        this.seedNum = seedNum;
    }

    public Double getEmergenceRate() {
        return emergenceRate;
    }

    public void setEmergenceRate(Double emergenceRate) {
        this.emergenceRate = emergenceRate;
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }
}
