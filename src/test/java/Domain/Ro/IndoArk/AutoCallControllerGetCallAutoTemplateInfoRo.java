package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.AutoCallController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AutoCallControllerGetCallAutoTemplateInfoRo extends AutoCallController {

    @Param
    public String value;

   static {
      DenpendencesProcessor.roDendenpence(AutoCallControllerGetCallAutoTemplateInfoRo.class);
   }
}


