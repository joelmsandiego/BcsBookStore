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
public class BookData extends AutditedData{
    private BigInteger bookId;
    private String bookTittle;
    private String bookAuthor;
    private String bookGenre;
    private double price;

    public BookData() {
    }

    public BigInteger getBookId() {
        return bookId;
    }

    public void setBookId(BigInteger bookId) {
        this.bookId = bookId;
    }

    public String getBookTittle() {
        return bookTittle;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTittle = bookTittle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
