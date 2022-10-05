
/* First created by JCasGen Wed Sep 28 02:46:17 CST 2022 */
package org.apache.ctakes.smokingstatus.type.libsvm;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Corresponds to the ARFF numeric attributes.
 * Updated by JCasGen Wed Sep 28 02:46:17 CST 2022
 * @generated */
public class NumericAttributeValue_Type extends AttributeValue_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NumericAttributeValue.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.smokingstatus.type.libsvm.NumericAttributeValue");
 
  /** @generated */
  final Feature casFeat_numericValue;
  /** @generated */
  final int     casFeatCode_numericValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNumericValue(int addr) {
        if (featOkTst && casFeat_numericValue == null)
      jcas.throwFeatMissing("numericValue", "org.apache.ctakes.smokingstatus.type.libsvm.NumericAttributeValue");
    return ll_cas.ll_getStringValue(addr, casFeatCode_numericValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNumericValue(int addr, String v) {
        if (featOkTst && casFeat_numericValue == null)
      jcas.throwFeatMissing("numericValue", "org.apache.ctakes.smokingstatus.type.libsvm.NumericAttributeValue");
    ll_cas.ll_setStringValue(addr, casFeatCode_numericValue, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NumericAttributeValue_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_numericValue = jcas.getRequiredFeatureDE(casType, "numericValue", "uima.cas.String", featOkTst);
    casFeatCode_numericValue  = (null == casFeat_numericValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numericValue).getCode();

  }
}



    