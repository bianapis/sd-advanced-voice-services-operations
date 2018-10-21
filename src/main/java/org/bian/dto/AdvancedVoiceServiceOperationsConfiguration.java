package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AdvancedVoiceServiceOperationsConfiguration
 */
public class AdvancedVoiceServiceOperationsConfiguration   {

  private String vChannelServiceReference = null;

  private String vChannelOperatingSessionReference = null;

  private String vChannelServiceConfigurationParameterType = null;

  private String vChannelServiceConfigurationParameter = null;

  private String vChannelCustomerMenuReference = null;

  private String vChannelCustomerMenuDefinition = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"E.g. security setting, menu options\" 
   * @return vChannelServiceConfigurationParameterType
  **/

  @JsonProperty("vChannelServiceConfigurationParameterType")
  public String getVChannelServiceConfigurationParameterType() {
    return vChannelServiceConfigurationParameterType;
  }

  public void setVChannelServiceConfigurationParameterType(String vChannelServiceConfigurationParameterType) {
    this.vChannelServiceConfigurationParameterType = vChannelServiceConfigurationParameterType;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return vChannelCustomerMenuReference
  **/

  @JsonProperty("vChannelCustomerMenuReference")
  public String getVChannelCustomerMenuReference() {
    return vChannelCustomerMenuReference;
  }

  public void setVChannelCustomerMenuReference(String vChannelCustomerMenuReference) {
    this.vChannelCustomerMenuReference = vChannelCustomerMenuReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"Lists the channel customer selection menu - selection is configurable\" 
   * @return vChannelCustomerMenuDefinition
  **/
  @JsonProperty("vChannelCustomerMenuDefinition")
  public String getVChannelCustomerMenuDefinition() {
    return vChannelCustomerMenuDefinition;
  }

  public void setVChannelCustomerMenuDefinition(String vChannelCustomerMenuDefinition) {
    this.vChannelCustomerMenuDefinition = vChannelCustomerMenuDefinition;
  }


}

