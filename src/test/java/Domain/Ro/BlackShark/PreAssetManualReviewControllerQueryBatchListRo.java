package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.PreAssetManualReviewController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;
import java.util.List;


@lombok.Data
public class PreAssetManualReviewControllerQueryBatchListRo extends PreAssetManualReviewController {

    @Body
    public Integer current;
    @Body
    public Integer pageSize;
    @Body
    public List<?> checkStatusList;

   static {
      DenpendencesProcessor.roDendenpence(PreAssetManualReviewControllerQueryBatchListRo.class);
   }
}


