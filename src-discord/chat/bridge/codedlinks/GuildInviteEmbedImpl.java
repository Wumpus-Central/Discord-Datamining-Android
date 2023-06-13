package com.discord.chat.bridge.codedlinks;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.codedlinks.InviteType;
import com.facebook.react.uimanager.ViewProps;
import j$.util.Spliterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.a2;
import yj.h;
import yj.m0;
import yj.n1;

@f
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u007f2\u00020\u00012\u00020\u0002:\u0002~\u007fBÉ\u0002\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010\t\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\t\u0012\b\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0002\u0010)Bí\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010*J\t\u0010Q\u001a\u00020\u0004HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010T\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010U\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010X\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010[\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010,J\t\u0010\\\u001a\u00020\u0004HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010^\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010_\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010g\u001a\u00020\u0004HÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010i\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010k\u001a\u00020\u000bHÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010m\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010o\u001a\u0004\u0018\u00010\tHÆ\u0003Jú\u0002\u0010p\u001a\u00020\u00002\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\u00132\b\u0010s\u001a\u0004\u0018\u00010tHÖ\u0003J\t\u0010u\u001a\u00020\u0004HÖ\u0001J\t\u0010v\u001a\u00020\tHÖ\u0001J!\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020\u00002\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020}HÇ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0018\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b.\u0010,R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b/\u0010,R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b5\u0010,R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b<\u00108R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00101R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00101R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\bB\u0010,R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\bC\u0010,R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\bD\u00108R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\bE\u0010,R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00101R\u0018\u0010 \u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\bH\u0010,R\u0018\u0010!\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\bI\u0010,R\u0018\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\bJ\u0010,R\u0016\u0010#\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00101R\u0016\u0010$\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0018\u0010%\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\bM\u0010,R\u0016\u0010&\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00101R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010P¨\u0006\u0080\u0001"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbed;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "seen1", "", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "headerColor", "headerText", "", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "acceptLabelBackgroundColor", "acceptLabelBorderColor", "acceptLabelColor", "acceptLabelText", "bodyText", "bodyTextColor", "canBeAccepted", "", "channelIcon", "channelName", "embedCanBeTapped", "memberText", "onlineText", "resolvingGradientEnd", "resolvingGradientStart", "splashHasRadialGradient", "splashOpacity", "splashUrl", "inviteSplash", "subtitle", "subtitleColor", "thumbnailBackgroundColor", "thumbnailCornerRadius", "thumbnailText", "thumbnailUrl", "titleColor", "titleText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAcceptLabelBorderColor", "getAcceptLabelColor", "getAcceptLabelText", "()Ljava/lang/String;", "getBackgroundColor", "()I", "getBodyText", "getBodyTextColor", "getBorderColor", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChannelIcon", "getChannelName", "getEmbedCanBeTapped", "getHeaderColor", "getHeaderText", "getInviteSplash", "getMemberText", "getOnlineText", "getResolvingGradientEnd", "getResolvingGradientStart", "getSplashHasRadialGradient", "getSplashOpacity", "getSplashUrl", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailText", "getThumbnailUrl", "getTitleColor", "getTitleText", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GuildInviteEmbedImpl extends CodedLinkEmbed implements GuildInviteEmbed {
    public static final Companion Companion = new Companion(null);
    private final Integer acceptLabelBackgroundColor;
    private final Integer acceptLabelBorderColor;
    private final Integer acceptLabelColor;
    private final String acceptLabelText;
    private final int backgroundColor;
    private final String bodyText;
    private final Integer bodyTextColor;
    private final int borderColor;
    private final Boolean canBeAccepted;
    private final String channelIcon;
    private final String channelName;
    private final Boolean embedCanBeTapped;
    private final int headerColor;
    private final String headerText;
    private final String inviteSplash;
    private final String memberText;
    private final String onlineText;
    private final Integer resolvingGradientEnd;
    private final Integer resolvingGradientStart;
    private final Boolean splashHasRadialGradient;
    private final Integer splashOpacity;
    private final String splashUrl;
    private final String subtitle;
    private final Integer subtitleColor;
    private final Integer thumbnailBackgroundColor;
    private final Integer thumbnailCornerRadius;
    private final String thumbnailText;
    private final String thumbnailUrl;
    private final Integer titleColor;
    private final String titleText;
    private final InviteType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GuildInviteEmbedImpl> serializer() {
            return GuildInviteEmbedImpl$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GuildInviteEmbedImpl(int i10, int i11, int i12, int i13, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, String str4, String str5, Boolean bool2, String str6, String str7, Integer num5, Integer num6, Boolean bool3, Integer num7, String str8, String str9, String str10, Integer num8, Integer num9, Integer num10, String str11, String str12, Integer num11, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, GuildInviteEmbedImpl$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundColor = i11;
        this.borderColor = i12;
        this.headerColor = i13;
        this.headerText = str;
        this.type = inviteType;
        if ((i10 & 32) == 0) {
            this.acceptLabelBackgroundColor = null;
        } else {
            this.acceptLabelBackgroundColor = num;
        }
        if ((i10 & 64) == 0) {
            this.acceptLabelBorderColor = null;
        } else {
            this.acceptLabelBorderColor = num2;
        }
        if ((i10 & 128) == 0) {
            this.acceptLabelColor = null;
        } else {
            this.acceptLabelColor = num3;
        }
        if ((i10 & Spliterator.NONNULL) == 0) {
            this.acceptLabelText = null;
        } else {
            this.acceptLabelText = str2;
        }
        if ((i10 & 512) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str3;
        }
        if ((i10 & Spliterator.IMMUTABLE) == 0) {
            this.bodyTextColor = null;
        } else {
            this.bodyTextColor = num4;
        }
        if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.canBeAccepted = null;
        } else {
            this.canBeAccepted = bool;
        }
        if ((i10 & 4096) == 0) {
            this.channelIcon = null;
        } else {
            this.channelIcon = str4;
        }
        if ((i10 & 8192) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str5;
        }
        if ((i10 & Spliterator.SUBSIZED) == 0) {
            this.embedCanBeTapped = null;
        } else {
            this.embedCanBeTapped = bool2;
        }
        if ((32768 & i10) == 0) {
            this.memberText = null;
        } else {
            this.memberText = str6;
        }
        if ((65536 & i10) == 0) {
            this.onlineText = null;
        } else {
            this.onlineText = str7;
        }
        if ((131072 & i10) == 0) {
            this.resolvingGradientEnd = null;
        } else {
            this.resolvingGradientEnd = num5;
        }
        if ((262144 & i10) == 0) {
            this.resolvingGradientStart = null;
        } else {
            this.resolvingGradientStart = num6;
        }
        if ((524288 & i10) == 0) {
            this.splashHasRadialGradient = null;
        } else {
            this.splashHasRadialGradient = bool3;
        }
        if ((1048576 & i10) == 0) {
            this.splashOpacity = null;
        } else {
            this.splashOpacity = num7;
        }
        if ((2097152 & i10) == 0) {
            this.splashUrl = null;
        } else {
            this.splashUrl = str8;
        }
        if ((4194304 & i10) == 0) {
            this.inviteSplash = null;
        } else {
            this.inviteSplash = str9;
        }
        if ((8388608 & i10) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str10;
        }
        if ((16777216 & i10) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = num8;
        }
        if ((33554432 & i10) == 0) {
            this.thumbnailBackgroundColor = null;
        } else {
            this.thumbnailBackgroundColor = num9;
        }
        if ((67108864 & i10) == 0) {
            this.thumbnailCornerRadius = null;
        } else {
            this.thumbnailCornerRadius = num10;
        }
        if ((134217728 & i10) == 0) {
            this.thumbnailText = null;
        } else {
            this.thumbnailText = str11;
        }
        if ((268435456 & i10) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str12;
        }
        if ((536870912 & i10) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = num11;
        }
        if ((i10 & 1073741824) == 0) {
            this.titleText = null;
        } else {
            this.titleText = str13;
        }
    }

    public static final void write$Self(GuildInviteEmbedImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z10 = false;
        output.x(serialDesc, 0, self.getBackgroundColor());
        output.x(serialDesc, 1, self.getBorderColor());
        output.x(serialDesc, 2, self.getHeaderColor());
        a2 a2Var = a2.f32925a;
        output.u(serialDesc, 3, a2Var, self.getHeaderText());
        output.q(serialDesc, 4, InviteType.Serializer.INSTANCE, self.getType());
        if (output.A(serialDesc, 5) || self.getAcceptLabelBackgroundColor() != null) {
            output.u(serialDesc, 5, m0.f33000a, self.getAcceptLabelBackgroundColor());
        }
        if (output.A(serialDesc, 6) || self.getAcceptLabelBorderColor() != null) {
            output.u(serialDesc, 6, m0.f33000a, self.getAcceptLabelBorderColor());
        }
        if (output.A(serialDesc, 7) || self.getAcceptLabelColor() != null) {
            output.u(serialDesc, 7, m0.f33000a, self.getAcceptLabelColor());
        }
        if (output.A(serialDesc, 8) || self.getAcceptLabelText() != null) {
            output.u(serialDesc, 8, a2Var, self.getAcceptLabelText());
        }
        if (output.A(serialDesc, 9) || self.getBodyText() != null) {
            output.u(serialDesc, 9, a2Var, self.getBodyText());
        }
        if (output.A(serialDesc, 10) || self.getBodyTextColor() != null) {
            output.u(serialDesc, 10, m0.f33000a, self.getBodyTextColor());
        }
        if (output.A(serialDesc, 11) || self.getCanBeAccepted() != null) {
            output.u(serialDesc, 11, h.f32967a, self.getCanBeAccepted());
        }
        if (output.A(serialDesc, 12) || self.getChannelIcon() != null) {
            output.u(serialDesc, 12, a2Var, self.getChannelIcon());
        }
        if (output.A(serialDesc, 13) || self.getChannelName() != null) {
            output.u(serialDesc, 13, a2Var, self.getChannelName());
        }
        if (output.A(serialDesc, 14) || self.getEmbedCanBeTapped() != null) {
            output.u(serialDesc, 14, h.f32967a, self.getEmbedCanBeTapped());
        }
        if (output.A(serialDesc, 15) || self.getMemberText() != null) {
            output.u(serialDesc, 15, a2Var, self.getMemberText());
        }
        if (output.A(serialDesc, 16) || self.getOnlineText() != null) {
            output.u(serialDesc, 16, a2Var, self.getOnlineText());
        }
        if (output.A(serialDesc, 17) || self.getResolvingGradientEnd() != null) {
            output.u(serialDesc, 17, m0.f33000a, self.getResolvingGradientEnd());
        }
        if (output.A(serialDesc, 18) || self.getResolvingGradientStart() != null) {
            output.u(serialDesc, 18, m0.f33000a, self.getResolvingGradientStart());
        }
        if (output.A(serialDesc, 19) || self.getSplashHasRadialGradient() != null) {
            output.u(serialDesc, 19, h.f32967a, self.getSplashHasRadialGradient());
        }
        if (output.A(serialDesc, 20) || self.getSplashOpacity() != null) {
            output.u(serialDesc, 20, m0.f33000a, self.getSplashOpacity());
        }
        if (output.A(serialDesc, 21) || self.getSplashUrl() != null) {
            output.u(serialDesc, 21, a2Var, self.getSplashUrl());
        }
        if (output.A(serialDesc, 22) || self.getInviteSplash() != null) {
            output.u(serialDesc, 22, a2Var, self.getInviteSplash());
        }
        if (output.A(serialDesc, 23) || self.getSubtitle() != null) {
            output.u(serialDesc, 23, a2Var, self.getSubtitle());
        }
        if (output.A(serialDesc, 24) || self.getSubtitleColor() != null) {
            output.u(serialDesc, 24, m0.f33000a, self.getSubtitleColor());
        }
        if (output.A(serialDesc, 25) || self.getThumbnailBackgroundColor() != null) {
            output.u(serialDesc, 25, m0.f33000a, self.getThumbnailBackgroundColor());
        }
        if (output.A(serialDesc, 26) || self.getThumbnailCornerRadius() != null) {
            output.u(serialDesc, 26, m0.f33000a, self.getThumbnailCornerRadius());
        }
        if (output.A(serialDesc, 27) || self.getThumbnailText() != null) {
            output.u(serialDesc, 27, a2Var, self.getThumbnailText());
        }
        if (output.A(serialDesc, 28) || self.getThumbnailUrl() != null) {
            output.u(serialDesc, 28, a2Var, self.getThumbnailUrl());
        }
        if (output.A(serialDesc, 29) || self.getTitleColor() != null) {
            output.u(serialDesc, 29, m0.f33000a, self.getTitleColor());
        }
        if (output.A(serialDesc, 30) || self.getTitleText() != null) {
            z10 = true;
        }
        if (z10) {
            output.u(serialDesc, 30, a2Var, self.getTitleText());
        }
    }

    public final int component1() {
        return getBackgroundColor();
    }

    public final String component10() {
        return getBodyText();
    }

    public final Integer component11() {
        return getBodyTextColor();
    }

    public final Boolean component12() {
        return getCanBeAccepted();
    }

    public final String component13() {
        return getChannelIcon();
    }

    public final String component14() {
        return getChannelName();
    }

    public final Boolean component15() {
        return getEmbedCanBeTapped();
    }

    public final String component16() {
        return getMemberText();
    }

    public final String component17() {
        return getOnlineText();
    }

    public final Integer component18() {
        return getResolvingGradientEnd();
    }

    public final Integer component19() {
        return getResolvingGradientStart();
    }

    public final int component2() {
        return getBorderColor();
    }

    public final Boolean component20() {
        return getSplashHasRadialGradient();
    }

    public final Integer component21() {
        return getSplashOpacity();
    }

    public final String component22() {
        return getSplashUrl();
    }

    public final String component23() {
        return getInviteSplash();
    }

    public final String component24() {
        return getSubtitle();
    }

    public final Integer component25() {
        return getSubtitleColor();
    }

    public final Integer component26() {
        return getThumbnailBackgroundColor();
    }

    public final Integer component27() {
        return getThumbnailCornerRadius();
    }

    public final String component28() {
        return getThumbnailText();
    }

    public final String component29() {
        return getThumbnailUrl();
    }

    public final int component3() {
        return getHeaderColor();
    }

    public final Integer component30() {
        return getTitleColor();
    }

    public final String component31() {
        return getTitleText();
    }

    public final String component4() {
        return getHeaderText();
    }

    public final InviteType component5() {
        return getType();
    }

    public final Integer component6() {
        return getAcceptLabelBackgroundColor();
    }

    public final Integer component7() {
        return getAcceptLabelBorderColor();
    }

    public final Integer component8() {
        return getAcceptLabelColor();
    }

    public final String component9() {
        return getAcceptLabelText();
    }

    public final GuildInviteEmbedImpl copy(int i10, int i11, int i12, String str, InviteType type, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, String str4, String str5, Boolean bool2, String str6, String str7, Integer num5, Integer num6, Boolean bool3, Integer num7, String str8, String str9, String str10, Integer num8, Integer num9, Integer num10, String str11, String str12, Integer num11, String str13) {
        q.g(type, "type");
        return new GuildInviteEmbedImpl(i10, i11, i12, str, type, num, num2, num3, str2, str3, num4, bool, str4, str5, bool2, str6, str7, num5, num6, bool3, num7, str8, str9, str10, num8, num9, num10, str11, str12, num11, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuildInviteEmbedImpl)) {
            return false;
        }
        GuildInviteEmbedImpl guildInviteEmbedImpl = (GuildInviteEmbedImpl) obj;
        return getBackgroundColor() == guildInviteEmbedImpl.getBackgroundColor() && getBorderColor() == guildInviteEmbedImpl.getBorderColor() && getHeaderColor() == guildInviteEmbedImpl.getHeaderColor() && q.b(getHeaderText(), guildInviteEmbedImpl.getHeaderText()) && getType() == guildInviteEmbedImpl.getType() && q.b(getAcceptLabelBackgroundColor(), guildInviteEmbedImpl.getAcceptLabelBackgroundColor()) && q.b(getAcceptLabelBorderColor(), guildInviteEmbedImpl.getAcceptLabelBorderColor()) && q.b(getAcceptLabelColor(), guildInviteEmbedImpl.getAcceptLabelColor()) && q.b(getAcceptLabelText(), guildInviteEmbedImpl.getAcceptLabelText()) && q.b(getBodyText(), guildInviteEmbedImpl.getBodyText()) && q.b(getBodyTextColor(), guildInviteEmbedImpl.getBodyTextColor()) && q.b(getCanBeAccepted(), guildInviteEmbedImpl.getCanBeAccepted()) && q.b(getChannelIcon(), guildInviteEmbedImpl.getChannelIcon()) && q.b(getChannelName(), guildInviteEmbedImpl.getChannelName()) && q.b(getEmbedCanBeTapped(), guildInviteEmbedImpl.getEmbedCanBeTapped()) && q.b(getMemberText(), guildInviteEmbedImpl.getMemberText()) && q.b(getOnlineText(), guildInviteEmbedImpl.getOnlineText()) && q.b(getResolvingGradientEnd(), guildInviteEmbedImpl.getResolvingGradientEnd()) && q.b(getResolvingGradientStart(), guildInviteEmbedImpl.getResolvingGradientStart()) && q.b(getSplashHasRadialGradient(), guildInviteEmbedImpl.getSplashHasRadialGradient()) && q.b(getSplashOpacity(), guildInviteEmbedImpl.getSplashOpacity()) && q.b(getSplashUrl(), guildInviteEmbedImpl.getSplashUrl()) && q.b(getInviteSplash(), guildInviteEmbedImpl.getInviteSplash()) && q.b(getSubtitle(), guildInviteEmbedImpl.getSubtitle()) && q.b(getSubtitleColor(), guildInviteEmbedImpl.getSubtitleColor()) && q.b(getThumbnailBackgroundColor(), guildInviteEmbedImpl.getThumbnailBackgroundColor()) && q.b(getThumbnailCornerRadius(), guildInviteEmbedImpl.getThumbnailCornerRadius()) && q.b(getThumbnailText(), guildInviteEmbedImpl.getThumbnailText()) && q.b(getThumbnailUrl(), guildInviteEmbedImpl.getThumbnailUrl()) && q.b(getTitleColor(), guildInviteEmbedImpl.getTitleColor()) && q.b(getTitleText(), guildInviteEmbedImpl.getTitleText());
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getAcceptLabelBackgroundColor() {
        return this.acceptLabelBackgroundColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getAcceptLabelBorderColor() {
        return this.acceptLabelBorderColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getAcceptLabelColor() {
        return this.acceptLabelColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getAcceptLabelText() {
        return this.acceptLabelText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getBodyText() {
        return this.bodyText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getBodyTextColor() {
        return this.bodyTextColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getBorderColor() {
        return this.borderColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getCanBeAccepted() {
        return this.canBeAccepted;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteEmbed
    public String getChannelIcon() {
        return this.channelIcon;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteEmbed
    public String getChannelName() {
        return this.channelName;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getHeaderColor() {
        return this.headerColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getHeaderText() {
        return this.headerText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getInviteSplash() {
        return this.inviteSplash;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteEmbed
    public String getMemberText() {
        return this.memberText;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteEmbed
    public String getOnlineText() {
        return this.onlineText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getResolvingGradientEnd() {
        return this.resolvingGradientEnd;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getResolvingGradientStart() {
        return this.resolvingGradientStart;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getSplashHasRadialGradient() {
        return this.splashHasRadialGradient;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getSplashOpacity() {
        return this.splashOpacity;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getSplashUrl() {
        return this.splashUrl;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getSubtitle() {
        return this.subtitle;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getSubtitleColor() {
        return this.subtitleColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getThumbnailBackgroundColor() {
        return this.thumbnailBackgroundColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getThumbnailCornerRadius() {
        return this.thumbnailCornerRadius;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getThumbnailText() {
        return this.thumbnailText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Integer getTitleColor() {
        return this.titleColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getTitleText() {
        return this.titleText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public InviteType getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = 0;
        int backgroundColor = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((getBackgroundColor() * 31) + getBorderColor()) * 31) + getHeaderColor()) * 31) + (getHeaderText() == null ? 0 : getHeaderText().hashCode())) * 31) + getType().hashCode()) * 31) + (getAcceptLabelBackgroundColor() == null ? 0 : getAcceptLabelBackgroundColor().hashCode())) * 31) + (getAcceptLabelBorderColor() == null ? 0 : getAcceptLabelBorderColor().hashCode())) * 31) + (getAcceptLabelColor() == null ? 0 : getAcceptLabelColor().hashCode())) * 31) + (getAcceptLabelText() == null ? 0 : getAcceptLabelText().hashCode())) * 31) + (getBodyText() == null ? 0 : getBodyText().hashCode())) * 31) + (getBodyTextColor() == null ? 0 : getBodyTextColor().hashCode())) * 31) + (getCanBeAccepted() == null ? 0 : getCanBeAccepted().hashCode())) * 31) + (getChannelIcon() == null ? 0 : getChannelIcon().hashCode())) * 31) + (getChannelName() == null ? 0 : getChannelName().hashCode())) * 31) + (getEmbedCanBeTapped() == null ? 0 : getEmbedCanBeTapped().hashCode())) * 31) + (getMemberText() == null ? 0 : getMemberText().hashCode())) * 31) + (getOnlineText() == null ? 0 : getOnlineText().hashCode())) * 31) + (getResolvingGradientEnd() == null ? 0 : getResolvingGradientEnd().hashCode())) * 31) + (getResolvingGradientStart() == null ? 0 : getResolvingGradientStart().hashCode())) * 31) + (getSplashHasRadialGradient() == null ? 0 : getSplashHasRadialGradient().hashCode())) * 31) + (getSplashOpacity() == null ? 0 : getSplashOpacity().hashCode())) * 31) + (getSplashUrl() == null ? 0 : getSplashUrl().hashCode())) * 31) + (getInviteSplash() == null ? 0 : getInviteSplash().hashCode())) * 31) + (getSubtitle() == null ? 0 : getSubtitle().hashCode())) * 31) + (getSubtitleColor() == null ? 0 : getSubtitleColor().hashCode())) * 31) + (getThumbnailBackgroundColor() == null ? 0 : getThumbnailBackgroundColor().hashCode())) * 31) + (getThumbnailCornerRadius() == null ? 0 : getThumbnailCornerRadius().hashCode())) * 31) + (getThumbnailText() == null ? 0 : getThumbnailText().hashCode())) * 31) + (getThumbnailUrl() == null ? 0 : getThumbnailUrl().hashCode())) * 31) + (getTitleColor() == null ? 0 : getTitleColor().hashCode())) * 31;
        if (getTitleText() != null) {
            i10 = getTitleText().hashCode();
        }
        return backgroundColor + i10;
    }

    public String toString() {
        int backgroundColor = getBackgroundColor();
        int borderColor = getBorderColor();
        int headerColor = getHeaderColor();
        String headerText = getHeaderText();
        InviteType type = getType();
        Integer acceptLabelBackgroundColor = getAcceptLabelBackgroundColor();
        Integer acceptLabelBorderColor = getAcceptLabelBorderColor();
        Integer acceptLabelColor = getAcceptLabelColor();
        String acceptLabelText = getAcceptLabelText();
        String bodyText = getBodyText();
        Integer bodyTextColor = getBodyTextColor();
        Boolean canBeAccepted = getCanBeAccepted();
        String channelIcon = getChannelIcon();
        String channelName = getChannelName();
        Boolean embedCanBeTapped = getEmbedCanBeTapped();
        String memberText = getMemberText();
        String onlineText = getOnlineText();
        Integer resolvingGradientEnd = getResolvingGradientEnd();
        Integer resolvingGradientStart = getResolvingGradientStart();
        Boolean splashHasRadialGradient = getSplashHasRadialGradient();
        Integer splashOpacity = getSplashOpacity();
        String splashUrl = getSplashUrl();
        String inviteSplash = getInviteSplash();
        String subtitle = getSubtitle();
        Integer subtitleColor = getSubtitleColor();
        Integer thumbnailBackgroundColor = getThumbnailBackgroundColor();
        Integer thumbnailCornerRadius = getThumbnailCornerRadius();
        String thumbnailText = getThumbnailText();
        String thumbnailUrl = getThumbnailUrl();
        Integer titleColor = getTitleColor();
        String titleText = getTitleText();
        return "GuildInviteEmbedImpl(backgroundColor=" + backgroundColor + ", borderColor=" + borderColor + ", headerColor=" + headerColor + ", headerText=" + headerText + ", type=" + type + ", acceptLabelBackgroundColor=" + acceptLabelBackgroundColor + ", acceptLabelBorderColor=" + acceptLabelBorderColor + ", acceptLabelColor=" + acceptLabelColor + ", acceptLabelText=" + acceptLabelText + ", bodyText=" + bodyText + ", bodyTextColor=" + bodyTextColor + ", canBeAccepted=" + canBeAccepted + ", channelIcon=" + channelIcon + ", channelName=" + channelName + ", embedCanBeTapped=" + embedCanBeTapped + ", memberText=" + memberText + ", onlineText=" + onlineText + ", resolvingGradientEnd=" + resolvingGradientEnd + ", resolvingGradientStart=" + resolvingGradientStart + ", splashHasRadialGradient=" + splashHasRadialGradient + ", splashOpacity=" + splashOpacity + ", splashUrl=" + splashUrl + ", inviteSplash=" + inviteSplash + ", subtitle=" + subtitle + ", subtitleColor=" + subtitleColor + ", thumbnailBackgroundColor=" + thumbnailBackgroundColor + ", thumbnailCornerRadius=" + thumbnailCornerRadius + ", thumbnailText=" + thumbnailText + ", thumbnailUrl=" + thumbnailUrl + ", titleColor=" + titleColor + ", titleText=" + titleText + ")";
    }

    public /* synthetic */ GuildInviteEmbedImpl(int i10, int i11, int i12, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, String str4, String str5, Boolean bool2, String str6, String str7, Integer num5, Integer num6, Boolean bool3, Integer num7, String str8, String str9, String str10, Integer num8, Integer num9, Integer num10, String str11, String str12, Integer num11, String str13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str, inviteType, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : num2, (i13 & 128) != 0 ? null : num3, (i13 & Spliterator.NONNULL) != 0 ? null : str2, (i13 & 512) != 0 ? null : str3, (i13 & Spliterator.IMMUTABLE) != 0 ? null : num4, (i13 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : bool, (i13 & 4096) != 0 ? null : str4, (i13 & 8192) != 0 ? null : str5, (i13 & Spliterator.SUBSIZED) != 0 ? null : bool2, (32768 & i13) != 0 ? null : str6, (65536 & i13) != 0 ? null : str7, (131072 & i13) != 0 ? null : num5, (262144 & i13) != 0 ? null : num6, (524288 & i13) != 0 ? null : bool3, (1048576 & i13) != 0 ? null : num7, (2097152 & i13) != 0 ? null : str8, (4194304 & i13) != 0 ? null : str9, (8388608 & i13) != 0 ? null : str10, (16777216 & i13) != 0 ? null : num8, (33554432 & i13) != 0 ? null : num9, (67108864 & i13) != 0 ? null : num10, (134217728 & i13) != 0 ? null : str11, (268435456 & i13) != 0 ? null : str12, (536870912 & i13) != 0 ? null : num11, (i13 & 1073741824) != 0 ? null : str13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteEmbedImpl(int i10, int i11, int i12, String str, InviteType type, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, String str4, String str5, Boolean bool2, String str6, String str7, Integer num5, Integer num6, Boolean bool3, Integer num7, String str8, String str9, String str10, Integer num8, Integer num9, Integer num10, String str11, String str12, Integer num11, String str13) {
        super(null);
        q.g(type, "type");
        this.backgroundColor = i10;
        this.borderColor = i11;
        this.headerColor = i12;
        this.headerText = str;
        this.type = type;
        this.acceptLabelBackgroundColor = num;
        this.acceptLabelBorderColor = num2;
        this.acceptLabelColor = num3;
        this.acceptLabelText = str2;
        this.bodyText = str3;
        this.bodyTextColor = num4;
        this.canBeAccepted = bool;
        this.channelIcon = str4;
        this.channelName = str5;
        this.embedCanBeTapped = bool2;
        this.memberText = str6;
        this.onlineText = str7;
        this.resolvingGradientEnd = num5;
        this.resolvingGradientStart = num6;
        this.splashHasRadialGradient = bool3;
        this.splashOpacity = num7;
        this.splashUrl = str8;
        this.inviteSplash = str9;
        this.subtitle = str10;
        this.subtitleColor = num8;
        this.thumbnailBackgroundColor = num9;
        this.thumbnailCornerRadius = num10;
        this.thumbnailText = str11;
        this.thumbnailUrl = str12;
        this.titleColor = num11;
        this.titleText = str13;
    }
}
