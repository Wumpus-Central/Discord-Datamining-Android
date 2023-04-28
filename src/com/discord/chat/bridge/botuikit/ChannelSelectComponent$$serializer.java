package com.discord.chat.bridge.botuikit;

import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2521f;
import bj.C2530h;
import bj.C2555m0;
import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9967c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p164j$.util.Spliterator;
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/chat/bridge/botuikit/ChannelSelectComponent.$serializer", "Lbj/f0;", "Lcom/discord/chat/bridge/botuikit/ChannelSelectComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ChannelSelectComponent$$serializer implements AbstractC2522f0<ChannelSelectComponent> {
    public static final ChannelSelectComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ChannelSelectComponent$$serializer channelSelectComponent$$serializer = new ChannelSelectComponent$$serializer();
        INSTANCE = channelSelectComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("8", channelSelectComponent$$serializer, 12);
        pluginGeneratedSerialDescriptor.m13841l("selectedOptions", true);
        pluginGeneratedSerialDescriptor.m13841l("type", false);
        pluginGeneratedSerialDescriptor.m13841l("indices", false);
        pluginGeneratedSerialDescriptor.m13841l("applicationId", false);
        pluginGeneratedSerialDescriptor.m13841l("customId", false);
        pluginGeneratedSerialDescriptor.m13841l(ReactTextInputShadowNode.PROP_PLACEHOLDER, true);
        pluginGeneratedSerialDescriptor.m13841l(ViewProps.ACCESSIBILITY_LABEL, true);
        pluginGeneratedSerialDescriptor.m13841l("minValues", false);
        pluginGeneratedSerialDescriptor.m13841l("maxValues", false);
        pluginGeneratedSerialDescriptor.m13841l("disabled", true);
        pluginGeneratedSerialDescriptor.m13841l("state", false);
        pluginGeneratedSerialDescriptor.m13841l("channelTypes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChannelSelectComponent$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2555m0 m0Var = C2555m0.f6794a;
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{C14606a.m13u(new C2521f(SearchableSelectItem$$serializer.INSTANCE)), m0Var, new C2521f(m0Var), a2Var, a2Var, C14606a.m13u(a2Var), C14606a.m13u(a2Var), m0Var, m0Var, C2530h.f6761a, ActionComponentState.Serializer.INSTANCE, C14606a.m13u(new C2521f(m0Var))};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ChannelSelectComponent deserialize(Decoder decoder) {
        int i;
        int i2;
        boolean z;
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        String str2;
        Object obj4;
        int i3;
        int i4;
        Object obj5;
        Object obj6;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i5 = 10;
        int i6 = 9;
        int i7 = 7;
        int i8 = 0;
        if (b.mo13850p()) {
            obj6 = b.mo13852n(descriptor2, 0, new C2521f(SearchableSelectItem$$serializer.INSTANCE), null);
            i3 = b.mo13855i(descriptor2, 1);
            C2555m0 m0Var = C2555m0.f6794a;
            obj = b.mo13847y(descriptor2, 2, new C2521f(m0Var), null);
            str2 = b.mo13853m(descriptor2, 3);
            str = b.mo13853m(descriptor2, 4);
            C2500a2 a2Var = C2500a2.f6719a;
            obj2 = b.mo13852n(descriptor2, 5, a2Var, null);
            obj4 = b.mo13852n(descriptor2, 6, a2Var, null);
            i2 = b.mo13855i(descriptor2, 7);
            i = b.mo13855i(descriptor2, 8);
            z = b.mo13861C(descriptor2, 9);
            obj3 = b.mo13847y(descriptor2, 10, ActionComponentState.Serializer.INSTANCE, null);
            obj5 = b.mo13852n(descriptor2, 11, new C2521f(m0Var), null);
            i4 = 4095;
        } else {
            int i9 = 11;
            boolean z2 = true;
            int i10 = 0;
            i2 = 0;
            i = 0;
            Object obj7 = null;
            Object obj8 = null;
            obj3 = null;
            obj2 = null;
            obj = null;
            Object obj9 = null;
            String str3 = null;
            String str4 = null;
            boolean z3 = false;
            while (z2) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 0:
                        obj9 = b.mo13852n(descriptor2, 0, new C2521f(SearchableSelectItem$$serializer.INSTANCE), obj9);
                        i8 |= 1;
                        i9 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 1:
                        i10 = b.mo13855i(descriptor2, 1);
                        i8 |= 2;
                        i9 = 11;
                        i5 = 10;
                        break;
                    case 2:
                        obj = b.mo13847y(descriptor2, 2, new C2521f(C2555m0.f6794a), obj);
                        i8 |= 4;
                        i9 = 11;
                        i5 = 10;
                        break;
                    case 3:
                        str3 = b.mo13853m(descriptor2, 3);
                        i8 |= 8;
                        i9 = 11;
                        break;
                    case 4:
                        str4 = b.mo13853m(descriptor2, 4);
                        i8 |= 16;
                        i9 = 11;
                        break;
                    case 5:
                        obj2 = b.mo13852n(descriptor2, 5, C2500a2.f6719a, obj2);
                        i8 |= 32;
                        i9 = 11;
                        break;
                    case 6:
                        obj8 = b.mo13852n(descriptor2, 6, C2500a2.f6719a, obj8);
                        i8 |= 64;
                        i9 = 11;
                        continue;
                    case 7:
                        i2 = b.mo13855i(descriptor2, i7);
                        i8 |= 128;
                        break;
                    case 8:
                        i = b.mo13855i(descriptor2, 8);
                        i8 |= Spliterator.NONNULL;
                        i7 = 7;
                        break;
                    case 9:
                        z3 = b.mo13861C(descriptor2, i6);
                        i8 |= 512;
                        i7 = 7;
                        break;
                    case 10:
                        obj3 = b.mo13847y(descriptor2, i5, ActionComponentState.Serializer.INSTANCE, obj3);
                        i8 |= Spliterator.IMMUTABLE;
                        i7 = 7;
                        break;
                    case 11:
                        obj7 = b.mo13852n(descriptor2, i9, new C2521f(C2555m0.f6794a), obj7);
                        i8 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i7 = 7;
                        break;
                    default:
                        throw new C14382n(o);
                }
            }
            i3 = i10;
            obj6 = obj9;
            obj5 = obj7;
            obj4 = obj8;
            i4 = i8;
            z = z3;
            str2 = str3;
            str = str4;
        }
        b.mo13857c(descriptor2);
        return new ChannelSelectComponent(i4, (List) obj6, i3, (List) obj, str2, str, (String) obj2, (String) obj4, i2, i, z, (ActionComponentState) obj3, (List) obj5, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ChannelSelectComponent value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        ChannelSelectComponent.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
