package Domain.Apis.Alchemist;
import Domain.Ro.Alchemist.ActivityConfigControllerPageRo;

import Domain.Ro.Alchemist.ActivityConfigControllerSaveOrUpdateRo;

import Domain.Ro.Alchemist.ActivityConfigControllerAllRo;

import Domain.Ro.Alchemist.ActivityConfigControllerFindByIdRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class ActivityConfigController extends ApiBase {

    @Mapping(sub_path = "/activityConfig/page", requestType = "get" )
    public String page (ActivityConfigControllerPageRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/activityConfig/saveOrUpdate", requestType = "post" ,contentTpye = "Application/json")
    public String saveOrUpdate (ActivityConfigControllerSaveOrUpdateRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/activityConfig/all", requestType = "get" )
    public String all (ActivityConfigControllerAllRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/activityConfig/findById", requestType = "get" )
    public String findById (ActivityConfigControllerFindByIdRo ro) {
    return http(ro);
    }


}



