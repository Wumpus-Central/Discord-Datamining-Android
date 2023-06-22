package com.discord.chat.reactevents;

import android.content.Context;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.events.TapReactionOverflow;
import com.discord.chat.presentation.list.ScrollDirection;
import com.discord.chat.presentation.list.ScrollState;
import com.discord.chat.reactevents.TapImageData;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.reactevents.ReactEvent;
import com.discord.reactevents.ReactEvents;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\u0010Ï\u0001\u001a\u00030Î\u0001\u0012\b\u0010Ñ\u0001\u001a\u00030Ð\u0001\u0012\u000e\u0010Ó\u0001\u001a\t\u0012\u0004\u0012\u00020B0Ò\u0001¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016J%\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010%J%\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010\u0012J?\u00104\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\n2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J%\u00106\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010\u0012J$\u00108\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0016J.\u0010:\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u00109\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0016J\u0010\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\nH\u0016J\u0010\u0010@\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\nH\u0016J\u0010\u0010A\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016Ji\u0010P\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020B2\u0006\u0010G\u001a\u00020B2\u0006\u0010H\u001a\u00020B2\u0006\u0010J\u001a\u00020I2\b\u0010L\u001a\u0004\u0018\u00010K2\b\u0010M\u001a\u0004\u0018\u00010BH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010OJ9\u0010W\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020B2\b\u0010S\u001a\u0004\u0018\u00010R2\b\u0010T\u001a\u0004\u0018\u00010RH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010VJ\b\u0010X\u001a\u00020\u0006H\u0016J\b\u0010Y\u001a\u00020\u0006H\u0016J\u0018\u0010Z\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010[\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001dH\u0016J%\u0010_\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010^J-\u0010c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010`\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u0010bJ1\u0010g\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010d\u001a\u0004\u0018\u00010RH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\be\u0010fJ\u0018\u0010j\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\n2\u0006\u0010i\u001a\u00020\nH\u0016J\b\u0010k\u001a\u00020\u0006H\u0016J(\u0010m\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010l\u001a\u00020\nH\u0016J-\u0010r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010o\u001a\u00020nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bp\u0010qJ\u0010\u0010t\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\nH\u0016J\u001d\u0010w\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bu\u0010vJ\u001d\u0010y\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010vJ%\u0010{\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bz\u0010\u0012J\u0010\u0010}\u001a\u00020\u00062\u0006\u0010|\u001a\u00020\nH\u0016J\u0019\u0010\u0080\u0001\u001a\u00020\u00062\u0006\u0010~\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\nH\u0016J'\u0010\u0082\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0081\u0001\u0010%J\u001f\u0010\u0084\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0083\u0001\u0010vJ\u001f\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0085\u0001\u0010vJ\u0013\u0010\u0089\u0001\u001a\u00020\u00062\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0016J'\u0010\u008b\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008a\u0001\u0010\u0012J)\u0010\u008f\u0001\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0007\u00107\u001a\u00030\u008c\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J'\u0010\u0091\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0090\u0001\u0010\u0012J'\u0010\u0093\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0092\u0001\u0010\u0012J'\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0094\u0001\u0010\u0012J\t\u0010\u0096\u0001\u001a\u00020\u0006H\u0016J\u001f\u0010\u0098\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0097\u0001\u0010vJ3\u0010\u009c\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0012\u0010\u009e\u0001\u001a\u00020\u00062\u0007\u0010\u009d\u0001\u001a\u00020\nH\u0016J'\u0010 \u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009f\u0001\u0010\u0012J=\u0010§\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010¢\u0001\u001a\u00030¡\u00012\b\u0010£\u0001\u001a\u00030¡\u00012\u0007\u0010¤\u0001\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¥\u0001\u0010¦\u0001JG\u0010¬\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010¢\u0001\u001a\u00030¡\u00012\b\u0010¨\u0001\u001a\u00030¡\u00012\u0007\u0010¤\u0001\u001a\u00020\u000f2\b\u0010©\u0001\u001a\u00030¡\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bª\u0001\u0010«\u0001J+\u0010°\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0012\u0010²\u0001\u001a\u00020\u00062\u0007\u0010±\u0001\u001a\u00020\nH\u0016J\u0012\u0010³\u0001\u001a\u00020\u00062\u0007\u0010±\u0001\u001a\u00020\nH\u0016J(\u0010µ\u0001\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b´\u0001\u0010\u008e\u0001J;\u0010º\u0001\u001a\u00020\u00062\u0007\u00107\u001a\u00030\u008c\u00012\u0007\u0010¶\u0001\u001a\u00020\u00142\u0007\u0010·\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001f\u0010¼\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b»\u0001\u0010vR%\u0010¿\u0001\u001a\u0010\u0012\u0005\u0012\u00030¾\u0001\u0012\u0004\u0012\u00020\u00060½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001RO\u0010Ä\u0001\u001a/\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0007\u0012\u0005\u0018\u00010Â\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010Á\u0001j\u0005\u0018\u0001`Ã\u00018\u0016X\u0096\u0004ø\u0001\u0001¢\u0006\u0010\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R>\u0010Ê\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010È\u0001j\u0005\u0018\u0001`É\u00018\u0016X\u0096\u0004ø\u0001\u0001¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ö\u0001"}, d2 = {"Lcom/discord/chat/reactevents/ChatViewEventHandler;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "node", "", "onLinkClicked-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "onLinkClicked", "", "url", "title", "onLinkClicked-u7_MRrM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/discord/primitives/UserId;", "userId", "onLongPressAvatar-x5gers8", "(Ljava/lang/String;J)V", "onLongPressAvatar", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/reactions/ReactionView$Reaction;", "reaction", "onLongPressReaction-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V", "onLongPressReaction", "onLongPressUsername-x5gers8", "onLongPressUsername", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onLongPressCommand", "Lcom/discord/chat/presentation/list/ScrollState;", "scrollState", "onScrollStateChanged", "Lcom/discord/chat/bridge/sticker/Sticker;", "sticker", "onStickerClicked-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", "onStickerClicked", "onStickerLongClicked-Ayv7vGE", "onStickerLongClicked", "onTapAvatar-x5gers8", "onTapAvatar", "", "messageFlags", "customId", "Lcom/discord/primitives/ApplicationId;", "applicationId", "", "indices", "onTapButtonActionComponent-NkFJqEg", "(Ljava/lang/String;JLjava/lang/String;J[I)V", "onTapButtonActionComponent", "onTapCall-pfaIj0E", "onTapCall", "guildId", "onTapChannel", "originalLink", "onLongPressChannel", "", "text", "onTapCopyText", "giftCode", "onTapGiftCodeAccept", "onTapGiftCodeEmbed", "onLinkLongClicked", "", "attachmentIndex", "type", "viewWidth", "viewHeight", "viewX", "viewY", "Lcom/discord/chat/reactevents/ViewResizeMode;", "viewResizeMode", "", "portal", "embedIndex", "onTapImage-a6FnO-k", "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V", "onTapImage", "index", "", "primary", "secondary", "onTapInviteEmbed-AFFcxXc", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "onTapInviteEmbed", "onTapLoadMessagesAfter", "onTapLoadMessagesBefore", "onTapMention", "onTapCommand", "originId", "onTapMessageReply-0eiqbug", "(JLjava/lang/String;)V", "onTapMessageReply", "summaryId", "onTapSummary-sekaTiM", "(JLjava/lang/String;Ljava/lang/String;)V", "onTapSummary", "isBurst", "onTapReaction-u7_MRrM", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V", "onTapReaction", "roleName", "roleIconSource", "onTapRoleIcon", "onTapSuppressNotificationsIcon", "roleId", "onTapConnectionsRoleTag", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "selectComponent", "onTapSelectActionComponent-u7_MRrM", "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V", "onTapSelectActionComponent", "timestamp", "onTapTimestamp", "onTapThreadEmbed-1xi1bu0", "(Ljava/lang/String;)V", "onTapThreadEmbed", "onTapToggleBlockedMessages-1xi1bu0", "onTapToggleBlockedMessages", "onTapUsername-x5gers8", "onTapUsername", "fileId", "onTapUploadProgressClose", "uploaderId", "itemId", "onTapCancelUploadItem", "onWelcomeReplyClicked-Ayv7vGE", "onWelcomeReplyClicked", "onTapInviteToSpeak-1xi1bu0", "onTapInviteToSpeak", "onTapJoinActivity-1xi1bu0", "onTapJoinActivity", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "emoji", "onTapEmoji", "onTapFollowForumPost-pfaIj0E", "onTapFollowForumPost", "Lcom/discord/primitives/GuildId;", "onTapShareForumPost-mgk6anA", "(JJ)V", "onTapShareForumPost", "onTapReactionOverflow-pfaIj0E", "onTapReactionOverflow", "onTapAutoModerationActions-pfaIj0E", "onTapAutoModerationActions", "onTapAutoModerationFeedback-pfaIj0E", "onTapAutoModerationFeedback", "onTapOpTag", "onTapSeeMore-1xi1bu0", "onTapSeeMore", "tagType", "onTapTag-Eqy5D80", "(Ljava/lang/String;JLjava/lang/String;)V", "onTapTag", "description", "onTapShowAltText", "onInitiateReply-pfaIj0E", "onInitiateReply", "", "totalDurationSecs", "startDurationSecs", "senderUserId", "voiceMessagePlaybackStarted-OuNwOLg", "(Ljava/lang/String;FFJ)V", "voiceMessagePlaybackStarted", "endDurationSecs", "durationListeningSecs", "voiceMessagePlaybackEnded-HuwN0RY", "(Ljava/lang/String;FFJF)V", "voiceMessagePlaybackEnded", "errorMessage", "voiceMessagePlaybackFailed-ntcYbpo", "(Ljava/lang/String;Ljava/lang/String;)V", "voiceMessagePlaybackFailed", "embeddedActivityKey", "onTapJoinEmbeddedActivity", "onTapDismissEmbeddedActivity", "onTapActivityLauncherEmbed-uU1mFKc", "onTapActivityLauncherEmbed", "parentChannelId", "threadId", "onTapPostPreviewEmbed-kUTrp-s", "(JJJLjava/lang/String;)V", "onTapPostPreviewEmbed", "onTapDismissMediaPostSharePrompt-1xi1bu0", "onTapDismissMediaPostSharePrompt", "Lkotlin/Function1;", "Lcom/discord/reactevents/ReactEvent;", "emitReactEvent", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function4;", "Lcom/discord/chat/bridge/MediaType;", "Lcom/discord/chat/presentation/events/MessageLongPress;", "onMessageLongPressed", "Lkotlin/jvm/functions/Function4;", "getOnMessageLongPressed", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/Function2;", "Lcom/discord/chat/presentation/events/MessageTapped;", "onMessageTapped", "Lkotlin/jvm/functions/Function2;", "getOnMessageTapped", "()Lkotlin/jvm/functions/Function2;", "Landroid/content/Context;", "context", "Lcom/discord/reactevents/ReactEvents;", "reactEvents", "Lkotlin/Function0;", "reactTag", "<init>", "(Landroid/content/Context;Lcom/discord/reactevents/ReactEvents;Lkotlin/jvm/functions/Function0;)V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public class ChatViewEventHandler implements ChatEventHandler {
    private final Function1<ReactEvent, Unit> emitReactEvent;
    private final Function4<MessageId, ChannelId, Integer, MediaType, Unit> onMessageLongPressed = new ChatViewEventHandler$onMessageLongPressed$1(this);
    private final Function2<MessageId, ChannelId, Unit> onMessageTapped = new ChatViewEventHandler$onMessageTapped$1(this);

    public ChatViewEventHandler(Context context, ReactEvents reactEvents, Function0<Integer> reactTag) {
        q.g(context, "context");
        q.g(reactEvents, "reactEvents");
        q.g(reactTag, "reactTag");
        this.emitReactEvent = new ChatViewEventHandler$emitReactEvent$1(reactEvents, context, reactTag);
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public Function4<MessageId, ChannelId, Integer, MediaType, Unit> getOnMessageLongPressed() {
        return this.onMessageLongPressed;
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public Function2<MessageId, ChannelId, Unit> getOnMessageTapped() {
        return this.onMessageTapped;
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onInitiateReply-pfaIj0E */
    public void mo148onInitiateReplypfaIj0E(String messageId, long j10) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new InitiateReplyData(messageId, j10, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onLinkClicked-ntcYbpo */
    public void mo149onLinkClickedntcYbpo(String messageId, LinkContentNode node) {
        q.g(messageId, "messageId");
        q.g(node, "node");
        this.emitReactEvent.invoke(new TapLinkData(messageId, node, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onLinkClicked-u7_MRrM */
    public void mo150onLinkClickedu7_MRrM(String messageId, String url, String str) {
        q.g(messageId, "messageId");
        q.g(url, "url");
        Function1<ReactEvent, Unit> function1 = this.emitReactEvent;
        if (str == null) {
            str = "";
        }
        function1.invoke(new TapLinkData(messageId, str, url, null, null, 24, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onLinkLongClicked(LinkContentNode node) {
        q.g(node, "node");
        this.emitReactEvent.invoke(new LongPressLinkData(node.getTarget()));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onLongPressAvatar-x5gers8 */
    public void mo151onLongPressAvatarx5gers8(String messageId, long j10) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressAvatarData(MessageId.m595toStringimpl(messageId), UserId.m634toStringimpl(j10)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onLongPressChannel(String channelId, String str, String str2, String str3) {
        q.g(channelId, "channelId");
        this.emitReactEvent.invoke(new LongPressChannelData(str, channelId, str2, str3));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onLongPressCommand(CommandMentionContentNode node) {
        q.g(node, "node");
        this.emitReactEvent.invoke(new LongPressCommandData(node));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onLongPressReaction-Eqy5D80 */
    public void mo152onLongPressReactionEqy5D80(String messageId, long j10, ReactionView.Reaction reaction) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressReactionData(messageId, j10, reaction, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onLongPressUsername-x5gers8 */
    public void mo153onLongPressUsernamex5gers8(String messageId, long j10) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressUsernameData(MessageId.m595toStringimpl(messageId), UserId.m634toStringimpl(j10)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onScrollStateChanged(ScrollState scrollState) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.g(scrollState, "scrollState");
        if (!scrollState.isNearBottom() || scrollState.getScrollDirection() != ScrollDirection.DOWN) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!scrollState.isNearTop() || scrollState.getScrollDirection() != ScrollDirection.UP) {
            z11 = false;
        } else {
            z11 = true;
        }
        Function1<ReactEvent, Unit> function1 = this.emitReactEvent;
        boolean isAtBottom = scrollState.isAtBottom();
        boolean isDragging = scrollState.isDragging();
        boolean isSettling = scrollState.isSettling();
        if (scrollState.isNearBottom() || scrollState.isAtBottom()) {
            z12 = false;
        } else {
            z12 = true;
        }
        function1.invoke(new ChatScrollPositionEvent(isAtBottom, z10, z11, isDragging, isSettling, z12, scrollState.isFirstMessageVisible(), scrollState.getFirstVisibleMessageIndex(), scrollState.getLastVisibleMessageIndex()));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onStickerClicked-Ayv7vGE */
    public void mo154onStickerClickedAyv7vGE(Sticker sticker, String messageId) {
        q.g(sticker, "sticker");
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapStickerData(sticker, messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onStickerLongClicked-Ayv7vGE */
    public void mo155onStickerLongClickedAyv7vGE(Sticker sticker, String messageId) {
        q.g(sticker, "sticker");
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressStickerData(messageId, sticker, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapActivityLauncherEmbed-uU1mFKc */
    public void mo156onTapActivityLauncherEmbeduU1mFKc(long j10, long j11) {
        this.emitReactEvent.invoke(new TapActivityLauncherEmbedData(ApplicationId.m557toStringimpl(j10), ChannelId.m570toStringimpl(j11)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapAutoModerationActions-pfaIj0E */
    public void mo157onTapAutoModerationActionspfaIj0E(String messageId, long j10) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAutoModerationActionsData(MessageId.m595toStringimpl(messageId), ChannelId.m570toStringimpl(j10)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapAutoModerationFeedback-pfaIj0E */
    public void mo158onTapAutoModerationFeedbackpfaIj0E(String messageId, long j10) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAutoModerationFeedbackData(MessageId.m595toStringimpl(messageId), ChannelId.m570toStringimpl(j10)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapAvatar-x5gers8 */
    public void mo159onTapAvatarx5gers8(String messageId, long j10) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAvatarData(MessageId.m595toStringimpl(messageId), UserId.m634toStringimpl(j10)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapButtonActionComponent-NkFJqEg */
    public void mo160onTapButtonActionComponentNkFJqEg(String messageId, long j10, String str, long j11, int[] indices) {
        q.g(messageId, "messageId");
        q.g(indices, "indices");
        this.emitReactEvent.invoke(new TapButtonActionComponent(messageId, j10, str, j11, indices, (DefaultConstructorMarker) null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapCall-pfaIj0E */
    public void mo161onTapCallpfaIj0E(String messageId, long j10) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapCallData(messageId, j10, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapCancelUploadItem(String uploaderId, String itemId) {
        q.g(uploaderId, "uploaderId");
        q.g(itemId, "itemId");
        this.emitReactEvent.invoke(new TapCancelUploadItemData(uploaderId, itemId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapChannel(String channelId, String str, String str2) {
        q.g(channelId, "channelId");
        this.emitReactEvent.invoke(new TapChannelData(str, channelId, str2));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapCommand(CommandMentionContentNode node) {
        q.g(node, "node");
        this.emitReactEvent.invoke(new TapCommandData(node));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapConnectionsRoleTag(String userId, String guildId, String channelId, String roleId) {
        q.g(userId, "userId");
        q.g(guildId, "guildId");
        q.g(channelId, "channelId");
        q.g(roleId, "roleId");
        this.emitReactEvent.invoke(new TapConnectionsRoleTagData(userId, guildId, channelId, roleId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapCopyText(CharSequence text) {
        q.g(text, "text");
        this.emitReactEvent.invoke(new TapCopyText(text));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapDismissEmbeddedActivity(String embeddedActivityKey) {
        q.g(embeddedActivityKey, "embeddedActivityKey");
        this.emitReactEvent.invoke(new TapDismissEmbeddedActivityData(embeddedActivityKey));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapDismissMediaPostSharePrompt-1xi1bu0 */
    public void mo162onTapDismissMediaPostSharePrompt1xi1bu0(String messageId) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapDismissMediaPostSharePromptData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapEmoji(EmojiContentNode emoji) {
        q.g(emoji, "emoji");
        this.emitReactEvent.invoke(new TapEmojiData(emoji));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapFollowForumPost-pfaIj0E */
    public void mo163onTapFollowForumPostpfaIj0E(String messageId, long j10) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapFollowForumPost(MessageId.m595toStringimpl(messageId), ChannelId.m570toStringimpl(j10)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapGiftCodeAccept(String giftCode) {
        q.g(giftCode, "giftCode");
        this.emitReactEvent.invoke(new TapGiftCodeAcceptData(giftCode));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapGiftCodeEmbed(String giftCode) {
        q.g(giftCode, "giftCode");
        this.emitReactEvent.invoke(new TapGiftCodeEmbedData(giftCode));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapImage-a6FnO-k */
    public void mo164onTapImagea6FnOk(String messageId, int i10, String type, int i11, int i12, int i13, int i14, ViewResizeMode viewResizeMode, Double d10, Integer num) {
        q.g(messageId, "messageId");
        q.g(type, "type");
        q.g(viewResizeMode, "viewResizeMode");
        this.emitReactEvent.invoke(new TapImageData(MessageId.m595toStringimpl(messageId), i10, type, new TapImageData.Layout(i11, i12, i13, i14, viewResizeMode), d10, num));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapInviteEmbed-AFFcxXc */
    public void mo165onTapInviteEmbedAFFcxXc(String messageId, int i10, Boolean bool, Boolean bool2) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapInviteEvent(messageId, i10, bool, bool2));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapInviteToSpeak-1xi1bu0 */
    public void mo166onTapInviteToSpeak1xi1bu0(String messageId) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapInviteToSpeakData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapJoinActivity-1xi1bu0 */
    public void mo167onTapJoinActivity1xi1bu0(String messageId) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapJoinActivityData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapJoinEmbeddedActivity(String embeddedActivityKey) {
        q.g(embeddedActivityKey, "embeddedActivityKey");
        this.emitReactEvent.invoke(new TapJoinEmbeddedActivityData(embeddedActivityKey));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapLoadMessagesAfter() {
        this.emitReactEvent.invoke(new TapSeparatorData("load_more_after", null, 2, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapLoadMessagesBefore() {
        this.emitReactEvent.invoke(new TapSeparatorData("load_more_before", null, 2, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapMention(String userId, String channelId) {
        q.g(userId, "userId");
        q.g(channelId, "channelId");
        this.emitReactEvent.invoke(new TapMentionData(userId, channelId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapMessageReply-0eiqbug */
    public void mo168onTapMessageReply0eiqbug(long j10, String originId) {
        q.g(originId, "originId");
        this.emitReactEvent.invoke(new TapMessageReplyData(ChannelId.m570toStringimpl(j10), MessageId.m595toStringimpl(originId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapOpTag() {
        this.emitReactEvent.invoke(TapOpTagData.INSTANCE);
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapPostPreviewEmbed-kUTrp-s */
    public void mo169onTapPostPreviewEmbedkUTrps(long j10, long j11, long j12, String messageId) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapPostPreviewEmbedData(GuildId.m583toStringimpl(j10), ChannelId.m570toStringimpl(j11), ChannelId.m570toStringimpl(j12), messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapReaction-u7_MRrM */
    public void mo170onTapReactionu7_MRrM(String messageId, ReactionView.Reaction reaction, Boolean bool) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapReactionData(messageId, reaction, bool, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapReactionOverflow-pfaIj0E */
    public void mo171onTapReactionOverflowpfaIj0E(String messageId, long j10) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapReactionOverflow(MessageId.m595toStringimpl(messageId), ChannelId.m570toStringimpl(j10)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapRoleIcon(String roleName, String roleIconSource) {
        q.g(roleName, "roleName");
        q.g(roleIconSource, "roleIconSource");
        this.emitReactEvent.invoke(new TapRoleIconData(roleName, roleIconSource));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapSeeMore-1xi1bu0 */
    public void mo172onTapSeeMore1xi1bu0(String messageId) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapSeeMoreData(messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapSelectActionComponent-u7_MRrM */
    public void mo173onTapSelectActionComponentu7_MRrM(String messageId, long j10, SelectComponent selectComponent) {
        q.g(messageId, "messageId");
        q.g(selectComponent, "selectComponent");
        this.emitReactEvent.invoke(new TapSelectActionComponent(messageId, j10, selectComponent, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapShareForumPost-mgk6anA */
    public void mo174onTapShareForumPostmgk6anA(long j10, long j11) {
        this.emitReactEvent.invoke(new TapShareForumPost(ChannelId.m570toStringimpl(j10), GuildId.m583toStringimpl(j11)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapShowAltText(String description) {
        q.g(description, "description");
        this.emitReactEvent.invoke(new TapShowAltTextData(description));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapSummary-sekaTiM */
    public void mo175onTapSummarysekaTiM(long j10, String messageId, String summaryId) {
        q.g(messageId, "messageId");
        q.g(summaryId, "summaryId");
        this.emitReactEvent.invoke(new TapSummaryData(ChannelId.m570toStringimpl(j10), MessageId.m595toStringimpl(messageId), summaryId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapSuppressNotificationsIcon() {
        this.emitReactEvent.invoke(TapSuppressNotificationsIconData.INSTANCE);
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapTag-Eqy5D80 */
    public void mo176onTapTagEqy5D80(String messageId, long j10, String str) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapTagData(messageId, j10, str, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapThreadEmbed-1xi1bu0 */
    public void mo177onTapThreadEmbed1xi1bu0(String messageId) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapThreadEmbedEvent(messageId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapTimestamp(String timestamp) {
        q.g(timestamp, "timestamp");
        this.emitReactEvent.invoke(new TapTimestampEvent(timestamp));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapToggleBlockedMessages-1xi1bu0 */
    public void mo178onTapToggleBlockedMessages1xi1bu0(String messageId) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapSeparatorData("toggle", MessageId.m595toStringimpl(messageId)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    public void onTapUploadProgressClose(String fileId) {
        q.g(fileId, "fileId");
        this.emitReactEvent.invoke(new TapUploadProgressCloseData(fileId));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onTapUsername-x5gers8 */
    public void mo179onTapUsernamex5gers8(String messageId, long j10) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapUsernameData(MessageId.m595toStringimpl(messageId), UserId.m634toStringimpl(j10)));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: onWelcomeReplyClicked-Ayv7vGE */
    public void mo180onWelcomeReplyClickedAyv7vGE(Sticker sticker, String messageId) {
        q.g(sticker, "sticker");
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new TapWelcomeReplyData(sticker.getId(), messageId, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: voiceMessagePlaybackEnded-HuwN0RY */
    public void mo181voiceMessagePlaybackEndedHuwN0RY(String messageId, float f10, float f11, long j10, float f12) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new VoiceMessagePlaybackEndedData(messageId, f10, f11, j10, f12, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: voiceMessagePlaybackFailed-ntcYbpo */
    public void mo182voiceMessagePlaybackFailedntcYbpo(String messageId, String str) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new VoiceMessagePlaybackFailedData(messageId, str, null));
    }

    @Override // com.discord.chat.presentation.events.ChatEventHandler
    /* renamed from: voiceMessagePlaybackStarted-OuNwOLg */
    public void mo183voiceMessagePlaybackStartedOuNwOLg(String messageId, float f10, float f11, long j10) {
        q.g(messageId, "messageId");
        this.emitReactEvent.invoke(new VoiceMessagePlaybackStartedData(messageId, f10, f11, j10, null));
    }
}
