package com.discord.simpleast.markdown;

import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import com.discord.simpleast.core.node.Node;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;

@Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u001d\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m15073d2 = {"Lcom/discord/simpleast/markdown/MarkdownListItemNode;", "R", "Lcom/discord/simpleast/core/node/Node;", "bulletSpanProvider", "Lkotlin/Function0;", "Landroid/text/style/BulletSpan;", "(Lkotlin/jvm/functions/Function0;)V", "getBulletSpanProvider", "()Lkotlin/jvm/functions/Function0;", "render", "", "builder", "Landroid/text/SpannableStringBuilder;", "renderContext", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V", "simpleast-core_release"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes7.dex */
public class MarkdownListItemNode<R> extends Node<R> {
    private final Function0<BulletSpan> bulletSpanProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarkdownListItemNode(Function0<? extends BulletSpan> bulletSpanProvider) {
        super(null, 1, null);
        C9971q.m14633g(bulletSpanProvider, "bulletSpanProvider");
        this.bulletSpanProvider = bulletSpanProvider;
    }

    public final Function0<BulletSpan> getBulletSpanProvider() {
        return this.bulletSpanProvider;
    }

    @Override // com.discord.simpleast.core.node.Node
    public void render(SpannableStringBuilder builder, R r) {
        C9971q.m14633g(builder, "builder");
        int length = builder.length();
        Collection<Node<R>> children = getChildren();
        if (children != null) {
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                ((Node) it.next()).render(builder, r);
            }
        }
        builder.setSpan(this.bulletSpanProvider.invoke(), length, length + 1, 33);
    }
}
