
/* First created by JCasGen Wed Sep 28 02:45:50 CST 2022 */
package org.apache.ctakes.drugner.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** The change status of dosages determination for the Drug NER profile.
 * Updated by JCasGen Wed Sep 28 02:45:50 CST 2022
 * @generated */
public class DrugChangeStatusAnnotation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DrugChangeStatusAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.drugner.type.DrugChangeStatusAnnotation");
 
  /** @generated */
  final Feature casFeat_changeStatus;
  /** @generated */
  final int     casFeatCode_changeStatus;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getChangeStatus(int addr) {
        if (featOkTst && casFeat_changeStatus == null)
      jcas.throwFeatMissing("changeStatus", "org.apache.ctakes.drugner.type.DrugChangeStatusAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_changeStatus);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setChangeStatus(int addr, String v) {
        if (featOkTst && casFeat_changeStatus == null)
      jcas.throwFeatMissing("changeStatus", "org.apache.ctakes.drugner.type.DrugChangeStatusAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_changeStatus, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DrugChangeStatusAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_changeStatus = jcas.getRequiredFeatureDE(casType, "changeStatus", "uima.cas.String", featOkTst);
    casFeatCode_changeStatus  = (null == casFeat_changeStatus) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_changeStatus).getCode();

  }
}



    