package org.aguara.calculos;

import javax.persistence.*;
import org.openxava.calculators.*;
import org.openxava.jpa.*;
//public class AutoNumericoProductos implements ICalculator{
////	private String clase="Productos";
//	public Object calculate() throws Exception {
//		Query query = XPersistence.getManager()
//				.createQuery("select max(i.id)from Productos i");
//	//	"where i.year = :year");
////	query.setParameter("clase",clase);
//		Integer lastNumber = (Integer)query.getSingleResult();
//		return lastNumber == null?1:lastNumber + 1 ;				
//	}	
//}
public class AutoNumericoProductos 
	implements ICalculator {
//	private int year;
	public Object calculate() throws Exception {
		Query query = XPersistence.getManager()
				.createQuery("select max(i.id) from Productos i");// +
//				" where i.year = :year");
		Integer lastNumber = (Integer) query.getSingleResult();
		return lastNumber == null?1:lastNumber + 1;
	}
//	public int getYear() {
//		return year;
//	}
//	public void setYear(int year) {
//		this.year = year;
//	}
	
}