
import java.time.LocalDate;

public class Repas {
	
	private int numero;
	LocalDate date;
	
	public Repas(int numero, LocalDate date) {
		super();
		this.numero = numero;
		this.date = date;
		
	}
	
	get numero() {
	    return this.numero;
	  }

	set numero() {
    this.numero = numero;
  }
	
	
	
	

	
}
