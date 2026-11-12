package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.LoanBatchController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class LoanBatchControllerBatchListBySourceRo extends LoanBatchController {

    @Param
    public Integer loanSourceId;

   static {
      DenpendencesProcessor.roDendenpence(LoanBatchControllerBatchListBySourceRo.class);
   }
}


