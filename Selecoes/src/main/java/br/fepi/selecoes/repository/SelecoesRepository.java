package br.fepi.selecoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fepi.selecoes.domain.Selecoes;

public interface SelecoesRepository extends JpaRepository<Selecoes, Long>{

}
