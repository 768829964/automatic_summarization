
/* First created by JCasGen Wed Sep 28 02:46:17 CST 2022 */
package org.apache.ctakes.smokingstatus.type.libsvm;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 28 02:46:17 CST 2022
 * @generated */
public class AttributeValue_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AttributeValue.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.smokingstatus.type.libsvm.AttributeValue");
 
  /** @generated */
  final Feature casFeat_attributeName;
  /** @generated */
  final int     casFeatCode_attributeName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAttributeName(int addr) {
        if (featOkTst && casFeat_attributeName == null)
      jcas.throwFeatMissing("attributeName", "org.apache.ctakes.smokingstatus.type.libsvm.AttributeValue");
    return ll_cas.ll_getStringValue(addr, casFeatCode_attributeName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAttributeName(int addr, String v) {
        if (featOkTst && casFeat_attributeName == null)
      jcas.throwFeatMissing("attributeName", "org.apache.ctakes.smokingstatus.type.libsvm.AttributeValue");
    ll_cas.ll_setStringValue(addr, casFeatCode_attributeName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AttributeValue_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_attributeName = jcas.getRequiredFeatureDE(casType, "attributeName", "uima.cas.String", featOkTst);
    casFeatCode_attributeName  = (null == casFeat_attributeName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_attributeName).getCode();

  }
}



    