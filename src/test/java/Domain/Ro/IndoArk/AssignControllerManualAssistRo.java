package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.AssignController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;
import java.util.List;


@lombok.Data
public class AssignControllerManualAssistRo extends AssignController {

    @Body
    public Integer agentId;
    @Body
    public List<?> loanIdList;

   static {
      DenpendencesProcessor.roDendenpence(AssignControllerManualAssistRo.class);
   }
}


