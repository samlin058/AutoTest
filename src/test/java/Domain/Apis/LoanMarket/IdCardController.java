package Domain.Apis.LoanMarket;
import Domain.Ro.LoanMarket.IdCardControllerSaveIdCardRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class IdCardController extends ApiBase {

    @Mapping(sub_path = "/id-card/save", requestType = "post" ,contentTpye = "application/json")
    public String saveIdCard (IdCardControllerSaveIdCardRo ro) {
    return http(ro);
    }


}



