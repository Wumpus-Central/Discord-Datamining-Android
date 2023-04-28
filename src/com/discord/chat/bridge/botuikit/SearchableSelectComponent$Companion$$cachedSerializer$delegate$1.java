package com.discord.chat.bridge.botuikit;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9656f0;
import kotlinx.serialization.KSerializer;
import p450yi.C14365c;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class SearchableSelectComponent$Companion$$cachedSerializer$delegate$1 extends AbstractC9679s implements Function0<KSerializer<Object>> {
    public static final SearchableSelectComponent$Companion$$cachedSerializer$delegate$1 INSTANCE = new SearchableSelectComponent$Companion$$cachedSerializer$delegate$1();

    SearchableSelectComponent$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new C14365c(C9656f0.m14684b(SearchableSelectComponent.class), new Annotation[0]);
    }
}
