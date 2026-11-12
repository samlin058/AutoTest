package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.CallRecordControllerInitCallRecordRo;

import Domain.Ro.IndoArk.CallRecordControllerUpdateCallRecordRo;

import Domain.Ro.IndoArk.CallRecordControllerGetCallRecordsRo;

import Domain.Ro.IndoArk.CallRecordControllerLinkupCallRecordCallbackRo;



import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class CallRecordController extends ApiBase {

    @Mapping(sub_path = "/call/callRecord", requestType = "post" ,contentTpye = "application/json")
    public String initCallRecord (CallRecordControllerInitCallRecordRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/call/callRecord/{callRecordId}/update", requestType = "post" ,contentTpye = "application/json")
    public String updateCallRecord (CallRecordControllerUpdateCallRecordRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/call/callRecords", requestType = "get" )
    public String getCallRecords (CallRecordControllerGetCallRecordsRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/call/callRecord/callback", requestType = "post" ,contentTpye = "application/json")
    public String linkupCallRecordCallback (CallRecordControllerLinkupCallRecordCallbackRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/call/callRecord/loan/{loanId}/today", requestType = "get" )
    public String getLoanTodayCallRecord() {
    return http();
    }



}



