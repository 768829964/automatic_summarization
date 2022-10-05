

/* First created by JCasGen Wed Sep 28 02:45:50 CST 2022 */
package org.apache.ctakes.drugner.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The value represents the unit portion of the drug frequency.
 * Updated by JCasGen Wed Sep 28 02:45:50 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-drug-ner/target/jcasgen/typesystem.xml
 * @generated */
public class FrequencyUnitAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FrequencyUnitAnnotation.class);
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
  protected FrequencyUnitAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public FrequencyUnitAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public FrequencyUnitAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public FrequencyUnitAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: period

  /** getter for period - gets The periodic unit used, e.g day, month, hour, etc.
   * @generated
   * @return value of the feature 
   */
  public float getPeriod() {
    if (FrequencyUnitAnnotation_Type.featOkTst && ((FrequencyUnitAnnotation_Type)jcasType).casFeat_period == null)
      jcasType.jcas.throwFeatMissing("period", "org.apache.ctakes.drugner.type.FrequencyUnitAnnotation");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((FrequencyUnitAnnotation_Type)jcasType).casFeatCode_period);}
    
  /** setter for period - sets The periodic unit used, e.g day, month, hour, etc. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPeriod(float v) {
    if (FrequencyUnitAnnotation_Type.featOkTst && ((FrequencyUnitAnnotation_Type)jcasType).casFeat_period == null)
      jcasType.jcas.throwFeatMissing("period", "org.apache.ctakes.drugner.type.FrequencyUnitAnnotation");
    jcasType.ll_cas.ll_setFloatValue(addr, ((FrequencyUnitAnnotation_Type)jcasType).casFeatCode_period, v);}    
  }

    