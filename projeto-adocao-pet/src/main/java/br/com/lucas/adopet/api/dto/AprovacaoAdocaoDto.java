package br.com.lucas.adopet.api.dto;

import jakarta.validation.constraints.NotNull;

public record AprovacaoAdocaoDto(@NotNull Long idAdocao) {
}
