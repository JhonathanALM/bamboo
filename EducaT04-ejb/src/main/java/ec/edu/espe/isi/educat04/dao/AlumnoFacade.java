/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.isi.educat04.dao;

import ec.edu.espe.isi.educat04.model.Alumno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author CDK
 */
@Stateless
public class AlumnoFacade extends AbstractFacade<Alumno> {

    @PersistenceContext(unitName = "ec.edu.espe.isi.educat04_EducaT04-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlumnoFacade() {
        super(Alumno.class);
    }
    
}