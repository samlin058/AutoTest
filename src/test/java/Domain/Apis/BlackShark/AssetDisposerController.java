package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.AssetDisposerControllerEffectivenessAssessmentRo;

import Domain.Ro.BlackShark.AssetDisposerControllerGetEffectivenessAssessmentRo;

import Domain.Ro.BlackShark.AssetDisposerControllerGradeRo;

import Domain.Ro.BlackShark.AssetDisposerControllerCostRo;

import Domain.Ro.BlackShark.AssetDisposerControllerRepaymentRateRankingRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class AssetDisposerController extends ApiBase {

    @Mapping(sub_path = "/blackShark/assetDisposer/effect/assessment", requestType = "get" )
    public String effectivenessAssessment (AssetDisposerControllerEffectivenessAssessmentRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/assetDisposer/effect/assessment/get", requestType = "get" )
    public String getEffectivenessAssessment (AssetDisposerControllerGetEffectivenessAssessmentRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/assetDisposer/grade/get", requestType = "get" )
    public String grade (AssetDisposerControllerGradeRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/assetDisposer/cost", requestType = "get" )
    public String cost (AssetDisposerControllerCostRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/assetDisposer/cost/disposer/ranking", requestType = "get" )
    public String repaymentRateRanking (AssetDisposerControllerRepaymentRateRankingRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/assetDisposer/list", requestType = "get" )
    public String list() {
        return http();
    }
}



