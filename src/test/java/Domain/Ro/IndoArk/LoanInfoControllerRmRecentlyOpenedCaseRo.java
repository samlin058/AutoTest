package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.LoanInfoController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class LoanInfoControllerRmRecentlyOpenedCaseRo extends LoanInfoController {

    @Param
    public String loanId;

   static {
      DenpendencesProcessor.roDendenpence(LoanInfoControllerRmRecentlyOpenedCaseRo.class);
   }
}


