package com.ykx.springclout.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2022/10/26.
 *
 * @author KaiXuan Yang
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    //404 not found
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code , String message){
        this(code , message , null);
    }

}
