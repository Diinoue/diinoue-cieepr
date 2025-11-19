package diogo.ciee.cieepr.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "animais")

public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Toda vez que gerar um novo animal, faz um auto increment no ID
    private int id;

    private String nome;
    private String descricao;
    private Date datanasc;
    private String especie;
    private String habitat;
    private String paisorigem;

/* 
//Getters e setters
    // nome    
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
    // descricao
        public String getDescricao() {
            return descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    // datanasc
        public Date getDatanasc() {
            return datanasc;
        }
        public void setDatanasc(Date datanasc){
            this.datanasc = datanasc;
        }
    // especie
        public String getEspecie() {
            return especie;
        }
        public void setEspecie(String especie) {
            this.especie = especie;
        }
    // habitat
        public String getHabitat() {
            return habitat;
        }
        public void setHabitat(String habitat) {
            this.habitat = habitat;
        }
    // paisorigem
        public String getPaisorigem() {
            return paisorigem;
        }
        public void setPaisorigem(String paisorigem) {
            this.paisorigem = paisorigem;
        }
         */
}