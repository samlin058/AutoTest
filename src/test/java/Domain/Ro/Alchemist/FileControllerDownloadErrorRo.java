package Domain.Ro.Alchemist;

import Domain.Apis.Alchemist.FileController;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;
import Service.Annotations.AnnotationLibrary.Param;


@lombok.Data
public class FileControllerDownloadErrorRo extends FileController {

    @Param
    public String taskId;
    @Param
    public String batchNo;

   static {
      DenpendencesProcessor.roDendenpence(FileControllerDownloadErrorRo.class);
   }
}


