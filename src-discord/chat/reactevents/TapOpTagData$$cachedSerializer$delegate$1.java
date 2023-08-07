package com.discord.chat.reactevents;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import wi.h1;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

final class TapOpTagData$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final TapOpTagData$$cachedSerializer$delegate$1 INSTANCE = new TapOpTagData$$cachedSerializer$delegate$1();

    TapOpTagData$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override 
    public final KSerializer<Object> invoke() {
        return new h1("com.discord.chat.reactevents.TapOpTagData", TapOpTagData.INSTANCE, new Annotation[0]);
    }
}
