package movie.models.generico;

import java.util.List;

import org.springframework.data.domain.Page;

public interface ServicoGenerico<T> {

	
	T saveNew(T t);

	T saveUpate(T t);

	T delete(Integer id);

	List<T> findAll();
	
	Page<T> findAllPg(Integer pgNumber, Integer pgSize, String pgSort);

	T findOne(Integer id);

}
