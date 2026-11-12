package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.StrategyVariableControllerQueryStrategyDetailRo;

import Domain.Ro.BlackShark.StrategyVariableControllerResultListRo;

import Domain.Ro.BlackShark.StrategyVariableControllerStrategyVariableOverViewRo;

import Domain.Ro.BlackShark.StrategyVariableControllerSaveOrUpdateStrategyRo;





import Domain.Ro.BlackShark.StrategyVariableControllerPublishStrategyRo;



import Domain.Ro.BlackShark.StrategyVariableControllerStrategyExportRo;

import Domain.Ro.BlackShark.StrategyVariableControllerStrategyImportRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class StrategyVariableController extends ApiBase {

    @Mapping(sub_path = "/blackShark/strategy/queryStrategyDetail", requestType = "post" ,contentTpye = "Application/json")
    public String queryStrategyDetail (StrategyVariableControllerQueryStrategyDetailRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/strategy/resultList", requestType = "get" )
    public String resultList (StrategyVariableControllerResultListRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/strategy/strategyVariableOverView", requestType = "get" )
    public String strategyVariableOverView (StrategyVariableControllerStrategyVariableOverViewRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/strategy/saveOrUpdateStrategy", requestType = "post" ,contentTpye = "Application/json")
    public String saveOrUpdateStrategy (StrategyVariableControllerSaveOrUpdateStrategyRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/strategy/queryStrategyType", requestType = "get" )
    public String queryStrategyType() {
    return http();
    }


    @Mapping(sub_path = "/blackShark/strategy/queryExecuteResult", requestType = "get" )
    public String queryExecuteResult() {
    return http();
    }


    @Mapping(sub_path = "/blackShark/strategy/publishStrategy", requestType = "post" ,contentTpye = "Application/json")
    public String publishStrategy (StrategyVariableControllerPublishStrategyRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/strategy/queryStrategyTypeExcept", requestType = "post" )
    public String queryStrategyTypeExcept() {
    return http();
    }


    @Mapping(sub_path = "/blackShark/strategy/export", requestType = "get" )
    public String strategyExport (StrategyVariableControllerStrategyExportRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/strategy/import", requestType = "post" ,contentTpye = "multipart/form-data")
    public String strategyImport (StrategyVariableControllerStrategyImportRo ro) {
    return http(ro);
    }


}



