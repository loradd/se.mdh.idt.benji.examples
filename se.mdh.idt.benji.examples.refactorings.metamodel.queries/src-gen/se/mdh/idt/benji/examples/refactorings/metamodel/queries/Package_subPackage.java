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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_classifier;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Package_subPackage extends BaseGeneratedEMFQuerySpecification<Package_subPackage.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.package_subPackage pattern,
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
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fPackage;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fSubPackage;
    
    private static List<String> parameterNames = makeImmutableList("package", "subPackage");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
      this.fPackage = pPackage;
      this.fSubPackage = pSubPackage;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("package".equals(parameterName)) return this.fPackage;
      if ("subPackage".equals(parameterName)) return this.fSubPackage;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getPackage() {
      return this.fPackage;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getSubPackage() {
      return this.fSubPackage;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("package".equals(parameterName) ) {
          this.fPackage = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("subPackage".equals(parameterName) ) {
          this.fSubPackage = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      return false;
    }
    
    public void setPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackage = pPackage;
    }
    
    public void setSubPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSubPackage = pSubPackage;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.package_subPackage";
    }
    
    @Override
    public List<String> parameterNames() {
      return Package_subPackage.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPackage, fSubPackage};
    }
    
    @Override
    public Package_subPackage.Match toImmutable() {
      return isMutable() ? newMatch(fPackage, fSubPackage) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"subPackage\"=" + prettyPrintValue(fSubPackage));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fPackage, fSubPackage);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Package_subPackage.Match)) {
          Package_subPackage.Match other = (Package_subPackage.Match) obj;
          return Objects.equals(fPackage, other.fPackage) && Objects.equals(fSubPackage, other.fSubPackage);
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
    public Package_subPackage specification() {
      return Package_subPackage.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Package_subPackage.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Package_subPackage.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
      return new Mutable(pPackage, pSubPackage);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Package_subPackage.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
      return new Immutable(pPackage, pSubPackage);
    }
    
    private static final class Mutable extends Package_subPackage.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
        super(pPackage, pSubPackage);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Package_subPackage.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
        super(pPackage, pSubPackage);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.package_subPackage pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // package - classifiers (subPackage)
   * pattern package_subPackage (^package : Package, subPackage : Package) {
   * 	find package_classifier (^package, subPackage); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Package_subPackage
   * 
   */
  public static class Matcher extends BaseMatcher<Package_subPackage.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Package_subPackage.Matcher on(final ViatraQueryEngine engine) {
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
    public static Package_subPackage.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_PACKAGE = 0;
    
    private final static int POSITION_SUBPACKAGE = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Package_subPackage.Matcher.class);
    
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
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Package_subPackage.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
      return rawGetAllMatches(new Object[]{pPackage, pSubPackage});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Package_subPackage.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
      return rawGetOneArbitraryMatch(new Object[]{pPackage, pSubPackage});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
      return rawHasMatch(new Object[]{pPackage, pSubPackage});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
      return rawCountMatches(new Object[]{pPackage, pSubPackage});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage, final IMatchProcessor<? super Package_subPackage.Match> processor) {
      rawForEachMatch(new Object[]{pPackage, pSubPackage}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage, final IMatchProcessor<? super Package_subPackage.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPackage, pSubPackage}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Package_subPackage.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
      return Package_subPackage.Match.newMatch(pPackage, pSubPackage);
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfpackage(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfpackage() {
      return rawAccumulateAllValuesOfpackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfpackage(final Package_subPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfpackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      null, 
      pSubPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfsubPackage(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_SUBPACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfsubPackage() {
      return rawAccumulateAllValuesOfsubPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfsubPackage(final Package_subPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfsubPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfsubPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      return rawAccumulateAllValuesOfsubPackage(new Object[]{
      pPackage, 
      null
      });
    }
    
    @Override
    protected Package_subPackage.Match tupleToMatch(final Tuple t) {
      try {
          return Package_subPackage.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_SUBPACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Package_subPackage.Match arrayToMatch(final Object[] match) {
      try {
          return Package_subPackage.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_SUBPACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Package_subPackage.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Package_subPackage.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_SUBPACKAGE]);
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
    public static IQuerySpecification<Package_subPackage.Matcher> querySpecification() {
      return Package_subPackage.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.package_subPackage pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Package_subPackage.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pSubPackage the value of pattern parameter subPackage in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pSubPackage);
    
    @Override
    public void process(final Package_subPackage.Match match) {
      process(match.getPackage(), match.getSubPackage());
    }
  }
  
  private Package_subPackage() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Package_subPackage instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Package_subPackage.Matcher instantiate(final ViatraQueryEngine engine) {
    return Package_subPackage.Matcher.on(engine);
  }
  
  @Override
  public Package_subPackage.Matcher instantiate() {
    return Package_subPackage.Matcher.create();
  }
  
  @Override
  public Package_subPackage.Match newEmptyMatch() {
    return Package_subPackage.Match.newEmptyMatch();
  }
  
  @Override
  public Package_subPackage.Match newMatch(final Object... parameters) {
    return Package_subPackage.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_subPackage (visibility: PUBLIC, simpleName: Package_subPackage, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_subPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_subPackage (visibility: PUBLIC, simpleName: Package_subPackage, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_subPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Package_subPackage INSTANCE = new Package_subPackage();
    
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
    private final static Package_subPackage.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSubPackage = new PParameter("subPackage", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pPackage, parameter_pSubPackage);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.package_subPackage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("package","subPackage");
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
          PVariable var_package = body.getOrCreateVariableByName("package");
          PVariable var_subPackage = body.getOrCreateVariableByName("subPackage");
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_subPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_subPackage, parameter_pSubPackage)
          ));
          // 	find package_classifier (^package, subPackage)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_subPackage), Package_classifier.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
