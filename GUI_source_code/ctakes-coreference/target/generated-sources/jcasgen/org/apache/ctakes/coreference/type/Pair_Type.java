
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
public class Pair_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Pair.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.coreference.type.Pair");
 
  /** @generated */
  final Feature casFeat_p1;
  /** @generated */
  final int     casFeatCode_p1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getP1(int addr) {
        if (featOkTst && casFeat_p1 == null)
      jcas.throwFeatMissing("p1", "org.apache.ctakes.coreference.type.Pair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_p1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setP1(int addr, int v) {
        if (featOkTst && casFeat_p1 == null)
      jcas.throwFeatMissing("p1", "org.apache.ctakes.coreference.type.Pair");
    ll_cas.ll_setRefValue(addr, casFeatCode_p1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_p2;
  /** @generated */
  final int     casFeatCode_p2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getP2(int addr) {
        if (featOkTst && casFeat_p2 == null)
      jcas.throwFeatMissing("p2", "org.apache.ctakes.coreference.type.Pair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_p2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setP2(int addr, int v) {
        if (featOkTst && casFeat_p2 == null)
      jcas.throwFeatMissing("p2", "org.apache.ctakes.coreference.type.Pair");
    ll_cas.ll_setRefValue(addr, casFeatCode_p2, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Pair_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_p1 = jcas.getRequiredFeatureDE(casType, "p1", "uima.cas.TOP", featOkTst);
    casFeatCode_p1  = (null == casFeat_p1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_p1).getCode();

 
    casFeat_p2 = jcas.getRequiredFeatureDE(casType, "p2", "uima.cas.TOP", featOkTst);
    casFeatCode_p2  = (null == casFeat_p2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_p2).getCode();

  }
}



    