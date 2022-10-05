

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
public class BooleanLabeledFS extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BooleanLabeledFS.class);
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
  protected BooleanLabeledFS() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public BooleanLabeledFS(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public BooleanLabeledFS(JCas jcas) {
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
  //* Feature: label

  /** getter for label - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getLabel() {
    if (BooleanLabeledFS_Type.featOkTst && ((BooleanLabeledFS_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.apache.ctakes.coreference.type.BooleanLabeledFS");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((BooleanLabeledFS_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(boolean v) {
    if (BooleanLabeledFS_Type.featOkTst && ((BooleanLabeledFS_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.apache.ctakes.coreference.type.BooleanLabeledFS");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((BooleanLabeledFS_Type)jcasType).casFeatCode_label, v);}    
   
    
  //*--------------*
  //* Feature: feature

  /** getter for feature - gets 
   * @generated
   * @return value of the feature 
   */
  public TOP getFeature() {
    if (BooleanLabeledFS_Type.featOkTst && ((BooleanLabeledFS_Type)jcasType).casFeat_feature == null)
      jcasType.jcas.throwFeatMissing("feature", "org.apache.ctakes.coreference.type.BooleanLabeledFS");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BooleanLabeledFS_Type)jcasType).casFeatCode_feature)));}
    
  /** setter for feature - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeature(TOP v) {
    if (BooleanLabeledFS_Type.featOkTst && ((BooleanLabeledFS_Type)jcasType).casFeat_feature == null)
      jcasType.jcas.throwFeatMissing("feature", "org.apache.ctakes.coreference.type.BooleanLabeledFS");
    jcasType.ll_cas.ll_setRefValue(addr, ((BooleanLabeledFS_Type)jcasType).casFeatCode_feature, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    