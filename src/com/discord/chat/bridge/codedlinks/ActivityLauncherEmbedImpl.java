package com.discord.chat.bridge.codedlinks;

import androidx.recyclerview.widget.RecyclerView;
import bj.C2500a2;
import bj.C2521f;
import bj.C2530h;
import bj.C2555m0;
import bj.C2560n1;
import com.discord.chat.bridge.codedlinks.CodedLinkExtendedType;
import com.discord.chat.bridge.codedlinks.InviteType;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p164j$.util.Spliterator;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bV\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u0091\u00012\u00020\u00012\u00020\u0002:\u0004\u0090\u0001\u0091\u0001Bî\u0002\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\n\u0012\b\u0010!\u001a\u0004\u0018\u00010\n\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\n\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010+\u0012\b\u0010,\u001a\u0004\u0018\u00010\n\u0012\b\u0010-\u001a\u0004\u0018\u00010\n\u0012\b\u0010.\u001a\u0004\u0018\u00010/ø\u0001\u0000¢\u0006\u0002\u00100B\u0080\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010-\u001a\u00020\nø\u0001\u0000¢\u0006\u0002\u00101J\t\u0010^\u001a\u00020\u0004HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010a\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010b\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010e\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010BJ\u0010\u0010f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010g\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010i\u001a\u00020\u0004HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010l\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010m\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010n\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010q\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0019\u0010r\u001a\u00020%HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010:J\u0019\u0010t\u001a\u00020'HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bu\u0010:J\t\u0010v\u001a\u00020\u0004HÆ\u0003J\t\u0010w\u001a\u00020)HÆ\u0003J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00020\n0+HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010z\u001a\u00020\nHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010~\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u00103J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u009b\u0003\u0010\u0081\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010-\u001a\u00020\nHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0016\u0010\u0084\u0001\u001a\u00020\u00142\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001HÖ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0004HÖ\u0001J\n\u0010\u0088\u0001\u001a\u00020\nHÖ\u0001J(\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008b\u0001\u001a\u00020\u00002\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001HÇ\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b5\u00103R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b6\u00103R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001f\u0010$\u001a\u00020%X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00108R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b?\u00103R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u001f\u0010&\u001a\u00020'X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010;\u001a\u0004\bD\u0010:R\u0016\u0010,\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00108R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\n\n\u0002\u0010C\u001a\u0004\bF\u0010BR\u0014\u0010(\u001a\u00020)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0014\u0010\b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010=R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00108R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00108R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0014\u0010-\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00108R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\bO\u00103R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\bP\u00103R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\n\n\u0002\u0010C\u001a\u0004\bQ\u0010BR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\bR\u00103R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00108R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u00108R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\bU\u00103R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\bV\u00103R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\bW\u00103R\u0016\u0010 \u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00108R\u0016\u0010!\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00108R\u0018\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\bZ\u00103R\u0016\u0010#\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u00108R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0092\u0001"}, m15073d2 = {"Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbed;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "seen1", "", "seen2", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "headerColor", "headerText", "", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "acceptLabelBackgroundColor", "acceptLabelBorderColor", "acceptLabelColor", "acceptLabelText", "bodyText", "bodyTextColor", "canBeAccepted", "", "embedCanBeTapped", "resolvingGradientEnd", "resolvingGradientStart", "splashHasRadialGradient", "splashOpacity", "splashUrl", "inviteSplash", "subtitle", "subtitleColor", "thumbnailBackgroundColor", "thumbnailCornerRadius", "thumbnailText", "thumbnailUrl", "titleColor", "titleText", "applicationId", "Lcom/discord/primitives/ApplicationId;", "channelId", "Lcom/discord/primitives/ChannelId;", "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "participantAvatarUris", "", "description", "participantsText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Lcom/discord/primitives/ChannelId;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAcceptLabelBorderColor", "getAcceptLabelColor", "getAcceptLabelText", "()Ljava/lang/String;", "getApplicationId-VavddsQ", "()J", "J", "getBackgroundColor", "()I", "getBodyText", "getBodyTextColor", "getBorderColor", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChannelId-o4g7jtM", "getDescription", "getEmbedCanBeTapped", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getHeaderColor", "getHeaderText", "getInviteSplash", "getParticipantAvatarUris", "()Ljava/util/List;", "getParticipantsText", "getResolvingGradientEnd", "getResolvingGradientStart", "getSplashHasRadialGradient", "getSplashOpacity", "getSplashUrl", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailText", "getThumbnailUrl", "getTitleColor", "getTitleText", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component28-VavddsQ", "component29", "component29-o4g7jtM", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-3qwsJ70", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJLcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class ActivityLauncherEmbedImpl extends CodedLinkEmbed implements ActivityLauncherEmbed {
    public static final Companion Companion = new Companion(null);
    private final Integer acceptLabelBackgroundColor;
    private final Integer acceptLabelBorderColor;
    private final Integer acceptLabelColor;
    private final String acceptLabelText;
    private final long applicationId;
    private final int backgroundColor;
    private final String bodyText;
    private final Integer bodyTextColor;
    private final int borderColor;
    private final Boolean canBeAccepted;
    private final long channelId;
    private final String description;
    private final Boolean embedCanBeTapped;
    private final CodedLinkExtendedType extendedType;
    private final int headerColor;
    private final String headerText;
    private final String inviteSplash;
    private final List<String> participantAvatarUris;
    private final String participantsText;
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

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivityLauncherEmbedImpl> serializer() {
            return ActivityLauncherEmbedImpl$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ActivityLauncherEmbedImpl(int i, int i2, int i3, int i4, int i5, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, ApplicationId applicationId, ChannelId channelId, CodedLinkExtendedType codedLinkExtendedType, List<String> list, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((1476395023 != (i & 1476395023)) || (1 != (i2 & 1))) {
            C2560n1.m33819a(new int[]{i, i2}, new int[]{1476395023, 1}, ActivityLauncherEmbedImpl$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundColor = i3;
        this.borderColor = i4;
        this.headerColor = i5;
        this.headerText = str;
        if ((i & 16) == 0) {
            this.type = null;
        } else {
            this.type = inviteType;
        }
        if ((i & 32) == 0) {
            this.acceptLabelBackgroundColor = null;
        } else {
            this.acceptLabelBackgroundColor = num;
        }
        if ((i & 64) == 0) {
            this.acceptLabelBorderColor = null;
        } else {
            this.acceptLabelBorderColor = num2;
        }
        if ((i & 128) == 0) {
            this.acceptLabelColor = null;
        } else {
            this.acceptLabelColor = num3;
        }
        if ((i & Spliterator.NONNULL) == 0) {
            this.acceptLabelText = null;
        } else {
            this.acceptLabelText = str2;
        }
        if ((i & 512) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str3;
        }
        if ((i & Spliterator.IMMUTABLE) == 0) {
            this.bodyTextColor = null;
        } else {
            this.bodyTextColor = num4;
        }
        if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.canBeAccepted = null;
        } else {
            this.canBeAccepted = bool;
        }
        if ((i & 4096) == 0) {
            this.embedCanBeTapped = null;
        } else {
            this.embedCanBeTapped = bool2;
        }
        if ((i & 8192) == 0) {
            this.resolvingGradientEnd = null;
        } else {
            this.resolvingGradientEnd = num5;
        }
        if ((i & Spliterator.SUBSIZED) == 0) {
            this.resolvingGradientStart = null;
        } else {
            this.resolvingGradientStart = num6;
        }
        if ((32768 & i) == 0) {
            this.splashHasRadialGradient = null;
        } else {
            this.splashHasRadialGradient = bool3;
        }
        if ((65536 & i) == 0) {
            this.splashOpacity = null;
        } else {
            this.splashOpacity = num7;
        }
        if ((131072 & i) == 0) {
            this.splashUrl = null;
        } else {
            this.splashUrl = str4;
        }
        if ((262144 & i) == 0) {
            this.inviteSplash = null;
        } else {
            this.inviteSplash = str5;
        }
        if ((524288 & i) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str6;
        }
        if ((1048576 & i) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = num8;
        }
        if ((2097152 & i) == 0) {
            this.thumbnailBackgroundColor = null;
        } else {
            this.thumbnailBackgroundColor = num9;
        }
        if ((4194304 & i) == 0) {
            this.thumbnailCornerRadius = null;
        } else {
            this.thumbnailCornerRadius = num10;
        }
        if ((8388608 & i) == 0) {
            this.thumbnailText = null;
        } else {
            this.thumbnailText = str7;
        }
        if ((16777216 & i) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str8;
        }
        if ((33554432 & i) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = num11;
        }
        if ((67108864 & i) == 0) {
            this.titleText = null;
        } else {
            this.titleText = str9;
        }
        this.applicationId = applicationId.m42085unboximpl();
        this.channelId = channelId.m42098unboximpl();
        this.extendedType = (536870912 & i) == 0 ? CodedLinkExtendedType.ACTIVITY_LAUNCHER : codedLinkExtendedType;
        this.participantAvatarUris = list;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.description = null;
        } else {
            this.description = str10;
        }
        this.participantsText = str11;
    }

    public /* synthetic */ ActivityLauncherEmbedImpl(int i, int i2, int i3, int i4, int i5, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, ApplicationId applicationId, ChannelId channelId, CodedLinkExtendedType codedLinkExtendedType, List list, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, str, inviteType, num, num2, num3, str2, str3, num4, bool, bool2, num5, num6, bool3, num7, str4, str5, str6, num8, num9, num10, str7, str8, num11, str9, applicationId, channelId, codedLinkExtendedType, list, str10, str11, serializationConstructorMarker);
    }

    public /* synthetic */ ActivityLauncherEmbedImpl(int i, int i2, int i3, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, long j, long j2, CodedLinkExtendedType codedLinkExtendedType, List list, String str10, String str11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, inviteType, num, num2, num3, str2, str3, num4, bool, bool2, num5, num6, bool3, num7, str4, str5, str6, num8, num9, num10, str7, str8, num11, str9, j, j2, codedLinkExtendedType, list, str10, str11);
    }

    public static final void write$Self(ActivityLauncherEmbedImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        boolean z = false;
        output.mo13866x(serialDesc, 0, self.getBackgroundColor());
        output.mo13866x(serialDesc, 1, self.getBorderColor());
        output.mo13866x(serialDesc, 2, self.getHeaderColor());
        C2500a2 a2Var = C2500a2.f6719a;
        output.mo13874p(serialDesc, 3, a2Var, self.getHeaderText());
        if (output.mo13893A(serialDesc, 4) || self.getType() != null) {
            output.mo13874p(serialDesc, 4, InviteType.Serializer.INSTANCE, self.getType());
        }
        if (output.mo13893A(serialDesc, 5) || self.getAcceptLabelBackgroundColor() != null) {
            output.mo13874p(serialDesc, 5, C2555m0.f6794a, self.getAcceptLabelBackgroundColor());
        }
        if (output.mo13893A(serialDesc, 6) || self.getAcceptLabelBorderColor() != null) {
            output.mo13874p(serialDesc, 6, C2555m0.f6794a, self.getAcceptLabelBorderColor());
        }
        if (output.mo13893A(serialDesc, 7) || self.getAcceptLabelColor() != null) {
            output.mo13874p(serialDesc, 7, C2555m0.f6794a, self.getAcceptLabelColor());
        }
        if (output.mo13893A(serialDesc, 8) || self.getAcceptLabelText() != null) {
            output.mo13874p(serialDesc, 8, a2Var, self.getAcceptLabelText());
        }
        if (output.mo13893A(serialDesc, 9) || self.getBodyText() != null) {
            output.mo13874p(serialDesc, 9, a2Var, self.getBodyText());
        }
        if (output.mo13893A(serialDesc, 10) || self.getBodyTextColor() != null) {
            output.mo13874p(serialDesc, 10, C2555m0.f6794a, self.getBodyTextColor());
        }
        if (output.mo13893A(serialDesc, 11) || self.getCanBeAccepted() != null) {
            output.mo13874p(serialDesc, 11, C2530h.f6761a, self.getCanBeAccepted());
        }
        if (output.mo13893A(serialDesc, 12) || self.getEmbedCanBeTapped() != null) {
            output.mo13874p(serialDesc, 12, C2530h.f6761a, self.getEmbedCanBeTapped());
        }
        if (output.mo13893A(serialDesc, 13) || self.getResolvingGradientEnd() != null) {
            output.mo13874p(serialDesc, 13, C2555m0.f6794a, self.getResolvingGradientEnd());
        }
        if (output.mo13893A(serialDesc, 14) || self.getResolvingGradientStart() != null) {
            output.mo13874p(serialDesc, 14, C2555m0.f6794a, self.getResolvingGradientStart());
        }
        if (output.mo13893A(serialDesc, 15) || self.getSplashHasRadialGradient() != null) {
            output.mo13874p(serialDesc, 15, C2530h.f6761a, self.getSplashHasRadialGradient());
        }
        if (output.mo13893A(serialDesc, 16) || self.getSplashOpacity() != null) {
            output.mo13874p(serialDesc, 16, C2555m0.f6794a, self.getSplashOpacity());
        }
        if (output.mo13893A(serialDesc, 17) || self.getSplashUrl() != null) {
            output.mo13874p(serialDesc, 17, a2Var, self.getSplashUrl());
        }
        if (output.mo13893A(serialDesc, 18) || self.getInviteSplash() != null) {
            output.mo13874p(serialDesc, 18, a2Var, self.getInviteSplash());
        }
        if (output.mo13893A(serialDesc, 19) || self.getSubtitle() != null) {
            output.mo13874p(serialDesc, 19, a2Var, self.getSubtitle());
        }
        if (output.mo13893A(serialDesc, 20) || self.getSubtitleColor() != null) {
            output.mo13874p(serialDesc, 20, C2555m0.f6794a, self.getSubtitleColor());
        }
        if (output.mo13893A(serialDesc, 21) || self.getThumbnailBackgroundColor() != null) {
            output.mo13874p(serialDesc, 21, C2555m0.f6794a, self.getThumbnailBackgroundColor());
        }
        if (output.mo13893A(serialDesc, 22) || self.getThumbnailCornerRadius() != null) {
            output.mo13874p(serialDesc, 22, C2555m0.f6794a, self.getThumbnailCornerRadius());
        }
        if (output.mo13893A(serialDesc, 23) || self.getThumbnailText() != null) {
            output.mo13874p(serialDesc, 23, a2Var, self.getThumbnailText());
        }
        if (output.mo13893A(serialDesc, 24) || self.getThumbnailUrl() != null) {
            output.mo13874p(serialDesc, 24, a2Var, self.getThumbnailUrl());
        }
        if (output.mo13893A(serialDesc, 25) || self.getTitleColor() != null) {
            output.mo13874p(serialDesc, 25, C2555m0.f6794a, self.getTitleColor());
        }
        if (output.mo13893A(serialDesc, 26) || self.getTitleText() != null) {
            output.mo13874p(serialDesc, 26, a2Var, self.getTitleText());
        }
        output.mo13870t(serialDesc, 27, ApplicationId$$serializer.INSTANCE, ApplicationId.m42076boximpl(self.mo41595getApplicationIdVavddsQ()));
        output.mo13870t(serialDesc, 28, ChannelId$$serializer.INSTANCE, ChannelId.m42089boximpl(self.mo41596getChannelIdo4g7jtM()));
        if (output.mo13893A(serialDesc, 29) || self.getExtendedType() != CodedLinkExtendedType.ACTIVITY_LAUNCHER) {
            output.mo13870t(serialDesc, 29, CodedLinkExtendedType.Serializer.INSTANCE, self.getExtendedType());
        }
        output.mo13870t(serialDesc, 30, new C2521f(a2Var), self.getParticipantAvatarUris());
        if (output.mo13893A(serialDesc, 31) || self.getDescription() != null) {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 31, a2Var, self.getDescription());
        }
        output.mo13864z(serialDesc, 32, self.getParticipantsText());
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

    public final Boolean component13() {
        return getEmbedCanBeTapped();
    }

    public final Integer component14() {
        return getResolvingGradientEnd();
    }

    public final Integer component15() {
        return getResolvingGradientStart();
    }

    public final Boolean component16() {
        return getSplashHasRadialGradient();
    }

    public final Integer component17() {
        return getSplashOpacity();
    }

    public final String component18() {
        return getSplashUrl();
    }

    public final String component19() {
        return getInviteSplash();
    }

    public final int component2() {
        return getBorderColor();
    }

    public final String component20() {
        return getSubtitle();
    }

    public final Integer component21() {
        return getSubtitleColor();
    }

    public final Integer component22() {
        return getThumbnailBackgroundColor();
    }

    public final Integer component23() {
        return getThumbnailCornerRadius();
    }

    public final String component24() {
        return getThumbnailText();
    }

    public final String component25() {
        return getThumbnailUrl();
    }

    public final Integer component26() {
        return getTitleColor();
    }

    public final String component27() {
        return getTitleText();
    }

    /* renamed from: component28-VavddsQ  reason: not valid java name */
    public final long m41598component28VavddsQ() {
        return mo41595getApplicationIdVavddsQ();
    }

    /* renamed from: component29-o4g7jtM  reason: not valid java name */
    public final long m41599component29o4g7jtM() {
        return mo41596getChannelIdo4g7jtM();
    }

    public final int component3() {
        return getHeaderColor();
    }

    public final CodedLinkExtendedType component30() {
        return getExtendedType();
    }

    public final List<String> component31() {
        return getParticipantAvatarUris();
    }

    public final String component32() {
        return getDescription();
    }

    public final String component33() {
        return getParticipantsText();
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

    /* renamed from: copy-3qwsJ70  reason: not valid java name */
    public final ActivityLauncherEmbedImpl m41600copy3qwsJ70(int i, int i2, int i3, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, long j, long j2, CodedLinkExtendedType extendedType, List<String> participantAvatarUris, String str10, String participantsText) {
        C9677q.m14633g(extendedType, "extendedType");
        C9677q.m14633g(participantAvatarUris, "participantAvatarUris");
        C9677q.m14633g(participantsText, "participantsText");
        return new ActivityLauncherEmbedImpl(i, i2, i3, str, inviteType, num, num2, num3, str2, str3, num4, bool, bool2, num5, num6, bool3, num7, str4, str5, str6, num8, num9, num10, str7, str8, num11, str9, j, j2, extendedType, participantAvatarUris, str10, participantsText, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityLauncherEmbedImpl)) {
            return false;
        }
        ActivityLauncherEmbedImpl activityLauncherEmbedImpl = (ActivityLauncherEmbedImpl) obj;
        return getBackgroundColor() == activityLauncherEmbedImpl.getBackgroundColor() && getBorderColor() == activityLauncherEmbedImpl.getBorderColor() && getHeaderColor() == activityLauncherEmbedImpl.getHeaderColor() && C9677q.m14638b(getHeaderText(), activityLauncherEmbedImpl.getHeaderText()) && getType() == activityLauncherEmbedImpl.getType() && C9677q.m14638b(getAcceptLabelBackgroundColor(), activityLauncherEmbedImpl.getAcceptLabelBackgroundColor()) && C9677q.m14638b(getAcceptLabelBorderColor(), activityLauncherEmbedImpl.getAcceptLabelBorderColor()) && C9677q.m14638b(getAcceptLabelColor(), activityLauncherEmbedImpl.getAcceptLabelColor()) && C9677q.m14638b(getAcceptLabelText(), activityLauncherEmbedImpl.getAcceptLabelText()) && C9677q.m14638b(getBodyText(), activityLauncherEmbedImpl.getBodyText()) && C9677q.m14638b(getBodyTextColor(), activityLauncherEmbedImpl.getBodyTextColor()) && C9677q.m14638b(getCanBeAccepted(), activityLauncherEmbedImpl.getCanBeAccepted()) && C9677q.m14638b(getEmbedCanBeTapped(), activityLauncherEmbedImpl.getEmbedCanBeTapped()) && C9677q.m14638b(getResolvingGradientEnd(), activityLauncherEmbedImpl.getResolvingGradientEnd()) && C9677q.m14638b(getResolvingGradientStart(), activityLauncherEmbedImpl.getResolvingGradientStart()) && C9677q.m14638b(getSplashHasRadialGradient(), activityLauncherEmbedImpl.getSplashHasRadialGradient()) && C9677q.m14638b(getSplashOpacity(), activityLauncherEmbedImpl.getSplashOpacity()) && C9677q.m14638b(getSplashUrl(), activityLauncherEmbedImpl.getSplashUrl()) && C9677q.m14638b(getInviteSplash(), activityLauncherEmbedImpl.getInviteSplash()) && C9677q.m14638b(getSubtitle(), activityLauncherEmbedImpl.getSubtitle()) && C9677q.m14638b(getSubtitleColor(), activityLauncherEmbedImpl.getSubtitleColor()) && C9677q.m14638b(getThumbnailBackgroundColor(), activityLauncherEmbedImpl.getThumbnailBackgroundColor()) && C9677q.m14638b(getThumbnailCornerRadius(), activityLauncherEmbedImpl.getThumbnailCornerRadius()) && C9677q.m14638b(getThumbnailText(), activityLauncherEmbedImpl.getThumbnailText()) && C9677q.m14638b(getThumbnailUrl(), activityLauncherEmbedImpl.getThumbnailUrl()) && C9677q.m14638b(getTitleColor(), activityLauncherEmbedImpl.getTitleColor()) && C9677q.m14638b(getTitleText(), activityLauncherEmbedImpl.getTitleText()) && ApplicationId.m42080equalsimpl0(mo41595getApplicationIdVavddsQ(), activityLauncherEmbedImpl.mo41595getApplicationIdVavddsQ()) && ChannelId.m42093equalsimpl0(mo41596getChannelIdo4g7jtM(), activityLauncherEmbedImpl.mo41596getChannelIdo4g7jtM()) && getExtendedType() == activityLauncherEmbedImpl.getExtendedType() && C9677q.m14638b(getParticipantAvatarUris(), activityLauncherEmbedImpl.getParticipantAvatarUris()) && C9677q.m14638b(getDescription(), activityLauncherEmbedImpl.getDescription()) && C9677q.m14638b(getParticipantsText(), activityLauncherEmbedImpl.getParticipantsText());
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

    @Override // com.discord.chat.bridge.codedlinks.ActivityLauncherEmbed
    /* renamed from: getApplicationId-VavddsQ */
    public long mo41595getApplicationIdVavddsQ() {
        return this.applicationId;
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

    @Override // com.discord.chat.bridge.codedlinks.ActivityLauncherEmbed
    /* renamed from: getChannelId-o4g7jtM */
    public long mo41596getChannelIdo4g7jtM() {
        return this.channelId;
    }

    @Override // com.discord.chat.bridge.codedlinks.ActivityLauncherEmbed
    public String getDescription() {
        return this.description;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public Boolean getEmbedCanBeTapped() {
        return this.embedCanBeTapped;
    }

    @Override // com.discord.chat.bridge.codedlinks.ActivityLauncherEmbed
    public CodedLinkExtendedType getExtendedType() {
        return this.extendedType;
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

    @Override // com.discord.chat.bridge.codedlinks.ActivityLauncherEmbed
    public List<String> getParticipantAvatarUris() {
        return this.participantAvatarUris;
    }

    @Override // com.discord.chat.bridge.codedlinks.ActivityLauncherEmbed
    public String getParticipantsText() {
        return this.participantsText;
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
        int i = 0;
        int backgroundColor = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((getBackgroundColor() * 31) + getBorderColor()) * 31) + getHeaderColor()) * 31) + (getHeaderText() == null ? 0 : getHeaderText().hashCode())) * 31) + (getType() == null ? 0 : getType().hashCode())) * 31) + (getAcceptLabelBackgroundColor() == null ? 0 : getAcceptLabelBackgroundColor().hashCode())) * 31) + (getAcceptLabelBorderColor() == null ? 0 : getAcceptLabelBorderColor().hashCode())) * 31) + (getAcceptLabelColor() == null ? 0 : getAcceptLabelColor().hashCode())) * 31) + (getAcceptLabelText() == null ? 0 : getAcceptLabelText().hashCode())) * 31) + (getBodyText() == null ? 0 : getBodyText().hashCode())) * 31) + (getBodyTextColor() == null ? 0 : getBodyTextColor().hashCode())) * 31) + (getCanBeAccepted() == null ? 0 : getCanBeAccepted().hashCode())) * 31) + (getEmbedCanBeTapped() == null ? 0 : getEmbedCanBeTapped().hashCode())) * 31) + (getResolvingGradientEnd() == null ? 0 : getResolvingGradientEnd().hashCode())) * 31) + (getResolvingGradientStart() == null ? 0 : getResolvingGradientStart().hashCode())) * 31) + (getSplashHasRadialGradient() == null ? 0 : getSplashHasRadialGradient().hashCode())) * 31) + (getSplashOpacity() == null ? 0 : getSplashOpacity().hashCode())) * 31) + (getSplashUrl() == null ? 0 : getSplashUrl().hashCode())) * 31) + (getInviteSplash() == null ? 0 : getInviteSplash().hashCode())) * 31) + (getSubtitle() == null ? 0 : getSubtitle().hashCode())) * 31) + (getSubtitleColor() == null ? 0 : getSubtitleColor().hashCode())) * 31) + (getThumbnailBackgroundColor() == null ? 0 : getThumbnailBackgroundColor().hashCode())) * 31) + (getThumbnailCornerRadius() == null ? 0 : getThumbnailCornerRadius().hashCode())) * 31) + (getThumbnailText() == null ? 0 : getThumbnailText().hashCode())) * 31) + (getThumbnailUrl() == null ? 0 : getThumbnailUrl().hashCode())) * 31) + (getTitleColor() == null ? 0 : getTitleColor().hashCode())) * 31) + (getTitleText() == null ? 0 : getTitleText().hashCode())) * 31) + ApplicationId.m42081hashCodeimpl(mo41595getApplicationIdVavddsQ())) * 31) + ChannelId.m42094hashCodeimpl(mo41596getChannelIdo4g7jtM())) * 31) + getExtendedType().hashCode()) * 31) + getParticipantAvatarUris().hashCode()) * 31;
        if (getDescription() != null) {
            i = getDescription().hashCode();
        }
        return ((backgroundColor + i) * 31) + getParticipantsText().hashCode();
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
        Boolean embedCanBeTapped = getEmbedCanBeTapped();
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
        String str = ApplicationId.m42083toStringimpl(mo41595getApplicationIdVavddsQ());
        String str2 = ChannelId.m42096toStringimpl(mo41596getChannelIdo4g7jtM());
        CodedLinkExtendedType extendedType = getExtendedType();
        List<String> participantAvatarUris = getParticipantAvatarUris();
        String description = getDescription();
        String participantsText = getParticipantsText();
        return "ActivityLauncherEmbedImpl(backgroundColor=" + backgroundColor + ", borderColor=" + borderColor + ", headerColor=" + headerColor + ", headerText=" + headerText + ", type=" + type + ", acceptLabelBackgroundColor=" + acceptLabelBackgroundColor + ", acceptLabelBorderColor=" + acceptLabelBorderColor + ", acceptLabelColor=" + acceptLabelColor + ", acceptLabelText=" + acceptLabelText + ", bodyText=" + bodyText + ", bodyTextColor=" + bodyTextColor + ", canBeAccepted=" + canBeAccepted + ", embedCanBeTapped=" + embedCanBeTapped + ", resolvingGradientEnd=" + resolvingGradientEnd + ", resolvingGradientStart=" + resolvingGradientStart + ", splashHasRadialGradient=" + splashHasRadialGradient + ", splashOpacity=" + splashOpacity + ", splashUrl=" + splashUrl + ", inviteSplash=" + inviteSplash + ", subtitle=" + subtitle + ", subtitleColor=" + subtitleColor + ", thumbnailBackgroundColor=" + thumbnailBackgroundColor + ", thumbnailCornerRadius=" + thumbnailCornerRadius + ", thumbnailText=" + thumbnailText + ", thumbnailUrl=" + thumbnailUrl + ", titleColor=" + titleColor + ", titleText=" + titleText + ", applicationId=" + str + ", channelId=" + str2 + ", extendedType=" + extendedType + ", participantAvatarUris=" + participantAvatarUris + ", description=" + description + ", participantsText=" + participantsText + ")";
    }

    public /* synthetic */ ActivityLauncherEmbedImpl(int i, int i2, int i3, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, long j, long j2, CodedLinkExtendedType codedLinkExtendedType, List list, String str10, String str11, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, (i4 & 16) != 0 ? null : inviteType, (i4 & 32) != 0 ? null : num, (i4 & 64) != 0 ? null : num2, (i4 & 128) != 0 ? null : num3, (i4 & Spliterator.NONNULL) != 0 ? null : str2, (i4 & 512) != 0 ? null : str3, (i4 & Spliterator.IMMUTABLE) != 0 ? null : num4, (i4 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : bool, (i4 & 4096) != 0 ? null : bool2, (i4 & 8192) != 0 ? null : num5, (i4 & Spliterator.SUBSIZED) != 0 ? null : num6, (32768 & i4) != 0 ? null : bool3, (65536 & i4) != 0 ? null : num7, (131072 & i4) != 0 ? null : str4, (262144 & i4) != 0 ? null : str5, (524288 & i4) != 0 ? null : str6, (1048576 & i4) != 0 ? null : num8, (2097152 & i4) != 0 ? null : num9, (4194304 & i4) != 0 ? null : num10, (8388608 & i4) != 0 ? null : str7, (16777216 & i4) != 0 ? null : str8, (33554432 & i4) != 0 ? null : num11, (67108864 & i4) != 0 ? null : str9, j, j2, (536870912 & i4) != 0 ? CodedLinkExtendedType.ACTIVITY_LAUNCHER : codedLinkExtendedType, list, (i4 & Integer.MIN_VALUE) != 0 ? null : str10, str11, null);
    }

    private ActivityLauncherEmbedImpl(int i, int i2, int i3, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, Integer num4, Boolean bool, Boolean bool2, Integer num5, Integer num6, Boolean bool3, Integer num7, String str4, String str5, String str6, Integer num8, Integer num9, Integer num10, String str7, String str8, Integer num11, String str9, long j, long j2, CodedLinkExtendedType codedLinkExtendedType, List<String> list, String str10, String str11) {
        super(null);
        this.backgroundColor = i;
        this.borderColor = i2;
        this.headerColor = i3;
        this.headerText = str;
        this.type = inviteType;
        this.acceptLabelBackgroundColor = num;
        this.acceptLabelBorderColor = num2;
        this.acceptLabelColor = num3;
        this.acceptLabelText = str2;
        this.bodyText = str3;
        this.bodyTextColor = num4;
        this.canBeAccepted = bool;
        this.embedCanBeTapped = bool2;
        this.resolvingGradientEnd = num5;
        this.resolvingGradientStart = num6;
        this.splashHasRadialGradient = bool3;
        this.splashOpacity = num7;
        this.splashUrl = str4;
        this.inviteSplash = str5;
        this.subtitle = str6;
        this.subtitleColor = num8;
        this.thumbnailBackgroundColor = num9;
        this.thumbnailCornerRadius = num10;
        this.thumbnailText = str7;
        this.thumbnailUrl = str8;
        this.titleColor = num11;
        this.titleText = str9;
        this.applicationId = j;
        this.channelId = j2;
        this.extendedType = codedLinkExtendedType;
        this.participantAvatarUris = list;
        this.description = str10;
        this.participantsText = str11;
    }
}
