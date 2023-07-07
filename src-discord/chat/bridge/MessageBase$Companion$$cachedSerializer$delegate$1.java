package com.discord.chat.bridge;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.s;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MessageBase$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final MessageBase$Companion$$cachedSerializer$delegate$1 INSTANCE = new MessageBase$Companion$$cachedSerializer$delegate$1();

    MessageBase$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new SealedClassSerializer("com.discord.chat.bridge.MessageBase", f0.b(MessageBase.class), new KClass[]{f0.b(ErrorMessage.class), f0.b(Message.class)}, new KSerializer[]{ErrorMessage$$serializer.INSTANCE, Message$$serializer.INSTANCE}, new Annotation[0]);
    }
}
