package com.discord.chat.bridge.codedlinks;

import androidx.recyclerview.widget.RecyclerView;
import bj.C2500a2;
import bj.C2530h;
import bj.C2555m0;
import bj.C2560n1;
import com.discord.chat.bridge.codedlinks.CodedLinkExtendedType;
import com.discord.chat.bridge.codedlinks.InviteType;
import com.facebook.react.uimanager.ViewProps;
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
@Metadata(m15074d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u0095\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0094\u0001\u0095\u0001B\u008d\u0003\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010+\u001a\u0004\u0018\u00010,\u0012\b\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\b\u00100\u001a\u0004\u0018\u000101¢\u0006\u0002\u00102B\u009d\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020\u000b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u00103J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010h\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010AJ\u000b\u0010i\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010AJ\t\u0010l\u001a\u00020\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010q\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010s\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010y\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00105J\t\u0010|\u001a\u00020,HÆ\u0003J\t\u0010}\u001a\u00020\u000bHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u000bHÆ\u0003J¶\u0003\u0010\u0086\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0003\u0010\u0087\u0001J\u0016\u0010\u0088\u0001\u001a\u00020\u00192\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001HÖ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005HÖ\u0001J\n\u0010\u008c\u0001\u001a\u00020\u000bHÖ\u0001J(\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u00002\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001HÇ\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b7\u00105R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b8\u00105R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b>\u00105R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010:R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\bE\u0010AR\u0014\u0010+\u001a\u00020,X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0016\u0010.\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010:R\u0014\u0010-\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010:R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010<R\u0016\u0010/\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010:R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010:R\u0014\u0010\u0010\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010:R\u0014\u0010\u0011\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010:R\u0016\u0010$\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010:R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010:R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010:R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bR\u00105R\u0018\u0010 \u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bS\u00105R\u0018\u0010!\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\bT\u0010AR\u0018\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bU\u00105R\u0016\u0010#\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010:R\u0014\u0010\u000f\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010:R\u0018\u0010%\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bX\u00105R\u0018\u0010&\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bY\u00105R\u0018\u0010'\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\bZ\u00105R\u0016\u0010(\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010:R\u0016\u0010)\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010:R\u0018\u0010*\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b]\u00105R\u0014\u0010\u000e\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010:R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`¨\u0006\u0096\u0001"}, m15073d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/GuildDisabledInviteEmbed;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteExtendedEmbed;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "seen1", "", "seen2", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "headerColor", "headerText", "", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "titleText", "subtitle", "helpCenterArticleLabel", "helpCenterArticleURL", "acceptLabelBackgroundColor", "acceptLabelBorderColor", "acceptLabelColor", "acceptLabelText", "bodyText", "bodyTextColor", "canBeAccepted", "", "channelIcon", "channelName", "embedCanBeTapped", "memberText", "onlineText", "resolvingGradientEnd", "resolvingGradientStart", "splashHasRadialGradient", "splashOpacity", "splashUrl", "inviteSplash", "subtitleColor", "thumbnailBackgroundColor", "thumbnailCornerRadius", "thumbnailText", "thumbnailUrl", "titleColor", "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "guildName", "guildIcon", "headerIcon", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAcceptLabelBorderColor", "getAcceptLabelColor", "getAcceptLabelText", "()Ljava/lang/String;", "getBackgroundColor", "()I", "getBodyText", "getBodyTextColor", "getBorderColor", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChannelIcon", "getChannelName", "getEmbedCanBeTapped", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getGuildIcon", "getGuildName", "getHeaderColor", "getHeaderIcon", "getHeaderText", "getHelpCenterArticleLabel", "getHelpCenterArticleURL", "getInviteSplash", "getMemberText", "getOnlineText", "getResolvingGradientEnd", "getResolvingGradientStart", "getSplashHasRadialGradient", "getSplashOpacity", "getSplashUrl", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailText", "getThumbnailUrl", "getTitleColor", "getTitleText", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class GuildInviteDisabledEmbedImpl extends CodedLinkEmbed implements GuildDisabledInviteEmbed, GuildInviteExtendedEmbed {
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
    private final CodedLinkExtendedType extendedType;
    private final String guildIcon;
    private final String guildName;
    private final int headerColor;
    private final String headerIcon;
    private final String headerText;
    private final String helpCenterArticleLabel;
    private final String helpCenterArticleURL;
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

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GuildInviteDisabledEmbedImpl> serializer() {
            return GuildInviteDisabledEmbedImpl$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GuildInviteDisabledEmbedImpl(int i, int i2, int i3, int i4, int i5, String str, InviteType inviteType, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, String str6, String str7, Integer num4, Boolean bool, String str8, String str9, Boolean bool2, String str10, String str11, Integer num5, Integer num6, Boolean bool3, Integer num7, String str12, String str13, Integer num8, Integer num9, Integer num10, String str14, String str15, Integer num11, CodedLinkExtendedType codedLinkExtendedType, String str16, String str17, String str18, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((511 != (i & 511)) || (4 != (i2 & 4))) {
            C2560n1.m33819a(new int[]{i, i2}, new int[]{511, 4}, GuildInviteDisabledEmbedImpl$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundColor = i3;
        this.borderColor = i4;
        this.headerColor = i5;
        this.headerText = str;
        this.type = inviteType;
        this.titleText = str2;
        this.subtitle = str3;
        this.helpCenterArticleLabel = str4;
        this.helpCenterArticleURL = str5;
        if ((i & 512) == 0) {
            this.acceptLabelBackgroundColor = null;
        } else {
            this.acceptLabelBackgroundColor = num;
        }
        if ((i & Spliterator.IMMUTABLE) == 0) {
            this.acceptLabelBorderColor = null;
        } else {
            this.acceptLabelBorderColor = num2;
        }
        if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.acceptLabelColor = null;
        } else {
            this.acceptLabelColor = num3;
        }
        if ((i & 4096) == 0) {
            this.acceptLabelText = null;
        } else {
            this.acceptLabelText = str6;
        }
        if ((i & 8192) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str7;
        }
        if ((i & Spliterator.SUBSIZED) == 0) {
            this.bodyTextColor = null;
        } else {
            this.bodyTextColor = num4;
        }
        if ((32768 & i) == 0) {
            this.canBeAccepted = null;
        } else {
            this.canBeAccepted = bool;
        }
        if ((65536 & i) == 0) {
            this.channelIcon = null;
        } else {
            this.channelIcon = str8;
        }
        if ((131072 & i) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str9;
        }
        if ((262144 & i) == 0) {
            this.embedCanBeTapped = null;
        } else {
            this.embedCanBeTapped = bool2;
        }
        if ((524288 & i) == 0) {
            this.memberText = null;
        } else {
            this.memberText = str10;
        }
        if ((1048576 & i) == 0) {
            this.onlineText = null;
        } else {
            this.onlineText = str11;
        }
        if ((2097152 & i) == 0) {
            this.resolvingGradientEnd = null;
        } else {
            this.resolvingGradientEnd = num5;
        }
        if ((4194304 & i) == 0) {
            this.resolvingGradientStart = null;
        } else {
            this.resolvingGradientStart = num6;
        }
        if ((8388608 & i) == 0) {
            this.splashHasRadialGradient = null;
        } else {
            this.splashHasRadialGradient = bool3;
        }
        if ((16777216 & i) == 0) {
            this.splashOpacity = null;
        } else {
            this.splashOpacity = num7;
        }
        if ((33554432 & i) == 0) {
            this.splashUrl = null;
        } else {
            this.splashUrl = str12;
        }
        if ((67108864 & i) == 0) {
            this.inviteSplash = null;
        } else {
            this.inviteSplash = str13;
        }
        if ((134217728 & i) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = num8;
        }
        if ((268435456 & i) == 0) {
            this.thumbnailBackgroundColor = null;
        } else {
            this.thumbnailBackgroundColor = num9;
        }
        if ((536870912 & i) == 0) {
            this.thumbnailCornerRadius = null;
        } else {
            this.thumbnailCornerRadius = num10;
        }
        if ((1073741824 & i) == 0) {
            this.thumbnailText = null;
        } else {
            this.thumbnailText = str14;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str15;
        }
        if ((i2 & 1) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = num11;
        }
        this.extendedType = (i2 & 2) == 0 ? CodedLinkExtendedType.GUILD_INVITE_DISABLED : codedLinkExtendedType;
        this.guildName = str16;
        if ((i2 & 8) == 0) {
            this.guildIcon = null;
        } else {
            this.guildIcon = str17;
        }
        if ((i2 & 16) == 0) {
            this.headerIcon = null;
        } else {
            this.headerIcon = str18;
        }
    }

    public static final void write$Self(GuildInviteDisabledEmbedImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        boolean z = false;
        output.mo13866x(serialDesc, 0, self.getBackgroundColor());
        output.mo13866x(serialDesc, 1, self.getBorderColor());
        output.mo13866x(serialDesc, 2, self.getHeaderColor());
        output.mo13864z(serialDesc, 3, self.getHeaderText());
        output.mo13870t(serialDesc, 4, InviteType.Serializer.INSTANCE, self.getType());
        output.mo13864z(serialDesc, 5, self.getTitleText());
        output.mo13864z(serialDesc, 6, self.getSubtitle());
        output.mo13864z(serialDesc, 7, self.getHelpCenterArticleLabel());
        output.mo13864z(serialDesc, 8, self.getHelpCenterArticleURL());
        if (output.mo13893A(serialDesc, 9) || self.getAcceptLabelBackgroundColor() != null) {
            output.mo13874p(serialDesc, 9, C2555m0.f6794a, self.getAcceptLabelBackgroundColor());
        }
        if (output.mo13893A(serialDesc, 10) || self.getAcceptLabelBorderColor() != null) {
            output.mo13874p(serialDesc, 10, C2555m0.f6794a, self.getAcceptLabelBorderColor());
        }
        if (output.mo13893A(serialDesc, 11) || self.getAcceptLabelColor() != null) {
            output.mo13874p(serialDesc, 11, C2555m0.f6794a, self.getAcceptLabelColor());
        }
        if (output.mo13893A(serialDesc, 12) || self.getAcceptLabelText() != null) {
            output.mo13874p(serialDesc, 12, C2500a2.f6719a, self.getAcceptLabelText());
        }
        if (output.mo13893A(serialDesc, 13) || self.getBodyText() != null) {
            output.mo13874p(serialDesc, 13, C2500a2.f6719a, self.getBodyText());
        }
        if (output.mo13893A(serialDesc, 14) || self.getBodyTextColor() != null) {
            output.mo13874p(serialDesc, 14, C2555m0.f6794a, self.getBodyTextColor());
        }
        if (output.mo13893A(serialDesc, 15) || self.getCanBeAccepted() != null) {
            output.mo13874p(serialDesc, 15, C2530h.f6761a, self.getCanBeAccepted());
        }
        if (output.mo13893A(serialDesc, 16) || self.getChannelIcon() != null) {
            output.mo13874p(serialDesc, 16, C2500a2.f6719a, self.getChannelIcon());
        }
        if (output.mo13893A(serialDesc, 17) || self.getChannelName() != null) {
            output.mo13874p(serialDesc, 17, C2500a2.f6719a, self.getChannelName());
        }
        if (output.mo13893A(serialDesc, 18) || self.getEmbedCanBeTapped() != null) {
            output.mo13874p(serialDesc, 18, C2530h.f6761a, self.getEmbedCanBeTapped());
        }
        if (output.mo13893A(serialDesc, 19) || self.getMemberText() != null) {
            output.mo13874p(serialDesc, 19, C2500a2.f6719a, self.getMemberText());
        }
        if (output.mo13893A(serialDesc, 20) || self.getOnlineText() != null) {
            output.mo13874p(serialDesc, 20, C2500a2.f6719a, self.getOnlineText());
        }
        if (output.mo13893A(serialDesc, 21) || self.getResolvingGradientEnd() != null) {
            output.mo13874p(serialDesc, 21, C2555m0.f6794a, self.getResolvingGradientEnd());
        }
        if (output.mo13893A(serialDesc, 22) || self.getResolvingGradientStart() != null) {
            output.mo13874p(serialDesc, 22, C2555m0.f6794a, self.getResolvingGradientStart());
        }
        if (output.mo13893A(serialDesc, 23) || self.getSplashHasRadialGradient() != null) {
            output.mo13874p(serialDesc, 23, C2530h.f6761a, self.getSplashHasRadialGradient());
        }
        if (output.mo13893A(serialDesc, 24) || self.getSplashOpacity() != null) {
            output.mo13874p(serialDesc, 24, C2555m0.f6794a, self.getSplashOpacity());
        }
        if (output.mo13893A(serialDesc, 25) || self.getSplashUrl() != null) {
            output.mo13874p(serialDesc, 25, C2500a2.f6719a, self.getSplashUrl());
        }
        if (output.mo13893A(serialDesc, 26) || self.getInviteSplash() != null) {
            output.mo13874p(serialDesc, 26, C2500a2.f6719a, self.getInviteSplash());
        }
        if (output.mo13893A(serialDesc, 27) || self.getSubtitleColor() != null) {
            output.mo13874p(serialDesc, 27, C2555m0.f6794a, self.getSubtitleColor());
        }
        if (output.mo13893A(serialDesc, 28) || self.getThumbnailBackgroundColor() != null) {
            output.mo13874p(serialDesc, 28, C2555m0.f6794a, self.getThumbnailBackgroundColor());
        }
        if (output.mo13893A(serialDesc, 29) || self.getThumbnailCornerRadius() != null) {
            output.mo13874p(serialDesc, 29, C2555m0.f6794a, self.getThumbnailCornerRadius());
        }
        if (output.mo13893A(serialDesc, 30) || self.getThumbnailText() != null) {
            output.mo13874p(serialDesc, 30, C2500a2.f6719a, self.getThumbnailText());
        }
        if (output.mo13893A(serialDesc, 31) || self.getThumbnailUrl() != null) {
            output.mo13874p(serialDesc, 31, C2500a2.f6719a, self.getThumbnailUrl());
        }
        if (output.mo13893A(serialDesc, 32) || self.getTitleColor() != null) {
            output.mo13874p(serialDesc, 32, C2555m0.f6794a, self.getTitleColor());
        }
        if (output.mo13893A(serialDesc, 33) || self.getExtendedType() != CodedLinkExtendedType.GUILD_INVITE_DISABLED) {
            output.mo13870t(serialDesc, 33, CodedLinkExtendedType.Serializer.INSTANCE, self.getExtendedType());
        }
        output.mo13864z(serialDesc, 34, self.getGuildName());
        if (output.mo13893A(serialDesc, 35) || self.getGuildIcon() != null) {
            output.mo13874p(serialDesc, 35, C2500a2.f6719a, self.getGuildIcon());
        }
        if (output.mo13893A(serialDesc, 36) || self.getHeaderIcon() != null) {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 36, C2500a2.f6719a, self.getHeaderIcon());
        }
    }

    public final int component1() {
        return getBackgroundColor();
    }

    public final Integer component10() {
        return getAcceptLabelBackgroundColor();
    }

    public final Integer component11() {
        return getAcceptLabelBorderColor();
    }

    public final Integer component12() {
        return getAcceptLabelColor();
    }

    public final String component13() {
        return getAcceptLabelText();
    }

    public final String component14() {
        return getBodyText();
    }

    public final Integer component15() {
        return getBodyTextColor();
    }

    public final Boolean component16() {
        return getCanBeAccepted();
    }

    public final String component17() {
        return getChannelIcon();
    }

    public final String component18() {
        return getChannelName();
    }

    public final Boolean component19() {
        return getEmbedCanBeTapped();
    }

    public final int component2() {
        return getBorderColor();
    }

    public final String component20() {
        return getMemberText();
    }

    public final String component21() {
        return getOnlineText();
    }

    public final Integer component22() {
        return getResolvingGradientEnd();
    }

    public final Integer component23() {
        return getResolvingGradientStart();
    }

    public final Boolean component24() {
        return getSplashHasRadialGradient();
    }

    public final Integer component25() {
        return getSplashOpacity();
    }

    public final String component26() {
        return getSplashUrl();
    }

    public final String component27() {
        return getInviteSplash();
    }

    public final Integer component28() {
        return getSubtitleColor();
    }

    public final Integer component29() {
        return getThumbnailBackgroundColor();
    }

    public final int component3() {
        return getHeaderColor();
    }

    public final Integer component30() {
        return getThumbnailCornerRadius();
    }

    public final String component31() {
        return getThumbnailText();
    }

    public final String component32() {
        return getThumbnailUrl();
    }

    public final Integer component33() {
        return getTitleColor();
    }

    public final CodedLinkExtendedType component34() {
        return getExtendedType();
    }

    public final String component35() {
        return getGuildName();
    }

    public final String component36() {
        return getGuildIcon();
    }

    public final String component37() {
        return getHeaderIcon();
    }

    public final String component4() {
        return getHeaderText();
    }

    public final InviteType component5() {
        return getType();
    }

    public final String component6() {
        return getTitleText();
    }

    public final String component7() {
        return getSubtitle();
    }

    public final String component8() {
        return getHelpCenterArticleLabel();
    }

    public final String component9() {
        return getHelpCenterArticleURL();
    }

    public final GuildInviteDisabledEmbedImpl copy(int i, int i2, int i3, String headerText, InviteType type, String titleText, String subtitle, String helpCenterArticleLabel, String helpCenterArticleURL, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, Boolean bool, String str3, String str4, Boolean bool2, String str5, String str6, Integer num5, Integer num6, Boolean bool3, Integer num7, String str7, String str8, Integer num8, Integer num9, Integer num10, String str9, String str10, Integer num11, CodedLinkExtendedType extendedType, String guildName, String str11, String str12) {
        C9677q.m14633g(headerText, "headerText");
        C9677q.m14633g(type, "type");
        C9677q.m14633g(titleText, "titleText");
        C9677q.m14633g(subtitle, "subtitle");
        C9677q.m14633g(helpCenterArticleLabel, "helpCenterArticleLabel");
        C9677q.m14633g(helpCenterArticleURL, "helpCenterArticleURL");
        C9677q.m14633g(extendedType, "extendedType");
        C9677q.m14633g(guildName, "guildName");
        return new GuildInviteDisabledEmbedImpl(i, i2, i3, headerText, type, titleText, subtitle, helpCenterArticleLabel, helpCenterArticleURL, num, num2, num3, str, str2, num4, bool, str3, str4, bool2, str5, str6, num5, num6, bool3, num7, str7, str8, num8, num9, num10, str9, str10, num11, extendedType, guildName, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuildInviteDisabledEmbedImpl)) {
            return false;
        }
        GuildInviteDisabledEmbedImpl guildInviteDisabledEmbedImpl = (GuildInviteDisabledEmbedImpl) obj;
        return getBackgroundColor() == guildInviteDisabledEmbedImpl.getBackgroundColor() && getBorderColor() == guildInviteDisabledEmbedImpl.getBorderColor() && getHeaderColor() == guildInviteDisabledEmbedImpl.getHeaderColor() && C9677q.m14638b(getHeaderText(), guildInviteDisabledEmbedImpl.getHeaderText()) && getType() == guildInviteDisabledEmbedImpl.getType() && C9677q.m14638b(getTitleText(), guildInviteDisabledEmbedImpl.getTitleText()) && C9677q.m14638b(getSubtitle(), guildInviteDisabledEmbedImpl.getSubtitle()) && C9677q.m14638b(getHelpCenterArticleLabel(), guildInviteDisabledEmbedImpl.getHelpCenterArticleLabel()) && C9677q.m14638b(getHelpCenterArticleURL(), guildInviteDisabledEmbedImpl.getHelpCenterArticleURL()) && C9677q.m14638b(getAcceptLabelBackgroundColor(), guildInviteDisabledEmbedImpl.getAcceptLabelBackgroundColor()) && C9677q.m14638b(getAcceptLabelBorderColor(), guildInviteDisabledEmbedImpl.getAcceptLabelBorderColor()) && C9677q.m14638b(getAcceptLabelColor(), guildInviteDisabledEmbedImpl.getAcceptLabelColor()) && C9677q.m14638b(getAcceptLabelText(), guildInviteDisabledEmbedImpl.getAcceptLabelText()) && C9677q.m14638b(getBodyText(), guildInviteDisabledEmbedImpl.getBodyText()) && C9677q.m14638b(getBodyTextColor(), guildInviteDisabledEmbedImpl.getBodyTextColor()) && C9677q.m14638b(getCanBeAccepted(), guildInviteDisabledEmbedImpl.getCanBeAccepted()) && C9677q.m14638b(getChannelIcon(), guildInviteDisabledEmbedImpl.getChannelIcon()) && C9677q.m14638b(getChannelName(), guildInviteDisabledEmbedImpl.getChannelName()) && C9677q.m14638b(getEmbedCanBeTapped(), guildInviteDisabledEmbedImpl.getEmbedCanBeTapped()) && C9677q.m14638b(getMemberText(), guildInviteDisabledEmbedImpl.getMemberText()) && C9677q.m14638b(getOnlineText(), guildInviteDisabledEmbedImpl.getOnlineText()) && C9677q.m14638b(getResolvingGradientEnd(), guildInviteDisabledEmbedImpl.getResolvingGradientEnd()) && C9677q.m14638b(getResolvingGradientStart(), guildInviteDisabledEmbedImpl.getResolvingGradientStart()) && C9677q.m14638b(getSplashHasRadialGradient(), guildInviteDisabledEmbedImpl.getSplashHasRadialGradient()) && C9677q.m14638b(getSplashOpacity(), guildInviteDisabledEmbedImpl.getSplashOpacity()) && C9677q.m14638b(getSplashUrl(), guildInviteDisabledEmbedImpl.getSplashUrl()) && C9677q.m14638b(getInviteSplash(), guildInviteDisabledEmbedImpl.getInviteSplash()) && C9677q.m14638b(getSubtitleColor(), guildInviteDisabledEmbedImpl.getSubtitleColor()) && C9677q.m14638b(getThumbnailBackgroundColor(), guildInviteDisabledEmbedImpl.getThumbnailBackgroundColor()) && C9677q.m14638b(getThumbnailCornerRadius(), guildInviteDisabledEmbedImpl.getThumbnailCornerRadius()) && C9677q.m14638b(getThumbnailText(), guildInviteDisabledEmbedImpl.getThumbnailText()) && C9677q.m14638b(getThumbnailUrl(), guildInviteDisabledEmbedImpl.getThumbnailUrl()) && C9677q.m14638b(getTitleColor(), guildInviteDisabledEmbedImpl.getTitleColor()) && getExtendedType() == guildInviteDisabledEmbedImpl.getExtendedType() && C9677q.m14638b(getGuildName(), guildInviteDisabledEmbedImpl.getGuildName()) && C9677q.m14638b(getGuildIcon(), guildInviteDisabledEmbedImpl.getGuildIcon()) && C9677q.m14638b(getHeaderIcon(), guildInviteDisabledEmbedImpl.getHeaderIcon());
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

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteExtendedEmbed
    public CodedLinkExtendedType getExtendedType() {
        return this.extendedType;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteExtendedEmbed
    public String getGuildIcon() {
        return this.guildIcon;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteExtendedEmbed
    public String getGuildName() {
        return this.guildName;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getHeaderColor() {
        return this.headerColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildInviteExtendedEmbed
    public String getHeaderIcon() {
        return this.headerIcon;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getHeaderText() {
        return this.headerText;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildDisabledInviteEmbed
    public String getHelpCenterArticleLabel() {
        return this.helpCenterArticleLabel;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildDisabledInviteEmbed
    public String getHelpCenterArticleURL() {
        return this.helpCenterArticleURL;
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
        int i = 0;
        int backgroundColor = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((getBackgroundColor() * 31) + getBorderColor()) * 31) + getHeaderColor()) * 31) + getHeaderText().hashCode()) * 31) + getType().hashCode()) * 31) + getTitleText().hashCode()) * 31) + getSubtitle().hashCode()) * 31) + getHelpCenterArticleLabel().hashCode()) * 31) + getHelpCenterArticleURL().hashCode()) * 31) + (getAcceptLabelBackgroundColor() == null ? 0 : getAcceptLabelBackgroundColor().hashCode())) * 31) + (getAcceptLabelBorderColor() == null ? 0 : getAcceptLabelBorderColor().hashCode())) * 31) + (getAcceptLabelColor() == null ? 0 : getAcceptLabelColor().hashCode())) * 31) + (getAcceptLabelText() == null ? 0 : getAcceptLabelText().hashCode())) * 31) + (getBodyText() == null ? 0 : getBodyText().hashCode())) * 31) + (getBodyTextColor() == null ? 0 : getBodyTextColor().hashCode())) * 31) + (getCanBeAccepted() == null ? 0 : getCanBeAccepted().hashCode())) * 31) + (getChannelIcon() == null ? 0 : getChannelIcon().hashCode())) * 31) + (getChannelName() == null ? 0 : getChannelName().hashCode())) * 31) + (getEmbedCanBeTapped() == null ? 0 : getEmbedCanBeTapped().hashCode())) * 31) + (getMemberText() == null ? 0 : getMemberText().hashCode())) * 31) + (getOnlineText() == null ? 0 : getOnlineText().hashCode())) * 31) + (getResolvingGradientEnd() == null ? 0 : getResolvingGradientEnd().hashCode())) * 31) + (getResolvingGradientStart() == null ? 0 : getResolvingGradientStart().hashCode())) * 31) + (getSplashHasRadialGradient() == null ? 0 : getSplashHasRadialGradient().hashCode())) * 31) + (getSplashOpacity() == null ? 0 : getSplashOpacity().hashCode())) * 31) + (getSplashUrl() == null ? 0 : getSplashUrl().hashCode())) * 31) + (getInviteSplash() == null ? 0 : getInviteSplash().hashCode())) * 31) + (getSubtitleColor() == null ? 0 : getSubtitleColor().hashCode())) * 31) + (getThumbnailBackgroundColor() == null ? 0 : getThumbnailBackgroundColor().hashCode())) * 31) + (getThumbnailCornerRadius() == null ? 0 : getThumbnailCornerRadius().hashCode())) * 31) + (getThumbnailText() == null ? 0 : getThumbnailText().hashCode())) * 31) + (getThumbnailUrl() == null ? 0 : getThumbnailUrl().hashCode())) * 31) + (getTitleColor() == null ? 0 : getTitleColor().hashCode())) * 31) + getExtendedType().hashCode()) * 31) + getGuildName().hashCode()) * 31) + (getGuildIcon() == null ? 0 : getGuildIcon().hashCode())) * 31;
        if (getHeaderIcon() != null) {
            i = getHeaderIcon().hashCode();
        }
        return backgroundColor + i;
    }

    public String toString() {
        int backgroundColor = getBackgroundColor();
        int borderColor = getBorderColor();
        int headerColor = getHeaderColor();
        String headerText = getHeaderText();
        InviteType type = getType();
        String titleText = getTitleText();
        String subtitle = getSubtitle();
        String helpCenterArticleLabel = getHelpCenterArticleLabel();
        String helpCenterArticleURL = getHelpCenterArticleURL();
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
        Integer subtitleColor = getSubtitleColor();
        Integer thumbnailBackgroundColor = getThumbnailBackgroundColor();
        Integer thumbnailCornerRadius = getThumbnailCornerRadius();
        String thumbnailText = getThumbnailText();
        String thumbnailUrl = getThumbnailUrl();
        Integer titleColor = getTitleColor();
        CodedLinkExtendedType extendedType = getExtendedType();
        String guildName = getGuildName();
        String guildIcon = getGuildIcon();
        String headerIcon = getHeaderIcon();
        return "GuildInviteDisabledEmbedImpl(backgroundColor=" + backgroundColor + ", borderColor=" + borderColor + ", headerColor=" + headerColor + ", headerText=" + headerText + ", type=" + type + ", titleText=" + titleText + ", subtitle=" + subtitle + ", helpCenterArticleLabel=" + helpCenterArticleLabel + ", helpCenterArticleURL=" + helpCenterArticleURL + ", acceptLabelBackgroundColor=" + acceptLabelBackgroundColor + ", acceptLabelBorderColor=" + acceptLabelBorderColor + ", acceptLabelColor=" + acceptLabelColor + ", acceptLabelText=" + acceptLabelText + ", bodyText=" + bodyText + ", bodyTextColor=" + bodyTextColor + ", canBeAccepted=" + canBeAccepted + ", channelIcon=" + channelIcon + ", channelName=" + channelName + ", embedCanBeTapped=" + embedCanBeTapped + ", memberText=" + memberText + ", onlineText=" + onlineText + ", resolvingGradientEnd=" + resolvingGradientEnd + ", resolvingGradientStart=" + resolvingGradientStart + ", splashHasRadialGradient=" + splashHasRadialGradient + ", splashOpacity=" + splashOpacity + ", splashUrl=" + splashUrl + ", inviteSplash=" + inviteSplash + ", subtitleColor=" + subtitleColor + ", thumbnailBackgroundColor=" + thumbnailBackgroundColor + ", thumbnailCornerRadius=" + thumbnailCornerRadius + ", thumbnailText=" + thumbnailText + ", thumbnailUrl=" + thumbnailUrl + ", titleColor=" + titleColor + ", extendedType=" + extendedType + ", guildName=" + guildName + ", guildIcon=" + guildIcon + ", headerIcon=" + headerIcon + ")";
    }

    public /* synthetic */ GuildInviteDisabledEmbedImpl(int i, int i2, int i3, String str, InviteType inviteType, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, String str6, String str7, Integer num4, Boolean bool, String str8, String str9, Boolean bool2, String str10, String str11, Integer num5, Integer num6, Boolean bool3, Integer num7, String str12, String str13, Integer num8, Integer num9, Integer num10, String str14, String str15, Integer num11, CodedLinkExtendedType codedLinkExtendedType, String str16, String str17, String str18, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, inviteType, str2, str3, str4, str5, (i4 & 512) != 0 ? null : num, (i4 & Spliterator.IMMUTABLE) != 0 ? null : num2, (i4 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : num3, (i4 & 4096) != 0 ? null : str6, (i4 & 8192) != 0 ? null : str7, (i4 & Spliterator.SUBSIZED) != 0 ? null : num4, (32768 & i4) != 0 ? null : bool, (65536 & i4) != 0 ? null : str8, (131072 & i4) != 0 ? null : str9, (262144 & i4) != 0 ? null : bool2, (524288 & i4) != 0 ? null : str10, (1048576 & i4) != 0 ? null : str11, (2097152 & i4) != 0 ? null : num5, (4194304 & i4) != 0 ? null : num6, (8388608 & i4) != 0 ? null : bool3, (16777216 & i4) != 0 ? null : num7, (33554432 & i4) != 0 ? null : str12, (67108864 & i4) != 0 ? null : str13, (134217728 & i4) != 0 ? null : num8, (268435456 & i4) != 0 ? null : num9, (536870912 & i4) != 0 ? null : num10, (1073741824 & i4) != 0 ? null : str14, (i4 & Integer.MIN_VALUE) != 0 ? null : str15, (i5 & 1) != 0 ? null : num11, (i5 & 2) != 0 ? CodedLinkExtendedType.GUILD_INVITE_DISABLED : codedLinkExtendedType, str16, (i5 & 8) != 0 ? null : str17, (i5 & 16) != 0 ? null : str18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildInviteDisabledEmbedImpl(int i, int i2, int i3, String headerText, InviteType type, String titleText, String subtitle, String helpCenterArticleLabel, String helpCenterArticleURL, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, Boolean bool, String str3, String str4, Boolean bool2, String str5, String str6, Integer num5, Integer num6, Boolean bool3, Integer num7, String str7, String str8, Integer num8, Integer num9, Integer num10, String str9, String str10, Integer num11, CodedLinkExtendedType extendedType, String guildName, String str11, String str12) {
        super(null);
        C9677q.m14633g(headerText, "headerText");
        C9677q.m14633g(type, "type");
        C9677q.m14633g(titleText, "titleText");
        C9677q.m14633g(subtitle, "subtitle");
        C9677q.m14633g(helpCenterArticleLabel, "helpCenterArticleLabel");
        C9677q.m14633g(helpCenterArticleURL, "helpCenterArticleURL");
        C9677q.m14633g(extendedType, "extendedType");
        C9677q.m14633g(guildName, "guildName");
        this.backgroundColor = i;
        this.borderColor = i2;
        this.headerColor = i3;
        this.headerText = headerText;
        this.type = type;
        this.titleText = titleText;
        this.subtitle = subtitle;
        this.helpCenterArticleLabel = helpCenterArticleLabel;
        this.helpCenterArticleURL = helpCenterArticleURL;
        this.acceptLabelBackgroundColor = num;
        this.acceptLabelBorderColor = num2;
        this.acceptLabelColor = num3;
        this.acceptLabelText = str;
        this.bodyText = str2;
        this.bodyTextColor = num4;
        this.canBeAccepted = bool;
        this.channelIcon = str3;
        this.channelName = str4;
        this.embedCanBeTapped = bool2;
        this.memberText = str5;
        this.onlineText = str6;
        this.resolvingGradientEnd = num5;
        this.resolvingGradientStart = num6;
        this.splashHasRadialGradient = bool3;
        this.splashOpacity = num7;
        this.splashUrl = str7;
        this.inviteSplash = str8;
        this.subtitleColor = num8;
        this.thumbnailBackgroundColor = num9;
        this.thumbnailCornerRadius = num10;
        this.thumbnailText = str9;
        this.thumbnailUrl = str10;
        this.titleColor = num11;
        this.extendedType = extendedType;
        this.guildName = guildName;
        this.guildIcon = str11;
        this.headerIcon = str12;
    }
}
