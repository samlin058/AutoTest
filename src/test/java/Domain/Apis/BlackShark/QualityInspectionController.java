package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.QualityInspectionControllerGetDisposerTotalRo;



import Domain.Ro.BlackShark.QualityInspectionControllerGetTotalInfoRo;

import Domain.Ro.BlackShark.QualityInspectionControllerGetAssetPkgTotalRo;

import Domain.Ro.BlackShark.QualityInspectionControllerGetQualityInspectionListRo;

import Domain.Ro.BlackShark.QualityInspectionControllerResultRo;

import Domain.Ro.BlackShark.QualityInspectionControllerDeleteSensitiveWordsRo;

import Domain.Ro.BlackShark.QualityInspectionControllerUpdateSensitiveWordsRo;





import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class QualityInspectionController extends ApiBase {

    @Mapping(sub_path = "/quality-inspection/getDisposerTotal", requestType = "get" )
    public String getDisposerTotal (QualityInspectionControllerGetDisposerTotalRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/quality-inspection/sensitive-words/items", requestType = "get" )
    public String sensitiveWordsList() {
    return http();
    }


    @Mapping(sub_path = "/quality-inspection/getTotalInfo", requestType = "get" )
    public String getTotalInfo (QualityInspectionControllerGetTotalInfoRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/quality-inspection/getAssetPkgTotal", requestType = "get" )
    public String getAssetPkgTotal (QualityInspectionControllerGetAssetPkgTotalRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/quality-inspection/getList", requestType = "get" )
    public String getQualityInspectionList (QualityInspectionControllerGetQualityInspectionListRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/quality-inspection/result", requestType = "post" ,contentTpye = "Application/json")
    public String result (QualityInspectionControllerResultRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/quality-inspection/sensitive-words/delete", requestType = "post" ,contentTpye = "Application/json")
    public String deleteSensitiveWords (QualityInspectionControllerDeleteSensitiveWordsRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/quality-inspection/sensitive-words/update", requestType = "post" ,contentTpye = "Application/json")
    public String updateSensitiveWords (QualityInspectionControllerUpdateSensitiveWordsRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/quality-inspection/dial-record/inspect/{connId}", requestType = "get" )
    public String getInspect() {
    return http();
    }


    @Mapping(sub_path = "/quality-inspection/sensitive-words/add", requestType = "post" ,contentTpye = "Application/json")
    public String addSensitiveWords() {
    return http();
    }



}



