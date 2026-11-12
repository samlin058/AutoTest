package Domain.Apis.LoanMarket;

import Domain.Ro.LoanMarket.ChannelControllerListRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class ChannelController extends ApiBase {

    @Mapping(sub_path = "/admin/channel/list", requestType = "get")
    public String list(ChannelControllerListRo ro) {
        return http(ro);
    }

}



