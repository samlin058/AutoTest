package Domain.Apis.BlackShark;
import Domain.Ro.BlackShark.ReceiptControllerRepayReceiptRo;

import Domain.Ro.BlackShark.ReceiptControllerRepaymentRateRankingRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class ReceiptController extends ApiBase {

    @Mapping(sub_path = "/blackShark/receipt", requestType = "get" )
    public String RepayReceipt (ReceiptControllerRepayReceiptRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/blackShark/receipt/repayment/ranking", requestType = "get" )
    public String repaymentRateRanking (ReceiptControllerRepaymentRateRankingRo ro) {
    return http(ro);
    }


}



