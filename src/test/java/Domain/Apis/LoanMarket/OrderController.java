package Domain.Apis.LoanMarket;

import Domain.Ro.LoanMarket.OrderControllerCardReconfirmRo;
import Domain.Ro.LoanMarket.OrderControllerCreateRo;

import Domain.Ro.LoanMarket.OrderControllerMyListRo;


import Domain.Ro.LoanMarket.OrderControllerDetailRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class OrderController extends ApiBase {

    /**
     * 借款申请
     */
    @Mapping(sub_path = "/order/create", requestType = "post", contentTpye = "application/json")
    public String create(OrderControllerCreateRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/order/my-list", requestType = "get")
    public String myList(OrderControllerMyListRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/order/transit-order", requestType = "get")
    public String transitOrder() {
        return http();
    }

    /**
     * 借款订单查询
     */
    @Mapping(sub_path = "/order/detail", requestType = "get")
    public String detail(OrderControllerDetailRo ro) {
        return http(ro);
    }

    @Mapping(sub_path = "/order/create/card-reconfirm", requestType = "post", contentTpye = "application/json")
    public String cardReconfirm(OrderControllerCardReconfirmRo ro) {
        return http(ro);
    }
}



