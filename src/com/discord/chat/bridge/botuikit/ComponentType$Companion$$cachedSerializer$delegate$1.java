package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.botuikit.ComponentType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlinx.serialization.KSerializer;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class ComponentType$Companion$$cachedSerializer$delegate$1 extends AbstractC9679s implements Function0<KSerializer<Object>> {
    public static final ComponentType$Companion$$cachedSerializer$delegate$1 INSTANCE = new ComponentType$Companion$$cachedSerializer$delegate$1();

    ComponentType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return ComponentType.Serializer.INSTANCE;
    }
}
