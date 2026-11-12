package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.MessageControllerSendTidingsRo;



import Domain.Ro.IndoArk.MessageControllerTidingsPageRo;



import Domain.Ro.IndoArk.MessageControllerDealTidingsRo;

import Domain.Ro.IndoArk.MessageControllerDeleteTidingsRo;

import Domain.Ro.IndoArk.MessageControllerHasPushTidingsRo;





import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class MessageController extends ApiBase {

    @Mapping(sub_path = "/messages/send", requestType = "post" ,contentTpye = "application/json")
    public String sendTidings (MessageControllerSendTidingsRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/messages/lately", requestType = "get" )
    public String latelyTidings() {
    return http();
    }


    @Mapping(sub_path = "/messages/page", requestType = "get" )
    public String tidingsPage (MessageControllerTidingsPageRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/messages/deal/all", requestType = "post" )
    public String allDealTidings() {
    return http();
    }


    @Mapping(sub_path = "/messages/deal", requestType = "post" ,contentTpye = "application/json")
    public String dealTidings (MessageControllerDealTidingsRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/messages/delete", requestType = "post" ,contentTpye = "application/json")
    public String deleteTidings (MessageControllerDeleteTidingsRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/messages/hasPush", requestType = "post" ,contentTpye = "application/json")
    public String hasPushTidings (MessageControllerHasPushTidingsRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/messages/notice/long/poll", requestType = "get" )
    public String longPollNoticesTidings() {
    return http();
    }


    @Mapping(sub_path = "/messages/notice", requestType = "get" )
    public String noticesTidings() {
    return http();
    }



}



