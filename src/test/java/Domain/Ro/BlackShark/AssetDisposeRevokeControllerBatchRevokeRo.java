package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.AssetDisposeRevokeController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AssetDisposeRevokeControllerBatchRevokeRo extends AssetDisposeRevokeController {

    @Param
    public String assignBatchNo;

   static {
      DenpendencesProcessor.roDendenpence(AssetDisposeRevokeControllerBatchRevokeRo.class);
   }
}


