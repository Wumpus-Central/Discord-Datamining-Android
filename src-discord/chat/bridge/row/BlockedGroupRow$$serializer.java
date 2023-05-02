package com.discord.chat.bridge.row;

import bj.a2;
import bj.f;
import bj.f0;
import bj.h;
import bj.m0;
import com.discord.chat.bridge.ChangeType;
import com.facebook.react.uimanager.ViewProps;
import j$.util.Spliterator;
import java.util.List;
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

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/row/BlockedGroupRow.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/row/BlockedGroupRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BlockedGroupRow$$serializer implements f0<BlockedGroupRow> {
    public static final BlockedGroupRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BlockedGroupRow$$serializer blockedGroupRow$$serializer = new BlockedGroupRow$$serializer();
        INSTANCE = blockedGroupRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("2", blockedGroupRow$$serializer, 9);
        pluginGeneratedSerialDescriptor.l("index", false);
        pluginGeneratedSerialDescriptor.l("changeType", false);
        pluginGeneratedSerialDescriptor.l(ViewProps.COLOR, false);
        pluginGeneratedSerialDescriptor.l(ViewProps.BORDER_COLOR, false);
        pluginGeneratedSerialDescriptor.l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.l("text", false);
        pluginGeneratedSerialDescriptor.l("revealed", false);
        pluginGeneratedSerialDescriptor.l("button", false);
        pluginGeneratedSerialDescriptor.l("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BlockedGroupRow$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f5992a;
        return new KSerializer[]{m0Var, ChangeType.Serializer.INSTANCE, m0Var, m0Var, m0Var, a2.f5917a, h.f5959a, BlockedGroupButton$$serializer.INSTANCE, a.u(new f(BlockedGroupContent$$serializer.INSTANCE))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BlockedGroupRow deserialize(Decoder decoder) {
        boolean z10;
        String str;
        int i10;
        int i11;
        int i12;
        Object obj;
        int i13;
        int i14;
        Object obj2;
        Object obj3;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i15 = 7;
        int i16 = 6;
        int i17 = 5;
        int i18 = 4;
        int i19 = 0;
        if (b10.p()) {
            i13 = b10.i(descriptor2, 0);
            obj = b10.y(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            i12 = b10.i(descriptor2, 2);
            i11 = b10.i(descriptor2, 3);
            i10 = b10.i(descriptor2, 4);
            str = b10.m(descriptor2, 5);
            z10 = b10.C(descriptor2, 6);
            obj3 = b10.y(descriptor2, 7, BlockedGroupButton$$serializer.INSTANCE, null);
            obj2 = b10.n(descriptor2, 8, new f(BlockedGroupContent$$serializer.INSTANCE), null);
            i14 = 511;
        } else {
            boolean z11 = true;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            String str2 = null;
            boolean z12 = false;
            while (z11) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z11 = false;
                        i15 = 7;
                        i16 = 6;
                        break;
                    case 0:
                        i20 = b10.i(descriptor2, 0);
                        i19 |= 1;
                        i15 = 7;
                        i16 = 6;
                        i17 = 5;
                        break;
                    case 1:
                        obj6 = b10.y(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj6);
                        i19 |= 2;
                        i15 = 7;
                        i16 = 6;
                        i17 = 5;
                        break;
                    case 2:
                        i23 = b10.i(descriptor2, 2);
                        i19 |= 4;
                        break;
                    case 3:
                        i21 = b10.i(descriptor2, 3);
                        i19 |= 8;
                        break;
                    case 4:
                        i22 = b10.i(descriptor2, i18);
                        i19 |= 16;
                        break;
                    case 5:
                        str2 = b10.m(descriptor2, i17);
                        i19 |= 32;
                        i18 = 4;
                        break;
                    case 6:
                        z12 = b10.C(descriptor2, i16);
                        i19 |= 64;
                        i18 = 4;
                        break;
                    case 7:
                        obj5 = b10.y(descriptor2, i15, BlockedGroupButton$$serializer.INSTANCE, obj5);
                        i19 |= 128;
                        i18 = 4;
                        break;
                    case 8:
                        obj4 = b10.n(descriptor2, 8, new f(BlockedGroupContent$$serializer.INSTANCE), obj4);
                        i19 |= Spliterator.NONNULL;
                        i18 = 4;
                        break;
                    default:
                        throw new n(o10);
                }
            }
            obj2 = obj4;
            obj3 = obj5;
            i14 = i19;
            i12 = i23;
            i13 = i20;
            obj = obj6;
            z10 = z12;
            i11 = i21;
            i10 = i22;
            str = str2;
        }
        b10.c(descriptor2);
        return new BlockedGroupRow(i14, i13, (ChangeType) obj, i12, i11, i10, str, z10, (BlockedGroupButton) obj3, (List) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, BlockedGroupRow value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        BlockedGroupRow.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}