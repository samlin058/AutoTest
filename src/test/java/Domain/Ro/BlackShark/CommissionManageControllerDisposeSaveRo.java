package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.CommissionManageController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;


@lombok.Data
public class CommissionManageControllerDisposeSaveRo extends CommissionManageController {

    @Body
    public String yearMonth;
    @Body
    public String disposeCode;
    @Body
    public Object commissionArithmetic;

   static {
      DenpendencesProcessor.roDendenpence(CommissionManageControllerDisposeSaveRo.class);
   }
}


