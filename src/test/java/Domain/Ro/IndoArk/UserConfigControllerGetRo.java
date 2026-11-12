package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.UserConfigController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class UserConfigControllerGetRo extends UserConfigController {

    @Param
    public String type;

   static {
      DenpendencesProcessor.roDendenpence(UserConfigControllerGetRo.class);
   }
}


