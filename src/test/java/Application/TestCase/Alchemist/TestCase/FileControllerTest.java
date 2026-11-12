package Application.TestCase.Alchemist.TestCase;


import Domain.Apis.Alchemist.FileController;
import Domain.Ro.Alchemist.FileControllerDownloadErrorRo;
import Domain.Ro.Alchemist.FileControllerDownloadFileRo;
import Domain.Ro.Alchemist.ImportLeadRo;
import Service.ApiCore.BaseTestCase;
import org.testng.annotations.Test;


public class FileControllerTest extends BaseTestCase {

    FileController fileController = new FileController();

    @Test
    public void importLead() {
        fileController.convert2RoAndRequest("",ImportLeadRo.class);
        assertContains("qqq", "fileController");
    }

    @Test
    public void downloadFile() {
        fileController.convert2RoAndRequest("", FileControllerDownloadFileRo.class);
    }
    @Test
    public void leadFileQuery() {
        fileController.leadFileQuery();
    }
    @Test
    public void downloadError() {
        fileController.convert2RoAndRequest("", FileControllerDownloadErrorRo.class);
    }

}



