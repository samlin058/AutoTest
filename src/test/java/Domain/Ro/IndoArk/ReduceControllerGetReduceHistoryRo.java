package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.ReduceController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class ReduceControllerGetReduceHistoryRo extends ReduceController {

    @Param
    public Integer loanId;

   static {
      DenpendencesProcessor.roDendenpence(ReduceControllerGetReduceHistoryRo.class);
   }
}


