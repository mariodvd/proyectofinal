package com.uca.prog4.entidades;

import com.uca.prog4.entidades.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-12-28T19:22:13")
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile SingularAttribute<Categorias, Integer> categoria;
    public static volatile CollectionAttribute<Categorias, Productos> productosCollection;
    public static volatile SingularAttribute<Categorias, String> nombre;

}