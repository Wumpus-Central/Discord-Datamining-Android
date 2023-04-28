package com.discord.chat.bridge.interaction;

import com.discord.chat.bridge.interaction.InteractionStatusViewState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlinx.serialization.KSerializer;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* renamed from: com.discord.chat.bridge.interaction.InteractionStatusViewState$Companion$$cachedSerializer$delegate$1 */
/* loaded from: classes4.dex */
final class C4257xb1fb8692 extends AbstractC9973s implements Function0<KSerializer<Object>> {
    public static final C4257xb1fb8692 INSTANCE = new C4257xb1fb8692();

    C4257xb1fb8692() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return InteractionStatusViewState.Serializer.INSTANCE;
    }
}
