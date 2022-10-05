
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
public class DateAttributeValue_Type extends AttributeValue_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DateAttributeValue.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.smokingstatus.type.libsvm.DateAttributeValue");
 
  /** @generated */
  final Feature casFeat_dateValue;
  /** @generated */
  final int     casFeatCode_dateValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDateValue(int addr) {
        if (featOkTst && casFeat_dateValue == null)
      jcas.throwFeatMissing("dateValue", "org.apache.ctakes.smokingstatus.type.libsvm.DateAttributeValue");
    return ll_cas.ll_getStringValue(addr, casFeatCode_dateValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDateValue(int addr, String v) {
        if (featOkTst && casFeat_dateValue == null)
      jcas.throwFeatMissing("dateValue", "org.apache.ctakes.smokingstatus.type.libsvm.DateAttributeValue");
    ll_cas.ll_setStringValue(addr, casFeatCode_dateValue, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DateAttributeValue_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_dateValue = jcas.getRequiredFeatureDE(casType, "dateValue", "uima.cas.String", featOkTst);
    casFeatCode_dateValue  = (null == casFeat_dateValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dateValue).getCode();

  }
}



    