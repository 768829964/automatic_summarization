
/* First created by JCasGen Wed Sep 28 02:46:17 CST 2022 */
package org.apache.ctakes.smokingstatus.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Represents classification related to the document
 * Updated by JCasGen Wed Sep 28 02:46:17 CST 2022
 * @generated */
public class SmokingDocumentClassification_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SmokingDocumentClassification.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.smokingstatus.type.SmokingDocumentClassification");
 
  /** @generated */
  final Feature casFeat_classification;
  /** @generated */
  final int     casFeatCode_classification;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getClassification(int addr) {
        if (featOkTst && casFeat_classification == null)
      jcas.throwFeatMissing("classification", "org.apache.ctakes.smokingstatus.type.SmokingDocumentClassification");
    return ll_cas.ll_getStringValue(addr, casFeatCode_classification);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClassification(int addr, String v) {
        if (featOkTst && casFeat_classification == null)
      jcas.throwFeatMissing("classification", "org.apache.ctakes.smokingstatus.type.SmokingDocumentClassification");
    ll_cas.ll_setStringValue(addr, casFeatCode_classification, v);}
    
  
 
  /** @generated */
  final Feature casFeat_recordID;
  /** @generated */
  final int     casFeatCode_recordID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRecordID(int addr) {
        if (featOkTst && casFeat_recordID == null)
      jcas.throwFeatMissing("recordID", "org.apache.ctakes.smokingstatus.type.SmokingDocumentClassification");
    return ll_cas.ll_getStringValue(addr, casFeatCode_recordID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRecordID(int addr, String v) {
        if (featOkTst && casFeat_recordID == null)
      jcas.throwFeatMissing("recordID", "org.apache.ctakes.smokingstatus.type.SmokingDocumentClassification");
    ll_cas.ll_setStringValue(addr, casFeatCode_recordID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SmokingDocumentClassification_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_classification = jcas.getRequiredFeatureDE(casType, "classification", "uima.cas.String", featOkTst);
    casFeatCode_classification  = (null == casFeat_classification) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_classification).getCode();

 
    casFeat_recordID = jcas.getRequiredFeatureDE(casType, "recordID", "uima.cas.String", featOkTst);
    casFeatCode_recordID  = (null == casFeat_recordID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_recordID).getCode();

  }
}



    