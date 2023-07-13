package com.discord.chat.bridge.botuikit;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import pi.c;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

final class SelectComponent$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final SelectComponent$Companion$$cachedSerializer$delegate$1 INSTANCE = new SelectComponent$Companion$$cachedSerializer$delegate$1();

    SelectComponent$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override 
    public final KSerializer<Object> invoke() {
        return new c(f0.b(SelectComponent.class), new Annotation[0]);
    }
}
