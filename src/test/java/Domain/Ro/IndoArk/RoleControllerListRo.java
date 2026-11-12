package Domain.Ro.IndoArk;

import Domain.Apis.IndoArk.RoleController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class RoleControllerListRo extends RoleController {

    @Param
    public Integer current;
    @Param
    public Integer pageSize;
    @Param
    public String Code;
    @Param
    public String name;
    @Param
    public String status;

   static {
      DenpendencesProcessor.roDendenpence(RoleControllerListRo.class);
   }
}


