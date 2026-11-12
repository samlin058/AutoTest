package Domain.Ro.LoanMarket;

import Domain.Apis.LoanMarket.RepayPlanController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class RepayPlanControllerRepayablePeriodRo extends RepayPlanController {

   static {
      DenpendencesProcessor.roDendenpence(RepayPlanControllerRepayablePeriodRo.class);
   }

    @Param
    public String orderId;
    @Param
    public String settleAll;


}


