package com.discord.chat.bridge.row;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import wi.c0;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

final class LoadingActionType$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final LoadingActionType$Companion$$cachedSerializer$delegate$1 INSTANCE = new LoadingActionType$Companion$$cachedSerializer$delegate$1();

    LoadingActionType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override 
    public final KSerializer<Object> invoke() {
        return c0.a("com.discord.chat.bridge.row.LoadingActionType", LoadingActionType.values(), new String[]{"load_more_before", "load_more_after"}, new Annotation[][]{null, null});
    }
}
