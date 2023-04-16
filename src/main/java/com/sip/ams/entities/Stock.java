import javax.persistence.*;

@Entity
@Table(name = "stock")
public class Stock {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "symbol")
   private String symbol;

   @Column(name = "name")
   private String name;

   @Column(name = "price")
   private double price;

   // constructors, getters, and setters
}