

/* First created by JCasGen Wed Sep 28 02:46:17 CST 2022 */
package org.apache.ctakes.smokingstatus.i2b2.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Represents a single sentence from an I2B2 record.
 * Updated by JCasGen Wed Sep 28 02:46:17 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-smoking-status/target/jcasgen/typesystem.xml
 * @generated */
public class RecordSentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RecordSentence.class);
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
  protected RecordSentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RecordSentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RecordSentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public RecordSentence(JCas jcas, int begin, int end) {
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
  //* Feature: recordID

  /** getter for recordID - gets ID of record that this sentence belongs to.
   * @generated
   * @return value of the feature 
   */
  public String getRecordID() {
    if (RecordSentence_Type.featOkTst && ((RecordSentence_Type)jcasType).casFeat_recordID == null)
      jcasType.jcas.throwFeatMissing("recordID", "org.apache.ctakes.smokingstatus.i2b2.type.RecordSentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RecordSentence_Type)jcasType).casFeatCode_recordID);}
    
  /** setter for recordID - sets ID of record that this sentence belongs to. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecordID(String v) {
    if (RecordSentence_Type.featOkTst && ((RecordSentence_Type)jcasType).casFeat_recordID == null)
      jcasType.jcas.throwFeatMissing("recordID", "org.apache.ctakes.smokingstatus.i2b2.type.RecordSentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((RecordSentence_Type)jcasType).casFeatCode_recordID, v);}    
   
    
  //*--------------*
  //* Feature: classification

  /** getter for classification - gets Smoking status classification for the given sentence.
   * @generated
   * @return value of the feature 
   */
  public String getClassification() {
    if (RecordSentence_Type.featOkTst && ((RecordSentence_Type)jcasType).casFeat_classification == null)
      jcasType.jcas.throwFeatMissing("classification", "org.apache.ctakes.smokingstatus.i2b2.type.RecordSentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RecordSentence_Type)jcasType).casFeatCode_classification);}
    
  /** setter for classification - sets Smoking status classification for the given sentence. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassification(String v) {
    if (RecordSentence_Type.featOkTst && ((RecordSentence_Type)jcasType).casFeat_classification == null)
      jcasType.jcas.throwFeatMissing("classification", "org.apache.ctakes.smokingstatus.i2b2.type.RecordSentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((RecordSentence_Type)jcasType).casFeatCode_classification, v);}    
   
    
  //*--------------*
  //* Feature: recordTextBegin

  /** getter for recordTextBegin - gets Begin offset of the sentence relative to the entire
						record text.
   * @generated
   * @return value of the feature 
   */
  public int getRecordTextBegin() {
    if (RecordSentence_Type.featOkTst && ((RecordSentence_Type)jcasType).casFeat_recordTextBegin == null)
      jcasType.jcas.throwFeatMissing("recordTextBegin", "org.apache.ctakes.smokingstatus.i2b2.type.RecordSentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((RecordSentence_Type)jcasType).casFeatCode_recordTextBegin);}
    
  /** setter for recordTextBegin - sets Begin offset of the sentence relative to the entire
						record text. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecordTextBegin(int v) {
    if (RecordSentence_Type.featOkTst && ((RecordSentence_Type)jcasType).casFeat_recordTextBegin == null)
      jcasType.jcas.throwFeatMissing("recordTextBegin", "org.apache.ctakes.smokingstatus.i2b2.type.RecordSentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((RecordSentence_Type)jcasType).casFeatCode_recordTextBegin, v);}    
   
    
  //*--------------*
  //* Feature: recordTextEnd

  /** getter for recordTextEnd - gets End offset of the sentence relative to the entire
						record text.
   * @generated
   * @return value of the feature 
   */
  public int getRecordTextEnd() {
    if (RecordSentence_Type.featOkTst && ((RecordSentence_Type)jcasType).casFeat_recordTextEnd == null)
      jcasType.jcas.throwFeatMissing("recordTextEnd", "org.apache.ctakes.smokingstatus.i2b2.type.RecordSentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((RecordSentence_Type)jcasType).casFeatCode_recordTextEnd);}
    
  /** setter for recordTextEnd - sets End offset of the sentence relative to the entire
						record text. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecordTextEnd(int v) {
    if (RecordSentence_Type.featOkTst && ((RecordSentence_Type)jcasType).casFeat_recordTextEnd == null)
      jcasType.jcas.throwFeatMissing("recordTextEnd", "org.apache.ctakes.smokingstatus.i2b2.type.RecordSentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((RecordSentence_Type)jcasType).casFeatCode_recordTextEnd, v);}    
  }

    