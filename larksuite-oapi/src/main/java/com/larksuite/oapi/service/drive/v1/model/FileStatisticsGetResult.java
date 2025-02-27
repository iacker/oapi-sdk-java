// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.google.gson.annotations.SerializedName;

public class FileStatisticsGetResult {
    @SerializedName("file_token")
    private String fileToken;
    @SerializedName("file_type")
    private String fileType;
    @SerializedName("statistics")
    private FileStatistics statistics;

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public FileStatistics getStatistics() {
        return this.statistics;
    }

    public void setStatistics(FileStatistics statistics) {
        this.statistics = statistics;
    }

}
