package com.discord.chat.bridge.embed;

import com.discord.chat.bridge.embed.EmbedFailureState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

final class EmbedFailureState$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final EmbedFailureState$Companion$$cachedSerializer$delegate$1 INSTANCE = new EmbedFailureState$Companion$$cachedSerializer$delegate$1();

    EmbedFailureState$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override 
    public final KSerializer<Object> invoke() {
        return EmbedFailureState.Serializer.INSTANCE;
    }
}
