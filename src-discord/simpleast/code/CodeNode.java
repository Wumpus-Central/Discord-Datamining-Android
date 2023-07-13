package com.discord.simpleast.code;

import android.text.SpannableStringBuilder;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.node.TextNode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u0014\u0015B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/simpleast/code/CodeNode;", "RC", "Lcom/discord/simpleast/core/node/TextNode;", "content", "Lcom/discord/simpleast/code/CodeNode$Content;", "language", "", "stylesProvider", "Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;", "(Lcom/discord/simpleast/code/CodeNode$Content;Ljava/lang/String;Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;)V", "equals", "", "other", "", "render", "", "builder", "Landroid/text/SpannableStringBuilder;", "renderContext", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V", "Content", "DefinitionNode", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})

public class CodeNode<RC> extends TextNode<RC> {
    private final String language;
    private final StyleNode.SpanProvider<RC> stylesProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/discord/simpleast/code/CodeNode$Content;", "", "body", "", "(Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "Parsed", "Raw", "Lcom/discord/simpleast/code/CodeNode$Content$Raw;", "Lcom/discord/simpleast/code/CodeNode$Content$Parsed;", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    
    public static abstract class Content {
        private final String body;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0002\u0010\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/discord/simpleast/code/CodeNode$Content$Parsed;", "RC", "Lcom/discord/simpleast/code/CodeNode$Content;", "raw", "", "children", "", "Lcom/discord/simpleast/core/node/Node;", "(Ljava/lang/String;Ljava/util/List;)V", "getChildren", "()Ljava/util/List;", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
        
        public static final class Parsed<RC> extends Content {
            private final List<Node<RC>> children;

            
            
            public Parsed(String raw, List<? extends Node<RC>> children) {
                super(raw, null);
                q.g(raw, "raw");
                q.g(children, "children");
                this.children = children;
            }

            public final List<Node<RC>> getChildren() {
                return this.children;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/simpleast/code/CodeNode$Content$Raw;", "Lcom/discord/simpleast/code/CodeNode$Content;", "body", "", "(Ljava/lang/String;)V", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
        
        public static final class Raw extends Content {
            
            public Raw(String body) {
                super(body, null);
                q.g(body, "body");
            }
        }

        private Content(String str) {
            this.body = str;
        }

        public final String getBody() {
            return this.body;
        }

        public  Content(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/discord/simpleast/code/CodeNode$DefinitionNode;", "RC", "Lcom/discord/simpleast/core/node/Node$Parent;", "pre", "", ZeroconfModule.KEY_SERVICE_NAME, "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/simpleast/code/CodeStyleProviders;)V", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    
    public static final class DefinitionNode<RC> extends Node.Parent<RC> {
        
        public DefinitionNode(String pre, String name, CodeStyleProviders<RC> codeStyleProviders) {
            super(new StyleNode.TextStyledNode(pre, codeStyleProviders.getKeywordStyleProvider()), new StyleNode.TextStyledNode(name, codeStyleProviders.getTypesStyleProvider()));
            q.g(pre, "pre");
            q.g(name, "name");
            q.g(codeStyleProviders, "codeStyleProviders");
        }
    }

    
    public CodeNode(Content content, String str, StyleNode.SpanProvider<RC> stylesProvider) {
        super(content.getBody());
        q.g(content, "content");
        q.g(stylesProvider, "stylesProvider");
        this.language = str;
        this.stylesProvider = stylesProvider;
        if (content instanceof Content.Parsed) {
            Iterator<T> it = ((Content.Parsed) content).getChildren().iterator();
            while (it.hasNext()) {
                Node<R> node = (Node) it.next();
                if (node != 0) {
                    addChild(node);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.discord.simpleast.core.node.Node<RC>");
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof CodeNode) {
            CodeNode codeNode = (CodeNode) obj;
            if (q.b(codeNode.language, this.language) && q.b(codeNode.getContent(), getContent())) {
                return true;
            }
        }
        return false;
    }

    @Override 
    public void render(SpannableStringBuilder builder, RC rc2) {
        q.g(builder, "builder");
        Iterable<?> iterable = this.stylesProvider.get(rc2);
        if (hasChildren()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                spannableStringBuilder.setSpan(it.next(), 0, 0, 18);
            }
            Collection<Node<RC>> children = getChildren();
            if (children != null) {
                Iterator<T> it2 = children.iterator();
                while (it2.hasNext()) {
                    ((Node) it2.next()).render(spannableStringBuilder, rc2);
                }
            }
            builder.append((char) 8202);
            builder.insert(builder.length() - 1, (CharSequence) spannableStringBuilder);
            return;
        }
        int length = builder.length();
        builder.append(getContent());
        Iterator<?> it3 = iterable.iterator();
        while (it3.hasNext()) {
            builder.setSpan(it3.next(), length, builder.length(), 17);
        }
    }
}
