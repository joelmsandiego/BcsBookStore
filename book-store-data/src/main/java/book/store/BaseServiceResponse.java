/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.store;

import book.store.enums.ServiceStatus;

/**
 *
 * @author joel
 */
public class BaseServiceResponse {
    private ServiceStatus status;
    private String Message;

    public BaseServiceResponse() {
    }

    public ServiceStatus getStatus() {
        return status;
    }

    public void setStatus(ServiceStatus status) {
        this.status = status;
    }

    public String getMess() {
        return Message;
    }

    public void setMess(String mess) {
        this.Message = mess;
    }

    public BaseServiceResponse(ServiceStatus status, String mess) {
        this.status = status;
        this.Message = mess;
    }
    public BaseServiceResponse(ServiceStatus status) {
        this.status = status;
    }
    public BaseServiceResponse(String mess) {
        this.Message = mess;
    }
    
    
}
