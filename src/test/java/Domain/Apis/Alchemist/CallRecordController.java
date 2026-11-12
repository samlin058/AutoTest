package Domain.Apis.Alchemist;
import Domain.Ro.Alchemist.CallRecordControllerPageRo;



import Domain.Ro.Alchemist.CallRecordControllerExportRo;

import Domain.Ro.Alchemist.CallRecordControllerUpdateCallResultRo;

import Domain.Ro.Alchemist.CallRecordControllerUpdateConnIdAndExtensionNumberRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class CallRecordController extends ApiBase {

    @Mapping(sub_path = "/interactions/callRecord/page", requestType = "post" ,contentTpye = "Application/json")
    public String page (CallRecordControllerPageRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/interactions/callRecord/callType", requestType = "get" )
    public String callType() {
    return http();
    }


    @Mapping(sub_path = "/interactions/callRecord/export", requestType = "get" )
    public String export (CallRecordControllerExportRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/interactions/callRecord/{callRecordId}/result/update", requestType = "post" ,contentTpye = "Application/json")
    public String updateCallResult (CallRecordControllerUpdateCallResultRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/interactions/callRecord/{callRecordId}/voiceRecord/update", requestType = "post" ,contentTpye = "Application/json")
    public String updateConnIdAndExtensionNumber (CallRecordControllerUpdateConnIdAndExtensionNumberRo ro) {
    return http(ro);
    }


}



