package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.MaskControllerGetMaskByKeysRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class MaskController extends ApiBase {

    @Mapping(sub_path = "/mask/values", requestType = "post" ,contentTpye = "application/json")
    public String getMaskByKeys (MaskControllerGetMaskByKeysRo ro) {
    return http(ro);
    }


}



