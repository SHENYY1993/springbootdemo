package com.shenyy.package1.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "SplicingImage", description = "拼接图数据类")
public class SplicingImage {
    @ApiModelProperty(value = "id",notes = "拼接图id")
    private Integer id;
    @ApiModelProperty(value = "拼接图名称")
    private String splicingImageName;
    @ApiModelProperty(value = "拼接图key")
    private String splicingImageKey;
    @ApiModelProperty(value = "拼接图url")
    private String splicingImageUrl;
    @ApiModelProperty(value = "纬度")
    private Double latitude;
    @ApiModelProperty(value = "经度")
    private Double longitude;
    @ApiModelProperty(value = "高度")
    private Double altitude;
    @ApiModelProperty(value = "偏航角")
    private Double yaw;
    @ApiModelProperty(value = "图片宽度（pix）")
    private Integer width;
    @ApiModelProperty(value = "图片高度（pix）")
    private Integer height;
    @ApiModelProperty(value = "图片状态（-2：生成错误 0：未上传 1：生成中 2：已生成）")
    private Integer status;
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
    @ApiModelProperty(value = "批次id")
    private Integer batchId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSplicingImageName() {
        return splicingImageName;
    }

    public void setSplicingImageName(String splicingImageName) {
        this.splicingImageName = splicingImageName;
    }

    public String getSplicingImageKey() {
        return splicingImageKey;
    }

    public void setSplicingImageKey(String splicingImageKey) {
        this.splicingImageKey = splicingImageKey;
    }

    public String getSplicingImageUrl() {
        return splicingImageUrl;
    }

    public void setSplicingImageUrl(String splicingImageUrl) {
        this.splicingImageUrl = splicingImageUrl;
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

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Double getYaw() {
        return yaw;
    }

    public void setYaw(Double yaw) {
        this.yaw = yaw;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }
}
