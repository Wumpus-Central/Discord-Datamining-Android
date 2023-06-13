package com.discord.chat.bridge.codedlinks;

import com.discord.chat.bridge.codedlinks.InviteType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class InviteType$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final InviteType$Companion$$cachedSerializer$delegate$1 INSTANCE = new InviteType$Companion$$cachedSerializer$delegate$1();

    InviteType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return InviteType.Serializer.INSTANCE;
    }
}
