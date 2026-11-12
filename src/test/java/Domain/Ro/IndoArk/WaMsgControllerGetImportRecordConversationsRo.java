package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.WaMsgController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class WaMsgControllerGetImportRecordConversationsRo extends WaMsgController {

    @Param
    public Integer id;

   static {
      DenpendencesProcessor.roDendenpence(WaMsgControllerGetImportRecordConversationsRo.class);
   }
}


