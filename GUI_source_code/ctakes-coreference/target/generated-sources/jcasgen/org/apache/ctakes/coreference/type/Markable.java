

/* First created by JCasGen Wed Sep 28 02:46:08 CST 2022 */
package org.apache.ctakes.coreference.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 28 02:46:08 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-coreference/target/jcasgen/typesystem.xml
 * @generated */
public class Markable extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Markable.class);
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
  protected Markable() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Markable(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Markable(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Markable(JCas jcas, int begin, int end) {
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
  //* Feature: content

  /** getter for content - gets The markable instance, i.e., a Named Entity, pronoun Token, etc.
   * @generated
   * @return value of the feature 
   */
  public Annotation getContent() {
    if (Markable_Type.featOkTst && ((Markable_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "org.apache.ctakes.coreference.type.Markable");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Markable_Type)jcasType).casFeatCode_content)));}
    
  /** setter for content - sets The markable instance, i.e., a Named Entity, pronoun Token, etc. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContent(Annotation v) {
    if (Markable_Type.featOkTst && ((Markable_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "org.apache.ctakes.coreference.type.Markable");
    jcasType.ll_cas.ll_setRefValue(addr, ((Markable_Type)jcasType).casFeatCode_content, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public int getId() {
    if (Markable_Type.featOkTst && ((Markable_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.coreference.type.Markable");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Markable_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    if (Markable_Type.featOkTst && ((Markable_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.coreference.type.Markable");
    jcasType.ll_cas.ll_setIntValue(addr, ((Markable_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: anaphoric_prob

  /** getter for anaphoric_prob - gets 
   * @generated
   * @return value of the feature 
   */
  public double getAnaphoric_prob() {
    if (Markable_Type.featOkTst && ((Markable_Type)jcasType).casFeat_anaphoric_prob == null)
      jcasType.jcas.throwFeatMissing("anaphoric_prob", "org.apache.ctakes.coreference.type.Markable");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Markable_Type)jcasType).casFeatCode_anaphoric_prob);}
    
  /** setter for anaphoric_prob - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnaphoric_prob(double v) {
    if (Markable_Type.featOkTst && ((Markable_Type)jcasType).casFeat_anaphoric_prob == null)
      jcasType.jcas.throwFeatMissing("anaphoric_prob", "org.apache.ctakes.coreference.type.Markable");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Markable_Type)jcasType).casFeatCode_anaphoric_prob, v);}    
  }

    