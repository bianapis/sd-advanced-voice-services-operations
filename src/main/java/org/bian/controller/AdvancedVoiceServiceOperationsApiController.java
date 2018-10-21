/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class AdvancedVoiceServiceOperationsApiController {

	@Autowired
	AdvancedVoiceServiceOperationsApiService service;
	
	@BQ("inbounds")
	@Operate.ExecutePost
	public BianResponse<AdvancedVoiceServiceOperationsInboundComplete> executePostInbounds(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AdvancedVoiceServiceOperationsInboundBasic> bianRequest) {
		return BianResponse.forSuccess(service.executePostInbounds(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inbounds")
	@Operate.ExecutePut
	public BianResponse<AdvancedVoiceServiceOperationsInboundComplete> executePutInbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<AdvancedVoiceServiceOperationsInboundBasic> bianRequest) {
		return BianResponse.forSuccess(service.executePutInbounds(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbounds")
	@Operate.ExecutePost
	public BianResponse<AdvancedVoiceServiceOperationsOutboundComplete> executePostOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AdvancedVoiceServiceOperationsOutboundBasic> bianRequest) {
		return BianResponse.forSuccess(service.executePostOutbounds(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbounds")
	@Operate.ExecutePut
	public BianResponse<AdvancedVoiceServiceOperationsOutboundComplete> executePutOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<AdvancedVoiceServiceOperationsOutboundBasic> bianRequest) {
		return BianResponse.forSuccess(service.executePutOutbounds(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Record
	public BianResponse<AdvancedVoiceServiceOperationsRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AdvancedVoiceServiceOperationsRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("issues")
	@Operate.RequestPost
	public BianResponse<AdvancedVoiceServiceOperationsIssuesComplete> requestPostIssues(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AdvancedVoiceServiceOperationsIssuesBasic> bianRequest) {
		return BianResponse.forSuccess(service.requestPostIssues(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("issues")
	@Operate.RequestPut
	public BianResponse<AdvancedVoiceServiceOperationsIssuesComplete> requestPutIssues(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<AdvancedVoiceServiceOperationsIssuesBasic> bianRequest) {
		return BianResponse.forSuccess(service.requestPutIssues(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<AdvancedVoiceServiceOperationsConfiguration> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("inbounds")
	@Operate.Retrieve
	public BianResponse<AdvancedVoiceServiceOperationsInboundComplete> retrieveInbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInbounds(crReferenceId, bqReferenceId));
	}
	
	@BQ("issues")
	@Operate.Retrieve
	public BianResponse<AdvancedVoiceServiceOperationsIssuesComplete> retrieveIssues(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIssues(crReferenceId, bqReferenceId));
	}
	
	@BQ("outbounds")
	@Operate.Retrieve
	public BianResponse<AdvancedVoiceServiceOperationsOutboundComplete> retrieveOutbounds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOutbounds(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("reportings")
	@Operate.Retrieve
	public BianResponse<AdvancedVoiceServiceOperationsReportingComplete> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
}
