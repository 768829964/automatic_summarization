
/* First created by JCasGen Wed Sep 28 02:46:08 CST 2022 */
package org.apache.ctakes.coreference.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Wed Sep 28 02:46:08 CST 2022
 * @generated */
public class CoreferenceRelation_Type extends BinaryRelation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CoreferenceRelation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.coreference.type.CoreferenceRelation");
 
  /** @generated */
  final Feature casFeat_coref_prob;
  /** @generated */
  final int     casFeatCode_coref_prob;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getCoref_prob(int addr) {
        if (featOkTst && casFeat_coref_prob == null)
      jcas.throwFeatMissing("coref_prob", "org.apache.ctakes.coreference.type.CoreferenceRelation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_coref_prob);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCoref_prob(int addr, double v) {
        if (featOkTst && casFeat_coref_prob == null)
      jcas.throwFeatMissing("coref_prob", "org.apache.ctakes.coreference.type.CoreferenceRelation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_coref_prob, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public CoreferenceRelation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_coref_prob = jcas.getRequiredFeatureDE(casType, "coref_prob", "uima.cas.Double", featOkTst);
    casFeatCode_coref_prob  = (null == casFeat_coref_prob) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_coref_prob).getCode();

  }
}



    