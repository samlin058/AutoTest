package Domain.Apis.Alchemist;
import Domain.Ro.Alchemist.InteractionControllerOperateRo;

import Domain.Ro.Alchemist.InteractionControllerAiCallRecordRo;



import Domain.Ro.Alchemist.InteractionControllerBatchOperatorRo;

import Domain.Ro.Alchemist.InteractionControllerAiChatContentRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class InteractionController extends ApiBase {

    @Mapping(sub_path = "/interactions/operate", requestType = "post" ,contentTpye = "Application/json")
    public String operate (InteractionControllerOperateRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/interactions/aiCallRecord", requestType = "post" ,contentTpye = "Application/json")
    public String aiCallRecord (InteractionControllerAiCallRecordRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/interactions/pushAi/{billId}", requestType = "post" )
    public String pushAi() {
    return http();
    }


    @Mapping(sub_path = "/interactions/batchOperate", requestType = "post" ,contentTpye = "Application/json")
    public String batchOperator (InteractionControllerBatchOperatorRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/interactions/ai/chat/content", requestType = "get" )
    public String aiChatContent (InteractionControllerAiChatContentRo ro) {
    return http(ro);
    }


}



