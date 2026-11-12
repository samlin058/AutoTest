package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.AgentVoiceController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AgentVoiceControllerAgentVoicesRo extends AgentVoiceController {

    @Param
    public String startDate;
    @Param
    public String endDate;
    @Param
    public Integer agent;
    @Param
    public Integer agentGroup;

   static {
      DenpendencesProcessor.roDendenpence(AgentVoiceControllerAgentVoicesRo.class);
   }
}


