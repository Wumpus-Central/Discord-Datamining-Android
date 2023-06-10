package com.discord.simpleast.core.node;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012B\u001d\u0012\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011R\u001c\u0010\u0003\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/simpleast/core/node/Node;", "R", "", "children", "", "(Ljava/util/Collection;)V", "addChild", "", "child", "getChildren", "", "hasChildren", "", "render", "builder", "Landroid/text/SpannableStringBuilder;", "renderContext", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V", "Parent", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public class Node<R> {
    private Collection<Node<R>> children;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B)\u0012\"\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0004\"\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/discord/simpleast/core/node/Node$Parent;", "R", "Lcom/discord/simpleast/core/node/Node;", "children", "", "([Lcom/discord/simpleast/core/node/Node;)V", "render", "", "builder", "Landroid/text/SpannableStringBuilder;", "renderContext", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V", "toString", "", "simpleast-core_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static class Parent<R> extends Node<R> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Parent(com.discord.simpleast.core.node.Node<R>... r5) {
            /*
                r4 = this;
                java.lang.String r0 = "children"
                kotlin.jvm.internal.q.g(r5, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = r5.length
                r2 = 0
            L_0x000c:
                if (r2 >= r1) goto L_0x0018
                r3 = r5[r2]
                if (r3 == 0) goto L_0x0015
                r0.add(r3)
            L_0x0015:
                int r2 = r2 + 1
                goto L_0x000c
            L_0x0018:
                java.util.List r5 = kotlin.collections.h.F0(r0)
                r4.<init>(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.simpleast.core.node.Node.Parent.<init>(com.discord.simpleast.core.node.Node[]):void");
        }

        @Override // com.discord.simpleast.core.node.Node
        public void render(SpannableStringBuilder builder, R r10) {
            q.g(builder, "builder");
            Collection<Node<R>> children = getChildren();
            if (children != null) {
                Iterator<T> it = children.iterator();
                while (it.hasNext()) {
                    ((Node) it.next()).render(builder, r10);
                }
            }
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" >\n");
            Collection<Node<R>> children = getChildren();
            if (children != null) {
                str = r.e0(children, "\n->", ">>", "\n>|", 0, null, Node$Parent$toString$1.INSTANCE, 24, null);
            } else {
                str = null;
            }
            sb2.append(str);
            return sb2.toString();
        }
    }

    public Node() {
        this(null, 1, null);
    }

    public Node(Collection<Node<R>> collection) {
        this.children = collection;
    }

    public final void addChild(Node<R> child) {
        q.g(child, "child");
        Collection<Node<R>> collection = this.children;
        if (collection == null) {
            collection = new ArrayList<>();
        }
        collection.add(child);
        Unit unit = Unit.f22104a;
        this.children = collection;
    }

    public final Collection<Node<R>> getChildren() {
        return this.children;
    }

    public final boolean hasChildren() {
        Collection<Node<R>> collection = this.children;
        return collection != null && (collection.isEmpty() ^ true);
    }

    public void render(SpannableStringBuilder builder, R r10) {
        q.g(builder, "builder");
    }

    public /* synthetic */ Node(Collection collection, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : collection);
    }
}
