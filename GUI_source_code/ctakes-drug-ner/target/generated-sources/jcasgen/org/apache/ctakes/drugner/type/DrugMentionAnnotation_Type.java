
/* First created by JCasGen Wed Sep 28 02:45:50 CST 2022 */
package org.apache.ctakes.drugner.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 28 02:45:50 CST 2022
 * @generated */
public class DrugMentionAnnotation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DrugMentionAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.drugner.type.DrugMentionAnnotation");
 
  /** @generated */
  final Feature casFeat_status;
  /** @generated */
  final int     casFeatCode_status;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStatus(int addr) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_status);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStatus(int addr, int v) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_status, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, float v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setFloatValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_frequency;
  /** @generated */
  final int     casFeatCode_frequency;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFrequency(int addr) {
        if (featOkTst && casFeat_frequency == null)
      jcas.throwFeatMissing("frequency", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_frequency);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFrequency(int addr, String v) {
        if (featOkTst && casFeat_frequency == null)
      jcas.throwFeatMissing("frequency", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_frequency, v);}
    
  
 
  /** @generated */
  final Feature casFeat_frequencyBegin;
  /** @generated */
  final int     casFeatCode_frequencyBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFrequencyBegin(int addr) {
        if (featOkTst && casFeat_frequencyBegin == null)
      jcas.throwFeatMissing("frequencyBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_frequencyBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFrequencyBegin(int addr, int v) {
        if (featOkTst && casFeat_frequencyBegin == null)
      jcas.throwFeatMissing("frequencyBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_frequencyBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_frequencyEnd;
  /** @generated */
  final int     casFeatCode_frequencyEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFrequencyEnd(int addr) {
        if (featOkTst && casFeat_frequencyEnd == null)
      jcas.throwFeatMissing("frequencyEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_frequencyEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFrequencyEnd(int addr, int v) {
        if (featOkTst && casFeat_frequencyEnd == null)
      jcas.throwFeatMissing("frequencyEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_frequencyEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_duration;
  /** @generated */
  final int     casFeatCode_duration;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDuration(int addr) {
        if (featOkTst && casFeat_duration == null)
      jcas.throwFeatMissing("duration", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_duration);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDuration(int addr, String v) {
        if (featOkTst && casFeat_duration == null)
      jcas.throwFeatMissing("duration", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_duration, v);}
    
  
 
  /** @generated */
  final Feature casFeat_durationBegin;
  /** @generated */
  final int     casFeatCode_durationBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDurationBegin(int addr) {
        if (featOkTst && casFeat_durationBegin == null)
      jcas.throwFeatMissing("durationBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_durationBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDurationBegin(int addr, int v) {
        if (featOkTst && casFeat_durationBegin == null)
      jcas.throwFeatMissing("durationBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_durationBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_durationEnd;
  /** @generated */
  final int     casFeatCode_durationEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDurationEnd(int addr) {
        if (featOkTst && casFeat_durationEnd == null)
      jcas.throwFeatMissing("durationEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_durationEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDurationEnd(int addr, int v) {
        if (featOkTst && casFeat_durationEnd == null)
      jcas.throwFeatMissing("durationEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_durationEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_route;
  /** @generated */
  final int     casFeatCode_route;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRoute(int addr) {
        if (featOkTst && casFeat_route == null)
      jcas.throwFeatMissing("route", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_route);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRoute(int addr, String v) {
        if (featOkTst && casFeat_route == null)
      jcas.throwFeatMissing("route", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_route, v);}
    
  
 
  /** @generated */
  final Feature casFeat_routeBegin;
  /** @generated */
  final int     casFeatCode_routeBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRouteBegin(int addr) {
        if (featOkTst && casFeat_routeBegin == null)
      jcas.throwFeatMissing("routeBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_routeBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRouteBegin(int addr, int v) {
        if (featOkTst && casFeat_routeBegin == null)
      jcas.throwFeatMissing("routeBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_routeBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_routeEnd;
  /** @generated */
  final int     casFeatCode_routeEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRouteEnd(int addr) {
        if (featOkTst && casFeat_routeEnd == null)
      jcas.throwFeatMissing("routeEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_routeEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRouteEnd(int addr, int v) {
        if (featOkTst && casFeat_routeEnd == null)
      jcas.throwFeatMissing("routeEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_routeEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_drugChangeStatus;
  /** @generated */
  final int     casFeatCode_drugChangeStatus;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDrugChangeStatus(int addr) {
        if (featOkTst && casFeat_drugChangeStatus == null)
      jcas.throwFeatMissing("drugChangeStatus", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_drugChangeStatus);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDrugChangeStatus(int addr, String v) {
        if (featOkTst && casFeat_drugChangeStatus == null)
      jcas.throwFeatMissing("drugChangeStatus", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_drugChangeStatus, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dosage;
  /** @generated */
  final int     casFeatCode_dosage;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDosage(int addr) {
        if (featOkTst && casFeat_dosage == null)
      jcas.throwFeatMissing("dosage", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_dosage);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDosage(int addr, String v) {
        if (featOkTst && casFeat_dosage == null)
      jcas.throwFeatMissing("dosage", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_dosage, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dosageBegin;
  /** @generated */
  final int     casFeatCode_dosageBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDosageBegin(int addr) {
        if (featOkTst && casFeat_dosageBegin == null)
      jcas.throwFeatMissing("dosageBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_dosageBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDosageBegin(int addr, int v) {
        if (featOkTst && casFeat_dosageBegin == null)
      jcas.throwFeatMissing("dosageBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_dosageBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dosageEnd;
  /** @generated */
  final int     casFeatCode_dosageEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDosageEnd(int addr) {
        if (featOkTst && casFeat_dosageEnd == null)
      jcas.throwFeatMissing("dosageEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_dosageEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDosageEnd(int addr, int v) {
        if (featOkTst && casFeat_dosageEnd == null)
      jcas.throwFeatMissing("dosageEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_dosageEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_strength;
  /** @generated */
  final int     casFeatCode_strength;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStrength(int addr) {
        if (featOkTst && casFeat_strength == null)
      jcas.throwFeatMissing("strength", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_strength);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStrength(int addr, String v) {
        if (featOkTst && casFeat_strength == null)
      jcas.throwFeatMissing("strength", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_strength, v);}
    
  
 
  /** @generated */
  final Feature casFeat_strengthBegin;
  /** @generated */
  final int     casFeatCode_strengthBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStrengthBegin(int addr) {
        if (featOkTst && casFeat_strengthBegin == null)
      jcas.throwFeatMissing("strengthBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_strengthBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStrengthBegin(int addr, int v) {
        if (featOkTst && casFeat_strengthBegin == null)
      jcas.throwFeatMissing("strengthBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_strengthBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_strengthEnd;
  /** @generated */
  final int     casFeatCode_strengthEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStrengthEnd(int addr) {
        if (featOkTst && casFeat_strengthEnd == null)
      jcas.throwFeatMissing("strengthEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_strengthEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStrengthEnd(int addr, int v) {
        if (featOkTst && casFeat_strengthEnd == null)
      jcas.throwFeatMissing("strengthEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_strengthEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_strengthUnit;
  /** @generated */
  final int     casFeatCode_strengthUnit;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStrengthUnit(int addr) {
        if (featOkTst && casFeat_strengthUnit == null)
      jcas.throwFeatMissing("strengthUnit", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_strengthUnit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStrengthUnit(int addr, String v) {
        if (featOkTst && casFeat_strengthUnit == null)
      jcas.throwFeatMissing("strengthUnit", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_strengthUnit, v);}
    
  
 
  /** @generated */
  final Feature casFeat_suBegin;
  /** @generated */
  final int     casFeatCode_suBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSuBegin(int addr) {
        if (featOkTst && casFeat_suBegin == null)
      jcas.throwFeatMissing("suBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_suBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSuBegin(int addr, int v) {
        if (featOkTst && casFeat_suBegin == null)
      jcas.throwFeatMissing("suBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_suBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_suEnd;
  /** @generated */
  final int     casFeatCode_suEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSuEnd(int addr) {
        if (featOkTst && casFeat_suEnd == null)
      jcas.throwFeatMissing("suEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_suEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSuEnd(int addr, int v) {
        if (featOkTst && casFeat_suEnd == null)
      jcas.throwFeatMissing("suEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_suEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_form;
  /** @generated */
  final int     casFeatCode_form;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getForm(int addr) {
        if (featOkTst && casFeat_form == null)
      jcas.throwFeatMissing("form", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_form);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setForm(int addr, String v) {
        if (featOkTst && casFeat_form == null)
      jcas.throwFeatMissing("form", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_form, v);}
    
  
 
  /** @generated */
  final Feature casFeat_formBegin;
  /** @generated */
  final int     casFeatCode_formBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFormBegin(int addr) {
        if (featOkTst && casFeat_formBegin == null)
      jcas.throwFeatMissing("formBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_formBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFormBegin(int addr, int v) {
        if (featOkTst && casFeat_formBegin == null)
      jcas.throwFeatMissing("formBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_formBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_formEnd;
  /** @generated */
  final int     casFeatCode_formEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFormEnd(int addr) {
        if (featOkTst && casFeat_formEnd == null)
      jcas.throwFeatMissing("formEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_formEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFormEnd(int addr, int v) {
        if (featOkTst && casFeat_formEnd == null)
      jcas.throwFeatMissing("formEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_formEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_frequencyUnit;
  /** @generated */
  final int     casFeatCode_frequencyUnit;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFrequencyUnit(int addr) {
        if (featOkTst && casFeat_frequencyUnit == null)
      jcas.throwFeatMissing("frequencyUnit", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_frequencyUnit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFrequencyUnit(int addr, String v) {
        if (featOkTst && casFeat_frequencyUnit == null)
      jcas.throwFeatMissing("frequencyUnit", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_frequencyUnit, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fuBegin;
  /** @generated */
  final int     casFeatCode_fuBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFuBegin(int addr) {
        if (featOkTst && casFeat_fuBegin == null)
      jcas.throwFeatMissing("fuBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_fuBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFuBegin(int addr, int v) {
        if (featOkTst && casFeat_fuBegin == null)
      jcas.throwFeatMissing("fuBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_fuBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fuEnd;
  /** @generated */
  final int     casFeatCode_fuEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFuEnd(int addr) {
        if (featOkTst && casFeat_fuEnd == null)
      jcas.throwFeatMissing("fuEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_fuEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFuEnd(int addr, int v) {
        if (featOkTst && casFeat_fuEnd == null)
      jcas.throwFeatMissing("fuEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_fuEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_startDate;
  /** @generated */
  final int     casFeatCode_startDate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStartDate(int addr) {
        if (featOkTst && casFeat_startDate == null)
      jcas.throwFeatMissing("startDate", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_startDate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartDate(int addr, String v) {
        if (featOkTst && casFeat_startDate == null)
      jcas.throwFeatMissing("startDate", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_startDate, v);}
    
  
 
  /** @generated */
  final Feature casFeat_reason;
  /** @generated */
  final int     casFeatCode_reason;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReason(int addr) {
        if (featOkTst && casFeat_reason == null)
      jcas.throwFeatMissing("reason", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_reason);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReason(int addr, int v) {
        if (featOkTst && casFeat_reason == null)
      jcas.throwFeatMissing("reason", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_reason, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getReason(int addr, int i) {
        if (featOkTst && casFeat_reason == null)
      jcas.throwFeatMissing("reason", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_reason), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_reason), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_reason), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setReason(int addr, int i, int v) {
        if (featOkTst && casFeat_reason == null)
      jcas.throwFeatMissing("reason", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_reason), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_reason), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_reason), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_changeStatusBegin;
  /** @generated */
  final int     casFeatCode_changeStatusBegin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getChangeStatusBegin(int addr) {
        if (featOkTst && casFeat_changeStatusBegin == null)
      jcas.throwFeatMissing("changeStatusBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_changeStatusBegin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setChangeStatusBegin(int addr, int v) {
        if (featOkTst && casFeat_changeStatusBegin == null)
      jcas.throwFeatMissing("changeStatusBegin", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_changeStatusBegin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_changeStatusEnd;
  /** @generated */
  final int     casFeatCode_changeStatusEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getChangeStatusEnd(int addr) {
        if (featOkTst && casFeat_changeStatusEnd == null)
      jcas.throwFeatMissing("changeStatusEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_changeStatusEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setChangeStatusEnd(int addr, int v) {
        if (featOkTst && casFeat_changeStatusEnd == null)
      jcas.throwFeatMissing("changeStatusEnd", "org.apache.ctakes.drugner.type.DrugMentionAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_changeStatusEnd, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DrugMentionAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_status = jcas.getRequiredFeatureDE(casType, "status", "uima.cas.Integer", featOkTst);
    casFeatCode_status  = (null == casFeat_status) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_status).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Float", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_frequency = jcas.getRequiredFeatureDE(casType, "frequency", "uima.cas.String", featOkTst);
    casFeatCode_frequency  = (null == casFeat_frequency) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_frequency).getCode();

 
    casFeat_frequencyBegin = jcas.getRequiredFeatureDE(casType, "frequencyBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_frequencyBegin  = (null == casFeat_frequencyBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_frequencyBegin).getCode();

 
    casFeat_frequencyEnd = jcas.getRequiredFeatureDE(casType, "frequencyEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_frequencyEnd  = (null == casFeat_frequencyEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_frequencyEnd).getCode();

 
    casFeat_duration = jcas.getRequiredFeatureDE(casType, "duration", "uima.cas.String", featOkTst);
    casFeatCode_duration  = (null == casFeat_duration) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_duration).getCode();

 
    casFeat_durationBegin = jcas.getRequiredFeatureDE(casType, "durationBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_durationBegin  = (null == casFeat_durationBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_durationBegin).getCode();

 
    casFeat_durationEnd = jcas.getRequiredFeatureDE(casType, "durationEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_durationEnd  = (null == casFeat_durationEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_durationEnd).getCode();

 
    casFeat_route = jcas.getRequiredFeatureDE(casType, "route", "uima.cas.String", featOkTst);
    casFeatCode_route  = (null == casFeat_route) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_route).getCode();

 
    casFeat_routeBegin = jcas.getRequiredFeatureDE(casType, "routeBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_routeBegin  = (null == casFeat_routeBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_routeBegin).getCode();

 
    casFeat_routeEnd = jcas.getRequiredFeatureDE(casType, "routeEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_routeEnd  = (null == casFeat_routeEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_routeEnd).getCode();

 
    casFeat_drugChangeStatus = jcas.getRequiredFeatureDE(casType, "drugChangeStatus", "uima.cas.String", featOkTst);
    casFeatCode_drugChangeStatus  = (null == casFeat_drugChangeStatus) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_drugChangeStatus).getCode();

 
    casFeat_dosage = jcas.getRequiredFeatureDE(casType, "dosage", "uima.cas.String", featOkTst);
    casFeatCode_dosage  = (null == casFeat_dosage) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dosage).getCode();

 
    casFeat_dosageBegin = jcas.getRequiredFeatureDE(casType, "dosageBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_dosageBegin  = (null == casFeat_dosageBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dosageBegin).getCode();

 
    casFeat_dosageEnd = jcas.getRequiredFeatureDE(casType, "dosageEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_dosageEnd  = (null == casFeat_dosageEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dosageEnd).getCode();

 
    casFeat_strength = jcas.getRequiredFeatureDE(casType, "strength", "uima.cas.String", featOkTst);
    casFeatCode_strength  = (null == casFeat_strength) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_strength).getCode();

 
    casFeat_strengthBegin = jcas.getRequiredFeatureDE(casType, "strengthBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_strengthBegin  = (null == casFeat_strengthBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_strengthBegin).getCode();

 
    casFeat_strengthEnd = jcas.getRequiredFeatureDE(casType, "strengthEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_strengthEnd  = (null == casFeat_strengthEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_strengthEnd).getCode();

 
    casFeat_strengthUnit = jcas.getRequiredFeatureDE(casType, "strengthUnit", "uima.cas.String", featOkTst);
    casFeatCode_strengthUnit  = (null == casFeat_strengthUnit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_strengthUnit).getCode();

 
    casFeat_suBegin = jcas.getRequiredFeatureDE(casType, "suBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_suBegin  = (null == casFeat_suBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_suBegin).getCode();

 
    casFeat_suEnd = jcas.getRequiredFeatureDE(casType, "suEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_suEnd  = (null == casFeat_suEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_suEnd).getCode();

 
    casFeat_form = jcas.getRequiredFeatureDE(casType, "form", "uima.cas.String", featOkTst);
    casFeatCode_form  = (null == casFeat_form) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_form).getCode();

 
    casFeat_formBegin = jcas.getRequiredFeatureDE(casType, "formBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_formBegin  = (null == casFeat_formBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_formBegin).getCode();

 
    casFeat_formEnd = jcas.getRequiredFeatureDE(casType, "formEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_formEnd  = (null == casFeat_formEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_formEnd).getCode();

 
    casFeat_frequencyUnit = jcas.getRequiredFeatureDE(casType, "frequencyUnit", "uima.cas.String", featOkTst);
    casFeatCode_frequencyUnit  = (null == casFeat_frequencyUnit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_frequencyUnit).getCode();

 
    casFeat_fuBegin = jcas.getRequiredFeatureDE(casType, "fuBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_fuBegin  = (null == casFeat_fuBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fuBegin).getCode();

 
    casFeat_fuEnd = jcas.getRequiredFeatureDE(casType, "fuEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_fuEnd  = (null == casFeat_fuEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fuEnd).getCode();

 
    casFeat_startDate = jcas.getRequiredFeatureDE(casType, "startDate", "uima.cas.String", featOkTst);
    casFeatCode_startDate  = (null == casFeat_startDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startDate).getCode();

 
    casFeat_reason = jcas.getRequiredFeatureDE(casType, "reason", "uima.cas.FSArray", featOkTst);
    casFeatCode_reason  = (null == casFeat_reason) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reason).getCode();

 
    casFeat_changeStatusBegin = jcas.getRequiredFeatureDE(casType, "changeStatusBegin", "uima.cas.Integer", featOkTst);
    casFeatCode_changeStatusBegin  = (null == casFeat_changeStatusBegin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_changeStatusBegin).getCode();

 
    casFeat_changeStatusEnd = jcas.getRequiredFeatureDE(casType, "changeStatusEnd", "uima.cas.Integer", featOkTst);
    casFeatCode_changeStatusEnd  = (null == casFeat_changeStatusEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_changeStatusEnd).getCode();

  }
}



    