package Domain.Ro.Alchemist;

import Domain.Apis.Alchemist.AssignQueueController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;
import java.util.List;


@lombok.Data
public class AssignQueueControllerSaveAgentSkillRo extends AssignQueueController {

    @Body
    public Integer queueId;
    @Body
    public List<?> agentIds;

   static {
      DenpendencesProcessor.roDendenpence(AssignQueueControllerSaveAgentSkillRo.class);
   }
}


