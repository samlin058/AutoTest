package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.QueryControllerGetQueryAssignmentsBelongToMeRo;

import Domain.Ro.IndoArk.QueryControllerExportQueryAssignmentsBelongToMeRo;

import Domain.Ro.IndoArk.QueryControllerGetQueryAssignmentsAmountRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class QueryController extends ApiBase {

    @Mapping(sub_path = "/query/assignments/manager", requestType = "get" )
    public String getQueryAssignmentsBelongToMe (QueryControllerGetQueryAssignmentsBelongToMeRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/query/assignments/manager/export", requestType = "get" )
    public String exportQueryAssignmentsBelongToMe (QueryControllerExportQueryAssignmentsBelongToMeRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/query/assignments/manager/summary", requestType = "get" )
    public String getQueryAssignmentsAmount (QueryControllerGetQueryAssignmentsAmountRo ro) {
    return http(ro);
    }


}



