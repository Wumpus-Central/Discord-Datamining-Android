package com.discord.chat.bridge.embed;

import com.discord.chat.bridge.embed.EmbedFailureState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlinx.serialization.KSerializer;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class EmbedFailureState$Companion$$cachedSerializer$delegate$1 extends AbstractC9973s implements Function0<KSerializer<Object>> {
    public static final EmbedFailureState$Companion$$cachedSerializer$delegate$1 INSTANCE = new EmbedFailureState$Companion$$cachedSerializer$delegate$1();

    EmbedFailureState$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return EmbedFailureState.Serializer.INSTANCE;
    }
}
