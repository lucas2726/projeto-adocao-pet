package br.com.lucas.adopet.api.service;

public interface EmailService {

    void enviarEmail(String to, String subject, String message);

}
