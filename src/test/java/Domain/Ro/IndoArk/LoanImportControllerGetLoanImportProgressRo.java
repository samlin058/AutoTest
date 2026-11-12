package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.LoanImportController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class LoanImportControllerGetLoanImportProgressRo extends LoanImportController {

    @Param
    public Integer id;

   static {
      DenpendencesProcessor.roDendenpence(LoanImportControllerGetLoanImportProgressRo.class);
   }
}


