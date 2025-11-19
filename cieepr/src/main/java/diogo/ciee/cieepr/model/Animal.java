package diogo.ciee.cieepr.model;

import java.sql.Date;

public class Animal {
    private String nome;
    private String descricao;
    private Date datanasc;
    private String especie;
    private String habitat;
    private String paisorigem;

    public Animal () {}
        public Animal (String nome, String descricao, Date datanasc, String especie, String habitat, String paisorigem) {
            this.nome = nome;
            this.descricao = descricao;
            this.datanasc = datanasc;
            this.especie = especie;
            this.habitat = habitat;
            this.paisorigem = paisorigem;
        }

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
}