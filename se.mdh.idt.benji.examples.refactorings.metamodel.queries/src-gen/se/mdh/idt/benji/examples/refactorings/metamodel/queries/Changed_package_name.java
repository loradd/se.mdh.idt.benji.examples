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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Changed_package_name extends BaseGeneratedEMFQuerySpecification<Changed_package_name.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_package_name pattern,
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
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fInitial_package;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fCurrent_package;
    
    private String fInitial_name;
    
    private String fCurrent_name;
    
    private static List<String> parameterNames = makeImmutableList("initial_package", "current_package", "initial_name", "current_name");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name) {
      this.fInitial_package = pInitial_package;
      this.fCurrent_package = pCurrent_package;
      this.fInitial_name = pInitial_name;
      this.fCurrent_name = pCurrent_name;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      if ("initial_name".equals(parameterName)) return this.fInitial_name;
      if ("current_name".equals(parameterName)) return this.fCurrent_name;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_package() {
      return this.fInitial_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_package() {
      return this.fCurrent_package;
    }
    
    public String getInitial_name() {
      return this.fInitial_name;
    }
    
    public String getCurrent_name() {
      return this.fCurrent_name;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_package".equals(parameterName) ) {
          this.fInitial_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("current_package".equals(parameterName) ) {
          this.fCurrent_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("initial_name".equals(parameterName) ) {
          this.fInitial_name = (String) newValue;
          return true;
      }
      if ("current_name".equals(parameterName) ) {
          this.fCurrent_name = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_package = pInitial_package;
    }
    
    public void setCurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_package = pCurrent_package;
    }
    
    public void setInitial_name(final String pInitial_name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_name = pInitial_name;
    }
    
    public void setCurrent_name(final String pCurrent_name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_name = pCurrent_name;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_package_name";
    }
    
    @Override
    public List<String> parameterNames() {
      return Changed_package_name.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_package, fCurrent_package, fInitial_name, fCurrent_name};
    }
    
    @Override
    public Changed_package_name.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_package, fCurrent_package, fInitial_name, fCurrent_name) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package) + ", ");
      result.append("\"initial_name\"=" + prettyPrintValue(fInitial_name) + ", ");
      result.append("\"current_name\"=" + prettyPrintValue(fCurrent_name));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_package, fCurrent_package, fInitial_name, fCurrent_name);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Changed_package_name.Match)) {
          Changed_package_name.Match other = (Changed_package_name.Match) obj;
          return Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fCurrent_package, other.fCurrent_package) && Objects.equals(fInitial_name, other.fInitial_name) && Objects.equals(fCurrent_name, other.fCurrent_name);
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
    public Changed_package_name specification() {
      return Changed_package_name.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Changed_package_name.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_name the fixed value of pattern parameter initial_name, or null if not bound.
     * @param pCurrent_name the fixed value of pattern parameter current_name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Changed_package_name.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name) {
      return new Mutable(pInitial_package, pCurrent_package, pInitial_name, pCurrent_name);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_name the fixed value of pattern parameter initial_name, or null if not bound.
     * @param pCurrent_name the fixed value of pattern parameter current_name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Changed_package_name.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name) {
      return new Immutable(pInitial_package, pCurrent_package, pInitial_name, pCurrent_name);
    }
    
    private static final class Mutable extends Changed_package_name.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name) {
        super(pInitial_package, pCurrent_package, pInitial_name, pCurrent_name);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Changed_package_name.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name) {
        super(pInitial_package, pCurrent_package, pInitial_name, pCurrent_name);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_package_name pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // package - name - changed
   * pattern changed_package_name (initial_package : Package, current_package : Package, initial_name : java String, current_name : java String) {
   * 	find preserved_package (initial_package, current_package); 
   * 	find package_name (initial_package, initial_name); 
   * 	find package_name (current_package, current_name); 
   * 	check (initial_name != current_name); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Changed_package_name
   * 
   */
  public static class Matcher extends BaseMatcher<Changed_package_name.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Changed_package_name.Matcher on(final ViatraQueryEngine engine) {
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
    public static Changed_package_name.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_PACKAGE = 0;
    
    private final static int POSITION_CURRENT_PACKAGE = 1;
    
    private final static int POSITION_INITIAL_NAME = 2;
    
    private final static int POSITION_CURRENT_NAME = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Changed_package_name.Matcher.class);
    
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
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_name the fixed value of pattern parameter initial_name, or null if not bound.
     * @param pCurrent_name the fixed value of pattern parameter current_name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Changed_package_name.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name) {
      return rawGetAllMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_name, pCurrent_name});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_name the fixed value of pattern parameter initial_name, or null if not bound.
     * @param pCurrent_name the fixed value of pattern parameter current_name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Changed_package_name.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_name, pCurrent_name});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_name the fixed value of pattern parameter initial_name, or null if not bound.
     * @param pCurrent_name the fixed value of pattern parameter current_name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name) {
      return rawHasMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_name, pCurrent_name});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_name the fixed value of pattern parameter initial_name, or null if not bound.
     * @param pCurrent_name the fixed value of pattern parameter current_name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name) {
      return rawCountMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_name, pCurrent_name});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_name the fixed value of pattern parameter initial_name, or null if not bound.
     * @param pCurrent_name the fixed value of pattern parameter current_name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name, final IMatchProcessor<? super Changed_package_name.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_name, pCurrent_name}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_name the fixed value of pattern parameter initial_name, or null if not bound.
     * @param pCurrent_name the fixed value of pattern parameter current_name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name, final IMatchProcessor<? super Changed_package_name.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_name, pCurrent_name}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_name the fixed value of pattern parameter initial_name, or null if not bound.
     * @param pCurrent_name the fixed value of pattern parameter current_name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Changed_package_name.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name) {
      return Changed_package_name.Match.newMatch(pInitial_package, pCurrent_package, pInitial_name, pCurrent_name);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfinitial_package(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_INITIAL_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package() {
      return rawAccumulateAllValuesOfinitial_package(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final Changed_package_name.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      null, 
      pCurrent_package, 
      pInitial_name, 
      pCurrent_name
      });
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
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final Changed_package_name.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final String pInitial_name, final String pCurrent_name) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pInitial_package, 
      null, 
      pInitial_name, 
      pCurrent_name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOfinitial_name(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_INITIAL_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfinitial_name() {
      return rawAccumulateAllValuesOfinitial_name(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfinitial_name(final Changed_package_name.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfinitial_name(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pCurrent_name) {
      return rawAccumulateAllValuesOfinitial_name(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      null, 
      pCurrent_name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOfcurrent_name(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_CURRENT_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfcurrent_name() {
      return rawAccumulateAllValuesOfcurrent_name(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfcurrent_name(final Changed_package_name.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfcurrent_name(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name) {
      return rawAccumulateAllValuesOfcurrent_name(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_name, 
      null
      });
    }
    
    @Override
    protected Changed_package_name.Match tupleToMatch(final Tuple t) {
      try {
          return Changed_package_name.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE), (String) t.get(POSITION_INITIAL_NAME), (String) t.get(POSITION_CURRENT_NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Changed_package_name.Match arrayToMatch(final Object[] match) {
      try {
          return Changed_package_name.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (String) match[POSITION_INITIAL_NAME], (String) match[POSITION_CURRENT_NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Changed_package_name.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Changed_package_name.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (String) match[POSITION_INITIAL_NAME], (String) match[POSITION_CURRENT_NAME]);
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
    public static IQuerySpecification<Changed_package_name.Matcher> querySpecification() {
      return Changed_package_name.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_package_name pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Changed_package_name.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * @param pInitial_name the value of pattern parameter initial_name in the currently processed match
     * @param pCurrent_name the value of pattern parameter current_name in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final String pInitial_name, final String pCurrent_name);
    
    @Override
    public void process(final Changed_package_name.Match match) {
      process(match.getInitial_package(), match.getCurrent_package(), match.getInitial_name(), match.getCurrent_name());
    }
  }
  
  private Changed_package_name() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Changed_package_name instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Changed_package_name.Matcher instantiate(final ViatraQueryEngine engine) {
    return Changed_package_name.Matcher.on(engine);
  }
  
  @Override
  public Changed_package_name.Matcher instantiate() {
    return Changed_package_name.Matcher.create();
  }
  
  @Override
  public Changed_package_name.Match newEmptyMatch() {
    return Changed_package_name.Match.newEmptyMatch();
  }
  
  @Override
  public Changed_package_name.Match newMatch(final Object... parameters) {
    return Changed_package_name.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (java.lang.String) parameters[2], (java.lang.String) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_package_name (visibility: PUBLIC, simpleName: Changed_package_name, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_package_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_package_name (visibility: PUBLIC, simpleName: Changed_package_name, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_package_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Changed_package_name INSTANCE = new Changed_package_name();
    
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
    private final static Changed_package_name.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_name = new PParameter("initial_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_name = new PParameter("current_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_package, parameter_pCurrent_package, parameter_pInitial_name, parameter_pCurrent_name);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_package_name";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_package","current_package","initial_name","current_name");
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
          PVariable var_initial_package = body.getOrCreateVariableByName("initial_package");
          PVariable var_current_package = body.getOrCreateVariableByName("current_package");
          PVariable var_initial_name = body.getOrCreateVariableByName("initial_name");
          PVariable var_current_name = body.getOrCreateVariableByName("current_name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_initial_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_current_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package),
             new ExportedParameter(body, var_initial_name, parameter_pInitial_name),
             new ExportedParameter(body, var_current_name, parameter_pCurrent_name)
          ));
          // 	find preserved_package (initial_package, current_package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package), Preserved_package.instance().getInternalQueryRepresentation());
          //  	find package_name (initial_package, initial_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_initial_name), Package_name.instance().getInternalQueryRepresentation());
          //  	find package_name (current_package, current_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_current_package, var_current_name), Package_name.instance().getInternalQueryRepresentation());
          //  	check (initial_name != current_name)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern changed_package_name";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("current_name", "initial_name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String current_name = (String) provider.getValue("current_name");
                  String initial_name = (String) provider.getValue("initial_name");
                  return evaluateExpression_1_1(current_name, initial_name);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final String current_name, final String initial_name) {
    boolean _notEquals = (!com.google.common.base.Objects.equal(initial_name, current_name));
    return _notEquals;
  }
}
