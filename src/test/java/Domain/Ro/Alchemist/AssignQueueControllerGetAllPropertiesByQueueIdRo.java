package Domain.Ro.Alchemist;

import Domain.Apis.Alchemist.AssignQueueController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AssignQueueControllerGetAllPropertiesByQueueIdRo extends AssignQueueController {

    @Param
    public String queueId;

   static {
      DenpendencesProcessor.roDendenpence(AssignQueueControllerGetAllPropertiesByQueueIdRo.class);
   }
}


