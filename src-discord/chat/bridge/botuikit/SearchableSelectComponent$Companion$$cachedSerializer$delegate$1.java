package com.discord.chat.bridge.botuikit;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import qi.c;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SearchableSelectComponent$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final SearchableSelectComponent$Companion$$cachedSerializer$delegate$1 INSTANCE = new SearchableSelectComponent$Companion$$cachedSerializer$delegate$1();

    SearchableSelectComponent$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new c(f0.b(SearchableSelectComponent.class), new Annotation[0]);
    }
}
