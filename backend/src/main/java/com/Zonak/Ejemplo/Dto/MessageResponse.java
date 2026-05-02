package com.Zonak.Ejemplo.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MessageResponse {

    private String message;

    public MessageResponse(String message){
        this.message = message;
    }
}
