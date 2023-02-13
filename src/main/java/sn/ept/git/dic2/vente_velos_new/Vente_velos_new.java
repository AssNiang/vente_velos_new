/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sn.ept.git.dic2.vente_velos_new;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author LENOVO
 */
public class Vente_velos_new {
    private static final String PU_NAME = "venteVelosPU";

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
        EntityManager em = emf.createEntityManager();
        
        em.close();
        emf.close();
    }
}
