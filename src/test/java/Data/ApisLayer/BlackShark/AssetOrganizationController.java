package Data.ApisLayer.BlackShark;


import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class AssetOrganizationController extends ApiBase {

    @Mapping(sub_path = "/blackShark/assetOrganization/listEnable", requestType = "get")
    public String listEnable() {
        return http();
    }


}



