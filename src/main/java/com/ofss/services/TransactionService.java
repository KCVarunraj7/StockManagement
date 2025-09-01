package com.ofss.services;

import com.ofss.entity.Transaction;
import com.ofss.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> getTransactionById(Long id) {
        return transactionRepository.findById(id);
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(Long id, Transaction updatedTransaction) {
        return transactionRepository.findById(id).map(txn -> {
            txn.setCustomer(updatedTransaction.getCustomer());
            txn.setStock(updatedTransaction.getStock());
            txn.setTxnPrice(updatedTransaction.getTxnPrice());
            txn.setTxnType(updatedTransaction.getTxnType());
            txn.setQty(updatedTransaction.getQty());
            txn.setTxnDate(updatedTransaction.getTxnDate());
            return transactionRepository.save(txn);
        }).orElse(null);
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}
