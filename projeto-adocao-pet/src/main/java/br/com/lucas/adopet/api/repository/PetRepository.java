package br.com.lucas.adopet.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucas.adopet.api.model.Abrigo;
import br.com.lucas.adopet.api.model.Pet;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findAllByAdotadoFalse();

    List<Pet> findByAbrigo(Abrigo abrigo);
}
