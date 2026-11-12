package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.AutoOutboundController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AutoOutboundControllerPageListRo extends AutoOutboundController {

    @Param
    public String pgkId;
    @Param
    public String campCode;
    @Param
    public String batchStatusCode;
    @Param
    public String startTimeBegin;
    @Param
    public String startTimeEnd;
    @Param
    public String current;
    @Param
    public String pageSize;

   static {
      DenpendencesProcessor.roDendenpence(AutoOutboundControllerPageListRo.class);
   }
}


