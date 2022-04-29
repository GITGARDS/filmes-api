package movie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import movie.models.Tipo;
import movie.models.generico.ControllerGenerico;
import movie.services.TipoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({ "/api/movies/tipo" })
public class TipoController implements ControllerGenerico<Tipo> {

	@Autowired
	private TipoService service;

	@Override
	public ResponseEntity<Tipo> saveNew(Tipo t) {
		Tipo resp = null;
		try {
			resp = this.service.saveNew(t);
			return new ResponseEntity<Tipo>(resp, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Tipo>(resp, HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@Override
	public ResponseEntity<Tipo> saveUpate(Integer id, Tipo t) {
		Tipo resp = null;
		try {
			resp = this.service.saveNew(t);
			return new ResponseEntity<Tipo>(resp, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Tipo>(resp, HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@Override
	public ResponseEntity<Tipo> delete(Integer id) {
		Tipo resp = null;
		try {
			resp = this.service.delete(id);
			return new ResponseEntity<Tipo>(resp, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Tipo>(resp, HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@Override
	public ResponseEntity<List<Tipo>> findAll() {
		List<Tipo> resp = null;
		try {
			resp = this.service.findAll();
			return new ResponseEntity<List<Tipo>>(resp, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Tipo>>(resp, HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@Override
	public ResponseEntity<Page<Tipo>> findAllPg(Integer pgNumber, Integer pgSize) {
		Page<Tipo> resp = null;
		try {
			resp = this.service.findAllPg(pgNumber, pgSize, null);
			return new ResponseEntity<Page<Tipo>>(resp, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Page<Tipo>>(resp, HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@Override
	public ResponseEntity<Page<Tipo>> findAllPg(Integer pgNumber, Integer pgSize, String pgSort) {
		Page<Tipo> resp = null;
		try {
			resp = this.service.findAllPg(pgNumber, pgSize, pgSort);
			return new ResponseEntity<Page<Tipo>>(resp, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Page<Tipo>>(resp, HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@Override
	public ResponseEntity<Tipo> findone(Integer id) {
		Tipo resp = null;
		try {
			resp = this.service.findOne(id);
			return new ResponseEntity<Tipo>(resp, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Tipo>(resp, HttpStatus.NOT_ACCEPTABLE);
		}
	}

}
