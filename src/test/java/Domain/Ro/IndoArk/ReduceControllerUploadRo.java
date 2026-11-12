package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.ReduceController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.FileBody;


@lombok.Data
public class ReduceControllerUploadRo extends ReduceController {

    @FileBody
    public String file;

   static {
      DenpendencesProcessor.roDendenpence(ReduceControllerUploadRo.class);
   }
}


