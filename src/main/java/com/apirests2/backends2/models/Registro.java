package com.apirests2.backends2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "registros")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Registro {
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)

private Long idregistro;
private String tipoCafe;
private String tiempoGerminacion;
private String tiempoSiembra;
private String tiempoFruto;
private String añosProducion;

}