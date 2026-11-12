package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.AutoCallController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AutoCallControllerExportTaskItemsRo extends AutoCallController {

    @Param
    public Number id;

   static {
      DenpendencesProcessor.roDendenpence(AutoCallControllerExportTaskItemsRo.class);
   }
}


