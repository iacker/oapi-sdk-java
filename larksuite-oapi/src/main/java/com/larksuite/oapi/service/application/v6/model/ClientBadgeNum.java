// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.application.v6.model;
import com.google.gson.annotations.SerializedName;

public class ClientBadgeNum {
    @SerializedName("web_app")
    private Integer webApp;
    @SerializedName("gadget")
    private Integer gadget;

    public Integer getWebApp() {
        return this.webApp;
    }

    public void setWebApp(Integer webApp) {
        this.webApp = webApp;
    }

    public Integer getGadget() {
        return this.gadget;
    }

    public void setGadget(Integer gadget) {
        this.gadget = gadget;
    }

}
