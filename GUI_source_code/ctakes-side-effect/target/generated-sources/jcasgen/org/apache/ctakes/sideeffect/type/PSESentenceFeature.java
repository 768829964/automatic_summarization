

/* First created by JCasGen Wed Sep 28 02:46:15 CST 2022 */
package org.apache.ctakes.sideeffect.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 28 02:46:15 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-side-effect/target/jcasgen/typesystem.xml
 * @generated */
public class PSESentenceFeature extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PSESentenceFeature.class);
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
  protected PSESentenceFeature() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PSESentenceFeature(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PSESentenceFeature(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public PSESentenceFeature(JCas jcas, int begin, int end) {
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
  //* Feature: pseSen

  /** getter for pseSen - gets 
   * @generated
   * @return value of the feature 
   */
  public PSESentence getPseSen() {
    if (PSESentenceFeature_Type.featOkTst && ((PSESentenceFeature_Type)jcasType).casFeat_pseSen == null)
      jcasType.jcas.throwFeatMissing("pseSen", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    return (PSESentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PSESentenceFeature_Type)jcasType).casFeatCode_pseSen)));}
    
  /** setter for pseSen - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPseSen(PSESentence v) {
    if (PSESentenceFeature_Type.featOkTst && ((PSESentenceFeature_Type)jcasType).casFeat_pseSen == null)
      jcasType.jcas.throwFeatMissing("pseSen", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    jcasType.ll_cas.ll_setRefValue(addr, ((PSESentenceFeature_Type)jcasType).casFeatCode_pseSen, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: features

  /** getter for features - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getFeatures() {
    if (PSESentenceFeature_Type.featOkTst && ((PSESentenceFeature_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PSESentenceFeature_Type)jcasType).casFeatCode_features)));}
    
  /** setter for features - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeatures(StringArray v) {
    if (PSESentenceFeature_Type.featOkTst && ((PSESentenceFeature_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    jcasType.ll_cas.ll_setRefValue(addr, ((PSESentenceFeature_Type)jcasType).casFeatCode_features, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for features - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getFeatures(int i) {
    if (PSESentenceFeature_Type.featOkTst && ((PSESentenceFeature_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PSESentenceFeature_Type)jcasType).casFeatCode_features), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PSESentenceFeature_Type)jcasType).casFeatCode_features), i);}

  /** indexed setter for features - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setFeatures(int i, String v) { 
    if (PSESentenceFeature_Type.featOkTst && ((PSESentenceFeature_Type)jcasType).casFeat_features == null)
      jcasType.jcas.throwFeatMissing("features", "org.apache.ctakes.sideeffect.type.PSESentenceFeature");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PSESentenceFeature_Type)jcasType).casFeatCode_features), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PSESentenceFeature_Type)jcasType).casFeatCode_features), i, v);}
  }

    