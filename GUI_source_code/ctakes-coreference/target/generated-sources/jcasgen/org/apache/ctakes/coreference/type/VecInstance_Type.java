
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
public class VecInstance_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = VecInstance.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.coreference.type.VecInstance");
 
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
      jcas.throwFeatMissing("vector", "org.apache.ctakes.coreference.type.VecInstance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_vector);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVector(int addr, String v) {
        if (featOkTst && casFeat_vector == null)
      jcas.throwFeatMissing("vector", "org.apache.ctakes.coreference.type.VecInstance");
    ll_cas.ll_setStringValue(addr, casFeatCode_vector, v);}
    
  
 
  /** @generated */
  final Feature casFeat_a1;
  /** @generated */
  final int     casFeatCode_a1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getA1(int addr) {
        if (featOkTst && casFeat_a1 == null)
      jcas.throwFeatMissing("a1", "org.apache.ctakes.coreference.type.VecInstance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_a1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setA1(int addr, String v) {
        if (featOkTst && casFeat_a1 == null)
      jcas.throwFeatMissing("a1", "org.apache.ctakes.coreference.type.VecInstance");
    ll_cas.ll_setStringValue(addr, casFeatCode_a1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_a2;
  /** @generated */
  final int     casFeatCode_a2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getA2(int addr) {
        if (featOkTst && casFeat_a2 == null)
      jcas.throwFeatMissing("a2", "org.apache.ctakes.coreference.type.VecInstance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_a2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setA2(int addr, String v) {
        if (featOkTst && casFeat_a2 == null)
      jcas.throwFeatMissing("a2", "org.apache.ctakes.coreference.type.VecInstance");
    ll_cas.ll_setStringValue(addr, casFeatCode_a2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_offset1;
  /** @generated */
  final int     casFeatCode_offset1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOffset1(int addr) {
        if (featOkTst && casFeat_offset1 == null)
      jcas.throwFeatMissing("offset1", "org.apache.ctakes.coreference.type.VecInstance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_offset1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOffset1(int addr, String v) {
        if (featOkTst && casFeat_offset1 == null)
      jcas.throwFeatMissing("offset1", "org.apache.ctakes.coreference.type.VecInstance");
    ll_cas.ll_setStringValue(addr, casFeatCode_offset1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_offset2;
  /** @generated */
  final int     casFeatCode_offset2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOffset2(int addr) {
        if (featOkTst && casFeat_offset2 == null)
      jcas.throwFeatMissing("offset2", "org.apache.ctakes.coreference.type.VecInstance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_offset2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOffset2(int addr, String v) {
        if (featOkTst && casFeat_offset2 == null)
      jcas.throwFeatMissing("offset2", "org.apache.ctakes.coreference.type.VecInstance");
    ll_cas.ll_setStringValue(addr, casFeatCode_offset2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_classifier;
  /** @generated */
  final int     casFeatCode_classifier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getClassifier(int addr) {
        if (featOkTst && casFeat_classifier == null)
      jcas.throwFeatMissing("classifier", "org.apache.ctakes.coreference.type.VecInstance");
    return ll_cas.ll_getStringValue(addr, casFeatCode_classifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClassifier(int addr, String v) {
        if (featOkTst && casFeat_classifier == null)
      jcas.throwFeatMissing("classifier", "org.apache.ctakes.coreference.type.VecInstance");
    ll_cas.ll_setStringValue(addr, casFeatCode_classifier, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public VecInstance_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_vector = jcas.getRequiredFeatureDE(casType, "vector", "uima.cas.String", featOkTst);
    casFeatCode_vector  = (null == casFeat_vector) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_vector).getCode();

 
    casFeat_a1 = jcas.getRequiredFeatureDE(casType, "a1", "uima.cas.String", featOkTst);
    casFeatCode_a1  = (null == casFeat_a1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_a1).getCode();

 
    casFeat_a2 = jcas.getRequiredFeatureDE(casType, "a2", "uima.cas.String", featOkTst);
    casFeatCode_a2  = (null == casFeat_a2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_a2).getCode();

 
    casFeat_offset1 = jcas.getRequiredFeatureDE(casType, "offset1", "uima.cas.String", featOkTst);
    casFeatCode_offset1  = (null == casFeat_offset1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_offset1).getCode();

 
    casFeat_offset2 = jcas.getRequiredFeatureDE(casType, "offset2", "uima.cas.String", featOkTst);
    casFeatCode_offset2  = (null == casFeat_offset2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_offset2).getCode();

 
    casFeat_classifier = jcas.getRequiredFeatureDE(casType, "classifier", "uima.cas.String", featOkTst);
    casFeatCode_classifier  = (null == casFeat_classifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_classifier).getCode();

  }
}



    