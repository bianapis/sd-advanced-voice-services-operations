/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class AdvancedVoiceServiceOperationsApiServiceImpl implements AdvancedVoiceServiceOperationsApiService {

	public AdvancedVoiceServiceOperationsInboundComplete executePostInbounds(String crReferenceId, AdvancedVoiceServiceOperationsInboundBasic request){
		return JsonReader.read("executePost-AdvancedVoiceServiceOperationsInboundComplete.json",new TypeReference<AdvancedVoiceServiceOperationsInboundComplete>(){});
	}
	
	public AdvancedVoiceServiceOperationsInboundComplete executePutInbounds(String crReferenceId, String bqReferenceId, AdvancedVoiceServiceOperationsInboundBasic request){
		return JsonReader.read("executePut-AdvancedVoiceServiceOperationsInboundComplete.json",new TypeReference<AdvancedVoiceServiceOperationsInboundComplete>(){});
	}
	
	public AdvancedVoiceServiceOperationsOutboundComplete executePostOutbounds(String crReferenceId, AdvancedVoiceServiceOperationsOutboundBasic request){
		return JsonReader.read("executePost-AdvancedVoiceServiceOperationsOutboundComplete.json",new TypeReference<AdvancedVoiceServiceOperationsOutboundComplete>(){});
	}
	
	public AdvancedVoiceServiceOperationsOutboundComplete executePutOutbounds(String crReferenceId, String bqReferenceId, AdvancedVoiceServiceOperationsOutboundBasic request){
		return JsonReader.read("executePut-AdvancedVoiceServiceOperationsOutboundComplete.json",new TypeReference<AdvancedVoiceServiceOperationsOutboundComplete>(){});
	}
	
	public AdvancedVoiceServiceOperationsRecordResponse record(String crReferenceId, AdvancedVoiceServiceOperationsRecordRequest request){
		return JsonReader.read("record-AdvancedVoiceServiceOperationsRecordResponse.json",new TypeReference<AdvancedVoiceServiceOperationsRecordResponse>(){});
	}
	
	public AdvancedVoiceServiceOperationsIssuesComplete requestPostIssues(String crReferenceId, AdvancedVoiceServiceOperationsIssuesBasic request){
		return JsonReader.read("requestPost-AdvancedVoiceServiceOperationsIssuesComplete.json",new TypeReference<AdvancedVoiceServiceOperationsIssuesComplete>(){});
	}
	
	public AdvancedVoiceServiceOperationsIssuesComplete requestPutIssues(String crReferenceId, String bqReferenceId, AdvancedVoiceServiceOperationsIssuesBasic request){
		return JsonReader.read("requestPut-AdvancedVoiceServiceOperationsIssuesComplete.json",new TypeReference<AdvancedVoiceServiceOperationsIssuesComplete>(){});
	}
	
	public AdvancedVoiceServiceOperationsConfiguration retrieve(String crReferenceId){
		return JsonReader.read("retrieve-AdvancedVoiceServiceOperationsConfiguration.json",new TypeReference<AdvancedVoiceServiceOperationsConfiguration>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public AdvancedVoiceServiceOperationsInboundComplete retrieveInbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AdvancedVoiceServiceOperationsInboundComplete.json",new TypeReference<AdvancedVoiceServiceOperationsInboundComplete>(){});
	}
	
	public AdvancedVoiceServiceOperationsIssuesComplete retrieveIssues(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AdvancedVoiceServiceOperationsIssuesComplete.json",new TypeReference<AdvancedVoiceServiceOperationsIssuesComplete>(){});
	}
	
	public AdvancedVoiceServiceOperationsOutboundComplete retrieveOutbounds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AdvancedVoiceServiceOperationsOutboundComplete.json",new TypeReference<AdvancedVoiceServiceOperationsOutboundComplete>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public AdvancedVoiceServiceOperationsReportingComplete retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AdvancedVoiceServiceOperationsReportingComplete.json",new TypeReference<AdvancedVoiceServiceOperationsReportingComplete>(){});
	}
	
}
