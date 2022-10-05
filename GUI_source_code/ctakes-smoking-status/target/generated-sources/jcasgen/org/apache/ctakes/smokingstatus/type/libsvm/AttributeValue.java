

/* First created by JCasGen Wed Sep 28 02:46:17 CST 2022 */
package org.apache.ctakes.smokingstatus.type.libsvm;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 28 02:46:17 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-smoking-status/target/jcasgen/typesystem.xml
 * @generated */
public class AttributeValue extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AttributeValue.class);
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
  protected AttributeValue() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AttributeValue(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AttributeValue(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AttributeValue(JCas jcas, int begin, int end) {
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
  //* Feature: attributeName

  /** getter for attributeName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAttributeName() {
    if (AttributeValue_Type.featOkTst && ((AttributeValue_Type)jcasType).casFeat_attributeName == null)
      jcasType.jcas.throwFeatMissing("attributeName", "org.apache.ctakes.smokingstatus.type.libsvm.AttributeValue");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AttributeValue_Type)jcasType).casFeatCode_attributeName);}
    
  /** setter for attributeName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAttributeName(String v) {
    if (AttributeValue_Type.featOkTst && ((AttributeValue_Type)jcasType).casFeat_attributeName == null)
      jcasType.jcas.throwFeatMissing("attributeName", "org.apache.ctakes.smokingstatus.type.libsvm.AttributeValue");
    jcasType.ll_cas.ll_setStringValue(addr, ((AttributeValue_Type)jcasType).casFeatCode_attributeName, v);}    
  }

    