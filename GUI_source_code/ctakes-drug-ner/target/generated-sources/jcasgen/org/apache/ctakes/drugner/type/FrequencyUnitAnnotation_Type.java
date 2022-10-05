
/* First created by JCasGen Wed Sep 28 02:45:50 CST 2022 */
package org.apache.ctakes.drugner.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** The value represents the unit portion of the drug frequency.
 * Updated by JCasGen Wed Sep 28 02:45:50 CST 2022
 * @generated */
public class FrequencyUnitAnnotation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = FrequencyUnitAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.drugner.type.FrequencyUnitAnnotation");
 
  /** @generated */
  final Feature casFeat_period;
  /** @generated */
  final int     casFeatCode_period;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getPeriod(int addr) {
        if (featOkTst && casFeat_period == null)
      jcas.throwFeatMissing("period", "org.apache.ctakes.drugner.type.FrequencyUnitAnnotation");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_period);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPeriod(int addr, float v) {
        if (featOkTst && casFeat_period == null)
      jcas.throwFeatMissing("period", "org.apache.ctakes.drugner.type.FrequencyUnitAnnotation");
    ll_cas.ll_setFloatValue(addr, casFeatCode_period, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public FrequencyUnitAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_period = jcas.getRequiredFeatureDE(casType, "period", "uima.cas.Float", featOkTst);
    casFeatCode_period  = (null == casFeat_period) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_period).getCode();

  }
}



    