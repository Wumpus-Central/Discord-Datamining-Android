package com.discord.chat.bridge.row;

import aj.a;
import androidx.recyclerview.widget.RecyclerView;
import cj.a2;
import cj.f0;
import cj.h;
import cj.m0;
import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.bridge.BackgroundHighlight$$serializer;
import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.MessageBase;
import com.discord.chat.bridge.SwipeActionsType;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.MessageFrameSerializer;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.reaction.ReactionsTheme$$serializer;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.chat.bridge.truncation.Truncation$$serializer;
import com.discord.nearby.NearbyManager;
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
import zi.n;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/row/MessageRow.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/row/MessageRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class MessageRow$$serializer implements f0<MessageRow> {
    public static final MessageRow$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

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
        pluginGeneratedSerialDescriptor.l("swipeActions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MessageRow$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f6313a;
        h hVar = h.f6280a;
        a2 a2Var = a2.f6238a;
        return new KSerializer[]{m0Var, ChangeType.Serializer.INSTANCE, a.u(hVar), a.u(hVar), MessageSerializer.INSTANCE, a.u(hVar), a.u(hVar), a.u(hVar), a.u(a2Var), a.u(a2Var), a.u(a2Var), a.u(ReactionsTheme$$serializer.INSTANCE), hVar, hVar, a.u(MessageFrameSerializer.INSTANCE), a.u(m0Var), a.u(Truncation$$serializer.INSTANCE), a.u(BackgroundHighlight$$serializer.INSTANCE), SwipeActionsType.Serializer.INSTANCE};
    }

    @Override 
    public MessageRow deserialize(Decoder decoder) {
        Object obj;
        boolean z10;
        boolean z11;
        Object obj2;
        int i10;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        int i11;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        if (b10.p()) {
            i11 = b10.i(descriptor2, 0);
            obj7 = b10.y(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            h hVar = h.f6280a;
            obj = b10.n(descriptor2, 2, hVar, null);
            obj10 = b10.n(descriptor2, 3, hVar, null);
            obj8 = b10.y(descriptor2, 4, MessageSerializer.INSTANCE, null);
            obj9 = b10.n(descriptor2, 5, hVar, null);
            obj6 = b10.n(descriptor2, 6, hVar, null);
            obj4 = b10.n(descriptor2, 7, hVar, null);
            a2 a2Var = a2.f6238a;
            obj11 = b10.n(descriptor2, 8, a2Var, null);
            obj5 = b10.n(descriptor2, 9, a2Var, null);
            obj3 = b10.n(descriptor2, 10, a2Var, null);
            obj2 = b10.n(descriptor2, 11, ReactionsTheme$$serializer.INSTANCE, null);
            z10 = b10.C(descriptor2, 12);
            z11 = b10.C(descriptor2, 13);
            obj16 = b10.n(descriptor2, 14, MessageFrameSerializer.INSTANCE, null);
            obj15 = b10.n(descriptor2, 15, m0.f6313a, null);
            obj14 = b10.n(descriptor2, 16, Truncation$$serializer.INSTANCE, null);
            obj13 = b10.n(descriptor2, 17, BackgroundHighlight$$serializer.INSTANCE, null);
            obj12 = b10.y(descriptor2, 18, SwipeActionsType.Serializer.INSTANCE, null);
            i10 = 524287;
        } else {
            Object obj17 = null;
            boolean z12 = true;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            obj8 = null;
            Object obj27 = null;
            Object obj28 = null;
            Object obj29 = null;
            Object obj30 = null;
            int i12 = 0;
            z11 = false;
            int i13 = 0;
            z10 = false;
            Object obj31 = null;
            while (z12) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z12 = false;
                        obj17 = obj17;
                        break;
                    case 0:
                        obj18 = obj18;
                        obj17 = obj17;
                        i13 = b10.i(descriptor2, 0);
                        i12 |= 1;
                        break;
                    case 1:
                        obj17 = obj17;
                        obj18 = obj18;
                        obj31 = b10.y(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj31);
                        i12 |= 2;
                        break;
                    case 2:
                        obj17 = obj17;
                        obj31 = obj31;
                        obj18 = b10.n(descriptor2, 2, h.f6280a, obj18);
                        i12 |= 4;
                        break;
                    case 3:
                        obj17 = obj17;
                        obj31 = obj31;
                        obj21 = b10.n(descriptor2, 3, h.f6280a, obj21);
                        i12 |= 8;
                        break;
                    case 4:
                        obj17 = obj17;
                        obj31 = obj31;
                        obj8 = b10.y(descriptor2, 4, MessageSerializer.INSTANCE, obj8);
                        i12 |= 16;
                        break;
                    case 5:
                        obj17 = obj17;
                        obj31 = obj31;
                        obj19 = b10.n(descriptor2, 5, h.f6280a, obj19);
                        i12 |= 32;
                        break;
                    case 6:
                        obj17 = obj17;
                        obj31 = obj31;
                        obj26 = b10.n(descriptor2, 6, h.f6280a, obj26);
                        i12 |= 64;
                        break;
                    case 7:
                        obj17 = obj17;
                        obj31 = obj31;
                        obj25 = b10.n(descriptor2, 7, h.f6280a, obj25);
                        i12 |= 128;
                        break;
                    case 8:
                        obj17 = obj17;
                        obj31 = obj31;
                        obj24 = b10.n(descriptor2, 8, a2.f6238a, obj24);
                        i12 |= 256;
                        break;
                    case 9:
                        obj17 = obj17;
                        obj31 = obj31;
                        obj20 = b10.n(descriptor2, 9, a2.f6238a, obj20);
                        i12 |= 512;
                        break;
                    case 10:
                        obj17 = obj17;
                        obj31 = obj31;
                        obj23 = b10.n(descriptor2, 10, a2.f6238a, obj23);
                        i12 |= 1024;
                        break;
                    case 11:
                        obj17 = obj17;
                        obj31 = obj31;
                        obj22 = b10.n(descriptor2, 11, ReactionsTheme$$serializer.INSTANCE, obj22);
                        i12 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        break;
                    case 12:
                        obj17 = obj17;
                        obj31 = obj31;
                        z10 = b10.C(descriptor2, 12);
                        i12 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        break;
                    case 13:
                        obj17 = obj17;
                        obj31 = obj31;
                        z11 = b10.C(descriptor2, 13);
                        i12 |= 8192;
                        break;
                    case 14:
                        obj31 = obj31;
                        obj27 = b10.n(descriptor2, 14, MessageFrameSerializer.INSTANCE, obj27);
                        i12 |= 16384;
                        obj17 = obj17;
                        obj28 = obj28;
                        break;
                    case 15:
                        obj31 = obj31;
                        obj28 = b10.n(descriptor2, 15, m0.f6313a, obj28);
                        i12 |= 32768;
                        obj17 = obj17;
                        obj29 = obj29;
                        break;
                    case 16:
                        obj31 = obj31;
                        obj29 = b10.n(descriptor2, 16, Truncation$$serializer.INSTANCE, obj29);
                        i12 |= 65536;
                        obj17 = obj17;
                        obj30 = obj30;
                        break;
                    case 17:
                        obj31 = obj31;
                        obj17 = obj17;
                        obj30 = b10.n(descriptor2, 17, BackgroundHighlight$$serializer.INSTANCE, obj30);
                        i12 |= 131072;
                        break;
                    case 18:
                        obj17 = b10.y(descriptor2, 18, SwipeActionsType.Serializer.INSTANCE, obj17);
                        i12 |= 262144;
                        obj31 = obj31;
                        continue;
                    default:
                        throw new n(o10);
                }
            }
            obj = obj18;
            obj16 = obj27;
            i10 = i12;
            obj2 = obj22;
            obj3 = obj23;
            obj12 = obj17;
            i11 = i13;
            obj7 = obj31;
            obj11 = obj24;
            obj10 = obj21;
            obj13 = obj30;
            obj6 = obj26;
            obj9 = obj19;
            obj15 = obj28;
            obj4 = obj25;
            obj5 = obj20;
            obj14 = obj29;
        }
        b10.c(descriptor2);
        return new MessageRow(i10, i11, (ChangeType) obj7, (Boolean) obj, (Boolean) obj10, (MessageBase) obj8, (Boolean) obj9, (Boolean) obj6, (Boolean) obj4, (String) obj11, (String) obj5, (String) obj3, (ReactionsTheme) obj2, z10, z11, (MessageFrame) obj16, (Integer) obj15, (Truncation) obj14, (BackgroundHighlight) obj13, (SwipeActionsType) obj12, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, MessageRow value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        MessageRow.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
