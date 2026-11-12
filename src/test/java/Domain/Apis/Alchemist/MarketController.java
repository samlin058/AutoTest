package Domain.Apis.Alchemist;
import Domain.Ro.Alchemist.MarketControllerMarketImportRo;
import java.util.List;
import Domain.Ro.Alchemist.MarketControllerMarketListRo;

import Domain.Ro.Alchemist.MarketControllerBatchCrackRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class MarketController extends ApiBase {

    @Mapping(sub_path = "/market/import", requestType = "post" ,contentTpye = "Application/json")
    public String marketImport(List<MarketControllerMarketImportRo> ro) {
    return http(ro);
    }


    @Mapping(sub_path = "/market/list", requestType = "post" ,contentTpye = "Application/json")
    public String marketList (MarketControllerMarketListRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/market/crack/batch", requestType = "post" ,contentTpye = "Application/json")
    public String batchCrack (MarketControllerBatchCrackRo ro) {
    return http(ro);
    }


}



