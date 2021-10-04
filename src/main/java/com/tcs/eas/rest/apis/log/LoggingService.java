package com.tcs.eas.rest.apis.log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoggingService {
    
    void logRequest(HttpServletRequest httpServletRequest, Object body);
    
    void logResponse(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object body);
    
    void writeProcessLog(String httpMethod,String serviceName,String serviceMethod,Object object);
    
    void logError(String errorMessage); 
    
    void clearMDC(); 
    
}
