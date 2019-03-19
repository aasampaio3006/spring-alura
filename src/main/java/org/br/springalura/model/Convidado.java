package org.br.springalura.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "listavip")
public class Convidado {
	
	@Id	
	private String id;
	
    private String nome;
    private String email;
    private String telefone;
    
    public Convidado() {}
    
	public Convidado(String nome, String email, String telefone) {		
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
    
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
    
}
