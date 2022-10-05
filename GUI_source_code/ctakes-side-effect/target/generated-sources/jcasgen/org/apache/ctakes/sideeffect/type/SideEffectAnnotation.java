

/* First created by JCasGen Wed Sep 28 02:46:15 CST 2022 */
package org.apache.ctakes.sideeffect.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 28 02:46:15 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-side-effect/target/jcasgen/typesystem.xml
 * @generated */
public class SideEffectAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SideEffectAnnotation.class);
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
  protected SideEffectAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SideEffectAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SideEffectAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SideEffectAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: sideEffect

  /** getter for sideEffect - gets side effect mention in NamedEntity
   * @generated
   * @return value of the feature 
   */
  public IdentifiedAnnotation getSideEffect() {
    if (SideEffectAnnotation_Type.featOkTst && ((SideEffectAnnotation_Type)jcasType).casFeat_sideEffect == null)
      jcasType.jcas.throwFeatMissing("sideEffect", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    return (IdentifiedAnnotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SideEffectAnnotation_Type)jcasType).casFeatCode_sideEffect)));}
    
  /** setter for sideEffect - sets side effect mention in NamedEntity 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSideEffect(IdentifiedAnnotation v) {
    if (SideEffectAnnotation_Type.featOkTst && ((SideEffectAnnotation_Type)jcasType).casFeat_sideEffect == null)
      jcasType.jcas.throwFeatMissing("sideEffect", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((SideEffectAnnotation_Type)jcasType).casFeatCode_sideEffect, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: drug

  /** getter for drug - gets 
   * @generated
   * @return value of the feature 
   */
  public IdentifiedAnnotation getDrug() {
    if (SideEffectAnnotation_Type.featOkTst && ((SideEffectAnnotation_Type)jcasType).casFeat_drug == null)
      jcasType.jcas.throwFeatMissing("drug", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    return (IdentifiedAnnotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SideEffectAnnotation_Type)jcasType).casFeatCode_drug)));}
    
  /** setter for drug - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDrug(IdentifiedAnnotation v) {
    if (SideEffectAnnotation_Type.featOkTst && ((SideEffectAnnotation_Type)jcasType).casFeat_drug == null)
      jcasType.jcas.throwFeatMissing("drug", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((SideEffectAnnotation_Type)jcasType).casFeatCode_drug, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: sentence

  /** getter for sentence - gets sentence containing side effect
   * @generated
   * @return value of the feature 
   */
  public SESentence getSentence() {
    if (SideEffectAnnotation_Type.featOkTst && ((SideEffectAnnotation_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    return (SESentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SideEffectAnnotation_Type)jcasType).casFeatCode_sentence)));}
    
  /** setter for sentence - sets sentence containing side effect 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentence(SESentence v) {
    if (SideEffectAnnotation_Type.featOkTst && ((SideEffectAnnotation_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "org.apache.ctakes.sideeffect.type.SideEffectAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((SideEffectAnnotation_Type)jcasType).casFeatCode_sentence, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    