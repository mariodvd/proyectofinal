package com.uca.prog4.entidades;

import com.uca.prog4.entidades.Empleados;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-12-28T19:22:13")
@StaticMetamodel(Areas.class)
public class Areas_ { 

    public static volatile SingularAttribute<Areas, Integer> area;
    public static volatile CollectionAttribute<Areas, Empleados> empleadosCollection;
    public static volatile SingularAttribute<Areas, String> nombre;

}