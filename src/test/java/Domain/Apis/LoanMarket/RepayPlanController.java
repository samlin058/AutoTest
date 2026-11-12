package Domain.Apis.LoanMarket;

import Domain.Ro.LoanMarket.RepayPlanControllerPaymentRo;

import Domain.Ro.LoanMarket.RepayPlanControllerRepayablePeriodRo;

import Domain.Ro.LoanMarket.RepayPlanControllerPlanCalculateRo;

import Domain.Ro.LoanMarket.RepayPlanControllerMyRepayPlanRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class RepayPlanController extends ApiBase {

    @Mapping(sub_path = "/order/repay/payment", requestType = "post", contentTpye = "application/json")
    public String payment(RepayPlanControllerPaymentRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/order/repay/cashier-info", requestType = "get")
    public String repayablePeriod(RepayPlanControllerRepayablePeriodRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/order/repay/plan-calculate", requestType = "post", contentTpye = "application/json")
    public String planCalculate(RepayPlanControllerPlanCalculateRo ro) {
        return http(ro);
    }

    /**
     * 还款计划查询
     */
    @Mapping(sub_path = "/order/repay/my-repay-plan", requestType = "get")
    public String myRepayPlan(RepayPlanControllerMyRepayPlanRo ro) {
        return http(ro);
    }

}



