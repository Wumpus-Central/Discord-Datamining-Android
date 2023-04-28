package com.discord.simpleast.core.node;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "", "R", "it", "Lcom/discord/simpleast/core/node/Node;", "invoke"}, m15072k = 3, m15071mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class Node$Parent$toString$1 extends AbstractC9679s implements Function1<Node<R>, CharSequence> {
    public static final Node$Parent$toString$1 INSTANCE = new Node$Parent$toString$1();

    Node$Parent$toString$1() {
        super(1);
    }

    public final CharSequence invoke(Node<R> it) {
        C9677q.m14633g(it, "it");
        return it.toString();
    }
}
