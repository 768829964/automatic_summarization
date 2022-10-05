
/* First created by JCasGen Wed Sep 28 02:46:08 CST 2022 */
package org.apache.ctakes.coreference.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** 
 * Updated by JCasGen Wed Sep 28 02:46:08 CST 2022
 * @generated */
public class AnaphoricityVecInstance_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnaphoricityVecInstance.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
 
  /** @generated */
  final Feature casFeat_vector;
  /** @generated */
  final int     casFeatCode_vector;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getVector(int addr) {
        if (featOkTst && casFeat_vector == null)
      jcas.throwFeatMissing("vector", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_vector);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVector(int addr, String v) {
        if (featOkTst && casFeat_vector == null)
      jcas.throwFeatMissing("vector", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    ll_cas.ll_setStringValue(addr, casFeatCode_vector, v);}
    
  
 
  /** @generated */
  final Feature casFeat_m;
  /** @generated */
  final int     casFeatCode_m;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getM(int addr) {
        if (featOkTst && casFeat_m == null)
      jcas.throwFeatMissing("m", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_m);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setM(int addr, String v) {
        if (featOkTst && casFeat_m == null)
      jcas.throwFeatMissing("m", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    ll_cas.ll_setStringValue(addr, casFeatCode_m, v);}
    
  
 
  /** @generated */
  final Feature casFeat_offset;
  /** @generated */
  final int     casFeatCode_offset;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOffset(int addr) {
        if (featOkTst && casFeat_offset == null)
      jcas.throwFeatMissing("offset", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_offset);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOffset(int addr, String v) {
        if (featOkTst && casFeat_offset == null)
      jcas.throwFeatMissing("offset", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    ll_cas.ll_setStringValue(addr, casFeatCode_offset, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnaphoricityVecInstance_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_vector = jcas.getRequiredFeatureDE(casType, "vector", "uima.cas.String", featOkTst);
    casFeatCode_vector  = (null == casFeat_vector) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_vector).getCode();

 
    casFeat_m = jcas.getRequiredFeatureDE(casType, "m", "uima.cas.String", featOkTst);
    casFeatCode_m  = (null == casFeat_m) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_m).getCode();

 
    casFeat_offset = jcas.getRequiredFeatureDE(casType, "offset", "uima.cas.String", featOkTst);
    casFeatCode_offset  = (null == casFeat_offset) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_offset).getCode();

  }
}



    