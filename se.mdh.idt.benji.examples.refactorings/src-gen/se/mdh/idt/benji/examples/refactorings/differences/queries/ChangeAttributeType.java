/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/ChangeAttributeType.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePrecondition;

/**
 * A pattern group formed of all public patterns defined in ChangeAttributeType.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ChangeAttributeType.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>ChangeAttributeTypePrecondition</li>
 * <li>ChangeAttributeTypePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class ChangeAttributeType extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ChangeAttributeType instance() {
    if (INSTANCE == null) {
        INSTANCE = new ChangeAttributeType();
    }
    return INSTANCE;
  }
  
  private static ChangeAttributeType INSTANCE;
  
  private ChangeAttributeType() {
    querySpecifications.add(ChangeAttributeTypePrecondition.instance());
    querySpecifications.add(ChangeAttributeTypePostcondition.instance());
  }
  
  public ChangeAttributeTypePrecondition getChangeAttributeTypePrecondition() {
    return ChangeAttributeTypePrecondition.instance();
  }
  
  public ChangeAttributeTypePrecondition.Matcher getChangeAttributeTypePrecondition(final ViatraQueryEngine engine) {
    return ChangeAttributeTypePrecondition.Matcher.on(engine);
  }
  
  public ChangeAttributeTypePostcondition getChangeAttributeTypePostcondition() {
    return ChangeAttributeTypePostcondition.instance();
  }
  
  public ChangeAttributeTypePostcondition.Matcher getChangeAttributeTypePostcondition(final ViatraQueryEngine engine) {
    return ChangeAttributeTypePostcondition.Matcher.on(engine);
  }
}
