package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.LoanImportController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;


@lombok.Data
public class LoanImportControllerImportByCoverRo extends LoanImportController {

    @Body
    public String file;
    @Body
    public Integer importTemplateId;
    @Body
    public String importBatchId;

   static {
      DenpendencesProcessor.roDendenpence(LoanImportControllerImportByCoverRo.class);
   }
}


