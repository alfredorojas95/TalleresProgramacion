/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteGeneracionCodigoPersistenciaMysqlData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.GeneracionCodigoPersistenciaMysqlPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Delete the persistent object
			orm.ContactoDAO.delete(lormContacto);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteGeneracionCodigoPersistenciaMysqlData deleteGeneracionCodigoPersistenciaMysqlData = new DeleteGeneracionCodigoPersistenciaMysqlData();
			try {
				deleteGeneracionCodigoPersistenciaMysqlData.deleteTestData();
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
