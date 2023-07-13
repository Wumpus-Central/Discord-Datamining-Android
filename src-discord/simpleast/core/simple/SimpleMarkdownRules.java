package com.discord.simpleast.core.simple;

import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.node.TextNode;
import com.discord.simpleast.core.parser.ParseSpec;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018J*\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018J*\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018J*\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018JF\u0010\u001c\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u00150\u001d\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007JH\u0010!\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u00182\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$H\u0007J*\u0010'\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018J*\u0010(\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018J*\u0010)\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0019\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006*"}, d2 = {"Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;", "", "()V", "PATTERN_BOLD", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "getPATTERN_BOLD", "()Ljava/util/regex/Pattern;", "PATTERN_ESCAPE", "getPATTERN_ESCAPE", "PATTERN_ITALICS", "getPATTERN_ITALICS", "PATTERN_NEWLINE", "getPATTERN_NEWLINE", "PATTERN_STRIKETHRU", "getPATTERN_STRIKETHRU", "PATTERN_TEXT", "getPATTERN_TEXT", "PATTERN_UNDERLINE", "getPATTERN_UNDERLINE", "createBoldRule", "Lcom/discord/simpleast/core/parser/Rule;", "R", "Lcom/discord/simpleast/core/node/Node;", "S", "createEscapeRule", "createItalicsRule", "createNewlineRule", "createSimpleMarkdownRules", "", "includeTextRule", "", "includeEscapeRule", "createSimpleStyleRule", "pattern", "styleFactory", "Lkotlin/Function0;", "", "Landroid/text/style/CharacterStyle;", "createStrikethruRule", "createTextRule", "createUnderlineRule", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})

public final class SimpleMarkdownRules {
    public static final SimpleMarkdownRules INSTANCE = new SimpleMarkdownRules();
    private static final Pattern PATTERN_BOLD = Pattern.compile("^\\*\\*([\\s\\S]+?)\\*\\*(?!\\*)");
    private static final Pattern PATTERN_UNDERLINE = Pattern.compile("^__([\\s\\S]+?)__(?!_)");
    private static final Pattern PATTERN_STRIKETHRU = Pattern.compile("^~~(?=\\S)([\\s\\S]*?\\S)~~");
    private static final Pattern PATTERN_NEWLINE = Pattern.compile("^(?:\\n *)*\\n");
    private static final Pattern PATTERN_TEXT = Pattern.compile("^[\\s\\S]+?(?=[^0-9A-Za-z\\s\\u00c0-\\uffff]|\\n| {2,}\\n|\\w+:\\S|$)");
    private static final Pattern PATTERN_ESCAPE = Pattern.compile("^\\\\([^0-9A-Za-z\\s])");
    private static final Pattern PATTERN_ITALICS = Pattern.compile("^\\b_((?:__|\\\\[\\s\\S]|[^\\\\_])+?)_\\b|^\\*(?=\\S)((?:\\*\\*|\\s+(?:[^*\\s]|\\*\\*)|[^\\s*])+?)\\*(?!\\*)");

    private SimpleMarkdownRules() {
    }

    public static final <R, S> List<Rule<R, Node<R>, S>> createSimpleMarkdownRules() {
        return createSimpleMarkdownRules$default(false, false, 3, null);
    }

    public static final <R, S> List<Rule<R, Node<R>, S>> createSimpleMarkdownRules(boolean z10) {
        return createSimpleMarkdownRules$default(z10, false, 2, null);
    }

    public static final <R, S> List<Rule<R, Node<R>, S>> createSimpleMarkdownRules(boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        if (z11) {
            arrayList.add(INSTANCE.createEscapeRule());
        }
        SimpleMarkdownRules simpleMarkdownRules = INSTANCE;
        arrayList.add(simpleMarkdownRules.createNewlineRule());
        arrayList.add(simpleMarkdownRules.createBoldRule());
        arrayList.add(simpleMarkdownRules.createUnderlineRule());
        arrayList.add(simpleMarkdownRules.createItalicsRule());
        arrayList.add(simpleMarkdownRules.createStrikethruRule());
        if (z10) {
            arrayList.add(simpleMarkdownRules.createTextRule());
        }
        return arrayList;
    }

    public static  List createSimpleMarkdownRules$default(boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return createSimpleMarkdownRules(z10, z11);
    }

