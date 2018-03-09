/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/AddMetaclass.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_package_class;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class AddMetaclassPostcondition extends BaseGeneratedEMFQuerySpecification<AddMetaclassPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition pattern,
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
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_metaclass;
    
    private static List<String> parameterNames = makeImmutableList("initial_package", "current_package", "current_metaclass");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      this.fInitial_package = pInitial_package;
      this.fCurrent_package = pCurrent_package;
      this.fCurrent_metaclass = pCurrent_metaclass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      if ("current_metaclass".equals(parameterName)) return this.fCurrent_metaclass;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_package() {
      return this.fInitial_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_package() {
      return this.fCurrent_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_metaclass() {
      return this.fCurrent_metaclass;
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
      if ("current_metaclass".equals(parameterName) ) {
          this.fCurrent_metaclass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
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
    
    public void setCurrent_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_metaclass = pCurrent_metaclass;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return AddMetaclassPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_package, fCurrent_package, fCurrent_metaclass};
    }
    
    @Override
    public AddMetaclassPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_package, fCurrent_package, fCurrent_metaclass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package) + ", ");
      result.append("\"current_metaclass\"=" + prettyPrintValue(fCurrent_metaclass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_package, fCurrent_package, fCurrent_metaclass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AddMetaclassPostcondition.Match)) {
          AddMetaclassPostcondition.Match other = (AddMetaclassPostcondition.Match) obj;
          return Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fCurrent_package, other.fCurrent_package) && Objects.equals(fCurrent_metaclass, other.fCurrent_metaclass);
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
    public AddMetaclassPostcondition specification() {
      return AddMetaclassPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AddMetaclassPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AddMetaclassPostcondition.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return new Mutable(pInitial_package, pCurrent_package, pCurrent_metaclass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AddMetaclassPostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return new Immutable(pInitial_package, pCurrent_package, pCurrent_metaclass);
    }
    
    private static final class Mutable extends AddMetaclassPostcondition.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
        super(pInitial_package, pCurrent_package, pCurrent_metaclass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AddMetaclassPostcondition.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
        super(pInitial_package, pCurrent_package, pCurrent_metaclass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // AAC5 - Add Metaclass - Postcondition
   * pattern AddMetaclassPostcondition (initial_package : Package, current_package : Package, current_metaclass : Class) {
   * 	find added_package_class (initial_package, current_package, current_metaclass); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see AddMetaclassPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<AddMetaclassPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AddMetaclassPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static AddMetaclassPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_PACKAGE = 0;
    
    private final static int POSITION_CURRENT_PACKAGE = 1;
    
    private final static int POSITION_CURRENT_METACLASS = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AddMetaclassPostcondition.Matcher.class);
    
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
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AddMetaclassPostcondition.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return rawGetAllMatches(new Object[]{pInitial_package, pCurrent_package, pCurrent_metaclass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public AddMetaclassPostcondition.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pCurrent_metaclass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return rawHasMatch(new Object[]{pInitial_package, pCurrent_package, pCurrent_metaclass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return rawCountMatches(new Object[]{pInitial_package, pCurrent_package, pCurrent_metaclass});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final IMatchProcessor<? super AddMetaclassPostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_package, pCurrent_package, pCurrent_metaclass}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final IMatchProcessor<? super AddMetaclassPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pCurrent_metaclass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AddMetaclassPostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return AddMetaclassPostcondition.Match.newMatch(pInitial_package, pCurrent_package, pCurrent_metaclass);
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final AddMetaclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      null, 
      pCurrent_package, 
      pCurrent_metaclass
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final AddMetaclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pInitial_package, 
      null, 
      pCurrent_metaclass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_metaclass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_METACLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_metaclass() {
      return rawAccumulateAllValuesOfcurrent_metaclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_metaclass(final AddMetaclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawAccumulateAllValuesOfcurrent_metaclass(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      null
      });
    }
    
    @Override
    protected AddMetaclassPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return AddMetaclassPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_METACLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddMetaclassPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return AddMetaclassPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_METACLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddMetaclassPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AddMetaclassPostcondition.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_METACLASS]);
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
    public static IQuerySpecification<AddMetaclassPostcondition.Matcher> querySpecification() {
      return AddMetaclassPostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<AddMetaclassPostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * @param pCurrent_metaclass the value of pattern parameter current_metaclass in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass);
    
    @Override
    public void process(final AddMetaclassPostcondition.Match match) {
      process(match.getInitial_package(), match.getCurrent_package(), match.getCurrent_metaclass());
    }
  }
  
  private AddMetaclassPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AddMetaclassPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AddMetaclassPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return AddMetaclassPostcondition.Matcher.on(engine);
  }
  
  @Override
  public AddMetaclassPostcondition.Matcher instantiate() {
    return AddMetaclassPostcondition.Matcher.create();
  }
  
  @Override
  public AddMetaclassPostcondition.Match newEmptyMatch() {
    return AddMetaclassPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public AddMetaclassPostcondition.Match newMatch(final Object... parameters) {
    return AddMetaclassPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition (visibility: PUBLIC, simpleName: AddMetaclassPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition (visibility: PUBLIC, simpleName: AddMetaclassPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AddMetaclassPostcondition INSTANCE = new AddMetaclassPostcondition();
    
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
    private final static AddMetaclassPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_metaclass = new PParameter("current_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_package, parameter_pCurrent_package, parameter_pCurrent_metaclass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_package","current_package","current_metaclass");
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
          PVariable var_current_metaclass = body.getOrCreateVariableByName("current_metaclass");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package),
             new ExportedParameter(body, var_current_metaclass, parameter_pCurrent_metaclass)
          ));
          // 	find added_package_class (initial_package, current_package, current_metaclass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_current_metaclass), Added_package_class.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
