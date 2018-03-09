/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Package.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_classifier;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Created_package extends BaseGeneratedEMFQuerySpecification<Created_package.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.created_package pattern,
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
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fCurrent_package;
    
    private static List<String> parameterNames = makeImmutableList("current_package");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      this.fCurrent_package = pCurrent_package;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_package() {
      return this.fCurrent_package;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("current_package".equals(parameterName) ) {
          this.fCurrent_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      return false;
    }
    
    public void setCurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_package = pCurrent_package;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.created_package";
    }
    
    @Override
    public List<String> parameterNames() {
      return Created_package.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fCurrent_package};
    }
    
    @Override
    public Created_package.Match toImmutable() {
      return isMutable() ? newMatch(fCurrent_package) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fCurrent_package);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Created_package.Match)) {
          Created_package.Match other = (Created_package.Match) obj;
          return Objects.equals(fCurrent_package, other.fCurrent_package);
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
    public Created_package specification() {
      return Created_package.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Created_package.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Created_package.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return new Mutable(pCurrent_package);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Created_package.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return new Immutable(pCurrent_package);
    }
    
    private static final class Mutable extends Created_package.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
        super(pCurrent_package);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Created_package.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
        super(pCurrent_package);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.created_package pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // package - created
   * pattern created_package (current_package : Package) {
   * 	find created_classifier (current_package); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Created_package
   * 
   */
  public static class Matcher extends BaseMatcher<Created_package.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Created_package.Matcher on(final ViatraQueryEngine engine) {
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
    public static Created_package.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CURRENT_PACKAGE = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Created_package.Matcher.class);
    
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
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Created_package.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawGetAllMatches(new Object[]{pCurrent_package});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Created_package.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawGetOneArbitraryMatch(new Object[]{pCurrent_package});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawHasMatch(new Object[]{pCurrent_package});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawCountMatches(new Object[]{pCurrent_package});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final IMatchProcessor<? super Created_package.Match> processor) {
      rawForEachMatch(new Object[]{pCurrent_package}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final IMatchProcessor<? super Created_package.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pCurrent_package}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Created_package.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return Created_package.Match.newMatch(pCurrent_package);
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfcurrent_package(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_CURRENT_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package() {
      return rawAccumulateAllValuesOfcurrent_package(emptyArray());
    }
    
    @Override
    protected Created_package.Match tupleToMatch(final Tuple t) {
      try {
          return Created_package.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Created_package.Match arrayToMatch(final Object[] match) {
      try {
          return Created_package.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Created_package.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Created_package.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE]);
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
    public static IQuerySpecification<Created_package.Matcher> querySpecification() {
      return Created_package.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.created_package pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Created_package.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package);
    
    @Override
    public void process(final Created_package.Match match) {
      process(match.getCurrent_package());
    }
  }
  
  private Created_package() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Created_package instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Created_package.Matcher instantiate(final ViatraQueryEngine engine) {
    return Created_package.Matcher.on(engine);
  }
  
  @Override
  public Created_package.Matcher instantiate() {
    return Created_package.Matcher.create();
  }
  
  @Override
  public Created_package.Match newEmptyMatch() {
    return Created_package.Match.newEmptyMatch();
  }
  
  @Override
  public Created_package.Match newMatch(final Object... parameters) {
    return Created_package.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_package (visibility: PUBLIC, simpleName: Created_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_package (visibility: PUBLIC, simpleName: Created_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Created_package INSTANCE = new Created_package();
    
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
    private final static Created_package.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pCurrent_package);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.created_package";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("current_package");
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
          PVariable var_current_package = body.getOrCreateVariableByName("current_package");
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package)
          ));
          // 	find created_classifier (current_package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_current_package), Created_classifier.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}