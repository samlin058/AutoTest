package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.AuthControllerQueryRo;

import Domain.Ro.IndoArk.AuthControllerQueryUrlRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class AuthController extends ApiBase {

    @Mapping(sub_path = "/auth-service/auth/query", requestType = "get" )
    public String query (AuthControllerQueryRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/auth-service/auth/queryUrl", requestType = "get" )
    public String queryUrl (AuthControllerQueryUrlRo ro) {
    return http(ro);
    }


}



