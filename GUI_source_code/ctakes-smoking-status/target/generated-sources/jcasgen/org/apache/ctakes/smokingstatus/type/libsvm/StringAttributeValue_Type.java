
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
public class StringAttributeValue_Type extends AttributeValue_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = StringAttributeValue.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.smokingstatus.type.libsvm.StringAttributeValue");
 
  /** @generated */
  final Feature casFeat_attributeStringValue;
  /** @generated */
  final int     casFeatCode_attributeStringValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAttributeStringValue(int addr) {
        if (featOkTst && casFeat_attributeStringValue == null)
      jcas.throwFeatMissing("attributeStringValue", "org.apache.ctakes.smokingstatus.type.libsvm.StringAttributeValue");
    return ll_cas.ll_getStringValue(addr, casFeatCode_attributeStringValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAttributeStringValue(int addr, String v) {
        if (featOkTst && casFeat_attributeStringValue == null)
      jcas.throwFeatMissing("attributeStringValue", "org.apache.ctakes.smokingstatus.type.libsvm.StringAttributeValue");
    ll_cas.ll_setStringValue(addr, casFeatCode_attributeStringValue, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public StringAttributeValue_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_attributeStringValue = jcas.getRequiredFeatureDE(casType, "attributeStringValue", "uima.cas.String", featOkTst);
    casFeatCode_attributeStringValue  = (null == casFeat_attributeStringValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_attributeStringValue).getCode();

  }
}



    