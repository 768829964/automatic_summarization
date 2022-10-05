
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
public class MarkablePair_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MarkablePair.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.coreference.type.MarkablePair");
 
  /** @generated */
  final Feature casFeat_antecedent;
  /** @generated */
  final int     casFeatCode_antecedent;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAntecedent(int addr) {
        if (featOkTst && casFeat_antecedent == null)
      jcas.throwFeatMissing("antecedent", "org.apache.ctakes.coreference.type.MarkablePair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_antecedent);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAntecedent(int addr, int v) {
        if (featOkTst && casFeat_antecedent == null)
      jcas.throwFeatMissing("antecedent", "org.apache.ctakes.coreference.type.MarkablePair");
    ll_cas.ll_setRefValue(addr, casFeatCode_antecedent, v);}
    
  
 
  /** @generated */
  final Feature casFeat_anaphor;
  /** @generated */
  final int     casFeatCode_anaphor;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnaphor(int addr) {
        if (featOkTst && casFeat_anaphor == null)
      jcas.throwFeatMissing("anaphor", "org.apache.ctakes.coreference.type.MarkablePair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_anaphor);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnaphor(int addr, int v) {
        if (featOkTst && casFeat_anaphor == null)
      jcas.throwFeatMissing("anaphor", "org.apache.ctakes.coreference.type.MarkablePair");
    ll_cas.ll_setRefValue(addr, casFeatCode_anaphor, v);}
    
  
 
  /** @generated */
  final Feature casFeat_label;
  /** @generated */
  final int     casFeatCode_label;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getLabel(int addr) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "org.apache.ctakes.coreference.type.MarkablePair");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_label);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabel(int addr, boolean v) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "org.apache.ctakes.coreference.type.MarkablePair");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_label, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MarkablePair_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_antecedent = jcas.getRequiredFeatureDE(casType, "antecedent", "org.apache.ctakes.coreference.type.Markable", featOkTst);
    casFeatCode_antecedent  = (null == casFeat_antecedent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_antecedent).getCode();

 
    casFeat_anaphor = jcas.getRequiredFeatureDE(casType, "anaphor", "org.apache.ctakes.coreference.type.Markable", featOkTst);
    casFeatCode_anaphor  = (null == casFeat_anaphor) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_anaphor).getCode();

 
    casFeat_label = jcas.getRequiredFeatureDE(casType, "label", "uima.cas.Boolean", featOkTst);
    casFeatCode_label  = (null == casFeat_label) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_label).getCode();

  }
}



    