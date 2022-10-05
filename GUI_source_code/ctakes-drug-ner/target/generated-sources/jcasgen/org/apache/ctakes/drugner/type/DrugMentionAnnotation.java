

/* First created by JCasGen Wed Sep 28 02:45:50 CST 2022 */
package org.apache.ctakes.drugner.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 28 02:45:50 CST 2022
 * XML source: D:/thesis/summarizer1/ctakes-drug-ner/target/jcasgen/typesystem.xml
 * @generated */
public class DrugMentionAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DrugMentionAnnotation.class);
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
  protected DrugMentionAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DrugMentionAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DrugMentionAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DrugMentionAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: status

  /** getter for status - gets 
   * @generated
   * @return value of the feature 
   */
  public int getStatus() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_status);}
    
  /** setter for status - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStatus(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_status, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets The confidence of the annotation.
   * @generated
   * @return value of the feature 
   */
  public float getConfidence() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets The confidence of the annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(float v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setFloatValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: frequency

  /** getter for frequency - gets Frequency refers to how often the patient needs to take the drug. Frequency is divided into frequency number and frequency unit. E.g. twice daily
   * @generated
   * @return value of the feature 
   */
  public String getFrequency() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_frequency == null)
      jcasType.jcas.throwFeatMissing("frequency", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_frequency);}
    
  /** setter for frequency - sets Frequency refers to how often the patient needs to take the drug. Frequency is divided into frequency number and frequency unit. E.g. twice daily 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrequency(String v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_frequency == null)
      jcasType.jcas.throwFeatMissing("frequency", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_frequency, v);}    
   
    
  //*--------------*
  //* Feature: frequencyBegin

  /** getter for frequencyBegin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFrequencyBegin() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_frequencyBegin == null)
      jcasType.jcas.throwFeatMissing("frequencyBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_frequencyBegin);}
    
  /** setter for frequencyBegin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrequencyBegin(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_frequencyBegin == null)
      jcasType.jcas.throwFeatMissing("frequencyBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_frequencyBegin, v);}    
   
    
  //*--------------*
  //* Feature: frequencyEnd

  /** getter for frequencyEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFrequencyEnd() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_frequencyEnd == null)
      jcasType.jcas.throwFeatMissing("frequencyEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_frequencyEnd);}
    
  /** setter for frequencyEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrequencyEnd(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_frequencyEnd == null)
      jcasType.jcas.throwFeatMissing("frequencyEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_frequencyEnd, v);}    
   
    
  //*--------------*
  //* Feature: duration

  /** getter for duration - gets Duration refers to for how long the patient is expected to take the drug. E.g. 'for 2 weeks' 
Strongly encouraged to use bold text
   * @generated
   * @return value of the feature 
   */
  public String getDuration() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_duration == null)
      jcasType.jcas.throwFeatMissing("duration", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_duration);}
    
  /** setter for duration - sets Duration refers to for how long the patient is expected to take the drug. E.g. 'for 2 weeks' 
Strongly encouraged to use bold text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDuration(String v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_duration == null)
      jcasType.jcas.throwFeatMissing("duration", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_duration, v);}    
   
    
  //*--------------*
  //* Feature: durationBegin

  /** getter for durationBegin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDurationBegin() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_durationBegin == null)
      jcasType.jcas.throwFeatMissing("durationBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_durationBegin);}
    
  /** setter for durationBegin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDurationBegin(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_durationBegin == null)
      jcasType.jcas.throwFeatMissing("durationBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_durationBegin, v);}    
   
    
  //*--------------*
  //* Feature: durationEnd

  /** getter for durationEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDurationEnd() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_durationEnd == null)
      jcasType.jcas.throwFeatMissing("durationEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_durationEnd);}
    
  /** setter for durationEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDurationEnd(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_durationEnd == null)
      jcasType.jcas.throwFeatMissing("durationEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_durationEnd, v);}    
   
    
  //*--------------*
  //* Feature: route

  /** getter for route - gets Medication route refers to the way that a drug is introduced into the body. E.g oral 
Strongly encouraged to use bold text
   * @generated
   * @return value of the feature 
   */
  public String getRoute() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_route == null)
      jcasType.jcas.throwFeatMissing("route", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_route);}
    
  /** setter for route - sets Medication route refers to the way that a drug is introduced into the body. E.g oral 
Strongly encouraged to use bold text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRoute(String v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_route == null)
      jcasType.jcas.throwFeatMissing("route", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_route, v);}    
   
    
  //*--------------*
  //* Feature: routeBegin

  /** getter for routeBegin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getRouteBegin() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_routeBegin == null)
      jcasType.jcas.throwFeatMissing("routeBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_routeBegin);}
    
  /** setter for routeBegin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRouteBegin(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_routeBegin == null)
      jcasType.jcas.throwFeatMissing("routeBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_routeBegin, v);}    
   
    
  //*--------------*
  //* Feature: routeEnd

  /** getter for routeEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getRouteEnd() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_routeEnd == null)
      jcasType.jcas.throwFeatMissing("routeEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_routeEnd);}
    
  /** setter for routeEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRouteEnd(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_routeEnd == null)
      jcasType.jcas.throwFeatMissing("routeEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_routeEnd, v);}    
   
    
  //*--------------*
  //* Feature: drugChangeStatus

  /** getter for drugChangeStatus - gets Status refers to the whether the medication is currently being taken or not.
   * @generated
   * @return value of the feature 
   */
  public String getDrugChangeStatus() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_drugChangeStatus == null)
      jcasType.jcas.throwFeatMissing("drugChangeStatus", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_drugChangeStatus);}
    
  /** setter for drugChangeStatus - sets Status refers to the whether the medication is currently being taken or not. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDrugChangeStatus(String v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_drugChangeStatus == null)
      jcasType.jcas.throwFeatMissing("drugChangeStatus", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_drugChangeStatus, v);}    
   
    
  //*--------------*
  //* Feature: dosage

  /** getter for dosage - gets Dosage refers to how many of each drug the patient is taking. E.g. 5 mg
   * @generated
   * @return value of the feature 
   */
  public String getDosage() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_dosage == null)
      jcasType.jcas.throwFeatMissing("dosage", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_dosage);}
    
  /** setter for dosage - sets Dosage refers to how many of each drug the patient is taking. E.g. 5 mg 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDosage(String v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_dosage == null)
      jcasType.jcas.throwFeatMissing("dosage", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_dosage, v);}    
   
    
  //*--------------*
  //* Feature: dosageBegin

  /** getter for dosageBegin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDosageBegin() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_dosageBegin == null)
      jcasType.jcas.throwFeatMissing("dosageBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_dosageBegin);}
    
  /** setter for dosageBegin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDosageBegin(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_dosageBegin == null)
      jcasType.jcas.throwFeatMissing("dosageBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_dosageBegin, v);}    
   
    
  //*--------------*
  //* Feature: dosageEnd

  /** getter for dosageEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDosageEnd() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_dosageEnd == null)
      jcasType.jcas.throwFeatMissing("dosageEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_dosageEnd);}
    
  /** setter for dosageEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDosageEnd(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_dosageEnd == null)
      jcasType.jcas.throwFeatMissing("dosageEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_dosageEnd, v);}    
   
    
  //*--------------*
  //* Feature: strength

  /** getter for strength - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStrength() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_strength == null)
      jcasType.jcas.throwFeatMissing("strength", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_strength);}
    
  /** setter for strength - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStrength(String v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_strength == null)
      jcasType.jcas.throwFeatMissing("strength", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_strength, v);}    
   
    
  //*--------------*
  //* Feature: strengthBegin

  /** getter for strengthBegin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getStrengthBegin() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_strengthBegin == null)
      jcasType.jcas.throwFeatMissing("strengthBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_strengthBegin);}
    
  /** setter for strengthBegin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStrengthBegin(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_strengthBegin == null)
      jcasType.jcas.throwFeatMissing("strengthBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_strengthBegin, v);}    
   
    
  //*--------------*
  //* Feature: strengthEnd

  /** getter for strengthEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getStrengthEnd() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_strengthEnd == null)
      jcasType.jcas.throwFeatMissing("strengthEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_strengthEnd);}
    
  /** setter for strengthEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStrengthEnd(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_strengthEnd == null)
      jcasType.jcas.throwFeatMissing("strengthEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_strengthEnd, v);}    
   
    
  //*--------------*
  //* Feature: strengthUnit

  /** getter for strengthUnit - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStrengthUnit() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_strengthUnit == null)
      jcasType.jcas.throwFeatMissing("strengthUnit", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_strengthUnit);}
    
  /** setter for strengthUnit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStrengthUnit(String v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_strengthUnit == null)
      jcasType.jcas.throwFeatMissing("strengthUnit", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_strengthUnit, v);}    
   
    
  //*--------------*
  //* Feature: suBegin

  /** getter for suBegin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSuBegin() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_suBegin == null)
      jcasType.jcas.throwFeatMissing("suBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_suBegin);}
    
  /** setter for suBegin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuBegin(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_suBegin == null)
      jcasType.jcas.throwFeatMissing("suBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_suBegin, v);}    
   
    
  //*--------------*
  //* Feature: suEnd

  /** getter for suEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSuEnd() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_suEnd == null)
      jcasType.jcas.throwFeatMissing("suEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_suEnd);}
    
  /** setter for suEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuEnd(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_suEnd == null)
      jcasType.jcas.throwFeatMissing("suEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_suEnd, v);}    
   
    
  //*--------------*
  //* Feature: form

  /** getter for form - gets Form refers to the physical appearance of the drug. E.g. cream
   * @generated
   * @return value of the feature 
   */
  public String getForm() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_form == null)
      jcasType.jcas.throwFeatMissing("form", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_form);}
    
  /** setter for form - sets Form refers to the physical appearance of the drug. E.g. cream 
   * @generated
   * @param v value to set into the feature 
   */
  public void setForm(String v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_form == null)
      jcasType.jcas.throwFeatMissing("form", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_form, v);}    
   
    
  //*--------------*
  //* Feature: formBegin

  /** getter for formBegin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFormBegin() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_formBegin == null)
      jcasType.jcas.throwFeatMissing("formBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_formBegin);}
    
  /** setter for formBegin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFormBegin(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_formBegin == null)
      jcasType.jcas.throwFeatMissing("formBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_formBegin, v);}    
   
    
  //*--------------*
  //* Feature: formEnd

  /** getter for formEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFormEnd() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_formEnd == null)
      jcasType.jcas.throwFeatMissing("formEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_formEnd);}
    
  /** setter for formEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFormEnd(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_formEnd == null)
      jcasType.jcas.throwFeatMissing("formEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_formEnd, v);}    
   
    
  //*--------------*
  //* Feature: frequencyUnit

  /** getter for frequencyUnit - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFrequencyUnit() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_frequencyUnit == null)
      jcasType.jcas.throwFeatMissing("frequencyUnit", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_frequencyUnit);}
    
  /** setter for frequencyUnit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrequencyUnit(String v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_frequencyUnit == null)
      jcasType.jcas.throwFeatMissing("frequencyUnit", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_frequencyUnit, v);}    
   
    
  //*--------------*
  //* Feature: fuBegin

  /** getter for fuBegin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFuBegin() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_fuBegin == null)
      jcasType.jcas.throwFeatMissing("fuBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_fuBegin);}
    
  /** setter for fuBegin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFuBegin(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_fuBegin == null)
      jcasType.jcas.throwFeatMissing("fuBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_fuBegin, v);}    
   
    
  //*--------------*
  //* Feature: fuEnd

  /** getter for fuEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFuEnd() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_fuEnd == null)
      jcasType.jcas.throwFeatMissing("fuEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_fuEnd);}
    
  /** setter for fuEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFuEnd(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_fuEnd == null)
      jcasType.jcas.throwFeatMissing("fuEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_fuEnd, v);}    
   
    
  //*--------------*
  //* Feature: startDate

  /** getter for startDate - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStartDate() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_startDate == null)
      jcasType.jcas.throwFeatMissing("startDate", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_startDate);}
    
  /** setter for startDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartDate(String v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_startDate == null)
      jcasType.jcas.throwFeatMissing("startDate", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_startDate, v);}    
   
    
  //*--------------*
  //* Feature: reason

  /** getter for reason - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getReason() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_reason == null)
      jcasType.jcas.throwFeatMissing("reason", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_reason)));}
    
  /** setter for reason - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReason(FSArray v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_reason == null)
      jcasType.jcas.throwFeatMissing("reason", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_reason, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for reason - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TOP getReason(int i) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_reason == null)
      jcasType.jcas.throwFeatMissing("reason", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_reason), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_reason), i)));}

  /** indexed setter for reason - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setReason(int i, TOP v) { 
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_reason == null)
      jcasType.jcas.throwFeatMissing("reason", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_reason), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_reason), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: changeStatusBegin

  /** getter for changeStatusBegin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getChangeStatusBegin() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_changeStatusBegin == null)
      jcasType.jcas.throwFeatMissing("changeStatusBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_changeStatusBegin);}
    
  /** setter for changeStatusBegin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChangeStatusBegin(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_changeStatusBegin == null)
      jcasType.jcas.throwFeatMissing("changeStatusBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_changeStatusBegin, v);}    
   
    
  //*--------------*
  //* Feature: changeStatusEnd

  /** getter for changeStatusEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public int getChangeStatusEnd() {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_changeStatusEnd == null)
      jcasType.jcas.throwFeatMissing("changeStatusEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_changeStatusEnd);}
    
  /** setter for changeStatusEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChangeStatusEnd(int v) {
    if (DrugMentionAnnotation_Type.featOkTst && ((DrugMentionAnnotation_Type)jcasType).casFeat_changeStatusEnd == null)
      jcasType.jcas.throwFeatMissing("changeStatusEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DrugMentionAnnotation_Type)jcasType).casFeatCode_changeStatusEnd, v);}    
  }

    