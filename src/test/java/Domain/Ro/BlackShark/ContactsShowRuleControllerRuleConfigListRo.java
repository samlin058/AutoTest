package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.ContactsShowRuleController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class ContactsShowRuleControllerRuleConfigListRo extends ContactsShowRuleController {

    @Param
    public String[] ids;

   static {
      DenpendencesProcessor.roDendenpence(ContactsShowRuleControllerRuleConfigListRo.class);
   }
}


