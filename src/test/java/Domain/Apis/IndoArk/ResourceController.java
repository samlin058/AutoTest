package Domain.Apis.IndoArk;


import Domain.Ro.IndoArk.ResourceControllerQueryRo;

import Domain.Ro.IndoArk.ResourceControllerQueryOneRo;

import Domain.Ro.IndoArk.ResourceControllerSaveRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class ResourceController extends ApiBase {

    @Mapping(sub_path = "/resource/all", requestType = "post" )
    public String getAllResources() {
    return http();
    }


    @Mapping(sub_path = "/resource/query", requestType = "get" )
    public String query (ResourceControllerQueryRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/resource/queryOne", requestType = "get" )
    public String queryOne (ResourceControllerQueryOneRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/resource/save", requestType = "post" ,contentTpye = "application/json")
    public String save (ResourceControllerSaveRo ro) {
    return http(ro);
    }


}



