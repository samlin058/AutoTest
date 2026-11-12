package Domain.Apis.Alchemist;
import Domain.Ro.Alchemist.MarketResultControllerMarketResultImportRo;

import Domain.Ro.Alchemist.MarketResultControllerMarketResultImportStatusRo;

import Domain.Ro.Alchemist.MarketResultControllerCreditPassDetailRo;

import Domain.Ro.Alchemist.MarketResultControllerMarketResultDownloadRo;



import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class MarketResultController extends ApiBase {

    @Mapping(sub_path = "/market/result/import", requestType = "post" ,contentTpye = "multipart/form-data")
    public String marketResultImport (MarketResultControllerMarketResultImportRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/market/result//import/status", requestType = "get" )
    public String marketResultImportStatus (MarketResultControllerMarketResultImportStatusRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/market/result/credit/pass/detail", requestType = "get" )
    public String creditPassDetail (MarketResultControllerCreditPassDetailRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/market/result/download", requestType = "get" )
    public String marketResultDownload (MarketResultControllerMarketResultDownloadRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/market/result/download/template", requestType = "get" )
    public String downloadTemplate() {
    return http();
    }



}



