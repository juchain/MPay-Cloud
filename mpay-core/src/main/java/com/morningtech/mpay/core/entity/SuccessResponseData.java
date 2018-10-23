package com.morningtech.mpay.core.entity;

/**
 * 请求成功的返回
 *
 * @author stylefeng
 * @Date 2018/1/4 22:38
 */
public class SuccessResponseData extends ResponseData {

    public SuccessResponseData() {
    }

    public SuccessResponseData(Object object) {
        super(true, DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_MESSAGE, object);
    }
    public SuccessResponseData(Object object, int total) {
        super(true, DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_MESSAGE, object, total);
    }
    public SuccessResponseData(Integer code, String message, Object object) {
        super(true, code, message, object);
    }
}
