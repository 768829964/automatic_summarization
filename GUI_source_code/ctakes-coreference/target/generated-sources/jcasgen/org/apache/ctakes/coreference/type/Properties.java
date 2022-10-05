

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
public class Properties extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Properties.class);
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
  protected Properties() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Properties(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Properties(JCas jcas) {
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
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getPolarity() {
    if (Properties_Type.featOkTst && ((Properties_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.apache.ctakes.coreference.type.Properties");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Properties_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(boolean v) {
    if (Properties_Type.featOkTst && ((Properties_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.apache.ctakes.coreference.type.Properties");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Properties_Type)jcasType).casFeatCode_polarity, v);}    
   
    
  //*--------------*
  //* Feature: certainty

  /** getter for certainty - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCertainty() {
    if (Properties_Type.featOkTst && ((Properties_Type)jcasType).casFeat_certainty == null)
      jcasType.jcas.throwFeatMissing("certainty", "org.apache.ctakes.coreference.type.Properties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Properties_Type)jcasType).casFeatCode_certainty);}
    
  /** setter for certainty - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCertainty(String v) {
    if (Properties_Type.featOkTst && ((Properties_Type)jcasType).casFeat_certainty == null)
      jcasType.jcas.throwFeatMissing("certainty", "org.apache.ctakes.coreference.type.Properties");
    jcasType.ll_cas.ll_setStringValue(addr, ((Properties_Type)jcasType).casFeatCode_certainty, v);}    
  }

    