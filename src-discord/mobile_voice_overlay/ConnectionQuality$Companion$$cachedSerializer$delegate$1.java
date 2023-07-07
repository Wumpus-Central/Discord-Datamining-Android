package com.discord.mobile_voice_overlay;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import ti.c0;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ConnectionQuality$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final ConnectionQuality$Companion$$cachedSerializer$delegate$1 INSTANCE = new ConnectionQuality$Companion$$cachedSerializer$delegate$1();

    ConnectionQuality$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return c0.a("com.discord.mobile_voice_overlay.ConnectionQuality", ConnectionQuality.values(), new String[]{"fine", "average", "bad", "unknown"}, new Annotation[][]{null, null, null, null});
    }
}
