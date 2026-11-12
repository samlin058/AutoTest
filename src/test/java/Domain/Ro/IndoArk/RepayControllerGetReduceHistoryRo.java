package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.RepayController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class RepayControllerGetReduceHistoryRo extends RepayController {

    @Param
    public Integer loanId;

   static {
      DenpendencesProcessor.roDendenpence(RepayControllerGetReduceHistoryRo.class);
   }
}


