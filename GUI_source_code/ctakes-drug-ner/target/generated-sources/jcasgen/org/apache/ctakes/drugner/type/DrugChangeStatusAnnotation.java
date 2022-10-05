

/* First created by JCasGen Wed Sep 28 02:45:50 CST 2022 */
package org.apache.ctakes.drugner.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The change status of dosages determination for the Drug NER profile.
 * Updated by JCasGen Wed Sep 28 02:45:50 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-drug-ner/target/jcasgen/typesystem.xml
 * @generated */
public class DrugChangeStatusAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DrugChangeStatusAnnotation.class);
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
  protected DrugChangeStatusAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DrugChangeStatusAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DrugChangeStatusAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DrugChangeStatusAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: changeStatus

  /** getter for changeStatus - gets Indicates the drug change status of 'stop', 'start', 'increase', 'decrease', or 'noChange'.
   * @generated
   * @return value of the feature 
   */
  public String getChangeStatus() {
    if (DrugChangeStatusAnnotation_Type.featOkTst && ((DrugChangeStatusAnnotation_Type)jcasType).casFeat_changeStatus == null)
      jcasType.jcas.throwFeatMissing("changeStatus", "org.apache.ctakes.drugner.type.DrugChangeStatusAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DrugChangeStatusAnnotation_Type)jcasType).casFeatCode_changeStatus);}
    
  /** setter for changeStatus - sets Indicates the drug change status of 'stop', 'start', 'increase', 'decrease', or 'noChange'. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setChangeStatus(String v) {
    if (DrugChangeStatusAnnotation_Type.featOkTst && ((DrugChangeStatusAnnotation_Type)jcasType).casFeat_changeStatus == null)
      jcasType.jcas.throwFeatMissing("changeStatus", "org.apache.ctakes.drugner.type.DrugChangeStatusAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DrugChangeStatusAnnotation_Type)jcasType).casFeatCode_changeStatus, v);}    
  }

    