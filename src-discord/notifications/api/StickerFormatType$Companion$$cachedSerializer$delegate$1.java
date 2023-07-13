package com.discord.notifications.api;

import com.discord.notifications.api.StickerFormatType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

final class StickerFormatType$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final StickerFormatType$Companion$$cachedSerializer$delegate$1 INSTANCE = new StickerFormatType$Companion$$cachedSerializer$delegate$1();

    StickerFormatType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override 
    public final KSerializer<Object> invoke() {
        return StickerFormatType.Serializer.INSTANCE;
    }
}
