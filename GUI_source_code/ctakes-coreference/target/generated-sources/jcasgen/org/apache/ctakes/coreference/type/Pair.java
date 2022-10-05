

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
public class Pair extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Pair.class);
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
  protected Pair() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Pair(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Pair(JCas jcas) {
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
  //* Feature: p1

  /** getter for p1 - gets 
   * @generated
   * @return value of the feature 
   */
  public TOP getP1() {
    if (Pair_Type.featOkTst && ((Pair_Type)jcasType).casFeat_p1 == null)
      jcasType.jcas.throwFeatMissing("p1", "org.apache.ctakes.coreference.type.Pair");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Pair_Type)jcasType).casFeatCode_p1)));}
    
  /** setter for p1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setP1(TOP v) {
    if (Pair_Type.featOkTst && ((Pair_Type)jcasType).casFeat_p1 == null)
      jcasType.jcas.throwFeatMissing("p1", "org.apache.ctakes.coreference.type.Pair");
    jcasType.ll_cas.ll_setRefValue(addr, ((Pair_Type)jcasType).casFeatCode_p1, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: p2

  /** getter for p2 - gets 
   * @generated
   * @return value of the feature 
   */
  public TOP getP2() {
    if (Pair_Type.featOkTst && ((Pair_Type)jcasType).casFeat_p2 == null)
      jcasType.jcas.throwFeatMissing("p2", "org.apache.ctakes.coreference.type.Pair");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Pair_Type)jcasType).casFeatCode_p2)));}
    
  /** setter for p2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setP2(TOP v) {
    if (Pair_Type.featOkTst && ((Pair_Type)jcasType).casFeat_p2 == null)
      jcasType.jcas.throwFeatMissing("p2", "org.apache.ctakes.coreference.type.Pair");
    jcasType.ll_cas.ll_setRefValue(addr, ((Pair_Type)jcasType).casFeatCode_p2, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    