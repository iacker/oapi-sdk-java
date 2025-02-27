// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.aweme_ecosystem.v1;

import com.larksuite.oapi.core.api.AccessTokenType;
import com.larksuite.oapi.core.api.Api;
import com.larksuite.oapi.core.api.ReqCaller;
import com.larksuite.oapi.core.api.request.*;
import com.larksuite.oapi.core.api.response.*;
import com.larksuite.oapi.core.Config;
import com.larksuite.oapi.core.event.Event;
import com.larksuite.oapi.core.event.IHandler;
import com.larksuite.oapi.service.aweme_ecosystem.v1.model.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class AwemeEcosystemService {

    private final Config config;
    private final AwemeUsers awemeUsers;

    public AwemeEcosystemService(Config config) {
        this.config = config;
        this.awemeUsers = new AwemeUsers(this);
    }

    public AwemeUsers getAwemeUsers() {
        return awemeUsers;
    }

    public static class AwemeUsers {

        private final AwemeEcosystemService service;

        public AwemeUsers(AwemeEcosystemService service) {
            this.service = service;
        }
    
        public AwemeUserGetBindInfoReqCall getBindInfo(RequestOptFn... optFns) {
            return new AwemeUserGetBindInfoReqCall(this, optFns);
        }
    
    }
    public static class AwemeUserGetBindInfoReqCall extends ReqCaller<Object, AwemeUserGetBindInfoResult> {
        private final AwemeUsers awemeUsers;
        
        private final Map<String, Object> queryParams;
        private final List<RequestOptFn> optFns;
        private AwemeUserGetBindInfoResult result;
        
        private AwemeUserGetBindInfoReqCall(AwemeUsers awemeUsers, RequestOptFn... optFns) {
        
            this.queryParams = new HashMap<>();
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new AwemeUserGetBindInfoResult();
            this.awemeUsers = awemeUsers;
        }
        
        
        public AwemeUserGetBindInfoReqCall setUserIdType(String userIdType){
            this.queryParams.put("user_id_type", userIdType);
            return this;
        }
        public AwemeUserGetBindInfoReqCall setUserId(String userId){
            this.queryParams.put("user_id", userId);
            return this;
        }

        @Override
        public Response<AwemeUserGetBindInfoResult> execute() throws Exception {
            this.optFns.add(com.larksuite.oapi.core.api.request.Request.setQueryParams(this.queryParams));
            com.larksuite.oapi.core.api.request.Request<Object, AwemeUserGetBindInfoResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/aweme_ecosystem/v1/aweme_users/get_bind_info", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.awemeUsers.service.config, request);
        }
    }
    public void setAwemeUserBindedAccountEventHandler(AwemeUserBindedAccountEventHandler handler) {
        Event.setTypeHandler(this.config, "aweme_ecosystem.aweme_user.binded_account_v1", handler);
    }

    public abstract static class AwemeUserBindedAccountEventHandler implements IHandler<AwemeUserBindedAccountEvent> {
        @Override
        public AwemeUserBindedAccountEvent getEvent() {
            return new AwemeUserBindedAccountEvent();
        }
    }

}
