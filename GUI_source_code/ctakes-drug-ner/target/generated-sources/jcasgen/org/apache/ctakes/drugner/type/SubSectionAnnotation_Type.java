
/* First created by JCasGen Wed Sep 28 02:45:50 CST 2022 */
package org.apache.ctakes.drugner.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 28 02:45:50 CST 2022
 * @generated */
public class SubSectionAnnotation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SubSectionAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.drugner.type.SubSectionAnnotation");
 
  /** @generated */
  final Feature casFeat_subSectionBodyBegin;
  /** @generated */
  final int     casFeatCode_subSectionBodyBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSubSectionBodyBegin(int addr) {
        if (featOkTst && casFeat_subSectionBodyBegin == null)
      jcas.throwFeatMissing("subSectionBodyBegin", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_subSectionBodyBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubSectionBodyBegin(int addr, int v) {
        if (featOkTst && casFeat_subSectionBodyBegin == null)
      jcas.throwFeatMissing("subSectionBodyBegin", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_subSectionBodyBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subSectionBodyEnd;
  /** @generated */
  final int     casFeatCode_subSectionBodyEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSubSectionBodyEnd(int addr) {
        if (featOkTst && casFeat_subSectionBodyEnd == null)
      jcas.throwFeatMissing("subSectionBodyEnd", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_subSectionBodyEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubSectionBodyEnd(int addr, int v) {
        if (featOkTst && casFeat_subSectionBodyEnd == null)
      jcas.throwFeatMissing("subSectionBodyEnd", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_subSectionBodyEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_status;
  /** @generated */
  final int     casFeatCode_status;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStatus(int addr) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_status);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStatus(int addr, int v) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_status, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subSectionHeaderBegin;
  /** @generated */
  final int     casFeatCode_subSectionHeaderBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSubSectionHeaderBegin(int addr) {
        if (featOkTst && casFeat_subSectionHeaderBegin == null)
      jcas.throwFeatMissing("subSectionHeaderBegin", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_subSectionHeaderBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubSectionHeaderBegin(int addr, int v) {
        if (featOkTst && casFeat_subSectionHeaderBegin == null)
      jcas.throwFeatMissing("subSectionHeaderBegin", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_subSectionHeaderBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_subSectionHeaderEnd;
  /** @generated */
  final int     casFeatCode_subSectionHeaderEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSubSectionHeaderEnd(int addr) {
        if (featOkTst && casFeat_subSectionHeaderEnd == null)
      jcas.throwFeatMissing("subSectionHeaderEnd", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_subSectionHeaderEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubSectionHeaderEnd(int addr, int v) {
        if (featOkTst && casFeat_subSectionHeaderEnd == null)
      jcas.throwFeatMissing("subSectionHeaderEnd", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_subSectionHeaderEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_parentSectionId;
  /** @generated */
  final int     casFeatCode_parentSectionId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getParentSectionId(int addr) {
        if (featOkTst && casFeat_parentSectionId == null)
      jcas.throwFeatMissing("parentSectionId", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_parentSectionId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setParentSectionId(int addr, String v) {
        if (featOkTst && casFeat_parentSectionId == null)
      jcas.throwFeatMissing("parentSectionId", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_parentSectionId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SubSectionAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_subSectionBodyBegin = jcas.getRequiredFeatureDE(casType, "subSectionBodyBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_subSectionBodyBegin  = (null == casFeat_subSectionBodyBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subSectionBodyBegin).getCode();

 
    casFeat_subSectionBodyEnd = jcas.getRequiredFeatureDE(casType, "subSectionBodyEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_subSectionBodyEnd  = (null == casFeat_subSectionBodyEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subSectionBodyEnd).getCode();

 
    casFeat_status = jcas.getRequiredFeatureDE(casType, "status", "uima.cas.Integer", featOkTst);
    casFeatCode_status  = (null == casFeat_status) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_status).getCode();

 
    casFeat_subSectionHeaderBegin = jcas.getRequiredFeatureDE(casType, "subSectionHeaderBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_subSectionHeaderBegin  = (null == casFeat_subSectionHeaderBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subSectionHeaderBegin).getCode();

 
    casFeat_subSectionHeaderEnd = jcas.getRequiredFeatureDE(casType, "subSectionHeaderEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_subSectionHeaderEnd  = (null == casFeat_subSectionHeaderEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subSectionHeaderEnd).getCode();

 
    casFeat_parentSectionId = jcas.getRequiredFeatureDE(casType, "parentSectionId", "uima.cas.String", featOkTst);
    casFeatCode_parentSectionId  = (null == casFeat_parentSectionId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_parentSectionId).getCode();

  }
}



    