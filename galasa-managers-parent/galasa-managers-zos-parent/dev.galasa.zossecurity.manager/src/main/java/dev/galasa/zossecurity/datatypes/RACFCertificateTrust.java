/*
 * Copyright contributors to the Galasa project
 */
package dev.galasa.zossecurity.datatypes;

public enum RACFCertificateTrust {
	/**
	 * Equivalent to RACDCERT ADD ... TRUST
	 */
	TRUST,
	/**
	 * Equivalent to RACDCERT ADD ... NOTRUST
	 */
	NOTRUST,
	/**
	 * Equivalent to RACDCERT ADD ... HIGHTRUST
	 */
	HIGHTRUST
}
