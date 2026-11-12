package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.ReduceController;
import Service.Annotations.AnnotationLibrary.Body;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;


@lombok.Data
public class ReduceControllerDeleteRo extends ReduceController {


    @Body
    public String url;

   static {
      DenpendencesProcessor.roDendenpence(ReduceControllerDeleteRo.class);
   }
}


