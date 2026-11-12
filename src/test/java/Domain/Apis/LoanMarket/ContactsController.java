package Domain.Apis.LoanMarket;

import Domain.Ro.LoanMarket.ContactsControllerSaveContactsRo;
import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;

import java.util.List;


public class ContactsController extends ApiBase {

    @Mapping(sub_path = "/contacts/save", requestType = "post", contentTpye = "application/json")
    public String saveContacts(List<ContactsControllerSaveContactsRo> ro) {
        return http(ro);
    }


}



