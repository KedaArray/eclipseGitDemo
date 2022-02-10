package org.ihrm.common.exception;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.ihrm.common.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BaseExceptionHandler {
  @ResponseBody
  @ExceptionHandler(value = Exception.class)
  public Result error(HttpServletRequest request, HttpServletResponse response, Exception e)
      throws IOException {
    e.printStackTrace();
    if (e.getClass() == CommonException.class) {
      CommonException ce = (CommonException) e;
      return new Result(ce.getResultCode());
    } else {
      return Result.ERROR();
    }
  }
}
