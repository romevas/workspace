package br.com.integracao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.integracao.dao.ArtistaDAO;
import br.com.integracao.modelo.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {
	
	@Autowired
	private ArtistaDAO dao;
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> exibirTodos()
	{
		List<Artista> lista = (List<Artista>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/artista/{codigo}")
	public ResponseEntity<Artista> getArtista(@PathVariable int codigo)
	{
		Artista resposta = dao.findById(codigo).orElse(null);
		
		if (resposta == null) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(resposta);			
	}
	
	@PostMapping("/nacionalidade")
	public ResponseEntity<List<Artista>> logar(@RequestBody Artista objeto)
	{
		List<Artista> logado = dao.findAllByNacionalidade(objeto.getNacionalidade());
		
		if (logado == null) {
			return ResponseEntity.status(404).build();			
		}
		return ResponseEntity.ok(logado);			
	}
	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> gravar(@RequestBody Artista novo)
	{
		try
		{
			dao.save(novo);
			return ResponseEntity.ok(novo);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	

}
