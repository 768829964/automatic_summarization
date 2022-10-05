
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
public class PSESentenceFeature_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PSESentenceFeature.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.sideeffect.type.PSESentenceFeature");
 
  /** @generated */
  final Feature casFeat_pseSen;
  /** @generated */
  final int     casFeatCode_pseSen;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPseSen(int addr) {
        if (featOkTst && casFeat_pseSen == null)
      jcas.throwFeatMissing("pseSen", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    return ll_cas.ll_getRefValue(addr, casFeatCode_pseSen);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPseSen(int addr, int v) {
        if (featOkTst && casFeat_pseSen == null)
      jcas.throwFeatMissing("pseSen", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    ll_cas.ll_setRefValue(addr, casFeatCode_pseSen, v);}
    
  
 
  /** @generated */
  final Feature casFeat_features;
  /** @generated */
  final int     casFeatCode_features;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFeatures(int addr) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    return ll_cas.ll_getRefValue(addr, casFeatCode_features);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFeatures(int addr, int v) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    ll_cas.ll_setRefValue(addr, casFeatCode_features, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getFeatures(int addr, int i) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_features), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setFeatures(int addr, int i, String v) {
        if (featOkTst && casFeat_features == null)
      jcas.throwFeatMissing("features", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_features), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_features), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PSESentenceFeature_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_pseSen = jcas.getRequiredFeatureDE(casType, "pseSen", "org.apache.ctakes.sideeffect.type.PSESentence", featOkTst);
    casFeatCode_pseSen  = (null == casFeat_pseSen) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pseSen).getCode();

 
    casFeat_features = jcas.getRequiredFeatureDE(casType, "features", "uima.cas.StringArray", featOkTst);
    casFeatCode_features  = (null == casFeat_features) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_features).getCode();

  }
}



    