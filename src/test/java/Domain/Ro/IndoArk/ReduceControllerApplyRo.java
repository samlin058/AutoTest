package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.ReduceController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;


@lombok.Data
public class ReduceControllerApplyRo extends ReduceController {

    @Body
    public String reduceContentType;
    @Body
    public Number remainingAmount;
    @Body
    public Integer totalInstallments;
    @Body
    public String attachments;
    @Body
    public Number reduceAmount;
    @Body
    public String reduceReasonType;
    @Body
    public String reduceReason;
    @Body
    public Integer loanId;

   static {
      DenpendencesProcessor.roDendenpence(ReduceControllerApplyRo.class);
   }
}


