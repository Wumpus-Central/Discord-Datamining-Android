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
import kotlin.jvm.internal.C9677q;

@Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018J*\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018J*\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018J*\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018JF\u0010\u001c\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u00150\u001d\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007JH\u0010!\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u00182\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$H\u0007J*\u0010'\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018J*\u0010(\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018J*\u0010)\u001a\u001a\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u0017\u0012\u0004\u0012\u0002H\u00180\u0015\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0018R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0019\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006*"}, m15073d2 = {"Lcom/discord/simpleast/core/simple/SimpleMarkdownRules;", "", "()V", "PATTERN_BOLD", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "getPATTERN_BOLD", "()Ljava/util/regex/Pattern;", "PATTERN_ESCAPE", "getPATTERN_ESCAPE", "PATTERN_ITALICS", "getPATTERN_ITALICS", "PATTERN_NEWLINE", "getPATTERN_NEWLINE", "PATTERN_STRIKETHRU", "getPATTERN_STRIKETHRU", "PATTERN_TEXT", "getPATTERN_TEXT", "PATTERN_UNDERLINE", "getPATTERN_UNDERLINE", "createBoldRule", "Lcom/discord/simpleast/core/parser/Rule;", "R", "Lcom/discord/simpleast/core/node/Node;", "S", "createEscapeRule", "createItalicsRule", "createNewlineRule", "createSimpleMarkdownRules", "", "includeTextRule", "", "includeEscapeRule", "createSimpleStyleRule", "pattern", "styleFactory", "Lkotlin/Function0;", "", "Landroid/text/style/CharacterStyle;", "createStrikethruRule", "createTextRule", "createUnderlineRule", "simpleast-core_release"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes7.dex */
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

    public static final <R, S> List<Rule<R, Node<R>, S>> createSimpleMarkdownRules(boolean z) {
        return createSimpleMarkdownRules$default(z, false, 2, null);
    }

    public static final <R, S> List<Rule<R, Node<R>, S>> createSimpleMarkdownRules(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(INSTANCE.createEscapeRule());
        }
        SimpleMarkdownRules simpleMarkdownRules = INSTANCE;
        arrayList.add(simpleMarkdownRules.createNewlineRule());
        arrayList.add(simpleMarkdownRules.createBoldRule());
        arrayList.add(simpleMarkdownRules.createUnderlineRule());
        arrayList.add(simpleMarkdownRules.createItalicsRule());
        arrayList.add(simpleMarkdownRules.createStrikethruRule());
        if (z) {
            arrayList.add(simpleMarkdownRules.createTextRule());
        }
        return arrayList;
    }

    public static /* synthetic */ List createSimpleMarkdownRules$default(boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return createSimpleMarkdownRules(z, z2);
    }

    public static final <R, S> Rule<R, Node<R>, S> createSimpleStyleRule(final Pattern pattern, final Function0<? extends List<? extends CharacterStyle>> styleFactory) {
        C9677q.m14633g(pattern, "pattern");
        C9677q.m14633g(styleFactory, "styleFactory");
        return new Rule<R, Node<R>, S>(pattern) { // from class: com.discord.simpleast.core.simple.SimpleMarkdownRules$createSimpleStyleRule$1
            @Override // com.discord.simpleast.core.parser.Rule
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s) {
                C9677q.m14633g(matcher, "matcher");
                C9677q.m14633g(parser, "parser");
                return ParseSpec.Companion.createNonterminal(new StyleNode((List) Function0.this.invoke()), s, matcher.start(1), matcher.end(1));
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createBoldRule() {
        Pattern PATTERN_BOLD2 = PATTERN_BOLD;
        C9677q.m14634f(PATTERN_BOLD2, "PATTERN_BOLD");
        return createSimpleStyleRule(PATTERN_BOLD2, SimpleMarkdownRules$createBoldRule$1.INSTANCE);
    }

    public final <R, S> Rule<R, Node<R>, S> createEscapeRule() {
        final Pattern PATTERN_ESCAPE2 = PATTERN_ESCAPE;
        C9677q.m14634f(PATTERN_ESCAPE2, "PATTERN_ESCAPE");
        return new Rule<R, Node<R>, S>(PATTERN_ESCAPE2) { // from class: com.discord.simpleast.core.simple.SimpleMarkdownRules$createEscapeRule$1
            @Override // com.discord.simpleast.core.parser.Rule
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s) {
                C9677q.m14633g(matcher, "matcher");
                C9677q.m14633g(parser, "parser");
                ParseSpec.Companion companion = ParseSpec.Companion;
                String group = matcher.group(1);
                C9677q.m14636d(group);
                return companion.createTerminal(new TextNode(group), s);
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createItalicsRule() {
        final Pattern PATTERN_ITALICS2 = PATTERN_ITALICS;
        C9677q.m14634f(PATTERN_ITALICS2, "PATTERN_ITALICS");
        return new Rule<R, Node<R>, S>(PATTERN_ITALICS2) { // from class: com.discord.simpleast.core.simple.SimpleMarkdownRules$createItalicsRule$1
            @Override // com.discord.simpleast.core.parser.Rule
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s) {
                int i;
                int i2;
                boolean z;
                C9677q.m14633g(matcher, "matcher");
                C9677q.m14633g(parser, "parser");
                String group = matcher.group(2);
                if (group != null) {
                    if (group.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i2 = matcher.start(2);
                        i = matcher.end(2);
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(new StyleSpan(2));
                        return ParseSpec.Companion.createNonterminal(new StyleNode(arrayList), s, i2, i);
                    }
                }
                i2 = matcher.start(1);
                i = matcher.end(1);
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(new StyleSpan(2));
                return ParseSpec.Companion.createNonterminal(new StyleNode(arrayList2), s, i2, i);
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createNewlineRule() {
        final Pattern PATTERN_NEWLINE2 = PATTERN_NEWLINE;
        C9677q.m14634f(PATTERN_NEWLINE2, "PATTERN_NEWLINE");
        return new Rule.BlockRule<R, Node<R>, S>(PATTERN_NEWLINE2) { // from class: com.discord.simpleast.core.simple.SimpleMarkdownRules$createNewlineRule$1
            @Override // com.discord.simpleast.core.parser.Rule
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s) {
                C9677q.m14633g(matcher, "matcher");
                C9677q.m14633g(parser, "parser");
                return ParseSpec.Companion.createTerminal(new TextNode(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE), s);
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createStrikethruRule() {
        Pattern PATTERN_STRIKETHRU2 = PATTERN_STRIKETHRU;
        C9677q.m14634f(PATTERN_STRIKETHRU2, "PATTERN_STRIKETHRU");
        return createSimpleStyleRule(PATTERN_STRIKETHRU2, SimpleMarkdownRules$createStrikethruRule$1.INSTANCE);
    }

    public final <R, S> Rule<R, Node<R>, S> createTextRule() {
        final Pattern PATTERN_TEXT2 = PATTERN_TEXT;
        C9677q.m14634f(PATTERN_TEXT2, "PATTERN_TEXT");
        return new Rule<R, Node<R>, S>(PATTERN_TEXT2) { // from class: com.discord.simpleast.core.simple.SimpleMarkdownRules$createTextRule$1
            @Override // com.discord.simpleast.core.parser.Rule
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s) {
                C9677q.m14633g(matcher, "matcher");
                C9677q.m14633g(parser, "parser");
                String group = matcher.group();
                C9677q.m14634f(group, "matcher.group()");
                return ParseSpec.Companion.createTerminal(new TextNode(group), s);
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createUnderlineRule() {
        Pattern PATTERN_UNDERLINE2 = PATTERN_UNDERLINE;
        C9677q.m14634f(PATTERN_UNDERLINE2, "PATTERN_UNDERLINE");
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
