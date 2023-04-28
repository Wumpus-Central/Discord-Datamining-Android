package com.discord.chat.bridge.row;

import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2530h;
import bj.C2555m0;
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
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9967c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p164j$.util.Spliterator;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/row/MessageRow.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/row/MessageRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MessageRow$$serializer implements AbstractC2522f0<MessageRow> {
    public static final MessageRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MessageRow$$serializer messageRow$$serializer = new MessageRow$$serializer();
        INSTANCE = messageRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(NearbyManager.PERMISSION_DENIED, messageRow$$serializer, 19);
        pluginGeneratedSerialDescriptor.m13841l("index", false);
        pluginGeneratedSerialDescriptor.m13841l("changeType", false);
        pluginGeneratedSerialDescriptor.m13841l("jumped", true);
        pluginGeneratedSerialDescriptor.m13841l("highlightJumpedOnceOnly", true);
        pluginGeneratedSerialDescriptor.m13841l("message", false);
        pluginGeneratedSerialDescriptor.m13841l("scrollTo", true);
        pluginGeneratedSerialDescriptor.m13841l("animated", true);
        pluginGeneratedSerialDescriptor.m13841l("canAddNewReactions", true);
        pluginGeneratedSerialDescriptor.m13841l("addReactionLabel", true);
        pluginGeneratedSerialDescriptor.m13841l("addNewReactionAccessibilityLabel", true);
        pluginGeneratedSerialDescriptor.m13841l("addNewBurstReactionAccessibilityLabel", true);
        pluginGeneratedSerialDescriptor.m13841l("reactionsTheme", true);
        pluginGeneratedSerialDescriptor.m13841l("isHighlight", true);
        pluginGeneratedSerialDescriptor.m13841l("renderContentOnly", true);
        pluginGeneratedSerialDescriptor.m13841l("messageFrame", true);
        pluginGeneratedSerialDescriptor.m13841l("reactTag", true);
        pluginGeneratedSerialDescriptor.m13841l("truncation", true);
        pluginGeneratedSerialDescriptor.m13841l("backgroundHighlight", true);
        pluginGeneratedSerialDescriptor.m13841l("enableSwipeToReply", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageRow$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2555m0 m0Var = C2555m0.f6794a;
        C2530h hVar = C2530h.f6761a;
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{m0Var, ChangeType.Serializer.INSTANCE, C14606a.m13u(hVar), C14606a.m13u(hVar), MessageSerializer.INSTANCE, C14606a.m13u(hVar), C14606a.m13u(hVar), C14606a.m13u(hVar), C14606a.m13u(a2Var), C14606a.m13u(a2Var), C14606a.m13u(a2Var), C14606a.m13u(ReactionsTheme$$serializer.INSTANCE), hVar, hVar, C14606a.m13u(MessageFrameSerializer.INSTANCE), C14606a.m13u(m0Var), C14606a.m13u(Truncation$$serializer.INSTANCE), C14606a.m13u(BackgroundHighlight$$serializer.INSTANCE), hVar};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public MessageRow deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i2;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        if (b.mo13850p()) {
            i2 = b.mo13855i(descriptor2, 0);
            obj9 = b.mo13847y(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            C2530h hVar = C2530h.f6761a;
            obj10 = b.mo13852n(descriptor2, 2, hVar, null);
            obj8 = b.mo13852n(descriptor2, 3, hVar, null);
            obj7 = b.mo13847y(descriptor2, 4, MessageSerializer.INSTANCE, null);
            obj6 = b.mo13852n(descriptor2, 5, hVar, null);
            obj5 = b.mo13852n(descriptor2, 6, hVar, null);
            obj4 = b.mo13852n(descriptor2, 7, hVar, null);
            C2500a2 a2Var = C2500a2.f6719a;
            obj11 = b.mo13852n(descriptor2, 8, a2Var, null);
            obj2 = b.mo13852n(descriptor2, 9, a2Var, null);
            obj3 = b.mo13852n(descriptor2, 10, a2Var, null);
            obj = b.mo13852n(descriptor2, 11, ReactionsTheme$$serializer.INSTANCE, null);
            z = b.mo13861C(descriptor2, 12);
            z2 = b.mo13861C(descriptor2, 13);
            obj15 = b.mo13852n(descriptor2, 14, MessageFrameSerializer.INSTANCE, null);
            obj14 = b.mo13852n(descriptor2, 15, C2555m0.f6794a, null);
            obj13 = b.mo13852n(descriptor2, 16, Truncation$$serializer.INSTANCE, null);
            obj12 = b.mo13852n(descriptor2, 17, BackgroundHighlight$$serializer.INSTANCE, null);
            z3 = b.mo13861C(descriptor2, 18);
            i = 524287;
        } else {
            int i3 = 18;
            int i4 = 0;
            boolean z4 = true;
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
            int i5 = 0;
            boolean z5 = false;
            z2 = false;
            z = false;
            while (z4) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z4 = false;
                        i5 = i5;
                        break;
                    case 0:
                        i5 = b.mo13855i(descriptor2, 0);
                        i4 |= 1;
                        z5 = z5;
                        break;
                    case 1:
                        z5 = z5;
                        obj25 = b.mo13847y(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj25);
                        i4 |= 2;
                        i5 = i5;
                        break;
                    case 2:
                        z5 = z5;
                        obj19 = b.mo13852n(descriptor2, 2, C2530h.f6761a, obj19);
                        i4 |= 4;
                        i5 = i5;
                        break;
                    case 3:
                        z5 = z5;
                        obj18 = b.mo13852n(descriptor2, 3, C2530h.f6761a, obj18);
                        i4 |= 8;
                        i5 = i5;
                        break;
                    case 4:
                        z5 = z5;
                        obj7 = b.mo13847y(descriptor2, 4, MessageSerializer.INSTANCE, obj7);
                        i4 |= 16;
                        i5 = i5;
                        break;
                    case 5:
                        z5 = z5;
                        obj16 = b.mo13852n(descriptor2, 5, C2530h.f6761a, obj16);
                        i4 |= 32;
                        i5 = i5;
                        break;
                    case 6:
                        z5 = z5;
                        obj24 = b.mo13852n(descriptor2, 6, C2530h.f6761a, obj24);
                        i4 |= 64;
                        i5 = i5;
                        break;
                    case 7:
                        z5 = z5;
                        obj23 = b.mo13852n(descriptor2, 7, C2530h.f6761a, obj23);
                        i4 |= 128;
                        i5 = i5;
                        break;
                    case 8:
                        z5 = z5;
                        obj22 = b.mo13852n(descriptor2, 8, C2500a2.f6719a, obj22);
                        i4 |= Spliterator.NONNULL;
                        i5 = i5;
                        break;
                    case 9:
                        z5 = z5;
                        obj17 = b.mo13852n(descriptor2, 9, C2500a2.f6719a, obj17);
                        i4 |= 512;
                        i5 = i5;
                        break;
                    case 10:
                        z5 = z5;
                        obj21 = b.mo13852n(descriptor2, 10, C2500a2.f6719a, obj21);
                        i4 |= Spliterator.IMMUTABLE;
                        i5 = i5;
                        break;
                    case 11:
                        z5 = z5;
                        obj20 = b.mo13852n(descriptor2, 11, ReactionsTheme$$serializer.INSTANCE, obj20);
                        i4 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i5 = i5;
                        break;
                    case 12:
                        z5 = z5;
                        z = b.mo13861C(descriptor2, 12);
                        i4 |= 4096;
                        i5 = i5;
                        break;
                    case 13:
                        z5 = z5;
                        z2 = b.mo13861C(descriptor2, 13);
                        i4 |= 8192;
                        i5 = i5;
                        break;
                    case 14:
                        obj26 = b.mo13852n(descriptor2, 14, MessageFrameSerializer.INSTANCE, obj26);
                        i4 |= Spliterator.SUBSIZED;
                        z5 = z5;
                        obj27 = obj27;
                        i5 = i5;
                        break;
                    case 15:
                        obj27 = b.mo13852n(descriptor2, 15, C2555m0.f6794a, obj27);
                        i4 |= 32768;
                        z5 = z5;
                        obj28 = obj28;
                        i5 = i5;
                        break;
                    case 16:
                        obj28 = b.mo13852n(descriptor2, 16, Truncation$$serializer.INSTANCE, obj28);
                        i4 |= 65536;
                        z5 = z5;
                        obj29 = obj29;
                        i5 = i5;
                        break;
                    case 17:
                        z5 = z5;
                        obj29 = b.mo13852n(descriptor2, 17, BackgroundHighlight$$serializer.INSTANCE, obj29);
                        i4 |= 131072;
                        i5 = i5;
                        break;
                    case 18:
                        z5 = b.mo13861C(descriptor2, i3);
                        i4 |= 262144;
                        i5 = i5;
                        continue;
                    default:
                        throw new C14382n(o);
                }
                i3 = 18;
            }
            obj2 = obj17;
            obj9 = obj25;
            i = i4;
            obj = obj20;
            obj3 = obj21;
            z3 = z5;
            obj13 = obj28;
            obj15 = obj26;
            i2 = i5;
            obj6 = obj16;
            obj10 = obj19;
            obj11 = obj22;
            obj14 = obj27;
            obj4 = obj23;
            obj8 = obj18;
            obj12 = obj29;
            obj5 = obj24;
        }
        b.mo13857c(descriptor2);
        return new MessageRow(i, i2, (ChangeType) obj9, (Boolean) obj10, (Boolean) obj8, (MessageBase) obj7, (Boolean) obj6, (Boolean) obj5, (Boolean) obj4, (String) obj11, (String) obj2, (String) obj3, (ReactionsTheme) obj, z, z2, (MessageFrame) obj15, (Integer) obj14, (Truncation) obj13, (BackgroundHighlight) obj12, z3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MessageRow value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        MessageRow.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
