
/* First created by JCasGen Wed Sep 28 02:46:15 CST 2022 */
package org.apache.ctakes.sideeffect.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 28 02:46:15 CST 2022
 * @generated */
public class SideEffectAnnotation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SideEffectAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
 
  /** @generated */
  final Feature casFeat_sideEffect;
  /** @generated */
  final int     casFeatCode_sideEffect;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSideEffect(int addr) {
        if (featOkTst && casFeat_sideEffect == null)
      jcas.throwFeatMissing("sideEffect", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sideEffect);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSideEffect(int addr, int v) {
        if (featOkTst && casFeat_sideEffect == null)
      jcas.throwFeatMissing("sideEffect", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_sideEffect, v);}
    
  
 
  /** @generated */
  final Feature casFeat_drug;
  /** @generated */
  final int     casFeatCode_drug;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDrug(int addr) {
        if (featOkTst && casFeat_drug == null)
      jcas.throwFeatMissing("drug", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_drug);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDrug(int addr, int v) {
        if (featOkTst && casFeat_drug == null)
      jcas.throwFeatMissing("drug", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_drug, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentence;
  /** @generated */
  final int     casFeatCode_sentence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSentence(int addr) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentence(int addr, int v) {
        if (featOkTst && casFeat_sentence == null)
      jcas.throwFeatMissing("sentence", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_sentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SideEffectAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sideEffect = jcas.getRequiredFeatureDE(casType, "sideEffect", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation", featOkTst);
    casFeatCode_sideEffect  = (null == casFeat_sideEffect) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sideEffect).getCode();

 
    casFeat_drug = jcas.getRequiredFeatureDE(casType, "drug", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation", featOkTst);
    casFeatCode_drug  = (null == casFeat_drug) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_drug).getCode();

 
    casFeat_sentence = jcas.getRequiredFeatureDE(casType, "sentence", "org.apache.ctakes.sideeffect.type.SESentence", featOkTst);
    casFeatCode_sentence  = (null == casFeat_sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentence).getCode();

  }
}



    