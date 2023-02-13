package sn.ept.git.dic2.vente_velos_new.entities;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sn.ept.git.dic2.vente_velos_new.entities.ArticleCommandePK;
import sn.ept.git.dic2.vente_velos_new.entities.Commande;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-12T22:13:09", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ArticleCommande.class)
public class ArticleCommande_ { 

    public static volatile SingularAttribute<ArticleCommande, Integer> produitId;
    public static volatile SingularAttribute<ArticleCommande, ArticleCommandePK> articleCommandePK;
    public static volatile SingularAttribute<ArticleCommande, BigDecimal> prixDepart;
    public static volatile SingularAttribute<ArticleCommande, BigDecimal> remise;
    public static volatile SingularAttribute<ArticleCommande, Commande> commande;
    public static volatile SingularAttribute<ArticleCommande, Integer> quantite;

}