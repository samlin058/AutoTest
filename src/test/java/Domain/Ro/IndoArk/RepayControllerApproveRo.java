package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.RepayController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;
import java.util.List;


@lombok.Data
public class RepayControllerApproveRo extends RepayController {

    @Body
    public List<?> repayIdList;
    @Body
    public String status;

   static {
      DenpendencesProcessor.roDendenpence(RepayControllerApproveRo.class);
   }
}


