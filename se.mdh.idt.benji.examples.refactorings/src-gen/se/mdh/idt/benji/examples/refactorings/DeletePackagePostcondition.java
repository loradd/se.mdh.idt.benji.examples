/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Delete_package;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:29+0200")
public final class DeletePackagePostcondition extends BaseGeneratedEMFQuerySpecification<DeletePackagePostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   *  @see Processor
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private TraceLink f$package;
    
    private static List<String> parameterNames = makeImmutableList("$package");
    
    private Match(final TraceLink p$package) {
      this.f$package = p$package;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      return null;
    }
    
    public TraceLink get$package() {
      return this.f$package;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$package".equals(parameterName) ) {
          this.f$package = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void set$package(final TraceLink p$package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$package = p$package;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return DeletePackagePostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$package};
    }
    
    @Override
    public DeletePackagePostcondition.Match toImmutable() {
      return isMutable() ? newMatch(f$package) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$package\"=" + prettyPrintValue(f$package));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$package);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DeletePackagePostcondition.Match)) {
          DeletePackagePostcondition.Match other = (DeletePackagePostcondition.Match) obj;
          return Objects.equals(f$package, other.f$package);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public DeletePackagePostcondition specification() {
      return DeletePackagePostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DeletePackagePostcondition.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DeletePackagePostcondition.Match newMutableMatch(final TraceLink p$package) {
      return new Mutable(p$package);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DeletePackagePostcondition.Match newMatch(final TraceLink p$package) {
      return new Immutable(p$package);
    }
    
    private static final class Mutable extends DeletePackagePostcondition.Match {
      Mutable(final TraceLink p$package) {
        super(p$package);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DeletePackagePostcondition.Match {
      Immutable(final TraceLink p$package) {
        super(p$package);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CDPR3 - Delete Package - Postcondition
   * pattern DeletePackagePostcondition ($package : TraceLink) {
   * 	find delete_package ($package);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see DeletePackagePostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<DeletePackagePostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DeletePackagePostcondition.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static DeletePackagePostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$PACKAGE = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DeletePackagePostcondition.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DeletePackagePostcondition.Match> getAllMatches(final TraceLink p$package) {
      return rawGetAllMatches(new Object[]{p$package});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public DeletePackagePostcondition.Match getOneArbitraryMatch(final TraceLink p$package) {
      return rawGetOneArbitraryMatch(new Object[]{p$package});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$package) {
      return rawHasMatch(new Object[]{p$package});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$package) {
      return rawCountMatches(new Object[]{p$package});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$package, final IMatchProcessor<? super DeletePackagePostcondition.Match> processor) {
      rawForEachMatch(new Object[]{p$package}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$package, final IMatchProcessor<? super DeletePackagePostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$package}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DeletePackagePostcondition.Match newMatch(final TraceLink p$package) {
      return DeletePackagePostcondition.Match.newMatch(p$package);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$package(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package() {
      return rawAccumulateAllValuesOf$package(emptyArray());
    }
    
    @Override
    protected DeletePackagePostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return DeletePackagePostcondition.Match.newMatch((TraceLink) t.get(POSITION_$PACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DeletePackagePostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return DeletePackagePostcondition.Match.newMatch((TraceLink) match[POSITION_$PACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DeletePackagePostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DeletePackagePostcondition.Match.newMutableMatch((TraceLink) match[POSITION_$PACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<DeletePackagePostcondition.Matcher> querySpecification() {
      return DeletePackagePostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<DeletePackagePostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$package);
    
    @Override
    public void process(final DeletePackagePostcondition.Match match) {
      process(match.get$package());
    }
  }
  
  private DeletePackagePostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DeletePackagePostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DeletePackagePostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return DeletePackagePostcondition.Matcher.on(engine);
  }
  
  @Override
  public DeletePackagePostcondition.Matcher instantiate() {
    return DeletePackagePostcondition.Matcher.create();
  }
  
  @Override
  public DeletePackagePostcondition.Match newEmptyMatch() {
    return DeletePackagePostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public DeletePackagePostcondition.Match newMatch(final Object... parameters) {
    return DeletePackagePostcondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition (visibility: PUBLIC, simpleName: DeletePackagePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition (visibility: PUBLIC, simpleName: DeletePackagePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static DeletePackagePostcondition INSTANCE = new DeletePackagePostcondition();
    
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
    private final static DeletePackagePostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$package = new PParameter("$package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$package);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$package");
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
          PVariable var_$package = body.getOrCreateVariableByName("$package");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_p$package)
          ));
          // 	find delete_package ($package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package), Delete_package.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