    public static final <R, S> Rule<R, Node<R>, S> createSimpleStyleRule(final Pattern pattern, final Function0<? extends List<? extends CharacterStyle>> styleFactory) {
        q.g(pattern, "pattern");
        q.g(styleFactory, "styleFactory");
        return new Rule<R, Node<R>, S>(pattern) { 
            @Override 
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s10) {
                q.g(matcher, "matcher");
                q.g(parser, "parser");
                return ParseSpec.Companion.createNonterminal(new StyleNode((List) Function0.this.invoke()), s10, matcher.start(1), matcher.end(1));
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createBoldRule() {
        Pattern PATTERN_BOLD2 = PATTERN_BOLD;
        q.f(PATTERN_BOLD2, "PATTERN_BOLD");
        return createSimpleStyleRule(PATTERN_BOLD2, SimpleMarkdownRules$createBoldRule$1.INSTANCE);
    }

    public final <R, S> Rule<R, Node<R>, S> createEscapeRule() {
        final Pattern PATTERN_ESCAPE2 = PATTERN_ESCAPE;
        q.f(PATTERN_ESCAPE2, "PATTERN_ESCAPE");
        return new Rule<R, Node<R>, S>(PATTERN_ESCAPE2) { 
            @Override 
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s10) {
                q.g(matcher, "matcher");
                q.g(parser, "parser");
                ParseSpec.Companion companion = ParseSpec.Companion;
                String group = matcher.group(1);
                q.d(group);
                return companion.createTerminal(new TextNode(group), s10);
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createItalicsRule() {
        final Pattern PATTERN_ITALICS2 = PATTERN_ITALICS;
        q.f(PATTERN_ITALICS2, "PATTERN_ITALICS");
        return new Rule<R, Node<R>, S>(PATTERN_ITALICS2) { 
            @Override 
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s10) {
                int i10;
                int i11;
                boolean z10;
                q.g(matcher, "matcher");
                q.g(parser, "parser");
                String group = matcher.group(2);
                if (group != null) {
                    if (group.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i11 = matcher.start(2);
                        i10 = matcher.end(2);
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(new StyleSpan(2));
                        return ParseSpec.Companion.createNonterminal(new StyleNode(arrayList), s10, i11, i10);
                    }
                }
                i11 = matcher.start(1);
                i10 = matcher.end(1);
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(new StyleSpan(2));
                return ParseSpec.Companion.createNonterminal(new StyleNode(arrayList2), s10, i11, i10);
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createNewlineRule() {
        final Pattern PATTERN_NEWLINE2 = PATTERN_NEWLINE;
        q.f(PATTERN_NEWLINE2, "PATTERN_NEWLINE");
        return new Rule.BlockRule<R, Node<R>, S>(PATTERN_NEWLINE2) { 
            @Override 
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s10) {
                q.g(matcher, "matcher");
                q.g(parser, "parser");
                return ParseSpec.Companion.createTerminal(new TextNode(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE), s10);
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createStrikethruRule() {
        Pattern PATTERN_STRIKETHRU2 = PATTERN_STRIKETHRU;
        q.f(PATTERN_STRIKETHRU2, "PATTERN_STRIKETHRU");
        return createSimpleStyleRule(PATTERN_STRIKETHRU2, SimpleMarkdownRules$createStrikethruRule$1.INSTANCE);
    }

    public final <R, S> Rule<R, Node<R>, S> createTextRule() {
        final Pattern PATTERN_TEXT2 = PATTERN_TEXT;
        q.f(PATTERN_TEXT2, "PATTERN_TEXT");
        return new Rule<R, Node<R>, S>(PATTERN_TEXT2) { 
            @Override 
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s10) {
                q.g(matcher, "matcher");
                q.g(parser, "parser");
                String group = matcher.group();
                q.f(group, "matcher.group()");
                return ParseSpec.Companion.createTerminal(new TextNode(group), s10);
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createUnderlineRule() {
        Pattern PATTERN_UNDERLINE2 = PATTERN_UNDERLINE;
        q.f(PATTERN_UNDERLINE2, "PATTERN_UNDERLINE");
        return createSimpleStyleRule(PATTERN_UNDERLINE2, SimpleMarkdownRules$createUnderlineRule$1.INSTANCE);
    }

    public final Pattern getPATTERN_BOLD() {
        return PATTERN_BOLD;
    }

    public final Pattern getPATTERN_ESCAPE() {
        return PATTERN_ESCAPE;
    }

    public final Pattern getPATTERN_ITALICS() {
        return PATTERN_ITALICS;
    }

    public final Pattern getPATTERN_NEWLINE() {
        return PATTERN_NEWLINE;
    }

    public final Pattern getPATTERN_STRIKETHRU() {
        return PATTERN_STRIKETHRU;
    }

    public final Pattern getPATTERN_TEXT() {
        return PATTERN_TEXT;
    }

    public final Pattern getPATTERN_UNDERLINE() {
        return PATTERN_UNDERLINE;
    }
}
