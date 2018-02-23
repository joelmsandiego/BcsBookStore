/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.store.resp;

import book.store.BaseServiceResponse;
import book.store.cons.DeleteData;
import book.store.enums.ServiceStatus;

/**
 *
 * @author joel
 */
public class DefaultResp<DATA> extends BaseServiceResponse{
    private Class DATA;

    public DefaultResp() {
    }

    public DefaultResp(Class DATA) {
        this.DATA = DATA;
    }
    
    public DefaultResp(ServiceStatus status, String mess) {
        super(status, mess);
    }

    public DefaultResp(Class DATA, ServiceStatus status, String mess) {
        super(status, mess);
        this.DATA = DATA;
    }

    public DefaultResp(Class DATA, ServiceStatus status) {
        super(status);
        this.DATA = DATA;
    }

    public DefaultResp(Class DATA, String mess) {
        super(mess);
        this.DATA = DATA;
    }

    public DefaultResp(DeleteData data, ServiceStatus serviceStatus, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Class getDATA() {
        return DATA;
    }

    public void setDATA(Class DATA) {
        this.DATA = DATA;
    }
    
}
