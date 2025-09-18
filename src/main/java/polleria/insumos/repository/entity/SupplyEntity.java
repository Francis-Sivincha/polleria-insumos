package polleria.insumos.repository.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;

@Entity
@Table(name = "supply")
@NoArgsConstructor
@AllArgsConstructor
public class SupplyEntity {

	@With
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int supply_id;
	
	@Column(name = "sypply_name")
	private String supply_name;
	
	@Column(name = "sypply_stock")
	private String supply_stock;
	
	@Column(name = "expiration_date")
	private Date expiration_date;
	
}
