/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Class.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Preserved_class_abstract extends BaseGeneratedEMFQuerySpecification<Preserved_class_abstract.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_class_abstract pattern,
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
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_class;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_class;
    
    private Boolean fInitial_abstract;
    
    private Boolean fCurrent_abstract;
    
    private static List<String> parameterNames = makeImmutableList("initial_class", "current_class", "initial_abstract", "current_abstract");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
      this.fInitial_class = pInitial_class;
      this.fCurrent_class = pCurrent_class;
      this.fInitial_abstract = pInitial_abstract;
      this.fCurrent_abstract = pCurrent_abstract;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_class".equals(parameterName)) return this.fInitial_class;
      if ("current_class".equals(parameterName)) return this.fCurrent_class;
      if ("initial_abstract".equals(parameterName)) return this.fInitial_abstract;
      if ("current_abstract".equals(parameterName)) return this.fCurrent_abstract;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_class() {
      return this.fInitial_class;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_class() {
      return this.fCurrent_class;
    }
    
    public Boolean getInitial_abstract() {
      return this.fInitial_abstract;
    }
    
    public Boolean getCurrent_abstract() {
      return this.fCurrent_abstract;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_class".equals(parameterName) ) {
          this.fInitial_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_class".equals(parameterName) ) {
          this.fCurrent_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("initial_abstract".equals(parameterName) ) {
          this.fInitial_abstract = (Boolean) newValue;
          return true;
      }
      if ("current_abstract".equals(parameterName) ) {
          this.fCurrent_abstract = (Boolean) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_class = pInitial_class;
    }
    
    public void setCurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_class = pCurrent_class;
    }
    
    public void setInitial_abstract(final Boolean pInitial_abstract) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_abstract = pInitial_abstract;
    }
    
    public void setCurrent_abstract(final Boolean pCurrent_abstract) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_abstract = pCurrent_abstract;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_class_abstract";
    }
    
    @Override
    public List<String> parameterNames() {
      return Preserved_class_abstract.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_class, fCurrent_class, fInitial_abstract, fCurrent_abstract};
    }
    
    @Override
    public Preserved_class_abstract.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_class, fCurrent_class, fInitial_abstract, fCurrent_abstract) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_class\"=" + prettyPrintValue(fInitial_class) + ", ");
      result.append("\"current_class\"=" + prettyPrintValue(fCurrent_class) + ", ");
      result.append("\"initial_abstract\"=" + prettyPrintValue(fInitial_abstract) + ", ");
      result.append("\"current_abstract\"=" + prettyPrintValue(fCurrent_abstract));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_class, fCurrent_class, fInitial_abstract, fCurrent_abstract);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Preserved_class_abstract.Match)) {
          Preserved_class_abstract.Match other = (Preserved_class_abstract.Match) obj;
          return Objects.equals(fInitial_class, other.fInitial_class) && Objects.equals(fCurrent_class, other.fCurrent_class) && Objects.equals(fInitial_abstract, other.fInitial_abstract) && Objects.equals(fCurrent_abstract, other.fCurrent_abstract);
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
    public Preserved_class_abstract specification() {
      return Preserved_class_abstract.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Preserved_class_abstract.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_abstract the fixed value of pattern parameter initial_abstract, or null if not bound.
     * @param pCurrent_abstract the fixed value of pattern parameter current_abstract, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Preserved_class_abstract.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
      return new Mutable(pInitial_class, pCurrent_class, pInitial_abstract, pCurrent_abstract);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_abstract the fixed value of pattern parameter initial_abstract, or null if not bound.
     * @param pCurrent_abstract the fixed value of pattern parameter current_abstract, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Preserved_class_abstract.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
      return new Immutable(pInitial_class, pCurrent_class, pInitial_abstract, pCurrent_abstract);
    }
    
    private static final class Mutable extends Preserved_class_abstract.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
        super(pInitial_class, pCurrent_class, pInitial_abstract, pCurrent_abstract);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Preserved_class_abstract.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
        super(pInitial_class, pCurrent_class, pInitial_abstract, pCurrent_abstract);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_class_abstract pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // class - abstract - preserved
   * pattern preserved_class_abstract (initial_class : Class, current_class : Class, initial_abstract : java Boolean, current_abstract : java Boolean) {
   * 	find preserved_class (initial_class, current_class); 
   * 	find class_abstract (initial_class, initial_abstract); 
   * 	find class_abstract (current_class, current_abstract); 
   * 	check (initial_abstract == current_abstract); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Preserved_class_abstract
   * 
   */
  public static class Matcher extends BaseMatcher<Preserved_class_abstract.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Preserved_class_abstract.Matcher on(final ViatraQueryEngine engine) {
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
    public static Preserved_class_abstract.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_CLASS = 0;
    
    private final static int POSITION_CURRENT_CLASS = 1;
    
    private final static int POSITION_INITIAL_ABSTRACT = 2;
    
    private final static int POSITION_CURRENT_ABSTRACT = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Preserved_class_abstract.Matcher.class);
    
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
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_abstract the fixed value of pattern parameter initial_abstract, or null if not bound.
     * @param pCurrent_abstract the fixed value of pattern parameter current_abstract, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Preserved_class_abstract.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
      return rawGetAllMatches(new Object[]{pInitial_class, pCurrent_class, pInitial_abstract, pCurrent_abstract});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_abstract the fixed value of pattern parameter initial_abstract, or null if not bound.
     * @param pCurrent_abstract the fixed value of pattern parameter current_abstract, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Preserved_class_abstract.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_abstract, pCurrent_abstract});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_abstract the fixed value of pattern parameter initial_abstract, or null if not bound.
     * @param pCurrent_abstract the fixed value of pattern parameter current_abstract, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
      return rawHasMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_abstract, pCurrent_abstract});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_abstract the fixed value of pattern parameter initial_abstract, or null if not bound.
     * @param pCurrent_abstract the fixed value of pattern parameter current_abstract, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
      return rawCountMatches(new Object[]{pInitial_class, pCurrent_class, pInitial_abstract, pCurrent_abstract});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_abstract the fixed value of pattern parameter initial_abstract, or null if not bound.
     * @param pCurrent_abstract the fixed value of pattern parameter current_abstract, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract, final IMatchProcessor<? super Preserved_class_abstract.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_abstract, pCurrent_abstract}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_abstract the fixed value of pattern parameter initial_abstract, or null if not bound.
     * @param pCurrent_abstract the fixed value of pattern parameter current_abstract, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract, final IMatchProcessor<? super Preserved_class_abstract.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_abstract, pCurrent_abstract}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_abstract the fixed value of pattern parameter initial_abstract, or null if not bound.
     * @param pCurrent_abstract the fixed value of pattern parameter current_abstract, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Preserved_class_abstract.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
      return Preserved_class_abstract.Match.newMatch(pInitial_class, pCurrent_class, pInitial_abstract, pCurrent_abstract);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_class(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class() {
      return rawAccumulateAllValuesOfinitial_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final Preserved_class_abstract.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
      return rawAccumulateAllValuesOfinitial_class(new Object[]{
      null, 
      pCurrent_class, 
      pInitial_abstract, 
      pCurrent_abstract
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_class(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class() {
      return rawAccumulateAllValuesOfcurrent_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final Preserved_class_abstract.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract) {
      return rawAccumulateAllValuesOfcurrent_class(new Object[]{
      pInitial_class, 
      null, 
      pInitial_abstract, 
      pCurrent_abstract
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_abstract.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Boolean> rawAccumulateAllValuesOfinitial_abstract(final Object[] parameters) {
      Set<Boolean> results = new HashSet<Boolean>();
      rawAccumulateAllValues(POSITION_INITIAL_ABSTRACT, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_abstract.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfinitial_abstract() {
      return rawAccumulateAllValuesOfinitial_abstract(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_abstract.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfinitial_abstract(final Preserved_class_abstract.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_abstract(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_abstract.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfinitial_abstract(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pCurrent_abstract) {
      return rawAccumulateAllValuesOfinitial_abstract(new Object[]{
      pInitial_class, 
      pCurrent_class, 
      null, 
      pCurrent_abstract
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_abstract.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Boolean> rawAccumulateAllValuesOfcurrent_abstract(final Object[] parameters) {
      Set<Boolean> results = new HashSet<Boolean>();
      rawAccumulateAllValues(POSITION_CURRENT_ABSTRACT, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_abstract.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfcurrent_abstract() {
      return rawAccumulateAllValuesOfcurrent_abstract(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_abstract.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfcurrent_abstract(final Preserved_class_abstract.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_abstract(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_abstract.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfcurrent_abstract(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract) {
      return rawAccumulateAllValuesOfcurrent_abstract(new Object[]{
      pInitial_class, 
      pCurrent_class, 
      pInitial_abstract, 
      null
      });
    }
    
    @Override
    protected Preserved_class_abstract.Match tupleToMatch(final Tuple t) {
      try {
          return Preserved_class_abstract.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_CLASS), (Boolean) t.get(POSITION_INITIAL_ABSTRACT), (Boolean) t.get(POSITION_CURRENT_ABSTRACT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_class_abstract.Match arrayToMatch(final Object[] match) {
      try {
          return Preserved_class_abstract.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (Boolean) match[POSITION_INITIAL_ABSTRACT], (Boolean) match[POSITION_CURRENT_ABSTRACT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_class_abstract.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Preserved_class_abstract.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (Boolean) match[POSITION_INITIAL_ABSTRACT], (Boolean) match[POSITION_CURRENT_ABSTRACT]);
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
    public static IQuerySpecification<Preserved_class_abstract.Matcher> querySpecification() {
      return Preserved_class_abstract.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_class_abstract pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Preserved_class_abstract.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_class the value of pattern parameter initial_class in the currently processed match
     * @param pCurrent_class the value of pattern parameter current_class in the currently processed match
     * @param pInitial_abstract the value of pattern parameter initial_abstract in the currently processed match
     * @param pCurrent_abstract the value of pattern parameter current_abstract in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Boolean pInitial_abstract, final Boolean pCurrent_abstract);
    
    @Override
    public void process(final Preserved_class_abstract.Match match) {
      process(match.getInitial_class(), match.getCurrent_class(), match.getInitial_abstract(), match.getCurrent_abstract());
    }
  }
  
  private Preserved_class_abstract() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Preserved_class_abstract instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Preserved_class_abstract.Matcher instantiate(final ViatraQueryEngine engine) {
    return Preserved_class_abstract.Matcher.on(engine);
  }
  
  @Override
  public Preserved_class_abstract.Matcher instantiate() {
    return Preserved_class_abstract.Matcher.create();
  }
  
  @Override
  public Preserved_class_abstract.Match newEmptyMatch() {
    return Preserved_class_abstract.Match.newEmptyMatch();
  }
  
  @Override
  public Preserved_class_abstract.Match newMatch(final Object... parameters) {
    return Preserved_class_abstract.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1], (java.lang.Boolean) parameters[2], (java.lang.Boolean) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_abstract (visibility: PUBLIC, simpleName: Preserved_class_abstract, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_abstract, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_abstract (visibility: PUBLIC, simpleName: Preserved_class_abstract, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_abstract, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Preserved_class_abstract INSTANCE = new Preserved_class_abstract();
    
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
    private final static Preserved_class_abstract.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_class = new PParameter("initial_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_class = new PParameter("current_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_abstract = new PParameter("initial_abstract", "java.lang.Boolean", new JavaTransitiveInstancesKey(java.lang.Boolean.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_abstract = new PParameter("current_abstract", "java.lang.Boolean", new JavaTransitiveInstancesKey(java.lang.Boolean.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_class, parameter_pCurrent_class, parameter_pInitial_abstract, parameter_pCurrent_abstract);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_class_abstract";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_class","current_class","initial_abstract","current_abstract");
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
          PVariable var_initial_class = body.getOrCreateVariableByName("initial_class");
          PVariable var_current_class = body.getOrCreateVariableByName("current_class");
          PVariable var_initial_abstract = body.getOrCreateVariableByName("initial_abstract");
          PVariable var_current_abstract = body.getOrCreateVariableByName("current_abstract");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_initial_abstract), new JavaTransitiveInstancesKey(java.lang.Boolean.class));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_current_abstract), new JavaTransitiveInstancesKey(java.lang.Boolean.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_class, parameter_pInitial_class),
             new ExportedParameter(body, var_current_class, parameter_pCurrent_class),
             new ExportedParameter(body, var_initial_abstract, parameter_pInitial_abstract),
             new ExportedParameter(body, var_current_abstract, parameter_pCurrent_abstract)
          ));
          // 	find preserved_class (initial_class, current_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_class, var_current_class), Preserved_class.instance().getInternalQueryRepresentation());
          //  	find class_abstract (initial_class, initial_abstract)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_class, var_initial_abstract), Class_abstract.instance().getInternalQueryRepresentation());
          //  	find class_abstract (current_class, current_abstract)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_current_class, var_current_abstract), Class_abstract.instance().getInternalQueryRepresentation());
          //  	check (initial_abstract == current_abstract)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern preserved_class_abstract";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("current_abstract", "initial_abstract");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Boolean current_abstract = (Boolean) provider.getValue("current_abstract");
                  Boolean initial_abstract = (Boolean) provider.getValue("initial_abstract");
                  return evaluateExpression_1_1(current_abstract, initial_abstract);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Boolean current_abstract, final Boolean initial_abstract) {
    boolean _equals = com.google.common.base.Objects.equal(initial_abstract, current_abstract);
    return _equals;
  }
}
