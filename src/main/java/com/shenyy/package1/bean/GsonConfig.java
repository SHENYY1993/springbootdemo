package com.shenyy.package1.bean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.lang.reflect.Modifier;

@Configuration
public class GsonConfig {
    @Bean
    GsonHttpMessageConverter gsonHttpMessageConverter(){
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        GsonBuilder builder = new GsonBuilder();

        //设置Gson解析日期的格式
        builder.setDateFormat("yyyy-MM-dd");
        //设置Gson解析时修饰符为protected的字段时过滤掉它
        builder.excludeFieldsWithModifiers(Modifier.PROTECTED);
        //创建Gson对象放入GsonHttpMessageConverter的实例并且返回converter
        Gson gson = new Gson();
        converter.setGson(gson);
        return converter;
    }
}
