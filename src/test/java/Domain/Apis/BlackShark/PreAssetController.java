package Domain.Apis.BlackShark;

import Domain.Ro.BlackShark.PreAssetControllerDisposeRo;
import Domain.Ro.BlackShark.PreAssetControllerGetAssetPackageListRo;
import Domain.Ro.BlackShark.PreAssetControllerImportAssetRo;
import Domain.Ro.BlackShark.PreAssetControllerQueryAssetStatusRo;
import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class PreAssetController extends ApiBase {

    @Mapping(sub_path = "/blackShark/preAsset/dispose", requestType = "post", contentTpye = "Application/json")
    public String dispose(PreAssetControllerDisposeRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/blackShark/preAsset/asset-status", requestType = "get" )
    public String queryAssetStatus (PreAssetControllerQueryAssetStatusRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/blackShark/preAsset/import", requestType = "post", contentTpye = "Application/json")
    public String importAsset(PreAssetControllerImportAssetRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/blackShark/preAsset/repayPlanFeeTypeList", requestType = "get")
    public String repayPlanFeeTypeList() {
        return http();
    }

    @Mapping(sub_path = "/blackShark/preAsset/getPackage", requestType = "get" )
    public String getAssetPackageList (PreAssetControllerGetAssetPackageListRo ro) {
        return http(ro);
    }

}



