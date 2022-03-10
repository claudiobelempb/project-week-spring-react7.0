package br.com.surb.dsmovie.shared.exeptions.resource;

import br.com.surb.dsmovie.shared.exeptions.service.AppEntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class AppResourceExceptionHandler {

  private static final long serialVersionUID = 1L;
  private final AppStandarError error = new AppStandarError();

  @ExceptionHandler(AppEntityNotFoundException.class)
  public ResponseEntity<AppStandarError> entityNotFound(
    AppEntityNotFoundException e, HttpServletRequest request) {
    HttpStatus status = HttpStatus.NOT_FOUND;
    AppStandarError err = new AppStandarError();
    err.setTimestamp(Instant.now());
    err.setStatus(status.value());
    err.setError("Resource not found");
    err.setMessage(e.getMessage());
    err.setPath(request.getRequestURI());
    return ResponseEntity.status(status).body(err);
  }
}
