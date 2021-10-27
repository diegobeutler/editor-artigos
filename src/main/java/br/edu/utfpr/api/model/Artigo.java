package br.edu.utfpr.api.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Artigo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String descricao;

        @Column(nullable = false)
        private String titulo;

        @Column(nullable = false)
        private String Subtítulo;

        @Column(nullable = false)
        private String palavrasChave;

        @Lob
        @Column(nullable = false)
        private String texto;

        @ManyToOne
        @JoinColumn(name = "id_categoria")
        private Categoria categoria;

}