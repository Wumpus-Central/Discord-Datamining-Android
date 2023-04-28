package com.discord.chat.bridge.contentnode;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9951f0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class MentionContentNode$Companion$$cachedSerializer$delegate$1 extends AbstractC9973s implements Function0<KSerializer<Object>> {
    public static final MentionContentNode$Companion$$cachedSerializer$delegate$1 INSTANCE = new MentionContentNode$Companion$$cachedSerializer$delegate$1();

    MentionContentNode$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final KSerializer<Object> invoke() {
        return new SealedClassSerializer("com.discord.chat.bridge.contentnode.MentionContentNode", C9951f0.m14684b(MentionContentNode.class), new KClass[]{C9951f0.m14684b(ChannelMentionContentNode.class), C9951f0.m14684b(CommandMentionContentNode.class), C9951f0.m14684b(StaticChannelMentionContentNode.class), C9951f0.m14684b(UserOrRoleMentionContentNode.class)}, new KSerializer[]{ChannelMentionContentNode$$serializer.INSTANCE, CommandMentionContentNode$$serializer.INSTANCE, StaticChannelMentionContentNode$$serializer.INSTANCE, UserOrRoleMentionContentNode$$serializer.INSTANCE}, new Annotation[0]);
    }
}
