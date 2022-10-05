

/* First created by JCasGen Wed Sep 28 02:45:50 CST 2022 */
package org.apache.ctakes.drugner.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 28 02:45:50 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-drug-ner/target/jcasgen/typesystem.xml
 * @generated */
public class SubSectionAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SubSectionAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SubSectionAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SubSectionAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SubSectionAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SubSectionAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: subSectionBodyBegin

  /** getter for subSectionBodyBegin - gets Sub-section body begin offset.
   * @generated
   * @return value of the feature 
   */
  public int getSubSectionBodyBegin() {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_subSectionBodyBegin == null)
      jcasType.jcas.throwFeatMissing("subSectionBodyBegin", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_subSectionBodyBegin);}
    
  /** setter for subSectionBodyBegin - sets Sub-section body begin offset. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubSectionBodyBegin(int v) {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_subSectionBodyBegin == null)
      jcasType.jcas.throwFeatMissing("subSectionBodyBegin", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_subSectionBodyBegin, v);}    
   
    
  //*--------------*
  //* Feature: subSectionBodyEnd

  /** getter for subSectionBodyEnd - gets Sub-section body end offset.
   * @generated
   * @return value of the feature 
   */
  public int getSubSectionBodyEnd() {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_subSectionBodyEnd == null)
      jcasType.jcas.throwFeatMissing("subSectionBodyEnd", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_subSectionBodyEnd);}
    
  /** setter for subSectionBodyEnd - sets Sub-section body end offset. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubSectionBodyEnd(int v) {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_subSectionBodyEnd == null)
      jcasType.jcas.throwFeatMissing("subSectionBodyEnd", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_subSectionBodyEnd, v);}    
   
    
  //*--------------*
  //* Feature: status

  /** getter for status - gets Status of 'possible', 'history of', or 'family history of'.
   * @generated
   * @return value of the feature 
   */
  public int getStatus() {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_status);}
    
  /** setter for status - sets Status of 'possible', 'history of', or 'family history of'. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStatus(int v) {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_status, v);}    
   
    
  //*--------------*
  //* Feature: subSectionHeaderBegin

  /** getter for subSectionHeaderBegin - gets Begin offset of subSection header
   * @generated
   * @return value of the feature 
   */
  public int getSubSectionHeaderBegin() {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_subSectionHeaderBegin == null)
      jcasType.jcas.throwFeatMissing("subSectionHeaderBegin", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_subSectionHeaderBegin);}
    
  /** setter for subSectionHeaderBegin - sets Begin offset of subSection header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubSectionHeaderBegin(int v) {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_subSectionHeaderBegin == null)
      jcasType.jcas.throwFeatMissing("subSectionHeaderBegin", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_subSectionHeaderBegin, v);}    
   
    
  //*--------------*
  //* Feature: subSectionHeaderEnd

  /** getter for subSectionHeaderEnd - gets Ending offset of subsection header
   * @generated
   * @return value of the feature 
   */
  public int getSubSectionHeaderEnd() {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_subSectionHeaderEnd == null)
      jcasType.jcas.throwFeatMissing("subSectionHeaderEnd", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_subSectionHeaderEnd);}
    
  /** setter for subSectionHeaderEnd - sets Ending offset of subsection header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubSectionHeaderEnd(int v) {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_subSectionHeaderEnd == null)
      jcasType.jcas.throwFeatMissing("subSectionHeaderEnd", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_subSectionHeaderEnd, v);}    
   
    
  //*--------------*
  //* Feature: parentSectionId

  /** getter for parentSectionId - gets The section in which the subsection was found.
   * @generated
   * @return value of the feature 
   */
  public String getParentSectionId() {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_parentSectionId == null)
      jcasType.jcas.throwFeatMissing("parentSectionId", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_parentSectionId);}
    
  /** setter for parentSectionId - sets The section in which the subsection was found. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setParentSectionId(String v) {
    if (SubSectionAnnotation_Type.featOkTst && ((SubSectionAnnotation_Type)jcasType).casFeat_parentSectionId == null)
      jcasType.jcas.throwFeatMissing("parentSectionId", "org.apache.ctakes.drugner.type.SubSectionAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((SubSectionAnnotation_Type)jcasType).casFeatCode_parentSectionId, v);}    
  }

    