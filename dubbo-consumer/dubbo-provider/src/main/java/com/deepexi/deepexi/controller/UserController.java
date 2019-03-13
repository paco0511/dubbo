package com.deepexi.deepexi.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.deepexi.deepexi.domain.eo.User;
import com.deepexi.deepexi.service.UserService;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;
@Service
@Path("/consume/v1/users")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference(url = "dubbo://localhost:20800",version = "${demo.service.version}")
     UserService userService;



    @POST
    @Path("/")
    public Payload create(@RequestBody User eo) {
        return new Payload(userService.create(eo));
    }


    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload delete(@PathParam("id") Integer  pk) {
        return new Payload(userService.delete(pk));
    }


    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload update(@PathParam("id") Integer  pk, User eo) {
        return new Payload(userService.update(pk, eo));
    }

    @GET
    @Path("/list")
    public Payload findAll(@BeanParam User eo) {
        return new Payload(userService.findAll(eo));
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload detail(@PathParam("id") Integer  pk) {
        return new Payload(userService.detail(pk));
    }





}
