// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.translation.v1;

import com.larksuite.oapi.core.api.AccessTokenType;
import com.larksuite.oapi.core.api.Api;
import com.larksuite.oapi.core.api.ReqCaller;
import com.larksuite.oapi.core.api.request.*;
import com.larksuite.oapi.core.api.response.*;
import com.larksuite.oapi.core.Config;
import com.larksuite.oapi.service.translation.v1.model.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TranslationService {

    private final Config config;
    private final Texts texts;

    public TranslationService(Config config) {
        this.config = config;
        this.texts = new Texts(this);
    }

    public Texts getTexts() {
        return texts;
    }

    public static class Texts {

        private final TranslationService service;

        public Texts(TranslationService service) {
            this.service = service;
        }
    
        public TextTranslateReqCall translate(TextTranslateReqBody body, RequestOptFn... optFns) {
            return new TextTranslateReqCall(this, body, optFns);
        }
    
        public TextDetectReqCall detect(TextDetectReqBody body, RequestOptFn... optFns) {
            return new TextDetectReqCall(this, body, optFns);
        }
    
    }
    public static class TextTranslateReqCall extends ReqCaller<TextTranslateReqBody, TextTranslateResult> {
        private final Texts texts;
        
        private final TextTranslateReqBody body;
        private final List<RequestOptFn> optFns;
        private TextTranslateResult result;
        
        private TextTranslateReqCall(Texts texts, TextTranslateReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new TextTranslateResult();
            this.texts = texts;
        }
        

        @Override
        public Response<TextTranslateResult> execute() throws Exception {
            com.larksuite.oapi.core.api.request.Request<TextTranslateReqBody, TextTranslateResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/translation/v1/text/translate", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.texts.service.config, request);
        }
    }
    public static class TextDetectReqCall extends ReqCaller<TextDetectReqBody, TextDetectResult> {
        private final Texts texts;
        
        private final TextDetectReqBody body;
        private final List<RequestOptFn> optFns;
        private TextDetectResult result;
        
        private TextDetectReqCall(Texts texts, TextDetectReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new TextDetectResult();
            this.texts = texts;
        }
        

        @Override
        public Response<TextDetectResult> execute() throws Exception {
            com.larksuite.oapi.core.api.request.Request<TextDetectReqBody, TextDetectResult> request = com.larksuite.oapi.core.api.request.Request.newRequest("/open-apis/translation/v1/text/detect", "POST",
                    new AccessTokenType[]{AccessTokenType.Tenant},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.texts.service.config, request);
        }
    }

}
