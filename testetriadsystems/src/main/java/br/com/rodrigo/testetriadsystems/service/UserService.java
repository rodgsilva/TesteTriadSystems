package br.com.rodrigo.testetriadsystems.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.TimeZone;
import java.util.Timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rodrigo.testetriadsystems.domain.Messages;
import br.com.rodrigo.testetriadsystems.domain.User;
import br.com.rodrigo.testetriadsystems.domain.dto.BotsMessageDTO;
import br.com.rodrigo.testetriadsystems.repository.MessagesRepository;
import br.com.rodrigo.testetriadsystems.repository.UserRepository;
import br.com.rodrigo.testetriadsystems.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private MessagesRepository messagesrRepo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User getUser(String id) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Optional<User> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		//List<Messages> message = new Messages(null,date.getTime(), obj, objDTO.getText());
				
		//messagesrRepo.save(objDTO);
		
	}
	
	public Messages postMessage(BotsMessageDTO bots) {
		
		
		messagesrRepo.save(message);
		return message;
		
	}
	
	public Messages fromDTO(BotsMessageDTO bots) {
		Date date = new Date();
		return new Messages(null, date,bots.getText());  
	}
}
