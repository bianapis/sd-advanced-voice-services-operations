/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AdvancedVoiceServiceOperationsApiService {

	AdvancedVoiceServiceOperationsInboundComplete executePostInbounds(String crReferenceId, AdvancedVoiceServiceOperationsInboundBasic request);
	
	AdvancedVoiceServiceOperationsInboundComplete executePutInbounds(String crReferenceId, String bqReferenceId, AdvancedVoiceServiceOperationsInboundBasic request);
	
	AdvancedVoiceServiceOperationsOutboundComplete executePostOutbounds(String crReferenceId, AdvancedVoiceServiceOperationsOutboundBasic request);
	
	AdvancedVoiceServiceOperationsOutboundComplete executePutOutbounds(String crReferenceId, String bqReferenceId, AdvancedVoiceServiceOperationsOutboundBasic request);
	
	AdvancedVoiceServiceOperationsRecordResponse record(String crReferenceId, AdvancedVoiceServiceOperationsRecordRequest request);
	
	AdvancedVoiceServiceOperationsIssuesComplete requestPostIssues(String crReferenceId, AdvancedVoiceServiceOperationsIssuesBasic request);
	
	AdvancedVoiceServiceOperationsIssuesComplete requestPutIssues(String crReferenceId, String bqReferenceId, AdvancedVoiceServiceOperationsIssuesBasic request);
	
	AdvancedVoiceServiceOperationsConfiguration retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	AdvancedVoiceServiceOperationsInboundComplete retrieveInbounds(String crReferenceId, String bqReferenceId);
	
	AdvancedVoiceServiceOperationsIssuesComplete retrieveIssues(String crReferenceId, String bqReferenceId);
	
	AdvancedVoiceServiceOperationsOutboundComplete retrieveOutbounds(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	List<String> retrieveBQs();
	
	AdvancedVoiceServiceOperationsReportingComplete retrieveReportings(String crReferenceId, String bqReferenceId);
	
}
