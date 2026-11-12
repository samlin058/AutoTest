package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.ReservedController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class ReservedControllerCheckRo extends ReservedController {

    @Param
    public Integer loanId;

   static {
      DenpendencesProcessor.roDendenpence(ReservedControllerCheckRo.class);
   }
}


