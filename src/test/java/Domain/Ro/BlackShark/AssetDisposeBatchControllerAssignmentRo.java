package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.AssetDisposeBatchController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;
import java.util.List;


@lombok.Data
public class AssetDisposeBatchControllerAssignmentRo extends AssetDisposeBatchController {

    @Body
    public List<?> bizScope;
    @Body
    public List<?> assetIdList;
    @Body
    public String preAssetPkgId;
    @Body
    public String disposerId;

   static {
      DenpendencesProcessor.roDendenpence(AssetDisposeBatchControllerAssignmentRo.class);
   }
}


