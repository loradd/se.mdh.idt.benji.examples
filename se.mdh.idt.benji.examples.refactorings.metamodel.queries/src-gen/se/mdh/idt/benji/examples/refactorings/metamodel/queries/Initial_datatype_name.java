/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/DataTypeQueries.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
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
import se.mdh.idt.benji.examples.refactorings.metamodel.DataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_classifier_name;
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
public final class Initial_datatype_name extends BaseGeneratedEMFQuerySpecification<Initial_datatype_name.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_datatype_name pattern,
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
    private TraceLink fDatatype;
    
    private DataType fInitial_datatype;
    
    private String fName;
    
    private static List<String> parameterNames = makeImmutableList("datatype", "initial_datatype", "name");
    
    private Match(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName) {
      this.fDatatype = pDatatype;
      this.fInitial_datatype = pInitial_datatype;
      this.fName = pName;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("datatype".equals(parameterName)) return this.fDatatype;
      if ("initial_datatype".equals(parameterName)) return this.fInitial_datatype;
      if ("name".equals(parameterName)) return this.fName;
      return null;
    }
    
    public TraceLink getDatatype() {
      return this.fDatatype;
    }
    
    public DataType getInitial_datatype() {
      return this.fInitial_datatype;
    }
    
    public String getName() {
      return this.fName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("datatype".equals(parameterName) ) {
          this.fDatatype = (TraceLink) newValue;
          return true;
      }
      if ("initial_datatype".equals(parameterName) ) {
          this.fInitial_datatype = (DataType) newValue;
          return true;
      }
      if ("name".equals(parameterName) ) {
          this.fName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setDatatype(final TraceLink pDatatype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDatatype = pDatatype;
    }
    
    public void setInitial_datatype(final DataType pInitial_datatype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_datatype = pInitial_datatype;
    }
    
    public void setName(final String pName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fName = pName;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_datatype_name";
    }
    
    @Override
    public List<String> parameterNames() {
      return Initial_datatype_name.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDatatype, fInitial_datatype, fName};
    }
    
    @Override
    public Initial_datatype_name.Match toImmutable() {
      return isMutable() ? newMatch(fDatatype, fInitial_datatype, fName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"datatype\"=" + prettyPrintValue(fDatatype) + ", ");
      result.append("\"initial_datatype\"=" + prettyPrintValue(fInitial_datatype) + ", ");
      result.append("\"name\"=" + prettyPrintValue(fName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fDatatype, fInitial_datatype, fName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Initial_datatype_name.Match)) {
          Initial_datatype_name.Match other = (Initial_datatype_name.Match) obj;
          return Objects.equals(fDatatype, other.fDatatype) && Objects.equals(fInitial_datatype, other.fInitial_datatype) && Objects.equals(fName, other.fName);
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
    public Initial_datatype_name specification() {
      return Initial_datatype_name.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Initial_datatype_name.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Initial_datatype_name.Match newMutableMatch(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName) {
      return new Mutable(pDatatype, pInitial_datatype, pName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Initial_datatype_name.Match newMatch(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName) {
      return new Immutable(pDatatype, pInitial_datatype, pName);
    }
    
    private static final class Mutable extends Initial_datatype_name.Match {
      Mutable(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName) {
        super(pDatatype, pInitial_datatype, pName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Initial_datatype_name.Match {
      Immutable(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName) {
        super(pDatatype, pInitial_datatype, pName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_datatype_name pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // datatype - name - initial
   * pattern initial_datatype_name (datatype : TraceLink, initial_datatype : DataType, name : java String) {
   * 	find initial_classifier_name (datatype, initial_datatype, name);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Initial_datatype_name
   * 
   */
  public static class Matcher extends BaseMatcher<Initial_datatype_name.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Initial_datatype_name.Matcher on(final ViatraQueryEngine engine) {
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
    public static Initial_datatype_name.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_DATATYPE = 0;
    
    private final static int POSITION_INITIAL_DATATYPE = 1;
    
    private final static int POSITION_NAME = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Initial_datatype_name.Matcher.class);
    
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
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Initial_datatype_name.Match> getAllMatches(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName) {
      return rawGetAllMatches(new Object[]{pDatatype, pInitial_datatype, pName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Initial_datatype_name.Match getOneArbitraryMatch(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName) {
      return rawGetOneArbitraryMatch(new Object[]{pDatatype, pInitial_datatype, pName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName) {
      return rawHasMatch(new Object[]{pDatatype, pInitial_datatype, pName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName) {
      return rawCountMatches(new Object[]{pDatatype, pInitial_datatype, pName});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName, final IMatchProcessor<? super Initial_datatype_name.Match> processor) {
      rawForEachMatch(new Object[]{pDatatype, pInitial_datatype, pName}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName, final IMatchProcessor<? super Initial_datatype_name.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDatatype, pInitial_datatype, pName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Initial_datatype_name.Match newMatch(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName) {
      return Initial_datatype_name.Match.newMatch(pDatatype, pInitial_datatype, pName);
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfdatatype(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_DATATYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfdatatype() {
      return rawAccumulateAllValuesOfdatatype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfdatatype(final Initial_datatype_name.Match partialMatch) {
      return rawAccumulateAllValuesOfdatatype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfdatatype(final DataType pInitial_datatype, final String pName) {
      return rawAccumulateAllValuesOfdatatype(new Object[]{
      null, 
      pInitial_datatype, 
      pName
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<DataType> rawAccumulateAllValuesOfinitial_datatype(final Object[] parameters) {
      Set<DataType> results = new HashSet<DataType>();
      rawAccumulateAllValues(POSITION_INITIAL_DATATYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_datatype() {
      return rawAccumulateAllValuesOfinitial_datatype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_datatype(final Initial_datatype_name.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_datatype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_datatype(final TraceLink pDatatype, final String pName) {
      return rawAccumulateAllValuesOfinitial_datatype(new Object[]{
      pDatatype, 
      null, 
      pName
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOfname(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname() {
      return rawAccumulateAllValuesOfname(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final Initial_datatype_name.Match partialMatch) {
      return rawAccumulateAllValuesOfname(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final TraceLink pDatatype, final DataType pInitial_datatype) {
      return rawAccumulateAllValuesOfname(new Object[]{
      pDatatype, 
      pInitial_datatype, 
      null
      });
    }
    
    @Override
    protected Initial_datatype_name.Match tupleToMatch(final Tuple t) {
      try {
          return Initial_datatype_name.Match.newMatch((TraceLink) t.get(POSITION_DATATYPE), (DataType) t.get(POSITION_INITIAL_DATATYPE), (String) t.get(POSITION_NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_datatype_name.Match arrayToMatch(final Object[] match) {
      try {
          return Initial_datatype_name.Match.newMatch((TraceLink) match[POSITION_DATATYPE], (DataType) match[POSITION_INITIAL_DATATYPE], (String) match[POSITION_NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_datatype_name.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Initial_datatype_name.Match.newMutableMatch((TraceLink) match[POSITION_DATATYPE], (DataType) match[POSITION_INITIAL_DATATYPE], (String) match[POSITION_NAME]);
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
    public static IQuerySpecification<Initial_datatype_name.Matcher> querySpecification() {
      return Initial_datatype_name.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_datatype_name pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Initial_datatype_name.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pDatatype the value of pattern parameter datatype in the currently processed match
     * @param pInitial_datatype the value of pattern parameter initial_datatype in the currently processed match
     * @param pName the value of pattern parameter name in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pDatatype, final DataType pInitial_datatype, final String pName);
    
    @Override
    public void process(final Initial_datatype_name.Match match) {
      process(match.getDatatype(), match.getInitial_datatype(), match.getName());
    }
  }
  
  private Initial_datatype_name() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Initial_datatype_name instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Initial_datatype_name.Matcher instantiate(final ViatraQueryEngine engine) {
    return Initial_datatype_name.Matcher.on(engine);
  }
  
  @Override
  public Initial_datatype_name.Matcher instantiate() {
    return Initial_datatype_name.Matcher.create();
  }
  
  @Override
  public Initial_datatype_name.Match newEmptyMatch() {
    return Initial_datatype_name.Match.newEmptyMatch();
  }
  
  @Override
  public Initial_datatype_name.Match newMatch(final Object... parameters) {
    return Initial_datatype_name.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[1], (java.lang.String) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_datatype_name (visibility: PUBLIC, simpleName: Initial_datatype_name, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_datatype_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_datatype_name (visibility: PUBLIC, simpleName: Initial_datatype_name, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_datatype_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Initial_datatype_name INSTANCE = new Initial_datatype_name();
    
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
    private final static Initial_datatype_name.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pDatatype = new PParameter("datatype", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_datatype = new PParameter("initial_datatype", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pName = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pDatatype, parameter_pInitial_datatype, parameter_pName);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_datatype_name";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("datatype","initial_datatype","name");
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
          PVariable var_datatype = body.getOrCreateVariableByName("datatype");
          PVariable var_initial_datatype = body.getOrCreateVariableByName("initial_datatype");
          PVariable var_name = body.getOrCreateVariableByName("name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_datatype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_datatype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_datatype, parameter_pDatatype),
             new ExportedParameter(body, var_initial_datatype, parameter_pInitial_datatype),
             new ExportedParameter(body, var_name, parameter_pName)
          ));
          // 	find initial_classifier_name (datatype, initial_datatype, name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_datatype, var_initial_datatype, var_name), Initial_classifier_name.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
