
/* First created by JCasGen Wed Sep 28 02:46:33 CST 2022 */
package org.apache.ctakes.ytex.uima.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 28 02:46:33 CST 2022
 * @generated */
public class DocKey_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DocKey.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.ytex.uima.types.DocKey");
 
  /** @generated */
  final Feature casFeat_keyValuePairs;
  /** @generated */
  final int     casFeatCode_keyValuePairs;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getKeyValuePairs(int addr) {
        if (featOkTst && casFeat_keyValuePairs == null)
      jcas.throwFeatMissing("keyValuePairs", "org.apache.ctakes.ytex.uima.types.DocKey");
    return ll_cas.ll_getRefValue(addr, casFeatCode_keyValuePairs);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setKeyValuePairs(int addr, int v) {
        if (featOkTst && casFeat_keyValuePairs == null)
      jcas.throwFeatMissing("keyValuePairs", "org.apache.ctakes.ytex.uima.types.DocKey");
    ll_cas.ll_setRefValue(addr, casFeatCode_keyValuePairs, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getKeyValuePairs(int addr, int i) {
        if (featOkTst && casFeat_keyValuePairs == null)
      jcas.throwFeatMissing("keyValuePairs", "org.apache.ctakes.ytex.uima.types.DocKey");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_keyValuePairs), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_keyValuePairs), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_keyValuePairs), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setKeyValuePairs(int addr, int i, int v) {
        if (featOkTst && casFeat_keyValuePairs == null)
      jcas.throwFeatMissing("keyValuePairs", "org.apache.ctakes.ytex.uima.types.DocKey");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_keyValuePairs), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_keyValuePairs), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_keyValuePairs), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DocKey_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_keyValuePairs = jcas.getRequiredFeatureDE(casType, "keyValuePairs", "uima.cas.FSArray", featOkTst);
    casFeatCode_keyValuePairs  = (null == casFeat_keyValuePairs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_keyValuePairs).getCode();

  }
}



    