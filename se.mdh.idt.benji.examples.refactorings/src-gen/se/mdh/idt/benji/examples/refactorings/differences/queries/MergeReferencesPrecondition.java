/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/MergeReferences.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_reference;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class MergeReferencesPrecondition extends BaseGeneratedEMFQuerySpecification<MergeReferencesPrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPrecondition pattern,
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
    
    private Reference fInitial_left_reference;
    
    private Reference fCurrent_left_reference;
    
    private Reference fInitial_right_reference;
    
    private Reference fCurrent_right_reference;
    
    private static List<String> parameterNames = makeImmutableList("initial_class", "current_class", "initial_left_reference", "current_left_reference", "initial_right_reference", "current_right_reference");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      this.fInitial_class = pInitial_class;
      this.fCurrent_class = pCurrent_class;
      this.fInitial_left_reference = pInitial_left_reference;
      this.fCurrent_left_reference = pCurrent_left_reference;
      this.fInitial_right_reference = pInitial_right_reference;
      this.fCurrent_right_reference = pCurrent_right_reference;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_class".equals(parameterName)) return this.fInitial_class;
      if ("current_class".equals(parameterName)) return this.fCurrent_class;
      if ("initial_left_reference".equals(parameterName)) return this.fInitial_left_reference;
      if ("current_left_reference".equals(parameterName)) return this.fCurrent_left_reference;
      if ("initial_right_reference".equals(parameterName)) return this.fInitial_right_reference;
      if ("current_right_reference".equals(parameterName)) return this.fCurrent_right_reference;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_class() {
      return this.fInitial_class;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_class() {
      return this.fCurrent_class;
    }
    
    public Reference getInitial_left_reference() {
      return this.fInitial_left_reference;
    }
    
    public Reference getCurrent_left_reference() {
      return this.fCurrent_left_reference;
    }
    
    public Reference getInitial_right_reference() {
      return this.fInitial_right_reference;
    }
    
    public Reference getCurrent_right_reference() {
      return this.fCurrent_right_reference;
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
      if ("initial_left_reference".equals(parameterName) ) {
          this.fInitial_left_reference = (Reference) newValue;
          return true;
      }
      if ("current_left_reference".equals(parameterName) ) {
          this.fCurrent_left_reference = (Reference) newValue;
          return true;
      }
      if ("initial_right_reference".equals(parameterName) ) {
          this.fInitial_right_reference = (Reference) newValue;
          return true;
      }
      if ("current_right_reference".equals(parameterName) ) {
          this.fCurrent_right_reference = (Reference) newValue;
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
    
    public void setInitial_left_reference(final Reference pInitial_left_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_left_reference = pInitial_left_reference;
    }
    
    public void setCurrent_left_reference(final Reference pCurrent_left_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_left_reference = pCurrent_left_reference;
    }
    
    public void setInitial_right_reference(final Reference pInitial_right_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_right_reference = pInitial_right_reference;
    }
    
    public void setCurrent_right_reference(final Reference pCurrent_right_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_right_reference = pCurrent_right_reference;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return MergeReferencesPrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_class, fCurrent_class, fInitial_left_reference, fCurrent_left_reference, fInitial_right_reference, fCurrent_right_reference};
    }
    
    @Override
    public MergeReferencesPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_class, fCurrent_class, fInitial_left_reference, fCurrent_left_reference, fInitial_right_reference, fCurrent_right_reference) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_class\"=" + prettyPrintValue(fInitial_class) + ", ");
      result.append("\"current_class\"=" + prettyPrintValue(fCurrent_class) + ", ");
      result.append("\"initial_left_reference\"=" + prettyPrintValue(fInitial_left_reference) + ", ");
      result.append("\"current_left_reference\"=" + prettyPrintValue(fCurrent_left_reference) + ", ");
      result.append("\"initial_right_reference\"=" + prettyPrintValue(fInitial_right_reference) + ", ");
      result.append("\"current_right_reference\"=" + prettyPrintValue(fCurrent_right_reference));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_class, fCurrent_class, fInitial_left_reference, fCurrent_left_reference, fInitial_right_reference, fCurrent_right_reference);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MergeReferencesPrecondition.Match)) {
          MergeReferencesPrecondition.Match other = (MergeReferencesPrecondition.Match) obj;
          return Objects.equals(fInitial_class, other.fInitial_class) && Objects.equals(fCurrent_class, other.fCurrent_class) && Objects.equals(fInitial_left_reference, other.fInitial_left_reference) && Objects.equals(fCurrent_left_reference, other.fCurrent_left_reference) && Objects.equals(fInitial_right_reference, other.fInitial_right_reference) && Objects.equals(fCurrent_right_reference, other.fCurrent_right_reference);
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
    public MergeReferencesPrecondition specification() {
      return MergeReferencesPrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MergeReferencesPrecondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_left_reference the fixed value of pattern parameter initial_left_reference, or null if not bound.
     * @param pCurrent_left_reference the fixed value of pattern parameter current_left_reference, or null if not bound.
     * @param pInitial_right_reference the fixed value of pattern parameter initial_right_reference, or null if not bound.
     * @param pCurrent_right_reference the fixed value of pattern parameter current_right_reference, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MergeReferencesPrecondition.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      return new Mutable(pInitial_class, pCurrent_class, pInitial_left_reference, pCurrent_left_reference, pInitial_right_reference, pCurrent_right_reference);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_left_reference the fixed value of pattern parameter initial_left_reference, or null if not bound.
     * @param pCurrent_left_reference the fixed value of pattern parameter current_left_reference, or null if not bound.
     * @param pInitial_right_reference the fixed value of pattern parameter initial_right_reference, or null if not bound.
     * @param pCurrent_right_reference the fixed value of pattern parameter current_right_reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MergeReferencesPrecondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      return new Immutable(pInitial_class, pCurrent_class, pInitial_left_reference, pCurrent_left_reference, pInitial_right_reference, pCurrent_right_reference);
    }
    
    private static final class Mutable extends MergeReferencesPrecondition.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
        super(pInitial_class, pCurrent_class, pInitial_left_reference, pCurrent_left_reference, pInitial_right_reference, pCurrent_right_reference);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MergeReferencesPrecondition.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
        super(pInitial_class, pCurrent_class, pInitial_left_reference, pCurrent_left_reference, pInitial_right_reference, pCurrent_right_reference);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CADCCR16 - Merge References - Precondition
   * pattern MergeReferencesPrecondition (
   * 	initial_class : Class, current_class : Class, 
   * 	initial_left_reference : Reference, current_left_reference : Reference, 
   * 	initial_right_reference : Reference, current_right_reference : Reference
   * ) {
   * 	find preserved_class_reference (initial_class, current_class, initial_left_reference, current_left_reference); 
   * 	find preserved_class_reference (initial_class, current_class, initial_right_reference, current_right_reference); 
   * 	initial_left_reference != initial_right_reference; 
   * 	current_left_reference != current_right_reference; 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see MergeReferencesPrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<MergeReferencesPrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MergeReferencesPrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static MergeReferencesPrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_CLASS = 0;
    
    private final static int POSITION_CURRENT_CLASS = 1;
    
    private final static int POSITION_INITIAL_LEFT_REFERENCE = 2;
    
    private final static int POSITION_CURRENT_LEFT_REFERENCE = 3;
    
    private final static int POSITION_INITIAL_RIGHT_REFERENCE = 4;
    
    private final static int POSITION_CURRENT_RIGHT_REFERENCE = 5;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MergeReferencesPrecondition.Matcher.class);
    
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
     * @param pInitial_left_reference the fixed value of pattern parameter initial_left_reference, or null if not bound.
     * @param pCurrent_left_reference the fixed value of pattern parameter current_left_reference, or null if not bound.
     * @param pInitial_right_reference the fixed value of pattern parameter initial_right_reference, or null if not bound.
     * @param pCurrent_right_reference the fixed value of pattern parameter current_right_reference, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MergeReferencesPrecondition.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      return rawGetAllMatches(new Object[]{pInitial_class, pCurrent_class, pInitial_left_reference, pCurrent_left_reference, pInitial_right_reference, pCurrent_right_reference});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_left_reference the fixed value of pattern parameter initial_left_reference, or null if not bound.
     * @param pCurrent_left_reference the fixed value of pattern parameter current_left_reference, or null if not bound.
     * @param pInitial_right_reference the fixed value of pattern parameter initial_right_reference, or null if not bound.
     * @param pCurrent_right_reference the fixed value of pattern parameter current_right_reference, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public MergeReferencesPrecondition.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_left_reference, pCurrent_left_reference, pInitial_right_reference, pCurrent_right_reference});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_left_reference the fixed value of pattern parameter initial_left_reference, or null if not bound.
     * @param pCurrent_left_reference the fixed value of pattern parameter current_left_reference, or null if not bound.
     * @param pInitial_right_reference the fixed value of pattern parameter initial_right_reference, or null if not bound.
     * @param pCurrent_right_reference the fixed value of pattern parameter current_right_reference, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      return rawHasMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_left_reference, pCurrent_left_reference, pInitial_right_reference, pCurrent_right_reference});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_left_reference the fixed value of pattern parameter initial_left_reference, or null if not bound.
     * @param pCurrent_left_reference the fixed value of pattern parameter current_left_reference, or null if not bound.
     * @param pInitial_right_reference the fixed value of pattern parameter initial_right_reference, or null if not bound.
     * @param pCurrent_right_reference the fixed value of pattern parameter current_right_reference, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      return rawCountMatches(new Object[]{pInitial_class, pCurrent_class, pInitial_left_reference, pCurrent_left_reference, pInitial_right_reference, pCurrent_right_reference});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_left_reference the fixed value of pattern parameter initial_left_reference, or null if not bound.
     * @param pCurrent_left_reference the fixed value of pattern parameter current_left_reference, or null if not bound.
     * @param pInitial_right_reference the fixed value of pattern parameter initial_right_reference, or null if not bound.
     * @param pCurrent_right_reference the fixed value of pattern parameter current_right_reference, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference, final IMatchProcessor<? super MergeReferencesPrecondition.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_left_reference, pCurrent_left_reference, pInitial_right_reference, pCurrent_right_reference}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_left_reference the fixed value of pattern parameter initial_left_reference, or null if not bound.
     * @param pCurrent_left_reference the fixed value of pattern parameter current_left_reference, or null if not bound.
     * @param pInitial_right_reference the fixed value of pattern parameter initial_right_reference, or null if not bound.
     * @param pCurrent_right_reference the fixed value of pattern parameter current_right_reference, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference, final IMatchProcessor<? super MergeReferencesPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_left_reference, pCurrent_left_reference, pInitial_right_reference, pCurrent_right_reference}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_left_reference the fixed value of pattern parameter initial_left_reference, or null if not bound.
     * @param pCurrent_left_reference the fixed value of pattern parameter current_left_reference, or null if not bound.
     * @param pInitial_right_reference the fixed value of pattern parameter initial_right_reference, or null if not bound.
     * @param pCurrent_right_reference the fixed value of pattern parameter current_right_reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MergeReferencesPrecondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      return MergeReferencesPrecondition.Match.newMatch(pInitial_class, pCurrent_class, pInitial_left_reference, pCurrent_left_reference, pInitial_right_reference, pCurrent_right_reference);
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final MergeReferencesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      return rawAccumulateAllValuesOfinitial_class(new Object[]{
      null, 
      pCurrent_class, 
      pInitial_left_reference, 
      pCurrent_left_reference, 
      pInitial_right_reference, 
      pCurrent_right_reference
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final MergeReferencesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      return rawAccumulateAllValuesOfcurrent_class(new Object[]{
      pInitial_class, 
      null, 
      pInitial_left_reference, 
      pCurrent_left_reference, 
      pInitial_right_reference, 
      pCurrent_right_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfinitial_left_reference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_INITIAL_LEFT_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_left_reference() {
      return rawAccumulateAllValuesOfinitial_left_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_left_reference(final MergeReferencesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_left_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_left_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      return rawAccumulateAllValuesOfinitial_left_reference(new Object[]{
      pInitial_class, 
      pCurrent_class, 
      null, 
      pCurrent_left_reference, 
      pInitial_right_reference, 
      pCurrent_right_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfcurrent_left_reference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_CURRENT_LEFT_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_left_reference() {
      return rawAccumulateAllValuesOfcurrent_left_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_left_reference(final MergeReferencesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_left_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_left_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference) {
      return rawAccumulateAllValuesOfcurrent_left_reference(new Object[]{
      pInitial_class, 
      pCurrent_class, 
      pInitial_left_reference, 
      null, 
      pInitial_right_reference, 
      pCurrent_right_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfinitial_right_reference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_INITIAL_RIGHT_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_right_reference() {
      return rawAccumulateAllValuesOfinitial_right_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_right_reference(final MergeReferencesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_right_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_right_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pCurrent_right_reference) {
      return rawAccumulateAllValuesOfinitial_right_reference(new Object[]{
      pInitial_class, 
      pCurrent_class, 
      pInitial_left_reference, 
      pCurrent_left_reference, 
      null, 
      pCurrent_right_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfcurrent_right_reference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_CURRENT_RIGHT_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_right_reference() {
      return rawAccumulateAllValuesOfcurrent_right_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_right_reference(final MergeReferencesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_right_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_right_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference) {
      return rawAccumulateAllValuesOfcurrent_right_reference(new Object[]{
      pInitial_class, 
      pCurrent_class, 
      pInitial_left_reference, 
      pCurrent_left_reference, 
      pInitial_right_reference, 
      null
      });
    }
    
    @Override
    protected MergeReferencesPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return MergeReferencesPrecondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_CLASS), (Reference) t.get(POSITION_INITIAL_LEFT_REFERENCE), (Reference) t.get(POSITION_CURRENT_LEFT_REFERENCE), (Reference) t.get(POSITION_INITIAL_RIGHT_REFERENCE), (Reference) t.get(POSITION_CURRENT_RIGHT_REFERENCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeReferencesPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return MergeReferencesPrecondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (Reference) match[POSITION_INITIAL_LEFT_REFERENCE], (Reference) match[POSITION_CURRENT_LEFT_REFERENCE], (Reference) match[POSITION_INITIAL_RIGHT_REFERENCE], (Reference) match[POSITION_CURRENT_RIGHT_REFERENCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeReferencesPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MergeReferencesPrecondition.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (Reference) match[POSITION_INITIAL_LEFT_REFERENCE], (Reference) match[POSITION_CURRENT_LEFT_REFERENCE], (Reference) match[POSITION_INITIAL_RIGHT_REFERENCE], (Reference) match[POSITION_CURRENT_RIGHT_REFERENCE]);
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
    public static IQuerySpecification<MergeReferencesPrecondition.Matcher> querySpecification() {
      return MergeReferencesPrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<MergeReferencesPrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_class the value of pattern parameter initial_class in the currently processed match
     * @param pCurrent_class the value of pattern parameter current_class in the currently processed match
     * @param pInitial_left_reference the value of pattern parameter initial_left_reference in the currently processed match
     * @param pCurrent_left_reference the value of pattern parameter current_left_reference in the currently processed match
     * @param pInitial_right_reference the value of pattern parameter initial_right_reference in the currently processed match
     * @param pCurrent_right_reference the value of pattern parameter current_right_reference in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_left_reference, final Reference pCurrent_left_reference, final Reference pInitial_right_reference, final Reference pCurrent_right_reference);
    
    @Override
    public void process(final MergeReferencesPrecondition.Match match) {
      process(match.getInitial_class(), match.getCurrent_class(), match.getInitial_left_reference(), match.getCurrent_left_reference(), match.getInitial_right_reference(), match.getCurrent_right_reference());
    }
  }
  
  private MergeReferencesPrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MergeReferencesPrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MergeReferencesPrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return MergeReferencesPrecondition.Matcher.on(engine);
  }
  
  @Override
  public MergeReferencesPrecondition.Matcher instantiate() {
    return MergeReferencesPrecondition.Matcher.create();
  }
  
  @Override
  public MergeReferencesPrecondition.Match newEmptyMatch() {
    return MergeReferencesPrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public MergeReferencesPrecondition.Match newMatch(final Object... parameters) {
    return MergeReferencesPrecondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[3], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[4], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[5]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPrecondition (visibility: PUBLIC, simpleName: MergeReferencesPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPrecondition (visibility: PUBLIC, simpleName: MergeReferencesPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static MergeReferencesPrecondition INSTANCE = new MergeReferencesPrecondition();
    
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
    private final static MergeReferencesPrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_class = new PParameter("initial_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_class = new PParameter("current_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_left_reference = new PParameter("initial_left_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_left_reference = new PParameter("current_left_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_right_reference = new PParameter("initial_right_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_right_reference = new PParameter("current_right_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_class, parameter_pCurrent_class, parameter_pInitial_left_reference, parameter_pCurrent_left_reference, parameter_pInitial_right_reference, parameter_pCurrent_right_reference);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_class","current_class","initial_left_reference","current_left_reference","initial_right_reference","current_right_reference");
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
          PVariable var_initial_left_reference = body.getOrCreateVariableByName("initial_left_reference");
          PVariable var_current_left_reference = body.getOrCreateVariableByName("current_left_reference");
          PVariable var_initial_right_reference = body.getOrCreateVariableByName("initial_right_reference");
          PVariable var_current_right_reference = body.getOrCreateVariableByName("current_right_reference");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_left_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_left_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_right_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_right_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_class, parameter_pInitial_class),
             new ExportedParameter(body, var_current_class, parameter_pCurrent_class),
             new ExportedParameter(body, var_initial_left_reference, parameter_pInitial_left_reference),
             new ExportedParameter(body, var_current_left_reference, parameter_pCurrent_left_reference),
             new ExportedParameter(body, var_initial_right_reference, parameter_pInitial_right_reference),
             new ExportedParameter(body, var_current_right_reference, parameter_pCurrent_right_reference)
          ));
          // 	find preserved_class_reference (initial_class, current_class, initial_left_reference, current_left_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_class, var_current_class, var_initial_left_reference, var_current_left_reference), Preserved_class_reference.instance().getInternalQueryRepresentation());
          //  	find preserved_class_reference (initial_class, current_class, initial_right_reference, current_right_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_class, var_current_class, var_initial_right_reference, var_current_right_reference), Preserved_class_reference.instance().getInternalQueryRepresentation());
          //  	initial_left_reference != initial_right_reference
          new Inequality(body, var_initial_left_reference, var_initial_right_reference);
          //  	current_left_reference != current_right_reference
          new Inequality(body, var_current_left_reference, var_current_right_reference);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
