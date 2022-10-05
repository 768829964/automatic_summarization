

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
public class DiscoveryTechnique extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DiscoveryTechnique.class);
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
  protected DiscoveryTechnique() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DiscoveryTechnique(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DiscoveryTechnique(JCas jcas) {
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
  //* Feature: technique

  /** getter for technique - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTechnique() {
    if (DiscoveryTechnique_Type.featOkTst && ((DiscoveryTechnique_Type)jcasType).casFeat_technique == null)
      jcasType.jcas.throwFeatMissing("technique", "org.apache.ctakes.coreference.type.DiscoveryTechnique");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DiscoveryTechnique_Type)jcasType).casFeatCode_technique);}
    
  /** setter for technique - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTechnique(String v) {
    if (DiscoveryTechnique_Type.featOkTst && ((DiscoveryTechnique_Type)jcasType).casFeat_technique == null)
      jcasType.jcas.throwFeatMissing("technique", "org.apache.ctakes.coreference.type.DiscoveryTechnique");
    jcasType.ll_cas.ll_setStringValue(addr, ((DiscoveryTechnique_Type)jcasType).casFeatCode_technique, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() {
    if (DiscoveryTechnique_Type.featOkTst && ((DiscoveryTechnique_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.ctakes.coreference.type.DiscoveryTechnique");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((DiscoveryTechnique_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    if (DiscoveryTechnique_Type.featOkTst && ((DiscoveryTechnique_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.ctakes.coreference.type.DiscoveryTechnique");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DiscoveryTechnique_Type)jcasType).casFeatCode_confidence, v);}    
  }

    