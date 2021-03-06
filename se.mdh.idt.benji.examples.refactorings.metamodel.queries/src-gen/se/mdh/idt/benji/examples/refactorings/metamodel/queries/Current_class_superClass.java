/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/ClassQueries.vql
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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class;
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
public final class Current_class_superClass extends BaseGeneratedEMFQuerySpecification<Current_class_superClass.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_superClass pattern,
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
    private TraceLink fClass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_class;
    
    private TraceLink fSuperClass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_superClass;
    
    private static List<String> parameterNames = makeImmutableList("class", "current_class", "superClass", "current_superClass");
    
    private Match(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      this.fClass = pClass;
      this.fCurrent_class = pCurrent_class;
      this.fSuperClass = pSuperClass;
      this.fCurrent_superClass = pCurrent_superClass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("class".equals(parameterName)) return this.fClass;
      if ("current_class".equals(parameterName)) return this.fCurrent_class;
      if ("superClass".equals(parameterName)) return this.fSuperClass;
      if ("current_superClass".equals(parameterName)) return this.fCurrent_superClass;
      return null;
    }
    
    public TraceLink getValueOfClass() {
      return this.fClass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_class() {
      return this.fCurrent_class;
    }
    
    public TraceLink getSuperClass() {
      return this.fSuperClass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_superClass() {
      return this.fCurrent_superClass;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("class".equals(parameterName) ) {
          this.fClass = (TraceLink) newValue;
          return true;
      }
      if ("current_class".equals(parameterName) ) {
          this.fCurrent_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("superClass".equals(parameterName) ) {
          this.fSuperClass = (TraceLink) newValue;
          return true;
      }
      if ("current_superClass".equals(parameterName) ) {
          this.fCurrent_superClass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setClass(final TraceLink pClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClass = pClass;
    }
    
    public void setCurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_class = pCurrent_class;
    }
    
    public void setSuperClass(final TraceLink pSuperClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSuperClass = pSuperClass;
    }
    
    public void setCurrent_superClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_superClass = pCurrent_superClass;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_superClass";
    }
    
    @Override
    public List<String> parameterNames() {
      return Current_class_superClass.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClass, fCurrent_class, fSuperClass, fCurrent_superClass};
    }
    
    @Override
    public Current_class_superClass.Match toImmutable() {
      return isMutable() ? newMatch(fClass, fCurrent_class, fSuperClass, fCurrent_superClass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"class\"=" + prettyPrintValue(fClass) + ", ");
      result.append("\"current_class\"=" + prettyPrintValue(fCurrent_class) + ", ");
      result.append("\"superClass\"=" + prettyPrintValue(fSuperClass) + ", ");
      result.append("\"current_superClass\"=" + prettyPrintValue(fCurrent_superClass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fClass, fCurrent_class, fSuperClass, fCurrent_superClass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Current_class_superClass.Match)) {
          Current_class_superClass.Match other = (Current_class_superClass.Match) obj;
          return Objects.equals(fClass, other.fClass) && Objects.equals(fCurrent_class, other.fCurrent_class) && Objects.equals(fSuperClass, other.fSuperClass) && Objects.equals(fCurrent_superClass, other.fCurrent_superClass);
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
    public Current_class_superClass specification() {
      return Current_class_superClass.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Current_class_superClass.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pCurrent_superClass the fixed value of pattern parameter current_superClass, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Current_class_superClass.Match newMutableMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      return new Mutable(pClass, pCurrent_class, pSuperClass, pCurrent_superClass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pCurrent_superClass the fixed value of pattern parameter current_superClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Current_class_superClass.Match newMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      return new Immutable(pClass, pCurrent_class, pSuperClass, pCurrent_superClass);
    }
    
    private static final class Mutable extends Current_class_superClass.Match {
      Mutable(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
        super(pClass, pCurrent_class, pSuperClass, pCurrent_superClass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Current_class_superClass.Match {
      Immutable(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
        super(pClass, pCurrent_class, pSuperClass, pCurrent_superClass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_superClass pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // class - superClass - current
   * pattern current_class_superClass (class : TraceLink, current_class : Class, superClass : TraceLink, current_superClass : Class) {
   * 	find current_class (class, current_class);
   * 	find current_class (superClass, current_superClass);
   * 	Class.superClass (current_class, current_superClass);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Current_class_superClass
   * 
   */
  public static class Matcher extends BaseMatcher<Current_class_superClass.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Current_class_superClass.Matcher on(final ViatraQueryEngine engine) {
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
    public static Current_class_superClass.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CLASS = 0;
    
    private final static int POSITION_CURRENT_CLASS = 1;
    
    private final static int POSITION_SUPERCLASS = 2;
    
    private final static int POSITION_CURRENT_SUPERCLASS = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Current_class_superClass.Matcher.class);
    
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
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pCurrent_superClass the fixed value of pattern parameter current_superClass, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Current_class_superClass.Match> getAllMatches(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      return rawGetAllMatches(new Object[]{pClass, pCurrent_class, pSuperClass, pCurrent_superClass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pCurrent_superClass the fixed value of pattern parameter current_superClass, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Current_class_superClass.Match getOneArbitraryMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      return rawGetOneArbitraryMatch(new Object[]{pClass, pCurrent_class, pSuperClass, pCurrent_superClass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pCurrent_superClass the fixed value of pattern parameter current_superClass, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      return rawHasMatch(new Object[]{pClass, pCurrent_class, pSuperClass, pCurrent_superClass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pCurrent_superClass the fixed value of pattern parameter current_superClass, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      return rawCountMatches(new Object[]{pClass, pCurrent_class, pSuperClass, pCurrent_superClass});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pCurrent_superClass the fixed value of pattern parameter current_superClass, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass, final IMatchProcessor<? super Current_class_superClass.Match> processor) {
      rawForEachMatch(new Object[]{pClass, pCurrent_class, pSuperClass, pCurrent_superClass}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pCurrent_superClass the fixed value of pattern parameter current_superClass, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass, final IMatchProcessor<? super Current_class_superClass.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClass, pCurrent_class, pSuperClass, pCurrent_superClass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pCurrent_superClass the fixed value of pattern parameter current_superClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Current_class_superClass.Match newMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      return Current_class_superClass.Match.newMatch(pClass, pCurrent_class, pSuperClass, pCurrent_superClass);
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfclass(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclass() {
      return rawAccumulateAllValuesOfclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclass(final Current_class_superClass.Match partialMatch) {
      return rawAccumulateAllValuesOfclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      return rawAccumulateAllValuesOfclass(new Object[]{
      null, 
      pCurrent_class, 
      pSuperClass, 
      pCurrent_superClass
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final Current_class_superClass.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final TraceLink pClass, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      return rawAccumulateAllValuesOfcurrent_class(new Object[]{
      pClass, 
      null, 
      pSuperClass, 
      pCurrent_superClass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfsuperClass(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_SUPERCLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsuperClass() {
      return rawAccumulateAllValuesOfsuperClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsuperClass(final Current_class_superClass.Match partialMatch) {
      return rawAccumulateAllValuesOfsuperClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsuperClass(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass) {
      return rawAccumulateAllValuesOfsuperClass(new Object[]{
      pClass, 
      pCurrent_class, 
      null, 
      pCurrent_superClass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_superClass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_SUPERCLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_superClass() {
      return rawAccumulateAllValuesOfcurrent_superClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_superClass(final Current_class_superClass.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_superClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_superClass(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass) {
      return rawAccumulateAllValuesOfcurrent_superClass(new Object[]{
      pClass, 
      pCurrent_class, 
      pSuperClass, 
      null
      });
    }
    
    @Override
    protected Current_class_superClass.Match tupleToMatch(final Tuple t) {
      try {
          return Current_class_superClass.Match.newMatch((TraceLink) t.get(POSITION_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_CLASS), (TraceLink) t.get(POSITION_SUPERCLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_SUPERCLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_class_superClass.Match arrayToMatch(final Object[] match) {
      try {
          return Current_class_superClass.Match.newMatch((TraceLink) match[POSITION_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (TraceLink) match[POSITION_SUPERCLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_SUPERCLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_class_superClass.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Current_class_superClass.Match.newMutableMatch((TraceLink) match[POSITION_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (TraceLink) match[POSITION_SUPERCLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_SUPERCLASS]);
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
    public static IQuerySpecification<Current_class_superClass.Matcher> querySpecification() {
      return Current_class_superClass.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_superClass pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Current_class_superClass.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pClass the value of pattern parameter class in the currently processed match
     * @param pCurrent_class the value of pattern parameter current_class in the currently processed match
     * @param pSuperClass the value of pattern parameter superClass in the currently processed match
     * @param pCurrent_superClass the value of pattern parameter current_superClass in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSuperClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_superClass);
    
    @Override
    public void process(final Current_class_superClass.Match match) {
      process(match.getValueOfClass(), match.getCurrent_class(), match.getSuperClass(), match.getCurrent_superClass());
    }
  }
  
  private Current_class_superClass() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Current_class_superClass instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Current_class_superClass.Matcher instantiate(final ViatraQueryEngine engine) {
    return Current_class_superClass.Matcher.on(engine);
  }
  
  @Override
  public Current_class_superClass.Matcher instantiate() {
    return Current_class_superClass.Matcher.create();
  }
  
  @Override
  public Current_class_superClass.Match newEmptyMatch() {
    return Current_class_superClass.Match.newEmptyMatch();
  }
  
  @Override
  public Current_class_superClass.Match newMatch(final Object... parameters) {
    return Current_class_superClass.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_superClass (visibility: PUBLIC, simpleName: Current_class_superClass, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_superClass, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_superClass (visibility: PUBLIC, simpleName: Current_class_superClass, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_superClass, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Current_class_superClass INSTANCE = new Current_class_superClass();
    
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
    private final static Current_class_superClass.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClass = new PParameter("class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_class = new PParameter("current_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSuperClass = new PParameter("superClass", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_superClass = new PParameter("current_superClass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClass, parameter_pCurrent_class, parameter_pSuperClass, parameter_pCurrent_superClass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_superClass";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("class","current_class","superClass","current_superClass");
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
          PVariable var_class = body.getOrCreateVariableByName("class");
          PVariable var_current_class = body.getOrCreateVariableByName("current_class");
          PVariable var_superClass = body.getOrCreateVariableByName("superClass");
          PVariable var_current_superClass = body.getOrCreateVariableByName("current_superClass");
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_superClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_superClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_class, parameter_pClass),
             new ExportedParameter(body, var_current_class, parameter_pCurrent_class),
             new ExportedParameter(body, var_superClass, parameter_pSuperClass),
             new ExportedParameter(body, var_current_superClass, parameter_pCurrent_superClass)
          ));
          // 	find current_class (class, current_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_current_class), Current_class.instance().getInternalQueryRepresentation());
          // 	find current_class (superClass, current_superClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_superClass, var_current_superClass), Current_class.instance().getInternalQueryRepresentation());
          // 	Class.superClass (current_class, current_superClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class", "superClass")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new Equality(body, var__virtual_0_, var_current_superClass);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
