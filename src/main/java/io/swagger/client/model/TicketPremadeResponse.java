/*
 * ngDesk_Operations
 * ngDesk_Operations
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TicketPremadeResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T21:25:05.928Z")
public class TicketPremadeResponse {
  @SerializedName("TICKET_PREMADE_RESPONSE_ID")
  private Integer TICKET_PREMADE_RESPONSE_ID = null;

  @SerializedName("BODY")
  private String BODY = null;

  @SerializedName("TITLE")
  private String TITLE = null;

  @SerializedName("COMPANY_ID")
  private Integer COMPANY_ID = null;

  @SerializedName("USER_ID")
  private Integer USER_ID = null;

  public TicketPremadeResponse TICKET_PREMADE_RESPONSE_ID(Integer TICKET_PREMADE_RESPONSE_ID) {
    this.TICKET_PREMADE_RESPONSE_ID = TICKET_PREMADE_RESPONSE_ID;
    return this;
  }

   /**
   * Get TICKET_PREMADE_RESPONSE_ID
   * @return TICKET_PREMADE_RESPONSE_ID
  **/
  @ApiModelProperty(value = "")
  public Integer getTICKETPREMADERESPONSEID() {
    return TICKET_PREMADE_RESPONSE_ID;
  }

  public void setTICKETPREMADERESPONSEID(Integer TICKET_PREMADE_RESPONSE_ID) {
    this.TICKET_PREMADE_RESPONSE_ID = TICKET_PREMADE_RESPONSE_ID;
  }

  public TicketPremadeResponse BODY(String BODY) {
    this.BODY = BODY;
    return this;
  }

   /**
   * Get BODY
   * @return BODY
  **/
  @ApiModelProperty(value = "")
  public String getBODY() {
    return BODY;
  }

  public void setBODY(String BODY) {
    this.BODY = BODY;
  }

  public TicketPremadeResponse TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }

   /**
   * Get TITLE
   * @return TITLE
  **/
  @ApiModelProperty(value = "")
  public String getTITLE() {
    return TITLE;
  }

  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  public TicketPremadeResponse COMPANY_ID(Integer COMPANY_ID) {
    this.COMPANY_ID = COMPANY_ID;
    return this;
  }

   /**
   * Get COMPANY_ID
   * @return COMPANY_ID
  **/
  @ApiModelProperty(value = "")
  public Integer getCOMPANYID() {
    return COMPANY_ID;
  }

  public void setCOMPANYID(Integer COMPANY_ID) {
    this.COMPANY_ID = COMPANY_ID;
  }

  public TicketPremadeResponse USER_ID(Integer USER_ID) {
    this.USER_ID = USER_ID;
    return this;
  }

   /**
   * Get USER_ID
   * @return USER_ID
  **/
  @ApiModelProperty(value = "")
  public Integer getUSERID() {
    return USER_ID;
  }

  public void setUSERID(Integer USER_ID) {
    this.USER_ID = USER_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketPremadeResponse ticketPremadeResponse = (TicketPremadeResponse) o;
    return Objects.equals(this.TICKET_PREMADE_RESPONSE_ID, ticketPremadeResponse.TICKET_PREMADE_RESPONSE_ID) &&
        Objects.equals(this.BODY, ticketPremadeResponse.BODY) &&
        Objects.equals(this.TITLE, ticketPremadeResponse.TITLE) &&
        Objects.equals(this.COMPANY_ID, ticketPremadeResponse.COMPANY_ID) &&
        Objects.equals(this.USER_ID, ticketPremadeResponse.USER_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TICKET_PREMADE_RESPONSE_ID, BODY, TITLE, COMPANY_ID, USER_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketPremadeResponse {\n");
    
    sb.append("    TICKET_PREMADE_RESPONSE_ID: ").append(toIndentedString(TICKET_PREMADE_RESPONSE_ID)).append("\n");
    sb.append("    BODY: ").append(toIndentedString(BODY)).append("\n");
    sb.append("    TITLE: ").append(toIndentedString(TITLE)).append("\n");
    sb.append("    COMPANY_ID: ").append(toIndentedString(COMPANY_ID)).append("\n");
    sb.append("    USER_ID: ").append(toIndentedString(USER_ID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

