package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.AssetDisposeJobController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AssetDisposeJobControllerDownloadJobResultRo extends AssetDisposeJobController {

    @Param
    public String jobId;

   static {
      DenpendencesProcessor.roDendenpence(AssetDisposeJobControllerDownloadJobResultRo.class);
   }
}


