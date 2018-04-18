package ir.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")

public class TestService {
    @GET
    public String get(){
        System.out.println("test");
        return "salam";
    }
}
