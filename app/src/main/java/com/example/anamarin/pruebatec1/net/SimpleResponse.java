package com.example.anamarin.pruebatec1.net;

/**
 * Created by Ana Marin on 23/07/2017.
 */

public class SimpleResponse {

    boolean success;

    public SimpleResponse(boolean success){
        this.success = success;
    }

    public boolean isSuccess(){
        return success;
    }

    public void setSuccess(boolean success){
        this.success = success;
    }
}
