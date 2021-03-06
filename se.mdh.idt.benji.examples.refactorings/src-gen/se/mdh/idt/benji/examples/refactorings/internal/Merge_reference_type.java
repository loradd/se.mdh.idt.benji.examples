/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings.internal;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import se.mdh.idt.benji.examples.refactorings.internal.Get_class_superClass_intersection;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_reference_type;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:29+0200")
public final class Merge_reference_type extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private Merge_reference_type() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Merge_reference_type instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.internal.Merge_reference_type (visibility: PUBLIC, simpleName: Merge_reference_type, identifier: se.mdh.idt.benji.examples.refactorings.internal.Merge_reference_type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.internal.Merge_reference_type (visibility: PUBLIC, simpleName: Merge_reference_type, identifier: se.mdh.idt.benji.examples.refactorings.internal.Merge_reference_type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Merge_reference_type INSTANCE = new Merge_reference_type();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static Merge_reference_type.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$left_reference = new PParameter("$left_reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$right_reference = new PParameter("$right_reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$target_reference = new PParameter("$target_reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$left_reference, parameter_p$right_reference, parameter_p$target_reference);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.merge_reference_type";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$left_reference","$right_reference","$target_reference");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_$left_reference = body.getOrCreateVariableByName("$left_reference");
          PVariable var_$right_reference = body.getOrCreateVariableByName("$right_reference");
          PVariable var_$target_reference = body.getOrCreateVariableByName("$target_reference");
          PVariable var_$left_type = body.getOrCreateVariableByName("$left_type");
          PVariable var_$right_type = body.getOrCreateVariableByName("$right_type");
          PVariable var_$target_type = body.getOrCreateVariableByName("$target_type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$left_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$right_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$target_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$left_reference, parameter_p$left_reference),
             new ExportedParameter(body, var_$right_reference, parameter_p$right_reference),
             new ExportedParameter(body, var_$target_reference, parameter_p$target_reference)
          ));
          // 	find unset_reference_type ($left_reference, $left_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$left_reference, var_$left_type), Unset_reference_type.instance().getInternalQueryRepresentation());
          //  	find unset_reference_type ($right_reference, $right_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$right_reference, var_$right_type), Unset_reference_type.instance().getInternalQueryRepresentation());
          // 	find get_class_superClass_intersection ($left_type, $right_type, $target_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$left_type, var_$right_type, var_$target_type), Get_class_superClass_intersection.instance().getInternalQueryRepresentation());
          // 	find set_reference_type ($target_reference, $target_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$target_reference, var_$target_type), Set_reference_type.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
