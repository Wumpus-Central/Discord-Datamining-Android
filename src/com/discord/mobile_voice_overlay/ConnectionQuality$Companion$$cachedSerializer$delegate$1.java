package com.discord.mobile_voice_overlay;

import bj.C2509c0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlinx.serialization.KSerializer;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class ConnectionQuality$Companion$$cachedSerializer$delegate$1 extends AbstractC9679s implements Function0<KSerializer<Object>> {
    public static final ConnectionQuality$Companion$$cachedSerializer$delegate$1 INSTANCE = new ConnectionQuality$Companion$$cachedSerializer$delegate$1();

    ConnectionQuality$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return C2509c0.m33941a("com.discord.mobile_voice_overlay.ConnectionQuality", ConnectionQuality.values(), new String[]{"fine", "average", "bad", "unknown"}, new Annotation[][]{null, null, null, null});
    }
}
