package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.MaskController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;
import java.util.List;


@lombok.Data
public class MaskControllerGetMaskByKeysRo extends MaskController {

    @Body
    public List<?> keys;

   static {
      DenpendencesProcessor.roDendenpence(MaskControllerGetMaskByKeysRo.class);
   }
}


