package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.BizDictController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class BizDictControllerQueryRo extends BizDictController {

    @Param
    public String dictType;

   static {
      DenpendencesProcessor.roDendenpence(BizDictControllerQueryRo.class);
   }
}


