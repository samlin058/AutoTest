package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.MessageController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;
import java.util.List;


@lombok.Data
public class MessageControllerDealTidingsRo extends MessageController {

    @Body
    public List<?> ids;

   static {
      DenpendencesProcessor.roDendenpence(MessageControllerDealTidingsRo.class);
   }
}


