package Domain.Apis.IndoArk;
import Domain.Ro.IndoArk.AssignControllerManualRo;

import Domain.Ro.IndoArk.AssignControllerAssignImportRo;

import Domain.Ro.IndoArk.AssignControllerPreQueryRo;

import Domain.Ro.IndoArk.AssignControllerPreAssignByAgentRo;

import Domain.Ro.IndoArk.AssignControllerPreAssignByGroupRo;

import Domain.Ro.IndoArk.AssignControllerBatchClearRo;

import Domain.Ro.IndoArk.AssignControllerManualAssistRo;

import Domain.Ro.IndoArk.AssignControllerQueryRo;





import Domain.Ro.IndoArk.AssignControllerAssignFileFailDownloadRo;

import Domain.Ro.IndoArk.AssignControllerQueryExportRo;





import Domain.Ro.IndoArk.AssignControllerGetAssignRecordsRo;

import Domain.Ro.IndoArk.AssignControllerQueryClearRo;

import Service.Annotations.AnnotationLibrary.Mapping;
import Service.ApiCore.ApiBase;


public class AssignController extends ApiBase {

    @Mapping(sub_path = "/loan/assign/manual", requestType = "post" ,contentTpye = "application/json")
    public String manual (AssignControllerManualRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/assign/file", requestType = "post" ,contentTpye = "multipart/form-data")
    public String assignImport (AssignControllerAssignImportRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/assign/pre/query", requestType = "get" )
    public String preQuery (AssignControllerPreQueryRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/assign/pre/assignByAgent", requestType = "post" ,contentTpye = "application/json")
    public String preAssignByAgent (AssignControllerPreAssignByAgentRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/assign/pre/assignByGroup", requestType = "post" ,contentTpye = "application/json")
    public String preAssignByGroup (AssignControllerPreAssignByGroupRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/assign/clear", requestType = "post" ,contentTpye = "application/json")
    public String batchClear (AssignControllerBatchClearRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/assign/manualAssist", requestType = "post" ,contentTpye = "application/json")
    public String manualAssist (AssignControllerManualAssistRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/assign/query", requestType = "get" )
    public String query (AssignControllerQueryRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/assign/file/lastResult", requestType = "get" )
    public String assignFileLastResult() {
    return http();
    }


    @Mapping(sub_path = "/loan/assign/file/template", requestType = "get" )
    public String assignFileLastTemplate() {
    return http();
    }


    @Mapping(sub_path = "/loan/assign/file/failDownload", requestType = "get" )
    public String assignFileFailDownload (AssignControllerAssignFileFailDownloadRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/assign/query/export", requestType = "get" )
    public String queryExport (AssignControllerQueryExportRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/assign/agentGroup", requestType = "get" )
    public String queryAgentGroup() {
    return http();
    }


    @Mapping(sub_path = "/loan/assign/loanState", requestType = "get" )
    public String queryLoanState() {
    return http();
    }


    @Mapping(sub_path = "/loan/assign/{loanId}/records", requestType = "get" )
    public String getAssignRecords (AssignControllerGetAssignRecordsRo ro) {
    return http(ro);
    }

    @Mapping(sub_path = "/loan/assign/queryClear", requestType = "post" ,contentTpye = "application/json")
    public String queryClear (AssignControllerQueryClearRo ro) {
    return http(ro);
    }


}



