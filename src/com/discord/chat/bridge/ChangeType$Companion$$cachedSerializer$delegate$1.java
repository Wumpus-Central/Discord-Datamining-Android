package com.discord.chat.bridge;

import com.discord.chat.bridge.ChangeType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlinx.serialization.KSerializer;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class ChangeType$Companion$$cachedSerializer$delegate$1 extends AbstractC9973s implements Function0<KSerializer<Object>> {
    public static final ChangeType$Companion$$cachedSerializer$delegate$1 INSTANCE = new ChangeType$Companion$$cachedSerializer$delegate$1();

    ChangeType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return ChangeType.Serializer.INSTANCE;
    }
}
