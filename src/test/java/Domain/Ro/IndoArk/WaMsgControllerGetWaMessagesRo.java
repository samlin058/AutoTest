package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.WaMsgController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class WaMsgControllerGetWaMessagesRo extends WaMsgController {

    @Param
    public String loanId;

   static {
      DenpendencesProcessor.roDendenpence(WaMsgControllerGetWaMessagesRo.class);
   }
}


