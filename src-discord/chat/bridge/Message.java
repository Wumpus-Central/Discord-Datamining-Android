package com.discord.chat.bridge;

import androidx.recyclerview.widget.RecyclerView;
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
import j$.util.Spliterator;
import java.util.List;
import jg.n;
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
import uj.f;
import vj.a;
import xj.a2;
import xj.e0;
import xj.h;
import xj.m0;
import xj.n1;
import xj.w0;

@Metadata(d1 = {"\u0000\u008b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b»\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ³\u00022\u00020\u0001:\u0004²\u0002³\u0002B\u0096\u0006\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$\u0012\b\u0010/\u001a\u0004\u0018\u00010\u001e\u0012\b\u00100\u001a\u0004\u0018\u00010\u001e\u0012\u0010\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$\u0012\u000e\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$\u0012\b\u00105\u001a\u0004\u0018\u000106\u0012\b\u00107\u001a\u0004\u0018\u000108\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\u0006\u0010;\u001a\u00020\u001e\u0012\b\u0010<\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010=\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010>\u001a\u0004\u0018\u00010?\u0012\b\u0010@\u001a\u0004\u0018\u00010A\u0012\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010E\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010G\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010J\u001a\u0004\u0018\u00010K\u0012\b\u0010L\u001a\u0004\u0018\u00010M\u0012\b\u0010N\u001a\u0004\u0018\u00010O\u0012\b\u0010P\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010R\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$\u0012\b\u0010V\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010W\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010X\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010Y\u001a\u0004\u0018\u000104\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010]\u001a\u0004\u0018\u00010^\u0012\u0006\u0010_\u001a\u00020\u001e\u0012\b\u0010`\u001a\u0004\u0018\u00010a\u0012\b\u0010b\u001a\u0004\u0018\u00010c\u0012\u000e\u0010d\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010$\u0012\b\u0010f\u001a\u0004\u0018\u00010e\u0012\b\u0010g\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010h\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$\u0012\b\u0010k\u001a\u0004\u0018\u00010lø\u0001\u0000¢\u0006\u0002\u0010mBê\u0006\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001e\u0012\u0012\b\u0002\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$\u0012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\u0006\u0010;\u001a\u00020\u001e\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A\u0012\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010^\u0012\b\b\u0002\u0010_\u001a\u00020\u001e\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010a\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010c\u0012\u0010\b\u0002\u0010d\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010$\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010e\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$ø\u0001\u0000¢\u0006\u0002\u0010nJ\n\u0010Ø\u0001\u001a\u00020\u0007HÆ\u0003J\u0011\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u008b\u0001J\u0012\u0010Ý\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u008b\u0001J\n\u0010Þ\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u001eHÆ\u0003J\u0012\u0010à\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u008b\u0001J\u0012\u0010á\u0001\u001a\u0004\u0018\u00010\u0016HÀ\u0003¢\u0006\u0003\bâ\u0001J\f\u0010ã\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u001c\u0010ä\u0001\u001a\u00020\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bå\u0001\u0010\u0081\u0001J\u0012\u0010æ\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$HÆ\u0003J\u0012\u0010ç\u0001\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$HÆ\u0003J\u0011\u0010è\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010rJ\f\u0010é\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\u0012\u0010ê\u0001\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$HÆ\u0003J\u0012\u0010ë\u0001\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$HÆ\u0003J\u0011\u0010ì\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\u0011\u0010í\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\u0014\u0010î\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$HÆ\u0003J\u0012\u0010ï\u0001\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$HÆ\u0003J\u001e\u0010ð\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bñ\u0001\u0010\u0081\u0001J\f\u0010ò\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010ó\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010ô\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u001eHÆ\u0003J\u0011\u0010ö\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\u0011\u0010÷\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\f\u0010ø\u0001\u001a\u0004\u0018\u00010?HÆ\u0003J\f\u0010ù\u0001\u001a\u0004\u0018\u00010AHÆ\u0003J\u0012\u0010ú\u0001\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$HÆ\u0003J\f\u0010û\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u001c\u0010ü\u0001\u001a\u00020\fHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bý\u0001\u0010\u0087\u0001J\u0011\u0010þ\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\u0012\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u008b\u0001J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010KHÆ\u0003J\f\u0010\u0084\u0002\u001a\u0004\u0018\u00010MHÆ\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010OHÆ\u0003J\u0011\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\u0011\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\u001b\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u000eHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b\u0089\u0002J\u0011\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u008d\u0002\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$HÆ\u0003J\u0011\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\u0011\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\u0012\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0003\u0010±\u0001J\f\u0010\u0091\u0002\u001a\u0004\u0018\u000104HÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010wJ\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010^HÆ\u0003J\n\u0010\u0097\u0002\u001a\u00020\u001eHÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010aHÆ\u0003J\f\u0010\u0099\u0002\u001a\u0004\u0018\u00010cHÆ\u0003J\u0012\u0010\u009a\u0002\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010$HÆ\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010eHÆ\u0003J\u0012\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0003\u0010\u008b\u0001J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u009e\u0002\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$HÆ\u0003J\u001b\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0003\b \u0002J\n\u0010¡\u0002\u001a\u00020\u0014HÆ\u0003J\f\u0010¢\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0083\u0007\u0010£\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001e2\u0012\b\u0002\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$2\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$2\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020\u001e2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010Y\u001a\u0004\u0018\u0001042\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010^2\b\b\u0002\u0010_\u001a\u00020\u001e2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010a2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010c2\u0010\b\u0002\u0010d\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010$2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010e2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¤\u0002\u0010¥\u0002J\u0016\u0010¦\u0002\u001a\u00020\u001e2\n\u0010§\u0002\u001a\u0005\u0018\u00010¨\u0002HÖ\u0003J\n\u0010©\u0002\u001a\u00020\u0003HÖ\u0001J\n\u0010ª\u0002\u001a\u00020\u0016HÖ\u0001J(\u0010«\u0002\u001a\u00030¬\u00022\u0007\u0010\u00ad\u0002\u001a\u00020\u00002\b\u0010®\u0002\u001a\u00030¯\u00022\b\u0010°\u0002\u001a\u00030±\u0002HÇ\u0001R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010s\u0012\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0013\u0010]\u001a\u0004\u0018\u00010^¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0015\u0010=\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010x\u001a\u0004\bv\u0010wR\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0015\u0010(\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010s\u001a\u0004\b{\u0010rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0013\u0010b\u001a\u0004\u0018\u00010c¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0015\u0010\"\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R!\u0010!\u001a\u0004\u0018\u00010\u00168\u0000X\u0081\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0082\u0001\u0010p\u001a\u0006\b\u0083\u0001\u0010\u0081\u0001R\u001a\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010zR\u0015\u0010[\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0081\u0001R\u001f\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0003\u0010\u0088\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010zR\u0018\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010E\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010x\u001a\u0005\b\u008d\u0001\u0010wR\u001a\u0010B\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010zR\u0015\u00107\u001a\u0004\u0018\u000108¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\"\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0092\u0001\u0010\u008b\u0001R\u0015\u0010)\u001a\u0004\u0018\u00010*¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0015\u0010T\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0081\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0081\u0001R\u001a\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010zR\u0015\u0010J\u001a\u0004\u0018\u00010K¢\u0006\n\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0015\u0010@\u001a\u0004\u0018\u00010A¢\u0006\n\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0013\u0010\u0013\u001a\u00020\u0014¢\u0006\n\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u0087\u0001R\u0016\u0010<\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010x\u001a\u0005\b\u009f\u0001\u0010wR\u001a\u0010d\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010zR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001f\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0003\u0010¤\u0001\u001a\u0006\b£\u0001\u0010\u0081\u0001R\u0015\u0010N\u001a\u0004\u0018\u00010O¢\u0006\n\n\u0000\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0015\u0010V\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010x\u001a\u0004\bV\u0010wR\u0015\u0010R\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010x\u001a\u0004\bR\u0010wR\u0012\u0010_\u001a\u00020\u001e¢\u0006\t\n\u0000\u001a\u0005\b_\u0010§\u0001R\u0013\u0010;\u001a\u00020\u001e¢\u0006\n\n\u0000\u001a\u0006\b¨\u0001\u0010§\u0001R\u0016\u0010W\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010x\u001a\u0005\b©\u0001\u0010wR!\u0010\n\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0003\u0010¤\u0001\u001a\u0006\bª\u0001\u0010\u0081\u0001R\u0015\u0010I\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\b«\u0001\u0010\u0081\u0001R\u0015\u0010`\u001a\u0004\u0018\u00010a¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010i\u001a\n\u0012\u0004\u0012\u00020j\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010zR\u001a\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010zR\u0018\u0010X\u001a\u0004\u0018\u00010\u0014¢\u0006\r\n\u0003\u0010²\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u001a\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\b³\u0001\u0010zR\u0015\u0010>\u001a\u0004\u0018\u00010?¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001R\u0015\u0010f\u001a\u0004\u0018\u00010e¢\u0006\n\n\u0000\u001a\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\b¸\u0001\u0010\u008b\u0001R\u0015\u00105\u001a\u0004\u0018\u000106¢\u0006\n\n\u0000\u001a\u0006\b¹\u0001\u0010º\u0001R\u0013\u0010\u001d\u001a\u00020\u001e¢\u0006\n\n\u0000\u001a\u0006\b»\u0001\u0010§\u0001R\u0013\u0010\u001f\u001a\u00020\u001e¢\u0006\n\n\u0000\u001a\u0006\b¼\u0001\u0010§\u0001R\u0016\u0010\\\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010x\u001a\u0005\b½\u0001\u0010wR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0015\u0010Y\u001a\u0004\u0018\u000104¢\u0006\n\n\u0000\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0015\u0010Z\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÂ\u0001\u0010\u0081\u0001R\u001a\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$¢\u0006\t\n\u0000\u001a\u0005\bÃ\u0001\u0010zR\u0015\u0010L\u001a\u0004\u0018\u00010M¢\u0006\n\n\u0000\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0015\u0010h\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÆ\u0001\u0010\u0081\u0001R\u0018\u0010H\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\bÇ\u0001\u0010\u008b\u0001R\u0015\u0010F\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÈ\u0001\u0010\u0081\u0001R\u0016\u0010G\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010x\u001a\u0005\bÉ\u0001\u0010wR\u0015\u00109\u001a\u0004\u0018\u00010:¢\u0006\n\n\u0000\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0015\u0010D\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÌ\u0001\u0010\u0081\u0001R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÍ\u0001\u0010\u0081\u0001R\u0015\u0010S\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÎ\u0001\u0010\u0081\u0001R\u0018\u0010g\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\bÏ\u0001\u0010\u008b\u0001R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0000\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0016\u00100\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010x\u001a\u0005\bÒ\u0001\u0010wR\u0016\u0010P\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010x\u001a\u0005\bÓ\u0001\u0010wR\u0016\u0010Q\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010x\u001a\u0005\bÔ\u0001\u0010wR\u0016\u0010/\u001a\u0004\u0018\u00010\u001e¢\u0006\u000b\n\u0002\u0010x\u001a\u0005\bÕ\u0001\u0010wR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010\u0081\u0001R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\b×\u0001\u0010\u008b\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006´\u0002"}, d2 = {"Lcom/discord/chat/bridge/Message;", "Lcom/discord/chat/bridge/MessageBase;", "seen1", "", "seen2", "seen3", "type", "Lcom/discord/chat/bridge/MessageType;", "id", "Lcom/discord/primitives/MessageId;", "nonce", "channelId", "Lcom/discord/primitives/ChannelId;", "guildId", "Lcom/discord/primitives/GuildId;", "state", "Lcom/discord/chat/bridge/MessageState;", "authorId", "Lcom/discord/primitives/UserId;", "flags", "", "edited", "", "_constrainedWidth", "", "timestamp", "username", "usernameColor", "roleColor", "shouldShowRoleDot", "", "shouldShowRoleOnName", "colorString", "avatarURL", "avatarDecorationURL", "embeds", "", "Lcom/discord/chat/bridge/embed/Embed;", "attachments", "Lcom/discord/chat/bridge/attachment/Attachment;", "attachmentsOpacity", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "progress", "Lcom/discord/chat/bridge/UploadProgress;", "reactions", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "useSortedReactions", "useAddBurstReaction", "codedLinks", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "stickers", "Lcom/discord/chat/bridge/sticker/Sticker;", "roleIcon", "Lcom/discord/chat/bridge/roleicons/RoleIcon;", "connectionsRoleTag", "Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;", "threadEmbed", "Lcom/discord/chat/bridge/threads/ThreadEmbed;", "mentioned", "gifAutoPlay", "animateEmoji", "referencedMessage", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "executedCommand", "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "components", "Lcom/discord/chat/bridge/botuikit/Component;", "threadStarterMessageHeader", "communicationDisabled", "tagText", "tagVerified", "tagBackgroundColor", "opTagText", "ephemeralIndication", "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "surveyIndication", "Lcom/discord/chat/bridge/feedback/SurveyIndication;", "interactionStatus", "Lcom/discord/chat/bridge/interaction/InteractionStatus;", "useAttachmentGridLayout", "useAttachmentUploadPreview", "isCurrentUserMessageAuthor", "title", "description", "avatarURLs", "isCallActive", "missed", "rawMilliseconds", "sticker", "stickerLabel", "buttonLabel", "showInviteToSpeakButton", "activityInviteEmbed", "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "isFirstForumPostMessage", "postActions", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "autoModerationContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "giftCodes", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "referralTrialOffer", "totalMonthsSubscribed", "swipeToReplyIconUrl", "postPreviewEmbeds", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "get_constrainedWidth$annotations", "()V", "get_constrainedWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getActivityInviteEmbed", "()Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "getAnimateEmoji", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAttachments", "()Ljava/util/List;", "getAttachmentsOpacity", "getAuthorId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "getAutoModerationContext", "()Lcom/discord/chat/bridge/automod/AutoModerationContext;", "getAvatarDecorationURL", "()Ljava/lang/String;", "getAvatarURL$chat_release$annotations", "getAvatarURL$chat_release", "getAvatarURLs", "getButtonLabel", "getChannelId-o4g7jtM", "()J", "J", "getCodedLinks", "getColorString", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCommunicationDisabled", "getComponents", "getConnectionsRoleTag", "()Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;", "constrainedWidth", "getConstrainedWidth", "constrainedWidth$delegate", "Lkotlin/Lazy;", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getDescription", "getEdited", "getEmbeds", "getEphemeralIndication", "()Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "getExecutedCommand", "()Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "getFlags", "getGifAutoPlay", "getGiftCodes", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getId-3Eiw7ao", "Ljava/lang/String;", "getInteractionStatus", "()Lcom/discord/chat/bridge/interaction/InteractionStatus;", "()Z", "getMentioned", "getMissed", "getNonce-N_6c4I0", "getOpTagText", "getPostActions", "()Lcom/discord/chat/bridge/forums/ForumPostActions;", "getPostPreviewEmbeds", "getProgress", "getRawMilliseconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReactions", "getReferencedMessage", "()Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "getReferralTrialOffer", "()Lcom/discord/chat/bridge/gift/GiftEmbed;", "getRoleColor", "getRoleIcon", "()Lcom/discord/chat/bridge/roleicons/RoleIcon;", "getShouldShowRoleDot", "getShouldShowRoleOnName", "getShowInviteToSpeakButton", "getState", "()Lcom/discord/chat/bridge/MessageState;", "getSticker", "()Lcom/discord/chat/bridge/sticker/Sticker;", "getStickerLabel", "getStickers", "getSurveyIndication", "()Lcom/discord/chat/bridge/feedback/SurveyIndication;", "getSwipeToReplyIconUrl", "getTagBackgroundColor", "getTagText", "getTagVerified", "getThreadEmbed", "()Lcom/discord/chat/bridge/threads/ThreadEmbed;", "getThreadStarterMessageHeader", "getTimestamp", "getTitle", "getTotalMonthsSubscribed", "getType", "()Lcom/discord/chat/bridge/MessageType;", "getUseAddBurstReaction", "getUseAttachmentGridLayout", "getUseAttachmentUploadPreview", "getUseSortedReactions", "getUsername", "getUsernameColor", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component18$chat_release", "component19", "component2", "component2-3Eiw7ao", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component3-N_6c4I0", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component4-o4g7jtM", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component5-qOKuAAo", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component7-wUX8bhU", "component8", "component9", "copy", "copy-HxUhIIA", "(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/discord/chat/bridge/Message;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f
/* loaded from: classes5.dex */
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
    private final String f7693id;
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
    /* loaded from: classes5.dex */
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
    /* loaded from: classes5.dex */
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
    private Message(int i10, int i11, int i12, MessageType messageType, String str, String str2, ChannelId channelId, GuildId guildId, MessageState messageState, UserId userId, long j10, String str3, Float f10, String str4, String str5, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str6, String str7, List<Embed> list, List<Attachment> list2, Float f11, StructurableText structurableText, List<UploadProgress> list3, List<MessageReaction> list4, Boolean bool, Boolean bool2, List<? extends CodedLinkEmbed> list5, List<Sticker> list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List<? extends Component> list7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num4, String str10, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str11, String str12, List<String> list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str13, String str14, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List<? extends GiftEmbed> list9, GiftEmbed giftEmbed, Integer num5, String str15, List<PostPreviewEmbed> list10, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, serializationConstructorMarker);
        Lazy b10;
        if (((11 != (i10 & 11)) | (1 != (i11 & 1))) || ((i12 & 0) != 0)) {
            n1.a(new int[]{i10, i11, i12}, new int[]{11, 1, 0}, Message$$serializer.INSTANCE.getDescriptor());
        }
        this.type = messageType;
        this.f7693id = str;
        if ((i10 & 4) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str2;
        }
        this.channelId = channelId.m555unboximpl();
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
        if ((i10 & Spliterator.NONNULL) == 0) {
            this.edited = null;
        } else {
            this.edited = str3;
        }
        if ((i10 & 512) == 0) {
            this._constrainedWidth = null;
        } else {
            this._constrainedWidth = f10;
        }
        if ((i10 & Spliterator.IMMUTABLE) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str4;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.username = null;
        } else {
            this.username = str5;
        }
        if ((i10 & 4096) == 0) {
            this.usernameColor = null;
        } else {
            this.usernameColor = num;
        }
        if ((i10 & 8192) == 0) {
            this.roleColor = null;
        } else {
            this.roleColor = num2;
        }
        if ((i10 & Spliterator.SUBSIZED) == 0) {
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
        if ((i11 & Spliterator.NONNULL) == 0) {
            this.tagText = null;
        } else {
            this.tagText = str9;
        }
        if ((i11 & 512) == 0) {
            this.tagVerified = null;
        } else {
            this.tagVerified = bool6;
        }
        if ((i11 & Spliterator.IMMUTABLE) == 0) {
            this.tagBackgroundColor = null;
        } else {
            this.tagBackgroundColor = num4;
        }
        if ((i11 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.opTagText = null;
        } else {
            this.opTagText = str10;
        }
        if ((i11 & 4096) == 0) {
            this.ephemeralIndication = null;
        } else {
            this.ephemeralIndication = ephemeralIndication;
        }
        if ((i11 & 8192) == 0) {
            this.surveyIndication = null;
        } else {
            this.surveyIndication = surveyIndication;
        }
        if ((i11 & Spliterator.SUBSIZED) == 0) {
            this.interactionStatus = null;
        } else {
            this.interactionStatus = interactionStatus;
        }
        this.useAttachmentGridLayout = (i11 & 32768) == 0 ? Boolean.FALSE : bool7;
        this.useAttachmentUploadPreview = (i11 & 65536) == 0 ? Boolean.FALSE : bool8;
        this.isCurrentUserMessageAuthor = (i11 & 131072) == 0 ? Boolean.FALSE : bool9;
        if ((i11 & 262144) == 0) {
            this.title = null;
        } else {
            this.title = str11;
        }
        if ((524288 & i11) == 0) {
            this.description = null;
        } else {
            this.description = str12;
        }
        if ((1048576 & i11) == 0) {
            this.avatarURLs = null;
        } else {
            this.avatarURLs = list8;
        }
        if ((2097152 & i11) == 0) {
            this.isCallActive = null;
        } else {
            this.isCallActive = bool10;
        }
        if ((4194304 & i11) == 0) {
            this.missed = null;
        } else {
            this.missed = bool11;
        }
        if ((8388608 & i11) == 0) {
            this.rawMilliseconds = null;
        } else {
            this.rawMilliseconds = l10;
        }
        if ((16777216 & i11) == 0) {
            this.sticker = null;
        } else {
            this.sticker = sticker;
        }
        if ((33554432 & i11) == 0) {
            this.stickerLabel = null;
        } else {
            this.stickerLabel = str13;
        }
        if ((67108864 & i11) == 0) {
            this.buttonLabel = null;
        } else {
            this.buttonLabel = str14;
        }
        if ((134217728 & i11) == 0) {
            this.showInviteToSpeakButton = null;
        } else {
            this.showInviteToSpeakButton = bool12;
        }
        if ((268435456 & i11) == 0) {
            this.activityInviteEmbed = null;
        } else {
            this.activityInviteEmbed = activityInviteEmbed;
        }
        if ((536870912 & i11) == 0) {
            this.isFirstForumPostMessage = false;
        } else {
            this.isFirstForumPostMessage = z13;
        }
        if ((1073741824 & i11) == 0) {
            this.postActions = null;
        } else {
            this.postActions = forumPostActions;
        }
        if ((Integer.MIN_VALUE & i11) == 0) {
            this.autoModerationContext = null;
        } else {
            this.autoModerationContext = autoModerationContext;
        }
        if ((i12 & 1) == 0) {
            this.giftCodes = null;
        } else {
            this.giftCodes = list9;
        }
        if ((i12 & 2) == 0) {
            this.referralTrialOffer = null;
        } else {
            this.referralTrialOffer = giftEmbed;
        }
        if ((i12 & 4) == 0) {
            this.totalMonthsSubscribed = null;
        } else {
            this.totalMonthsSubscribed = num5;
        }
        if ((i12 & 8) == 0) {
            this.swipeToReplyIconUrl = null;
        } else {
            this.swipeToReplyIconUrl = str15;
        }
        if ((i12 & 16) == 0) {
            this.postPreviewEmbeds = null;
        } else {
            this.postPreviewEmbeds = list10;
        }
        b10 = n.b(new AnonymousClass1());
        this.constrainedWidth$delegate = b10;
    }

    public /* synthetic */ Message(int i10, int i11, int i12, MessageType messageType, String str, String str2, ChannelId channelId, GuildId guildId, MessageState messageState, UserId userId, long j10, String str3, Float f10, String str4, String str5, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str6, String str7, List list, List list2, Float f11, StructurableText structurableText, List list3, List list4, Boolean bool, Boolean bool2, List list5, List list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List list7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num4, String str10, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str11, String str12, List list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str13, String str14, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List list9, GiftEmbed giftEmbed, Integer num5, String str15, List list10, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, messageType, str, str2, channelId, guildId, messageState, userId, j10, str3, f10, str4, str5, num, num2, z10, z11, num3, str6, str7, list, list2, f11, structurableText, list3, list4, bool, bool2, list5, list6, roleIcon, connectionsRoleTag, threadEmbed, z12, bool3, bool4, referencedMessage, executedCommand, list7, str8, bool5, str9, bool6, num4, str10, ephemeralIndication, surveyIndication, interactionStatus, bool7, bool8, bool9, str11, str12, list8, bool10, bool11, l10, sticker, str13, str14, bool12, activityInviteEmbed, z13, forumPostActions, autoModerationContext, list9, giftEmbed, num5, str15, list10, serializationConstructorMarker);
    }

    public /* synthetic */ Message(MessageType messageType, String str, String str2, long j10, GuildId guildId, MessageState messageState, UserId userId, long j11, String str3, Float f10, String str4, String str5, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str6, String str7, List list, List list2, Float f11, StructurableText structurableText, List list3, List list4, Boolean bool, Boolean bool2, List list5, List list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List list7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num4, String str10, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str11, String str12, List list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str13, String str14, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List list9, GiftEmbed giftEmbed, Integer num5, String str15, List list10, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageType, str, str2, j10, guildId, messageState, userId, j11, str3, f10, str4, str5, num, num2, z10, z11, num3, str6, str7, list, list2, f11, structurableText, list3, list4, bool, bool2, list5, list6, roleIcon, connectionsRoleTag, threadEmbed, z12, bool3, bool4, referencedMessage, executedCommand, list7, str8, bool5, str9, bool6, num4, str10, ephemeralIndication, surveyIndication, interactionStatus, bool7, bool8, bool9, str11, str12, list8, bool10, bool11, l10, sticker, str13, str14, bool12, activityInviteEmbed, z13, forumPostActions, autoModerationContext, list9, giftEmbed, num5, str15, list10);
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
        output.z(serialDesc, 0, MessageType.Serializer.INSTANCE, self.type);
        MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
        output.z(serialDesc, 1, messageId$$serializer, MessageId.m572boximpl(self.f7693id));
        if (output.A(serialDesc, 2) || self.nonce != null) {
            String str = self.nonce;
            output.h(serialDesc, 2, messageId$$serializer, str != null ? MessageId.m572boximpl(str) : null);
        }
        output.z(serialDesc, 3, ChannelId$$serializer.INSTANCE, ChannelId.m546boximpl(self.channelId));
        if (output.A(serialDesc, 4) || self.guildId != null) {
            output.h(serialDesc, 4, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (output.A(serialDesc, 5) || self.state != null) {
            output.h(serialDesc, 5, MessageState.Serializer.INSTANCE, self.state);
        }
        if (output.A(serialDesc, 6) || self.authorId != null) {
            output.h(serialDesc, 6, UserId$$serializer.INSTANCE, self.authorId);
        }
        if (output.A(serialDesc, 7) || self.flags != 0) {
            output.E(serialDesc, 7, self.flags);
        }
        if (output.A(serialDesc, 8) || self.edited != null) {
            output.h(serialDesc, 8, a2.f32309a, self.edited);
        }
        if (output.A(serialDesc, 9) || self._constrainedWidth != null) {
            output.h(serialDesc, 9, e0.f32334a, self._constrainedWidth);
        }
        if (output.A(serialDesc, 10) || self.timestamp != null) {
            output.h(serialDesc, 10, a2.f32309a, self.timestamp);
        }
        if (output.A(serialDesc, 11) || self.username != null) {
            output.h(serialDesc, 11, a2.f32309a, self.username);
        }
        if (output.A(serialDesc, 12) || self.usernameColor != null) {
            output.h(serialDesc, 12, m0.f32384a, self.usernameColor);
        }
        if (output.A(serialDesc, 13) || self.roleColor != null) {
            output.h(serialDesc, 13, m0.f32384a, self.roleColor);
        }
        if (output.A(serialDesc, 14) || self.shouldShowRoleDot) {
            output.x(serialDesc, 14, self.shouldShowRoleDot);
        }
        if (output.A(serialDesc, 15) || self.shouldShowRoleOnName) {
            output.x(serialDesc, 15, self.shouldShowRoleOnName);
        }
        if (output.A(serialDesc, 16) || self.colorString != null) {
            output.h(serialDesc, 16, m0.f32384a, self.colorString);
        }
        if (output.A(serialDesc, 17) || self.avatarURL != null) {
            output.h(serialDesc, 17, a2.f32309a, self.avatarURL);
        }
        if (output.A(serialDesc, 18) || self.avatarDecorationURL != null) {
            output.h(serialDesc, 18, a2.f32309a, self.avatarDecorationURL);
        }
        if (output.A(serialDesc, 19) || self.embeds != null) {
            output.h(serialDesc, 19, new xj.f(Embed$$serializer.INSTANCE), self.embeds);
        }
        if (output.A(serialDesc, 20) || self.attachments != null) {
            output.h(serialDesc, 20, new xj.f(Attachment$$serializer.INSTANCE), self.attachments);
        }
        if (output.A(serialDesc, 21) || self.attachmentsOpacity != null) {
            output.h(serialDesc, 21, e0.f32334a, self.attachmentsOpacity);
        }
        if (output.A(serialDesc, 22) || self.content != null) {
            output.h(serialDesc, 22, StructurableTextSerializer.INSTANCE, self.content);
        }
        if (output.A(serialDesc, 23) || self.progress != null) {
            output.h(serialDesc, 23, new xj.f(UploadProgress$$serializer.INSTANCE), self.progress);
        }
        if (output.A(serialDesc, 24) || self.reactions != null) {
            output.h(serialDesc, 24, new xj.f(MessageReaction$$serializer.INSTANCE), self.reactions);
        }
        if (output.A(serialDesc, 25) || !q.b(self.useSortedReactions, Boolean.TRUE)) {
            output.h(serialDesc, 25, h.f32351a, self.useSortedReactions);
        }
        if (output.A(serialDesc, 26) || !q.b(self.useAddBurstReaction, Boolean.FALSE)) {
            output.h(serialDesc, 26, h.f32351a, self.useAddBurstReaction);
        }
        if (output.A(serialDesc, 27) || self.codedLinks != null) {
            output.h(serialDesc, 27, new xj.f(a.u(CodedLinkSerializer.INSTANCE)), self.codedLinks);
        }
        if (output.A(serialDesc, 28) || self.stickers != null) {
            output.h(serialDesc, 28, new xj.f(Sticker$$serializer.INSTANCE), self.stickers);
        }
        if (output.A(serialDesc, 29) || self.roleIcon != null) {
            output.h(serialDesc, 29, RoleIcon$$serializer.INSTANCE, self.roleIcon);
        }
        if (output.A(serialDesc, 30) || self.connectionsRoleTag != null) {
            output.h(serialDesc, 30, ConnectionsRoleTag$$serializer.INSTANCE, self.connectionsRoleTag);
        }
        if (output.A(serialDesc, 31) || self.threadEmbed != null) {
            output.h(serialDesc, 31, ThreadEmbed$$serializer.INSTANCE, self.threadEmbed);
        }
        output.x(serialDesc, 32, self.mentioned);
        if (output.A(serialDesc, 33) || self.gifAutoPlay != null) {
            output.h(serialDesc, 33, h.f32351a, self.gifAutoPlay);
        }
        if (output.A(serialDesc, 34) || self.animateEmoji != null) {
            output.h(serialDesc, 34, h.f32351a, self.animateEmoji);
        }
        if (output.A(serialDesc, 35) || self.referencedMessage != null) {
            output.h(serialDesc, 35, ReferencedMessageSerializer.INSTANCE, self.referencedMessage);
        }
        if (output.A(serialDesc, 36) || self.executedCommand != null) {
            output.h(serialDesc, 36, ExecutedCommand$$serializer.INSTANCE, self.executedCommand);
        }
        if (output.A(serialDesc, 37) || self.components != null) {
            output.h(serialDesc, 37, new xj.f(ComponentSerializer.INSTANCE), self.components);
        }
        if (output.A(serialDesc, 38) || self.threadStarterMessageHeader != null) {
            output.h(serialDesc, 38, a2.f32309a, self.threadStarterMessageHeader);
        }
        if (output.A(serialDesc, 39) || self.communicationDisabled != null) {
            output.h(serialDesc, 39, h.f32351a, self.communicationDisabled);
        }
        if (output.A(serialDesc, 40) || self.tagText != null) {
            output.h(serialDesc, 40, a2.f32309a, self.tagText);
        }
        if (output.A(serialDesc, 41) || self.tagVerified != null) {
            output.h(serialDesc, 41, h.f32351a, self.tagVerified);
        }
        if (output.A(serialDesc, 42) || self.tagBackgroundColor != null) {
            output.h(serialDesc, 42, m0.f32384a, self.tagBackgroundColor);
        }
        if (output.A(serialDesc, 43) || self.opTagText != null) {
            output.h(serialDesc, 43, a2.f32309a, self.opTagText);
        }
        if (output.A(serialDesc, 44) || self.ephemeralIndication != null) {
            output.h(serialDesc, 44, EphemeralIndication$$serializer.INSTANCE, self.ephemeralIndication);
        }
        if (output.A(serialDesc, 45) || self.surveyIndication != null) {
            output.h(serialDesc, 45, SurveyIndication$$serializer.INSTANCE, self.surveyIndication);
        }
        if (output.A(serialDesc, 46) || self.interactionStatus != null) {
            output.h(serialDesc, 46, InteractionStatus$$serializer.INSTANCE, self.interactionStatus);
        }
        if (output.A(serialDesc, 47) || !q.b(self.useAttachmentGridLayout, Boolean.FALSE)) {
            output.h(serialDesc, 47, h.f32351a, self.useAttachmentGridLayout);
        }
        if (output.A(serialDesc, 48) || !q.b(self.useAttachmentUploadPreview, Boolean.FALSE)) {
            output.h(serialDesc, 48, h.f32351a, self.useAttachmentUploadPreview);
        }
        if (output.A(serialDesc, 49) || !q.b(self.isCurrentUserMessageAuthor, Boolean.FALSE)) {
            output.h(serialDesc, 49, h.f32351a, self.isCurrentUserMessageAuthor);
        }
        if (output.A(serialDesc, 50) || self.title != null) {
            output.h(serialDesc, 50, a2.f32309a, self.title);
        }
        if (output.A(serialDesc, 51) || self.description != null) {
            output.h(serialDesc, 51, a2.f32309a, self.description);
        }
        if (output.A(serialDesc, 52) || self.avatarURLs != null) {
            output.h(serialDesc, 52, new xj.f(a2.f32309a), self.avatarURLs);
        }
        if (output.A(serialDesc, 53) || self.isCallActive != null) {
            output.h(serialDesc, 53, h.f32351a, self.isCallActive);
        }
        if (output.A(serialDesc, 54) || self.missed != null) {
            output.h(serialDesc, 54, h.f32351a, self.missed);
        }
        if (output.A(serialDesc, 55) || self.rawMilliseconds != null) {
            output.h(serialDesc, 55, w0.f32425a, self.rawMilliseconds);
        }
        if (output.A(serialDesc, 56) || self.sticker != null) {
            output.h(serialDesc, 56, Sticker$$serializer.INSTANCE, self.sticker);
        }
        if (output.A(serialDesc, 57) || self.stickerLabel != null) {
            output.h(serialDesc, 57, a2.f32309a, self.stickerLabel);
        }
        if (output.A(serialDesc, 58) || self.buttonLabel != null) {
            output.h(serialDesc, 58, a2.f32309a, self.buttonLabel);
        }
        if (output.A(serialDesc, 59) || self.showInviteToSpeakButton != null) {
            output.h(serialDesc, 59, h.f32351a, self.showInviteToSpeakButton);
        }
        if (output.A(serialDesc, 60) || self.activityInviteEmbed != null) {
            output.h(serialDesc, 60, ActivityInviteEmbed$$serializer.INSTANCE, self.activityInviteEmbed);
        }
        if (output.A(serialDesc, 61) || self.isFirstForumPostMessage) {
            output.x(serialDesc, 61, self.isFirstForumPostMessage);
        }
        if (output.A(serialDesc, 62) || self.postActions != null) {
            output.h(serialDesc, 62, ForumPostActions$$serializer.INSTANCE, self.postActions);
        }
        if (output.A(serialDesc, 63) || self.autoModerationContext != null) {
            output.h(serialDesc, 63, AutoModerationContext$$serializer.INSTANCE, self.autoModerationContext);
        }
        if (output.A(serialDesc, 64) || self.giftCodes != null) {
            output.h(serialDesc, 64, new xj.f(GiftEmbedSerializer.INSTANCE), self.giftCodes);
        }
        if (output.A(serialDesc, 65) || self.referralTrialOffer != null) {
            output.h(serialDesc, 65, GiftEmbedSerializer.INSTANCE, self.referralTrialOffer);
        }
        if (output.A(serialDesc, 66) || self.totalMonthsSubscribed != null) {
            output.h(serialDesc, 66, m0.f32384a, self.totalMonthsSubscribed);
        }
        if (output.A(serialDesc, 67) || self.swipeToReplyIconUrl != null) {
            output.h(serialDesc, 67, a2.f32309a, self.swipeToReplyIconUrl);
        }
        if (output.A(serialDesc, 68) || self.postPreviewEmbeds != null) {
            z10 = true;
        }
        if (z10) {
            output.h(serialDesc, 68, new xj.f(PostPreviewEmbed$$serializer.INSTANCE), self.postPreviewEmbeds);
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
    public final String m8component23Eiw7ao() {
        return this.f7693id;
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
    public final String m9component3N_6c4I0() {
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
    public final long m10component4o4g7jtM() {
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
        return this.tagBackgroundColor;
    }

    public final String component44() {
        return this.opTagText;
    }

    public final EphemeralIndication component45() {
        return this.ephemeralIndication;
    }

    public final SurveyIndication component46() {
        return this.surveyIndication;
    }

    public final InteractionStatus component47() {
        return this.interactionStatus;
    }

    public final Boolean component48() {
        return this.useAttachmentGridLayout;
    }

    public final Boolean component49() {
        return this.useAttachmentUploadPreview;
    }

    /* renamed from: component5-qOKuAAo  reason: not valid java name */
    public final GuildId m11component5qOKuAAo() {
        return this.guildId;
    }

    public final Boolean component50() {
        return this.isCurrentUserMessageAuthor;
    }

    public final String component51() {
        return this.title;
    }

    public final String component52() {
        return this.description;
    }

    public final List<String> component53() {
        return this.avatarURLs;
    }

    public final Boolean component54() {
        return this.isCallActive;
    }

    public final Boolean component55() {
        return this.missed;
    }

    public final Long component56() {
        return this.rawMilliseconds;
    }

    public final Sticker component57() {
        return this.sticker;
    }

    public final String component58() {
        return this.stickerLabel;
    }

    public final String component59() {
        return this.buttonLabel;
    }

    public final MessageState component6() {
        return this.state;
    }

    public final Boolean component60() {
        return this.showInviteToSpeakButton;
    }

    public final ActivityInviteEmbed component61() {
        return this.activityInviteEmbed;
    }

    public final boolean component62() {
        return this.isFirstForumPostMessage;
    }

    public final ForumPostActions component63() {
        return this.postActions;
    }

    public final AutoModerationContext component64() {
        return this.autoModerationContext;
    }

    public final List<GiftEmbed> component65() {
        return this.giftCodes;
    }

    public final GiftEmbed component66() {
        return this.referralTrialOffer;
    }

    public final Integer component67() {
        return this.totalMonthsSubscribed;
    }

    public final String component68() {
        return this.swipeToReplyIconUrl;
    }

    public final List<PostPreviewEmbed> component69() {
        return this.postPreviewEmbeds;
    }

    /* renamed from: component7-wUX8bhU  reason: not valid java name */
    public final UserId m12component7wUX8bhU() {
        return this.authorId;
    }

    public final long component8() {
        return this.flags;
    }

    public final String component9() {
        return this.edited;
    }

    /* renamed from: copy-HxUhIIA  reason: not valid java name */
    public final Message m13copyHxUhIIA(MessageType type, String id2, String str, long j10, GuildId guildId, MessageState messageState, UserId userId, long j11, String str2, Float f10, String str3, String str4, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str5, String str6, List<Embed> list, List<Attachment> list2, Float f11, StructurableText structurableText, List<UploadProgress> list3, List<MessageReaction> list4, Boolean bool, Boolean bool2, List<? extends CodedLinkEmbed> list5, List<Sticker> list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List<? extends Component> list7, String str7, Boolean bool5, String str8, Boolean bool6, Integer num4, String str9, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str10, String str11, List<String> list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str12, String str13, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List<? extends GiftEmbed> list9, GiftEmbed giftEmbed, Integer num5, String str14, List<PostPreviewEmbed> list10) {
        q.g(type, "type");
        q.g(id2, "id");
        return new Message(type, id2, str, j10, guildId, messageState, userId, j11, str2, f10, str3, str4, num, num2, z10, z11, num3, str5, str6, list, list2, f11, structurableText, list3, list4, bool, bool2, list5, list6, roleIcon, connectionsRoleTag, threadEmbed, z12, bool3, bool4, referencedMessage, executedCommand, list7, str7, bool5, str8, bool6, num4, str9, ephemeralIndication, surveyIndication, interactionStatus, bool7, bool8, bool9, str10, str11, list8, bool10, bool11, l10, sticker, str12, str13, bool12, activityInviteEmbed, z13, forumPostActions, autoModerationContext, list9, giftEmbed, num5, str14, list10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 756
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
    public final UserId m14getAuthorIdwUX8bhU() {
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
    public final long m15getChannelIdo4g7jtM() {
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
    public final GuildId m16getGuildIdqOKuAAo() {
        return this.guildId;
    }

    /* renamed from: getId-3Eiw7ao  reason: not valid java name */
    public final String m17getId3Eiw7ao() {
        return this.f7693id;
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
    public final String m18getNonceN_6c4I0() {
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
        int hashCode = ((this.type.hashCode() * 31) + MessageId.m577hashCodeimpl(this.f7693id)) * 31;
        String str = this.nonce;
        int i10 = 0;
        int i11 = (((hashCode + (str == null ? 0 : MessageId.m577hashCodeimpl(str))) * 31) + ChannelId.m551hashCodeimpl(this.channelId)) * 31;
        GuildId guildId = this.guildId;
        int i12 = (i11 + (guildId == null ? 0 : GuildId.m564hashCodeimpl(guildId.m568unboximpl()))) * 31;
        MessageState messageState = this.state;
        int hashCode2 = (i12 + (messageState == null ? 0 : messageState.hashCode())) * 31;
        UserId userId = this.authorId;
        int i13 = (((hashCode2 + (userId == null ? 0 : UserId.m615hashCodeimpl(userId.m619unboximpl()))) * 31) + co.discord.media_engine.a.a(this.flags)) * 31;
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
        Integer num4 = this.tagBackgroundColor;
        int hashCode34 = (hashCode33 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str9 = this.opTagText;
        int hashCode35 = (hashCode34 + (str9 == null ? 0 : str9.hashCode())) * 31;
        EphemeralIndication ephemeralIndication = this.ephemeralIndication;
        int hashCode36 = (hashCode35 + (ephemeralIndication == null ? 0 : ephemeralIndication.hashCode())) * 31;
        SurveyIndication surveyIndication = this.surveyIndication;
        int hashCode37 = (hashCode36 + (surveyIndication == null ? 0 : surveyIndication.hashCode())) * 31;
        InteractionStatus interactionStatus = this.interactionStatus;
        int hashCode38 = (hashCode37 + (interactionStatus == null ? 0 : interactionStatus.hashCode())) * 31;
        Boolean bool7 = this.useAttachmentGridLayout;
        int hashCode39 = (hashCode38 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.useAttachmentUploadPreview;
        int hashCode40 = (hashCode39 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isCurrentUserMessageAuthor;
        int hashCode41 = (hashCode40 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str10 = this.title;
        int hashCode42 = (hashCode41 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.description;
        int hashCode43 = (hashCode42 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<String> list8 = this.avatarURLs;
        int hashCode44 = (hashCode43 + (list8 == null ? 0 : list8.hashCode())) * 31;
        Boolean bool10 = this.isCallActive;
        int hashCode45 = (hashCode44 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.missed;
        int hashCode46 = (hashCode45 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Long l10 = this.rawMilliseconds;
        int hashCode47 = (hashCode46 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Sticker sticker = this.sticker;
        int hashCode48 = (hashCode47 + (sticker == null ? 0 : sticker.hashCode())) * 31;
        String str12 = this.stickerLabel;
        int hashCode49 = (hashCode48 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.buttonLabel;
        int hashCode50 = (hashCode49 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool12 = this.showInviteToSpeakButton;
        int hashCode51 = (hashCode50 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        ActivityInviteEmbed activityInviteEmbed = this.activityInviteEmbed;
        int hashCode52 = (hashCode51 + (activityInviteEmbed == null ? 0 : activityInviteEmbed.hashCode())) * 31;
        boolean z13 = this.isFirstForumPostMessage;
        if (!z13) {
            i14 = z13 ? 1 : 0;
        }
        int i27 = (hashCode52 + i14) * 31;
        ForumPostActions forumPostActions = this.postActions;
        int hashCode53 = (i27 + (forumPostActions == null ? 0 : forumPostActions.hashCode())) * 31;
        AutoModerationContext autoModerationContext = this.autoModerationContext;
        int hashCode54 = (hashCode53 + (autoModerationContext == null ? 0 : autoModerationContext.hashCode())) * 31;
        List<GiftEmbed> list9 = this.giftCodes;
        int hashCode55 = (hashCode54 + (list9 == null ? 0 : list9.hashCode())) * 31;
        GiftEmbed giftEmbed = this.referralTrialOffer;
        int hashCode56 = (hashCode55 + (giftEmbed == null ? 0 : giftEmbed.hashCode())) * 31;
        Integer num5 = this.totalMonthsSubscribed;
        int hashCode57 = (hashCode56 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str14 = this.swipeToReplyIconUrl;
        int hashCode58 = (hashCode57 + (str14 == null ? 0 : str14.hashCode())) * 31;
        List<PostPreviewEmbed> list10 = this.postPreviewEmbeds;
        if (list10 != null) {
            i10 = list10.hashCode();
        }
        return hashCode58 + i10;
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
        String str = MessageId.m578toStringimpl(this.f7693id);
        String str2 = this.nonce;
        String str3 = str2 == null ? "null" : MessageId.m578toStringimpl(str2);
        String str4 = ChannelId.m553toStringimpl(this.channelId);
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
        Integer num4 = this.tagBackgroundColor;
        String str12 = this.opTagText;
        EphemeralIndication ephemeralIndication = this.ephemeralIndication;
        SurveyIndication surveyIndication = this.surveyIndication;
        InteractionStatus interactionStatus = this.interactionStatus;
        Boolean bool7 = this.useAttachmentGridLayout;
        Boolean bool8 = this.useAttachmentUploadPreview;
        Boolean bool9 = this.isCurrentUserMessageAuthor;
        String str13 = this.title;
        String str14 = this.description;
        List<String> list8 = this.avatarURLs;
        Boolean bool10 = this.isCallActive;
        Boolean bool11 = this.missed;
        Long l10 = this.rawMilliseconds;
        Sticker sticker = this.sticker;
        String str15 = this.stickerLabel;
        String str16 = this.buttonLabel;
        Boolean bool12 = this.showInviteToSpeakButton;
        ActivityInviteEmbed activityInviteEmbed = this.activityInviteEmbed;
        boolean z13 = this.isFirstForumPostMessage;
        ForumPostActions forumPostActions = this.postActions;
        AutoModerationContext autoModerationContext = this.autoModerationContext;
        List<GiftEmbed> list9 = this.giftCodes;
        GiftEmbed giftEmbed = this.referralTrialOffer;
        Integer num5 = this.totalMonthsSubscribed;
        String str17 = this.swipeToReplyIconUrl;
        List<PostPreviewEmbed> list10 = this.postPreviewEmbeds;
        return "Message(type=" + messageType + ", id=" + str + ", nonce=" + str3 + ", channelId=" + str4 + ", guildId=" + guildId + ", state=" + messageState + ", authorId=" + userId + ", flags=" + j10 + ", edited=" + str5 + ", _constrainedWidth=" + f10 + ", timestamp=" + str6 + ", username=" + str7 + ", usernameColor=" + num + ", roleColor=" + num2 + ", shouldShowRoleDot=" + z10 + ", shouldShowRoleOnName=" + z11 + ", colorString=" + num3 + ", avatarURL=" + str8 + ", avatarDecorationURL=" + str9 + ", embeds=" + list + ", attachments=" + list2 + ", attachmentsOpacity=" + f11 + ", content=" + structurableText + ", progress=" + list3 + ", reactions=" + list4 + ", useSortedReactions=" + bool + ", useAddBurstReaction=" + bool2 + ", codedLinks=" + list5 + ", stickers=" + list6 + ", roleIcon=" + roleIcon + ", connectionsRoleTag=" + connectionsRoleTag + ", threadEmbed=" + threadEmbed + ", mentioned=" + z12 + ", gifAutoPlay=" + bool3 + ", animateEmoji=" + bool4 + ", referencedMessage=" + referencedMessage + ", executedCommand=" + executedCommand + ", components=" + list7 + ", threadStarterMessageHeader=" + str10 + ", communicationDisabled=" + bool5 + ", tagText=" + str11 + ", tagVerified=" + bool6 + ", tagBackgroundColor=" + num4 + ", opTagText=" + str12 + ", ephemeralIndication=" + ephemeralIndication + ", surveyIndication=" + surveyIndication + ", interactionStatus=" + interactionStatus + ", useAttachmentGridLayout=" + bool7 + ", useAttachmentUploadPreview=" + bool8 + ", isCurrentUserMessageAuthor=" + bool9 + ", title=" + str13 + ", description=" + str14 + ", avatarURLs=" + list8 + ", isCallActive=" + bool10 + ", missed=" + bool11 + ", rawMilliseconds=" + l10 + ", sticker=" + sticker + ", stickerLabel=" + str15 + ", buttonLabel=" + str16 + ", showInviteToSpeakButton=" + bool12 + ", activityInviteEmbed=" + activityInviteEmbed + ", isFirstForumPostMessage=" + z13 + ", postActions=" + forumPostActions + ", autoModerationContext=" + autoModerationContext + ", giftCodes=" + list9 + ", referralTrialOffer=" + giftEmbed + ", totalMonthsSubscribed=" + num5 + ", swipeToReplyIconUrl=" + str17 + ", postPreviewEmbeds=" + list10 + ")";
    }

    public /* synthetic */ Message(MessageType messageType, String str, String str2, long j10, GuildId guildId, MessageState messageState, UserId userId, long j11, String str3, Float f10, String str4, String str5, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str6, String str7, List list, List list2, Float f11, StructurableText structurableText, List list3, List list4, Boolean bool, Boolean bool2, List list5, List list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List list7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num4, String str10, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str11, String str12, List list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str13, String str14, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List list9, GiftEmbed giftEmbed, Integer num5, String str15, List list10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageType, str, (i10 & 4) != 0 ? null : str2, j10, (i10 & 16) != 0 ? null : guildId, (i10 & 32) != 0 ? null : messageState, (i10 & 64) != 0 ? null : userId, (i10 & 128) != 0 ? 0L : j11, (i10 & Spliterator.NONNULL) != 0 ? null : str3, (i10 & 512) != 0 ? null : f10, (i10 & Spliterator.IMMUTABLE) != 0 ? null : str4, (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str5, (i10 & 4096) != 0 ? null : num, (i10 & 8192) != 0 ? null : num2, (i10 & Spliterator.SUBSIZED) != 0 ? false : z10, (i10 & 32768) != 0 ? false : z11, (i10 & 65536) != 0 ? null : num3, (i10 & 131072) != 0 ? null : str6, (i10 & 262144) != 0 ? null : str7, (i10 & 524288) != 0 ? null : list, (i10 & 1048576) != 0 ? null : list2, (i10 & 2097152) != 0 ? null : f11, (i10 & 4194304) != 0 ? null : structurableText, (i10 & 8388608) != 0 ? null : list3, (i10 & 16777216) != 0 ? null : list4, (i10 & 33554432) != 0 ? Boolean.TRUE : bool, (i10 & 67108864) != 0 ? Boolean.FALSE : bool2, (i10 & 134217728) != 0 ? null : list5, (i10 & 268435456) != 0 ? null : list6, (i10 & 536870912) != 0 ? null : roleIcon, (i10 & 1073741824) != 0 ? null : connectionsRoleTag, (i10 & Integer.MIN_VALUE) != 0 ? null : threadEmbed, z12, (i11 & 2) != 0 ? null : bool3, (i11 & 4) != 0 ? null : bool4, (i11 & 8) != 0 ? null : referencedMessage, (i11 & 16) != 0 ? null : executedCommand, (i11 & 32) != 0 ? null : list7, (i11 & 64) != 0 ? null : str8, (i11 & 128) != 0 ? null : bool5, (i11 & Spliterator.NONNULL) != 0 ? null : str9, (i11 & 512) != 0 ? null : bool6, (i11 & Spliterator.IMMUTABLE) != 0 ? null : num4, (i11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str10, (i11 & 4096) != 0 ? null : ephemeralIndication, (i11 & 8192) != 0 ? null : surveyIndication, (i11 & Spliterator.SUBSIZED) != 0 ? null : interactionStatus, (32768 & i11) != 0 ? Boolean.FALSE : bool7, (i11 & 65536) != 0 ? Boolean.FALSE : bool8, (i11 & 131072) != 0 ? Boolean.FALSE : bool9, (i11 & 262144) != 0 ? null : str11, (i11 & 524288) != 0 ? null : str12, (i11 & 1048576) != 0 ? null : list8, (i11 & 2097152) != 0 ? null : bool10, (i11 & 4194304) != 0 ? null : bool11, (8388608 & i11) != 0 ? null : l10, (16777216 & i11) != 0 ? null : sticker, (33554432 & i11) != 0 ? null : str13, (67108864 & i11) != 0 ? null : str14, (134217728 & i11) != 0 ? null : bool12, (268435456 & i11) != 0 ? null : activityInviteEmbed, (536870912 & i11) != 0 ? false : z13, (1073741824 & i11) != 0 ? null : forumPostActions, (i11 & Integer.MIN_VALUE) != 0 ? null : autoModerationContext, (i12 & 1) != 0 ? null : list9, (i12 & 2) != 0 ? null : giftEmbed, (i12 & 4) != 0 ? null : num5, (i12 & 8) != 0 ? null : str15, (i12 & 16) != 0 ? null : list10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Message(MessageType messageType, String str, String str2, long j10, GuildId guildId, MessageState messageState, UserId userId, long j11, String str3, Float f10, String str4, String str5, Integer num, Integer num2, boolean z10, boolean z11, Integer num3, String str6, String str7, List<Embed> list, List<Attachment> list2, Float f11, StructurableText structurableText, List<UploadProgress> list3, List<MessageReaction> list4, Boolean bool, Boolean bool2, List<? extends CodedLinkEmbed> list5, List<Sticker> list6, RoleIcon roleIcon, ConnectionsRoleTag connectionsRoleTag, ThreadEmbed threadEmbed, boolean z12, Boolean bool3, Boolean bool4, ReferencedMessage referencedMessage, ExecutedCommand executedCommand, List<? extends Component> list7, String str8, Boolean bool5, String str9, Boolean bool6, Integer num4, String str10, EphemeralIndication ephemeralIndication, SurveyIndication surveyIndication, InteractionStatus interactionStatus, Boolean bool7, Boolean bool8, Boolean bool9, String str11, String str12, List<String> list8, Boolean bool10, Boolean bool11, Long l10, Sticker sticker, String str13, String str14, Boolean bool12, ActivityInviteEmbed activityInviteEmbed, boolean z13, ForumPostActions forumPostActions, AutoModerationContext autoModerationContext, List<? extends GiftEmbed> list9, GiftEmbed giftEmbed, Integer num5, String str15, List<PostPreviewEmbed> list10) {
        super(null);
        Lazy b10;
        this.type = messageType;
        this.f7693id = str;
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
        this.tagBackgroundColor = num4;
        this.opTagText = str10;
        this.ephemeralIndication = ephemeralIndication;
        this.surveyIndication = surveyIndication;
        this.interactionStatus = interactionStatus;
        this.useAttachmentGridLayout = bool7;
        this.useAttachmentUploadPreview = bool8;
        this.isCurrentUserMessageAuthor = bool9;
        this.title = str11;
        this.description = str12;
        this.avatarURLs = list8;
        this.isCallActive = bool10;
        this.missed = bool11;
        this.rawMilliseconds = l10;
        this.sticker = sticker;
        this.stickerLabel = str13;
        this.buttonLabel = str14;
        this.showInviteToSpeakButton = bool12;
        this.activityInviteEmbed = activityInviteEmbed;
        this.isFirstForumPostMessage = z13;
        this.postActions = forumPostActions;
        this.autoModerationContext = autoModerationContext;
        this.giftCodes = list9;
        this.referralTrialOffer = giftEmbed;
        this.totalMonthsSubscribed = num5;
        this.swipeToReplyIconUrl = str15;
        this.postPreviewEmbeds = list10;
        b10 = n.b(new Message$constrainedWidth$2(this));
        this.constrainedWidth$delegate = b10;
    }
}
