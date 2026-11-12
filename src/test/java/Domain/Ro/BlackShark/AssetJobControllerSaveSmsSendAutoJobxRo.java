package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.AssetJobController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;
import java.util.List;


@lombok.Data
public class AssetJobControllerSaveSmsSendAutoJobxRo extends AssetJobController {

    @Body
    public String period;
    @Body
    public Boolean ghFlag;
    @Body
    public List<?> pkgList;
    @Body
    public List<?> scheduleTimes;

   static {
      DenpendencesProcessor.roDendenpence(AssetJobControllerSaveSmsSendAutoJobxRo.class);
   }
}


