package Domain.Apis.BlackShark;

import Domain.Ro.BlackShark.PreAssetManualReviewControllerQueryBatchListRo;
import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class PreAssetManualReviewController extends ApiBase {

    @Mapping(sub_path = "/blackShark/assertImport/manualReview/queryBatchList", requestType = "post", contentTpye = "application/json")
    public String queryBatchList(PreAssetManualReviewControllerQueryBatchListRo ro) {
        return http(ro);
    }


}



