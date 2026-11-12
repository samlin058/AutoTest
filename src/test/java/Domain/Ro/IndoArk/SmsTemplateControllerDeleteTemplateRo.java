package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.SmsTemplateController;
import Service.Annotations.AnnotationLibrary.Param;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;


@lombok.Data
public class SmsTemplateControllerDeleteTemplateRo extends SmsTemplateController {

    @Param
    public Integer id;


   static {
      DenpendencesProcessor.roDendenpence(SmsTemplateControllerDeleteTemplateRo.class);
   }
}


