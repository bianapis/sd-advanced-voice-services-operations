package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AdvancedVoiceServiceOperationsOutboundComplete
 */
public class AdvancedVoiceServiceOperationsOutboundComplete   {
  private String vChannelServiceReference = null;

  private String vChannelOperatingSessionReference = null;

  private String vChannelOutboundConnectionReference = null;

  private String empolyeeBusinessUnitReference = null;

  private String customerContactRecordReference = null;

  private Object customerContactRecord = null;

  private String vChannelCustomerDeviceReference = null;

  private String vChannelOutboundConnectionStartTime = null;

  private String vChannelOutboundConnectionDuration = null;

  private Object vChannelServiceSessionStatistics = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: \"Refers to the service\" 
   * @return vChannelServiceReference
  **/
  @JsonProperty("vChannelServiceReference")
  public String getVChannelServiceReference() {
    return vChannelServiceReference;
  }

  public void setVChannelServiceReference(String vChannelServiceReference) {
    this.vChannelServiceReference = vChannelServiceReference;
  }


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: \"Refers to the inbound connection\" 
   * @return vChannelOutboundConnectionReference
  **/
  @JsonProperty("vChannelOutboundConnectionReference")
  public String getVChannelOutboundConnectionReference() {
    return vChannelOutboundConnectionReference;
  }

  public void setVChannelOutboundConnectionReference(String vChannelOutboundConnectionReference) {
    this.vChannelOutboundConnectionReference = vChannelOutboundConnectionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: \"Source of outbound contact\" 
   * @return empolyeeBusinessUnitReference
  **/

  public String getEmpolyeeBusinessUnitReference() {
    return empolyeeBusinessUnitReference;
  }

  public void setEmpolyeeBusinessUnitReference(String empolyeeBusinessUnitReference) {
    this.empolyeeBusinessUnitReference = empolyeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: \"Customer contact record accessing outbound channel\" 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"Contact details - see SD contact Handler for definition\" 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: \"Device being accessed\" 
   * @return vChannelCustomerDeviceReference
  **/
  @JsonProperty("vChannelCustomerDeviceReference")
  public String getVChannelCustomerDeviceReference() {
    return vChannelCustomerDeviceReference;
  }

  public void setVChannelCustomerDeviceReference(String vChannelCustomerDeviceReference) {
    this.vChannelCustomerDeviceReference = vChannelCustomerDeviceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return vChannelOutboundConnectionStartTime
  **/
  @JsonProperty("vChannelOutboundConnectionStartTime")
  public String getVChannelOutboundConnectionStartTime() {
    return vChannelOutboundConnectionStartTime;
  }

  public void setVChannelOutboundConnectionStartTime(String vChannelOutboundConnectionStartTime) {
    this.vChannelOutboundConnectionStartTime = vChannelOutboundConnectionStartTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration 
   * @return vChannelOutboundConnectionDuration
  **/
  @JsonProperty("vChannelOutboundConnectionDuration")
  public String getVChannelOutboundConnectionDuration() {
    return vChannelOutboundConnectionDuration;
  }

  public void setVChannelOutboundConnectionDuration(String vChannelOutboundConnectionDuration) {
    this.vChannelOutboundConnectionDuration = vChannelOutboundConnectionDuration;
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


}

