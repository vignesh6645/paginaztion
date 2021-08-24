package com.example.pagination.baseresponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse <T>{


   String StatusCode;
   String StatusMsg;
    private T Data;
}
