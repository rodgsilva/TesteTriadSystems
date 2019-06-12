package br.com.rodrigo.testetriadsystems.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.rodrigo.testetriadsystems.domain.Messages;
import br.com.rodrigo.testetriadsystems.domain.User;
import br.com.rodrigo.testetriadsystems.domain.dto.BotsMessageDTO;
import br.com.rodrigo.testetriadsystems.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User>list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<List<Void>> PostMessage(@RequestBody BotsMessageDTO objDto){
		
		Messages mess = service.fromDTO(objDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(mess.getId()).toUri();
		return ResponseEntity.created(uri).build();;
	}

}
