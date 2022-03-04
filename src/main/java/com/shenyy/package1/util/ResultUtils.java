package com.shenyy.package1.util;

import com.shenyy.package1.bean.ResultWrapper;

public class ResultUtils {
    public static ResultWrapper<?> as(Object result, String code, String message) {
        ResultWrapper resultVO = new ResultWrapper();
        resultVO.setCode(code);
        resultVO.setResult(result);
        resultVO.setMessage(message);
        return resultVO;
    }

    public static ResultWrapper asSuccess(Object result) {
        return as(result, "0", "操作成功");
    }
}
