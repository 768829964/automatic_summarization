
/* First created by JCasGen Wed Sep 28 02:46:08 CST 2022 */
package org.apache.ctakes.coreference.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 28 02:46:08 CST 2022
 * @generated */
public class MarkablePairSet_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MarkablePairSet.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.coreference.type.MarkablePairSet");
 
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
      jcas.throwFeatMissing("anaphor", "org.apache.ctakes.coreference.type.MarkablePairSet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_anaphor);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnaphor(int addr, int v) {
        if (featOkTst && casFeat_anaphor == null)
      jcas.throwFeatMissing("anaphor", "org.apache.ctakes.coreference.type.MarkablePairSet");
    ll_cas.ll_setRefValue(addr, casFeatCode_anaphor, v);}
    
  
 
  /** @generated */
  final Feature casFeat_antecedentList;
  /** @generated */
  final int     casFeatCode_antecedentList;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAntecedentList(int addr) {
        if (featOkTst && casFeat_antecedentList == null)
      jcas.throwFeatMissing("antecedentList", "org.apache.ctakes.coreference.type.MarkablePairSet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_antecedentList);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAntecedentList(int addr, int v) {
        if (featOkTst && casFeat_antecedentList == null)
      jcas.throwFeatMissing("antecedentList", "org.apache.ctakes.coreference.type.MarkablePairSet");
    ll_cas.ll_setRefValue(addr, casFeatCode_antecedentList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MarkablePairSet_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_anaphor = jcas.getRequiredFeatureDE(casType, "anaphor", "org.apache.ctakes.coreference.type.Markable", featOkTst);
    casFeatCode_anaphor  = (null == casFeat_anaphor) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_anaphor).getCode();

 
    casFeat_antecedentList = jcas.getRequiredFeatureDE(casType, "antecedentList", "uima.cas.FSList", featOkTst);
    casFeatCode_antecedentList  = (null == casFeat_antecedentList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_antecedentList).getCode();

  }
}



    