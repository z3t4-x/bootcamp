package com.nttdata.utils;

public final class Constantes {



	protected Constantes() {

	}

	/**
	 * constantes tipo cliente
	 * @author rmartiav
	 *
	 */
	public static final class tipoCliente{
		protected tipoCliente() {}


		public static final Long PERSONA_JURIDICA = 1L;


		public static final Long PERSONA_NATURAL = 2L;
	}


	/**
	 * constantes afirmación S "si" - "N" no
	 * @author rmartiav
	 *
	 */
	public static final class Afimarcion{
		protected Afimarcion() {}
		public static final String AFIRMACION_S = "S";

		public static final String AFIRMACION_N= "N";

	}

	/**
	 * tipo de operacion
	 * @author rmartiav
	 *
	 */
	public static final class TipoOperacion{
		protected TipoOperacion() {}

		public static final Long DEPOSITO= 5L;
		public static final Long RETIRO= 6L;
		public static final Long TRANSFERENCIAS_BANCARIAS= 7L;
		public static final Long PAGOS_CREDITOS= 8L;
		public static final Long PAGOS_TARJETA_CREDITO= 5L;
	}
	/**
	 * codigo tipo operación
	 * @author rmartiav
	 *
	 */
	public static final class CodigoTipoOperacion{
		protected CodigoTipoOperacion() {}

		public static final String DEPOSITO= "DP";
		public static final String RETIRO= "RT";
		public static final String TRANSFERENCIAS_BANCARIAS= "TB";
		public static final String PAGOS_CREDITOS= "PC";
		public static final String PAGOS_TARJETA_CREDITO= "PTC";
	}
	/**
	 * constantes para tipo de tarjeta {débito o crédit}
	 * @author rmartiav
	 *
	 */
	public static final class TipoTarjeta{
		protected TipoTarjeta() {}


		public static final String TARJETA_DEBITO= "TD";
		public static final String TARJETA_CREDITO= "TC";
	}
}
