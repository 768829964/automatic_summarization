

/* First created by JCasGen Wed Sep 28 02:46:08 CST 2022 */
package org.apache.ctakes.coreference.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 28 02:46:08 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-coreference/target/jcasgen/typesystem.xml
 * @generated */
public class MarkablePairSet extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MarkablePairSet.class);
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
  protected MarkablePairSet() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MarkablePairSet(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MarkablePairSet(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MarkablePairSet(JCas jcas, int begin, int end) {
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
  //* Feature: anaphor

  /** getter for anaphor - gets 
   * @generated
   * @return value of the feature 
   */
  public Markable getAnaphor() {
    if (MarkablePairSet_Type.featOkTst && ((MarkablePairSet_Type)jcasType).casFeat_anaphor == null)
      jcasType.jcas.throwFeatMissing("anaphor", "org.apache.ctakes.coreference.type.MarkablePairSet");
    return (Markable)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MarkablePairSet_Type)jcasType).casFeatCode_anaphor)));}
    
  /** setter for anaphor - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnaphor(Markable v) {
    if (MarkablePairSet_Type.featOkTst && ((MarkablePairSet_Type)jcasType).casFeat_anaphor == null)
      jcasType.jcas.throwFeatMissing("anaphor", "org.apache.ctakes.coreference.type.MarkablePairSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((MarkablePairSet_Type)jcasType).casFeatCode_anaphor, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: antecedentList

  /** getter for antecedentList - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getAntecedentList() {
    if (MarkablePairSet_Type.featOkTst && ((MarkablePairSet_Type)jcasType).casFeat_antecedentList == null)
      jcasType.jcas.throwFeatMissing("antecedentList", "org.apache.ctakes.coreference.type.MarkablePairSet");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MarkablePairSet_Type)jcasType).casFeatCode_antecedentList)));}
    
  /** setter for antecedentList - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAntecedentList(FSList v) {
    if (MarkablePairSet_Type.featOkTst && ((MarkablePairSet_Type)jcasType).casFeat_antecedentList == null)
      jcasType.jcas.throwFeatMissing("antecedentList", "org.apache.ctakes.coreference.type.MarkablePairSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((MarkablePairSet_Type)jcasType).casFeatCode_antecedentList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    