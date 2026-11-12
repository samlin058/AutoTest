package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.WaMsgController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class WaMsgControllerGetWaZipFileRo extends WaMsgController {

    @Param
    public String loanId;

   static {
      DenpendencesProcessor.roDendenpence(WaMsgControllerGetWaZipFileRo.class);
   }
}


