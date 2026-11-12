package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.AgentVoiceController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AgentVoiceControllerPollAgentVoiceDataRo extends AgentVoiceController {

    @Param
    public String[] dataTimes;

   static {
      DenpendencesProcessor.roDendenpence(AgentVoiceControllerPollAgentVoiceDataRo.class);
   }
}


