/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateGeneracionCodigoPersistenciaMysqlData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.GeneracionCodigoPersistenciaMysqlPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ContactoDAO.save(lormContacto);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Contacto by ContactoCriteria");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormContactoCriteria.uid.eq();
		System.out.println(lormContactoCriteria.uniqueContacto());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateGeneracionCodigoPersistenciaMysqlData retrieveAndUpdateGeneracionCodigoPersistenciaMysqlData = new RetrieveAndUpdateGeneracionCodigoPersistenciaMysqlData();
			try {
				retrieveAndUpdateGeneracionCodigoPersistenciaMysqlData.retrieveAndUpdateTestData();
				//retrieveAndUpdateGeneracionCodigoPersistenciaMysqlData.retrieveByCriteria();
			}
			finally {
				orm.GeneracionCodigoPersistenciaMysqlPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
