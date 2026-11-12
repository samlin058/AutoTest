package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.AssignController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AssignControllerAssignFileFailDownloadRo extends AssignController {

    @Param
    public Integer assignRecordId;

   static {
      DenpendencesProcessor.roDendenpence(AssignControllerAssignFileFailDownloadRo.class);
   }
}


