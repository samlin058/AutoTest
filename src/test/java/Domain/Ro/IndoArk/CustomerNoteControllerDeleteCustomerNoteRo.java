package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.CustomerNoteController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class CustomerNoteControllerDeleteCustomerNoteRo extends CustomerNoteController {

    @Param
    public String id;
    @Param
    public String nodeId;

   static {
      DenpendencesProcessor.roDendenpence(CustomerNoteControllerDeleteCustomerNoteRo.class);
   }
}


