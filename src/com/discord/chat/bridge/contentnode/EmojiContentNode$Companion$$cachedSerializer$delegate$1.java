package com.discord.chat.bridge.contentnode;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9656f0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class EmojiContentNode$Companion$$cachedSerializer$delegate$1 extends AbstractC9679s implements Function0<KSerializer<Object>> {
    public static final EmojiContentNode$Companion$$cachedSerializer$delegate$1 INSTANCE = new EmojiContentNode$Companion$$cachedSerializer$delegate$1();

    EmojiContentNode$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new SealedClassSerializer("com.discord.chat.bridge.contentnode.EmojiContentNode", C9656f0.m14684b(EmojiContentNode.class), new KClass[]{C9656f0.m14684b(CustomEmojiContentNode.class), C9656f0.m14684b(UnicodeEmojiContentNode.class)}, new KSerializer[]{CustomEmojiContentNode$$serializer.INSTANCE, UnicodeEmojiContentNode$$serializer.INSTANCE}, new Annotation[0]);
    }
}
