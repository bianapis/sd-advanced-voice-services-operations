package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AdvancedVoiceServiceOperationsInboundComplete
 */
public class AdvancedVoiceServiceOperationsInboundComplete   {
  private String vChannelServiceReference = null;

  private String vChannelOperatingSessionReference = null;

  private String vChannelInboundConnectionReference = null;

  private String vChannelDeviceReference = null;

  private String vChannelDevicePropertyValue = null;

  private String vChannelInboundConnectionStartTime = null;

  private String vChannelInboundConnectionDuration = null;

  private String vChannelInboundConnectionContactReference = null;

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
   * @return vChannelInboundConnectionReference
  **/
  @JsonProperty("vChannelInboundConnectionReference")
  public String getVChannelInboundConnectionReference() {
    return vChannelInboundConnectionReference;
  }

  public void setVChannelInboundConnectionReference(String vChannelInboundConnectionReference) {
    this.vChannelInboundConnectionReference = vChannelInboundConnectionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: \"Device being used for access\" 
   * @return vChannelDeviceReference
  **/
  @JsonProperty("vChannelDeviceReference")
  public String getVChannelDeviceReference() {
    return vChannelDeviceReference;
  }

  public void setVChannelDeviceReference(String vChannelDeviceReference) {
    this.vChannelDeviceReference = vChannelDeviceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"Property of the device e.g. ANI phone number\" 
   * @return vChannelDevicePropertyValue
  **/
  @JsonProperty("vChannelDevicePropertyValue")
  public String getVChannelDevicePropertyValue() {
    return vChannelDevicePropertyValue;
  }

  public void setVChannelDevicePropertyValue(String vChannelDevicePropertyValue) {
    this.vChannelDevicePropertyValue = vChannelDevicePropertyValue;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return vChannelInboundConnectionStartTime
  **/
  @JsonProperty("vChannelInboundConnectionStartTime")
  public String getVChannelInboundConnectionStartTime() {
    return vChannelInboundConnectionStartTime;
  }

  public void setVChannelInboundConnectionStartTime(String vChannelInboundConnectionStartTime) {
    this.vChannelInboundConnectionStartTime = vChannelInboundConnectionStartTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration 
   * @return vChannelInboundConnectionDuration
  **/
  @JsonProperty("vChannelInboundConnectionDuration")
  public String getVChannelInboundConnectionDuration() {
    return vChannelInboundConnectionDuration;
  }

  public void setVChannelInboundConnectionDuration(String vChannelInboundConnectionDuration) {
    this.vChannelInboundConnectionDuration = vChannelInboundConnectionDuration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: \"Retuned by SD contact Handler for reference\" 
   * @return vChannelInboundConnectionContactReference
  **/
  @JsonProperty("vChannelInboundConnectionContactReference")
  public String getVChannelInboundConnectionContactReference() {
    return vChannelInboundConnectionContactReference;
  }

  public void setVChannelInboundConnectionContactReference(String vChannelInboundConnectionContactReference) {
    this.vChannelInboundConnectionContactReference = vChannelInboundConnectionContactReference;
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

