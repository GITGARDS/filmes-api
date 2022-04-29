package movie.models.generico;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ControllerGenerico<T> {

	@PostMapping(value = "/novo")
	ResponseEntity<T> saveNew(@RequestBody T t);

	@PutMapping(value = "/put/{id}")
	ResponseEntity<T> saveUpate(@PathVariable Integer id, @RequestBody T t);

	@DeleteMapping(value = "/delete/{id}")
	ResponseEntity<T> delete(@PathVariable Integer id);

	@GetMapping(value = "/findall")
	ResponseEntity<List<T>> findAll();

	@GetMapping(value = "/findallpg/{pgNumber}/{pgSize}")
	ResponseEntity<Page<T>> findAllPg(@PathVariable Integer pgNumber, @PathVariable Integer pgSize);
	
	@GetMapping(value = "/findallpg/{pgNumber}/{pgSize}/{pgSort}")
	ResponseEntity<Page<T>> findAllPg(@PathVariable Integer pgNumber, @PathVariable Integer pgSize,
			@PathVariable String pgSort);

	@GetMapping(value = "/findone/{id}")
	ResponseEntity<T> findone(@PathVariable Integer id);

}
