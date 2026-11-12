package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.LoanBatchController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class LoanBatchControllerExportByCheckIdsRo extends LoanBatchController {

    @Param
    public String[] importBatchIdList;

   static {
      DenpendencesProcessor.roDendenpence(LoanBatchControllerExportByCheckIdsRo.class);
   }
}


