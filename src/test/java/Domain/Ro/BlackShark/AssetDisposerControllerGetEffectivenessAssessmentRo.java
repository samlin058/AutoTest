package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.AssetDisposerController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AssetDisposerControllerGetEffectivenessAssessmentRo extends AssetDisposerController {

    @Param
    public String disposerId;

   static {
      DenpendencesProcessor.roDendenpence(AssetDisposerControllerGetEffectivenessAssessmentRo.class);
   }
}


