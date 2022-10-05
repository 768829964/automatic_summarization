

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
public class AnaphoricityVecInstance extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnaphoricityVecInstance.class);
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
  protected AnaphoricityVecInstance() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnaphoricityVecInstance(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnaphoricityVecInstance(JCas jcas) {
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
    if (AnaphoricityVecInstance_Type.featOkTst && ((AnaphoricityVecInstance_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnaphoricityVecInstance_Type)jcasType).casFeatCode_vector);}
    
  /** setter for vector - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVector(String v) {
    if (AnaphoricityVecInstance_Type.featOkTst && ((AnaphoricityVecInstance_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnaphoricityVecInstance_Type)jcasType).casFeatCode_vector, v);}    
   
    
  //*--------------*
  //* Feature: m

  /** getter for m - gets 
   * @generated
   * @return value of the feature 
   */
  public String getM() {
    if (AnaphoricityVecInstance_Type.featOkTst && ((AnaphoricityVecInstance_Type)jcasType).casFeat_m == null)
      jcasType.jcas.throwFeatMissing("m", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnaphoricityVecInstance_Type)jcasType).casFeatCode_m);}
    
  /** setter for m - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setM(String v) {
    if (AnaphoricityVecInstance_Type.featOkTst && ((AnaphoricityVecInstance_Type)jcasType).casFeat_m == null)
      jcasType.jcas.throwFeatMissing("m", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnaphoricityVecInstance_Type)jcasType).casFeatCode_m, v);}    
   
    
  //*--------------*
  //* Feature: offset

  /** getter for offset - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOffset() {
    if (AnaphoricityVecInstance_Type.featOkTst && ((AnaphoricityVecInstance_Type)jcasType).casFeat_offset == null)
      jcasType.jcas.throwFeatMissing("offset", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnaphoricityVecInstance_Type)jcasType).casFeatCode_offset);}
    
  /** setter for offset - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOffset(String v) {
    if (AnaphoricityVecInstance_Type.featOkTst && ((AnaphoricityVecInstance_Type)jcasType).casFeat_offset == null)
      jcasType.jcas.throwFeatMissing("offset", "org.apache.ctakes.coreference.type.AnaphoricityVecInstance");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnaphoricityVecInstance_Type)jcasType).casFeatCode_offset, v);}    
  }

    