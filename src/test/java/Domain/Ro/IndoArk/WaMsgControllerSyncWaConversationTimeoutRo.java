package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.WaMsgController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;


@lombok.Data
public class WaMsgControllerSyncWaConversationTimeoutRo extends WaMsgController {

    @Body
    public String account;
    @Body
    public String status;

   static {
      DenpendencesProcessor.roDendenpence(WaMsgControllerSyncWaConversationTimeoutRo.class);
   }
}


