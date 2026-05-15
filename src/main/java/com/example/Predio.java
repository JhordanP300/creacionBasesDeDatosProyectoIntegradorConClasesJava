package com.example;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;



@Entity
@Table(name = "Predio")

public class Predio {

    @Id // Define la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental

    private Long idPredio; // Llave primaria
    private int codigoPredio;
    
    @jakarta.persistence.Enumerated(jakarta.persistence.EnumType.STRING)
    private TipoPredio tipoPredio;
    
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario propietario; // Llave foránea a Usuario

    public Predio() {} // Constructor vacío obligatorio para Hibernate

    public Predio(Long idPredio, int codigoPredio, TipoPredio tipoPredio, Usuario propietario) {
        this.idPredio = idPredio;
        this.codigoPredio = codigoPredio;
        this.tipoPredio = tipoPredio;
        this.propietario = propietario;
    }

    public Long getIdPredio() {
        return idPredio;
    }

    public TipoPredio getTipoPredio() {
        return tipoPredio;
    }

    public int getCodigoPredio() {
        return codigoPredio;
    }

    public Usuario getPropietario() {
        return propietario;
    }

}
