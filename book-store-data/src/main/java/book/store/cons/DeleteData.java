/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.store.cons;

import java.math.BigInteger;

/**
 *
 * @author joel
 */
public class DeleteData {
    private BigInteger id;
    private String book;

    public DeleteData() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
    
    
}
