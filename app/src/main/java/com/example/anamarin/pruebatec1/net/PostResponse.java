package com.example.anamarin.pruebatec1.net;

/**
 * Created by Ana Marin on 23/07/2017.
 */

public class PostResponse extends SimpleResponse {

    private Long id;

    public PostResponse(boolean success) {
        super(success);
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

}
