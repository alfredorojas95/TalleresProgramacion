/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateGeneracionCodigoPersistenciaMysqlData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.GeneracionCodigoPersistenciaMysqlPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
			// Initialize the properties of the persistent object here
			orm.ContactoDAO.save(lormContacto);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateGeneracionCodigoPersistenciaMysqlData createGeneracionCodigoPersistenciaMysqlData = new CreateGeneracionCodigoPersistenciaMysqlData();
			try {
				createGeneracionCodigoPersistenciaMysqlData.createTestData();
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
