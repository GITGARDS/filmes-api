package movie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import movie.models.Tipo;
import movie.models.generico.ServicoGenerico;
import movie.repositorio.TipoRepositorio;

@Service
public class TipoService implements ServicoGenerico<Tipo> {

	@Autowired
	private TipoRepositorio repositorio;

	@Override
	public Tipo saveNew(Tipo t) {
		try {
			return this.repositorio.save(t);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Tipo saveUpate(Tipo t) {
		try {
			Tipo find = this.findOne(t.getId());
			return this.repositorio.save(find);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Tipo delete(Integer id) {
		try {
			Tipo find = this.findOne(id);
			this.repositorio.delete(find);
			return find;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Tipo> findAll() {
		try {
			List<Tipo> find = this.repositorio.findAll();
			return find;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Page<Tipo> findAllPg(Integer pgNumber, Integer pgSize, String pgSort) {
		try {
			Pageable pageable = null;
			if (null != pgSort) {
				pageable = PageRequest.of(pgNumber, pgSize, Sort.Direction.ASC, pgSort);
			} else {
				pageable = PageRequest.of(pgNumber, pgSize, Sort.Direction.ASC, "id");
			}
			return this.repositorio.findAll(pageable);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Tipo findOne(Integer id) {
		try {
			Tipo find = this.repositorio.findById(id).orElseThrow();
			return find;
		} catch (Exception e) {
			return null;
		}
	}

}
