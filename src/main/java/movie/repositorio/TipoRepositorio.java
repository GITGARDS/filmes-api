package movie.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import movie.models.Tipo;

@Repository
public interface TipoRepositorio extends JpaRepository<Tipo, Integer> {

}
