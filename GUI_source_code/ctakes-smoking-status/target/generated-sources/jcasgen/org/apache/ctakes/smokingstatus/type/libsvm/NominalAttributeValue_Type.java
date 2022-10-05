
/* First created by JCasGen Wed Sep 28 02:46:17 CST 2022 */
package org.apache.ctakes.smokingstatus.type.libsvm;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Wed Sep 28 02:46:17 CST 2022
 * @generated */
public class NominalAttributeValue_Type extends AttributeValue_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NominalAttributeValue.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.smokingstatus.type.libsvm.NominalAttributeValue");
 
  /** @generated */
  final Feature casFeat_nominalValue;
  /** @generated */
  final int     casFeatCode_nominalValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNominalValue(int addr) {
        if (featOkTst && casFeat_nominalValue == null)
      jcas.throwFeatMissing("nominalValue", "org.apache.ctakes.smokingstatus.type.libsvm.NominalAttributeValue");
    return ll_cas.ll_getStringValue(addr, casFeatCode_nominalValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNominalValue(int addr, String v) {
        if (featOkTst && casFeat_nominalValue == null)
      jcas.throwFeatMissing("nominalValue", "org.apache.ctakes.smokingstatus.type.libsvm.NominalAttributeValue");
    ll_cas.ll_setStringValue(addr, casFeatCode_nominalValue, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NominalAttributeValue_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_nominalValue = jcas.getRequiredFeatureDE(casType, "nominalValue", "uima.cas.String", featOkTst);
    casFeatCode_nominalValue  = (null == casFeat_nominalValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nominalValue).getCode();

  }
}



    