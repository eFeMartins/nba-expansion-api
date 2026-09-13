package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Match;
import com.example.demo.repositories.MatchRepository;
import com.example.demo.services.exceptions.ResourceNotFoundException;

@Service
public class MatchService {
	@Autowired
	private MatchRepository repository;

	public List<Match> findAll() {
		if (repository.findAll() == null) {
			throw new ResourceNotFoundException("");
		}else {
			return repository.findAll();
		}
		
	}

	public Match findById(Long id) {
		
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(""));
	}
	
	/*
	 * Regra do Clone: Um time não pode jogar contra si mesmo.
	 *  Ao criar ou atualizar uma partida, o Serviço deve verificar se o homeTeam é diferente do awayTeam.
	 *   Se forem iguais, deve lançar uma exceção de validação.
	 */
	
	/*
	 * Regra de Status x Placar:
	 * Se a partida está com status SCHEDULED (Agendada),
	 *  os placares devem ser zero ou nulos.
	 *  
	 * Se a partida está com status FINISHED (Finalizada), 
	 *  os placares devem obrigatoriamente existir (não podem ser nulos).
	 */
	
	/*
	 * Regra do Empate (Específica de Basquete):
	 *  No basquete não existe empate final (o jogo vai para prorrogações até alguém ganhar). Logo, se o status for FINISHED,
	 *  o Serviço deve validar se homeScore é diferente de awayScore.
	 */
	
	/*
	 * Consultas Específicas:
	 * Buscar todas as partidas de um time específico (seja como mandante ou visitante).
	 * 
	 * Buscar partidas pelo status (ex: listar apenas os jogos de hoje que estão SCHEDULED). 
	 */
}
