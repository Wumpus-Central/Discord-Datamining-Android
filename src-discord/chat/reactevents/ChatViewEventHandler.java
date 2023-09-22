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

@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\u0010â\u0001\u001a\u00030á\u0001\u0012\b\u0010ä\u0001\u001a\u00030ã\u0001\u0012\u000e\u0010æ\u0001\u001a\t\u0012\u0004\u0012\u00020D0å\u0001¢\u0006\u0006\bç\u0001\u0010è\u0001J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016J%\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010%J%\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010\u0012J?\u00104\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\n2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J%\u00106\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010\u0012J$\u00108\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0016J.\u0010:\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n2\b\u00109\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0016J'\u0010A\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\nH\u0016J\u0010\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016Ji\u0010R\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020D2\u0006\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020D2\u0006\u0010J\u001a\u00020D2\u0006\u0010L\u001a\u00020K2\b\u0010N\u001a\u0004\u0018\u00010M2\b\u0010O\u001a\u0004\u0018\u00010DH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QJ9\u0010Y\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010S\u001a\u00020D2\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010V\u001a\u0004\u0018\u00010TH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010XJ\b\u0010Z\u001a\u00020\u0006H\u0016J\b\u0010[\u001a\u00020\u0006H\u0016J\u0018\u0010\\\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010]\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001dH\u0016J%\u0010a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010^\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b_\u0010`J-\u0010e\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bc\u0010dJ-\u0010g\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010dJ1\u0010k\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010h\u001a\u0004\u0018\u00010TH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bi\u0010jJ\u0018\u0010n\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\n2\u0006\u0010m\u001a\u00020\nH\u0016J\b\u0010o\u001a\u00020\u0006H\u0016J(\u0010q\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010p\u001a\u00020\nH\u0016J-\u0010v\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010s\u001a\u00020rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bt\u0010uJ\u0010\u0010x\u001a\u00020\u00062\u0006\u0010w\u001a\u00020\nH\u0016J\u001d\u0010{\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\by\u0010zJ\u001d\u0010}\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b|\u0010zJ%\u0010\u007f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u0012J\u0012\u0010\u0081\u0001\u001a\u00020\u00062\u0007\u0010\u0080\u0001\u001a\u00020\nH\u0016J\u001b\u0010\u0084\u0001\u001a\u00020\u00062\u0007\u0010\u0082\u0001\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020\nH\u0016J'\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0085\u0001\u0010%J\u001f\u0010\u0088\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0087\u0001\u0010zJ\u001f\u0010\u008a\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0089\u0001\u0010zJ\u0013\u0010\u008d\u0001\u001a\u00020\u00062\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0016J'\u0010\u008f\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008e\u0001\u0010\u0012J)\u0010\u0093\u0001\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0007\u00107\u001a\u00030\u0090\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J'\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0094\u0001\u0010\u0012J'\u0010\u0097\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0096\u0001\u0010\u0012J'\u0010\u0099\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0098\u0001\u0010\u0012J\t\u0010\u009a\u0001\u001a\u00020\u0006H\u0016J\u001f\u0010\u009c\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009b\u0001\u0010zJ3\u0010 \u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001f\u0010¢\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¡\u0001\u0010zJ\u0012\u0010¤\u0001\u001a\u00020\u00062\u0007\u0010£\u0001\u001a\u00020\nH\u0016J'\u0010¦\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¥\u0001\u0010\u0012J'\u0010¨\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b§\u0001\u0010\u0012J=\u0010¯\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010ª\u0001\u001a\u00030©\u00012\b\u0010«\u0001\u001a\u00030©\u00012\u0007\u0010¬\u0001\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001JG\u0010´\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010ª\u0001\u001a\u00030©\u00012\b\u0010°\u0001\u001a\u00030©\u00012\u0007\u0010¬\u0001\u001a\u00020\u000f2\b\u0010±\u0001\u001a\u00030©\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001J*\u0010·\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010µ\u0001\u001a\u0004\u0018\u00010\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¶\u0001\u0010@J\u0012\u0010¹\u0001\u001a\u00020\u00062\u0007\u0010¸\u0001\u001a\u00020\nH\u0016J\u0012\u0010º\u0001\u001a\u00020\u00062\u0007\u0010¸\u0001\u001a\u00020\nH\u0016J(\u0010¼\u0001\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b»\u0001\u0010\u0092\u0001J;\u0010Á\u0001\u001a\u00020\u00062\u0007\u00107\u001a\u00030\u0090\u00012\u0007\u0010½\u0001\u001a\u00020\u00142\u0007\u0010¾\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u001f\u0010Ã\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\bÂ\u0001\u0010zJ1\u0010Æ\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0007\u0010Ä\u0001\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÅ\u0001\u0010\u009f\u0001J>\u0010Ë\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\t\u0010Ç\u0001\u001a\u0004\u0018\u00010\n2\t\u0010È\u0001\u001a\u0004\u0018\u00010\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u001b\u0010Î\u0001\u001a\u00020\u00062\u0007\u0010Ì\u0001\u001a\u00020D2\u0007\u0010Í\u0001\u001a\u00020DH\u0016J\t\u0010Ï\u0001\u001a\u00020\u0006H\u0016R%\u0010Ò\u0001\u001a\u0010\u0012\u0005\u0012\u00030Ñ\u0001\u0012\u0004\u0012\u00020\u00060Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001RO\u0010×\u0001\u001a/\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0007\u0012\u0005\u0018\u00010Õ\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010Ô\u0001j\u0005\u0018\u0001`Ö\u00018\u0016X\u0096\u0004ø\u0001\u0001¢\u0006\u0010\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R>\u0010Ý\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010Û\u0001j\u0005\u0018\u0001`Ü\u00018\u0016X\u0096\u0004ø\u0001\u0001¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006é\u0001"}, d2 = {"Lcom/discord/chat/reactevents/ChatViewEventHandler;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "node", "", "onLinkClicked-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "onLinkClicked", "", "url", "title", "onLinkClicked-u7_MRrM", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/discord/primitives/UserId;", "userId", "onLongPressAvatar-x5gers8", "(Ljava/lang/String;J)V", "onLongPressAvatar", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/reactions/ReactionView$Reaction;", "reaction", "onLongPressReaction-Eqy5D80", "(Ljava/lang/String;JLcom/discord/reactions/ReactionView$Reaction;)V", "onLongPressReaction", "onLongPressUsername-x5gers8", "onLongPressUsername", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onLongPressCommand", "Lcom/discord/chat/presentation/list/ScrollState;", "scrollState", "onScrollStateChanged", "Lcom/discord/chat/bridge/sticker/Sticker;", "sticker", "onStickerClicked-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", "onStickerClicked", "onStickerLongClicked-Ayv7vGE", "onStickerLongClicked", "onTapAvatar-x5gers8", "onTapAvatar", "", "messageFlags", "customId", "Lcom/discord/primitives/ApplicationId;", "applicationId", "", "indices", "onTapButtonActionComponent-NkFJqEg", "(Ljava/lang/String;JLjava/lang/String;J[I)V", "onTapButtonActionComponent", "onTapCall-pfaIj0E", "onTapCall", "guildId", "onTapChannel", "originalLink", "onLongPressChannel", "", "text", "onTapCopyText", "giftCode", "onTapGiftCodeAccept-NU4t8f8", "(Ljava/lang/String;Ljava/lang/String;)V", "onTapGiftCodeAccept", "onTapGiftCodeEmbed", "onLinkLongClicked", "", "attachmentIndex", "type", "viewWidth", "viewHeight", "viewX", "viewY", "Lcom/discord/chat/reactevents/ViewResizeMode;", "viewResizeMode", "", "portal", "embedIndex", "onTapImage-a6FnO-k", "(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V", "onTapImage", "index", "", "primary", "secondary", "onTapInviteEmbed-AFFcxXc", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;)V", "onTapInviteEmbed", "onTapLoadMessagesAfter", "onTapLoadMessagesBefore", "onTapMention", "onTapCommand", "originId", "onTapMessageReply-0eiqbug", "(JLjava/lang/String;)V", "onTapMessageReply", "summaryId", "onTapSummary-sekaTiM", "(JLjava/lang/String;Ljava/lang/String;)V", "onTapSummary", "onTapSummaryJump-sekaTiM", "onTapSummaryJump", "isBurst", "onTapReaction-u7_MRrM", "(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V", "onTapReaction", "roleName", "roleIconSource", "onTapRoleIcon", "onTapSuppressNotificationsIcon", "roleId", "onTapConnectionsRoleTag", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "selectComponent", "onTapSelectActionComponent-u7_MRrM", "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)V", "onTapSelectActionComponent", "timestamp", "onTapTimestamp", "onTapThreadEmbed-1xi1bu0", "(Ljava/lang/String;)V", "onTapThreadEmbed", "onTapToggleBlockedMessages-1xi1bu0", "onTapToggleBlockedMessages", "onTapUsername-x5gers8", "onTapUsername", "fileId", "onTapUploadProgressClose", "uploaderId", "itemId", "onTapCancelUploadItem", "onWelcomeReplyClicked-Ayv7vGE", "onWelcomeReplyClicked", "onTapInviteToSpeak-1xi1bu0", "onTapInviteToSpeak", "onTapJoinActivity-1xi1bu0", "onTapJoinActivity", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "emoji", "onTapEmoji", "onTapFollowForumPost-pfaIj0E", "onTapFollowForumPost", "Lcom/discord/primitives/GuildId;", "onTapShareForumPost-mgk6anA", "(JJ)V", "onTapShareForumPost", "onTapReactionOverflow-pfaIj0E", "onTapReactionOverflow", "onTapAutoModerationActions-pfaIj0E", "onTapAutoModerationActions", "onTapAutoModerationFeedback-pfaIj0E", "onTapAutoModerationFeedback", "onTapOpTag", "onTapSeeMore-1xi1bu0", "onTapSeeMore", "tagType", "onTapTag-Eqy5D80", "(Ljava/lang/String;JLjava/lang/String;)V", "onTapTag", "onTapRemix-1xi1bu0", "onTapRemix", "description", "onTapShowAltText", "onInitiateReply-pfaIj0E", "onInitiateReply", "onInitiateEdit-pfaIj0E", "onInitiateEdit", "", "totalDurationSecs", "startDurationSecs", "senderUserId", "voiceMessagePlaybackStarted-OuNwOLg", "(Ljava/lang/String;FFJ)V", "voiceMessagePlaybackStarted", "endDurationSecs", "durationListeningSecs", "voiceMessagePlaybackEnded-HuwN0RY", "(Ljava/lang/String;FFJF)V", "voiceMessagePlaybackEnded", "errorMessage", "voiceMessagePlaybackFailed-ntcYbpo", "voiceMessagePlaybackFailed", "embeddedActivityKey", "onTapJoinEmbeddedActivity", "onTapDismissEmbeddedActivity", "onTapActivityBookmarkEmbed-uU1mFKc", "onTapActivityBookmarkEmbed", "parentChannelId", "threadId", "onTapPostPreviewEmbed-kUTrp-s", "(JJJLjava/lang/String;)V", "onTapPostPreviewEmbed", "onTapDismissMediaPostSharePrompt-1xi1bu0", "onTapDismissMediaPostSharePrompt", "buttonType", "onTapChannelPromptButton-Eqy5D80", "onTapChannelPromptButton", "attachmentId", "embedId", "onTapObscuredMediaLearnMore-8a0ehIg", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "onTapObscuredMediaLearnMore", "firstVisibleMessageIndex", "lastVisibleMessageIndex", "onFirstLayout", "onCompleteFirstLayout", "Lkotlin/Function1;", "Lcom/discord/reactevents/ReactEvent;", "emitReactEvent", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function4;", "Lcom/discord/chat/bridge/MediaType;", "Lcom/discord/chat/presentation/events/MessageLongPress;", "onMessageLongPressed", "Lkotlin/jvm/functions/Function4;", "getOnMessageLongPressed", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/Function2;", "Lcom/discord/chat/presentation/events/MessageTapped;", "onMessageTapped", "Lkotlin/jvm/functions/Function2;", "getOnMessageTapped", "()Lkotlin/jvm/functions/Function2;", "Landroid/content/Context;", "context", "Lcom/discord/reactevents/ReactEvents;", "reactEvents", "Lkotlin/Function0;", "reactTag", "<init>", "(Landroid/content/Context;Lcom/discord/reactevents/ReactEvents;Lkotlin/jvm/functions/Function0;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public class ChatViewEventHandler implements ChatEventHandler {
    private final Function1<ReactEvent, Unit> emitReactEvent;
    private final Function4<MessageId, ChannelId, Integer, MediaType, Unit> onMessageLongPressed = new ChatViewEventHandler$onMessageLongPressed$1(this);
    private final Function2<MessageId, ChannelId, Unit> onMessageTapped = new ChatViewEventHandler$onMessageTapped$1(this);

    public ChatViewEventHandler(Context context, ReactEvents reactEvents, Function0<Integer> reactTag) {
        q.h(context, "context");
        q.h(reactEvents, "reactEvents");
        q.h(reactTag, "reactTag");
        this.emitReactEvent = new ChatViewEventHandler$emitReactEvent$1(reactEvents, context, reactTag);
    }

    @Override 
    public Function4<MessageId, ChannelId, Integer, MediaType, Unit> getOnMessageLongPressed() {
        return this.onMessageLongPressed;
    }

    @Override 
    public Function2<MessageId, ChannelId, Unit> getOnMessageTapped() {
        return this.onMessageTapped;
    }

    @Override 
    public void onCompleteFirstLayout() {
        this.emitReactEvent.invoke(new CompleteFirstLayoutData());
    }

    @Override 
    public void onFirstLayout(int i10, int i11) {
        this.emitReactEvent.invoke(new FirstLayoutData(i10, i11));
    }

    @Override 
    
    public void mo157onInitiateEditpfaIj0E(String messageId, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new InitiateEditData(messageId, j10, null));
    }

    @Override 
    
    public void mo158onInitiateReplypfaIj0E(String messageId, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new InitiateReplyData(messageId, j10, null));
    }

    @Override 
    
    public void mo159onLinkClickedntcYbpo(String messageId, LinkContentNode node) {
        q.h(messageId, "messageId");
        q.h(node, "node");
        this.emitReactEvent.invoke(new TapLinkData(messageId, node, null));
    }

    @Override 
    
    public void mo160onLinkClickedu7_MRrM(String messageId, String url, String str) {
        q.h(messageId, "messageId");
        q.h(url, "url");
        Function1<ReactEvent, Unit> function1 = this.emitReactEvent;
        if (str == null) {
            str = "";
        }
        function1.invoke(new TapLinkData(messageId, str, url, null, null, 24, null));
    }

    @Override 
    public void onLinkLongClicked(LinkContentNode node) {
        q.h(node, "node");
        this.emitReactEvent.invoke(new LongPressLinkData(node.getTarget()));
    }

    @Override 
    
    public void mo161onLongPressAvatarx5gers8(String messageId, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressAvatarData(MessageId.m642toStringimpl(messageId), UserId.m681toStringimpl(j10)));
    }

    @Override 
    public void onLongPressChannel(String channelId, String str, String str2, String str3) {
        q.h(channelId, "channelId");
        this.emitReactEvent.invoke(new LongPressChannelData(str, channelId, str2, str3));
    }

    @Override 
    public void onLongPressCommand(CommandMentionContentNode node) {
        q.h(node, "node");
        this.emitReactEvent.invoke(new LongPressCommandData(node));
    }

    @Override 
    
    public void mo162onLongPressReactionEqy5D80(String messageId, long j10, ReactionView.Reaction reaction) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressReactionData(messageId, j10, reaction, null));
    }

    @Override 
    
    public void mo163onLongPressUsernamex5gers8(String messageId, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressUsernameData(MessageId.m642toStringimpl(messageId), UserId.m681toStringimpl(j10)));
    }

    @Override 
    public void onScrollStateChanged(ScrollState scrollState) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.h(scrollState, "scrollState");
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

    @Override 
    
    public void mo164onStickerClickedAyv7vGE(Sticker sticker, String messageId) {
        q.h(sticker, "sticker");
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapStickerData(sticker, messageId, null));
    }

    @Override 
    
    public void mo165onStickerLongClickedAyv7vGE(Sticker sticker, String messageId) {
        q.h(sticker, "sticker");
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new LongPressStickerData(messageId, sticker, null));
    }

    @Override 
    
    public void mo166onTapActivityBookmarkEmbeduU1mFKc(long j10, long j11) {
        this.emitReactEvent.invoke(new TapActivityBookmarkEmbedData(ApplicationId.m604toStringimpl(j10), ChannelId.m617toStringimpl(j11)));
    }

    @Override 
    
    public void mo167onTapAutoModerationActionspfaIj0E(String messageId, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAutoModerationActionsData(MessageId.m642toStringimpl(messageId), ChannelId.m617toStringimpl(j10)));
    }

    @Override 
    
    public void mo168onTapAutoModerationFeedbackpfaIj0E(String messageId, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAutoModerationFeedbackData(MessageId.m642toStringimpl(messageId), ChannelId.m617toStringimpl(j10)));
    }

    @Override 
    
    public void mo169onTapAvatarx5gers8(String messageId, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapAvatarData(MessageId.m642toStringimpl(messageId), UserId.m681toStringimpl(j10)));
    }

    @Override 
    
    public void mo170onTapButtonActionComponentNkFJqEg(String messageId, long j10, String str, long j11, int[] indices) {
        q.h(messageId, "messageId");
        q.h(indices, "indices");
        this.emitReactEvent.invoke(new TapButtonActionComponent(messageId, j10, str, j11, indices, (DefaultConstructorMarker) null));
    }

    @Override 
    
    public void mo171onTapCallpfaIj0E(String messageId, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapCallData(messageId, j10, null));
    }

    @Override 
    public void onTapCancelUploadItem(String uploaderId, String itemId) {
        q.h(uploaderId, "uploaderId");
        q.h(itemId, "itemId");
        this.emitReactEvent.invoke(new TapCancelUploadItemData(uploaderId, itemId));
    }

    @Override 
    public void onTapChannel(String channelId, String str, String str2) {
        q.h(channelId, "channelId");
        this.emitReactEvent.invoke(new TapChannelData(str, channelId, str2));
    }

    @Override 
    
    public void mo172onTapChannelPromptButtonEqy5D80(String messageId, long j10, String buttonType) {
        q.h(messageId, "messageId");
        q.h(buttonType, "buttonType");
        this.emitReactEvent.invoke(new TapChannelPromptButtonData(MessageId.m642toStringimpl(messageId), ChannelId.m617toStringimpl(j10), buttonType));
    }

    @Override 
    public void onTapCommand(CommandMentionContentNode node) {
        q.h(node, "node");
        this.emitReactEvent.invoke(new TapCommandData(node));
    }

    @Override 
    public void onTapConnectionsRoleTag(String userId, String guildId, String channelId, String roleId) {
        q.h(userId, "userId");
        q.h(guildId, "guildId");
        q.h(channelId, "channelId");
        q.h(roleId, "roleId");
        this.emitReactEvent.invoke(new TapConnectionsRoleTagData(userId, guildId, channelId, roleId));
    }

    @Override 
    public void onTapCopyText(CharSequence text) {
        q.h(text, "text");
        this.emitReactEvent.invoke(new TapCopyText(text));
    }

    @Override 
    public void onTapDismissEmbeddedActivity(String embeddedActivityKey) {
        q.h(embeddedActivityKey, "embeddedActivityKey");
        this.emitReactEvent.invoke(new TapDismissEmbeddedActivityData(embeddedActivityKey));
    }

    @Override 
    
    public void mo173onTapDismissMediaPostSharePrompt1xi1bu0(String messageId) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapDismissMediaPostSharePromptData(messageId, null));
    }

    @Override 
    public void onTapEmoji(EmojiContentNode emoji) {
        q.h(emoji, "emoji");
        this.emitReactEvent.invoke(new TapEmojiData(emoji));
    }

    @Override 
    
    public void mo174onTapFollowForumPostpfaIj0E(String messageId, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapFollowForumPost(MessageId.m642toStringimpl(messageId), ChannelId.m617toStringimpl(j10)));
    }

    @Override 
    
    public void mo175onTapGiftCodeAcceptNU4t8f8(String giftCode, String str) {
        q.h(giftCode, "giftCode");
        this.emitReactEvent.invoke(new TapGiftCodeAcceptData(giftCode, str, null));
    }

    @Override 
    public void onTapGiftCodeEmbed(String giftCode) {
        q.h(giftCode, "giftCode");
        this.emitReactEvent.invoke(new TapGiftCodeEmbedData(giftCode));
    }

    @Override 
    
    public void mo176onTapImagea6FnOk(String messageId, int i10, String type, int i11, int i12, int i13, int i14, ViewResizeMode viewResizeMode, Double d10, Integer num) {
        q.h(messageId, "messageId");
        q.h(type, "type");
        q.h(viewResizeMode, "viewResizeMode");
        this.emitReactEvent.invoke(new TapImageData(MessageId.m642toStringimpl(messageId), i10, type, new TapImageData.Layout(i11, i12, i13, i14, viewResizeMode), d10, num));
    }

    @Override 
    
    public void mo177onTapInviteEmbedAFFcxXc(String messageId, int i10, Boolean bool, Boolean bool2) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapInviteEvent(messageId, i10, bool, bool2));
    }

    @Override 
    
    public void mo178onTapInviteToSpeak1xi1bu0(String messageId) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapInviteToSpeakData(messageId, null));
    }

    @Override 
    
    public void mo179onTapJoinActivity1xi1bu0(String messageId) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapJoinActivityData(messageId, null));
    }

    @Override 
    public void onTapJoinEmbeddedActivity(String embeddedActivityKey) {
        q.h(embeddedActivityKey, "embeddedActivityKey");
        this.emitReactEvent.invoke(new TapJoinEmbeddedActivityData(embeddedActivityKey));
    }

    @Override 
    public void onTapLoadMessagesAfter() {
        this.emitReactEvent.invoke(new TapSeparatorData("load_more_after", null, 2, null));
    }

    @Override 
    public void onTapLoadMessagesBefore() {
        this.emitReactEvent.invoke(new TapSeparatorData("load_more_before", null, 2, null));
    }

    @Override 
    public void onTapMention(String userId, String channelId) {
        q.h(userId, "userId");
        q.h(channelId, "channelId");
        this.emitReactEvent.invoke(new TapMentionData(userId, channelId));
    }

    @Override 
    
    public void mo180onTapMessageReply0eiqbug(long j10, String originId) {
        q.h(originId, "originId");
        this.emitReactEvent.invoke(new TapMessageReplyData(ChannelId.m617toStringimpl(j10), MessageId.m642toStringimpl(originId)));
    }

    @Override 
    
    public void mo181onTapObscuredMediaLearnMore8a0ehIg(String messageId, long j10, String str, String str2) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapObscuredMediaLearnMoreData(MessageId.m642toStringimpl(messageId), ChannelId.m617toStringimpl(j10), String.valueOf(str), String.valueOf(str2)));
    }

    @Override 
    public void onTapOpTag() {
        this.emitReactEvent.invoke(TapOpTagData.INSTANCE);
    }

    @Override 
    
    public void mo182onTapPostPreviewEmbedkUTrps(long j10, long j11, long j12, String messageId) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapPostPreviewEmbedData(GuildId.m630toStringimpl(j10), ChannelId.m617toStringimpl(j11), ChannelId.m617toStringimpl(j12), messageId, null));
    }

    @Override 
    
    public void mo183onTapReactionu7_MRrM(String messageId, ReactionView.Reaction reaction, Boolean bool) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapReactionData(messageId, reaction, bool, null));
    }

    @Override 
    
    public void mo184onTapReactionOverflowpfaIj0E(String messageId, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapReactionOverflow(MessageId.m642toStringimpl(messageId), ChannelId.m617toStringimpl(j10)));
    }

    @Override 
    
    public void mo185onTapRemix1xi1bu0(String messageId) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapRemixData(messageId, null));
    }

    @Override 
    public void onTapRoleIcon(String roleName, String roleIconSource) {
        q.h(roleName, "roleName");
        q.h(roleIconSource, "roleIconSource");
        this.emitReactEvent.invoke(new TapRoleIconData(roleName, roleIconSource));
    }

    @Override 
    
    public void mo186onTapSeeMore1xi1bu0(String messageId) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapSeeMoreData(messageId, null));
    }

    @Override 
    
    public void mo187onTapSelectActionComponentu7_MRrM(String messageId, long j10, SelectComponent selectComponent) {
        q.h(messageId, "messageId");
        q.h(selectComponent, "selectComponent");
        this.emitReactEvent.invoke(new TapSelectActionComponent(messageId, j10, selectComponent, null));
    }

    @Override 
    
    public void mo188onTapShareForumPostmgk6anA(long j10, long j11) {
        this.emitReactEvent.invoke(new TapShareForumPost(ChannelId.m617toStringimpl(j10), GuildId.m630toStringimpl(j11)));
    }

    @Override 
    public void onTapShowAltText(String description) {
        q.h(description, "description");
        this.emitReactEvent.invoke(new TapShowAltTextData(description));
    }

    @Override 
    
    public void mo189onTapSummarysekaTiM(long j10, String messageId, String summaryId) {
        q.h(messageId, "messageId");
        q.h(summaryId, "summaryId");
        this.emitReactEvent.invoke(new TapSummaryData(ChannelId.m617toStringimpl(j10), MessageId.m642toStringimpl(messageId), summaryId));
    }

    @Override 
    
    public void mo190onTapSummaryJumpsekaTiM(long j10, String messageId, String summaryId) {
        q.h(messageId, "messageId");
        q.h(summaryId, "summaryId");
        this.emitReactEvent.invoke(new TapSummaryJumpData(ChannelId.m617toStringimpl(j10), MessageId.m642toStringimpl(messageId), summaryId));
    }

    @Override 
    public void onTapSuppressNotificationsIcon() {
        this.emitReactEvent.invoke(TapSuppressNotificationsIconData.INSTANCE);
    }

    @Override 
    
    public void mo191onTapTagEqy5D80(String messageId, long j10, String str) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapTagData(messageId, j10, str, null));
    }

    @Override 
    
    public void mo192onTapThreadEmbed1xi1bu0(String messageId) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapThreadEmbedEvent(messageId));
    }

    @Override 
    public void onTapTimestamp(String timestamp) {
        q.h(timestamp, "timestamp");
        this.emitReactEvent.invoke(new TapTimestampEvent(timestamp));
    }

    @Override 
    
    public void mo193onTapToggleBlockedMessages1xi1bu0(String messageId) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapSeparatorData("toggle", MessageId.m642toStringimpl(messageId)));
    }

    @Override 
    public void onTapUploadProgressClose(String fileId) {
        q.h(fileId, "fileId");
        this.emitReactEvent.invoke(new TapUploadProgressCloseData(fileId));
    }

    @Override 
    
    public void mo194onTapUsernamex5gers8(String messageId, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapUsernameData(MessageId.m642toStringimpl(messageId), UserId.m681toStringimpl(j10)));
    }

    @Override 
    
    public void mo195onWelcomeReplyClickedAyv7vGE(Sticker sticker, String messageId) {
        q.h(sticker, "sticker");
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new TapWelcomeReplyData(sticker.getId(), messageId, null));
    }

    @Override 
    
    public void mo196voiceMessagePlaybackEndedHuwN0RY(String messageId, float f10, float f11, long j10, float f12) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new VoiceMessagePlaybackEndedData(messageId, f10, f11, j10, f12, null));
    }

    @Override 
    
    public void mo197voiceMessagePlaybackFailedntcYbpo(String messageId, String str) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new VoiceMessagePlaybackFailedData(messageId, str, null));
    }

    @Override 
    
    public void mo198voiceMessagePlaybackStartedOuNwOLg(String messageId, float f10, float f11, long j10) {
        q.h(messageId, "messageId");
        this.emitReactEvent.invoke(new VoiceMessagePlaybackStartedData(messageId, f10, f11, j10, null));
    }
}
