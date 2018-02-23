/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.store.cons;

/**
 *
 * @author joel
 */
public class AutditedData {
    private String createdBy;
    private String createdDate;
    private String lastModBy;
    private String lastModDate;

    public AutditedData() {
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModBy() {
        return lastModBy;
    }

    public void setLastModBy(String lastModBy) {
        this.lastModBy = lastModBy;
    }

    public String getLastModDate() {
        return lastModDate;
    }

    public void setLastModDate(String lastModDate) {
        this.lastModDate = lastModDate;
    }
    
    
}
