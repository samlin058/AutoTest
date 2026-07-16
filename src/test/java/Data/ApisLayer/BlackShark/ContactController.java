package Data.ApisLayer.BlackShark;
import Data.Ro.BlackShark.ContactControllerInBoundRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class ContactController extends ApiBase {

    @Mapping(sub_path = "/contact/inBound/assetId", requestType = "post" ,contentTpye = "Application/json")
    public String inBound (ContactControllerInBoundRo ro) {
    return http(ro);
    }


}



