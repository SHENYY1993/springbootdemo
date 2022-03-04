package com.shenyy.package1.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "DetectRect",description = "植株检测框数据类")
public class DetectRect {
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "左上角x坐标（pix）")
    private Integer topLeftX;
    @ApiModelProperty(value = "左上角y坐标（pix）")
    private Integer topLeftY;
    @ApiModelProperty(value = "右下角x坐标（pix）")
    private Integer btmRighttX;
    @ApiModelProperty(value = "右下角y坐标（pix）")
    private Integer btmRightY;
    @ApiModelProperty(value = "置信度")
    private Double confidence;
    @ApiModelProperty(value = "纬度")
    private Double latitude;
    @ApiModelProperty(value = "经度")
    private Double longitude;
    @ApiModelProperty(value = "图片id")
    private Double picId;
    @ApiModelProperty(value = "种植区块id")
    private Double blockId;
    @ApiModelProperty(value = "生长阶段（{BEFORE_V1、V1、V2、V3、V4、AFTER_V4}）")
    private String growthStage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(Integer topLeftX) {
        this.topLeftX = topLeftX;
    }

    public Integer getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(Integer topLeftY) {
        this.topLeftY = topLeftY;
    }

    public Integer getBtmRighttX() {
        return btmRighttX;
    }

    public void setBtmRighttX(Integer btmRighttX) {
        this.btmRighttX = btmRighttX;
    }

    public Integer getBtmRightY() {
        return btmRightY;
    }

    public void setBtmRightY(Integer btmRightY) {
        this.btmRightY = btmRightY;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
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

    public Double getPicId() {
        return picId;
    }

    public void setPicId(Double picId) {
        this.picId = picId;
    }

    public Double getBlockId() {
        return blockId;
    }

    public void setBlockId(Double blockId) {
        this.blockId = blockId;
    }

    public String getGrowthStage() {
        return growthStage;
    }

    public void setGrowthStage(String growthStage) {
        this.growthStage = growthStage;
    }
}
