package br.com.lucas.adopet.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucas.adopet.api.model.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {

    boolean existsByTelefoneOrEmail(String telefone, String email);

}
