package Domain.Apis.IndoArk;


import Domain.Ro.IndoArk.UserClockInControllerClockInRo;

import Domain.Ro.IndoArk.UserClockInControllerPageRo;

import Domain.Ro.IndoArk.UserClockInControllerExportRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class UserClockInController extends ApiBase {

    @Mapping(sub_path = "/users/clockIn/status", requestType = "get" )
    public String getUserClockInStatus() {
    return http();
    }


    @Mapping(sub_path = "/users/clockIn", requestType = "post" ,contentTpye = "application/json")
    public String clockIn (UserClockInControllerClockInRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/users/clockIn/page", requestType = "get" )
    public String page (UserClockInControllerPageRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/users/clockIn/export", requestType = "get" )
    public String export (UserClockInControllerExportRo ro) {
    return http(ro);
    }


}



