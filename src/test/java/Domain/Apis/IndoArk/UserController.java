package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.UserControllerQueryCanAssignRoleRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class UserController extends ApiBase {

    @Mapping(sub_path = "/user/role/canAssign", requestType = "get" )
    public String queryCanAssignRole (UserControllerQueryCanAssignRoleRo ro) {
    return http(ro);
    }


}



