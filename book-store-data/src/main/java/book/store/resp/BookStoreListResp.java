/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.store.resp;

import book.store.BaseServiceResponse;
import book.store.cons.BookData;
import book.store.enums.ServiceStatus;
import java.util.List;

/**
 *
 * @author joel
 */
public class BookStoreListResp extends BaseServiceResponse{
    private List<BookData> payload;

    public BookStoreListResp() {
    }

    
    public BookStoreListResp(List<BookData> payload) {
        this.payload = payload;
    }

    public BookStoreListResp(List<BookData> payload, ServiceStatus status, String mess) {
        super(status, mess);
        this.payload = payload;
    }   
    public BookStoreListResp(ServiceStatus status, String mess) {
        super(status, mess);
    }
    public BookStoreListResp(List<BookData> payload, ServiceStatus status) {
        super(status);
        this.payload = payload;
    }

    public BookStoreListResp(List<BookData> payload, String mess) {
        super(mess);
        this.payload = payload;
    }

    public List<BookData> getPayload() {
        return payload;
    }

    public void setPayload(List<BookData> payload) {
        this.payload = payload;
    }
    
    
}
