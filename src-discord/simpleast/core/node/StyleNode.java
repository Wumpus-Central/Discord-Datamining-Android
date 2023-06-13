package com.discord.simpleast.core.node;

import android.text.SpannableStringBuilder;
import com.discord.simpleast.core.node.Node;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0003\u000f\u0010\u0011B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/discord/simpleast/core/node/StyleNode;", "RC", "T", "Lcom/discord/simpleast/core/node/Node$Parent;", "styles", "", "(Ljava/util/List;)V", "getStyles", "()Ljava/util/List;", "render", "", "builder", "Landroid/text/SpannableStringBuilder;", "renderContext", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V", "Companion", "SpanProvider", "TextStyledNode", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public class StyleNode<RC, T> extends Node.Parent<RC> {
    public static final Companion Companion = new Companion(null);
    private final List<T> styles;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/discord/simpleast/core/node/StyleNode$Companion;", "", "()V", "wrapText", "Lcom/discord/simpleast/core/node/StyleNode;", "RC", "T", "content", "", "styles", "", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <RC, T> StyleNode<RC, T> wrapText(String content, List<? extends T> styles) {
            q.g(content, "content");
            q.g(styles, "styles");
            StyleNode<RC, T> styleNode = new StyleNode<>(styles);
            styleNode.addChild(new TextNode(content));
            return styleNode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J\u0019\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00028\u0002H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;", "RC", "", "get", "", "renderContext", "(Ljava/lang/Object;)Ljava/lang/Iterable;", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public interface SpanProvider<RC> {
        Iterable<?> get(RC rc2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/discord/simpleast/core/node/StyleNode$TextStyledNode;", "RC", "Lcom/discord/simpleast/core/node/TextNode;", "content", "", "stylesProvider", "Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;", "(Ljava/lang/String;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;)V", "getStylesProvider", "()Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;", "render", "", "builder", "Landroid/text/SpannableStringBuilder;", "renderContext", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class TextStyledNode<RC> extends TextNode<RC> {
        private final SpanProvider<RC> stylesProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextStyledNode(String content, SpanProvider<RC> stylesProvider) {
            super(content);
            q.g(content, "content");
            q.g(stylesProvider, "stylesProvider");
            this.stylesProvider = stylesProvider;
        }

        public final SpanProvider<RC> getStylesProvider() {
            return this.stylesProvider;
        }

        @Override // com.discord.simpleast.core.node.TextNode, com.discord.simpleast.core.node.Node
        public void render(SpannableStringBuilder builder, RC rc2) {
            q.g(builder, "builder");
            int length = builder.length();
            super.render(builder, rc2);
            Iterator<?> it = this.stylesProvider.get(rc2).iterator();
            while (it.hasNext()) {
                builder.setSpan(it.next(), length, builder.length(), 33);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StyleNode(List<? extends T> styles) {
        super(new Node[0]);
        q.g(styles, "styles");
        this.styles = styles;
    }

    public static final <RC, T> StyleNode<RC, T> wrapText(String str, List<? extends T> list) {
        return Companion.wrapText(str, list);
    }

    public final List<T> getStyles() {
        return this.styles;
    }

    @Override // com.discord.simpleast.core.node.Node.Parent, com.discord.simpleast.core.node.Node
    public void render(SpannableStringBuilder builder, RC rc2) {
        q.g(builder, "builder");
        int length = builder.length();
        super.render(builder, rc2);
        for (T t10 : this.styles) {
            builder.setSpan(t10, length, builder.length(), 33);
        }
    }
}
