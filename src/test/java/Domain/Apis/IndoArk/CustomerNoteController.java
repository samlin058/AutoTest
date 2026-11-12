package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.CustomerNoteControllerInsertCustomerNoteRo;

import Domain.Ro.IndoArk.CustomerNoteControllerUpdateCustomerNoteRo;







import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class CustomerNoteController extends ApiBase {

    @Mapping(sub_path = "/loan/dispose/{id}/notes", requestType = "post" ,contentTpye = "application/json")
    public String insertCustomerNote (CustomerNoteControllerInsertCustomerNoteRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/dispose/{id}/notes/{noteId}/update", requestType = "post" ,contentTpye = "application/json")
    public String updateCustomerNote (CustomerNoteControllerUpdateCustomerNoteRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/dispose/{id}/notes/{noteId}", requestType = "get" )
    public String getCustomerNote() {
    return http();
    }


    @Mapping(sub_path = "/loan/dispose/{id}/notes/{noteId}/stick/update", requestType = "post" )
    public String updateSortOfNote() {
    return http();
    }


    @Mapping(sub_path = "/loan/dispose/{id}/notes/{nodeId}/delete", requestType = "post" )
    public String deleteCustomerNote() {
    return http();
    }



}



