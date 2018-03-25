/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/StructuralFeature.vql
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:19+0200")
public final class Initial_structuralFeature_lower extends BaseGeneratedEMFQuerySpecification<Initial_structuralFeature_lower.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_structuralFeature_lower pattern,
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
    private TraceLink fStructuralFeature;
    
    private StructuralFeature fInitial_structuralFeature;
    
    private Integer fLower;
    
    private static List<String> parameterNames = makeImmutableList("structuralFeature", "initial_structuralFeature", "lower");
    
    private Match(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower) {
      this.fStructuralFeature = pStructuralFeature;
      this.fInitial_structuralFeature = pInitial_structuralFeature;
      this.fLower = pLower;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("structuralFeature".equals(parameterName)) return this.fStructuralFeature;
      if ("initial_structuralFeature".equals(parameterName)) return this.fInitial_structuralFeature;
      if ("lower".equals(parameterName)) return this.fLower;
      return null;
    }
    
    public TraceLink getStructuralFeature() {
      return this.fStructuralFeature;
    }
    
    public StructuralFeature getInitial_structuralFeature() {
      return this.fInitial_structuralFeature;
    }
    
    public Integer getLower() {
      return this.fLower;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("structuralFeature".equals(parameterName) ) {
          this.fStructuralFeature = (TraceLink) newValue;
          return true;
      }
      if ("initial_structuralFeature".equals(parameterName) ) {
          this.fInitial_structuralFeature = (StructuralFeature) newValue;
          return true;
      }
      if ("lower".equals(parameterName) ) {
          this.fLower = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void setStructuralFeature(final TraceLink pStructuralFeature) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStructuralFeature = pStructuralFeature;
    }
    
    public void setInitial_structuralFeature(final StructuralFeature pInitial_structuralFeature) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_structuralFeature = pInitial_structuralFeature;
    }
    
    public void setLower(final Integer pLower) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLower = pLower;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_structuralFeature_lower";
    }
    
    @Override
    public List<String> parameterNames() {
      return Initial_structuralFeature_lower.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fStructuralFeature, fInitial_structuralFeature, fLower};
    }
    
    @Override
    public Initial_structuralFeature_lower.Match toImmutable() {
      return isMutable() ? newMatch(fStructuralFeature, fInitial_structuralFeature, fLower) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"structuralFeature\"=" + prettyPrintValue(fStructuralFeature) + ", ");
      result.append("\"initial_structuralFeature\"=" + prettyPrintValue(fInitial_structuralFeature) + ", ");
      result.append("\"lower\"=" + prettyPrintValue(fLower));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fStructuralFeature, fInitial_structuralFeature, fLower);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Initial_structuralFeature_lower.Match)) {
          Initial_structuralFeature_lower.Match other = (Initial_structuralFeature_lower.Match) obj;
          return Objects.equals(fStructuralFeature, other.fStructuralFeature) && Objects.equals(fInitial_structuralFeature, other.fInitial_structuralFeature) && Objects.equals(fLower, other.fLower);
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
    public Initial_structuralFeature_lower specification() {
      return Initial_structuralFeature_lower.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Initial_structuralFeature_lower.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pLower the fixed value of pattern parameter lower, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Initial_structuralFeature_lower.Match newMutableMatch(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower) {
      return new Mutable(pStructuralFeature, pInitial_structuralFeature, pLower);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pLower the fixed value of pattern parameter lower, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Initial_structuralFeature_lower.Match newMatch(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower) {
      return new Immutable(pStructuralFeature, pInitial_structuralFeature, pLower);
    }
    
    private static final class Mutable extends Initial_structuralFeature_lower.Match {
      Mutable(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower) {
        super(pStructuralFeature, pInitial_structuralFeature, pLower);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Initial_structuralFeature_lower.Match {
      Immutable(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower) {
        super(pStructuralFeature, pInitial_structuralFeature, pLower);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_structuralFeature_lower pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // structural feature - lower - initial
   * pattern initial_structuralFeature_lower (structuralFeature : TraceLink, initial_structuralFeature : StructuralFeature, lower : java Integer) {
   * 	find initial_structuralFeature (structuralFeature, initial_structuralFeature);
   * 	StructuralFeature.lower (initial_structuralFeature, lower);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Initial_structuralFeature_lower
   * 
   */
  public static class Matcher extends BaseMatcher<Initial_structuralFeature_lower.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Initial_structuralFeature_lower.Matcher on(final ViatraQueryEngine engine) {
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
    public static Initial_structuralFeature_lower.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_STRUCTURALFEATURE = 0;
    
    private final static int POSITION_INITIAL_STRUCTURALFEATURE = 1;
    
    private final static int POSITION_LOWER = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Initial_structuralFeature_lower.Matcher.class);
    
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
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pLower the fixed value of pattern parameter lower, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Initial_structuralFeature_lower.Match> getAllMatches(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower) {
      return rawGetAllMatches(new Object[]{pStructuralFeature, pInitial_structuralFeature, pLower});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pLower the fixed value of pattern parameter lower, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Initial_structuralFeature_lower.Match getOneArbitraryMatch(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower) {
      return rawGetOneArbitraryMatch(new Object[]{pStructuralFeature, pInitial_structuralFeature, pLower});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pLower the fixed value of pattern parameter lower, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower) {
      return rawHasMatch(new Object[]{pStructuralFeature, pInitial_structuralFeature, pLower});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pLower the fixed value of pattern parameter lower, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower) {
      return rawCountMatches(new Object[]{pStructuralFeature, pInitial_structuralFeature, pLower});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pLower the fixed value of pattern parameter lower, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower, final IMatchProcessor<? super Initial_structuralFeature_lower.Match> processor) {
      rawForEachMatch(new Object[]{pStructuralFeature, pInitial_structuralFeature, pLower}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pLower the fixed value of pattern parameter lower, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower, final IMatchProcessor<? super Initial_structuralFeature_lower.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pStructuralFeature, pInitial_structuralFeature, pLower}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pLower the fixed value of pattern parameter lower, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Initial_structuralFeature_lower.Match newMatch(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower) {
      return Initial_structuralFeature_lower.Match.newMatch(pStructuralFeature, pInitial_structuralFeature, pLower);
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfstructuralFeature(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_STRUCTURALFEATURE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfstructuralFeature() {
      return rawAccumulateAllValuesOfstructuralFeature(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfstructuralFeature(final Initial_structuralFeature_lower.Match partialMatch) {
      return rawAccumulateAllValuesOfstructuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfstructuralFeature(final StructuralFeature pInitial_structuralFeature, final Integer pLower) {
      return rawAccumulateAllValuesOfstructuralFeature(new Object[]{
      null, 
      pInitial_structuralFeature, 
      pLower
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<StructuralFeature> rawAccumulateAllValuesOfinitial_structuralFeature(final Object[] parameters) {
      Set<StructuralFeature> results = new HashSet<StructuralFeature>();
      rawAccumulateAllValues(POSITION_INITIAL_STRUCTURALFEATURE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_structuralFeature() {
      return rawAccumulateAllValuesOfinitial_structuralFeature(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_structuralFeature(final Initial_structuralFeature_lower.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_structuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_structuralFeature(final TraceLink pStructuralFeature, final Integer pLower) {
      return rawAccumulateAllValuesOfinitial_structuralFeature(new Object[]{
      pStructuralFeature, 
      null, 
      pLower
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Integer> rawAccumulateAllValuesOflower(final Object[] parameters) {
      Set<Integer> results = new HashSet<Integer>();
      rawAccumulateAllValues(POSITION_LOWER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOflower() {
      return rawAccumulateAllValuesOflower(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOflower(final Initial_structuralFeature_lower.Match partialMatch) {
      return rawAccumulateAllValuesOflower(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOflower(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
      return rawAccumulateAllValuesOflower(new Object[]{
      pStructuralFeature, 
      pInitial_structuralFeature, 
      null
      });
    }
    
    @Override
    protected Initial_structuralFeature_lower.Match tupleToMatch(final Tuple t) {
      try {
          return Initial_structuralFeature_lower.Match.newMatch((TraceLink) t.get(POSITION_STRUCTURALFEATURE), (StructuralFeature) t.get(POSITION_INITIAL_STRUCTURALFEATURE), (Integer) t.get(POSITION_LOWER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_structuralFeature_lower.Match arrayToMatch(final Object[] match) {
      try {
          return Initial_structuralFeature_lower.Match.newMatch((TraceLink) match[POSITION_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_INITIAL_STRUCTURALFEATURE], (Integer) match[POSITION_LOWER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_structuralFeature_lower.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Initial_structuralFeature_lower.Match.newMutableMatch((TraceLink) match[POSITION_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_INITIAL_STRUCTURALFEATURE], (Integer) match[POSITION_LOWER]);
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
    public static IQuerySpecification<Initial_structuralFeature_lower.Matcher> querySpecification() {
      return Initial_structuralFeature_lower.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_structuralFeature_lower pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Initial_structuralFeature_lower.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pStructuralFeature the value of pattern parameter structuralFeature in the currently processed match
     * @param pInitial_structuralFeature the value of pattern parameter initial_structuralFeature in the currently processed match
     * @param pLower the value of pattern parameter lower in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final Integer pLower);
    
    @Override
    public void process(final Initial_structuralFeature_lower.Match match) {
      process(match.getStructuralFeature(), match.getInitial_structuralFeature(), match.getLower());
    }
  }
  
  private Initial_structuralFeature_lower() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Initial_structuralFeature_lower instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Initial_structuralFeature_lower.Matcher instantiate(final ViatraQueryEngine engine) {
    return Initial_structuralFeature_lower.Matcher.on(engine);
  }
  
  @Override
  public Initial_structuralFeature_lower.Matcher instantiate() {
    return Initial_structuralFeature_lower.Matcher.create();
  }
  
  @Override
  public Initial_structuralFeature_lower.Match newEmptyMatch() {
    return Initial_structuralFeature_lower.Match.newEmptyMatch();
  }
  
  @Override
  public Initial_structuralFeature_lower.Match newMatch(final Object... parameters) {
    return Initial_structuralFeature_lower.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature) parameters[1], (java.lang.Integer) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature_lower (visibility: PUBLIC, simpleName: Initial_structuralFeature_lower, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature_lower, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature_lower (visibility: PUBLIC, simpleName: Initial_structuralFeature_lower, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature_lower, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Initial_structuralFeature_lower INSTANCE = new Initial_structuralFeature_lower();
    
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
    private final static Initial_structuralFeature_lower.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pStructuralFeature = new PParameter("structuralFeature", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_structuralFeature = new PParameter("initial_structuralFeature", "se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pLower = new PParameter("lower", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pStructuralFeature, parameter_pInitial_structuralFeature, parameter_pLower);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_structuralFeature_lower";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("structuralFeature","initial_structuralFeature","lower");
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
          PVariable var_structuralFeature = body.getOrCreateVariableByName("structuralFeature");
          PVariable var_initial_structuralFeature = body.getOrCreateVariableByName("initial_structuralFeature");
          PVariable var_lower = body.getOrCreateVariableByName("lower");
          new TypeConstraint(body, Tuples.flatTupleOf(var_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_lower), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_structuralFeature, parameter_pStructuralFeature),
             new ExportedParameter(body, var_initial_structuralFeature, parameter_pInitial_structuralFeature),
             new ExportedParameter(body, var_lower, parameter_pLower)
          ));
          // 	find initial_structuralFeature (structuralFeature, initial_structuralFeature)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_structuralFeature, var_initial_structuralFeature), Initial_structuralFeature.instance().getInternalQueryRepresentation());
          // 	StructuralFeature.lower (initial_structuralFeature, lower)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_structuralFeature, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature", "lower")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EIntegerObject")));
          new Equality(body, var__virtual_0_, var_lower);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
