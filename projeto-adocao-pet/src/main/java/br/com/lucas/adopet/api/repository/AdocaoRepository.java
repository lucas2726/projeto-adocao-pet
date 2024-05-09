package br.com.lucas.adopet.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucas.adopet.api.model.Adocao;
import br.com.lucas.adopet.api.model.StatusAdocao;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {

    boolean existsByPetIdAndStatus(Long idPet, StatusAdocao status);

}
