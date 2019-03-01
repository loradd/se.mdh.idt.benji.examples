/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
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
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_package;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // CDPR3 - Delete Package - Precondition
 *         pattern DeletePackagePrecondition ($package : Trace) {
 *         	find preserved_package($package);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class DeletePackagePrecondition extends BaseGeneratedEMFQuerySpecification<DeletePackagePrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition pattern,
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
    private Trace f$package;
    
    private static List<String> parameterNames = makeImmutableList("$package");
    
    private Match(final Trace p$package) {
      this.f$package = p$package;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      return null;
    }
    
    public Trace get$package() {
      return this.f$package;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$package".equals(parameterName) ) {
          this.f$package = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void set$package(final Trace p$package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$package = p$package;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return DeletePackagePrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$package};
    }
    
    @Override
    public DeletePackagePrecondition.Match toImmutable() {
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
      return Objects.hash(f$package);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DeletePackagePrecondition.Match)) {
          DeletePackagePrecondition.Match other = (DeletePackagePrecondition.Match) obj;
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
    public DeletePackagePrecondition specification() {
      return DeletePackagePrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DeletePackagePrecondition.Match newEmptyMatch() {
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
    public static DeletePackagePrecondition.Match newMutableMatch(final Trace p$package) {
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
    public static DeletePackagePrecondition.Match newMatch(final Trace p$package) {
      return new Immutable(p$package);
    }
    
    private static final class Mutable extends DeletePackagePrecondition.Match {
      Mutable(final Trace p$package) {
        super(p$package);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DeletePackagePrecondition.Match {
      Immutable(final Trace p$package) {
        super(p$package);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CDPR3 - Delete Package - Precondition
   * pattern DeletePackagePrecondition ($package : Trace) {
   * 	find preserved_package($package);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see DeletePackagePrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<DeletePackagePrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DeletePackagePrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static DeletePackagePrecondition.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_$PACKAGE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DeletePackagePrecondition.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
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
    public Collection<DeletePackagePrecondition.Match> getAllMatches(final Trace p$package) {
      return rawStreamAllMatches(new Object[]{p$package}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<DeletePackagePrecondition.Match> streamAllMatches(final Trace p$package) {
      return rawStreamAllMatches(new Object[]{p$package});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<DeletePackagePrecondition.Match> getOneArbitraryMatch(final Trace p$package) {
      return rawGetOneArbitraryMatch(new Object[]{p$package});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace p$package) {
      return rawHasMatch(new Object[]{p$package});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace p$package) {
      return rawCountMatches(new Object[]{p$package});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace p$package, final Consumer<? super DeletePackagePrecondition.Match> processor) {
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
    public boolean forOneArbitraryMatch(final Trace p$package, final Consumer<? super DeletePackagePrecondition.Match> processor) {
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
    public DeletePackagePrecondition.Match newMatch(final Trace p$package) {
      return DeletePackagePrecondition.Match.newMatch(p$package);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOf$package(final Object[] parameters) {
      return rawStreamAllValues(POSITION_$PACKAGE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$package() {
      return rawStreamAllValuesOf$package(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$package() {
      return rawStreamAllValuesOf$package(emptyArray());
    }
    
    @Override
    protected DeletePackagePrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return DeletePackagePrecondition.Match.newMatch((Trace) t.get(POSITION_$PACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DeletePackagePrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return DeletePackagePrecondition.Match.newMatch((Trace) match[POSITION_$PACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DeletePackagePrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DeletePackagePrecondition.Match.newMutableMatch((Trace) match[POSITION_$PACKAGE]);
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
    public static IQuerySpecification<DeletePackagePrecondition.Matcher> querySpecification() {
      return DeletePackagePrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<DeletePackagePrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * 
     */
    public abstract void accept(final Trace p$package);
    
    @Override
    public void accept(final DeletePackagePrecondition.Match match) {
      accept(match.get$package());
    }
  }
  
  private DeletePackagePrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DeletePackagePrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DeletePackagePrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return DeletePackagePrecondition.Matcher.on(engine);
  }
  
  @Override
  public DeletePackagePrecondition.Matcher instantiate() {
    return DeletePackagePrecondition.Matcher.create();
  }
  
  @Override
  public DeletePackagePrecondition.Match newEmptyMatch() {
    return DeletePackagePrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public DeletePackagePrecondition.Match newMatch(final Object... parameters) {
    return DeletePackagePrecondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition (visibility: PUBLIC, simpleName: DeletePackagePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition (visibility: PUBLIC, simpleName: DeletePackagePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final DeletePackagePrecondition INSTANCE = new DeletePackagePrecondition();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final DeletePackagePrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_$package = new PParameter("$package", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_$package);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition";
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
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_$package = body.getOrCreateVariableByName("$package");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_$package)
          ));
          // 	find preserved_package($package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package), Preserved_package.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
