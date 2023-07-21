package com.discord.chat.bridge.botuikit;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
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
import pi.n;
import qi.a;
import si.a2;
import si.f;
import si.f0;
import si.h;
import si.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/botuikit/StringSelectComponent.$serializer", "Lsi/f0;", "Lcom/discord/chat/bridge/botuikit/StringSelectComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class StringSelectComponent$$serializer implements f0<StringSelectComponent> {
    public static final StringSelectComponent$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        StringSelectComponent$$serializer stringSelectComponent$$serializer = new StringSelectComponent$$serializer();
        INSTANCE = stringSelectComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("3", stringSelectComponent$$serializer, 12);
        pluginGeneratedSerialDescriptor.l("type", false);
        pluginGeneratedSerialDescriptor.l("indices", false);
        pluginGeneratedSerialDescriptor.l("applicationId", false);
        pluginGeneratedSerialDescriptor.l("customId", false);
        pluginGeneratedSerialDescriptor.l(ReactTextInputShadowNode.PROP_PLACEHOLDER, true);
        pluginGeneratedSerialDescriptor.l(ViewProps.ACCESSIBILITY_LABEL, true);
        pluginGeneratedSerialDescriptor.l("minValues", false);
        pluginGeneratedSerialDescriptor.l("maxValues", false);
        pluginGeneratedSerialDescriptor.l("disabled", true);
        pluginGeneratedSerialDescriptor.l("state", false);
        pluginGeneratedSerialDescriptor.l("options", true);
        pluginGeneratedSerialDescriptor.l("selectedOptions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StringSelectComponent$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f26306a;
        a2 a2Var = a2.f26231a;
        return new KSerializer[]{m0Var, new f(m0Var), a2Var, a2Var, a.u(a2Var), a.u(a2Var), m0Var, m0Var, h.f26273a, ActionComponentState.Serializer.INSTANCE, new f(StringSelectItem$$serializer.INSTANCE), a.u(new f(m0Var))};
    }

    @Override 
    public StringSelectComponent deserialize(Decoder decoder) {
        String str;
        boolean z10;
        int i10;
        int i11;
        Object obj;
        String str2;
        Object obj2;
        int i12;
        int i13;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        int i14 = 10;
        int i15 = 7;
        if (c10.y()) {
            i12 = c10.k(descriptor2, 0);
            m0 m0Var = m0.f26306a;
            obj = c10.m(descriptor2, 1, new f(m0Var), null);
            str2 = c10.t(descriptor2, 2);
            str = c10.t(descriptor2, 3);
            a2 a2Var = a2.f26231a;
            obj2 = c10.v(descriptor2, 4, a2Var, null);
            obj3 = c10.v(descriptor2, 5, a2Var, null);
            i11 = c10.k(descriptor2, 6);
            i10 = c10.k(descriptor2, 7);
            z10 = c10.s(descriptor2, 8);
            obj4 = c10.m(descriptor2, 9, ActionComponentState.Serializer.INSTANCE, null);
            obj6 = c10.m(descriptor2, 10, new f(StringSelectItem$$serializer.INSTANCE), null);
            obj5 = c10.v(descriptor2, 11, new f(m0Var), null);
            i13 = 4095;
        } else {
            int i16 = 11;
            boolean z11 = true;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            z10 = false;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            String str3 = null;
            str = null;
            Object obj12 = null;
            int i20 = 0;
            while (z11) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z11 = false;
                        i16 = 11;
                        break;
                    case 0:
                        i17 = c10.k(descriptor2, 0);
                        i20 |= 1;
                        i16 = 11;
                        i14 = 10;
                        break;
                    case 1:
                        obj12 = c10.m(descriptor2, 1, new f(m0.f26306a), obj12);
                        i20 |= 2;
                        i16 = 11;
                        i14 = 10;
                        break;
                    case 2:
                        str3 = c10.t(descriptor2, 2);
                        i20 |= 4;
                        i16 = 11;
                        i14 = 10;
                        break;
                    case 3:
                        str = c10.t(descriptor2, 3);
                        i20 |= 8;
                        i16 = 11;
                        i14 = 10;
                        break;
                    case 4:
                        obj11 = c10.v(descriptor2, 4, a2.f26231a, obj11);
                        i20 |= 16;
                        i16 = 11;
                        i14 = 10;
                        break;
                    case 5:
                        obj10 = c10.v(descriptor2, 5, a2.f26231a, obj10);
                        i20 |= 32;
                        i16 = 11;
                        i14 = 10;
                        break;
                    case 6:
                        i19 = c10.k(descriptor2, 6);
                        i20 |= 64;
                        break;
                    case 7:
                        i18 = c10.k(descriptor2, i15);
                        i20 |= 128;
                        break;
                    case 8:
                        z10 = c10.s(descriptor2, 8);
                        i20 |= 256;
                        i15 = 7;
                        break;
                    case 9:
                        obj8 = c10.m(descriptor2, 9, ActionComponentState.Serializer.INSTANCE, obj8);
                        i20 |= 512;
                        i15 = 7;
                        break;
                    case 10:
                        obj9 = c10.m(descriptor2, i14, new f(StringSelectItem$$serializer.INSTANCE), obj9);
                        i20 |= 1024;
                        i15 = 7;
                        break;
                    case 11:
                        obj7 = c10.v(descriptor2, i16, new f(m0.f26306a), obj7);
                        i20 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i15 = 7;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            i12 = i17;
            obj5 = obj7;
            obj4 = obj8;
            obj6 = obj9;
            obj3 = obj10;
            obj2 = obj11;
            obj = obj12;
            i13 = i20;
            str2 = str3;
            i10 = i18;
            i11 = i19;
        }
        c10.b(descriptor2);
        return new StringSelectComponent(i13, i12, (List) obj, str2, str, (String) obj2, (String) obj3, i11, i10, z10, (ActionComponentState) obj4, (List) obj6, (List) obj5, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, StringSelectComponent value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        StringSelectComponent.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
