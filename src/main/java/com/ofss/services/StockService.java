package com.ofss.services;

import com.ofss.entity.Stock;
import com.ofss.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Optional<Stock> getStockById(Long id) {
        return stockRepository.findById(id);
    }

    public Stock createStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public Stock updateStock(Long id, Stock updatedStock) {
        return stockRepository.findById(id).map(stock -> {
            stock.setStockName(updatedStock.getStockName());
            stock.setStockPrice(updatedStock.getStockPrice());
            stock.setStockVolume(updatedStock.getStockVolume());
            stock.setListingPrice(updatedStock.getListingPrice());
            stock.setListedDate(updatedStock.getListedDate());
            stock.setListedExchange(updatedStock.getListedExchange());
            return stockRepository.save(stock);
        }).orElse(null);
    }

    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }
}
