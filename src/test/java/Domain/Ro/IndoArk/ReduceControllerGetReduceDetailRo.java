package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.ReduceController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class ReduceControllerGetReduceDetailRo extends ReduceController {

    @Param
    public String id;

   static {
      DenpendencesProcessor.roDendenpence(ReduceControllerGetReduceDetailRo.class);
   }
}


