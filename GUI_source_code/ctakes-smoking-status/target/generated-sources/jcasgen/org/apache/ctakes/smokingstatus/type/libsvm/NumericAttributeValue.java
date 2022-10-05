

/* First created by JCasGen Wed Sep 28 02:46:17 CST 2022 */
package org.apache.ctakes.smokingstatus.type.libsvm;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Corresponds to the ARFF numeric attributes.
 * Updated by JCasGen Wed Sep 28 02:46:17 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-smoking-status/target/jcasgen/typesystem.xml
 * @generated */
public class NumericAttributeValue extends AttributeValue {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NumericAttributeValue.class);
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
  protected NumericAttributeValue() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NumericAttributeValue(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NumericAttributeValue(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NumericAttributeValue(JCas jcas, int begin, int end) {
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
  //* Feature: numericValue

  /** getter for numericValue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNumericValue() {
    if (NumericAttributeValue_Type.featOkTst && ((NumericAttributeValue_Type)jcasType).casFeat_numericValue == null)
      jcasType.jcas.throwFeatMissing("numericValue", "org.apache.ctakes.smokingstatus.type.libsvm.NumericAttributeValue");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NumericAttributeValue_Type)jcasType).casFeatCode_numericValue);}
    
  /** setter for numericValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNumericValue(String v) {
    if (NumericAttributeValue_Type.featOkTst && ((NumericAttributeValue_Type)jcasType).casFeat_numericValue == null)
      jcasType.jcas.throwFeatMissing("numericValue", "org.apache.ctakes.smokingstatus.type.libsvm.NumericAttributeValue");
    jcasType.ll_cas.ll_setStringValue(addr, ((NumericAttributeValue_Type)jcasType).casFeatCode_numericValue, v);}    
  }

    