package com.discord.notifications.api;

import com.discord.notifications.api.StickerType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlinx.serialization.KSerializer;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
final class StickerType$Companion$$cachedSerializer$delegate$1 extends AbstractC9973s implements Function0<KSerializer<Object>> {
    public static final StickerType$Companion$$cachedSerializer$delegate$1 INSTANCE = new StickerType$Companion$$cachedSerializer$delegate$1();

    StickerType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return StickerType.Serializer.INSTANCE;
    }
}
