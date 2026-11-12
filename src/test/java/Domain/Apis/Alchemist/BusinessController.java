package Domain.Apis.Alchemist;


import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class BusinessController extends ApiBase {

    @Mapping(sub_path = "/business/coupon/list", requestType = "get" )
    public String retrieveAllCouponBusiness() {
    return http();
    }



}



