package com.uca.prog4.entidades;

import com.uca.prog4.entidades.Empleados;
import com.uca.prog4.entidades.Proveedores;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-12-28T19:22:13")
@StaticMetamodel(Paises.class)
public class Paises_ { 

    public static volatile CollectionAttribute<Paises, Empleados> empleadosCollection;
    public static volatile CollectionAttribute<Paises, Proveedores> proveedoresCollection;
    public static volatile SingularAttribute<Paises, String> nombre;
    public static volatile SingularAttribute<Paises, Integer> pais;

}