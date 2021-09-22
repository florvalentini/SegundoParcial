package entities;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Builder
public class Domicilio extends Base{

	

	@Column(name = "calle")
	private String calle;
	
	@Column(name = "numero")
	private int numero;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_localidad")
	private Localidad localidad;
}
