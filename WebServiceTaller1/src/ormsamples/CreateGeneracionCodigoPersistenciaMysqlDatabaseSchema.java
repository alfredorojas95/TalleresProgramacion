/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateGeneracionCodigoPersistenciaMysqlDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(orm.GeneracionCodigoPersistenciaMysqlPersistentManager.instance());
			orm.GeneracionCodigoPersistenciaMysqlPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
