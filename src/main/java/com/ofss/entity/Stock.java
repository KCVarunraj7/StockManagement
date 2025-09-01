package com.ofss.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "STOCKS")
public class Stock {

    @Id
    @Column(name = "STOCK_ID", nullable = false)
    private Long stockId;

    @Column(name = "STOCK_NAME", nullable = false, length = 100)
    private String stockName;

    @Column(name = "STOCK_PRICE", nullable = false, precision = 10, scale = 2)
    private BigDecimal stockPrice;

    @Column(name = "STOCK_VOLUME", nullable = false)
    private Integer stockVolume;

    @Column(name = "LISTING_PRICE", nullable = false, precision = 10, scale = 2)
    private BigDecimal listingPrice;

    @Temporal(TemporalType.DATE)
    @Column(name = "LISTED_DATE", nullable = false)
    private Date listedDate;

    @Column(name = "LISTED_EXCHANGE", nullable = false, length = 10)
    private String listedExchange;

    // Getters and Setters

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public BigDecimal getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(BigDecimal stockPrice) {
        this.stockPrice = stockPrice;
    }

    public Integer getStockVolume() {
        return stockVolume;
    }

    public void setStockVolume(Integer stockVolume) {
        this.stockVolume = stockVolume;
    }

    public BigDecimal getListingPrice() {
        return listingPrice;
    }

    public void setListingPrice(BigDecimal listingPrice) {
        this.listingPrice = listingPrice;
    }

    public Date getListedDate() {
        return listedDate;
    }

    public void setListedDate(Date listedDate) {
        this.listedDate = listedDate;
    }

    public String getListedExchange() {
        return listedExchange;
    }

    public void setListedExchange(String listedExchange) {
        this.listedExchange = listedExchange;
    }
}
