// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.task.v1.model;
import com.google.gson.annotations.SerializedName;

public class TaskFollowerListResult {
    @SerializedName("items")
    private Follower[] items;
    @SerializedName("page_token")
    private String pageToken;
    @SerializedName("has_more")
    private Boolean hasMore;

    public Follower[] getItems() {
        return this.items;
    }

    public void setItems(Follower[] items) {
        this.items = items;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Boolean getHasMore() {
        return this.hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

}
