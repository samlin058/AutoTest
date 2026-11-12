package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.AssetDisposeRevokeController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;
import java.util.List;


@lombok.Data
public class AssetDisposeRevokeControllerSaveAssetAutoRevokeJobRo extends AssetDisposeRevokeController {

    @Body
    public List<?> pkgNoList;

   static {
      DenpendencesProcessor.roDendenpence(AssetDisposeRevokeControllerSaveAssetAutoRevokeJobRo.class);
   }
}


