package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.ProductionCapacityControllerCoverRateRankingRo;

import Domain.Ro.BlackShark.ProductionCapacityControllerConnectRateRankingRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class ProductionCapacityController extends ApiBase {

    @Mapping(sub_path = "/capacity/cover/ranking", requestType = "get" )
    public String coverRateRanking (ProductionCapacityControllerCoverRateRankingRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/capacity/connect/ranking", requestType = "get" )
    public String connectRateRanking (ProductionCapacityControllerConnectRateRankingRo ro) {
    return http(ro);
    }


}



