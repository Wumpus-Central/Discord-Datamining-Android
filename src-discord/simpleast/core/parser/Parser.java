package com.discord.simpleast.core.parser;

import android.util.Log;
import com.discord.simpleast.core.node.Node;
import gf.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0016\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003*\u0004\b\u0002\u0010\u00042\u00020\u0005:\u0002\u001d\u001eB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ4\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000bJY\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002:\u0010\u000f\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b0\u0010\"\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\u0002\u0010\u0011J:\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002 \u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b0\u0012JF\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0003\u0010\u0001\"\u000e\b\u0004\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003\"\u0004\b\u0005\u0010\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JF\u0010\u0017\u001a\u00020\u0014\"\u0004\b\u0003\u0010\u0001\"\u000e\b\u0004\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003\"\u0004\b\u0005\u0010\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JG\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00028\u00022\"\b\u0002\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b0\u001bH\u0007¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/discord/simpleast/core/parser/Parser;", "R", "T", "Lcom/discord/simpleast/core/node/Node;", "S", "", "enableDebugging", "", "(Z)V", "rules", "Ljava/util/ArrayList;", "Lcom/discord/simpleast/core/parser/Rule;", "addRule", "rule", "addRules", "newRules", "", "([Lcom/discord/simpleast/core/parser/Rule;)Lcom/discord/simpleast/core/parser/Parser;", "", "logMatch", "", "source", "", "logMiss", "parse", "", "initialState", "", "(Ljava/lang/CharSequence;Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;", "Companion", "ParseException", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes8.dex */
public class Parser<R, T extends Node<R>, S> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "Parser";
    private final boolean enableDebugging;
    private final ArrayList<Rule<R, ? extends T, S>> rules;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/simpleast/core/parser/Parser$Companion;", "", "()V", "TAG", "", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/discord/simpleast/core/parser/Parser$ParseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "source", "", "cause", "", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Throwable;)V", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes8.dex */
    public static final class ParseException extends RuntimeException {
        public /* synthetic */ ParseException(String str, CharSequence charSequence, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, charSequence, (i10 & 4) != 0 ? null : th2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParseException(String message, CharSequence charSequence, Throwable th2) {
            super("Error while parsing: " + message + " \n Source: " + charSequence, th2);
            q.g(message, "message");
        }
    }

    public Parser() {
        this(false, 1, null);
    }

    public Parser(boolean z10) {
        this.enableDebugging = z10;
        this.rules = new ArrayList<>();
    }

    private final <R, T extends Node<R>, S> void logMatch(Rule<R, T, S> rule, CharSequence charSequence) {
        if (this.enableDebugging) {
            Log.i(TAG, "MATCH: with rule with pattern: " + rule.getMatcher().pattern().toString() + " to source: " + charSequence);
        }
    }

    private final <R, T extends Node<R>, S> void logMiss(Rule<R, T, S> rule, CharSequence charSequence) {
        if (this.enableDebugging) {
            Log.i(TAG, "MISS: with rule with pattern: " + rule.getMatcher().pattern().toString() + " to source: " + charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List parse$default(Parser parser, CharSequence charSequence, Object obj, List list, int i10, Object obj2) {
        if (obj2 == null) {
            if ((i10 & 4) != 0) {
                list = parser.rules;
            }
            return parser.parse(charSequence, obj, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parse");
    }

    public final Parser<R, T, S> addRule(Rule<R, ? extends T, S> rule) {
        q.g(rule, "rule");
        this.rules.add(rule);
        return this;
    }

    public final Parser<R, T, S> addRules(Rule<R, ? extends T, S>... newRules) {
        List d10;
        q.g(newRules, "newRules");
        d10 = e.d(newRules);
        return addRules(d10);
    }

    public final List<T> parse(CharSequence charSequence, S s10) {
        return parse$default(this, charSequence, s10, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<T> parse(CharSequence source, S s10, List<? extends Rule<R, ? extends T, S>> rules) {
        List<T> list;
        Pair pair;
        q.g(source, "source");
        q.g(rules, "rules");
        Stack stack = new Stack();
        List<T> list2 = null;
        boolean z10 = true;
        Node node = new Node(null, 1, null);
        if (source.length() <= 0) {
            z10 = false;
        }
        if (z10) {
            stack.add(new ParseSpec(node, s10, 0, source.length()));
        }
        String str = null;
        while (!stack.isEmpty()) {
            ParseSpec parseSpec = (ParseSpec) stack.pop();
            if (parseSpec.getStartIndex() >= parseSpec.getEndIndex()) {
                break;
            }
            CharSequence subSequence = source.subSequence(parseSpec.getStartIndex(), parseSpec.getEndIndex());
            int startIndex = parseSpec.getStartIndex();
            Iterator<? extends Rule<R, ? extends T, S>> it = rules.iterator();
            while (true) {
                if (!it.hasNext()) {
                    pair = null;
                    break;
                }
                Rule rule = (Rule) it.next();
                Matcher match = rule.match(subSequence, str, parseSpec.getState());
                if (match == null) {
                    logMiss(rule, subSequence);
                    pair = null;
                    continue;
                } else {
                    logMatch(rule, subSequence);
                    pair = x.a(rule, match);
                    continue;
                }
                if (pair != null) {
                    break;
                }
            }
            if (pair != null) {
                Matcher matcher = (Matcher) pair.b();
                int end = matcher.end() + startIndex;
                ParseSpec parse = ((Rule) pair.a()).parse(matcher, this, parseSpec.getState());
                Node<R> root = parseSpec.getRoot();
                root.addChild(parse.getRoot());
                if (end != parseSpec.getEndIndex()) {
                    stack.push(ParseSpec.Companion.createNonterminal(root, parseSpec.getState(), end, parseSpec.getEndIndex()));
                }
                if (!parse.isTerminal()) {
                    parse.applyOffset(startIndex);
                    stack.push(parse);
                }
                try {
                    str = matcher.group(0);
                } catch (Throwable th2) {
                    throw new ParseException("matcher found no matches", source, th2);
                }
            } else {
                throw new ParseException("failed to find rule to match source", source, null, 4, null);
            }
        }
        Collection<Node<R>> children = node.getChildren();
        if (children != null) {
            list = r.D0(children);
        } else {
            list = null;
        }
        if (l0.j(list)) {
            list2 = list;
        }
        if (list2 != null) {
            return list2;
        }
        return new ArrayList();
    }

    public final Parser<R, T, S> addRules(Collection<? extends Rule<R, ? extends T, S>> newRules) {
        q.g(newRules, "newRules");
        this.rules.addAll(newRules);
        return this;
    }

    public /* synthetic */ Parser(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
