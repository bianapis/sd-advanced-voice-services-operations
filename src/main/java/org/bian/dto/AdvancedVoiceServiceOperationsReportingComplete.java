package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
  
/**
 * AdvancedVoiceServiceOperationsReportingComplete
 */
public class AdvancedVoiceServiceOperationsReportingComplete   {
  private String vChannelOperatingSessionReference = null;

  private String vChannelServiceReportReference = null;

  private String vChannelServiceSessionReportType = null;

  private Object vChannelServiceSessionStatistics = null;

  private String vChannelServiceConfigurationParameter = null;

  private Object vChannelServiceSessionReport = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: \"Refers to active service session\" 
   * @return vChannelOperatingSessionReference
  **/
  @JsonProperty("vChannelOperatingSessionReference")
  public String getVChannelOperatingSessionReference() {
    return vChannelOperatingSessionReference;
  }

  public void setVChannelOperatingSessionReference(String vChannelOperatingSessionReference) {
    this.vChannelOperatingSessionReference = vChannelOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: \"Refers to the service report\" 
   * @return vChannelServiceReportReference
  **/
  @JsonProperty("vChannelServiceReportReference")
  public String getVChannelServiceReportReference() {
    return vChannelServiceReportReference;
  }

  public void setVChannelServiceReportReference(String vChannelServiceReportReference) {
    this.vChannelServiceReportReference = vChannelServiceReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"E.g. real-time status, session statistics\" 
   * @return vChannelServiceSessionReportType
  **/
  @JsonProperty("vChannelServiceSessionReportType")
  public String getVChannelServiceSessionReportType() {
    return vChannelServiceSessionReportType;
  }

  public void setVChannelServiceSessionReportType(String vChannelServiceSessionReportType) {
    this.vChannelServiceSessionReportType = vChannelServiceSessionReportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"Maintained service activity statistics\" 
   * @return vChannelServiceSessionStatistics
  **/
  @JsonProperty("vChannelServiceSessionStatistics")
  public Object getVChannelServiceSessionStatistics() {
    return vChannelServiceSessionStatistics;
  }

  public void setVChannelServiceSessionStatistics(Object vChannelServiceSessionStatistics) {
    this.vChannelServiceSessionStatistics = vChannelServiceSessionStatistics;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"The setting/value for a service parameter\" 
   * @return vChannelServiceConfigurationParameter
  **/
  @JsonProperty("vChannelServiceConfigurationParameter")
  public String getVChannelServiceConfigurationParameter() {
    return vChannelServiceConfigurationParameter;
  }

  public void setVChannelServiceConfigurationParameter(String vChannelServiceConfigurationParameter) {
    this.vChannelServiceConfigurationParameter = vChannelServiceConfigurationParameter;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"The session activity report\" 
   * @return vChannelServiceSessionReport
  **/
  @JsonProperty("vChannelServiceSessionReport")
  public Object getVChannelServiceSessionReport() {
    return vChannelServiceSessionReport;
  }

  public void setVChannelServiceSessionReport(Object vChannelServiceSessionReport) {
    this.vChannelServiceSessionReport = vChannelServiceSessionReport;
  }


}

