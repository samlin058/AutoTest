package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.AssetDisposeOpenControllerDisposeResultRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class AssetDisposeOpenController extends ApiBase {

    @Mapping(sub_path = "/blackShark/open/asset/dispose/result", requestType = "post" ,contentTpye = "Application/json")
    public String disposeResult (AssetDisposeOpenControllerDisposeResultRo ro) {
    return http(ro);
    }


}



