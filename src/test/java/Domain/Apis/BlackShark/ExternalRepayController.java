package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.ExternalRepayControllerPlanRollBackRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class ExternalRepayController extends ApiBase {

    @Mapping(sub_path = "/blackShark/external/repay/plan/rollback", requestType = "post" ,contentTpye = "Application/json")
    public String planRollBack (ExternalRepayControllerPlanRollBackRo ro) {
    return http(ro);
    }


}



