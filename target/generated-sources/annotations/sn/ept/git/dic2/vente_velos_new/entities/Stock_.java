package sn.ept.git.dic2.vente_velos_new.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.vente_velos_new.entities.Produit;
import sn.ept.git.dic2.vente_velos_new.entities.StockPK;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-12T22:13:09", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Stock.class)
public class Stock_ { 

    public static volatile SingularAttribute<Stock, Produit> produit;
    public static volatile SingularAttribute<Stock, StockPK> stockPK;
    public static volatile SingularAttribute<Stock, Integer> quantite;

}