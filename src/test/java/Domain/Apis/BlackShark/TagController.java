package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.TagControllerDownloadTemplateRo;

import Domain.Ro.BlackShark.TagControllerTruncateEnumRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class TagController extends ApiBase {

    @Mapping(sub_path = "/blackShark/tag/downloadTemplate", requestType = "get" )
    public String downloadTemplate (TagControllerDownloadTemplateRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/tag/truncate", requestType = "post" ,contentTpye = "multipart/form-data")
    public String truncateEnum (TagControllerTruncateEnumRo ro) {
    return http(ro);
    }


}



