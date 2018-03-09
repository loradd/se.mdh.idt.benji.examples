/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/ModelElement.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.ModelElement;
import se.mdh.idt.benji.trace.api.Deleted;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class Deleted_modelElement extends BaseGeneratedEMFQuerySpecification<Deleted_modelElement.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.deleted_modelElement pattern,
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
    private ModelElement fInitial_modelElement;
    
    private static List<String> parameterNames = makeImmutableList("initial_modelElement");
    
    private Match(final ModelElement pInitial_modelElement) {
      this.fInitial_modelElement = pInitial_modelElement;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_modelElement".equals(parameterName)) return this.fInitial_modelElement;
      return null;
    }
    
    public ModelElement getInitial_modelElement() {
      return this.fInitial_modelElement;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_modelElement".equals(parameterName) ) {
          this.fInitial_modelElement = (ModelElement) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_modelElement(final ModelElement pInitial_modelElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_modelElement = pInitial_modelElement;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.deleted_modelElement";
    }
    
    @Override
    public List<String> parameterNames() {
      return Deleted_modelElement.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_modelElement};
    }
    
    @Override
    public Deleted_modelElement.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_modelElement) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_modelElement\"=" + prettyPrintValue(fInitial_modelElement));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_modelElement);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Deleted_modelElement.Match)) {
          Deleted_modelElement.Match other = (Deleted_modelElement.Match) obj;
          return Objects.equals(fInitial_modelElement, other.fInitial_modelElement);
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
    public Deleted_modelElement specification() {
      return Deleted_modelElement.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Deleted_modelElement.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_modelElement the fixed value of pattern parameter initial_modelElement, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Deleted_modelElement.Match newMutableMatch(final ModelElement pInitial_modelElement) {
      return new Mutable(pInitial_modelElement);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_modelElement the fixed value of pattern parameter initial_modelElement, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Deleted_modelElement.Match newMatch(final ModelElement pInitial_modelElement) {
      return new Immutable(pInitial_modelElement);
    }
    
    private static final class Mutable extends Deleted_modelElement.Match {
      Mutable(final ModelElement pInitial_modelElement) {
        super(pInitial_modelElement);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Deleted_modelElement.Match {
      Immutable(final ModelElement pInitial_modelElement) {
        super(pInitial_modelElement);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.deleted_modelElement pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // model element - deleted
   * pattern deleted_modelElement (initial_modelElement : ModelElement) {
   * 	find se.mdh.idt.benji.trace.api.deleted (initial_modelElement); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Deleted_modelElement
   * 
   */
  public static class Matcher extends BaseMatcher<Deleted_modelElement.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Deleted_modelElement.Matcher on(final ViatraQueryEngine engine) {
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
    public static Deleted_modelElement.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_MODELELEMENT = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Deleted_modelElement.Matcher.class);
    
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
     * @param pInitial_modelElement the fixed value of pattern parameter initial_modelElement, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Deleted_modelElement.Match> getAllMatches(final ModelElement pInitial_modelElement) {
      return rawGetAllMatches(new Object[]{pInitial_modelElement});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_modelElement the fixed value of pattern parameter initial_modelElement, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Deleted_modelElement.Match getOneArbitraryMatch(final ModelElement pInitial_modelElement) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_modelElement});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_modelElement the fixed value of pattern parameter initial_modelElement, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final ModelElement pInitial_modelElement) {
      return rawHasMatch(new Object[]{pInitial_modelElement});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_modelElement the fixed value of pattern parameter initial_modelElement, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final ModelElement pInitial_modelElement) {
      return rawCountMatches(new Object[]{pInitial_modelElement});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_modelElement the fixed value of pattern parameter initial_modelElement, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final ModelElement pInitial_modelElement, final IMatchProcessor<? super Deleted_modelElement.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_modelElement}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_modelElement the fixed value of pattern parameter initial_modelElement, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final ModelElement pInitial_modelElement, final IMatchProcessor<? super Deleted_modelElement.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_modelElement}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_modelElement the fixed value of pattern parameter initial_modelElement, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Deleted_modelElement.Match newMatch(final ModelElement pInitial_modelElement) {
      return Deleted_modelElement.Match.newMatch(pInitial_modelElement);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_modelElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<ModelElement> rawAccumulateAllValuesOfinitial_modelElement(final Object[] parameters) {
      Set<ModelElement> results = new HashSet<ModelElement>();
      rawAccumulateAllValues(POSITION_INITIAL_MODELELEMENT, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_modelElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ModelElement> getAllValuesOfinitial_modelElement() {
      return rawAccumulateAllValuesOfinitial_modelElement(emptyArray());
    }
    
    @Override
    protected Deleted_modelElement.Match tupleToMatch(final Tuple t) {
      try {
          return Deleted_modelElement.Match.newMatch((ModelElement) t.get(POSITION_INITIAL_MODELELEMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Deleted_modelElement.Match arrayToMatch(final Object[] match) {
      try {
          return Deleted_modelElement.Match.newMatch((ModelElement) match[POSITION_INITIAL_MODELELEMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Deleted_modelElement.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Deleted_modelElement.Match.newMutableMatch((ModelElement) match[POSITION_INITIAL_MODELELEMENT]);
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
    public static IQuerySpecification<Deleted_modelElement.Matcher> querySpecification() {
      return Deleted_modelElement.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.deleted_modelElement pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Deleted_modelElement.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_modelElement the value of pattern parameter initial_modelElement in the currently processed match
     * 
     */
    public abstract void process(final ModelElement pInitial_modelElement);
    
    @Override
    public void process(final Deleted_modelElement.Match match) {
      process(match.getInitial_modelElement());
    }
  }
  
  private Deleted_modelElement() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Deleted_modelElement instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Deleted_modelElement.Matcher instantiate(final ViatraQueryEngine engine) {
    return Deleted_modelElement.Matcher.on(engine);
  }
  
  @Override
  public Deleted_modelElement.Matcher instantiate() {
    return Deleted_modelElement.Matcher.create();
  }
  
  @Override
  public Deleted_modelElement.Match newEmptyMatch() {
    return Deleted_modelElement.Match.newEmptyMatch();
  }
  
  @Override
  public Deleted_modelElement.Match newMatch(final Object... parameters) {
    return Deleted_modelElement.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.ModelElement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_modelElement (visibility: PUBLIC, simpleName: Deleted_modelElement, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_modelElement, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_modelElement (visibility: PUBLIC, simpleName: Deleted_modelElement, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_modelElement, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Deleted_modelElement INSTANCE = new Deleted_modelElement();
    
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
    private final static Deleted_modelElement.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_modelElement = new PParameter("initial_modelElement", "se.mdh.idt.benji.examples.refactorings.metamodel.ModelElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "ModelElement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_modelElement);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.deleted_modelElement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_modelElement");
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
          PVariable var_initial_modelElement = body.getOrCreateVariableByName("initial_modelElement");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_modelElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "ModelElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_modelElement, parameter_pInitial_modelElement)
          ));
          // 	find se.mdh.idt.benji.trace.api.deleted (initial_modelElement)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_modelElement), Deleted.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
