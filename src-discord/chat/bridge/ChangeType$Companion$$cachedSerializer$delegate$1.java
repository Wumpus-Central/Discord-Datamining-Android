package com.discord.chat.bridge;

import com.discord.chat.bridge.ChangeType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChangeType$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final ChangeType$Companion$$cachedSerializer$delegate$1 INSTANCE = new ChangeType$Companion$$cachedSerializer$delegate$1();

    ChangeType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return ChangeType.Serializer.INSTANCE;
    }
}
