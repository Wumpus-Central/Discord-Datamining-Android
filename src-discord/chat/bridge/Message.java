package com.discord.chat.bridge;

import androidx.recyclerview.widget.RecyclerView;
import co.discord.media_engine.b;
import com.discord.chat.bridge.MessageState;
import com.discord.chat.bridge.MessageType;
import com.discord.chat.bridge.activityinviteembed.ActivityInviteEmbed;
import com.discord.chat.bridge.activityinviteembed.ActivityInviteEmbed$$serializer;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.attachment.Attachment$$serializer;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.bridge.automod.AutoModerationContext$$serializer;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.chat.bridge.botuikit.ComponentSerializer;
import com.discord.chat.bridge.codedlinks.CodedLinkEmbed;
import com.discord.chat.bridge.codedlinks.CodedLinkSerializer;
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag;
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag$$serializer;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.embed.Embed$$serializer;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.chat.bridge.ephemeral.EphemeralIndication$$serializer;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.bridge.executedcommand.ExecutedCommand$$serializer;
import com.discord.chat.bridge.feedback.SurveyIndication;
import com.discord.chat.bridge.feedback.SurveyIndication$$serializer;
import com.discord.chat.bridge.forums.ForumPostActions;
import com.discord.chat.bridge.forums.ForumPostActions$$serializer;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.discord.chat.bridge.gift.GiftEmbedSerializer;
import com.discord.chat.bridge.interaction.InteractionStatus;
import com.discord.chat.bridge.interaction.InteractionStatus$$serializer;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed$$serializer;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.MessageReaction$$serializer;
import com.discord.chat.bridge.referencedmessage.ReferencedMessage;
import com.discord.chat.bridge.referencedmessage.ReferencedMessageSerializer;
import com.discord.chat.bridge.roleicons.RoleIcon;
import com.discord.chat.bridge.roleicons.RoleIcon$$serializer;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.bridge.sticker.Sticker$$serializer;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.chat.bridge.threads.ThreadEmbed;
import com.discord.chat.bridge.threads.ThreadEmbed$$serializer;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import gf.n;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.f;
import ri.a;
import ti.a2;
import ti.e0;
import ti.h;
import ti.m0;
import ti.n1;
import ti.w0;

