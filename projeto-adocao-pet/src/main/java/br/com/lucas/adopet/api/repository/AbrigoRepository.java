package br.com.lucas.adopet.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucas.adopet.api.model.Abrigo;

import java.util.Optional;

public interface AbrigoRepository extends JpaRepository<Abrigo, Long> {

    Optional<Abrigo> findByNome(String nome);

    boolean existsByNomeOrTelefoneOrEmail(String nome, String telefone, String email);

}
