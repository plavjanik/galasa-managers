/*
* Copyright contributors to the Galasa project 
*/
package dev.galasa.sem;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Requests that SEM does not build the Complex, used if the test wants to 
 * build the CICS Regions itself
 * 
 * @author Michael Baylis
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface DoNotBuild {

}
