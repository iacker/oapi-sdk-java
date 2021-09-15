// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.bitable.v1.model;
import com.google.gson.annotations.SerializedName;

public class Attachment {
    @SerializedName("file_token")
    private String fileToken;
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private String type;
    @SerializedName("size")
    private Integer size;
    @SerializedName("url")
    private String url;
    @SerializedName("tmp_url")
    private String tmpUrl;

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTmpUrl() {
        return this.tmpUrl;
    }

    public void setTmpUrl(String tmpUrl) {
        this.tmpUrl = tmpUrl;
    }

}
