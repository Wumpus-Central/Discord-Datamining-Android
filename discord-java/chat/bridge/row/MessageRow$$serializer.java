package com.discord.chat.bridge.row;

import androidx.recyclerview.widget.RecyclerView;
import bj.a2;
import bj.f0;
import bj.h;
import bj.m0;
import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.bridge.BackgroundHighlight$$serializer;
import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.MessageBase;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.MessageFrameSerializer;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.reaction.ReactionsTheme$$serializer;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.chat.bridge.truncation.Truncation$$serializer;
import com.discord.nearby.NearbyManager;
import j$.util.Spliterator;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.n;
import zi.a;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/row/MessageRow.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/row/MessageRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MessageRow$$serializer implements f0<MessageRow> {
    public static final MessageRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageRow$$serializer messageRow$$serializer = new MessageRow$$serializer();
        INSTANCE = messageRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(NearbyManager.PERMISSION_DENIED, messageRow$$serializer, 19);
        pluginGeneratedSerialDescriptor.l("index", false);
        pluginGeneratedSerialDescriptor.l("changeType", false);
        pluginGeneratedSerialDescriptor.l("jumped", true);
        pluginGeneratedSerialDescriptor.l("highlightJumpedOnceOnly", true);
        pluginGeneratedSerialDescriptor.l("message", false);
        pluginGeneratedSerialDescriptor.l("scrollTo", true);
        pluginGeneratedSerialDescriptor.l("animated", true);
        pluginGeneratedSerialDescriptor.l("canAddNewReactions", true);
        pluginGeneratedSerialDescriptor.l("addReactionLabel", true);
        pluginGeneratedSerialDescriptor.l("addNewReactionAccessibilityLabel", true);
        pluginGeneratedSerialDescriptor.l("addNewBurstReactionAccessibilityLabel", true);
        pluginGeneratedSerialDescriptor.l("reactionsTheme", true);
        pluginGeneratedSerialDescriptor.l("isHighlight", true);
        pluginGeneratedSerialDescriptor.l("renderContentOnly", true);
        pluginGeneratedSerialDescriptor.l("messageFrame", true);
        pluginGeneratedSerialDescriptor.l("reactTag", true);
        pluginGeneratedSerialDescriptor.l("truncation", true);
        pluginGeneratedSerialDescriptor.l("backgroundHighlight", true);
        pluginGeneratedSerialDescriptor.l("enableSwipeToReply", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageRow$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f5992a;
        h hVar = h.f5959a;
        a2 a2Var = a2.f5917a;
        return new KSerializer[]{m0Var, ChangeType.Serializer.INSTANCE, a.u(hVar), a.u(hVar), MessageSerializer.INSTANCE, a.u(hVar), a.u(hVar), a.u(hVar), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(ReactionsTheme$$serializer.INSTANCE), hVar, hVar, a.u(MessageFrameSerializer.INSTANCE), a.u(m0Var), a.u(Truncation$$serializer.INSTANCE), a.u(BackgroundHighlight$$serializer.INSTANCE), hVar};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MessageRow deserialize(Decoder decoder) {
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        int i10;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i11;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            i11 = b10.i(descriptor2, 0);
            obj9 = b10.y(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            h hVar = h.f5959a;
            obj10 = b10.n(descriptor2, 2, hVar, null);
            obj8 = b10.n(descriptor2, 3, hVar, null);
            obj7 = b10.y(descriptor2, 4, MessageSerializer.INSTANCE, null);
            obj6 = b10.n(descriptor2, 5, hVar, null);
            obj5 = b10.n(descriptor2, 6, hVar, null);
            obj4 = b10.n(descriptor2, 7, hVar, null);
            a2 a2Var = a2.f5917a;
            obj11 = b10.n(descriptor2, 8, a2Var, null);
            obj2 = b10.n(descriptor2, 9, a2Var, null);
            obj3 = b10.n(descriptor2, 10, a2Var, null);
            obj = b10.n(descriptor2, 11, ReactionsTheme$$serializer.INSTANCE, null);
            z10 = b10.C(descriptor2, 12);
            z11 = b10.C(descriptor2, 13);
            obj15 = b10.n(descriptor2, 14, MessageFrameSerializer.INSTANCE, null);
            obj14 = b10.n(descriptor2, 15, m0.f5992a, null);
            obj13 = b10.n(descriptor2, 16, Truncation$$serializer.INSTANCE, null);
            obj12 = b10.n(descriptor2, 17, BackgroundHighlight$$serializer.INSTANCE, null);
            z12 = b10.C(descriptor2, 18);
            i10 = 524287;
        } else {
            int i12 = 18;
            int i13 = 0;
            boolean z13 = true;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            obj7 = null;
            Object obj25 = null;
            Object obj26 = null;
            Object obj27 = null;
            Object obj28 = null;
            Object obj29 = null;
            int i14 = 0;
            boolean z14 = false;
            z11 = false;
            z10 = false;
            while (z13) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z13 = false;
                        i14 = i14;
                        break;
                    case 0:
                        i14 = b10.i(descriptor2, 0);
                        i13 |= 1;
                        z14 = z14;
                        break;
                    case 1:
                        z14 = z14;
                        obj25 = b10.y(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj25);
                        i13 |= 2;
                        i14 = i14;
                        break;
                    case 2:
                        z14 = z14;
                        obj19 = b10.n(descriptor2, 2, h.f5959a, obj19);
                        i13 |= 4;
                        i14 = i14;
                        break;
                    case 3:
                        z14 = z14;
                        obj18 = b10.n(descriptor2, 3, h.f5959a, obj18);
                        i13 |= 8;
                        i14 = i14;
                        break;
                    case 4:
                        z14 = z14;
                        obj7 = b10.y(descriptor2, 4, MessageSerializer.INSTANCE, obj7);
                        i13 |= 16;
                        i14 = i14;
                        break;
                    case 5:
                        z14 = z14;
                        obj16 = b10.n(descriptor2, 5, h.f5959a, obj16);
                        i13 |= 32;
                        i14 = i14;
                        break;
                    case 6:
                        z14 = z14;
                        obj24 = b10.n(descriptor2, 6, h.f5959a, obj24);
                        i13 |= 64;
                        i14 = i14;
                        break;
                    case 7:
                        z14 = z14;
                        obj23 = b10.n(descriptor2, 7, h.f5959a, obj23);
                        i13 |= 128;
                        i14 = i14;
                        break;
                    case 8:
                        z14 = z14;
                        obj22 = b10.n(descriptor2, 8, a2.f5917a, obj22);
                        i13 |= Spliterator.NONNULL;
                        i14 = i14;
                        break;
                    case 9:
                        z14 = z14;
                        obj17 = b10.n(descriptor2, 9, a2.f5917a, obj17);
                        i13 |= 512;
                        i14 = i14;
                        break;
                    case 10:
                        z14 = z14;
                        obj21 = b10.n(descriptor2, 10, a2.f5917a, obj21);
                        i13 |= Spliterator.IMMUTABLE;
                        i14 = i14;
                        break;
                    case 11:
                        z14 = z14;
                        obj20 = b10.n(descriptor2, 11, ReactionsTheme$$serializer.INSTANCE, obj20);
                        i13 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i14 = i14;
                        break;
                    case 12:
                        z14 = z14;
                        z10 = b10.C(descriptor2, 12);
                        i13 |= 4096;
                        i14 = i14;
                        break;
                    case 13:
                        z14 = z14;
                        z11 = b10.C(descriptor2, 13);
                        i13 |= 8192;
                        i14 = i14;
                        break;
                    case 14:
                        obj26 = b10.n(descriptor2, 14, MessageFrameSerializer.INSTANCE, obj26);
                        i13 |= Spliterator.SUBSIZED;
                        z14 = z14;
                        obj27 = obj27;
                        i14 = i14;
                        break;
                    case 15:
                        obj27 = b10.n(descriptor2, 15, m0.f5992a, obj27);
                        i13 |= 32768;
                        z14 = z14;
                        obj28 = obj28;
                        i14 = i14;
                        break;
                    case 16:
                        obj28 = b10.n(descriptor2, 16, Truncation$$serializer.INSTANCE, obj28);
                        i13 |= 65536;
                        z14 = z14;
                        obj29 = obj29;
                        i14 = i14;
                        break;
                    case 17:
                        z14 = z14;
                        obj29 = b10.n(descriptor2, 17, BackgroundHighlight$$serializer.INSTANCE, obj29);
                        i13 |= 131072;
                        i14 = i14;
                        break;
                    case 18:
                        z14 = b10.C(descriptor2, i12);
                        i13 |= 262144;
                        i14 = i14;
                        continue;
                    default:
                        throw new n(o10);
                }
                i12 = 18;
            }
            obj2 = obj17;
            obj9 = obj25;
            i10 = i13;
            obj = obj20;
            obj3 = obj21;
            z12 = z14;
            obj13 = obj28;
            obj15 = obj26;
            i11 = i14;
            obj6 = obj16;
            obj10 = obj19;
            obj11 = obj22;
            obj14 = obj27;
            obj4 = obj23;
            obj8 = obj18;
            obj12 = obj29;
            obj5 = obj24;
        }
        b10.c(descriptor2);
        return new MessageRow(i10, i11, (ChangeType) obj9, (Boolean) obj10, (Boolean) obj8, (MessageBase) obj7, (Boolean) obj6, (Boolean) obj5, (Boolean) obj4, (String) obj11, (String) obj2, (String) obj3, (ReactionsTheme) obj, z10, z11, (MessageFrame) obj15, (Integer) obj14, (Truncation) obj13, (BackgroundHighlight) obj12, z12, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MessageRow value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        MessageRow.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
