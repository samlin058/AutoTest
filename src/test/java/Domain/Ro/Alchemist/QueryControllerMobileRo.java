package Domain.Ro.Alchemist;

import Domain.Apis.Alchemist.QueryController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class QueryControllerMobileRo extends QueryController {

    @Param
    public String leadId;

   static {
      DenpendencesProcessor.roDendenpence(QueryControllerMobileRo.class);
   }
}


