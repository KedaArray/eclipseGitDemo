package org.ihrm.common.entity;

public enum ResultCode {
  SUCCESS(true,10000,"successful!"),
  FAIL(false,10001,"failed!"),
  UNAUTHENTICATED(false, 10002,"please login first!"),
  UNAUTHORISE(false, 10003, "have no authority!"),
  SERVER_ERROR(false, 99999,"sorry, server error, please try later");

  boolean success;
  Integer code;
  String message;
  
  public boolean success() {
    return success;
  }

  public int code() {
    return code;
  }

  public String message() {
    return message;
  }

  ResultCode(boolean success, int code, String message) {
    this.success = success;
    this.code = code;
    this.message = message;
  }
}
