
/* First created by JCasGen Wed Sep 28 02:45:13 CST 2022 */
package org.apache.ctakes.typesystem.type.syntax;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** Differentiates a token as being a newline rather than a punctuation, symbol, contraction, word, or number. 
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.NewlineToken
 * Updated by JCasGen Wed Sep 28 02:45:13 CST 2022
 * @generated */
public class NewlineToken_Type extends BaseToken_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NewlineToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.syntax.NewlineToken");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NewlineToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    