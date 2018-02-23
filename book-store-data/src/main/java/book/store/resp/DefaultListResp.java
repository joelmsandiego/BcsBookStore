/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.store.resp;

import book.store.BaseServiceResponse;
import book.store.enums.ServiceStatus;
import java.util.List;

/**
 *
 * @author joel
 */
public class DefaultListResp<DATA> extends BaseServiceResponse {
    private List<Class> DATA;

    public DefaultListResp() {
    }

    public DefaultListResp(List<Class> DATA) {
        this.DATA = DATA;
    }
    public DefaultListResp( ServiceStatus status, String mess) {
        super(status, mess);
    }
    public DefaultListResp(List<Class> DATA, ServiceStatus status, String mess) {
        super(status, mess);
        this.DATA = DATA;
    }

    public DefaultListResp(List<Class> DATA, ServiceStatus status) {
        super(status);
        this.DATA = DATA;
    }

    public DefaultListResp(List<Class> DATA, String mess) {
        super(mess);
        this.DATA = DATA;
    }
    
    public List<Class> getDATA() {
        return DATA;
    }

    public void setDATA(List<Class> DATA) {
        this.DATA = DATA;
    }
    
}
