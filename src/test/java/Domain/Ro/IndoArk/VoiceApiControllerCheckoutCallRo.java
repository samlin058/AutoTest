package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.VoiceApiController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;


@lombok.Data
public class VoiceApiControllerCheckoutCallRo extends VoiceApiController {

    @Body
    public Integer customerContactId;
    @Body
    public String callType;

   static {
      DenpendencesProcessor.roDendenpence(VoiceApiControllerCheckoutCallRo.class);
   }
}