@f
@Metadata(d1 = {"\u0000\u008b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b¿\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ¹\u00022\u00020\u0001:\u0004¸\u0002¹\u0002Bª\u0006\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$\u0012\b\u0010/\u001a\u0004\u0018\u00010\u001e\u0012\b\u00100\u001a\u0004\u0018\u00010\u001e\u0012\u0010\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$\u0012\u000e\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$\u0012\b\u00105\u001a\u0004\u0018\u000106\u0012\b\u00107\u001a\u0004\u0018\u000108\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\u0006\u0010;\u001a\u00020\u001e\u0012\b\u0010<\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010=\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010>\u001a\u0004\u0018\u00010?\u0012\b\u0010@\u001a\u0004\u0018\u00010A\u0012\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010E\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010G\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010L\u001a\u0004\u0018\u00010M\u0012\b\u0010N\u001a\u0004\u0018\u00010O\u0012\b\u0010P\u001a\u0004\u0018\u00010Q\u0012\b\u0010R\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010S\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010T\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$\u0012\b\u0010X\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010[\u001a\u0004\u0018\u000104\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010^\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010_\u001a\u0004\u0018\u00010`\u0012\u0006\u0010a\u001a\u00020\u001e\u0012\b\u0010b\u001a\u0004\u0018\u00010c\u0012\b\u0010d\u001a\u0004\u0018\u00010e\u0012\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010$\u0012\b\u0010h\u001a\u0004\u0018\u00010g\u0012\b\u0010i\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010j\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010k\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010$\u0012\b\u0010m\u001a\u0004\u0018\u00010nø\u0001\u0000¢\u0006\u0002\u0010oB\u0082\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001e\u0012\u0012\b\u0002\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$\u0012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\u0006\u0010;\u001a\u00020\u001e\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A\u0012\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010`\u0012\b\b\u0002\u0010a\u001a\u00020\u001e\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010c\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010e\u0012\u0010\b\u0002\u0010f\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010$\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010g\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010k\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010$ø\u0001\u0000¢\u0006\u0002\u0010pJ\n\u0010Ü\u0001\u001a\u00020\u0007HÆ\u0003J\u0011\u0010Ý\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010tJ\f\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010à\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u008d\u0001J\u0012\u0010á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u008d\u0001J\n\u0010â\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u001eHÆ\u0003J\u0012\u0010ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u008d\u0001J\u0012\u0010å\u0001\u001a\u0004\u0018\u00010\u0016HÀ\u0003¢\u0006\u0003\bæ\u0001J\f\u0010ç\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u001c\u0010è\u0001\u001a\u00020\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bé\u0001\u0010\u0083\u0001J\u0012\u0010ê\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$HÆ\u0003J\u0012\u0010ë\u0001\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$HÆ\u0003J\u0011\u0010ì\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010tJ\f\u0010í\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\u0012\u0010î\u0001\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$HÆ\u0003J\u0012\u0010ï\u0001\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$HÆ\u0003J\u0011\u0010ð\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\u0011\u0010ñ\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\u0014\u0010ò\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$HÆ\u0003J\u0012\u0010ó\u0001\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$HÆ\u0003J\u001e\u0010ô\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bõ\u0001\u0010\u0083\u0001J\f\u0010ö\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010÷\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010ø\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u001eHÆ\u0003J\u0011\u0010ú\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\u0011\u0010û\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\f\u0010ü\u0001\u001a\u0004\u0018\u00010?HÆ\u0003J\f\u0010ý\u0001\u001a\u0004\u0018\u00010AHÆ\u0003J\u0012\u0010þ\u0001\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$HÆ\u0003J\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u001c\u0010\u0080\u0002\u001a\u00020\fHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0081\u0002\u0010\u0089\u0001J\u0011\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\u0012\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u008d\u0001J\u0012\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u008d\u0001J\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0089\u0002\u001a\u0004\u0018\u00010MHÆ\u0003J\f\u0010\u008a\u0002\u001a\u0004\u0018\u00010OHÆ\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010QHÆ\u0003J\u001b\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u000eHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b\u008d\u0002J\u0011\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\u0011\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\u0011\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u0093\u0002\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$HÆ\u0003J\u0011\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\u0011\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\u0012\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0003\u0010³\u0001J\f\u0010\u0097\u0002\u001a\u0004\u0018\u000104HÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010yJ\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010`HÆ\u0003J\n\u0010\u009d\u0002\u001a\u00020\u001eHÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010cHÆ\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010eHÆ\u0003J\u0012\u0010 \u0002\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010$HÆ\u0003J\f\u0010¡\u0002\u001a\u0004\u0018\u00010gHÆ\u0003J\u0012\u0010¢\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u008d\u0001J\u001b\u0010£\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b¤\u0002J\f\u0010¥\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010¦\u0002\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010$HÆ\u0003J\n\u0010§\u0002\u001a\u00020\u0014HÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u009b\u0007\u0010©\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001e2\u0012\b\u0002\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$2\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$2\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020\u001e2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010[\u001a\u0004\u0018\u0001042\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010`2\b\b\u0002\u0010a\u001a\u00020\u001e2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010c2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010e2\u0010\b\u0002\u0010f\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010$2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010g2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010k\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010$HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bª\u0002\u0010«\u0002J\u0016\u0010¬\u0002\u001a\u00020\u001e2\n\u0010\u00ad\u0002\u001a\u0005\u0018\u00010®\u0002HÖ\u0003J\n\u0010¯\u0002\u001a\u00020\u0003HÖ\u0001J\n\u0010°\u0002\u001a\u00020\u0016HÖ\u0001J(\u0010±\u0002\u001a\u00030²\u00022\u0007\u0010³\u0002\u001a\u00020\u00002\b\u0010´\u0002\u001a\u00030µ\u00022\b\u0010¶\u0002\u001a\u00030·\u0002HÇ\u0001R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010u\u0012\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0013\u0010_\u001a\u0004\u0018\u00010`¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0015\u0010=\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010z\u001a\u0004\bx\u0010yR\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0015\u0010(\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010u\u001a\u0004\b}\u0010tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0015\u0010d\u001a\u0004\u0018\u00010e¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R!\u0010!\u001a\u0004\u0018\u00010\u00168\u0000X\u0081\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0084\u0001\u0010r\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R\u001a\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010|R\u0015\u0010]\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0083\u0001R\u001f\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010|R\u0018\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u008e\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010E\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010z\u001a\u0005\b\u008f\u0001\u0010yR\u001a\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010|R\u0015\u00107\u001a\u0004\u0018\u000108¢\u0006\n\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\"\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0094\u0001\u0010\u008d\u0001R\u0015\u0010)\u001a\u0004\u0018\u00010*¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0015\u0010V\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u0083\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u0083\u0001R\u001a\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010|R\u0015\u0010L\u001a\u0004\u0018\u00010M¢\u0006\n\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0015\u0010@\u001a\u0004\u0018\u00010A¢\u0006\n\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0013\u0010\u0013\u001a\u00020\u0014¢\u0006\n\n\u0000\u001a\u0006\b \u0001\u0010\u0089\u0001R\u0016\u0010<\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010z\u001a\u0005\b¡\u0001\u0010yR\u001a\u0010f\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010|R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001R\u001f\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0003\u0010¦\u0001\u001a\u0006\b¥\u0001\u0010\u0083\u0001R\u0015\u0010P\u001a\u0004\u0018\u00010Q¢\u0006\n\n\u0000\u001a\u0006\b§\u0001\u0010¨\u0001R\u0015\u0010X\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010z\u001a\u0004\bX\u0010yR\u0015\u0010T\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010z\u001a\u0004\bT\u0010yR\u0012\u0010a\u001a\u00020\u001e¢\u0006\t\n\u0000\u001a\u0005\ba\u0010©\u0001R\u0013\u0010;\u001a\u00020\u001e¢\u0006\n\n\u0000\u001a\u0006\bª\u0001\u0010©\u0001R\u0016\u0010Y\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010z\u001a\u0005\b«\u0001\u0010yR!\u0010\n\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0003\u0010¦\u0001\u001a\u0006\b¬\u0001\u0010\u0083\u0001R\u0015\u0010K\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0001\u0010\u0083\u0001R\u0015\u0010b\u001a\u0004\u0018\u00010c¢\u0006\n\n\u0000\u001a\u0006\b®\u0001\u0010¯\u0001R\u001a\u0010k\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010|R\u001a\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010|R\u0018\u0010Z\u001a\u0004\u0018\u00010\u0014¢\u0006\r\n\u0003\u0010´\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u001a\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\bµ\u0001\u0010|R\u0015\u0010>\u001a\u0004\u0018\u00010?¢\u0006\n\n\u0000\u001a\u0006\b¶\u0001\u0010·\u0001R\u0015\u0010h\u001a\u0004\u0018\u00010g¢\u0006\n\n\u0000\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u008e\u0001\u001a\u0006\bº\u0001\u0010\u008d\u0001R\u0015\u00105\u001a\u0004\u0018\u000106¢\u0006\n\n\u0000\u001a\u0006\b»\u0001\u0010¼\u0001R\u0013\u0010\u001d\u001a\u00020\u001e¢\u0006\n\n\u0000\u001a\u0006\b½\u0001\u0010©\u0001R\u0013\u0010\u001f\u001a\u00020\u001e¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010©\u0001R\u0016\u0010^\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010z\u001a\u0005\b¿\u0001\u0010yR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0000\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0015\u0010[\u001a\u0004\u0018\u000104¢\u0006\n\n\u0000\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0015\u0010\\\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÄ\u0001\u0010\u0083\u0001R\u001a\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\bÅ\u0001\u0010|R\u0015\u0010N\u001a\u0004\u0018\u00010O¢\u0006\n\n\u0000\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0015\u0010j\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÈ\u0001\u0010\u0083\u0001R\u0018\u0010I\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u008e\u0001\u001a\u0006\bÉ\u0001\u0010\u008d\u0001R\u0015\u0010F\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÊ\u0001\u0010\u0083\u0001R\u0018\u0010H\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u008e\u0001\u001a\u0006\bË\u0001\u0010\u008d\u0001R\u0015\u0010J\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÌ\u0001\u0010\u0083\u0001R\u0016\u0010G\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010z\u001a\u0005\bÍ\u0001\u0010yR\u0015\u00109\u001a\u0004\u0018\u00010:¢\u0006\n\n\u0000\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0015\u0010D\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÐ\u0001\u0010\u0083\u0001R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÑ\u0001\u0010\u0083\u0001R\u0015\u0010U\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÒ\u0001\u0010\u0083\u0001R\u0018\u0010i\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u008e\u0001\u001a\u0006\bÓ\u0001\u0010\u008d\u0001R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0000\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0016\u00100\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010z\u001a\u0005\bÖ\u0001\u0010yR\u0016\u0010R\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010z\u001a\u0005\b×\u0001\u0010yR\u0016\u0010S\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010z\u001a\u0005\bØ\u0001\u0010yR\u0016\u0010/\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010z\u001a\u0005\bÙ\u0001\u0010yR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÚ\u0001\u0010\u0083\u0001R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u008e\u0001\u001a\u0006\bÛ\u0001\u0010\u008d\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006º\u0002"}, d2 = {"Lcom/discord/chat/bridge/Message;", "Lcom/discord/chat/bridge/MessageBase;", "seen1", "", "seen2", "seen3", "type", "Lcom/discord/chat/bridge/MessageType;", "id", "Lcom/discord/primitives/MessageId;", "nonce", "channelId", "Lcom/discord/primitives/ChannelId;", "guildId", "Lcom/discord/primitives/GuildId;", "state", "Lcom/discord/chat/bridge/MessageState;", "authorId", "Lcom/discord/primitives/UserId;", "flags", "", "edited", "", "_constrainedWidth", "", "timestamp", "username", "usernameColor", "roleColor", "shouldShowRoleDot", "", "shouldShowRoleOnName", "colorString", "avatarURL", "avatarDecorationURL", "embeds", "", "Lcom/discord/chat/bridge/embed/Embed;", "attachments", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachmentsOpacity", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "progress", "Lcom/discord/chat/bridge/UploadProgress;", "reactions", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "useSortedReactions", "useAddBurstReaction", "codedLinks", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "stickers", "Lcom/discord/chat/bridge/sticker/Sticker;", "roleIcon", "Lcom/discord/chat/bridge/roleicons/RoleIcon;", "connectionsRoleTag", "Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;", "threadEmbed", "Lcom/discord/chat/bridge/threads/ThreadEmbed;", "mentioned", "gifAutoPlay", "animateEmoji", "referencedMessage", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "executedCommand", "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "components", "Lcom/discord/chat/bridge/botuikit/Component;", "threadStarterMessageHeader", "communicationDisabled", "tagText", "tagVerified", "tagTextColor", "tagBackgroundColor", "tagType", "opTagText", "ephemeralIndication", "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "surveyIndication", "Lcom/discord/chat/bridge/feedback/SurveyIndication;", "interactionStatus", "Lcom/discord/chat/bridge/interaction/InteractionStatus;", "useAttachmentGridLayout", "useAttachmentUploadPreview", "isCurrentUserMessageAuthor", "title", "description", "avatarURLs", "isCallActive", "missed", "rawMilliseconds", "sticker", "stickerLabel", "buttonLabel", "showInviteToSpeakButton", "activityInviteEmbed", "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "isFirstForumPostMessage", "postActions", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "autoModerationContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "giftCodes", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "referralTrialOffer", "totalMonthsSubscribed", "swipeToReplyIconUrl", "postPreviewEmbeds", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "get_constrainedWidth$annotations", "()V", "get_constrainedWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getActivityInviteEmbed", "()Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "getAnimateEmoji", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAttachments", "()Ljava/util/List;", "getAttachmentsOpacity", "getAuthorId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getAutoModerationContext", "()Lcom/discord/chat/bridge/automod/AutoModerationContext;", "getAvatarDecorationURL", "()Ljava/lang/String;", "getAvatarURL$chat_release$annotations", "getAvatarURL$chat_release", "getAvatarURLs", "getButtonLabel", "getChannelId-o4g7jtM", "()J", "J", "getCodedLinks", "getColorString", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCommunicationDisabled", "getComponents", "getConnectionsRoleTag", "()Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;", "constrainedWidth", "getConstrainedWidth", "constrainedWidth$delegate", "Lkotlin/Lazy;", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getDescription", "getEdited", "getEmbeds", "getEphemeralIndication", "()Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "getExecutedCommand", "()Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "getFlags", "getGifAutoPlay", "getGiftCodes", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getId-3Eiw7ao", "Ljava/lang/String;", "getInteractionStatus", "()Lcom/discord/chat/bridge/interaction/InteractionStatus;", "()Z", "getMentioned", "getMissed", "getNonce-N_6c4I0", "getOpTagText", "getPostActions", "()Lcom/discord/chat/bridge/forums/ForumPostActions;", "getPostPreviewEmbeds", "getProgress", "getRawMilliseconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReactions", "getReferencedMessage", "()Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "getReferralTrialOffer", "()Lcom/discord/chat/bridge/gift/GiftEmbed;", "getRoleColor", "getRoleIcon", "()Lcom/discord/chat/bridge/roleicons/RoleIcon;", "getShouldShowRoleDot", "getShouldShowRoleOnName", "getShowInviteToSpeakButton", "getState", "()Lcom/discord/chat/bridge/MessageState;", "getSticker", "()Lcom/discord/chat/bridge/sticker/Sticker;", "getStickerLabel", "getStickers", "getSurveyIndication", "()Lcom/discord/chat/bridge/feedback/SurveyIndication;", "getSwipeToReplyIconUrl", "getTagBackgroundColor", "getTagText", "getTagTextColor", "getTagType", "getTagVerified", "getThreadEmbed", "()Lcom/discord/chat/bridge/threads/ThreadEmbed;", "getThreadStarterMessageHeader", "getTimestamp", "getTitle", "getTotalMonthsSubscribed", "getType", "()Lcom/discord/chat/bridge/MessageType;", "getUseAddBurstReaction", "getUseAttachmentGridLayout", "getUseAttachmentUploadPreview", "getUseSortedReactions", "getUsername", "getUsernameColor", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component18$chat_release", "component19", "component2", "component2-3Eiw7ao", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component3-N_6c4I0", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component4-o4g7jtM", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component5-qOKuAAo", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component7-wUX8bhU", "component70", "component71", "component8", "component9", "copy", "copy-e0j9O-s", "(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/discord/chat/bridge/Message;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Message extends MessageBase {
    public static final Companion Companion = new Companion(null);
    private final Float _constrainedWidth;
    private final ActivityInviteEmbed activityInviteEmbed;
    private final Boolean animateEmoji;
    private final List<Attachment> attachments;
    private final Float attachmentsOpacity;
    private final UserId authorId;
    private final AutoModerationContext autoModerationContext;
    private final String avatarDecorationURL;
    private final String avatarURL;
    private final List<String> avatarURLs;
    private final String buttonLabel;
    private final long channelId;
    private final List<CodedLinkEmbed> codedLinks;
    private final Integer colorString;
    private final Boolean communicationDisabled;
    private final List<Component> components;
    private final ConnectionsRoleTag connectionsRoleTag;
    private final Lazy constrainedWidth$delegate;
    private final StructurableText content;
    private final String description;
    private final String edited;
    private final List<Embed> embeds;
    private final EphemeralIndication ephemeralIndication;
    private final ExecutedCommand executedCommand;
    private final long flags;
    private final Boolean gifAutoPlay;
    private final List<GiftEmbed> giftCodes;
    private final GuildId guildId;

    /* renamed from: id  reason: collision with root package name */
    private final String f7286id;
    private final InteractionStatus interactionStatus;
    private final Boolean isCallActive;
    private final Boolean isCurrentUserMessageAuthor;
    private final boolean isFirstForumPostMessage;
    private final boolean mentioned;
    private final Boolean missed;
    private final String nonce;
    private final String opTagText;
    private final ForumPostActions postActions;
    private final List<PostPreviewEmbed> postPreviewEmbeds;
    private final List<UploadProgress> progress;
    private final Long rawMilliseconds;
    private final List<MessageReaction> reactions;
    private final ReferencedMessage referencedMessage;
    private final GiftEmbed referralTrialOffer;
    private final Integer roleColor;
    private final RoleIcon roleIcon;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;
    private final Boolean showInviteToSpeakButton;
    private final MessageState state;
    private final Sticker sticker;
    private final String stickerLabel;
    private final List<Sticker> stickers;
    private final SurveyIndication surveyIndication;
    private final String swipeToReplyIconUrl;
    private final Integer tagBackgroundColor;
    private final String tagText;
    private final Integer tagTextColor;
    private final String tagType;
    private final Boolean tagVerified;
    private final ThreadEmbed threadEmbed;
    private final String threadStarterMessageHeader;
    private final String timestamp;
    private final String title;
    private final Integer totalMonthsSubscribed;
    private final MessageType type;
    private final Boolean useAddBurstReaction;
    private final Boolean useAttachmentGridLayout;
    private final Boolean useAttachmentUploadPreview;
    private final Boolean useSortedReactions;
    private final String username;
    private final Integer usernameColor;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.chat.bridge.Message$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    static final class AnonymousClass1 extends s implements Function0<Integer> {
        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            Float f10 = Message.this.get_constrainedWidth();
            if (f10 != null) {
                return Integer.valueOf(SizeUtilsKt.getDpToPx(f10.floatValue()));
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/Message$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/Message;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Message> serializer() {
            return Message$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private Message(int i10, int i11, int i12, MessageType messageType, String str, String str2, ChannelId channelId, GuildId guildId, MessageState messageState, UserId userId, long j10, String str3, Float f10, String str4, String str5, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str6, String str7, List<Embed> list, List<Attachment> list2, Float f11, StructurableText structurableText, List<UploadProgress> list3, List<MessageReaction> list4, Boolean bool, Boolean bool2, List<? extends CodedLinkEmbed> list5, List<Sticker> list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List<? extends Component> list7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num4, Integer num5, String str10, String str11, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str12, String str13, List<String> list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str14, String str15, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List<? extends GiftEmbed> list9, GiftEmbed giftEmbed, Integer num6, String str16, List<PostPreviewEmbed> list10, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, serializationConstructorMarker);
        Lazy b10;
        if (((11 != (i10 & 11)) | (1 != (i11 & 1))) || ((i12 & 0) != 0)) {
            n1.a(new int[]{i10, i11, i12}, new int[]{11, 1, 0}, Message$$serializer.INSTANCE.getDescriptor());
        }
        this.type = messageType;
        this.f7286id = str;
        if ((i10 & 4) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str2;
        }
        this.channelId = channelId.m571unboximpl();
        if ((i10 & 16) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((i10 & 32) == 0) {
            this.state = null;
        } else {
            this.state = messageState;
        }
        if ((i10 & 64) == 0) {
            this.authorId = null;
        } else {
            this.authorId = userId;
        }
        this.flags = (i10 & 128) == 0 ? 0L : j10;
        if ((i10 & 256) == 0) {
            this.edited = null;
        } else {
            this.edited = str3;
        }
        if ((i10 & 512) == 0) {
            this._constrainedWidth = null;
        } else {
            this._constrainedWidth = f10;
        }
        if ((i10 & 1024) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str4;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.username = null;
        } else {
            this.username = str5;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.usernameColor = null;
        } else {
            this.usernameColor = num;
        }
        if ((i10 & 8192) == 0) {
            this.roleColor = null;
        } else {
            this.roleColor = num2;
        }
        if ((i10 & 16384) == 0) {
            this.shouldShowRoleDot = false;
        } else {
            this.shouldShowRoleDot = z10;
        }
        if ((i10 & 32768) == 0) {
            this.shouldShowRoleOnName = false;
        } else {
            this.shouldShowRoleOnName = z11;
        }
        if ((i10 & 65536) == 0) {
            this.colorString = null;
        } else {
            this.colorString = num3;
        }
        if ((i10 & 131072) == 0) {
            this.avatarURL = null;
        } else {
            this.avatarURL = str6;
        }
        if ((i10 & 262144) == 0) {
            this.avatarDecorationURL = null;
        } else {
            this.avatarDecorationURL = str7;
        }
        if ((524288 & i10) == 0) {
            this.embeds = null;
        } else {
            this.embeds = list;
        }
        if ((1048576 & i10) == 0) {
            this.attachments = null;
        } else {
            this.attachments = list2;
        }
        if ((2097152 & i10) == 0) {
            this.attachmentsOpacity = null;
        } else {
            this.attachmentsOpacity = f11;
        }
        if ((4194304 & i10) == 0) {
            this.content = null;
        } else {
            this.content = structurableText;
        }
        if ((8388608 & i10) == 0) {
            this.progress = null;
        } else {
            this.progress = list3;
        }
        if ((16777216 & i10) == 0) {
            this.reactions = null;
        } else {
            this.reactions = list4;
        }
        this.useSortedReactions = (33554432 & i10) == 0 ? Boolean.TRUE : bool;
        this.useAddBurstReaction = (67108864 & i10) == 0 ? Boolean.FALSE : bool2;
        if ((134217728 & i10) == 0) {
            this.codedLinks = null;
        } else {
            this.codedLinks = list5;
        }
        if ((268435456 & i10) == 0) {
            this.stickers = null;
        } else {
            this.stickers = list6;
        }
        if ((536870912 & i10) == 0) {
            this.roleIcon = null;
        } else {
            this.roleIcon = roleIcon;
        }
        if ((1073741824 & i10) == 0) {
            this.connectionsRoleTag = null;
        } else {
            this.connectionsRoleTag = connectionsRoleTag;
        }
        if ((i10 & Integer.MIN_VALUE) == 0) {
            this.threadEmbed = null;
        } else {
            this.threadEmbed = threadEmbed;
        }
        this.mentioned = z12;
        if ((i11 & 2) == 0) {
            this.gifAutoPlay = null;
        } else {
            this.gifAutoPlay = bool3;
        }
        if ((i11 & 4) == 0) {
            this.animateEmoji = null;
        } else {
            this.animateEmoji = bool4;
        }
        if ((i11 & 8) == 0) {
            this.referencedMessage = null;
        } else {
            this.referencedMessage = referencedMessage;
        }
        if ((i11 & 16) == 0) {
            this.executedCommand = null;
        } else {
            this.executedCommand = executedCommand;
        }
        if ((i11 & 32) == 0) {
            this.components = null;
        } else {
            this.components = list7;
        }
        if ((i11 & 64) == 0) {
            this.threadStarterMessageHeader = null;
        } else {
            this.threadStarterMessageHeader = str8;
        }
        if ((i11 & 128) == 0) {
            this.communicationDisabled = null;
        } else {
            this.communicationDisabled = bool5;
        }
        if ((i11 & 256) == 0) {
            this.tagText = null;
        } else {
            this.tagText = str9;
        }
        if ((i11 & 512) == 0) {
            this.tagVerified = null;
        } else {
            this.tagVerified = bool6;
        }
        if ((i11 & 1024) == 0) {
            this.tagTextColor = null;
        } else {
            this.tagTextColor = num4;
        }
        if ((i11 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.tagBackgroundColor = null;
        } else {
            this.tagBackgroundColor = num5;
        }
        if ((i11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.tagType = null;
        } else {
            this.tagType = str10;
        }
        if ((i11 & 8192) == 0) {
            this.opTagText = null;
        } else {
            this.opTagText = str11;
        }
        if ((i11 & 16384) == 0) {
            this.ephemeralIndication = null;
        } else {
            this.ephemeralIndication = ephemeralIndication;
        }
        if ((i11 & 32768) == 0) {
            this.surveyIndication = null;
        } else {
            this.surveyIndication = surveyIndication;
        }
        if ((i11 & 65536) == 0) {
            this.interactionStatus = null;
        } else {
            this.interactionStatus = interactionStatus;
        }
        this.useAttachmentGridLayout = (i11 & 131072) == 0 ? Boolean.FALSE : bool7;
        this.useAttachmentUploadPreview = (i11 & 262144) == 0 ? Boolean.FALSE : bool8;
        this.isCurrentUserMessageAuthor = (524288 & i11) == 0 ? Boolean.FALSE : bool9;
        if ((1048576 & i11) == 0) {
            this.title = null;
        } else {
            this.title = str12;
        }
        if ((2097152 & i11) == 0) {
            this.description = null;
        } else {
            this.description = str13;
        }
        if ((4194304 & i11) == 0) {
            this.avatarURLs = null;
        } else {
            this.avatarURLs = list8;
        }
        if ((8388608 & i11) == 0) {
            this.isCallActive = null;
        } else {
            this.isCallActive = bool10;
        }
        if ((16777216 & i11) == 0) {
            this.missed = null;
        } else {
            this.missed = bool11;
        }
        if ((33554432 & i11) == 0) {
            this.rawMilliseconds = null;
        } else {
            this.rawMilliseconds = l10;
        }
        if ((67108864 & i11) == 0) {
            this.sticker = null;
        } else {
            this.sticker = sticker;
        }
        if ((134217728 & i11) == 0) {
            this.stickerLabel = null;
        } else {
            this.stickerLabel = str14;
        }
        if ((268435456 & i11) == 0) {
            this.buttonLabel = null;
        } else {
            this.buttonLabel = str15;
        }
        if ((536870912 & i11) == 0) {
            this.showInviteToSpeakButton = null;
        } else {
            this.showInviteToSpeakButton = bool12;
        }
        if ((1073741824 & i11) == 0) {
            this.activityInviteEmbed = null;
        } else {
            this.activityInviteEmbed = activityInviteEmbed;
        }
        if ((Integer.MIN_VALUE & i11) == 0) {
            this.isFirstForumPostMessage = false;
        } else {
            this.isFirstForumPostMessage = z13;
        }
        if ((i12 & 1) == 0) {
            this.postActions = null;
        } else {
            this.postActions = forumPostActions;
        }
        if ((i12 & 2) == 0) {
            this.autoModerationContext = null;
        } else {
            this.autoModerationContext = autoModerationContext;
        }
        if ((i12 & 4) == 0) {
            this.giftCodes = null;
        } else {
            this.giftCodes = list9;
        }
        if ((i12 & 8) == 0) {
            this.referralTrialOffer = null;
        } else {
            this.referralTrialOffer = giftEmbed;
        }
        if ((i12 & 16) == 0) {
            this.totalMonthsSubscribed = null;
        } else {
            this.totalMonthsSubscribed = num6;
        }
        if ((i12 & 32) == 0) {
            this.swipeToReplyIconUrl = null;
        } else {
            this.swipeToReplyIconUrl = str16;
        }
        if ((i12 & 64) == 0) {
            this.postPreviewEmbeds = null;
        } else {
            this.postPreviewEmbeds = list10;
        }
        b10 = n.b(new AnonymousClass1());
        this.constrainedWidth$delegate = b10;
    }

    public /* synthetic */ Message(int i10, int i11, int i12, MessageType messageType, String str, String str2, ChannelId channelId, GuildId guildId, MessageState messageState, UserId userId, long j10, String str3, Float f10, String str4, String str5, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str6, String str7, List list, List list2, Float f11, StructurableText structurableText, List list3, List list4, Boolean bool, Boolean bool2, List list5, List list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List list7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num4, Integer num5, String str10, String str11, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str12, String str13, List list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str14, String str15, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List list9, GiftEmbed giftEmbed, Integer num6, String str16, List list10, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, messageType, str, str2, channelId, guildId, messageState, userId, j10, str3, f10, str4, str5, num, num2, z10, z11, num3, str6, str7, list, list2, f11, structurableText, list3, list4, bool, bool2, list5, list6, roleIcon, connectionsRoleTag, threadEmbed, z12, bool3, bool4, referencedMessage, executedCommand, list7, str8, bool5, str9, bool6, num4, num5, str10, str11, ephemeralIndication, surveyIndication, interactionStatus, bool7, bool8, bool9, str12, str13, list8, bool10, bool11, l10, sticker, str14, str15, bool12, activityInviteEmbed, z13, forumPostActions, autoModerationContext, list9, giftEmbed, num6, str16, list10, serializationConstructorMarker);
    }

    public /* synthetic */ Message(MessageType messageType, String str, String str2, long j10, GuildId guildId, MessageState messageState, UserId userId, long j11, String str3, Float f10, String str4, String str5, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str6, String str7, List list, List list2, Float f11, StructurableText structurableText, List list3, List list4, Boolean bool, Boolean bool2, List list5, List list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List list7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num4, Integer num5, String str10, String str11, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str12, String str13, List list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str14, String str15, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List list9, GiftEmbed giftEmbed, Integer num6, String str16, List list10, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageType, str, str2, j10, guildId, messageState, userId, j11, str3, f10, str4, str5, num, num2, z10, z11, num3, str6, str7, list, list2, f11, structurableText, list3, list4, bool, bool2, list5, list6, roleIcon, connectionsRoleTag, threadEmbed, z12, bool3, bool4, referencedMessage, executedCommand, list7, str8, bool5, str9, bool6, num4, num5, str10, str11, ephemeralIndication, surveyIndication, interactionStatus, bool7, bool8, bool9, str12, str13, list8, bool10, bool11, l10, sticker, str14, str15, bool12, activityInviteEmbed, z13, forumPostActions, autoModerationContext, list9, giftEmbed, num6, str16, list10);
    }

    public static /* synthetic */ void getAvatarURL$chat_release$annotations() {
    }

    public static /* synthetic */ void get_constrainedWidth$annotations() {
    }

    public static final void write$Self(Message self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        MessageBase.write$Self(self, output, serialDesc);
        boolean z10 = false;
        output.C(serialDesc, 0, MessageType.Serializer.INSTANCE, self.type);
        MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
        output.C(serialDesc, 1, messageId$$serializer, MessageId.m588boximpl(self.f7286id));
        if (output.w(serialDesc, 2) || self.nonce != null) {
            String str = self.nonce;
            output.e(serialDesc, 2, messageId$$serializer, str != null ? MessageId.m588boximpl(str) : null);
        }
        output.C(serialDesc, 3, ChannelId$$serializer.INSTANCE, ChannelId.m562boximpl(self.channelId));
        if (output.w(serialDesc, 4) || self.guildId != null) {
            output.e(serialDesc, 4, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (output.w(serialDesc, 5) || self.state != null) {
            output.e(serialDesc, 5, MessageState.Serializer.INSTANCE, self.state);
        }
        if (output.w(serialDesc, 6) || self.authorId != null) {
            output.e(serialDesc, 6, UserId$$serializer.INSTANCE, self.authorId);
        }
        if (output.w(serialDesc, 7) || self.flags != 0) {
            output.D(serialDesc, 7, self.flags);
        }
        if (output.w(serialDesc, 8) || self.edited != null) {
            output.e(serialDesc, 8, a2.f26939a, self.edited);
        }
        if (output.w(serialDesc, 9) || self._constrainedWidth != null) {
            output.e(serialDesc, 9, e0.f26964a, self._constrainedWidth);
        }
        if (output.w(serialDesc, 10) || self.timestamp != null) {
            output.e(serialDesc, 10, a2.f26939a, self.timestamp);
        }
        if (output.w(serialDesc, 11) || self.username != null) {
            output.e(serialDesc, 11, a2.f26939a, self.username);
        }
        if (output.w(serialDesc, 12) || self.usernameColor != null) {
            output.e(serialDesc, 12, m0.f27014a, self.usernameColor);
        }
        if (output.w(serialDesc, 13) || self.roleColor != null) {
            output.e(serialDesc, 13, m0.f27014a, self.roleColor);
        }
        if (output.w(serialDesc, 14) || self.shouldShowRoleDot) {
            output.s(serialDesc, 14, self.shouldShowRoleDot);
        }
        if (output.w(serialDesc, 15) || self.shouldShowRoleOnName) {
            output.s(serialDesc, 15, self.shouldShowRoleOnName);
        }
        if (output.w(serialDesc, 16) || self.colorString != null) {
            output.e(serialDesc, 16, m0.f27014a, self.colorString);
        }
        if (output.w(serialDesc, 17) || self.avatarURL != null) {
            output.e(serialDesc, 17, a2.f26939a, self.avatarURL);
        }
        if (output.w(serialDesc, 18) || self.avatarDecorationURL != null) {
            output.e(serialDesc, 18, a2.f26939a, self.avatarDecorationURL);
        }
        if (output.w(serialDesc, 19) || self.embeds != null) {
            output.e(serialDesc, 19, new ti.f(Embed$$serializer.INSTANCE), self.embeds);
        }
        if (output.w(serialDesc, 20) || self.attachments != null) {
            output.e(serialDesc, 20, new ti.f(Attachment$$serializer.INSTANCE), self.attachments);
        }
        if (output.w(serialDesc, 21) || self.attachmentsOpacity != null) {
            output.e(serialDesc, 21, e0.f26964a, self.attachmentsOpacity);
        }
        if (output.w(serialDesc, 22) || self.content != null) {
            output.e(serialDesc, 22, StructurableTextSerializer.INSTANCE, self.content);
        }
        if (output.w(serialDesc, 23) || self.progress != null) {
            output.e(serialDesc, 23, new ti.f(UploadProgress$$serializer.INSTANCE), self.progress);
        }
        if (output.w(serialDesc, 24) || self.reactions != null) {
            output.e(serialDesc, 24, new ti.f(MessageReaction$$serializer.INSTANCE), self.reactions);
        }
        if (output.w(serialDesc, 25) || !q.b(self.useSortedReactions, Boolean.TRUE)) {
            output.e(serialDesc, 25, h.f26981a, self.useSortedReactions);
        }
        if (output.w(serialDesc, 26) || !q.b(self.useAddBurstReaction, Boolean.FALSE)) {
            output.e(serialDesc, 26, h.f26981a, self.useAddBurstReaction);
        }
        if (output.w(serialDesc, 27) || self.codedLinks != null) {
            output.e(serialDesc, 27, new ti.f(a.u(CodedLinkSerializer.INSTANCE)), self.codedLinks);
        }
        if (output.w(serialDesc, 28) || self.stickers != null) {
            output.e(serialDesc, 28, new ti.f(Sticker$$serializer.INSTANCE), self.stickers);
        }
        if (output.w(serialDesc, 29) || self.roleIcon != null) {
            output.e(serialDesc, 29, RoleIcon$$serializer.INSTANCE, self.roleIcon);
        }
        if (output.w(serialDesc, 30) || self.connectionsRoleTag != null) {
            output.e(serialDesc, 30, ConnectionsRoleTag$$serializer.INSTANCE, self.connectionsRoleTag);
        }
        if (output.w(serialDesc, 31) || self.threadEmbed != null) {
            output.e(serialDesc, 31, ThreadEmbed$$serializer.INSTANCE, self.threadEmbed);
        }
        output.s(serialDesc, 32, self.mentioned);
        if (output.w(serialDesc, 33) || self.gifAutoPlay != null) {
            output.e(serialDesc, 33, h.f26981a, self.gifAutoPlay);
        }
        if (output.w(serialDesc, 34) || self.animateEmoji != null) {
            output.e(serialDesc, 34, h.f26981a, self.animateEmoji);
        }
        if (output.w(serialDesc, 35) || self.referencedMessage != null) {
            output.e(serialDesc, 35, ReferencedMessageSerializer.INSTANCE, self.referencedMessage);
        }
        if (output.w(serialDesc, 36) || self.executedCommand != null) {
            output.e(serialDesc, 36, ExecutedCommand$$serializer.INSTANCE, self.executedCommand);
        }
        if (output.w(serialDesc, 37) || self.components != null) {
            output.e(serialDesc, 37, new ti.f(ComponentSerializer.INSTANCE), self.components);
        }
        if (output.w(serialDesc, 38) || self.threadStarterMessageHeader != null) {
            output.e(serialDesc, 38, a2.f26939a, self.threadStarterMessageHeader);
        }
        if (output.w(serialDesc, 39) || self.communicationDisabled != null) {
            output.e(serialDesc, 39, h.f26981a, self.communicationDisabled);
        }
        if (output.w(serialDesc, 40) || self.tagText != null) {
            output.e(serialDesc, 40, a2.f26939a, self.tagText);
        }
        if (output.w(serialDesc, 41) || self.tagVerified != null) {
            output.e(serialDesc, 41, h.f26981a, self.tagVerified);
        }
        if (output.w(serialDesc, 42) || self.tagTextColor != null) {
            output.e(serialDesc, 42, m0.f27014a, self.tagTextColor);
        }
        if (output.w(serialDesc, 43) || self.tagBackgroundColor != null) {
            output.e(serialDesc, 43, m0.f27014a, self.tagBackgroundColor);
        }
        if (output.w(serialDesc, 44) || self.tagType != null) {
            output.e(serialDesc, 44, a2.f26939a, self.tagType);
        }
        if (output.w(serialDesc, 45) || self.opTagText != null) {
            output.e(serialDesc, 45, a2.f26939a, self.opTagText);
        }
        if (output.w(serialDesc, 46) || self.ephemeralIndication != null) {
            output.e(serialDesc, 46, EphemeralIndication$$serializer.INSTANCE, self.ephemeralIndication);
        }
        if (output.w(serialDesc, 47) || self.surveyIndication != null) {
            output.e(serialDesc, 47, SurveyIndication$$serializer.INSTANCE, self.surveyIndication);
        }
        if (output.w(serialDesc, 48) || self.interactionStatus != null) {
            output.e(serialDesc, 48, InteractionStatus$$serializer.INSTANCE, self.interactionStatus);
        }
        if (output.w(serialDesc, 49) || !q.b(self.useAttachmentGridLayout, Boolean.FALSE)) {
            output.e(serialDesc, 49, h.f26981a, self.useAttachmentGridLayout);
        }
        if (output.w(serialDesc, 50) || !q.b(self.useAttachmentUploadPreview, Boolean.FALSE)) {
            output.e(serialDesc, 50, h.f26981a, self.useAttachmentUploadPreview);
        }
        if (output.w(serialDesc, 51) || !q.b(self.isCurrentUserMessageAuthor, Boolean.FALSE)) {
            output.e(serialDesc, 51, h.f26981a, self.isCurrentUserMessageAuthor);
        }
        if (output.w(serialDesc, 52) || self.title != null) {
            output.e(serialDesc, 52, a2.f26939a, self.title);
        }
        if (output.w(serialDesc, 53) || self.description != null) {
            output.e(serialDesc, 53, a2.f26939a, self.description);
        }
        if (output.w(serialDesc, 54) || self.avatarURLs != null) {
            output.e(serialDesc, 54, new ti.f(a2.f26939a), self.avatarURLs);
        }
        if (output.w(serialDesc, 55) || self.isCallActive != null) {
            output.e(serialDesc, 55, h.f26981a, self.isCallActive);
        }
        if (output.w(serialDesc, 56) || self.missed != null) {
            output.e(serialDesc, 56, h.f26981a, self.missed);
        }
        if (output.w(serialDesc, 57) || self.rawMilliseconds != null) {
            output.e(serialDesc, 57, w0.f27055a, self.rawMilliseconds);
        }
        if (output.w(serialDesc, 58) || self.sticker != null) {
            output.e(serialDesc, 58, Sticker$$serializer.INSTANCE, self.sticker);
        }
        if (output.w(serialDesc, 59) || self.stickerLabel != null) {
            output.e(serialDesc, 59, a2.f26939a, self.stickerLabel);
        }
        if (output.w(serialDesc, 60) || self.buttonLabel != null) {
            output.e(serialDesc, 60, a2.f26939a, self.buttonLabel);
        }
        if (output.w(serialDesc, 61) || self.showInviteToSpeakButton != null) {
            output.e(serialDesc, 61, h.f26981a, self.showInviteToSpeakButton);
        }
        if (output.w(serialDesc, 62) || self.activityInviteEmbed != null) {
            output.e(serialDesc, 62, ActivityInviteEmbed$$serializer.INSTANCE, self.activityInviteEmbed);
        }
        if (output.w(serialDesc, 63) || self.isFirstForumPostMessage) {
            output.s(serialDesc, 63, self.isFirstForumPostMessage);
        }
        if (output.w(serialDesc, 64) || self.postActions != null) {
            output.e(serialDesc, 64, ForumPostActions$$serializer.INSTANCE, self.postActions);
        }
        if (output.w(serialDesc, 65) || self.autoModerationContext != null) {
            output.e(serialDesc, 65, AutoModerationContext$$serializer.INSTANCE, self.autoModerationContext);
        }
        if (output.w(serialDesc, 66) || self.giftCodes != null) {
            output.e(serialDesc, 66, new ti.f(GiftEmbedSerializer.INSTANCE), self.giftCodes);
        }
        if (output.w(serialDesc, 67) || self.referralTrialOffer != null) {
            output.e(serialDesc, 67, GiftEmbedSerializer.INSTANCE, self.referralTrialOffer);
        }
        if (output.w(serialDesc, 68) || self.totalMonthsSubscribed != null) {
            output.e(serialDesc, 68, m0.f27014a, self.totalMonthsSubscribed);
        }
        if (output.w(serialDesc, 69) || self.swipeToReplyIconUrl != null) {
            output.e(serialDesc, 69, a2.f26939a, self.swipeToReplyIconUrl);
        }
        if (output.w(serialDesc, 70) || self.postPreviewEmbeds != null) {
            z10 = true;
        }
        if (z10) {
            output.e(serialDesc, 70, new ti.f(PostPreviewEmbed$$serializer.INSTANCE), self.postPreviewEmbeds);
        }
    }

    public final MessageType component1() {
        return this.type;
    }

    public final Float component10() {
        return this._constrainedWidth;
    }

    public final String component11() {
        return this.timestamp;
    }

    public final String component12() {
        return this.username;
    }

    public final Integer component13() {
        return this.usernameColor;
    }

    public final Integer component14() {
        return this.roleColor;
    }

    public final boolean component15() {
        return this.shouldShowRoleDot;
    }

    public final boolean component16() {
        return this.shouldShowRoleOnName;
    }

    public final Integer component17() {
        return this.colorString;
    }

    public final String component18$chat_release() {
        return this.avatarURL;
    }

    public final String component19() {
        return this.avatarDecorationURL;
    }

    /* renamed from: component2-3Eiw7ao  reason: not valid java name */
    public final String m7component23Eiw7ao() {
        return this.f7286id;
    }

    public final List<Embed> component20() {
        return this.embeds;
    }

    public final List<Attachment> component21() {
        return this.attachments;
    }

    public final Float component22() {
        return this.attachmentsOpacity;
    }

    public final StructurableText component23() {
        return this.content;
    }

    public final List<UploadProgress> component24() {
        return this.progress;
    }

    public final List<MessageReaction> component25() {
        return this.reactions;
    }

    public final Boolean component26() {
        return this.useSortedReactions;
    }

    public final Boolean component27() {
        return this.useAddBurstReaction;
    }

    public final List<CodedLinkEmbed> component28() {
        return this.codedLinks;
    }

    public final List<Sticker> component29() {
        return this.stickers;
    }

    /* renamed from: component3-N_6c4I0  reason: not valid java name */
    public final String m8component3N_6c4I0() {
        return this.nonce;
    }

    public final RoleIcon component30() {
        return this.roleIcon;
    }

    public final ConnectionsRoleTag component31() {
        return this.connectionsRoleTag;
    }

    public final ThreadEmbed component32() {
        return this.threadEmbed;
    }

    public final boolean component33() {
        return this.mentioned;
    }

    public final Boolean component34() {
        return this.gifAutoPlay;
    }

    public final Boolean component35() {
        return this.animateEmoji;
    }

    public final ReferencedMessage component36() {
        return this.referencedMessage;
    }

    public final ExecutedCommand component37() {
        return this.executedCommand;
    }

    public final List<Component> component38() {
        return this.components;
    }

    public final String component39() {
        return this.threadStarterMessageHeader;
    }

    /* renamed from: component4-o4g7jtM  reason: not valid java name */
    public final long m9component4o4g7jtM() {
        return this.channelId;
    }

    public final Boolean component40() {
        return this.communicationDisabled;
    }

    public final String component41() {
        return this.tagText;
    }

    public final Boolean component42() {
        return this.tagVerified;
    }

    public final Integer component43() {
        return this.tagTextColor;
    }

    public final Integer component44() {
        return this.tagBackgroundColor;
    }

    public final String component45() {
        return this.tagType;
    }

    public final String component46() {
        return this.opTagText;
    }

    public final EphemeralIndication component47() {
        return this.ephemeralIndication;
    }

    public final SurveyIndication component48() {
        return this.surveyIndication;
    }

    public final InteractionStatus component49() {
        return this.interactionStatus;
    }

    /* renamed from: component5-qOKuAAo  reason: not valid java name */
    public final GuildId m10component5qOKuAAo() {
        return this.guildId;
    }

    public final Boolean component50() {
        return this.useAttachmentGridLayout;
    }

    public final Boolean component51() {
        return this.useAttachmentUploadPreview;
    }

    public final Boolean component52() {
        return this.isCurrentUserMessageAuthor;
    }

    public final String component53() {
        return this.title;
    }

    public final String component54() {
        return this.description;
    }

    public final List<String> component55() {
        return this.avatarURLs;
    }

    public final Boolean component56() {
        return this.isCallActive;
    }

    public final Boolean component57() {
        return this.missed;
    }

    public final Long component58() {
        return this.rawMilliseconds;
    }

    public final Sticker component59() {
        return this.sticker;
    }

    public final MessageState component6() {
        return this.state;
    }

    public final String component60() {
        return this.stickerLabel;
    }

    public final String component61() {
        return this.buttonLabel;
    }

    public final Boolean component62() {
        return this.showInviteToSpeakButton;
    }

    public final ActivityInviteEmbed component63() {
        return this.activityInviteEmbed;
    }

    public final boolean component64() {
        return this.isFirstForumPostMessage;
    }

    public final ForumPostActions component65() {
        return this.postActions;
    }

    public final AutoModerationContext component66() {
        return this.autoModerationContext;
    }

    public final List<GiftEmbed> component67() {
        return this.giftCodes;
    }

    public final GiftEmbed component68() {
        return this.referralTrialOffer;
    }

    public final Integer component69() {
        return this.totalMonthsSubscribed;
    }

    /* renamed from: component7-wUX8bhU  reason: not valid java name */
    public final UserId m11component7wUX8bhU() {
        return this.authorId;
    }

    public final String component70() {
        return this.swipeToReplyIconUrl;
    }

    public final List<PostPreviewEmbed> component71() {
        return this.postPreviewEmbeds;
    }

    public final long component8() {
        return this.flags;
    }

    public final String component9() {
        return this.edited;
    }

    /* renamed from: copy-e0j9O-s  reason: not valid java name */
    public final Message m12copye0j9Os(MessageType type, String id2, String str, long j10, GuildId guildId, MessageState messageState, UserId userId, long j11, String str2, Float f10, String str3, String str4, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str5, String str6, List<Embed> list, List<Attachment> list2, Float f11, StructurableText structurableText, List<UploadProgress> list3, List<MessageReaction> list4, Boolean bool, Boolean bool2, List<? extends CodedLinkEmbed> list5, List<Sticker> list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List<? extends Component> list7, String str7, Boolean bool5, String str8, Boolean bool6, Integer num4, Integer num5, String str9, String str10, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str11, String str12, List<String> list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str13, String str14, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List<? extends GiftEmbed> list9, GiftEmbed giftEmbed, Integer num6, String str15, List<PostPreviewEmbed> list10) {
        q.g(type, "type");
        q.g(id2, "id");
        return new Message(type, id2, str, j10, guildId, messageState, userId, j11, str2, f10, str3, str4, num, num2, z10, z11, num3, str5, str6, list, list2, f11, structurableText, list3, list4, bool, bool2, list5, list6, roleIcon, connectionsRoleTag, threadEmbed, z12, bool3, bool4, referencedMessage, executedCommand, list7, str7, bool5, str8, bool6, num4, num5, str9, str10, ephemeralIndication, surveyIndication, interactionStatus, bool7, bool8, bool9, str11, str12, list8, bool10, bool11, l10, sticker, str13, str14, bool12, activityInviteEmbed, z13, forumPostActions, autoModerationContext, list9, giftEmbed, num6, str15, list10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.Message.equals(java.lang.Object):boolean");
    }

    public final ActivityInviteEmbed getActivityInviteEmbed() {
        return this.activityInviteEmbed;
    }

    public final Boolean getAnimateEmoji() {
        return this.animateEmoji;
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final Float getAttachmentsOpacity() {
        return this.attachmentsOpacity;
    }

    /* renamed from: getAuthorId-wUX8bhU  reason: not valid java name */
    public final UserId m13getAuthorIdwUX8bhU() {
        return this.authorId;
    }

    public final AutoModerationContext getAutoModerationContext() {
        return this.autoModerationContext;
    }

    public final String getAvatarDecorationURL() {
        return this.avatarDecorationURL;
    }

    public final String getAvatarURL$chat_release() {
        return this.avatarURL;
    }

    public final List<String> getAvatarURLs() {
        return this.avatarURLs;
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m14getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final List<CodedLinkEmbed> getCodedLinks() {
        return this.codedLinks;
    }

    public final Integer getColorString() {
        return this.colorString;
    }

    public final Boolean getCommunicationDisabled() {
        return this.communicationDisabled;
    }

    public final List<Component> getComponents() {
        return this.components;
    }

    public final ConnectionsRoleTag getConnectionsRoleTag() {
        return this.connectionsRoleTag;
    }

    public final Integer getConstrainedWidth() {
        return (Integer) this.constrainedWidth$delegate.getValue();
    }

    public final StructurableText getContent() {
        return this.content;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEdited() {
        return this.edited;
    }

    public final List<Embed> getEmbeds() {
        return this.embeds;
    }

    public final EphemeralIndication getEphemeralIndication() {
        return this.ephemeralIndication;
    }

    public final ExecutedCommand getExecutedCommand() {
        return this.executedCommand;
    }

    public final long getFlags() {
        return this.flags;
    }

    public final Boolean getGifAutoPlay() {
        return this.gifAutoPlay;
    }

    public final List<GiftEmbed> getGiftCodes() {
        return this.giftCodes;
    }

    /* renamed from: getGuildId-qOKuAAo  reason: not valid java name */
    public final GuildId m15getGuildIdqOKuAAo() {
        return this.guildId;
    }

    /* renamed from: getId-3Eiw7ao  reason: not valid java name */
    public final String m16getId3Eiw7ao() {
        return this.f7286id;
    }

    public final InteractionStatus getInteractionStatus() {
        return this.interactionStatus;
    }

    public final boolean getMentioned() {
        return this.mentioned;
    }

    public final Boolean getMissed() {
        return this.missed;
    }

    /* renamed from: getNonce-N_6c4I0  reason: not valid java name */
    public final String m17getNonceN_6c4I0() {
        return this.nonce;
    }

    public final String getOpTagText() {
        return this.opTagText;
    }

    public final ForumPostActions getPostActions() {
        return this.postActions;
    }

    public final List<PostPreviewEmbed> getPostPreviewEmbeds() {
        return this.postPreviewEmbeds;
    }

    public final List<UploadProgress> getProgress() {
        return this.progress;
    }

    public final Long getRawMilliseconds() {
        return this.rawMilliseconds;
    }

    public final List<MessageReaction> getReactions() {
        return this.reactions;
    }

    public final ReferencedMessage getReferencedMessage() {
        return this.referencedMessage;
    }

    public final GiftEmbed getReferralTrialOffer() {
        return this.referralTrialOffer;
    }

    public final Integer getRoleColor() {
        return this.roleColor;
    }

    public final RoleIcon getRoleIcon() {
        return this.roleIcon;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    public final Boolean getShowInviteToSpeakButton() {
        return this.showInviteToSpeakButton;
    }

    public final MessageState getState() {
        return this.state;
    }

    public final Sticker getSticker() {
        return this.sticker;
    }

    public final String getStickerLabel() {
        return this.stickerLabel;
    }

    public final List<Sticker> getStickers() {
        return this.stickers;
    }

    public final SurveyIndication getSurveyIndication() {
        return this.surveyIndication;
    }

    public final String getSwipeToReplyIconUrl() {
        return this.swipeToReplyIconUrl;
    }

    public final Integer getTagBackgroundColor() {
        return this.tagBackgroundColor;
    }

    public final String getTagText() {
        return this.tagText;
    }

    public final Integer getTagTextColor() {
        return this.tagTextColor;
    }

    public final String getTagType() {
        return this.tagType;
    }

    public final Boolean getTagVerified() {
        return this.tagVerified;
    }

    public final ThreadEmbed getThreadEmbed() {
        return this.threadEmbed;
    }

    public final String getThreadStarterMessageHeader() {
        return this.threadStarterMessageHeader;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTotalMonthsSubscribed() {
        return this.totalMonthsSubscribed;
    }

    public final MessageType getType() {
        return this.type;
    }

    public final Boolean getUseAddBurstReaction() {
        return this.useAddBurstReaction;
    }

    public final Boolean getUseAttachmentGridLayout() {
        return this.useAttachmentGridLayout;
    }

    public final Boolean getUseAttachmentUploadPreview() {
        return this.useAttachmentUploadPreview;
    }

    public final Boolean getUseSortedReactions() {
        return this.useSortedReactions;
    }

    public final String getUsername() {
        return this.username;
    }

    public final Integer getUsernameColor() {
        return this.usernameColor;
    }

    public final Float get_constrainedWidth() {
        return this._constrainedWidth;
    }

    public int hashCode() {
        int hashCode = ((this.type.hashCode() * 31) + MessageId.m593hashCodeimpl(this.f7286id)) * 31;
        String str = this.nonce;
        int i10 = 0;
        int i11 = (((hashCode + (str == null ? 0 : MessageId.m593hashCodeimpl(str))) * 31) + ChannelId.m567hashCodeimpl(this.channelId)) * 31;
        GuildId guildId = this.guildId;
        int i12 = (i11 + (guildId == null ? 0 : GuildId.m580hashCodeimpl(guildId.m584unboximpl()))) * 31;
        MessageState messageState = this.state;
        int hashCode2 = (i12 + (messageState == null ? 0 : messageState.hashCode())) * 31;
        UserId userId = this.authorId;
        int i13 = (((hashCode2 + (userId == null ? 0 : UserId.m631hashCodeimpl(userId.m635unboximpl()))) * 31) + b.a(this.flags)) * 31;
        String str2 = this.edited;
        int hashCode3 = (i13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f10 = this._constrainedWidth;
        int hashCode4 = (hashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str3 = this.timestamp;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.username;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.usernameColor;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.roleColor;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z10 = this.shouldShowRoleDot;
        int i14 = 1;
        if (z10) {
            z10 = true;
        }
        int i15 = z10 ? 1 : 0;
        int i16 = z10 ? 1 : 0;
        int i17 = z10 ? 1 : 0;
        int i18 = (hashCode8 + i15) * 31;
        boolean z11 = this.shouldShowRoleOnName;
        if (z11) {
            z11 = true;
        }
        int i19 = z11 ? 1 : 0;
        int i20 = z11 ? 1 : 0;
        int i21 = z11 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        Integer num3 = this.colorString;
        int hashCode9 = (i22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.avatarURL;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.avatarDecorationURL;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<Embed> list = this.embeds;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List<Attachment> list2 = this.attachments;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Float f11 = this.attachmentsOpacity;
        int hashCode14 = (hashCode13 + (f11 == null ? 0 : f11.hashCode())) * 31;
        StructurableText structurableText = this.content;
        int hashCode15 = (hashCode14 + (structurableText == null ? 0 : structurableText.hashCode())) * 31;
        List<UploadProgress> list3 = this.progress;
        int hashCode16 = (hashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessageReaction> list4 = this.reactions;
        int hashCode17 = (hashCode16 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool = this.useSortedReactions;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.useAddBurstReaction;
        int hashCode19 = (hashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<CodedLinkEmbed> list5 = this.codedLinks;
        int hashCode20 = (hashCode19 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<Sticker> list6 = this.stickers;
        int hashCode21 = (hashCode20 + (list6 == null ? 0 : list6.hashCode())) * 31;
        RoleIcon roleIcon = this.roleIcon;
        int hashCode22 = (hashCode21 + (roleIcon == null ? 0 : roleIcon.hashCode())) * 31;
        ConnectionsRoleTag connectionsRoleTag = this.connectionsRoleTag;
        int hashCode23 = (hashCode22 + (connectionsRoleTag == null ? 0 : connectionsRoleTag.hashCode())) * 31;
        ThreadEmbed threadEmbed = this.threadEmbed;
        int hashCode24 = (hashCode23 + (threadEmbed == null ? 0 : threadEmbed.hashCode())) * 31;
        boolean z12 = this.mentioned;
        if (z12) {
            z12 = true;
        }
        int i23 = z12 ? 1 : 0;
        int i24 = z12 ? 1 : 0;
        int i25 = z12 ? 1 : 0;
        int i26 = (hashCode24 + i23) * 31;
        Boolean bool3 = this.gifAutoPlay;
        int hashCode25 = (i26 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.animateEmoji;
        int hashCode26 = (hashCode25 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        ReferencedMessage referencedMessage = this.referencedMessage;
        int hashCode27 = (hashCode26 + (referencedMessage == null ? 0 : referencedMessage.hashCode())) * 31;
        ExecutedCommand executedCommand = this.executedCommand;
        int hashCode28 = (hashCode27 + (executedCommand == null ? 0 : executedCommand.hashCode())) * 31;
        List<Component> list7 = this.components;
        int hashCode29 = (hashCode28 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str7 = this.threadStarterMessageHeader;
        int hashCode30 = (hashCode29 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool5 = this.communicationDisabled;
        int hashCode31 = (hashCode30 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str8 = this.tagText;
        int hashCode32 = (hashCode31 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool6 = this.tagVerified;
        int hashCode33 = (hashCode32 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num4 = this.tagTextColor;
        int hashCode34 = (hashCode33 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.tagBackgroundColor;
        int hashCode35 = (hashCode34 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str9 = this.tagType;
        int hashCode36 = (hashCode35 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.opTagText;
        int hashCode37 = (hashCode36 + (str10 == null ? 0 : str10.hashCode())) * 31;
        EphemeralIndication ephemeralIndication = this.ephemeralIndication;
        int hashCode38 = (hashCode37 + (ephemeralIndication == null ? 0 : ephemeralIndication.hashCode())) * 31;
        SurveyIndication surveyIndication = this.surveyIndication;
        int hashCode39 = (hashCode38 + (surveyIndication == null ? 0 : surveyIndication.hashCode())) * 31;
        InteractionStatus interactionStatus = this.interactionStatus;
        int hashCode40 = (hashCode39 + (interactionStatus == null ? 0 : interactionStatus.hashCode())) * 31;
        Boolean bool7 = this.useAttachmentGridLayout;
        int hashCode41 = (hashCode40 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.useAttachmentUploadPreview;
        int hashCode42 = (hashCode41 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isCurrentUserMessageAuthor;
        int hashCode43 = (hashCode42 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str11 = this.title;
        int hashCode44 = (hashCode43 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.description;
        int hashCode45 = (hashCode44 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<String> list8 = this.avatarURLs;
        int hashCode46 = (hashCode45 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Boolean bool10 = this.isCallActive;
        int hashCode47 = (hashCode46 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.missed;
        int hashCode48 = (hashCode47 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Long l10 = this.rawMilliseconds;
        int hashCode49 = (hashCode48 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Sticker sticker = this.sticker;
        int hashCode50 = (hashCode49 + (sticker == null ? 0 : sticker.hashCode())) * 31;
        String str13 = this.stickerLabel;
        int hashCode51 = (hashCode50 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.buttonLabel;
        int hashCode52 = (hashCode51 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool12 = this.showInviteToSpeakButton;
        int hashCode53 = (hashCode52 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        ActivityInviteEmbed activityInviteEmbed = this.activityInviteEmbed;
        int hashCode54 = (hashCode53 + (activityInviteEmbed == null ? 0 : activityInviteEmbed.hashCode())) * 31;
        boolean z13 = this.isFirstForumPostMessage;
        if (!z13) {
            i14 = z13 ? 1 : 0;
        }
        int i27 = (hashCode54 + i14) * 31;
        ForumPostActions forumPostActions = this.postActions;
        int hashCode55 = (i27 + (forumPostActions == null ? 0 : forumPostActions.hashCode())) * 31;
        AutoModerationContext autoModerationContext = this.autoModerationContext;
        int hashCode56 = (hashCode55 + (autoModerationContext == null ? 0 : autoModerationContext.hashCode())) * 31;
        List<GiftEmbed> list9 = this.giftCodes;
        int hashCode57 = (hashCode56 + (list9 == null ? 0 : list9.hashCode())) * 31;
        GiftEmbed giftEmbed = this.referralTrialOffer;
        int hashCode58 = (hashCode57 + (giftEmbed == null ? 0 : giftEmbed.hashCode())) * 31;
        Integer num6 = this.totalMonthsSubscribed;
        int hashCode59 = (hashCode58 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str15 = this.swipeToReplyIconUrl;
        int hashCode60 = (hashCode59 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<PostPreviewEmbed> list10 = this.postPreviewEmbeds;
        if (list10 != null) {
            i10 = list10.hashCode();
        }
        return hashCode60 + i10;
    }

    public final Boolean isCallActive() {
        return this.isCallActive;
    }

    public final Boolean isCurrentUserMessageAuthor() {
        return this.isCurrentUserMessageAuthor;
    }

    public final boolean isFirstForumPostMessage() {
        return this.isFirstForumPostMessage;
    }

    public String toString() {
        MessageType messageType = this.type;
        String str = MessageId.m594toStringimpl(this.f7286id);
        String str2 = this.nonce;
        String str3 = str2 == null ? "null" : MessageId.m594toStringimpl(str2);
        String str4 = ChannelId.m569toStringimpl(this.channelId);
        GuildId guildId = this.guildId;
        MessageState messageState = this.state;
        UserId userId = this.authorId;
        long j10 = this.flags;
        String str5 = this.edited;
        Float f10 = this._constrainedWidth;
        String str6 = this.timestamp;
        String str7 = this.username;
        Integer num = this.usernameColor;
        Integer num2 = this.roleColor;
        boolean z10 = this.shouldShowRoleDot;
        boolean z11 = this.shouldShowRoleOnName;
        Integer num3 = this.colorString;
        String str8 = this.avatarURL;
        String str9 = this.avatarDecorationURL;
        List<Embed> list = this.embeds;
        List<Attachment> list2 = this.attachments;
        Float f11 = this.attachmentsOpacity;
        StructurableText structurableText = this.content;
        List<UploadProgress> list3 = this.progress;
        List<MessageReaction> list4 = this.reactions;
        Boolean bool = this.useSortedReactions;
        Boolean bool2 = this.useAddBurstReaction;
        List<CodedLinkEmbed> list5 = this.codedLinks;
        List<Sticker> list6 = this.stickers;
        RoleIcon roleIcon = this.roleIcon;
        ConnectionsRoleTag connectionsRoleTag = this.connectionsRoleTag;
        ThreadEmbed threadEmbed = this.threadEmbed;
        boolean z12 = this.mentioned;
        Boolean bool3 = this.gifAutoPlay;
        Boolean bool4 = this.animateEmoji;
        ReferencedMessage referencedMessage = this.referencedMessage;
        ExecutedCommand executedCommand = this.executedCommand;
        List<Component> list7 = this.components;
        String str10 = this.threadStarterMessageHeader;
        Boolean bool5 = this.communicationDisabled;
        String str11 = this.tagText;
        Boolean bool6 = this.tagVerified;
        Integer num4 = this.tagTextColor;
        Integer num5 = this.tagBackgroundColor;
        String str12 = this.tagType;
        String str13 = this.opTagText;
        EphemeralIndication ephemeralIndication = this.ephemeralIndication;
        SurveyIndication surveyIndication = this.surveyIndication;
        InteractionStatus interactionStatus = this.interactionStatus;
        Boolean bool7 = this.useAttachmentGridLayout;
        Boolean bool8 = this.useAttachmentUploadPreview;
        Boolean bool9 = this.isCurrentUserMessageAuthor;
        String str14 = this.title;
        String str15 = this.description;
        List<String> list8 = this.avatarURLs;
        Boolean bool10 = this.isCallActive;
        Boolean bool11 = this.missed;
        Long l10 = this.rawMilliseconds;
        Sticker sticker = this.sticker;
        String str16 = this.stickerLabel;
        String str17 = this.buttonLabel;
        Boolean bool12 = this.showInviteToSpeakButton;
        ActivityInviteEmbed activityInviteEmbed = this.activityInviteEmbed;
        boolean z13 = this.isFirstForumPostMessage;
        ForumPostActions forumPostActions = this.postActions;
        AutoModerationContext autoModerationContext = this.autoModerationContext;
        List<GiftEmbed> list9 = this.giftCodes;
        GiftEmbed giftEmbed = this.referralTrialOffer;
        Integer num6 = this.totalMonthsSubscribed;
        String str18 = this.swipeToReplyIconUrl;
        List<PostPreviewEmbed> list10 = this.postPreviewEmbeds;
        return "Message(type=" + messageType + ", id=" + str + ", nonce=" + str3 + ", channelId=" + str4 + ", guildId=" + guildId + ", state=" + messageState + ", authorId=" + userId + ", flags=" + j10 + ", edited=" + str5 + ", _constrainedWidth=" + f10 + ", timestamp=" + str6 + ", username=" + str7 + ", usernameColor=" + num + ", roleColor=" + num2 + ", shouldShowRoleDot=" + z10 + ", shouldShowRoleOnName=" + z11 + ", colorString=" + num3 + ", avatarURL=" + str8 + ", avatarDecorationURL=" + str9 + ", embeds=" + list + ", attachments=" + list2 + ", attachmentsOpacity=" + f11 + ", content=" + structurableText + ", progress=" + list3 + ", reactions=" + list4 + ", useSortedReactions=" + bool + ", useAddBurstReaction=" + bool2 + ", codedLinks=" + list5 + ", stickers=" + list6 + ", roleIcon=" + roleIcon + ", connectionsRoleTag=" + connectionsRoleTag + ", threadEmbed=" + threadEmbed + ", mentioned=" + z12 + ", gifAutoPlay=" + bool3 + ", animateEmoji=" + bool4 + ", referencedMessage=" + referencedMessage + ", executedCommand=" + executedCommand + ", components=" + list7 + ", threadStarterMessageHeader=" + str10 + ", communicationDisabled=" + bool5 + ", tagText=" + str11 + ", tagVerified=" + bool6 + ", tagTextColor=" + num4 + ", tagBackgroundColor=" + num5 + ", tagType=" + str12 + ", opTagText=" + str13 + ", ephemeralIndication=" + ephemeralIndication + ", surveyIndication=" + surveyIndication + ", interactionStatus=" + interactionStatus + ", useAttachmentGridLayout=" + bool7 + ", useAttachmentUploadPreview=" + bool8 + ", isCurrentUserMessageAuthor=" + bool9 + ", title=" + str14 + ", description=" + str15 + ", avatarURLs=" + list8 + ", isCallActive=" + bool10 + ", missed=" + bool11 + ", rawMilliseconds=" + l10 + ", sticker=" + sticker + ", stickerLabel=" + str16 + ", buttonLabel=" + str17 + ", showInviteToSpeakButton=" + bool12 + ", activityInviteEmbed=" + activityInviteEmbed + ", isFirstForumPostMessage=" + z13 + ", postActions=" + forumPostActions + ", autoModerationContext=" + autoModerationContext + ", giftCodes=" + list9 + ", referralTrialOffer=" + giftEmbed + ", totalMonthsSubscribed=" + num6 + ", swipeToReplyIconUrl=" + str18 + ", postPreviewEmbeds=" + list10 + ")";
    }

    public /* synthetic */ Message(MessageType messageType, String str, String str2, long j10, GuildId guildId, MessageState messageState, UserId userId, long j11, String str3, Float f10, String str4, String str5, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str6, String str7, List list, List list2, Float f11, StructurableText structurableText, List list3, List list4, Boolean bool, Boolean bool2, List list5, List list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List list7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num4, Integer num5, String str10, String str11, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str12, String str13, List list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str14, String str15, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List list9, GiftEmbed giftEmbed, Integer num6, String str16, List list10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageType, str, (i10 & 4) != 0 ? null : str2, j10, (i10 & 16) != 0 ? null : guildId, (i10 & 32) != 0 ? null : messageState, (i10 & 64) != 0 ? null : userId, (i10 & 128) != 0 ? 0L : j11, (i10 & 256) != 0 ? null : str3, (i10 & 512) != 0 ? null : f10, (i10 & 1024) != 0 ? null : str4, (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str5, (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num, (i10 & 8192) != 0 ? null : num2, (i10 & 16384) != 0 ? false : z10, (i10 & 32768) != 0 ? false : z11, (i10 & 65536) != 0 ? null : num3, (i10 & 131072) != 0 ? null : str6, (i10 & 262144) != 0 ? null : str7, (i10 & 524288) != 0 ? null : list, (i10 & 1048576) != 0 ? null : list2, (i10 & 2097152) != 0 ? null : f11, (i10 & 4194304) != 0 ? null : structurableText, (i10 & 8388608) != 0 ? null : list3, (i10 & 16777216) != 0 ? null : list4, (i10 & 33554432) != 0 ? Boolean.TRUE : bool, (i10 & 67108864) != 0 ? Boolean.FALSE : bool2, (i10 & 134217728) != 0 ? null : list5, (i10 & 268435456) != 0 ? null : list6, (i10 & 536870912) != 0 ? null : roleIcon, (i10 & 1073741824) != 0 ? null : connectionsRoleTag, (i10 & Integer.MIN_VALUE) != 0 ? null : threadEmbed, z12, (i11 & 2) != 0 ? null : bool3, (i11 & 4) != 0 ? null : bool4, (i11 & 8) != 0 ? null : referencedMessage, (i11 & 16) != 0 ? null : executedCommand, (i11 & 32) != 0 ? null : list7, (i11 & 64) != 0 ? null : str8, (i11 & 128) != 0 ? null : bool5, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : bool6, (i11 & 1024) != 0 ? null : num4, (i11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : num5, (i11 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str10, (i11 & 8192) != 0 ? null : str11, (i11 & 16384) != 0 ? null : ephemeralIndication, (32768 & i11) != 0 ? null : surveyIndication, (i11 & 65536) != 0 ? null : interactionStatus, (i11 & 131072) != 0 ? Boolean.FALSE : bool7, (i11 & 262144) != 0 ? Boolean.FALSE : bool8, (i11 & 524288) != 0 ? Boolean.FALSE : bool9, (i11 & 1048576) != 0 ? null : str12, (i11 & 2097152) != 0 ? null : str13, (i11 & 4194304) != 0 ? null : list8, (8388608 & i11) != 0 ? null : bool10, (16777216 & i11) != 0 ? null : bool11, (33554432 & i11) != 0 ? null : l10, (67108864 & i11) != 0 ? null : sticker, (134217728 & i11) != 0 ? null : str14, (268435456 & i11) != 0 ? null : str15, (536870912 & i11) != 0 ? null : bool12, (1073741824 & i11) != 0 ? null : activityInviteEmbed, (i11 & Integer.MIN_VALUE) != 0 ? false : z13, (i12 & 1) != 0 ? null : forumPostActions, (i12 & 2) != 0 ? null : autoModerationContext, (i12 & 4) != 0 ? null : list9, (i12 & 8) != 0 ? null : giftEmbed, (i12 & 16) != 0 ? null : num6, (i12 & 32) != 0 ? null : str16, (i12 & 64) != 0 ? null : list10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Message(MessageType messageType, String str, String str2, long j10, GuildId guildId, MessageState messageState, UserId userId, long j11, String str3, Float f10, String str4, String str5, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str6, String str7, List<Embed> list, List<Attachment> list2, Float f11, StructurableText structurableText, List<UploadProgress> list3, List<MessageReaction> list4, Boolean bool, Boolean bool2, List<? extends CodedLinkEmbed> list5, List<Sticker> list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List<? extends Component> list7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num4, Integer num5, String str10, String str11, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str12, String str13, List<String> list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str14, String str15, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List<? extends GiftEmbed> list9, GiftEmbed giftEmbed, Integer num6, String str16, List<PostPreviewEmbed> list10) {
        super(null);
        Lazy b10;
        this.type = messageType;
        this.f7286id = str;
        this.nonce = str2;
        this.channelId = j10;
        this.guildId = guildId;
        this.state = messageState;
        this.authorId = userId;
        this.flags = j11;
        this.edited = str3;
        this._constrainedWidth = f10;
        this.timestamp = str4;
        this.username = str5;
        this.usernameColor = num;
        this.roleColor = num2;
        this.shouldShowRoleDot = z10;
        this.shouldShowRoleOnName = z11;
        this.colorString = num3;
        this.avatarURL = str6;
        this.avatarDecorationURL = str7;
        this.embeds = list;
        this.attachments = list2;
        this.attachmentsOpacity = f11;
        this.content = structurableText;
        this.progress = list3;
        this.reactions = list4;
        this.useSortedReactions = bool;
        this.useAddBurstReaction = bool2;
        this.codedLinks = list5;
        this.stickers = list6;
        this.roleIcon = roleIcon;
        this.connectionsRoleTag = connectionsRoleTag;
        this.threadEmbed = threadEmbed;
        this.mentioned = z12;
        this.gifAutoPlay = bool3;
        this.animateEmoji = bool4;
        this.referencedMessage = referencedMessage;
        this.executedCommand = executedCommand;
        this.components = list7;
        this.threadStarterMessageHeader = str8;
        this.communicationDisabled = bool5;
        this.tagText = str9;
        this.tagVerified = bool6;
        this.tagTextColor = num4;
        this.tagBackgroundColor = num5;
        this.tagType = str10;
        this.opTagText = str11;
        this.ephemeralIndication = ephemeralIndication;
        this.surveyIndication = surveyIndication;
        this.interactionStatus = interactionStatus;
        this.useAttachmentGridLayout = bool7;
        this.useAttachmentUploadPreview = bool8;
        this.isCurrentUserMessageAuthor = bool9;
        this.title = str12;
        this.description = str13;
        this.avatarURLs = list8;
        this.isCallActive = bool10;
        this.missed = bool11;
        this.rawMilliseconds = l10;
        this.sticker = sticker;
        this.stickerLabel = str14;
        this.buttonLabel = str15;
        this.showInviteToSpeakButton = bool12;
        this.activityInviteEmbed = activityInviteEmbed;
        this.isFirstForumPostMessage = z13;
        this.postActions = forumPostActions;
        this.autoModerationContext = autoModerationContext;
        this.giftCodes = list9;
        this.referralTrialOffer = giftEmbed;
        this.totalMonthsSubscribed = num6;
        this.swipeToReplyIconUrl = str16;
        this.postPreviewEmbeds = list10;
        b10 = n.b(new Message$constrainedWidth$2(this));
        this.constrainedWidth$delegate = b10;
    }
}
