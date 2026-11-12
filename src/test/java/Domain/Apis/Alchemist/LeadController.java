package Domain.Apis.Alchemist;

import Domain.Ro.Alchemist.getApplicationStatuesRo;
import Domain.Ro.Alchemist.LeadControllerCreateShortLinkRo;
import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class LeadController extends ApiBase {

    @Mapping(sub_path = "/leads/{leadId}/detail", requestType = "get")
    public String getApplicationStatues(getApplicationStatuesRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/leads/createShortLink", requestType = "post", contentTpye = "Application/json")
    public String createShortLink(LeadControllerCreateShortLinkRo ro) {
        return http(ro);
    }
}
