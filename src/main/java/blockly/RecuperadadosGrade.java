package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class RecuperadadosGrade {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param nomealuno
	 * @param idadealuno
	 * @param nascialuno
	 * @return Var
	 */
	// recuperadadosGrade
	public static Var Executar(Var nomealuno, Var idadealuno, Var nascialuno) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
						nomealuno);
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("info"),
						idadealuno);
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
						nascialuno);
				return Var.VAR_NULL;
			}
		}.call();
	}

}
