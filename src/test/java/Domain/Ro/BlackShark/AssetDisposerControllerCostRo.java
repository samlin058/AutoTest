package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.AssetDisposerController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AssetDisposerControllerCostRo extends AssetDisposerController {

    @Param
    public String dateType;
    @Param
    public String bizScope;

   static {
      DenpendencesProcessor.roDendenpence(AssetDisposerControllerCostRo.class);
   }
}


