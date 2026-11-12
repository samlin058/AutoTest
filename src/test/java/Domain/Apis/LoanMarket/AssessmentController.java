package Domain.Apis.LoanMarket;

import Domain.Ro.LoanMarket.AssessmentControllerInitRo;

import Domain.Ro.LoanMarket.AssessmentControllerResultRo;
import Domain.Ro.LoanMarket.AssessmentControllerStatusRo;
import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class AssessmentController extends ApiBase {

    @Mapping(sub_path = "/credit-assessment/new", requestType = "post", contentTpye = "application/json")
    public String init(AssessmentControllerInitRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/credit-assessment/status", requestType = "get")
    public String status(AssessmentControllerStatusRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/credit-assessment/result", requestType = "get")
    public String result(AssessmentControllerResultRo ro) {
        return http(ro);
    }

}



