package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.AuthUserController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class AuthUserControllerQueryOneByAccountRo extends AuthUserController {

    @Param
    public String nickname;

   static {
      DenpendencesProcessor.roDendenpence(AuthUserControllerQueryOneByAccountRo.class);
   }
}


