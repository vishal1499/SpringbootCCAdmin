package com.springboot.creditcard.requestresponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatusCode;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationResponse<T> {
    Boolean error;
    String errorMsg;
    HttpStatusCode status;
    T response;
}
