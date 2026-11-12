package Domain.Apis.BlackShark;

import Domain.Ro.BlackShark.PreAssetPkgBatchControllerCheckAssetRo;
import Domain.Ro.BlackShark.PreAssetPkgBatchControllerQueryLastRuleConfRo;
import Domain.Ro.BlackShark.PreAssetPkgBatchControllerUploadFileRo;
import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class PreAssetPkgBatchController extends ApiBase {

    @Mapping(sub_path = "/blackShark/preAssetPkgBatch/uploadFile", requestType = "post", contentTpye = "multipart/form-data")
    public String uploadFile(PreAssetPkgBatchControllerUploadFileRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/blackShark/preAssetPkgBatch/queryLastRuleConf", requestType = "get")
    public String queryLastRuleConf(PreAssetPkgBatchControllerQueryLastRuleConfRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/blackShark/assetPkg/projectPkgList", requestType = "get")
    public String projectPkgList() {
        return http();
    }

    @Mapping(sub_path = "/blackShark/preAssetPkgBatch/check", requestType = "post", contentTpye = "application/json")
    public String checkAsset(PreAssetPkgBatchControllerCheckAssetRo ro) {
        return http(ro);
    }
}



