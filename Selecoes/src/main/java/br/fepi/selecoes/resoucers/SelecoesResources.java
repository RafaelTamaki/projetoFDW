package br.fepi.selecoes.resoucers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.selecoes.domain.Selecoes;
import br.fepi.selecoes.repository.SelecoesRepository;

@RequestMapping(value = "/selecoes")
@RestController
public class SelecoesResources {
	
	@Autowired
	private SelecoesRepository selecoesRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Selecoes> listar() {
		
		return selecoesRepository.findAll();
				}
				

	    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	    public Selecoes buscaId(@PathVariable ("id") Long id) {
	        return selecoesRepository.findById(id).orElse(null);

	    }

	    @RequestMapping(method = RequestMethod.POST)
	    public void inserir(@RequestBody Selecoes livro) {

	        selecoesRepository.save(livro);
	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	    public void deletar(@PathVariable("id") Long id) {

	        selecoesRepository.deleteById(id);

	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	    public void alterar(@RequestBody Selecoes livro, @PathVariable("id") Long id) {
	        livro.setId(id);
	        selecoesRepository.save(livro);

	    }

	}
	
	

