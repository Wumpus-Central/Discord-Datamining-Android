package com.discord.simpleast.code;

import com.discord.simpleast.core.node.StyleNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9674n;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"RC", "p1", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Iterable;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 4, 0})
/* loaded from: classes7.dex */
final /* synthetic */ class Xml$TagNode$render$typeStylesProvider$1 extends C9674n implements Function1<RC, Iterable<?>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Xml$TagNode$render$typeStylesProvider$1(StyleNode.SpanProvider spanProvider) {
        super(1, spanProvider, StyleNode.SpanProvider.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Iterable;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Iterable<?> invoke(RC rc) {
        return ((StyleNode.SpanProvider) this.receiver).get(rc);
    }
}
