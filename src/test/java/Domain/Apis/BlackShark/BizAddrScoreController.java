package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.BizAddrScoreControllerAddrScoreListRo;



import Domain.Ro.BlackShark.BizAddrScoreControllerGetByParentLocationCodeRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class BizAddrScoreController extends ApiBase {

    @Mapping(sub_path = "/blackShark/bizAddrDict/addrScoreList", requestType = "get" )
    public String addrScoreList (BizAddrScoreControllerAddrScoreListRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/bizAddrDict/addAddrScore", requestType = "post" )
    public String addAddrScore() {
    return http();
    }


    @Mapping(sub_path = "/blackShark/bizAddrDict/getByParentLocationCode", requestType = "get" )
    public String getByParentLocationCode (BizAddrScoreControllerGetByParentLocationCodeRo ro) {
    return http(ro);
    }


}



