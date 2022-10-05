
/* First created by JCasGen Wed Sep 28 02:45:13 CST 2022 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** A verb phrase
Equivalent to cTAKES: edu.mayo.bmi.uima.chunker.type.VP
 * Updated by JCasGen Wed Sep 28 02:45:13 CST 2022
 * @generated */
public class VP_Type extends Chunk_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = VP.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.syntax.VP");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public VP_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    