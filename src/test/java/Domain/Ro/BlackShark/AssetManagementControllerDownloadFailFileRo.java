package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.AssetManagementController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AssetManagementControllerDownloadFailFileRo extends AssetManagementController {

    @Param
    public String filename;

   static {
      DenpendencesProcessor.roDendenpence(AssetManagementControllerDownloadFailFileRo.class);
   }
}


