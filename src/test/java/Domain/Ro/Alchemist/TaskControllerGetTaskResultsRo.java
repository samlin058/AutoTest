package Domain.Ro.Alchemist;

import Domain.Apis.Alchemist.TaskController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class TaskControllerGetTaskResultsRo extends TaskController {

    @Param
    public String type;

   static {
      DenpendencesProcessor.roDendenpence(TaskControllerGetTaskResultsRo.class);
   }
}


