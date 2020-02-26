package com.mall.utils.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ErrorController {


    private static final Logger LOG = LoggerFactory.getLogger(ErrorController.class);


    @ExceptionHandler(value = Exception.class)
    Object handleException(Exception e, HttpServletRequest request){
        LOG.error("url{},msg{}",request.getRequestURI(),e.getMessage());
        Map<String,Object> map = new HashMap<>();
        map.put("code",100);
        map.put("msg",e.getMessage());
        //map.put("msg","请求参数错误");
        return map;
    }

//        @ExceptionHandler(value = Exception.class)
//        Object handleException(Exception e, HttpServletRequest request){
//            Map<String,Object> map = new HashMap<>();
//                if (e instanceof ArithmeticException) {
//                    map.put("code",100);
//                    map.put("msg","请求参数错误");
//                } else if (e instanceof NullPointerException) {
//                    map.put("code",101);
//                    map.put("msg","空指针异常！");
//                }
//                return map;
//            }

    @ExceptionHandler(value = NullPointerException.class)
    Object handleNullPointerException(Exception e, HttpServletRequest request){
        LOG.error("url{},msg{}",request.getRequestURI(),e.getMessage());

        Map<String,Object> map = new HashMap<>();
        map.put("code",100);
        //map.put("msg",e.getMessage());
        map.put("msg","空指针异常");
        return map;
    }
}
