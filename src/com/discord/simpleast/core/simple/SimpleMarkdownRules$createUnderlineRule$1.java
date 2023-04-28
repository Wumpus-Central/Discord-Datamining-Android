package com.discord.simpleast.core.simple;

import android.text.style.CharacterStyle;
import android.text.style.UnderlineSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9609i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;

@Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, m15073d2 = {"<anonymous>", "", "Landroid/text/style/CharacterStyle;", "R", "S", "invoke"}, m15072k = 3, m15071mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class SimpleMarkdownRules$createUnderlineRule$1 extends AbstractC9679s implements Function0<List<? extends CharacterStyle>> {
    public static final SimpleMarkdownRules$createUnderlineRule$1 INSTANCE = new SimpleMarkdownRules$createUnderlineRule$1();

    SimpleMarkdownRules$createUnderlineRule$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends CharacterStyle> invoke() {
        List<? extends CharacterStyle> d;
        d = C9609i.m14825d(new UnderlineSpan());
        return d;
    }
}
