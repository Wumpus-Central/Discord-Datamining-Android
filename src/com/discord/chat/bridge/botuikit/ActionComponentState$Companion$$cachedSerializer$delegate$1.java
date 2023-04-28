package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.botuikit.ActionComponentState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlinx.serialization.KSerializer;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class ActionComponentState$Companion$$cachedSerializer$delegate$1 extends AbstractC9679s implements Function0<KSerializer<Object>> {
    public static final ActionComponentState$Companion$$cachedSerializer$delegate$1 INSTANCE = new ActionComponentState$Companion$$cachedSerializer$delegate$1();

    ActionComponentState$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return ActionComponentState.Serializer.INSTANCE;
    }
}
