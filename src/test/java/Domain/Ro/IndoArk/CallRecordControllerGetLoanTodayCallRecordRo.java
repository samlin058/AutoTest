package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.CallRecordController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class CallRecordControllerGetLoanTodayCallRecordRo extends CallRecordController {

    @Param
    public String loanId;

   static {
      DenpendencesProcessor.roDendenpence(CallRecordControllerGetLoanTodayCallRecordRo.class);
   }
}


