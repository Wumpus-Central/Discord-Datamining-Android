package com.discord.chat.bridge.contentnode;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.s;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class EmojiContentNode$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final EmojiContentNode$Companion$$cachedSerializer$delegate$1 INSTANCE = new EmojiContentNode$Companion$$cachedSerializer$delegate$1();

    EmojiContentNode$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new SealedClassSerializer("com.discord.chat.bridge.contentnode.EmojiContentNode", f0.b(EmojiContentNode.class), new KClass[]{f0.b(CustomEmojiContentNode.class), f0.b(UnicodeEmojiContentNode.class)}, new KSerializer[]{CustomEmojiContentNode$$serializer.INSTANCE, UnicodeEmojiContentNode$$serializer.INSTANCE}, new Annotation[0]);
    }
}
