package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.RoleController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;


@lombok.Data
public class RoleControllerAssignedUserListRo extends RoleController {

    @Body
    public String Code;

   static {
      DenpendencesProcessor.roDendenpence(RoleControllerAssignedUserListRo.class);
   }
}


