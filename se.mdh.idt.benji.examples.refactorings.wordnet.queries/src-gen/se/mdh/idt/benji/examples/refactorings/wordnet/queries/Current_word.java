/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.wordnet.queries/src/se/mdh/idt/benji/examples/refactorings/wordnet/queries/WordQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.wordnet.queries;

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
import se.mdh.idt.benji.examples.refactorings.wordnet.Word;
import se.mdh.idt.benji.trace.TraceLink;
import se.mdh.idt.benji.trace.api.Current;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T22:01+0200")
public final class Current_word extends BaseGeneratedEMFQuerySpecification<Current_word.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.current_word pattern,
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
    private TraceLink fWord;
    
    private Word fCurrent_word;
    
    private static List<String> parameterNames = makeImmutableList("word", "current_word");
    
    private Match(final TraceLink pWord, final Word pCurrent_word) {
      this.fWord = pWord;
      this.fCurrent_word = pCurrent_word;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("word".equals(parameterName)) return this.fWord;
      if ("current_word".equals(parameterName)) return this.fCurrent_word;
      return null;
    }
    
    public TraceLink getWord() {
      return this.fWord;
    }
    
    public Word getCurrent_word() {
      return this.fCurrent_word;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("word".equals(parameterName) ) {
          this.fWord = (TraceLink) newValue;
          return true;
      }
      if ("current_word".equals(parameterName) ) {
          this.fCurrent_word = (Word) newValue;
          return true;
      }
      return false;
    }
    
    public void setWord(final TraceLink pWord) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fWord = pWord;
    }
    
    public void setCurrent_word(final Word pCurrent_word) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_word = pCurrent_word;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.current_word";
    }
    
    @Override
    public List<String> parameterNames() {
      return Current_word.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fWord, fCurrent_word};
    }
    
    @Override
    public Current_word.Match toImmutable() {
      return isMutable() ? newMatch(fWord, fCurrent_word) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"word\"=" + prettyPrintValue(fWord) + ", ");
      result.append("\"current_word\"=" + prettyPrintValue(fCurrent_word));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fWord, fCurrent_word);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Current_word.Match)) {
          Current_word.Match other = (Current_word.Match) obj;
          return Objects.equals(fWord, other.fWord) && Objects.equals(fCurrent_word, other.fCurrent_word);
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
    public Current_word specification() {
      return Current_word.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Current_word.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pCurrent_word the fixed value of pattern parameter current_word, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Current_word.Match newMutableMatch(final TraceLink pWord, final Word pCurrent_word) {
      return new Mutable(pWord, pCurrent_word);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pCurrent_word the fixed value of pattern parameter current_word, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Current_word.Match newMatch(final TraceLink pWord, final Word pCurrent_word) {
      return new Immutable(pWord, pCurrent_word);
    }
    
    private static final class Mutable extends Current_word.Match {
      Mutable(final TraceLink pWord, final Word pCurrent_word) {
        super(pWord, pCurrent_word);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Current_word.Match {
      Immutable(final TraceLink pWord, final Word pCurrent_word) {
        super(pWord, pCurrent_word);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.current_word pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // word - current
   * pattern current_word (word : TraceLink, current_word : Word) {
   * 	find current (word, current_word);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Current_word
   * 
   */
  public static class Matcher extends BaseMatcher<Current_word.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Current_word.Matcher on(final ViatraQueryEngine engine) {
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
    public static Current_word.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_WORD = 0;
    
    private final static int POSITION_CURRENT_WORD = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Current_word.Matcher.class);
    
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
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pCurrent_word the fixed value of pattern parameter current_word, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Current_word.Match> getAllMatches(final TraceLink pWord, final Word pCurrent_word) {
      return rawGetAllMatches(new Object[]{pWord, pCurrent_word});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pCurrent_word the fixed value of pattern parameter current_word, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Current_word.Match getOneArbitraryMatch(final TraceLink pWord, final Word pCurrent_word) {
      return rawGetOneArbitraryMatch(new Object[]{pWord, pCurrent_word});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pCurrent_word the fixed value of pattern parameter current_word, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pWord, final Word pCurrent_word) {
      return rawHasMatch(new Object[]{pWord, pCurrent_word});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pCurrent_word the fixed value of pattern parameter current_word, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pWord, final Word pCurrent_word) {
      return rawCountMatches(new Object[]{pWord, pCurrent_word});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pCurrent_word the fixed value of pattern parameter current_word, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pWord, final Word pCurrent_word, final IMatchProcessor<? super Current_word.Match> processor) {
      rawForEachMatch(new Object[]{pWord, pCurrent_word}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pCurrent_word the fixed value of pattern parameter current_word, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pWord, final Word pCurrent_word, final IMatchProcessor<? super Current_word.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pWord, pCurrent_word}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pCurrent_word the fixed value of pattern parameter current_word, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Current_word.Match newMatch(final TraceLink pWord, final Word pCurrent_word) {
      return Current_word.Match.newMatch(pWord, pCurrent_word);
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfword(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_WORD, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfword() {
      return rawAccumulateAllValuesOfword(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfword(final Current_word.Match partialMatch) {
      return rawAccumulateAllValuesOfword(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfword(final Word pCurrent_word) {
      return rawAccumulateAllValuesOfword(new Object[]{
      null, 
      pCurrent_word
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Word> rawAccumulateAllValuesOfcurrent_word(final Object[] parameters) {
      Set<Word> results = new HashSet<Word>();
      rawAccumulateAllValues(POSITION_CURRENT_WORD, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Word> getAllValuesOfcurrent_word() {
      return rawAccumulateAllValuesOfcurrent_word(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Word> getAllValuesOfcurrent_word(final Current_word.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_word(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Word> getAllValuesOfcurrent_word(final TraceLink pWord) {
      return rawAccumulateAllValuesOfcurrent_word(new Object[]{
      pWord, 
      null
      });
    }
    
    @Override
    protected Current_word.Match tupleToMatch(final Tuple t) {
      try {
          return Current_word.Match.newMatch((TraceLink) t.get(POSITION_WORD), (Word) t.get(POSITION_CURRENT_WORD));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_word.Match arrayToMatch(final Object[] match) {
      try {
          return Current_word.Match.newMatch((TraceLink) match[POSITION_WORD], (Word) match[POSITION_CURRENT_WORD]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_word.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Current_word.Match.newMutableMatch((TraceLink) match[POSITION_WORD], (Word) match[POSITION_CURRENT_WORD]);
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
    public static IQuerySpecification<Current_word.Matcher> querySpecification() {
      return Current_word.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.wordnet.queries.current_word pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Current_word.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pWord the value of pattern parameter word in the currently processed match
     * @param pCurrent_word the value of pattern parameter current_word in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pWord, final Word pCurrent_word);
    
    @Override
    public void process(final Current_word.Match match) {
      process(match.getWord(), match.getCurrent_word());
    }
  }
  
  private Current_word() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Current_word instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Current_word.Matcher instantiate(final ViatraQueryEngine engine) {
    return Current_word.Matcher.on(engine);
  }
  
  @Override
  public Current_word.Matcher instantiate() {
    return Current_word.Matcher.create();
  }
  
  @Override
  public Current_word.Match newEmptyMatch() {
    return Current_word.Match.newEmptyMatch();
  }
  
  @Override
  public Current_word.Match newMatch(final Object... parameters) {
    return Current_word.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.wordnet.Word) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_word (visibility: PUBLIC, simpleName: Current_word, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_word, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_word (visibility: PUBLIC, simpleName: Current_word, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_word, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Current_word INSTANCE = new Current_word();
    
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
    private final static Current_word.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pWord = new PParameter("word", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_word = new PParameter("current_word", "se.mdh.idt.benji.examples.refactorings.wordnet.Word", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/WordNet", "Word")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pWord, parameter_pCurrent_word);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.current_word";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("word","current_word");
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
          PVariable var_word = body.getOrCreateVariableByName("word");
          PVariable var_current_word = body.getOrCreateVariableByName("current_word");
          new TypeConstraint(body, Tuples.flatTupleOf(var_word), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_word), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/WordNet", "Word")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_word, parameter_pWord),
             new ExportedParameter(body, var_current_word, parameter_pCurrent_word)
          ));
          // 	find current (word, current_word)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_word, var_current_word), Current.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
