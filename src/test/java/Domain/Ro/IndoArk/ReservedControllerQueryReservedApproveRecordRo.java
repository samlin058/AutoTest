package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.ReservedController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class ReservedControllerQueryReservedApproveRecordRo extends ReservedController {

    @Param
    public Integer id;

   static {
      DenpendencesProcessor.roDendenpence(ReservedControllerQueryReservedApproveRecordRo.class);
   }
}


