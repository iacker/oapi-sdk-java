// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;
import com.google.gson.annotations.SerializedName;

public class MeetingKickoutResult {
    @SerializedName("kickout_results")
    private MeetingParticipantResult[] kickoutResults;

    public MeetingParticipantResult[] getKickoutResults() {
        return this.kickoutResults;
    }

    public void setKickoutResults(MeetingParticipantResult[] kickoutResults) {
        this.kickoutResults = kickoutResults;
    }

}
