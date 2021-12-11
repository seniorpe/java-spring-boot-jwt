package senior.pe.jwt.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private RoleName name;
}