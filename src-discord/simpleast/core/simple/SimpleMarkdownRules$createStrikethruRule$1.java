package com.discord.simpleast.core.simple;

import android.text.style.CharacterStyle;
import android.text.style.StrikethroughSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroid/text/style/CharacterStyle;", "R", "S", "invoke"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes5.dex */
final class SimpleMarkdownRules$createStrikethruRule$1 extends s implements Function0<List<? extends CharacterStyle>> {
    public static final SimpleMarkdownRules$createStrikethruRule$1 INSTANCE = new SimpleMarkdownRules$createStrikethruRule$1();

    SimpleMarkdownRules$createStrikethruRule$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends CharacterStyle> invoke() {
        List<? extends CharacterStyle> d10;
        d10 = i.d(new StrikethroughSpan());
        return d10;
    }
}
