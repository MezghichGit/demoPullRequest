public class StockService {
    @Autowired
    private StockRepository stockRepository;
    
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }
