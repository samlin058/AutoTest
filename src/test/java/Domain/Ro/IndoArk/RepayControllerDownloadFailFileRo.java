package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.RepayController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class RepayControllerDownloadFailFileRo extends RepayController {

    @Param
    public String id;

   static {
      DenpendencesProcessor.roDendenpence(RepayControllerDownloadFailFileRo.class);
   }
}


