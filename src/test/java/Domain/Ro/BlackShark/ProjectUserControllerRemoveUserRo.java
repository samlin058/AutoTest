package Domain.Ro.BlackShark;

import Domain.Apis.BlackShark.ProjectUserController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Body;
import java.util.List;


@lombok.Data
public class ProjectUserControllerRemoveUserRo extends ProjectUserController {

    @Body
    public List<?> userList;
    @Body
    public List<?> projectCodeList;

   static {
      DenpendencesProcessor.roDendenpence(ProjectUserControllerRemoveUserRo.class);
   }

    public ProjectUserControllerRemoveUserRo(List<?> userList, List<?> projectCodeList) {
        this.userList = userList;
        this.projectCodeList = projectCodeList;
    }
}


