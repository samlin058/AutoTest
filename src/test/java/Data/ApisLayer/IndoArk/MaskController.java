package Data.ApisLayer.IndoArk;
import Data.Ro.IndoArk.MaskControllerGetMaskByKeysRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class MaskController extends ApiBase {

    @Mapping(sub_path = "/mask/values", requestType = "post" ,contentTpye = "application/json")
    public String getMaskByKeys (MaskControllerGetMaskByKeysRo ro) {
    return http(ro);
    }


}



