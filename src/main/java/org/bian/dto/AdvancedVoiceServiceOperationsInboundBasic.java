package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AdvancedVoiceServiceOperationsInboundBasic
 */
public class AdvancedVoiceServiceOperationsInboundBasic   {
  private String vChannelDeviceReference = null;

  private String vChannelDevicePropertyValue = null;

  private String vChannelInboundConnectionStartTime = null;

  private String vChannelInboundConnectionDuration = null;

  private String vChannelInboundConnectionContactReference = null;

  private Object vChannelServiceSessionStatistics = null;


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

