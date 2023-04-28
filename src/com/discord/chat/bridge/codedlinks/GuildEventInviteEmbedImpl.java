package com.discord.chat.bridge.codedlinks;

import androidx.recyclerview.widget.RecyclerView;
import bj.C3622a2;
import bj.C3652h;
import bj.C3676m0;
import bj.C3681n1;
import com.discord.chat.bridge.codedlinks.CodedLinkExtendedType;
import com.discord.chat.bridge.codedlinks.InviteType;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p163j$.util.Spliterator;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\bd\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ¨\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004§\u0001¨\u0001BÉ\u0003\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010\r\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010#\u001a\u0004\u0018\u00010\r\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010&\u001a\u0004\u0018\u00010\r\u0012\b\u0010'\u001a\u0004\u0018\u00010\r\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010*\u001a\u0004\u0018\u00010\r\u0012\b\u0010+\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010-\u001a\u0004\u0018\u00010\r\u0012\b\u0010.\u001a\u0004\u0018\u00010\r\u0012\b\u0010/\u001a\u0004\u0018\u00010\r\u0012\b\u00100\u001a\u0004\u0018\u00010\u0005\u0012\b\u00101\u001a\u0004\u0018\u00010\u0005\u0012\b\u00102\u001a\u0004\u0018\u00010\u0005\u0012\b\u00103\u001a\u0004\u0018\u00010\r\u0012\b\u00104\u001a\u0004\u0018\u00010\r\u0012\b\u00105\u001a\u0004\u0018\u00010\u0005\u0012\b\u00106\u001a\u0004\u0018\u00010\r\u0012\b\u00107\u001a\u0004\u0018\u000108¢\u0006\u0002\u00109Bù\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010:J\t\u0010n\u001a\u00020\u0005HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\u0010\u0010u\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010KJ\u000b\u0010v\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010y\u001a\u00020\u0005HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010KJ\u000b\u0010|\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010KJ\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\n\u0010\u0084\u0001\u001a\u00020\nHÆ\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010KJ\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\n\u0010\u008f\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u000fHÆ\u0003J\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010<J\u0088\u0004\u0010\u0099\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\r2\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\r2\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0003\u0010\u009a\u0001J\u0016\u0010\u009b\u0001\u001a\u00020\u001a2\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001HÖ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0005HÖ\u0001J\n\u0010\u009f\u0001\u001a\u00020\rHÖ\u0001J(\u0010 \u0001\u001a\u00030¡\u00012\u0007\u0010¢\u0001\u001a\u00020\u00002\b\u0010£\u0001\u001a\u00030¤\u00012\b\u0010¥\u0001\u001a\u00030¦\u0001HÇ\u0001R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\b>\u0010<R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\b?\u0010<R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010AR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010AR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010AR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010AR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\bH\u0010<R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010DR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010AR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010AR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010AR\u0018\u0010 \u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\n\n\u0002\u0010L\u001a\u0004\bR\u0010KR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0016\u0010!\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010AR\u0016\u0010\"\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010AR\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010DR\u0016\u0010#\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010AR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010AR\u0018\u0010$\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\bZ\u0010<R\u0016\u0010.\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010AR\u0018\u0010%\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\n\n\u0002\u0010L\u001a\u0004\b%\u0010KR\u0016\u0010&\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010AR\u0016\u0010'\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010AR\u0018\u0010(\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\b^\u0010<R\u0018\u0010)\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\b_\u0010<R\u0016\u0010*\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010AR\u0018\u0010+\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\n\n\u0002\u0010L\u001a\u0004\ba\u0010KR\u0018\u0010,\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\bb\u0010<R\u0016\u0010-\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010AR\u0016\u0010/\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010AR\u0018\u00100\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\be\u0010<R\u0018\u00101\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\bf\u0010<R\u0018\u00102\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\bg\u0010<R\u0016\u00103\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010AR\u0016\u00104\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010AR\u0018\u00105\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\bj\u0010<R\u0016\u00106\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010AR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010m¨\u0006©\u0001"}, m15073d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbed;", "Lcom/discord/chat/bridge/codedlinks/GuildInviteExtendedEmbed;", "Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;", "seen1", "", "seen2", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "extendedType", "Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "headerColor", "headerText", "", "type", "Lcom/discord/chat/bridge/codedlinks/InviteType;", "acceptLabelBackgroundColor", "acceptLabelBorderColor", "acceptLabelColor", "acceptLabelIcon", "acceptLabelText", "badgeCount", "badgeIcon", "bodyText", "bodyTextColor", "canBeAccepted", "", "channelIcon", "channelName", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "creatorAvatar", "embedCanBeTapped", "guildIcon", "guildName", "headerIcon", "headerTextColor", "isRsvped", "memberText", "onlineText", "resolvingGradientEnd", "resolvingGradientStart", "secondaryActionIcon", "splashHasRadialGradient", "splashOpacity", "splashUrl", "inviteSplash", "subtitle", "subtitleColor", "thumbnailBackgroundColor", "thumbnailCornerRadius", "thumbnailText", "thumbnailUrl", "titleColor", "titleText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;ILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IILcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;ILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAcceptLabelBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAcceptLabelBorderColor", "getAcceptLabelColor", "getAcceptLabelIcon", "()Ljava/lang/String;", "getAcceptLabelText", "getBackgroundColor", "()I", "getBadgeCount", "getBadgeIcon", "getBodyText", "getBodyTextColor", "getBorderColor", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChannelIcon", "getChannelName", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getCreatorAvatar", "getEmbedCanBeTapped", "getExtendedType", "()Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;", "getGuildIcon", "getGuildName", "getHeaderColor", "getHeaderIcon", "getHeaderText", "getHeaderTextColor", "getInviteSplash", "getMemberText", "getOnlineText", "getResolvingGradientEnd", "getResolvingGradientStart", "getSecondaryActionIcon", "getSplashHasRadialGradient", "getSplashOpacity", "getSplashUrl", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailText", "getThumbnailUrl", "getTitleColor", "getTitleText", "getType", "()Lcom/discord/chat/bridge/codedlinks/InviteType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component5", "component6", "component7", "component8", "component9", "copy", "(IILcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;ILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class GuildEventInviteEmbedImpl extends CodedLinkEmbed implements GuildEventInviteEmbed, GuildInviteExtendedEmbed {
    public static final Companion Companion = new Companion(null);
    private final Integer acceptLabelBackgroundColor;
    private final Integer acceptLabelBorderColor;
    private final Integer acceptLabelColor;
    private final String acceptLabelIcon;
    private final String acceptLabelText;
    private final int backgroundColor;
    private final String badgeCount;
    private final String badgeIcon;
    private final String bodyText;
    private final Integer bodyTextColor;
    private final int borderColor;
    private final Boolean canBeAccepted;
    private final String channelIcon;
    private final String channelName;
    private final StructurableText content;
    private final String creatorAvatar;
    private final Boolean embedCanBeTapped;
    private final CodedLinkExtendedType extendedType;
    private final String guildIcon;
    private final String guildName;
    private final int headerColor;
    private final String headerIcon;
    private final String headerText;
    private final Integer headerTextColor;
    private final String inviteSplash;
    private final Boolean isRsvped;
    private final String memberText;
    private final String onlineText;
    private final Integer resolvingGradientEnd;
    private final Integer resolvingGradientStart;
    private final String secondaryActionIcon;
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

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GuildEventInviteEmbedImpl> serializer() {
            return GuildEventInviteEmbedImpl$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GuildEventInviteEmbedImpl(int i, int i2, int i3, int i4, CodedLinkExtendedType codedLinkExtendedType, int i5, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, Integer num4, Boolean bool, String str7, String str8, StructurableText structurableText, String str9, Boolean bool2, String str10, String str11, String str12, Integer num5, Boolean bool3, String str13, String str14, Integer num6, Integer num7, String str15, Boolean bool4, Integer num8, String str16, String str17, String str18, Integer num9, Integer num10, Integer num11, String str19, String str20, Integer num12, String str21, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((59 != (i & 59)) || ((i2 & 0) != 0)) {
            C3681n1.m33819a(new int[]{i, i2}, new int[]{59, 0}, GuildEventInviteEmbedImpl$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundColor = i3;
        this.borderColor = i4;
        this.extendedType = (i & 4) == 0 ? CodedLinkExtendedType.GUILD_SCHEDULED_EVENT : codedLinkExtendedType;
        this.headerColor = i5;
        this.headerText = str;
        this.type = inviteType;
        if ((i & 64) == 0) {
            this.acceptLabelBackgroundColor = null;
        } else {
            this.acceptLabelBackgroundColor = num;
        }
        if ((i & 128) == 0) {
            this.acceptLabelBorderColor = null;
        } else {
            this.acceptLabelBorderColor = num2;
        }
        if ((i & Spliterator.NONNULL) == 0) {
            this.acceptLabelColor = null;
        } else {
            this.acceptLabelColor = num3;
        }
        if ((i & 512) == 0) {
            this.acceptLabelIcon = null;
        } else {
            this.acceptLabelIcon = str2;
        }
        if ((i & Spliterator.IMMUTABLE) == 0) {
            this.acceptLabelText = null;
        } else {
            this.acceptLabelText = str3;
        }
        if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.badgeCount = null;
        } else {
            this.badgeCount = str4;
        }
        if ((i & 4096) == 0) {
            this.badgeIcon = null;
        } else {
            this.badgeIcon = str5;
        }
        if ((i & 8192) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str6;
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
            this.channelIcon = str7;
        }
        if ((131072 & i) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str8;
        }
        if ((262144 & i) == 0) {
            this.content = null;
        } else {
            this.content = structurableText;
        }
        if ((524288 & i) == 0) {
            this.creatorAvatar = null;
        } else {
            this.creatorAvatar = str9;
        }
        if ((1048576 & i) == 0) {
            this.embedCanBeTapped = null;
        } else {
            this.embedCanBeTapped = bool2;
        }
        if ((2097152 & i) == 0) {
            this.guildIcon = null;
        } else {
            this.guildIcon = str10;
        }
        if ((4194304 & i) == 0) {
            this.guildName = null;
        } else {
            this.guildName = str11;
        }
        if ((8388608 & i) == 0) {
            this.headerIcon = null;
        } else {
            this.headerIcon = str12;
        }
        if ((16777216 & i) == 0) {
            this.headerTextColor = null;
        } else {
            this.headerTextColor = num5;
        }
        if ((33554432 & i) == 0) {
            this.isRsvped = null;
        } else {
            this.isRsvped = bool3;
        }
        if ((67108864 & i) == 0) {
            this.memberText = null;
        } else {
            this.memberText = str13;
        }
        if ((134217728 & i) == 0) {
            this.onlineText = null;
        } else {
            this.onlineText = str14;
        }
        if ((268435456 & i) == 0) {
            this.resolvingGradientEnd = null;
        } else {
            this.resolvingGradientEnd = num6;
        }
        if ((536870912 & i) == 0) {
            this.resolvingGradientStart = null;
        } else {
            this.resolvingGradientStart = num7;
        }
        if ((1073741824 & i) == 0) {
            this.secondaryActionIcon = null;
        } else {
            this.secondaryActionIcon = str15;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.splashHasRadialGradient = null;
        } else {
            this.splashHasRadialGradient = bool4;
        }
        if ((i2 & 1) == 0) {
            this.splashOpacity = null;
        } else {
            this.splashOpacity = num8;
        }
        if ((i2 & 2) == 0) {
            this.splashUrl = null;
        } else {
            this.splashUrl = str16;
        }
        if ((i2 & 4) == 0) {
            this.inviteSplash = null;
        } else {
            this.inviteSplash = str17;
        }
        if ((i2 & 8) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str18;
        }
        if ((i2 & 16) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = num9;
        }
        if ((i2 & 32) == 0) {
            this.thumbnailBackgroundColor = null;
        } else {
            this.thumbnailBackgroundColor = num10;
        }
        if ((i2 & 64) == 0) {
            this.thumbnailCornerRadius = null;
        } else {
            this.thumbnailCornerRadius = num11;
        }
        if ((i2 & 128) == 0) {
            this.thumbnailText = null;
        } else {
            this.thumbnailText = str19;
        }
        if ((i2 & Spliterator.NONNULL) == 0) {
            this.thumbnailUrl = null;
        } else {
            this.thumbnailUrl = str20;
        }
        if ((i2 & 512) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = num12;
        }
        if ((i2 & Spliterator.IMMUTABLE) == 0) {
            this.titleText = null;
        } else {
            this.titleText = str21;
        }
    }

    public static final void write$Self(GuildEventInviteEmbedImpl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        boolean z = false;
        output.mo13866x(serialDesc, 0, self.getBackgroundColor());
        output.mo13866x(serialDesc, 1, self.getBorderColor());
        if (output.mo13893A(serialDesc, 2) || self.getExtendedType() != CodedLinkExtendedType.GUILD_SCHEDULED_EVENT) {
            output.mo13870t(serialDesc, 2, CodedLinkExtendedType.Serializer.INSTANCE, self.getExtendedType());
        }
        output.mo13866x(serialDesc, 3, self.getHeaderColor());
        output.mo13864z(serialDesc, 4, self.getHeaderText());
        output.mo13870t(serialDesc, 5, InviteType.Serializer.INSTANCE, self.getType());
        if (output.mo13893A(serialDesc, 6) || self.getAcceptLabelBackgroundColor() != null) {
            output.mo13874p(serialDesc, 6, C3676m0.f5992a, self.getAcceptLabelBackgroundColor());
        }
        if (output.mo13893A(serialDesc, 7) || self.getAcceptLabelBorderColor() != null) {
            output.mo13874p(serialDesc, 7, C3676m0.f5992a, self.getAcceptLabelBorderColor());
        }
        if (output.mo13893A(serialDesc, 8) || self.getAcceptLabelColor() != null) {
            output.mo13874p(serialDesc, 8, C3676m0.f5992a, self.getAcceptLabelColor());
        }
        if (output.mo13893A(serialDesc, 9) || self.getAcceptLabelIcon() != null) {
            output.mo13874p(serialDesc, 9, C3622a2.f5917a, self.getAcceptLabelIcon());
        }
        if (output.mo13893A(serialDesc, 10) || self.getAcceptLabelText() != null) {
            output.mo13874p(serialDesc, 10, C3622a2.f5917a, self.getAcceptLabelText());
        }
        if (output.mo13893A(serialDesc, 11) || self.getBadgeCount() != null) {
            output.mo13874p(serialDesc, 11, C3622a2.f5917a, self.getBadgeCount());
        }
        if (output.mo13893A(serialDesc, 12) || self.getBadgeIcon() != null) {
            output.mo13874p(serialDesc, 12, C3622a2.f5917a, self.getBadgeIcon());
        }
        if (output.mo13893A(serialDesc, 13) || self.getBodyText() != null) {
            output.mo13874p(serialDesc, 13, C3622a2.f5917a, self.getBodyText());
        }
        if (output.mo13893A(serialDesc, 14) || self.getBodyTextColor() != null) {
            output.mo13874p(serialDesc, 14, C3676m0.f5992a, self.getBodyTextColor());
        }
        if (output.mo13893A(serialDesc, 15) || self.getCanBeAccepted() != null) {
            output.mo13874p(serialDesc, 15, C3652h.f5959a, self.getCanBeAccepted());
        }
        if (output.mo13893A(serialDesc, 16) || self.getChannelIcon() != null) {
            output.mo13874p(serialDesc, 16, C3622a2.f5917a, self.getChannelIcon());
        }
        if (output.mo13893A(serialDesc, 17) || self.getChannelName() != null) {
            output.mo13874p(serialDesc, 17, C3622a2.f5917a, self.getChannelName());
        }
        if (output.mo13893A(serialDesc, 18) || self.getContent() != null) {
            output.mo13874p(serialDesc, 18, StructurableTextSerializer.INSTANCE, self.getContent());
        }
        if (output.mo13893A(serialDesc, 19) || self.getCreatorAvatar() != null) {
            output.mo13874p(serialDesc, 19, C3622a2.f5917a, self.getCreatorAvatar());
        }
        if (output.mo13893A(serialDesc, 20) || self.getEmbedCanBeTapped() != null) {
            output.mo13874p(serialDesc, 20, C3652h.f5959a, self.getEmbedCanBeTapped());
        }
        if (output.mo13893A(serialDesc, 21) || self.getGuildIcon() != null) {
            output.mo13874p(serialDesc, 21, C3622a2.f5917a, self.getGuildIcon());
        }
        if (output.mo13893A(serialDesc, 22) || self.getGuildName() != null) {
            output.mo13874p(serialDesc, 22, C3622a2.f5917a, self.getGuildName());
        }
        if (output.mo13893A(serialDesc, 23) || self.getHeaderIcon() != null) {
            output.mo13874p(serialDesc, 23, C3622a2.f5917a, self.getHeaderIcon());
        }
        if (output.mo13893A(serialDesc, 24) || self.getHeaderTextColor() != null) {
            output.mo13874p(serialDesc, 24, C3676m0.f5992a, self.getHeaderTextColor());
        }
        if (output.mo13893A(serialDesc, 25) || self.isRsvped() != null) {
            output.mo13874p(serialDesc, 25, C3652h.f5959a, self.isRsvped());
        }
        if (output.mo13893A(serialDesc, 26) || self.getMemberText() != null) {
            output.mo13874p(serialDesc, 26, C3622a2.f5917a, self.getMemberText());
        }
        if (output.mo13893A(serialDesc, 27) || self.getOnlineText() != null) {
            output.mo13874p(serialDesc, 27, C3622a2.f5917a, self.getOnlineText());
        }
        if (output.mo13893A(serialDesc, 28) || self.getResolvingGradientEnd() != null) {
            output.mo13874p(serialDesc, 28, C3676m0.f5992a, self.getResolvingGradientEnd());
        }
        if (output.mo13893A(serialDesc, 29) || self.getResolvingGradientStart() != null) {
            output.mo13874p(serialDesc, 29, C3676m0.f5992a, self.getResolvingGradientStart());
        }
        if (output.mo13893A(serialDesc, 30) || self.getSecondaryActionIcon() != null) {
            output.mo13874p(serialDesc, 30, C3622a2.f5917a, self.getSecondaryActionIcon());
        }
        if (output.mo13893A(serialDesc, 31) || self.getSplashHasRadialGradient() != null) {
            output.mo13874p(serialDesc, 31, C3652h.f5959a, self.getSplashHasRadialGradient());
        }
        if (output.mo13893A(serialDesc, 32) || self.getSplashOpacity() != null) {
            output.mo13874p(serialDesc, 32, C3676m0.f5992a, self.getSplashOpacity());
        }
        if (output.mo13893A(serialDesc, 33) || self.getSplashUrl() != null) {
            output.mo13874p(serialDesc, 33, C3622a2.f5917a, self.getSplashUrl());
        }
        if (output.mo13893A(serialDesc, 34) || self.getInviteSplash() != null) {
            output.mo13874p(serialDesc, 34, C3622a2.f5917a, self.getInviteSplash());
        }
        if (output.mo13893A(serialDesc, 35) || self.getSubtitle() != null) {
            output.mo13874p(serialDesc, 35, C3622a2.f5917a, self.getSubtitle());
        }
        if (output.mo13893A(serialDesc, 36) || self.getSubtitleColor() != null) {
            output.mo13874p(serialDesc, 36, C3676m0.f5992a, self.getSubtitleColor());
        }
        if (output.mo13893A(serialDesc, 37) || self.getThumbnailBackgroundColor() != null) {
            output.mo13874p(serialDesc, 37, C3676m0.f5992a, self.getThumbnailBackgroundColor());
        }
        if (output.mo13893A(serialDesc, 38) || self.getThumbnailCornerRadius() != null) {
            output.mo13874p(serialDesc, 38, C3676m0.f5992a, self.getThumbnailCornerRadius());
        }
        if (output.mo13893A(serialDesc, 39) || self.getThumbnailText() != null) {
            output.mo13874p(serialDesc, 39, C3622a2.f5917a, self.getThumbnailText());
        }
        if (output.mo13893A(serialDesc, 40) || self.getThumbnailUrl() != null) {
            output.mo13874p(serialDesc, 40, C3622a2.f5917a, self.getThumbnailUrl());
        }
        if (output.mo13893A(serialDesc, 41) || self.getTitleColor() != null) {
            output.mo13874p(serialDesc, 41, C3676m0.f5992a, self.getTitleColor());
        }
        if (output.mo13893A(serialDesc, 42) || self.getTitleText() != null) {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 42, C3622a2.f5917a, self.getTitleText());
        }
    }

    public final int component1() {
        return getBackgroundColor();
    }

    public final String component10() {
        return getAcceptLabelIcon();
    }

    public final String component11() {
        return getAcceptLabelText();
    }

    public final String component12() {
        return getBadgeCount();
    }

    public final String component13() {
        return getBadgeIcon();
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

    public final StructurableText component19() {
        return getContent();
    }

    public final int component2() {
        return getBorderColor();
    }

    public final String component20() {
        return getCreatorAvatar();
    }

    public final Boolean component21() {
        return getEmbedCanBeTapped();
    }

    public final String component22() {
        return getGuildIcon();
    }

    public final String component23() {
        return getGuildName();
    }

    public final String component24() {
        return getHeaderIcon();
    }

    public final Integer component25() {
        return getHeaderTextColor();
    }

    public final Boolean component26() {
        return isRsvped();
    }

    public final String component27() {
        return getMemberText();
    }

    public final String component28() {
        return getOnlineText();
    }

    public final Integer component29() {
        return getResolvingGradientEnd();
    }

    public final CodedLinkExtendedType component3() {
        return getExtendedType();
    }

    public final Integer component30() {
        return getResolvingGradientStart();
    }

    public final String component31() {
        return getSecondaryActionIcon();
    }

    public final Boolean component32() {
        return getSplashHasRadialGradient();
    }

    public final Integer component33() {
        return getSplashOpacity();
    }

    public final String component34() {
        return getSplashUrl();
    }

    public final String component35() {
        return getInviteSplash();
    }

    public final String component36() {
        return getSubtitle();
    }

    public final Integer component37() {
        return getSubtitleColor();
    }

    public final Integer component38() {
        return getThumbnailBackgroundColor();
    }

    public final Integer component39() {
        return getThumbnailCornerRadius();
    }

    public final int component4() {
        return getHeaderColor();
    }

    public final String component40() {
        return getThumbnailText();
    }

    public final String component41() {
        return getThumbnailUrl();
    }

    public final Integer component42() {
        return getTitleColor();
    }

    public final String component43() {
        return getTitleText();
    }

    public final String component5() {
        return getHeaderText();
    }

    public final InviteType component6() {
        return getType();
    }

    public final Integer component7() {
        return getAcceptLabelBackgroundColor();
    }

    public final Integer component8() {
        return getAcceptLabelBorderColor();
    }

    public final Integer component9() {
        return getAcceptLabelColor();
    }

    public final GuildEventInviteEmbedImpl copy(int i, int i2, CodedLinkExtendedType extendedType, int i3, String headerText, InviteType type, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, Integer num4, Boolean bool, String str6, String str7, StructurableText structurableText, String str8, Boolean bool2, String str9, String str10, String str11, Integer num5, Boolean bool3, String str12, String str13, Integer num6, Integer num7, String str14, Boolean bool4, Integer num8, String str15, String str16, String str17, Integer num9, Integer num10, Integer num11, String str18, String str19, Integer num12, String str20) {
        C9971q.m14633g(extendedType, "extendedType");
        C9971q.m14633g(headerText, "headerText");
        C9971q.m14633g(type, "type");
        return new GuildEventInviteEmbedImpl(i, i2, extendedType, i3, headerText, type, num, num2, num3, str, str2, str3, str4, str5, num4, bool, str6, str7, structurableText, str8, bool2, str9, str10, str11, num5, bool3, str12, str13, num6, num7, str14, bool4, num8, str15, str16, str17, num9, num10, num11, str18, str19, num12, str20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuildEventInviteEmbedImpl)) {
            return false;
        }
        GuildEventInviteEmbedImpl guildEventInviteEmbedImpl = (GuildEventInviteEmbedImpl) obj;
        return getBackgroundColor() == guildEventInviteEmbedImpl.getBackgroundColor() && getBorderColor() == guildEventInviteEmbedImpl.getBorderColor() && getExtendedType() == guildEventInviteEmbedImpl.getExtendedType() && getHeaderColor() == guildEventInviteEmbedImpl.getHeaderColor() && C9971q.m14638b(getHeaderText(), guildEventInviteEmbedImpl.getHeaderText()) && getType() == guildEventInviteEmbedImpl.getType() && C9971q.m14638b(getAcceptLabelBackgroundColor(), guildEventInviteEmbedImpl.getAcceptLabelBackgroundColor()) && C9971q.m14638b(getAcceptLabelBorderColor(), guildEventInviteEmbedImpl.getAcceptLabelBorderColor()) && C9971q.m14638b(getAcceptLabelColor(), guildEventInviteEmbedImpl.getAcceptLabelColor()) && C9971q.m14638b(getAcceptLabelIcon(), guildEventInviteEmbedImpl.getAcceptLabelIcon()) && C9971q.m14638b(getAcceptLabelText(), guildEventInviteEmbedImpl.getAcceptLabelText()) && C9971q.m14638b(getBadgeCount(), guildEventInviteEmbedImpl.getBadgeCount()) && C9971q.m14638b(getBadgeIcon(), guildEventInviteEmbedImpl.getBadgeIcon()) && C9971q.m14638b(getBodyText(), guildEventInviteEmbedImpl.getBodyText()) && C9971q.m14638b(getBodyTextColor(), guildEventInviteEmbedImpl.getBodyTextColor()) && C9971q.m14638b(getCanBeAccepted(), guildEventInviteEmbedImpl.getCanBeAccepted()) && C9971q.m14638b(getChannelIcon(), guildEventInviteEmbedImpl.getChannelIcon()) && C9971q.m14638b(getChannelName(), guildEventInviteEmbedImpl.getChannelName()) && C9971q.m14638b(getContent(), guildEventInviteEmbedImpl.getContent()) && C9971q.m14638b(getCreatorAvatar(), guildEventInviteEmbedImpl.getCreatorAvatar()) && C9971q.m14638b(getEmbedCanBeTapped(), guildEventInviteEmbedImpl.getEmbedCanBeTapped()) && C9971q.m14638b(getGuildIcon(), guildEventInviteEmbedImpl.getGuildIcon()) && C9971q.m14638b(getGuildName(), guildEventInviteEmbedImpl.getGuildName()) && C9971q.m14638b(getHeaderIcon(), guildEventInviteEmbedImpl.getHeaderIcon()) && C9971q.m14638b(getHeaderTextColor(), guildEventInviteEmbedImpl.getHeaderTextColor()) && C9971q.m14638b(isRsvped(), guildEventInviteEmbedImpl.isRsvped()) && C9971q.m14638b(getMemberText(), guildEventInviteEmbedImpl.getMemberText()) && C9971q.m14638b(getOnlineText(), guildEventInviteEmbedImpl.getOnlineText()) && C9971q.m14638b(getResolvingGradientEnd(), guildEventInviteEmbedImpl.getResolvingGradientEnd()) && C9971q.m14638b(getResolvingGradientStart(), guildEventInviteEmbedImpl.getResolvingGradientStart()) && C9971q.m14638b(getSecondaryActionIcon(), guildEventInviteEmbedImpl.getSecondaryActionIcon()) && C9971q.m14638b(getSplashHasRadialGradient(), guildEventInviteEmbedImpl.getSplashHasRadialGradient()) && C9971q.m14638b(getSplashOpacity(), guildEventInviteEmbedImpl.getSplashOpacity()) && C9971q.m14638b(getSplashUrl(), guildEventInviteEmbedImpl.getSplashUrl()) && C9971q.m14638b(getInviteSplash(), guildEventInviteEmbedImpl.getInviteSplash()) && C9971q.m14638b(getSubtitle(), guildEventInviteEmbedImpl.getSubtitle()) && C9971q.m14638b(getSubtitleColor(), guildEventInviteEmbedImpl.getSubtitleColor()) && C9971q.m14638b(getThumbnailBackgroundColor(), guildEventInviteEmbedImpl.getThumbnailBackgroundColor()) && C9971q.m14638b(getThumbnailCornerRadius(), guildEventInviteEmbedImpl.getThumbnailCornerRadius()) && C9971q.m14638b(getThumbnailText(), guildEventInviteEmbedImpl.getThumbnailText()) && C9971q.m14638b(getThumbnailUrl(), guildEventInviteEmbedImpl.getThumbnailUrl()) && C9971q.m14638b(getTitleColor(), guildEventInviteEmbedImpl.getTitleColor()) && C9971q.m14638b(getTitleText(), guildEventInviteEmbedImpl.getTitleText());
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

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public String getAcceptLabelIcon() {
        return this.acceptLabelIcon;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public String getAcceptLabelText() {
        return this.acceptLabelText;
    }

    @Override // com.discord.chat.bridge.codedlinks.CodedLinkEmbed
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public String getBadgeCount() {
        return this.badgeCount;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public String getBadgeIcon() {
        return this.badgeIcon;
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

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public StructurableText getContent() {
        return this.content;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public String getCreatorAvatar() {
        return this.creatorAvatar;
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

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public Integer getHeaderTextColor() {
        return this.headerTextColor;
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

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public String getSecondaryActionIcon() {
        return this.secondaryActionIcon;
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
        int backgroundColor = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((getBackgroundColor() * 31) + getBorderColor()) * 31) + getExtendedType().hashCode()) * 31) + getHeaderColor()) * 31) + getHeaderText().hashCode()) * 31) + getType().hashCode()) * 31) + (getAcceptLabelBackgroundColor() == null ? 0 : getAcceptLabelBackgroundColor().hashCode())) * 31) + (getAcceptLabelBorderColor() == null ? 0 : getAcceptLabelBorderColor().hashCode())) * 31) + (getAcceptLabelColor() == null ? 0 : getAcceptLabelColor().hashCode())) * 31) + (getAcceptLabelIcon() == null ? 0 : getAcceptLabelIcon().hashCode())) * 31) + (getAcceptLabelText() == null ? 0 : getAcceptLabelText().hashCode())) * 31) + (getBadgeCount() == null ? 0 : getBadgeCount().hashCode())) * 31) + (getBadgeIcon() == null ? 0 : getBadgeIcon().hashCode())) * 31) + (getBodyText() == null ? 0 : getBodyText().hashCode())) * 31) + (getBodyTextColor() == null ? 0 : getBodyTextColor().hashCode())) * 31) + (getCanBeAccepted() == null ? 0 : getCanBeAccepted().hashCode())) * 31) + (getChannelIcon() == null ? 0 : getChannelIcon().hashCode())) * 31) + (getChannelName() == null ? 0 : getChannelName().hashCode())) * 31) + (getContent() == null ? 0 : getContent().hashCode())) * 31) + (getCreatorAvatar() == null ? 0 : getCreatorAvatar().hashCode())) * 31) + (getEmbedCanBeTapped() == null ? 0 : getEmbedCanBeTapped().hashCode())) * 31) + (getGuildIcon() == null ? 0 : getGuildIcon().hashCode())) * 31) + (getGuildName() == null ? 0 : getGuildName().hashCode())) * 31) + (getHeaderIcon() == null ? 0 : getHeaderIcon().hashCode())) * 31) + (getHeaderTextColor() == null ? 0 : getHeaderTextColor().hashCode())) * 31) + (isRsvped() == null ? 0 : isRsvped().hashCode())) * 31) + (getMemberText() == null ? 0 : getMemberText().hashCode())) * 31) + (getOnlineText() == null ? 0 : getOnlineText().hashCode())) * 31) + (getResolvingGradientEnd() == null ? 0 : getResolvingGradientEnd().hashCode())) * 31) + (getResolvingGradientStart() == null ? 0 : getResolvingGradientStart().hashCode())) * 31) + (getSecondaryActionIcon() == null ? 0 : getSecondaryActionIcon().hashCode())) * 31) + (getSplashHasRadialGradient() == null ? 0 : getSplashHasRadialGradient().hashCode())) * 31) + (getSplashOpacity() == null ? 0 : getSplashOpacity().hashCode())) * 31) + (getSplashUrl() == null ? 0 : getSplashUrl().hashCode())) * 31) + (getInviteSplash() == null ? 0 : getInviteSplash().hashCode())) * 31) + (getSubtitle() == null ? 0 : getSubtitle().hashCode())) * 31) + (getSubtitleColor() == null ? 0 : getSubtitleColor().hashCode())) * 31) + (getThumbnailBackgroundColor() == null ? 0 : getThumbnailBackgroundColor().hashCode())) * 31) + (getThumbnailCornerRadius() == null ? 0 : getThumbnailCornerRadius().hashCode())) * 31) + (getThumbnailText() == null ? 0 : getThumbnailText().hashCode())) * 31) + (getThumbnailUrl() == null ? 0 : getThumbnailUrl().hashCode())) * 31) + (getTitleColor() == null ? 0 : getTitleColor().hashCode())) * 31;
        if (getTitleText() != null) {
            i = getTitleText().hashCode();
        }
        return backgroundColor + i;
    }

    @Override // com.discord.chat.bridge.codedlinks.GuildEventInviteEmbed
    public Boolean isRsvped() {
        return this.isRsvped;
    }

    public String toString() {
        int backgroundColor = getBackgroundColor();
        int borderColor = getBorderColor();
        CodedLinkExtendedType extendedType = getExtendedType();
        int headerColor = getHeaderColor();
        String headerText = getHeaderText();
        InviteType type = getType();
        Integer acceptLabelBackgroundColor = getAcceptLabelBackgroundColor();
        Integer acceptLabelBorderColor = getAcceptLabelBorderColor();
        Integer acceptLabelColor = getAcceptLabelColor();
        String acceptLabelIcon = getAcceptLabelIcon();
        String acceptLabelText = getAcceptLabelText();
        String badgeCount = getBadgeCount();
        String badgeIcon = getBadgeIcon();
        String bodyText = getBodyText();
        Integer bodyTextColor = getBodyTextColor();
        Boolean canBeAccepted = getCanBeAccepted();
        String channelIcon = getChannelIcon();
        String channelName = getChannelName();
        StructurableText content = getContent();
        String creatorAvatar = getCreatorAvatar();
        Boolean embedCanBeTapped = getEmbedCanBeTapped();
        String guildIcon = getGuildIcon();
        String guildName = getGuildName();
        String headerIcon = getHeaderIcon();
        Integer headerTextColor = getHeaderTextColor();
        Boolean isRsvped = isRsvped();
        String memberText = getMemberText();
        String onlineText = getOnlineText();
        Integer resolvingGradientEnd = getResolvingGradientEnd();
        Integer resolvingGradientStart = getResolvingGradientStart();
        String secondaryActionIcon = getSecondaryActionIcon();
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
        return "GuildEventInviteEmbedImpl(backgroundColor=" + backgroundColor + ", borderColor=" + borderColor + ", extendedType=" + extendedType + ", headerColor=" + headerColor + ", headerText=" + headerText + ", type=" + type + ", acceptLabelBackgroundColor=" + acceptLabelBackgroundColor + ", acceptLabelBorderColor=" + acceptLabelBorderColor + ", acceptLabelColor=" + acceptLabelColor + ", acceptLabelIcon=" + acceptLabelIcon + ", acceptLabelText=" + acceptLabelText + ", badgeCount=" + badgeCount + ", badgeIcon=" + badgeIcon + ", bodyText=" + bodyText + ", bodyTextColor=" + bodyTextColor + ", canBeAccepted=" + canBeAccepted + ", channelIcon=" + channelIcon + ", channelName=" + channelName + ", content=" + content + ", creatorAvatar=" + creatorAvatar + ", embedCanBeTapped=" + embedCanBeTapped + ", guildIcon=" + guildIcon + ", guildName=" + guildName + ", headerIcon=" + headerIcon + ", headerTextColor=" + headerTextColor + ", isRsvped=" + isRsvped + ", memberText=" + memberText + ", onlineText=" + onlineText + ", resolvingGradientEnd=" + resolvingGradientEnd + ", resolvingGradientStart=" + resolvingGradientStart + ", secondaryActionIcon=" + secondaryActionIcon + ", splashHasRadialGradient=" + splashHasRadialGradient + ", splashOpacity=" + splashOpacity + ", splashUrl=" + splashUrl + ", inviteSplash=" + inviteSplash + ", subtitle=" + subtitle + ", subtitleColor=" + subtitleColor + ", thumbnailBackgroundColor=" + thumbnailBackgroundColor + ", thumbnailCornerRadius=" + thumbnailCornerRadius + ", thumbnailText=" + thumbnailText + ", thumbnailUrl=" + thumbnailUrl + ", titleColor=" + titleColor + ", titleText=" + titleText + ")";
    }

    public /* synthetic */ GuildEventInviteEmbedImpl(int i, int i2, CodedLinkExtendedType codedLinkExtendedType, int i3, String str, InviteType inviteType, Integer num, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, Integer num4, Boolean bool, String str7, String str8, StructurableText structurableText, String str9, Boolean bool2, String str10, String str11, String str12, Integer num5, Boolean bool3, String str13, String str14, Integer num6, Integer num7, String str15, Boolean bool4, Integer num8, String str16, String str17, String str18, Integer num9, Integer num10, Integer num11, String str19, String str20, Integer num12, String str21, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? CodedLinkExtendedType.GUILD_SCHEDULED_EVENT : codedLinkExtendedType, i3, str, inviteType, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? null : num2, (i4 & Spliterator.NONNULL) != 0 ? null : num3, (i4 & 512) != 0 ? null : str2, (i4 & Spliterator.IMMUTABLE) != 0 ? null : str3, (i4 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str4, (i4 & 4096) != 0 ? null : str5, (i4 & 8192) != 0 ? null : str6, (i4 & Spliterator.SUBSIZED) != 0 ? null : num4, (32768 & i4) != 0 ? null : bool, (65536 & i4) != 0 ? null : str7, (131072 & i4) != 0 ? null : str8, (262144 & i4) != 0 ? null : structurableText, (524288 & i4) != 0 ? null : str9, (1048576 & i4) != 0 ? null : bool2, (2097152 & i4) != 0 ? null : str10, (4194304 & i4) != 0 ? null : str11, (8388608 & i4) != 0 ? null : str12, (16777216 & i4) != 0 ? null : num5, (33554432 & i4) != 0 ? null : bool3, (67108864 & i4) != 0 ? null : str13, (134217728 & i4) != 0 ? null : str14, (268435456 & i4) != 0 ? null : num6, (536870912 & i4) != 0 ? null : num7, (1073741824 & i4) != 0 ? null : str15, (i4 & Integer.MIN_VALUE) != 0 ? null : bool4, (i5 & 1) != 0 ? null : num8, (i5 & 2) != 0 ? null : str16, (i5 & 4) != 0 ? null : str17, (i5 & 8) != 0 ? null : str18, (i5 & 16) != 0 ? null : num9, (i5 & 32) != 0 ? null : num10, (i5 & 64) != 0 ? null : num11, (i5 & 128) != 0 ? null : str19, (i5 & Spliterator.NONNULL) != 0 ? null : str20, (i5 & 512) != 0 ? null : num12, (i5 & Spliterator.IMMUTABLE) != 0 ? null : str21);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildEventInviteEmbedImpl(int i, int i2, CodedLinkExtendedType extendedType, int i3, String headerText, InviteType type, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, Integer num4, Boolean bool, String str6, String str7, StructurableText structurableText, String str8, Boolean bool2, String str9, String str10, String str11, Integer num5, Boolean bool3, String str12, String str13, Integer num6, Integer num7, String str14, Boolean bool4, Integer num8, String str15, String str16, String str17, Integer num9, Integer num10, Integer num11, String str18, String str19, Integer num12, String str20) {
        super(null);
        C9971q.m14633g(extendedType, "extendedType");
        C9971q.m14633g(headerText, "headerText");
        C9971q.m14633g(type, "type");
        this.backgroundColor = i;
        this.borderColor = i2;
        this.extendedType = extendedType;
        this.headerColor = i3;
        this.headerText = headerText;
        this.type = type;
        this.acceptLabelBackgroundColor = num;
        this.acceptLabelBorderColor = num2;
        this.acceptLabelColor = num3;
        this.acceptLabelIcon = str;
        this.acceptLabelText = str2;
        this.badgeCount = str3;
        this.badgeIcon = str4;
        this.bodyText = str5;
        this.bodyTextColor = num4;
        this.canBeAccepted = bool;
        this.channelIcon = str6;
        this.channelName = str7;
        this.content = structurableText;
        this.creatorAvatar = str8;
        this.embedCanBeTapped = bool2;
        this.guildIcon = str9;
        this.guildName = str10;
        this.headerIcon = str11;
        this.headerTextColor = num5;
        this.isRsvped = bool3;
        this.memberText = str12;
        this.onlineText = str13;
        this.resolvingGradientEnd = num6;
        this.resolvingGradientStart = num7;
        this.secondaryActionIcon = str14;
        this.splashHasRadialGradient = bool4;
        this.splashOpacity = num8;
        this.splashUrl = str15;
        this.inviteSplash = str16;
        this.subtitle = str17;
        this.subtitleColor = num9;
        this.thumbnailBackgroundColor = num10;
        this.thumbnailCornerRadius = num11;
        this.thumbnailText = str18;
        this.thumbnailUrl = str19;
        this.titleColor = num12;
        this.titleText = str20;
    }
}
