package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.LoanImportController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class LoanImportControllerGetLoanImportStatusRo extends LoanImportController {

    @Param
    public String importBatchId;

   static {
      DenpendencesProcessor.roDendenpence(LoanImportControllerGetLoanImportStatusRo.class);
   }
}


