package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.AssignController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AssignControllerGetAssignRecordsRo extends AssignController {

    @Param
    public String loanId;
    @Param
    public Integer current;
    @Param
    public Integer pageSize;

   static {
      DenpendencesProcessor.roDendenpence(AssignControllerGetAssignRecordsRo.class);
   }
}


