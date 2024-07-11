package Exception;

import com.springboot.creditcard.requestresponse.ApplicationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CreditCardExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApplicationResponse> handleException(Exception exception){
        ApplicationResponse res = new ApplicationResponse();
            res.setError(Boolean.TRUE);
            res.setErrorMsg("Internal Server Error");
            res.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            res.setResponse(null);
        return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
