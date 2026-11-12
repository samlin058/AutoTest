package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.AuthUserControllerQueryOneByAccountRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class AuthUserController extends ApiBase {

    @Mapping(sub_path = "/auth-service/user/one", requestType = "get" )
    public String queryOneByAccount (AuthUserControllerQueryOneByAccountRo ro) {
    return http(ro);
    }


}



