package Domain.Apis.BlackShark;

import Domain.Ro.BlackShark.BizDictControllerQueryRo;
import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class BizDictController extends ApiBase {

    @Mapping(sub_path = "/blackShark/bizDict/query", requestType = "get")
    public String query(BizDictControllerQueryRo ro) {
        return http(ro);
    }

}



