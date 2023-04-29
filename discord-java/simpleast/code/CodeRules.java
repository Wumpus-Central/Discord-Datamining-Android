package com.discord.simpleast.code;

import com.discord.simpleast.code.CodeNode;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.node.TextNode;
import com.discord.simpleast.core.parser.ParseSpec;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;
import nf.x;
import of.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0013\u001a,\u0012\u0004\u0012\u00020\u0015\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u00170\u00160\u0014\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001cJ\u0098\u0001\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001f20\u0010 \u001a,\u0012\u0004\u0012\u00020\u0015\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u00170\u00160\u00142,\b\u0002\u0010!\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u0002H\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00190\"JQ\u0010%\u001a\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001c2\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150'\"\u00020\u0015¢\u0006\u0002\u0010(J\u009b\u0001\u0010)\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u00170\u0016\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001c2$\u0010*\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u00170\u00162\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150'2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150'2\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150'\"\u00020\u0015H\u0002¢\u0006\u0002\u0010.JF\u0010/\u001a\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001f2\f\u00100\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001fJ\u0018\u00101\u001a\n 2*\u0004\u0018\u00010\b0\b2\u0006\u00103\u001a\u00020\u0015H\u0002J+\u00104\u001a\n 2*\u0004\u0018\u00010\b0\b2\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150'\"\u00020\u0015H\u0000¢\u0006\u0004\b6\u00107JJ\u00108\u001a\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0019\u0012\u0004\u0012\u0002H\u001a0\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u001a*\u00020\b2\b\b\u0002\u00109\u001a\u00020\u00042\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u0002H\u0018\u0018\u00010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006;"}, d2 = {"Lcom/discord/simpleast/code/CodeRules;", "", "()V", "CODE_BLOCK_BODY_GROUP", "", "CODE_BLOCK_LANGUAGE_GROUP", "CODE_BLOCK_WS_PREFIX", "PATTERN_CODE_BLOCK", "Ljava/util/regex/Pattern;", "getPATTERN_CODE_BLOCK", "()Ljava/util/regex/Pattern;", "PATTERN_CODE_INLINE", "getPATTERN_CODE_INLINE", "PATTERN_LEADING_WS_CONSUMER", "getPATTERN_LEADING_WS_CONSUMER", "PATTERN_NUMBERS", "getPATTERN_NUMBERS", "PATTERN_TEXT", "getPATTERN_TEXT", "createCodeLanguageMap", "", "", "", "Lcom/discord/simpleast/core/parser/Rule;", "R", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "createCodeRule", "textStyleProvider", "Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;", "languageMap", "wrapperNodeProvider", "Lkotlin/Function3;", "Lcom/discord/simpleast/code/CodeNode;", "", "createDefinitionRule", "identifiers", "", "(Lcom/discord/simpleast/code/CodeStyleProviders;[Ljava/lang/String;)Lcom/discord/simpleast/core/parser/Rule;", "createGenericCodeRules", "additionalRules", "definitions", "builtIns", "keywords", "(Lcom/discord/simpleast/code/CodeStyleProviders;Ljava/util/List;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;", "createInlineCodeRule", "bgStyleProvider", "createSingleLineCommentPattern", "kotlin.jvm.PlatformType", "prefix", "createWordPattern", "words", "createWordPattern$simpleast_core_release", "([Ljava/lang/String;)Ljava/util/regex/Pattern;", "toMatchGroupRule", "group", "stylesProvider", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class CodeRules {
    private static final int CODE_BLOCK_BODY_GROUP = 3;
    private static final int CODE_BLOCK_LANGUAGE_GROUP = 1;
    private static final int CODE_BLOCK_WS_PREFIX = 2;
    public static final CodeRules INSTANCE = new CodeRules();
    private static final Pattern PATTERN_CODE_BLOCK;
    private static final Pattern PATTERN_CODE_INLINE;
    private static final Pattern PATTERN_LEADING_WS_CONSUMER;
    private static final Pattern PATTERN_NUMBERS;
    private static final Pattern PATTERN_TEXT;

    static {
        Pattern compile = Pattern.compile("^```(?:([\\w+\\-.]+?)?(\\s*\\n))?([^\\n].*?)\\n*```", 32);
        q.f(compile, "Pattern.compile(\"\"\"^```(…n*```\"\"\", Pattern.DOTALL)");
        PATTERN_CODE_BLOCK = compile;
        Pattern compile2 = Pattern.compile("^(``?)([^`]*)\\1", 32);
        q.f(compile2, "Pattern.compile(\"\"\"^(``?…]*)\\1\"\"\", Pattern.DOTALL)");
        PATTERN_CODE_INLINE = compile2;
        Pattern compile3 = Pattern.compile("^(?:\\n\\s*)+");
        q.f(compile3, "Pattern.compile(\"\"\"^(?:\\n\\s*)+\"\"\")");
        PATTERN_LEADING_WS_CONSUMER = compile3;
        Pattern compile4 = Pattern.compile("^[\\s\\S]+?(?=\\b|[^0-9A-Za-z\\s\\u00c0-\\uffff]|\\n| {2,}\\n|\\w+:\\S|$)");
        q.f(compile4, "Pattern.compile(\"\"\"^[\\s\\…|\\n| {2,}\\n|\\w+:\\S|$)\"\"\")");
        PATTERN_TEXT = compile4;
        Pattern compile5 = Pattern.compile("^\\b\\d+?\\b");
        q.f(compile5, "Pattern.compile(\"\"\"^\\b\\d+?\\b\"\"\")");
        PATTERN_NUMBERS = compile5;
    }

    private CodeRules() {
    }

    public static /* synthetic */ Rule createCodeRule$default(CodeRules codeRules, StyleNode.SpanProvider spanProvider, Map map, Function3 function3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function3 = CodeRules$createCodeRule$1.INSTANCE;
        }
        return codeRules.createCodeRule(spanProvider, map, function3);
    }

    private final <R, S> List<Rule<R, Node<R>, S>> createGenericCodeRules(CodeStyleProviders<R> codeStyleProviders, List<? extends Rule<R, Node<R>, S>> list, String[] strArr, String[] strArr2, String... strArr3) {
        List l10;
        List<Rule<R, Node<R>, S>> o02;
        Pattern createWordPattern$simpleast_core_release = createWordPattern$simpleast_core_release((String[]) Arrays.copyOf(strArr2, strArr2.length));
        q.f(createWordPattern$simpleast_core_release, "createWordPattern(*builtIns)");
        Pattern createWordPattern$simpleast_core_release2 = createWordPattern$simpleast_core_release((String[]) Arrays.copyOf(strArr3, strArr3.length));
        q.f(createWordPattern$simpleast_core_release2, "createWordPattern(*keywords)");
        l10 = j.l(createDefinitionRule(codeStyleProviders, (String[]) Arrays.copyOf(strArr, strArr.length)), toMatchGroupRule$default(this, createWordPattern$simpleast_core_release, 0, codeStyleProviders.getGenericsStyleProvider(), 1, null), toMatchGroupRule$default(this, createWordPattern$simpleast_core_release2, 0, codeStyleProviders.getKeywordStyleProvider(), 1, null), toMatchGroupRule$default(this, PATTERN_NUMBERS, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null), toMatchGroupRule$default(this, PATTERN_LEADING_WS_CONSUMER, 0, null, 3, null), toMatchGroupRule$default(this, PATTERN_TEXT, 0, null, 3, null));
        o02 = r.o0(list, l10);
        return o02;
    }

    private final Pattern createSingleLineCommentPattern(String str) {
        return Pattern.compile("^(?:" + str + ".*?(?=\\n|$))");
    }

    public static /* synthetic */ Rule toMatchGroupRule$default(CodeRules codeRules, Pattern pattern, int i10, StyleNode.SpanProvider spanProvider, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            spanProvider = null;
        }
        return codeRules.toMatchGroupRule(pattern, i10, spanProvider);
    }

    public final <R, S> Map<String, List<Rule<R, Node<R>, S>>> createCodeLanguageMap(CodeStyleProviders<R> codeStyleProviders) {
        List<? extends Rule<R, Node<R>, S>> l10;
        List<? extends Rule<R, Node<R>, S>> l11;
        List<? extends Rule<R, Node<R>, S>> l12;
        List l13;
        List l14;
        Map<String, List<Rule<R, Node<R>, S>>> k10;
        q.g(codeStyleProviders, "codeStyleProviders");
        Kotlin kotlin2 = Kotlin.INSTANCE;
        String[] built_ins = kotlin2.getBUILT_INS();
        String[] keywords = kotlin2.getKEYWORDS();
        List<Rule<R, Node<R>, S>> createGenericCodeRules = createGenericCodeRules(codeStyleProviders, kotlin2.createKotlinCodeRules$simpleast_core_release(codeStyleProviders), new String[]{"object", "class", "interface"}, built_ins, (String[]) Arrays.copyOf(keywords, keywords.length));
        Pattern createSingleLineCommentPattern = createSingleLineCommentPattern("//");
        q.f(createSingleLineCommentPattern, "createSingleLineCommentPattern(\"//\")");
        Pattern compile = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
        q.f(compile, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
        l10 = j.l(toMatchGroupRule$default(this, createSingleLineCommentPattern, 0, codeStyleProviders.getCommentStyleProvider(), 1, null), toMatchGroupRule$default(this, compile, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null));
        List<Rule<R, Node<R>, S>> createGenericCodeRules2 = createGenericCodeRules(codeStyleProviders, l10, new String[]{"message|enum|extend|service"}, new String[]{"true|false", "string|bool|double|float|bytes", "int32|uint32|sint32|int64|unit64|sint64", "map"}, "required|repeated|optional|option|oneof|default|reserved", "package|import", "rpc|returns");
        Pattern createSingleLineCommentPattern2 = createSingleLineCommentPattern("#");
        q.f(createSingleLineCommentPattern2, "createSingleLineCommentPattern(\"#\")");
        Pattern compile2 = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
        q.f(compile2, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
        Pattern compile3 = Pattern.compile("^'[\\s\\S]*?(?<!\\\\)'(?=\\W|\\s|$)");
        q.f(compile3, "Pattern.compile(\"\"\"^'[\\s…*?(?<!\\\\)'(?=\\W|\\s|$)\"\"\")");
        Pattern compile4 = Pattern.compile("^@(\\w+)");
        q.f(compile4, "Pattern.compile(\"\"\"^@(\\w+)\"\"\")");
        l11 = j.l(toMatchGroupRule$default(this, createSingleLineCommentPattern2, 0, codeStyleProviders.getCommentStyleProvider(), 1, null), toMatchGroupRule$default(this, compile2, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null), toMatchGroupRule$default(this, compile3, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null), toMatchGroupRule$default(this, compile4, 0, codeStyleProviders.getGenericsStyleProvider(), 1, null));
        List<Rule<R, Node<R>, S>> createGenericCodeRules3 = createGenericCodeRules(codeStyleProviders, l11, new String[]{"class", "def", "lambda"}, new String[]{"True|False|None"}, "from|import|global|nonlocal", "async|await|class|self|cls|def|lambda", "for|while|if|else|elif|break|continue|return", "try|except|finally|raise|pass|yeild", "in|as|is|del", "and|or|not|assert");
        Pattern createSingleLineCommentPattern3 = createSingleLineCommentPattern("//");
        q.f(createSingleLineCommentPattern3, "createSingleLineCommentPattern(\"//\")");
        Pattern compile5 = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
        q.f(compile5, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
        Pattern compile6 = Pattern.compile("^#!?\\[.*?\\]\\n");
        q.f(compile6, "Pattern.compile(\"\"\"^#!?\\[.*?\\]\\n\"\"\")");
        l12 = j.l(toMatchGroupRule$default(this, createSingleLineCommentPattern3, 0, codeStyleProviders.getCommentStyleProvider(), 1, null), toMatchGroupRule$default(this, compile5, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null), toMatchGroupRule$default(this, compile6, 0, codeStyleProviders.getGenericsStyleProvider(), 1, null));
        List<Rule<R, Node<R>, S>> createGenericCodeRules4 = createGenericCodeRules(codeStyleProviders, l12, new String[]{"struct", "trait", "mod"}, new String[]{"Self|Result|Ok|Err|Option|None|Some", "Copy|Clone|Eq|Hash|Send|Sync|Sized|Debug|Display", "Arc|Rc|Box|Pin|Future", "true|false|bool|usize|i64|u64|u32|i32|str|String"}, "let|mut|static|const|unsafe", "crate|mod|extern|pub|pub(super)|use", "struct|enum|trait|type|where|impl|dyn|async|await|move|self|fn", "for|while|loop|if|else|match|break|continue|return|try", "in|as|ref");
        Xml xml = Xml.INSTANCE;
        Pattern pattern = PATTERN_LEADING_WS_CONSUMER;
        Pattern pattern2 = PATTERN_TEXT;
        l13 = j.l(toMatchGroupRule$default(this, xml.getPATTERN_XML_COMMENT(), 0, codeStyleProviders.getCommentStyleProvider(), 1, null), xml.createTagRule(codeStyleProviders), toMatchGroupRule$default(this, pattern, 0, null, 3, null), toMatchGroupRule$default(this, pattern2, 0, null, 3, null));
        Pattern createSingleLineCommentPattern4 = createSingleLineCommentPattern("#");
        q.f(createSingleLineCommentPattern4, "createSingleLineCommentPattern(\"#\")");
        Pattern compile7 = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");
        q.f(compile7, "Pattern.compile(\"\"\"^\"[\\s…*?(?<!\\\\)\"(?=\\W|\\s|$)\"\"\")");
        String pattern3 = createWordPattern$simpleast_core_release("true|false|null").pattern();
        q.f(pattern3, "createWordPattern(\"true|false|null\").pattern()");
        Pattern compile8 = Pattern.compile(pattern3, 2);
        q.f(compile8, "java.util.regex.Pattern.compile(this, flags)");
        String pattern4 = createWordPattern$simpleast_core_release("select|from|join|where|and|as|distinct|count|avg", "order by|group by|desc|sum|min|max", "like|having|in|is|not").pattern();
        q.f(pattern4, "createWordPattern(\n     …ing|in|is|not\").pattern()");
        Pattern compile9 = Pattern.compile(pattern4, 2);
        q.f(compile9, "java.util.regex.Pattern.compile(this, flags)");
        l14 = j.l(toMatchGroupRule$default(this, createSingleLineCommentPattern4, 0, codeStyleProviders.getCommentStyleProvider(), 1, null), toMatchGroupRule$default(this, compile7, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null), toMatchGroupRule$default(this, compile8, 0, codeStyleProviders.getGenericsStyleProvider(), 1, null), toMatchGroupRule$default(this, compile9, 0, codeStyleProviders.getKeywordStyleProvider(), 1, null), toMatchGroupRule$default(this, PATTERN_NUMBERS, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null), toMatchGroupRule$default(this, pattern, 0, null, 3, null), toMatchGroupRule$default(this, pattern2, 0, null, 3, null));
        Crystal crystal = Crystal.INSTANCE;
        String[] built_ins2 = crystal.getBUILT_INS();
        String[] keywords2 = crystal.getKEYWORDS();
        List<Rule<R, Node<R>, S>> createGenericCodeRules5 = createGenericCodeRules(codeStyleProviders, crystal.createCrystalCodeRules$simpleast_core_release(codeStyleProviders), new String[]{"def", "class"}, built_ins2, (String[]) Arrays.copyOf(keywords2, keywords2.length));
        JavaScript javaScript = JavaScript.INSTANCE;
        String[] built_ins3 = javaScript.getBUILT_INS();
        String[] keywords3 = javaScript.getKEYWORDS();
        List<Rule<R, Node<R>, S>> createGenericCodeRules6 = createGenericCodeRules(codeStyleProviders, javaScript.createCodeRules$simpleast_core_release(codeStyleProviders), new String[]{"class"}, built_ins3, (String[]) Arrays.copyOf(keywords3, keywords3.length));
        k10 = v.k(x.a("kt", createGenericCodeRules), x.a("kotlin", createGenericCodeRules), x.a("protobuf", createGenericCodeRules2), x.a("proto", createGenericCodeRules2), x.a("pb", createGenericCodeRules2), x.a("py", createGenericCodeRules3), x.a("python", createGenericCodeRules3), x.a("rs", createGenericCodeRules4), x.a("rust", createGenericCodeRules4), x.a("cql", l14), x.a("sql", l14), x.a("xml", l13), x.a("http", l13), x.a("cr", createGenericCodeRules5), x.a("crystal", createGenericCodeRules5), x.a("js", createGenericCodeRules6), x.a("javascript", createGenericCodeRules6));
        return k10;
    }

    public final <R, S> Rule<R, Node<R>, S> createCodeRule(final StyleNode.SpanProvider<R> textStyleProvider, final Map<String, ? extends List<? extends Rule<R, Node<R>, S>>> languageMap, final Function3<? super CodeNode<R>, ? super Boolean, ? super S, ? extends Node<R>> wrapperNodeProvider) {
        q.g(textStyleProvider, "textStyleProvider");
        q.g(languageMap, "languageMap");
        q.g(wrapperNodeProvider, "wrapperNodeProvider");
        final Pattern pattern = PATTERN_CODE_BLOCK;
        return new Rule<R, Node<R>, S>(pattern) { // from class: com.discord.simpleast.code.CodeRules$createCodeRule$2
            @Override // com.discord.simpleast.core.parser.Rule
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s10) {
                CodeNode.Content content;
                q.g(matcher, "matcher");
                q.g(parser, "parser");
                String group = matcher.group(1);
                String group2 = matcher.group(3);
                if (group2 == null) {
                    group2 = "";
                }
                String group3 = matcher.group(2);
                List list = null;
                boolean z10 = false;
                if (group3 != null) {
                    z10 = ri.v.L(group3, '\n', false, 2, null);
                }
                if (group != null) {
                    list = (List) languageMap.get(group);
                }
                if (list != null) {
                    List parse = parser.parse(group2, s10, list);
                    if (parse != null) {
                        content = new CodeNode.Content.Parsed(group2, parse);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.discord.simpleast.core.node.Node<R>>");
                    }
                } else {
                    content = new CodeNode.Content.Raw(group2);
                }
                return ParseSpec.Companion.createTerminal((Node) wrapperNodeProvider.invoke(new CodeNode(content, group, textStyleProvider), Boolean.valueOf(z10), s10), s10);
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createDefinitionRule(final CodeStyleProviders<R> codeStyleProviders, final String... identifiers) {
        String c02;
        q.g(codeStyleProviders, "codeStyleProviders");
        q.g(identifiers, "identifiers");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^\\b(");
        c02 = f.c0(identifiers, "|", null, null, 0, null, null, 62, null);
        sb2.append(c02);
        sb2.append(")(\\s+\\w+)");
        final Pattern compile = Pattern.compile(sb2.toString());
        q.f(compile, "Pattern.compile(\"\"\"^\\b($…String(\"|\")})(\\s+\\w+)\"\"\")");
        return new Rule<R, Node<R>, S>(compile) { // from class: com.discord.simpleast.code.CodeRules$createDefinitionRule$1
            @Override // com.discord.simpleast.core.parser.Rule
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s10) {
                q.g(matcher, "matcher");
                q.g(parser, "parser");
                String group = matcher.group(1);
                q.d(group);
                String group2 = matcher.group(2);
                q.d(group2);
                return ParseSpec.Companion.createTerminal(new CodeNode.DefinitionNode(group, group2, CodeStyleProviders.this), s10);
            }
        };
    }

    public final <R, S> Rule<R, Node<R>, S> createInlineCodeRule(StyleNode.SpanProvider<R> textStyleProvider, StyleNode.SpanProvider<R> bgStyleProvider) {
        q.g(textStyleProvider, "textStyleProvider");
        q.g(bgStyleProvider, "bgStyleProvider");
        return new CodeRules$createInlineCodeRule$1(this, textStyleProvider, bgStyleProvider, PATTERN_CODE_INLINE);
    }

    public final Pattern createWordPattern$simpleast_core_release(String... words) {
        String c02;
        q.g(words, "words");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^\\b(?:");
        c02 = f.c0(words, "|", null, null, 0, null, null, 62, null);
        sb2.append(c02);
        sb2.append(")\\b");
        return Pattern.compile(sb2.toString());
    }

    public final Pattern getPATTERN_CODE_BLOCK() {
        return PATTERN_CODE_BLOCK;
    }

    public final Pattern getPATTERN_CODE_INLINE() {
        return PATTERN_CODE_INLINE;
    }

    public final Pattern getPATTERN_LEADING_WS_CONSUMER() {
        return PATTERN_LEADING_WS_CONSUMER;
    }

    public final Pattern getPATTERN_NUMBERS() {
        return PATTERN_NUMBERS;
    }

    public final Pattern getPATTERN_TEXT() {
        return PATTERN_TEXT;
    }

    public final <R, S> Rule<R, Node<R>, S> toMatchGroupRule(final Pattern toMatchGroupRule, final int i10, final StyleNode.SpanProvider<R> spanProvider) {
        q.g(toMatchGroupRule, "$this$toMatchGroupRule");
        return new Rule<R, Node<R>, S>(toMatchGroupRule) { // from class: com.discord.simpleast.code.CodeRules$toMatchGroupRule$1
            @Override // com.discord.simpleast.core.parser.Rule
            public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s10) {
                Object obj;
                q.g(matcher, "matcher");
                q.g(parser, "parser");
                String group = matcher.group(i10);
                if (group == null) {
                    group = "";
                }
                StyleNode.SpanProvider spanProvider2 = spanProvider;
                if (spanProvider2 != null) {
                    obj = new StyleNode.TextStyledNode(group, spanProvider2);
                } else {
                    obj = new TextNode(group);
                }
                return ParseSpec.Companion.createTerminal(obj, s10);
            }
        };
    }
}
