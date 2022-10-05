
/* First created by JCasGen Wed Sep 28 02:45:50 CST 2022 */
package org.apache.ctakes.drugner.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** The route determination for the Drug NER profile.
 * Updated by JCasGen Wed Sep 28 02:45:50 CST 2022
 * @generated */
public class RouteAnnotation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = RouteAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.drugner.type.RouteAnnotation");
 
  /** @generated */
  final Feature casFeat_intakeMethod;
  /** @generated */
  final int     casFeatCode_intakeMethod;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getIntakeMethod(int addr) {
        if (featOkTst && casFeat_intakeMethod == null)
      jcas.throwFeatMissing("intakeMethod", "org.apache.ctakes.drugner.type.RouteAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_intakeMethod);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIntakeMethod(int addr, String v) {
        if (featOkTst && casFeat_intakeMethod == null)
      jcas.throwFeatMissing("intakeMethod", "org.apache.ctakes.drugner.type.RouteAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_intakeMethod, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public RouteAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_intakeMethod = jcas.getRequiredFeatureDE(casType, "intakeMethod", "uima.cas.String", featOkTst);
    casFeatCode_intakeMethod  = (null == casFeat_intakeMethod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_intakeMethod).getCode();

  }
}



    