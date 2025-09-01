package com.ofss.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "TRANSACTIONS")
public class Transaction {

    @Id
    @Column(name = "TXN_ID", nullable = false)
    private Long txnId;

    @ManyToOne
    @JoinColumn(name = "CUST_ID", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "STOCK_ID", nullable = false)
    private Stock stock;

    @Column(name = "TXN_PRICE", nullable = false, precision = 10, scale = 2)
    private BigDecimal txnPrice;

    @Column(name = "TXN_TYPE", length = 10)
    private String txnType;

    @Column(name = "QTY", nullable = false)
    private Integer qty;

    @Temporal(TemporalType.DATE)
    @Column(name = "TXN_DATE", nullable = false)
    private Date txnDate;

    // Getters and Setters
    public Long getTxnId() { return txnId; }
    public void setTxnId(Long txnId) { this.txnId = txnId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Stock getStock() { return stock; }
    public void setStock(Stock stock) { this.stock = stock; }

    public BigDecimal getTxnPrice() { return txnPrice; }
    public void setTxnPrice(BigDecimal txnPrice) { this.txnPrice = txnPrice; }

    public String getTxnType() { return txnType; }
    public void setTxnType(String txnType) { this.txnType = txnType; }

    public Integer getQty() { return qty; }
    public void setQty(Integer qty) { this.qty = qty; }

    public Date getTxnDate() { return txnDate; }
    public void setTxnDate(Date txnDate) { this.txnDate = txnDate; }
}
