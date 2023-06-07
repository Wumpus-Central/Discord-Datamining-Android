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
final class MentionContentNode$Companion$$cachedSerializer$delegate$1 extends s implements Function0<KSerializer<Object>> {
    public static final MentionContentNode$Companion$$cachedSerializer$delegate$1 INSTANCE = new MentionContentNode$Companion$$cachedSerializer$delegate$1();

    MentionContentNode$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new SealedClassSerializer("com.discord.chat.bridge.contentnode.MentionContentNode", f0.b(MentionContentNode.class), new KClass[]{f0.b(ChannelMentionContentNode.class), f0.b(CommandMentionContentNode.class), f0.b(StaticChannelMentionContentNode.class), f0.b(UserOrRoleMentionContentNode.class)}, new KSerializer[]{ChannelMentionContentNode$$serializer.INSTANCE, CommandMentionContentNode$$serializer.INSTANCE, StaticChannelMentionContentNode$$serializer.INSTANCE, UserOrRoleMentionContentNode$$serializer.INSTANCE}, new Annotation[0]);
    }
}
