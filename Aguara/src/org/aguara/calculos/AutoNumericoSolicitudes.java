package org.aguara.calculos;

import javax.persistence.*;
import org.openxava.calculators.*;
import org.openxava.jpa.*;

public class AutoNumericoSolicitudes implements ICalculator{
//	private String clase="Productos";
	public Object calculate() throws Exception {
		Query query = XPersistence.getManager()
				.createQuery("select max(i.id)from Solicitudes i");
	//	"where i.year = :year");
//	query.setParameter("clase",clase);
		Integer lastNumber = (Integer)query.getSingleResult();
		return lastNumber == null?1:lastNumber + 1 ;				
	}	
}
