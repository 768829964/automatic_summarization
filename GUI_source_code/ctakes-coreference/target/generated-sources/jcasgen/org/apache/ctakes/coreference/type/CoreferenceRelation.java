

/* First created by JCasGen Wed Sep 28 02:46:08 CST 2022 */
package org.apache.ctakes.coreference.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Sep 28 02:46:08 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-coreference/target/jcasgen/typesystem.xml
 * @generated */
public class CoreferenceRelation extends BinaryRelation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CoreferenceRelation.class);
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
  protected CoreferenceRelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CoreferenceRelation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CoreferenceRelation(JCas jcas) {
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
  //* Feature: coref_prob

  /** getter for coref_prob - gets 
   * @generated
   * @return value of the feature 
   */
  public double getCoref_prob() {
    if (CoreferenceRelation_Type.featOkTst && ((CoreferenceRelation_Type)jcasType).casFeat_coref_prob == null)
      jcasType.jcas.throwFeatMissing("coref_prob", "org.apache.ctakes.coreference.type.CoreferenceRelation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((CoreferenceRelation_Type)jcasType).casFeatCode_coref_prob);}
    
  /** setter for coref_prob - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCoref_prob(double v) {
    if (CoreferenceRelation_Type.featOkTst && ((CoreferenceRelation_Type)jcasType).casFeat_coref_prob == null)
      jcasType.jcas.throwFeatMissing("coref_prob", "org.apache.ctakes.coreference.type.CoreferenceRelation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((CoreferenceRelation_Type)jcasType).casFeatCode_coref_prob, v);}    
  }

    