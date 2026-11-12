package Domain.Apis.Alchemist;


import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class ConsumerController extends ApiBase {

    @Mapping(sub_path = "/consumer/smsReply", requestType = "post" ,contentTpye = "Application/json")
    public String SmsReplyConsumer() {
    return http();
    }



}



