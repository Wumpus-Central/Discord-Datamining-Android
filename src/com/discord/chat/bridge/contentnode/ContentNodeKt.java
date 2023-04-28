package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m15073d2 = {"sealedClassSerializer", "Lkotlinx/serialization/SealedClassSerializer;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "getSealedClassSerializer$annotations", "()V", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ContentNodeKt {
    private static final SealedClassSerializer<ContentNode> sealedClassSerializer = new SealedClassSerializer<>("ContentNode", C9951f0.m14684b(ContentNode.class), new KClass[]{C9951f0.m14684b(BlockQuoteContentNode.class), C9951f0.m14684b(BulletListContentNode.class), C9951f0.m14684b(ChannelMentionContentNode.class), C9951f0.m14684b(ChannelNameContentNode.class), C9951f0.m14684b(CodeBlockContentNode.class), C9951f0.m14684b(CommandMentionContentNode.class), C9951f0.m14684b(CustomEmojiContentNode.class), C9951f0.m14684b(EmojiContentNode.class), C9951f0.m14684b(EmphasisContentNode.class), C9951f0.m14684b(GuildNameContentNode.class), C9951f0.m14684b(HeadingContentNode.class), C9951f0.m14684b(InlineCodeContentNode.class), C9951f0.m14684b(LineBreakContentNode.class), C9951f0.m14684b(LinkContentNode.class), C9951f0.m14684b(MentionContentNode.class), C9951f0.m14684b(ParagraphContentNode.class), C9951f0.m14684b(SpoilerContentNode.class), C9951f0.m14684b(StaticChannelMentionContentNode.class), C9951f0.m14684b(StrikethroughContentNode.class), C9951f0.m14684b(StrongContentNode.class), C9951f0.m14684b(TextContentNode.class), C9951f0.m14684b(TimestampContentNode.class), C9951f0.m14684b(UnderlineContentNode.class), C9951f0.m14684b(UnicodeEmojiContentNode.class), C9951f0.m14684b(UserOrRoleMentionContentNode.class)}, new KSerializer[]{BlockQuoteContentNode.Companion.serializer(), BulletListContentNode.Companion.serializer(), ChannelMentionContentNode.Companion.serializer(), ChannelNameContentNode.Companion.serializer(), CodeBlockContentNode.Companion.serializer(), CommandMentionContentNode.Companion.serializer(), CustomEmojiContentNode.Companion.serializer(), EmojiContentNode.Companion.serializer(), EmphasisContentNode.Companion.serializer(), GuildNameContentNode.Companion.serializer(), HeadingContentNode.Companion.serializer(), InlineCodeContentNode.Companion.serializer(), LineBreakContentNode.Companion.serializer(), LinkContentNode.Companion.serializer(), MentionContentNode.Companion.serializer(), ParagraphContentNode.Companion.serializer(), SpoilerContentNode.Companion.serializer(), StaticChannelMentionContentNode.Companion.serializer(), StrikethroughContentNode.Companion.serializer(), StrongContentNode.Companion.serializer(), TextContentNode.Companion.serializer(), TimestampContentNode.Companion.serializer(), UnderlineContentNode.Companion.serializer(), UnicodeEmojiContentNode.Companion.serializer(), UserOrRoleMentionContentNode.Companion.serializer()});

    private static /* synthetic */ void getSealedClassSerializer$annotations() {
    }
}
