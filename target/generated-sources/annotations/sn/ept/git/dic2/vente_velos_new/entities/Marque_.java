package sn.ept.git.dic2.vente_velos_new.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.vente_velos_new.entities.Produit;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-12T22:13:09", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Marque.class)
public class Marque_ { 

    public static volatile CollectionAttribute<Marque, Produit> produitCollection;
    public static volatile SingularAttribute<Marque, Integer> id;
    public static volatile SingularAttribute<Marque, String> nom;

}