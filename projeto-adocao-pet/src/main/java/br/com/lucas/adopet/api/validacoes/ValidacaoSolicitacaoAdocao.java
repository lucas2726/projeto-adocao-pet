package br.com.lucas.adopet.api.validacoes;

import br.com.lucas.adopet.api.dto.SolicitacaoAdocaoDto;

public interface ValidacaoSolicitacaoAdocao {

    void validar(SolicitacaoAdocaoDto dto);

}
