package Domain.Apis.LoanMarket;
import Domain.Ro.LoanMarket.TeleProductControllerListByChannelRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class TeleProductController extends ApiBase {

    @Mapping(sub_path = "/tele-product/channel/list", requestType = "get" )
    public String listByChannel (TeleProductControllerListByChannelRo ro) {
    return http(ro);
    }


}



