package sn.ept.git.dic2.vente_velos_new.entities;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.vente_velos_new.entities.Categorie;
import sn.ept.git.dic2.vente_velos_new.entities.Marque;
import sn.ept.git.dic2.vente_velos_new.entities.Stock;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-12T22:13:09", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, Categorie> categorieId;
    public static volatile SingularAttribute<Produit, Short> anneeModel;
    public static volatile CollectionAttribute<Produit, Stock> stockCollection;
    public static volatile SingularAttribute<Produit, BigDecimal> prixDepart;
    public static volatile SingularAttribute<Produit, Marque> marqueId;
    public static volatile SingularAttribute<Produit, Integer> id;
    public static volatile SingularAttribute<Produit, String> nom;

}