package org.ihrm.common.exception;

import org.ihrm.common.entity.ResultCode;
import lombok.Getter;

@Getter
public class CommonException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = 2827957311793922163L;
  
  private ResultCode resultCode = ResultCode.SERVER_ERROR;

  public CommonException(){};


  public CommonException(ResultCode resultCode) {
    super(resultCode.message());
    this.resultCode = resultCode;
  };

}
