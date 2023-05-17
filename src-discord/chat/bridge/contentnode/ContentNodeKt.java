package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sealedClassSerializer", "Lkotlinx/serialization/SealedClassSerializer;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "getSealedClassSerializer$annotations", "()V", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContentNodeKt {
    private static final SealedClassSerializer<ContentNode> sealedClassSerializer = new SealedClassSerializer<>("ContentNode", f0.b(ContentNode.class), new KClass[]{f0.b(BlockQuoteContentNode.class), f0.b(BulletListContentNode.class), f0.b(ChannelMentionContentNode.class), f0.b(ChannelNameContentNode.class), f0.b(CodeBlockContentNode.class), f0.b(CommandMentionContentNode.class), f0.b(CustomEmojiContentNode.class), f0.b(EmojiContentNode.class), f0.b(EmphasisContentNode.class), f0.b(GuildNameContentNode.class), f0.b(HeadingContentNode.class), f0.b(InlineCodeContentNode.class), f0.b(LineBreakContentNode.class), f0.b(LinkContentNode.class), f0.b(MentionContentNode.class), f0.b(ParagraphContentNode.class), f0.b(SpoilerContentNode.class), f0.b(StaticChannelMentionContentNode.class), f0.b(StrikethroughContentNode.class), f0.b(StrongContentNode.class), f0.b(TextContentNode.class), f0.b(TimestampContentNode.class), f0.b(UnderlineContentNode.class), f0.b(UnicodeEmojiContentNode.class), f0.b(UserOrRoleMentionContentNode.class)}, new KSerializer[]{BlockQuoteContentNode.Companion.serializer(), BulletListContentNode.Companion.serializer(), ChannelMentionContentNode.Companion.serializer(), ChannelNameContentNode.Companion.serializer(), CodeBlockContentNode.Companion.serializer(), CommandMentionContentNode.Companion.serializer(), CustomEmojiContentNode.Companion.serializer(), EmojiContentNode.Companion.serializer(), EmphasisContentNode.Companion.serializer(), GuildNameContentNode.Companion.serializer(), HeadingContentNode.Companion.serializer(), InlineCodeContentNode.Companion.serializer(), LineBreakContentNode.Companion.serializer(), LinkContentNode.Companion.serializer(), MentionContentNode.Companion.serializer(), ParagraphContentNode.Companion.serializer(), SpoilerContentNode.Companion.serializer(), StaticChannelMentionContentNode.Companion.serializer(), StrikethroughContentNode.Companion.serializer(), StrongContentNode.Companion.serializer(), TextContentNode.Companion.serializer(), TimestampContentNode.Companion.serializer(), UnderlineContentNode.Companion.serializer(), UnicodeEmojiContentNode.Companion.serializer(), UserOrRoleMentionContentNode.Companion.serializer()});

    private static /* synthetic */ void getSealedClassSerializer$annotations() {
    }
}
