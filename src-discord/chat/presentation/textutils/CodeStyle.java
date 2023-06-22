package com.discord.chat.presentation.textutils;

import android.graphics.Color;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.RelativeSizeSpan;
import com.discord.chat.bridge.contentnode.CodeBlockContentNode;
import com.discord.fonts.DiscordFont;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.simpleast.code.CodeRules;
import com.discord.simpleast.code.CodeStyleProviders;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.node.TextNode;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import com.discord.simpleast.core.simple.SimpleRenderer;
import com.discord.span.utilities.SpannableStringBuilderExtensionsKt;
import com.discord.span.utilities.spannable.BlockBackgroundSpan;
import com.discord.span.utilities.spannable.VerticalPaddingSpan;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.s;
import kg.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i;
import kotlin.jvm.internal.q;
import oj.v;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u001e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0005R0\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0004\u0012\u00020\u00010\u0004j\u0002`\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR6\u0010\n\u001a*\u0012\u0004\u0012\u00020\f\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0004\u0012\u00020\u00010\u0004j\u0002`\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/presentation/textutils/CodeStyle;", "", "()V", "parser", "Lcom/discord/simpleast/core/parser/Parser;", "Lcom/discord/chat/presentation/textutils/RenderContext;", "Lcom/discord/simpleast/core/node/Node;", "Lcom/discord/chat/presentation/textutils/CodeParser;", "getParser", "()Lcom/discord/simpleast/core/parser/Parser;", "parsers", "", "", "staticCodeStyles", "Lcom/discord/simpleast/code/CodeStyleProviders;", "generateAst", "", "node", "Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;", "renderCode", "", "builder", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "rc", "renderCodeBlock", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CodeStyle {
    public static final CodeStyle INSTANCE = new CodeStyle();
    private static final CodeStyleProviders<RenderContext> staticCodeStyles = new CodeStyleProviders<>(null, null, new StyleNode.SpanProvider() { // from class: com.discord.chat.presentation.textutils.a
        @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
        public final Iterable get(Object obj) {
            Iterable staticCodeStyles$lambda$0;
            staticCodeStyles$lambda$0 = CodeStyle.staticCodeStyles$lambda$0((RenderContext) obj);
            return staticCodeStyles$lambda$0;
        }
    }, new StyleNode.SpanProvider() { // from class: com.discord.chat.presentation.textutils.b
        @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
        public final Iterable get(Object obj) {
            Iterable staticCodeStyles$lambda$1;
            staticCodeStyles$lambda$1 = CodeStyle.staticCodeStyles$lambda$1((RenderContext) obj);
            return staticCodeStyles$lambda$1;
        }
    }, new StyleNode.SpanProvider() { // from class: com.discord.chat.presentation.textutils.c
        @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
        public final Iterable get(Object obj) {
            Iterable staticCodeStyles$lambda$2;
            staticCodeStyles$lambda$2 = CodeStyle.staticCodeStyles$lambda$2((RenderContext) obj);
            return staticCodeStyles$lambda$2;
        }
    }, new StyleNode.SpanProvider() { // from class: com.discord.chat.presentation.textutils.d
        @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
        public final Iterable get(Object obj) {
            Iterable staticCodeStyles$lambda$3;
            staticCodeStyles$lambda$3 = CodeStyle.staticCodeStyles$lambda$3((RenderContext) obj);
            return staticCodeStyles$lambda$3;
        }
    }, new StyleNode.SpanProvider() { // from class: com.discord.chat.presentation.textutils.e
        @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
        public final Iterable get(Object obj) {
            Iterable staticCodeStyles$lambda$4;
            staticCodeStyles$lambda$4 = CodeStyle.staticCodeStyles$lambda$4((RenderContext) obj);
            return staticCodeStyles$lambda$4;
        }
    }, new StyleNode.SpanProvider() { // from class: com.discord.chat.presentation.textutils.f
        @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
        public final Iterable get(Object obj) {
            Iterable staticCodeStyles$lambda$5;
            staticCodeStyles$lambda$5 = CodeStyle.staticCodeStyles$lambda$5((RenderContext) obj);
            return staticCodeStyles$lambda$5;
        }
    }, 3, null);
    private static final Map<String, Parser<RenderContext, Node<RenderContext>, Object>> parsers = new LinkedHashMap();

    private CodeStyle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable _get_parser_$lambda$9$lambda$6(RenderContext it) {
        List d10;
        q.g(it, "it");
        d10 = i.d(new ForegroundColorSpan(ThemeManagerKt.getTheme().getHeaderSecondary()));
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable _get_parser_$lambda$9$lambda$7(RenderContext it) {
        List d10;
        q.g(it, "it");
        d10 = i.d(new ForegroundColorSpan(ThemeManagerKt.getTheme().getTextMuted()));
        return d10;
    }

    private final List<Node<RenderContext>> generateAst(CodeBlockContentNode codeBlockContentNode) {
        CharSequence V0;
        CharSequence V02;
        List list;
        List d10;
        V0 = v.V0(codeBlockContentNode.getLang());
        String obj = V0.toString();
        V02 = v.V0(codeBlockContentNode.getContent());
        String obj2 = V02.toString();
        String str = "```" + obj + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + obj2 + "\n```";
        try {
            s.a aVar = s.f21872l;
            list = s.b(Parser.parse$default(getParser(), str, Unit.f22113a, null, 4, null));
        } catch (Throwable th2) {
            s.a aVar2 = s.f21872l;
            list = s.b(t.a(th2));
        }
        d10 = i.d(new TextNode(obj2));
        if (s.g(list)) {
            list = d10;
        }
        return (List) list;
    }

    private final Parser<RenderContext, Node<RenderContext>, Object> getParser() {
        CodeStyleProviders copy;
        Map<String, Parser<RenderContext, Node<RenderContext>, Object>> map = parsers;
        String simpleName = ThemeManagerKt.getTheme().getClass().getSimpleName();
        q.f(simpleName, "Theme::class.java.simpleName");
        Parser<RenderContext, Node<RenderContext>, Object> parser = map.get(simpleName);
        if (parser == null) {
            copy = r3.copy((r18 & 1) != 0 ? r3.defaultStyleProvider : new StyleNode.SpanProvider() { // from class: com.discord.chat.presentation.textutils.g
                @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
                public final Iterable get(Object obj) {
                    Iterable _get_parser_$lambda$9$lambda$6;
                    _get_parser_$lambda$9$lambda$6 = CodeStyle._get_parser_$lambda$9$lambda$6((RenderContext) obj);
                    return _get_parser_$lambda$9$lambda$6;
                }
            }, (r18 & 2) != 0 ? r3.commentStyleProvider : new StyleNode.SpanProvider() { // from class: com.discord.chat.presentation.textutils.h
                @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
                public final Iterable get(Object obj) {
                    Iterable _get_parser_$lambda$9$lambda$7;
                    _get_parser_$lambda$9$lambda$7 = CodeStyle._get_parser_$lambda$9$lambda$7((RenderContext) obj);
                    return _get_parser_$lambda$9$lambda$7;
                }
            }, (r18 & 4) != 0 ? r3.literalStyleProvider : null, (r18 & 8) != 0 ? r3.keywordStyleProvider : null, (r18 & 16) != 0 ? r3.identifierStyleProvider : null, (r18 & 32) != 0 ? r3.typesStyleProvider : null, (r18 & 64) != 0 ? r3.genericsStyleProvider : null, (r18 & 128) != 0 ? staticCodeStyles.paramsStyleProvider : null);
            CodeRules codeRules = CodeRules.INSTANCE;
            Rule<RenderContext, ? extends Node<RenderContext>, Object> createCodeRule$default = CodeRules.createCodeRule$default(codeRules, copy.getDefaultStyleProvider(), codeRules.createCodeLanguageMap(copy), null, 4, null);
            Parser<RenderContext, Node<RenderContext>, Object> parser2 = new Parser<>(false, 1, null);
            parser2.addRule(createCodeRule$default);
            map.put(simpleName, parser2);
            parser = parser2;
        }
        return parser;
    }

    private final void renderCode(DraweeSpanStringBuilder draweeSpanStringBuilder, CodeBlockContentNode codeBlockContentNode, RenderContext renderContext) {
        SimpleRenderer.render(draweeSpanStringBuilder, generateAst(codeBlockContentNode), renderContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable staticCodeStyles$lambda$0(RenderContext it) {
        List d10;
        q.g(it, "it");
        d10 = i.d(new ForegroundColorSpan(Color.parseColor("#199A79")));
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable staticCodeStyles$lambda$1(RenderContext it) {
        List d10;
        q.g(it, "it");
        d10 = i.d(new ForegroundColorSpan(Color.parseColor("#7A8E00")));
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable staticCodeStyles$lambda$2(RenderContext it) {
        List d10;
        q.g(it, "it");
        d10 = i.d(new ForegroundColorSpan(Color.parseColor("#4C9CDF")));
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable staticCodeStyles$lambda$3(RenderContext it) {
        List d10;
        q.g(it, "it");
        d10 = i.d(new ForegroundColorSpan(Color.parseColor("#AED581")));
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable staticCodeStyles$lambda$4(RenderContext it) {
        List d10;
        q.g(it, "it");
        d10 = i.d(new ForegroundColorSpan(Color.parseColor("#A77B02")));
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable staticCodeStyles$lambda$5(RenderContext it) {
        List d10;
        q.g(it, "it");
        d10 = i.d(new ForegroundColorSpan(Color.parseColor("#AF8AF4")));
        return d10;
    }

    public final void renderCodeBlock(DraweeSpanStringBuilder builder, CodeBlockContentNode node, RenderContext rc2) {
        int i10;
        q.g(builder, "builder");
        q.g(node, "node");
        q.g(rc2, "rc");
        if (rc2.spoilerIsHidden()) {
            i10 = rc2.getTheme().getSpoilerHiddenBackground();
        } else {
            i10 = rc2.getTheme().getBackgroundSecondary();
        }
        BlockBackgroundSpan blockBackgroundSpan = new BlockBackgroundSpan(i10, rc2.getTheme().getBackgroundSecondaryAlt(), SizeUtilsKt.getDpToPx(1), SizeUtilsKt.getDpToPx(4), rc2.getInsets().getStart(), rc2.getInsets().getTop(), rc2.getInsets().getBottom());
        int dpToPx = SizeUtilsKt.getDpToPx(4);
        LeadingMarginSpan.Standard standard = new LeadingMarginSpan.Standard(SizeUtilsKt.getDpToPx(8));
        VerticalPaddingSpan verticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(0.85f);
        DiscordFontSpan discordFontSpan = new DiscordFontSpan(rc2.getContext(), DiscordFont.SourceCodePro);
        SpannableStringBuilderExtensionsKt.ensureNewline$default(builder, null, 1, null);
        Object[] objArr = {blockBackgroundSpan, standard, verticalPaddingSpan, relativeSizeSpan, discordFontSpan};
        int length = builder.length();
        SpannableStringBuilderExtensionsKt.ensureNewline(builder, new AbsoluteSizeSpan(dpToPx));
        INSTANCE.renderCode(builder, node, rc2);
        SpannableStringBuilderExtensionsKt.ensureNewline(builder, new AbsoluteSizeSpan(dpToPx));
        for (int i11 = 0; i11 < 5; i11++) {
            Object obj = objArr[i11];
            if (obj != null) {
                builder.setSpan(obj, length, builder.length(), 33);
            }
        }
    }
}
