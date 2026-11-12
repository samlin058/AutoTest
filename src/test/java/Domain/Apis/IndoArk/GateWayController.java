package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.GateWayControllerIsChildRo;

import Domain.Ro.IndoArk.GateWayControllerCheckUsernamePasswordRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class GateWayController extends ApiBase {

    @Mapping(sub_path = "/auth-service/gateWay/user/isChild", requestType = "get" )
    public String isChild (GateWayControllerIsChildRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/auth-service/gateWay/user/passwordCheck", requestType = "get" )
    public String checkUsernamePassword (GateWayControllerCheckUsernamePasswordRo ro) {
    return http(ro);
    }


}



