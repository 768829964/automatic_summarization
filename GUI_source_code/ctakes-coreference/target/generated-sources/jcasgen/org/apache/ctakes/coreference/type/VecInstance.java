

/* First created by JCasGen Wed Sep 28 02:46:08 CST 2022 */
package org.apache.ctakes.coreference.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Wed Sep 28 02:46:08 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-coreference/target/jcasgen/typesystem.xml
 * @generated */
public class VecInstance extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(VecInstance.class);
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
  protected VecInstance() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public VecInstance(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public VecInstance(JCas jcas) {
    super(jcas);
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
  //* Feature: vector

  /** getter for vector - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVector() {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "org.apache.ctakes.coreference.type.VecInstance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_vector);}
    
  /** setter for vector - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVector(String v) {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "org.apache.ctakes.coreference.type.VecInstance");
    jcasType.ll_cas.ll_setStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_vector, v);}    
   
    
  //*--------------*
  //* Feature: a1

  /** getter for a1 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getA1() {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_a1 == null)
      jcasType.jcas.throwFeatMissing("a1", "org.apache.ctakes.coreference.type.VecInstance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_a1);}
    
  /** setter for a1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setA1(String v) {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_a1 == null)
      jcasType.jcas.throwFeatMissing("a1", "org.apache.ctakes.coreference.type.VecInstance");
    jcasType.ll_cas.ll_setStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_a1, v);}    
   
    
  //*--------------*
  //* Feature: a2

  /** getter for a2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getA2() {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_a2 == null)
      jcasType.jcas.throwFeatMissing("a2", "org.apache.ctakes.coreference.type.VecInstance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_a2);}
    
  /** setter for a2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setA2(String v) {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_a2 == null)
      jcasType.jcas.throwFeatMissing("a2", "org.apache.ctakes.coreference.type.VecInstance");
    jcasType.ll_cas.ll_setStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_a2, v);}    
   
    
  //*--------------*
  //* Feature: offset1

  /** getter for offset1 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOffset1() {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_offset1 == null)
      jcasType.jcas.throwFeatMissing("offset1", "org.apache.ctakes.coreference.type.VecInstance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_offset1);}
    
  /** setter for offset1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOffset1(String v) {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_offset1 == null)
      jcasType.jcas.throwFeatMissing("offset1", "org.apache.ctakes.coreference.type.VecInstance");
    jcasType.ll_cas.ll_setStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_offset1, v);}    
   
    
  //*--------------*
  //* Feature: offset2

  /** getter for offset2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOffset2() {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_offset2 == null)
      jcasType.jcas.throwFeatMissing("offset2", "org.apache.ctakes.coreference.type.VecInstance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_offset2);}
    
  /** setter for offset2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOffset2(String v) {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_offset2 == null)
      jcasType.jcas.throwFeatMissing("offset2", "org.apache.ctakes.coreference.type.VecInstance");
    jcasType.ll_cas.ll_setStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_offset2, v);}    
   
    
  //*--------------*
  //* Feature: classifier

  /** getter for classifier - gets 
   * @generated
   * @return value of the feature 
   */
  public String getClassifier() {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_classifier == null)
      jcasType.jcas.throwFeatMissing("classifier", "org.apache.ctakes.coreference.type.VecInstance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_classifier);}
    
  /** setter for classifier - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassifier(String v) {
    if (VecInstance_Type.featOkTst && ((VecInstance_Type)jcasType).casFeat_classifier == null)
      jcasType.jcas.throwFeatMissing("classifier", "org.apache.ctakes.coreference.type.VecInstance");
    jcasType.ll_cas.ll_setStringValue(addr, ((VecInstance_Type)jcasType).casFeatCode_classifier, v);}    
  }

    