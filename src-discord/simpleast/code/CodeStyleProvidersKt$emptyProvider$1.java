package com.discord.simpleast.code;

import com.discord.simpleast.core.node.StyleNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "R", "it", "get", "(Ljava/lang/Object;)Ljava/lang/Iterable;"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes6.dex */
final class CodeStyleProvidersKt$emptyProvider$1<RC> implements StyleNode.SpanProvider<R> {
    public static final CodeStyleProvidersKt$emptyProvider$1 INSTANCE = new CodeStyleProvidersKt$emptyProvider$1();

    CodeStyleProvidersKt$emptyProvider$1() {
    }

    @Override // com.discord.simpleast.core.node.StyleNode.SpanProvider
    public final Iterable<?> get(R r10) {
        List i10;
        i10 = j.i();
        return i10;
    }
}
