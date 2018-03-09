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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_classifier;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Preserved_package_subPackage extends BaseGeneratedEMFQuerySpecification<Preserved_package_subPackage.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_package_subPackage pattern,
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
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fInitial_subPackage;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fCurrent_subPackage;
    
    private static List<String> parameterNames = makeImmutableList("initial_package", "current_package", "initial_subPackage", "current_subPackage");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      this.fInitial_package = pInitial_package;
      this.fCurrent_package = pCurrent_package;
      this.fInitial_subPackage = pInitial_subPackage;
      this.fCurrent_subPackage = pCurrent_subPackage;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      if ("initial_subPackage".equals(parameterName)) return this.fInitial_subPackage;
      if ("current_subPackage".equals(parameterName)) return this.fCurrent_subPackage;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_package() {
      return this.fInitial_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_package() {
      return this.fCurrent_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_subPackage() {
      return this.fInitial_subPackage;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_subPackage() {
      return this.fCurrent_subPackage;
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
      if ("initial_subPackage".equals(parameterName) ) {
          this.fInitial_subPackage = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("current_subPackage".equals(parameterName) ) {
          this.fCurrent_subPackage = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
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
    
    public void setInitial_subPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_subPackage = pInitial_subPackage;
    }
    
    public void setCurrent_subPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_subPackage = pCurrent_subPackage;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_package_subPackage";
    }
    
    @Override
    public List<String> parameterNames() {
      return Preserved_package_subPackage.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_package, fCurrent_package, fInitial_subPackage, fCurrent_subPackage};
    }
    
    @Override
    public Preserved_package_subPackage.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_package, fCurrent_package, fInitial_subPackage, fCurrent_subPackage) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package) + ", ");
      result.append("\"initial_subPackage\"=" + prettyPrintValue(fInitial_subPackage) + ", ");
      result.append("\"current_subPackage\"=" + prettyPrintValue(fCurrent_subPackage));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_package, fCurrent_package, fInitial_subPackage, fCurrent_subPackage);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Preserved_package_subPackage.Match)) {
          Preserved_package_subPackage.Match other = (Preserved_package_subPackage.Match) obj;
          return Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fCurrent_package, other.fCurrent_package) && Objects.equals(fInitial_subPackage, other.fInitial_subPackage) && Objects.equals(fCurrent_subPackage, other.fCurrent_subPackage);
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
    public Preserved_package_subPackage specification() {
      return Preserved_package_subPackage.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Preserved_package_subPackage.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @param pCurrent_subPackage the fixed value of pattern parameter current_subPackage, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Preserved_package_subPackage.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      return new Mutable(pInitial_package, pCurrent_package, pInitial_subPackage, pCurrent_subPackage);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @param pCurrent_subPackage the fixed value of pattern parameter current_subPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Preserved_package_subPackage.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      return new Immutable(pInitial_package, pCurrent_package, pInitial_subPackage, pCurrent_subPackage);
    }
    
    private static final class Mutable extends Preserved_package_subPackage.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
        super(pInitial_package, pCurrent_package, pInitial_subPackage, pCurrent_subPackage);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Preserved_package_subPackage.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
        super(pInitial_package, pCurrent_package, pInitial_subPackage, pCurrent_subPackage);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_package_subPackage pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // package - classifiers (subPackage) - preserved
   * pattern preserved_package_subPackage (initial_package : Package, current_package : Package, initial_subPackage : Package, current_subPackage : Package) {
   * 	find preserved_package_classifier (initial_package, current_package, initial_subPackage, current_subPackage); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Preserved_package_subPackage
   * 
   */
  public static class Matcher extends BaseMatcher<Preserved_package_subPackage.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Preserved_package_subPackage.Matcher on(final ViatraQueryEngine engine) {
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
    public static Preserved_package_subPackage.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_PACKAGE = 0;
    
    private final static int POSITION_CURRENT_PACKAGE = 1;
    
    private final static int POSITION_INITIAL_SUBPACKAGE = 2;
    
    private final static int POSITION_CURRENT_SUBPACKAGE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Preserved_package_subPackage.Matcher.class);
    
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
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @param pCurrent_subPackage the fixed value of pattern parameter current_subPackage, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Preserved_package_subPackage.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      return rawGetAllMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_subPackage, pCurrent_subPackage});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @param pCurrent_subPackage the fixed value of pattern parameter current_subPackage, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Preserved_package_subPackage.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_subPackage, pCurrent_subPackage});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @param pCurrent_subPackage the fixed value of pattern parameter current_subPackage, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      return rawHasMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_subPackage, pCurrent_subPackage});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @param pCurrent_subPackage the fixed value of pattern parameter current_subPackage, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      return rawCountMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_subPackage, pCurrent_subPackage});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @param pCurrent_subPackage the fixed value of pattern parameter current_subPackage, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage, final IMatchProcessor<? super Preserved_package_subPackage.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_subPackage, pCurrent_subPackage}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @param pCurrent_subPackage the fixed value of pattern parameter current_subPackage, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage, final IMatchProcessor<? super Preserved_package_subPackage.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_subPackage, pCurrent_subPackage}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @param pCurrent_subPackage the fixed value of pattern parameter current_subPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Preserved_package_subPackage.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      return Preserved_package_subPackage.Match.newMatch(pInitial_package, pCurrent_package, pInitial_subPackage, pCurrent_subPackage);
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final Preserved_package_subPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      null, 
      pCurrent_package, 
      pInitial_subPackage, 
      pCurrent_subPackage
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final Preserved_package_subPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pInitial_package, 
      null, 
      pInitial_subPackage, 
      pCurrent_subPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfinitial_subPackage(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_INITIAL_SUBPACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_subPackage() {
      return rawAccumulateAllValuesOfinitial_subPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_subPackage(final Preserved_package_subPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_subPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_subPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage) {
      return rawAccumulateAllValuesOfinitial_subPackage(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      null, 
      pCurrent_subPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfcurrent_subPackage(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_CURRENT_SUBPACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_subPackage() {
      return rawAccumulateAllValuesOfcurrent_subPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_subPackage(final Preserved_package_subPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_subPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_subPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      return rawAccumulateAllValuesOfcurrent_subPackage(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_subPackage, 
      null
      });
    }
    
    @Override
    protected Preserved_package_subPackage.Match tupleToMatch(final Tuple t) {
      try {
          return Preserved_package_subPackage.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_SUBPACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_SUBPACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_package_subPackage.Match arrayToMatch(final Object[] match) {
      try {
          return Preserved_package_subPackage.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_SUBPACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_SUBPACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_package_subPackage.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Preserved_package_subPackage.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_SUBPACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_SUBPACKAGE]);
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
    public static IQuerySpecification<Preserved_package_subPackage.Matcher> querySpecification() {
      return Preserved_package_subPackage.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_package_subPackage pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Preserved_package_subPackage.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * @param pInitial_subPackage the value of pattern parameter initial_subPackage in the currently processed match
     * @param pCurrent_subPackage the value of pattern parameter current_subPackage in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_subPackage);
    
    @Override
    public void process(final Preserved_package_subPackage.Match match) {
      process(match.getInitial_package(), match.getCurrent_package(), match.getInitial_subPackage(), match.getCurrent_subPackage());
    }
  }
  
  private Preserved_package_subPackage() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Preserved_package_subPackage instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Preserved_package_subPackage.Matcher instantiate(final ViatraQueryEngine engine) {
    return Preserved_package_subPackage.Matcher.on(engine);
  }
  
  @Override
  public Preserved_package_subPackage.Matcher instantiate() {
    return Preserved_package_subPackage.Matcher.create();
  }
  
  @Override
  public Preserved_package_subPackage.Match newEmptyMatch() {
    return Preserved_package_subPackage.Match.newEmptyMatch();
  }
  
  @Override
  public Preserved_package_subPackage.Match newMatch(final Object... parameters) {
    return Preserved_package_subPackage.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_subPackage (visibility: PUBLIC, simpleName: Preserved_package_subPackage, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_subPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_subPackage (visibility: PUBLIC, simpleName: Preserved_package_subPackage, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_subPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Preserved_package_subPackage INSTANCE = new Preserved_package_subPackage();
    
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
    private final static Preserved_package_subPackage.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_subPackage = new PParameter("initial_subPackage", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_subPackage = new PParameter("current_subPackage", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_package, parameter_pCurrent_package, parameter_pInitial_subPackage, parameter_pCurrent_subPackage);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_package_subPackage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_package","current_package","initial_subPackage","current_subPackage");
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
          PVariable var_initial_subPackage = body.getOrCreateVariableByName("initial_subPackage");
          PVariable var_current_subPackage = body.getOrCreateVariableByName("current_subPackage");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_subPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_subPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package),
             new ExportedParameter(body, var_initial_subPackage, parameter_pInitial_subPackage),
             new ExportedParameter(body, var_current_subPackage, parameter_pCurrent_subPackage)
          ));
          // 	find preserved_package_classifier (initial_package, current_package, initial_subPackage, current_subPackage)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_subPackage, var_current_subPackage), Preserved_package_classifier.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
