package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.MultipleDebtController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class MultipleDebtControllerGetApplicationRo extends MultipleDebtController {

    @Param
    public String loanId;

   static {
      DenpendencesProcessor.roDendenpence(MultipleDebtControllerGetApplicationRo.class);
   }
}


