package Domain.Ro.Alchemist;

import Domain.Apis.Alchemist.TaskController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class TaskControllerDownloadFailRecordRo extends TaskController {

    @Param
    public String batchNo;

   static {
      DenpendencesProcessor.roDendenpence(TaskControllerDownloadFailRecordRo.class);
   }
}


