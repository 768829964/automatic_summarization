

/* First created by JCasGen Wed Sep 28 02:46:17 CST 2022 */
package org.apache.ctakes.smokingstatus.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Represents classification related to the document
 * Updated by JCasGen Wed Sep 28 02:46:17 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-smoking-status/target/jcasgen/typesystem.xml
 * @generated */
public class SmokingDocumentClassification extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SmokingDocumentClassification.class);
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
  protected SmokingDocumentClassification() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SmokingDocumentClassification(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SmokingDocumentClassification(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SmokingDocumentClassification(JCas jcas, int begin, int end) {
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
  //* Feature: classification

  /** getter for classification - gets represents the document level classification that
						RecordResolutionAnnotator assigns
   * @generated
   * @return value of the feature 
   */
  public String getClassification() {
    if (SmokingDocumentClassification_Type.featOkTst && ((SmokingDocumentClassification_Type)jcasType).casFeat_classification == null)
      jcasType.jcas.throwFeatMissing("classification", "org.apache.ctakes.smokingstatus.type.SmokingDocumentClassification");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SmokingDocumentClassification_Type)jcasType).casFeatCode_classification);}
    
  /** setter for classification - sets represents the document level classification that
						RecordResolutionAnnotator assigns 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassification(String v) {
    if (SmokingDocumentClassification_Type.featOkTst && ((SmokingDocumentClassification_Type)jcasType).casFeat_classification == null)
      jcasType.jcas.throwFeatMissing("classification", "org.apache.ctakes.smokingstatus.type.SmokingDocumentClassification");
    jcasType.ll_cas.ll_setStringValue(addr, ((SmokingDocumentClassification_Type)jcasType).casFeatCode_classification, v);}    
   
    
  //*--------------*
  //* Feature: recordID

  /** getter for recordID - gets Represents the document record id
   * @generated
   * @return value of the feature 
   */
  public String getRecordID() {
    if (SmokingDocumentClassification_Type.featOkTst && ((SmokingDocumentClassification_Type)jcasType).casFeat_recordID == null)
      jcasType.jcas.throwFeatMissing("recordID", "org.apache.ctakes.smokingstatus.type.SmokingDocumentClassification");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SmokingDocumentClassification_Type)jcasType).casFeatCode_recordID);}
    
  /** setter for recordID - sets Represents the document record id 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecordID(String v) {
    if (SmokingDocumentClassification_Type.featOkTst && ((SmokingDocumentClassification_Type)jcasType).casFeat_recordID == null)
      jcasType.jcas.throwFeatMissing("recordID", "org.apache.ctakes.smokingstatus.type.SmokingDocumentClassification");
    jcasType.ll_cas.ll_setStringValue(addr, ((SmokingDocumentClassification_Type)jcasType).casFeatCode_recordID, v);}    
  }

    