package Domain.Ro.BlackShark;

import Domain.Business.BlackShark.convertToId;
import Domain.Apis.BlackShark.AssetDisposeRevokeController;
import Service.Annotations.AnnotationLibrary.Body;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;


@lombok.Data
public class AssetDisposeRevokeControllerDisposerRevokeRo extends AssetDisposeRevokeController {

    @Body
    public String disposerCode;

   static {
      DenpendencesProcessor.roDendenpence(AssetDisposeRevokeControllerDisposerRevokeRo.class);
   }

    public AssetDisposeRevokeControllerDisposerRevokeRo(String disposerName) {
        this.disposerCode = (String) convertToId.getDisposerId(disposerName,"disposerCode");
    }

}


