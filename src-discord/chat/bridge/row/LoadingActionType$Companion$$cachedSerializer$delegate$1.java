package com.discord.chat.bridge.row;

import bj.c0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class LoadingActionType$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final LoadingActionType$Companion$$cachedSerializer$delegate$1 INSTANCE = new LoadingActionType$Companion$$cachedSerializer$delegate$1();

    LoadingActionType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return c0.a("com.discord.chat.bridge.row.LoadingActionType", LoadingActionType.values(), new String[]{"load_more_before", "load_more_after"}, new Annotation[][]{null, null});
    }
}
