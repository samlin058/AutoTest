package Domain.Apis.LoanMarket;
import Domain.Ro.LoanMarket.WithdrawControllerListRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class WithdrawController extends ApiBase {

    @Mapping(sub_path = "/admin/withdrawal/list", requestType = "get" )
    public String list (WithdrawControllerListRo ro) {
    return http(ro);
    }


}



