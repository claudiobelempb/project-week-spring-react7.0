package br.com.surb.dsmovie.shared.exeptions.resource;

import java.io.Serial;
import java.io.Serializable;

public class AppFieldMessage implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private String fieldName;
  private String message;

  public AppFieldMessage(){}

  public AppFieldMessage(String fieldName, String message) {
    super();
    this.fieldName = fieldName;
    this.message = message;
  }

  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
