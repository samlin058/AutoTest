package Domain.Apis.BlackShark;

import Domain.Ro.BlackShark.MyAssetProjectControllerCreateRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class MyAssetProjectController extends ApiBase {

    @Mapping(sub_path = "/blackShark/assetProject/myProject/create", requestType = "post", contentTpye = "Application/json")
    public String create(MyAssetProjectControllerCreateRo ro) {
        return http(ro);
    }

}



