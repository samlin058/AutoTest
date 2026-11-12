package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.WaMsgController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class WaMsgControllerWaMessagesClearRo extends WaMsgController {

    @Param
    public String loanId;

   static {
      DenpendencesProcessor.roDendenpence(WaMsgControllerWaMessagesClearRo.class);
   }
}


