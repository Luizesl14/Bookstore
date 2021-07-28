package com.bs.bookstore.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Book implements Serializable {
     private  static  final long serialVersionUID = 1L;

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
     private String titulo;
     private String nome_autor;
     private String text;

     @ManyToOne
     @JoinColumn(name = "categoria_id")
     private  Categoria categoria;

     public Book() {
          super();
     }

     public Book(Integer id, String titulo, String nome_autor, String text, Categoria categoria) {
          super();
          this.id = id;
          this.titulo = titulo;
          this.nome_autor = nome_autor;
          this.text = text;
          this.categoria = categoria;
     }

     public Integer getId() {
          return id;
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public String getTitulo() {
          return titulo;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public String getNome_autor() {
          return nome_autor;
     }

     public void setNome_autor(String nome_autor) {
          this.nome_autor = nome_autor;
     }

     public String getText() {
          return text;
     }

     public void setText(String text) {
          this.text = text;
     }

     public Categoria getCategoria() {
          return categoria;
     }

     public void setCategoria(Categoria categoria) {
          this.categoria = categoria;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (!(o instanceof Book)) return false;
          Book book = (Book) o;
          return getId().equals(book.getId());
     }

     @Override
     public int hashCode() {
          return Objects.hash(getId());
     }
}
