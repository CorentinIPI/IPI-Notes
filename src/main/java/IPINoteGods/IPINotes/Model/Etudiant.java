package IPINoteGods.IPINotes.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Etudiant {
	
	@Id @GeneratedValue
	private Long id;	
	@Column(nullable =false)
	private String name;


	
}
