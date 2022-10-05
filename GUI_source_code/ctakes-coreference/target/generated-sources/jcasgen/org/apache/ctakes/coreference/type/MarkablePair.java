

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
public class MarkablePair extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MarkablePair.class);
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
  protected MarkablePair() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MarkablePair(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MarkablePair(JCas jcas) {
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
  //* Feature: antecedent

  /** getter for antecedent - gets Proposed antecedent
   * @generated
   * @return value of the feature 
   */
  public Markable getAntecedent() {
    if (MarkablePair_Type.featOkTst && ((MarkablePair_Type)jcasType).casFeat_antecedent == null)
      jcasType.jcas.throwFeatMissing("antecedent", "org.apache.ctakes.coreference.type.MarkablePair");
    return (Markable)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MarkablePair_Type)jcasType).casFeatCode_antecedent)));}
    
  /** setter for antecedent - sets Proposed antecedent 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAntecedent(Markable v) {
    if (MarkablePair_Type.featOkTst && ((MarkablePair_Type)jcasType).casFeat_antecedent == null)
      jcasType.jcas.throwFeatMissing("antecedent", "org.apache.ctakes.coreference.type.MarkablePair");
    jcasType.ll_cas.ll_setRefValue(addr, ((MarkablePair_Type)jcasType).casFeatCode_antecedent, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: anaphor

  /** getter for anaphor - gets 
   * @generated
   * @return value of the feature 
   */
  public Markable getAnaphor() {
    if (MarkablePair_Type.featOkTst && ((MarkablePair_Type)jcasType).casFeat_anaphor == null)
      jcasType.jcas.throwFeatMissing("anaphor", "org.apache.ctakes.coreference.type.MarkablePair");
    return (Markable)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MarkablePair_Type)jcasType).casFeatCode_anaphor)));}
    
  /** setter for anaphor - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnaphor(Markable v) {
    if (MarkablePair_Type.featOkTst && ((MarkablePair_Type)jcasType).casFeat_anaphor == null)
      jcasType.jcas.throwFeatMissing("anaphor", "org.apache.ctakes.coreference.type.MarkablePair");
    jcasType.ll_cas.ll_setRefValue(addr, ((MarkablePair_Type)jcasType).casFeatCode_anaphor, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: label

  /** getter for label - gets Is this pair coreferent?
   * @generated
   * @return value of the feature 
   */
  public boolean getLabel() {
    if (MarkablePair_Type.featOkTst && ((MarkablePair_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.apache.ctakes.coreference.type.MarkablePair");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((MarkablePair_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets Is this pair coreferent? 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(boolean v) {
    if (MarkablePair_Type.featOkTst && ((MarkablePair_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.apache.ctakes.coreference.type.MarkablePair");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((MarkablePair_Type)jcasType).casFeatCode_label, v);}    
  }

    