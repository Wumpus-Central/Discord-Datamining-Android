package com.discord.simpleast.core.node;

import android.text.SpannableStringBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/discord/simpleast/core/node/TextNode;", "R", "Lcom/discord/simpleast/core/node/Node;", "content", "", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "render", "", "builder", "Landroid/text/SpannableStringBuilder;", "renderContext", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V", "toString", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})

public class TextNode<R> extends Node<R> {
    private final String content;

    
    public TextNode(String content) {
        super(null, 1, null);
        q.g(content, "content");
        this.content = content;
    }

    public final String getContent() {
        return this.content;
    }

    @Override 
    public void render(SpannableStringBuilder builder, R r10) {
        q.g(builder, "builder");
        builder.append((CharSequence) this.content);
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + this.content;
    }
}
