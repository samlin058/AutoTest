package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.UserConfigControllerGetRo;

import Domain.Ro.IndoArk.UserConfigControllerSaveRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class UserConfigController extends ApiBase {

    @Mapping(sub_path = "/user/config/get", requestType = "get" )
    public String get (UserConfigControllerGetRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/user/config/save", requestType = "post" ,contentTpye = "application/json")
    public String save (UserConfigControllerSaveRo ro) {
    return http(ro);
    }


}



