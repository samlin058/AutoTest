package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.MonitorController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class MonitorControllerGetServiceTimeRo extends MonitorController {

    @Param
    public Number startTime;
    @Param
    public Number endTime;

   static {
      DenpendencesProcessor.roDendenpence(MonitorControllerGetServiceTimeRo.class);
   }
}


