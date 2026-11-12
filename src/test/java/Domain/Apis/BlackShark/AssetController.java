package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.AssetControllerQueryAssetByQlRo;

import Domain.Ro.BlackShark.AssetControllerTestGraphqlRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class AssetController extends ApiBase {

    @Mapping(sub_path = "/blackShark/asset/queryAssetByQl", requestType = "post" ,contentTpye = "Application/json")
    public String queryAssetByQl (AssetControllerQueryAssetByQlRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/asset/testGraphql", requestType = "get" )
    public String testGraphql (AssetControllerTestGraphqlRo ro) {
    return http(ro);
    }


}



