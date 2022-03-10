package br.com.surb.dsmovie.shared.exeptions.service;

import java.io.Serial;
import java.io.Serializable;

public class AppEntityNotFoundException extends RuntimeException implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  public AppEntityNotFoundException(String message) {
    super(message);
  }
}
