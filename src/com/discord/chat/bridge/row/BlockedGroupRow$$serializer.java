package com.discord.chat.bridge.row;

import bj.AbstractC3644f0;
import bj.C3622a2;
import bj.C3643f;
import bj.C3652h;
import bj.C3676m0;
import com.discord.chat.bridge.ChangeType;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p163j$.util.Spliterator;
import p449yi.C14447n;
import p469zi.C14667a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/row/BlockedGroupRow.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/row/BlockedGroupRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BlockedGroupRow$$serializer implements AbstractC3644f0<BlockedGroupRow> {
    public static final BlockedGroupRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BlockedGroupRow$$serializer blockedGroupRow$$serializer = new BlockedGroupRow$$serializer();
        INSTANCE = blockedGroupRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("2", blockedGroupRow$$serializer, 9);
        pluginGeneratedSerialDescriptor.m13841l("index", false);
        pluginGeneratedSerialDescriptor.m13841l("changeType", false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.COLOR, false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.BORDER_COLOR, false);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.m13841l("text", false);
        pluginGeneratedSerialDescriptor.m13841l("revealed", false);
        pluginGeneratedSerialDescriptor.m13841l("button", false);
        pluginGeneratedSerialDescriptor.m13841l("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BlockedGroupRow$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        C3676m0 m0Var = C3676m0.f5992a;
        return new KSerializer[]{m0Var, ChangeType.Serializer.INSTANCE, m0Var, m0Var, m0Var, C3622a2.f5917a, C3652h.f5959a, BlockedGroupButton$$serializer.INSTANCE, C14667a.m13u(new C3643f(BlockedGroupContent$$serializer.INSTANCE))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BlockedGroupRow deserialize(Decoder decoder) {
        boolean z;
        String str;
        int i;
        int i2;
        int i3;
        Object obj;
        int i4;
        int i5;
        Object obj2;
        Object obj3;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        int i6 = 7;
        int i7 = 6;
        int i8 = 5;
        int i9 = 4;
        int i10 = 0;
        if (b.mo13850p()) {
            i4 = b.mo13855i(descriptor2, 0);
            obj = b.mo13847y(descriptor2, 1, ChangeType.Serializer.INSTANCE, null);
            i3 = b.mo13855i(descriptor2, 2);
            i2 = b.mo13855i(descriptor2, 3);
            i = b.mo13855i(descriptor2, 4);
            str = b.mo13853m(descriptor2, 5);
            z = b.mo13861C(descriptor2, 6);
            obj3 = b.mo13847y(descriptor2, 7, BlockedGroupButton$$serializer.INSTANCE, null);
            obj2 = b.mo13852n(descriptor2, 8, new C3643f(BlockedGroupContent$$serializer.INSTANCE), null);
            i5 = 511;
        } else {
            boolean z2 = true;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            String str2 = null;
            boolean z3 = false;
            while (z2) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        i6 = 7;
                        i7 = 6;
                        break;
                    case 0:
                        i11 = b.mo13855i(descriptor2, 0);
                        i10 |= 1;
                        i6 = 7;
                        i7 = 6;
                        i8 = 5;
                        break;
                    case 1:
                        obj6 = b.mo13847y(descriptor2, 1, ChangeType.Serializer.INSTANCE, obj6);
                        i10 |= 2;
                        i6 = 7;
                        i7 = 6;
                        i8 = 5;
                        break;
                    case 2:
                        i14 = b.mo13855i(descriptor2, 2);
                        i10 |= 4;
                        break;
                    case 3:
                        i12 = b.mo13855i(descriptor2, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        i13 = b.mo13855i(descriptor2, i9);
                        i10 |= 16;
                        break;
                    case 5:
                        str2 = b.mo13853m(descriptor2, i8);
                        i10 |= 32;
                        i9 = 4;
                        break;
                    case 6:
                        z3 = b.mo13861C(descriptor2, i7);
                        i10 |= 64;
                        i9 = 4;
                        break;
                    case 7:
                        obj5 = b.mo13847y(descriptor2, i6, BlockedGroupButton$$serializer.INSTANCE, obj5);
                        i10 |= 128;
                        i9 = 4;
                        break;
                    case 8:
                        obj4 = b.mo13852n(descriptor2, 8, new C3643f(BlockedGroupContent$$serializer.INSTANCE), obj4);
                        i10 |= Spliterator.NONNULL;
                        i9 = 4;
                        break;
                    default:
                        throw new C14447n(o);
                }
            }
            obj2 = obj4;
            obj3 = obj5;
            i5 = i10;
            i3 = i14;
            i4 = i11;
            obj = obj6;
            z = z3;
            i2 = i12;
            i = i13;
            str = str2;
        }
        b.mo13857c(descriptor2);
        return new BlockedGroupRow(i5, i4, (ChangeType) obj, i3, i2, i, str, z, (BlockedGroupButton) obj3, (List) obj2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, BlockedGroupRow value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        BlockedGroupRow.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
