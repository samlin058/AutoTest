package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.ImportFileControllerCheckRo;

import Domain.Ro.BlackShark.ImportFileControllerMergeRo;

import Domain.Ro.BlackShark.ImportFileControllerUploadRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class ImportFileController extends ApiBase {

    @Mapping(sub_path = "/blackShark/importFile/check", requestType = "post" ,contentTpye = "Application/json")
    public String check (ImportFileControllerCheckRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/importFile/merge", requestType = "post" ,contentTpye = "Application/json")
    public String merge (ImportFileControllerMergeRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/importFile/upload", requestType = "post" ,contentTpye = "multipart/form-data")
    public String upload (ImportFileControllerUploadRo ro) {
    return http(ro);
    }


}



