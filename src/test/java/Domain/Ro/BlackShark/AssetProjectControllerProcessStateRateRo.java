package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.AssetProjectController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AssetProjectControllerProcessStateRateRo extends AssetProjectController {

    @Param
    public String projectId;

   static {
      DenpendencesProcessor.roDendenpence(AssetProjectControllerProcessStateRateRo.class);
   }
}


