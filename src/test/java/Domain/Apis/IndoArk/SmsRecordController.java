package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.SmsRecordControllerSmsSendRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class SmsRecordController extends ApiBase {

    @Mapping(sub_path = "/sms/record/page", requestType = "get" )
    public String smsSend (SmsRecordControllerSmsSendRo ro) {
    return http(ro);
    }


}



