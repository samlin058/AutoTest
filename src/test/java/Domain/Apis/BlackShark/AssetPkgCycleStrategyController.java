package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.AssetPkgCycleStrategyControllerQueryStrategyByPkgNoAndCycleIdRo;

import Domain.Ro.BlackShark.AssetPkgCycleStrategyControllerSaveAssetPkgCycleStrategyRo;

import Domain.Ro.BlackShark.AssetPkgCycleStrategyControllerQueryByStrategyRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class AssetPkgCycleStrategyController extends ApiBase {

    @Mapping(sub_path = "/blackShark/assetPkgCycleStrategy/queryStrategyByPkgNoAndCycleId", requestType = "get" )
    public String queryStrategyByPkgNoAndCycleId (AssetPkgCycleStrategyControllerQueryStrategyByPkgNoAndCycleIdRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/assetPkgCycleStrategy/saveAssetPkgCycleStrategy", requestType = "post" ,contentTpye = "Application/json")
    public String saveAssetPkgCycleStrategy (AssetPkgCycleStrategyControllerSaveAssetPkgCycleStrategyRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/assetPkgCycleStrategy/queryByStrategy", requestType = "get" )
    public String queryByStrategy (AssetPkgCycleStrategyControllerQueryByStrategyRo ro) {
    return http(ro);
    }


}



