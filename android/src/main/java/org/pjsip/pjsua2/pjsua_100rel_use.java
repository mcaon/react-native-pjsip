/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsua_100rel_use {
  public final static pjsua_100rel_use PJSUA_100REL_NOT_USED = new pjsua_100rel_use("PJSUA_100REL_NOT_USED");
  public final static pjsua_100rel_use PJSUA_100REL_MANDATORY = new pjsua_100rel_use("PJSUA_100REL_MANDATORY");
  public final static pjsua_100rel_use PJSUA_100REL_OPTIONAL = new pjsua_100rel_use("PJSUA_100REL_OPTIONAL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjsua_100rel_use swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjsua_100rel_use.class + " with value " + swigValue);
  }

  private pjsua_100rel_use(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjsua_100rel_use(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjsua_100rel_use(String swigName, pjsua_100rel_use swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjsua_100rel_use[] swigValues = { PJSUA_100REL_NOT_USED, PJSUA_100REL_MANDATORY, PJSUA_100REL_OPTIONAL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

