

/* First created by JCasGen Wed Sep 28 02:46:17 CST 2022 */
package org.apache.ctakes.smokingstatus.type.libsvm;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Sep 28 02:46:17 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-smoking-status/target/jcasgen/typesystem.xml
 * @generated */
public class NominalAttributeValue extends AttributeValue {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NominalAttributeValue.class);
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
  protected NominalAttributeValue() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NominalAttributeValue(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NominalAttributeValue(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NominalAttributeValue(JCas jcas, int begin, int end) {
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
  //* Feature: nominalValue

  /** getter for nominalValue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNominalValue() {
    if (NominalAttributeValue_Type.featOkTst && ((NominalAttributeValue_Type)jcasType).casFeat_nominalValue == null)
      jcasType.jcas.throwFeatMissing("nominalValue", "org.apache.ctakes.smokingstatus.type.libsvm.NominalAttributeValue");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NominalAttributeValue_Type)jcasType).casFeatCode_nominalValue);}
    
  /** setter for nominalValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNominalValue(String v) {
    if (NominalAttributeValue_Type.featOkTst && ((NominalAttributeValue_Type)jcasType).casFeat_nominalValue == null)
      jcasType.jcas.throwFeatMissing("nominalValue", "org.apache.ctakes.smokingstatus.type.libsvm.NominalAttributeValue");
    jcasType.ll_cas.ll_setStringValue(addr, ((NominalAttributeValue_Type)jcasType).casFeatCode_nominalValue, v);}    
  }

    