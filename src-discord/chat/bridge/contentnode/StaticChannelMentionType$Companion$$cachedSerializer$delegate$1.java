package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.contentnode.StaticChannelMentionType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

final class StaticChannelMentionType$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final StaticChannelMentionType$Companion$$cachedSerializer$delegate$1 INSTANCE = new StaticChannelMentionType$Companion$$cachedSerializer$delegate$1();

    StaticChannelMentionType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override 
    public final KSerializer<Object> invoke() {
        return StaticChannelMentionType.Serializer.INSTANCE;
    }
}
