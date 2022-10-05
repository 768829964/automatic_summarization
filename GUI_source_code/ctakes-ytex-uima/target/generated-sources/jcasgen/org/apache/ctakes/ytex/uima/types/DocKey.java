

/* First created by JCasGen Wed Sep 28 02:46:33 CST 2022 */
package org.apache.ctakes.ytex.uima.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 28 02:46:33 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-ytex-uima/target/jcasgen/typesystem.xml
 * @generated */
public class DocKey extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DocKey.class);
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
  protected DocKey() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DocKey(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DocKey(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DocKey(JCas jcas, int begin, int end) {
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
  //* Feature: keyValuePairs

  /** getter for keyValuePairs - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getKeyValuePairs() {
    if (DocKey_Type.featOkTst && ((DocKey_Type)jcasType).casFeat_keyValuePairs == null)
      jcasType.jcas.throwFeatMissing("keyValuePairs", "org.apache.ctakes.ytex.uima.types.DocKey");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocKey_Type)jcasType).casFeatCode_keyValuePairs)));}
    
  /** setter for keyValuePairs - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKeyValuePairs(FSArray v) {
    if (DocKey_Type.featOkTst && ((DocKey_Type)jcasType).casFeat_keyValuePairs == null)
      jcasType.jcas.throwFeatMissing("keyValuePairs", "org.apache.ctakes.ytex.uima.types.DocKey");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocKey_Type)jcasType).casFeatCode_keyValuePairs, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for keyValuePairs - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public KeyValuePair getKeyValuePairs(int i) {
    if (DocKey_Type.featOkTst && ((DocKey_Type)jcasType).casFeat_keyValuePairs == null)
      jcasType.jcas.throwFeatMissing("keyValuePairs", "org.apache.ctakes.ytex.uima.types.DocKey");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocKey_Type)jcasType).casFeatCode_keyValuePairs), i);
    return (KeyValuePair)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocKey_Type)jcasType).casFeatCode_keyValuePairs), i)));}

  /** indexed setter for keyValuePairs - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setKeyValuePairs(int i, KeyValuePair v) { 
    if (DocKey_Type.featOkTst && ((DocKey_Type)jcasType).casFeat_keyValuePairs == null)
      jcasType.jcas.throwFeatMissing("keyValuePairs", "org.apache.ctakes.ytex.uima.types.DocKey");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocKey_Type)jcasType).casFeatCode_keyValuePairs), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocKey_Type)jcasType).casFeatCode_keyValuePairs), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    