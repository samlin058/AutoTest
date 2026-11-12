package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.VoiceApiController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;
import java.util.List;


@lombok.Data
public class VoiceApiControllerCruiseSelfBatchAppendRo extends VoiceApiController {

    @Body
    public List<?> loanIds;

   static {
      DenpendencesProcessor.roDendenpence(VoiceApiControllerCruiseSelfBatchAppendRo.class);
   }
}


