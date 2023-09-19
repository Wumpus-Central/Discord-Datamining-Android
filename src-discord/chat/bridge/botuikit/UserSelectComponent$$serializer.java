package com.discord.chat.bridge.botuikit;

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
import ui.n;
import vi.a;
import xi.a2;
import xi.f;
import xi.f0;
import xi.h;
import xi.m0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/chat/bridge/botuikit/UserSelectComponent.$serializer", "Lxi/f0;", "Lcom/discord/chat/bridge/botuikit/UserSelectComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class UserSelectComponent$$serializer implements f0<UserSelectComponent> {
    public static final UserSelectComponent$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        UserSelectComponent$$serializer userSelectComponent$$serializer = new UserSelectComponent$$serializer();
        INSTANCE = userSelectComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("5", userSelectComponent$$serializer, 11);
        pluginGeneratedSerialDescriptor.l("selectedOptions", true);
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
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserSelectComponent$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        m0 m0Var = m0.f30651a;
        a2 a2Var = a2.f30576a;
        return new KSerializer[]{a.u(new f(SearchableSelectItem$$serializer.INSTANCE)), m0Var, new f(m0Var), a2Var, a2Var, a.u(a2Var), a.u(a2Var), m0Var, m0Var, h.f30618a, ActionComponentState.Serializer.INSTANCE};
    }

    @Override 
    public UserSelectComponent deserialize(Decoder decoder) {
        boolean z10;
        int i10;
        int i11;
        Object obj;
        Object obj2;
        String str;
        String str2;
        int i12;
        Object obj3;
        int i13;
        Object obj4;
        Object obj5;
        char c10;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i14 = 10;
        int i15 = 9;
        int i16 = 7;
        int i17 = 0;
        if (b10.p()) {
            obj5 = b10.n(descriptor2, 0, new f(SearchableSelectItem$$serializer.INSTANCE), null);
            i12 = b10.i(descriptor2, 1);
            obj = b10.y(descriptor2, 2, new f(m0.f30651a), null);
            str2 = b10.m(descriptor2, 3);
            str = b10.m(descriptor2, 4);
            a2 a2Var = a2.f30576a;
            obj2 = b10.n(descriptor2, 5, a2Var, null);
            obj3 = b10.n(descriptor2, 6, a2Var, null);
            i11 = b10.i(descriptor2, 7);
            i10 = b10.i(descriptor2, 8);
            z10 = b10.C(descriptor2, 9);
            obj4 = b10.y(descriptor2, 10, ActionComponentState.Serializer.INSTANCE, null);
            i13 = 2047;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            int i18 = 0;
            int i19 = 0;
            Object obj6 = null;
            Object obj7 = null;
            obj2 = null;
            obj = null;
            Object obj8 = null;
            String str3 = null;
            String str4 = null;
            int i20 = 0;
            while (z11) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z11 = false;
                        i15 = 9;
                        i16 = 7;
                    case 0:
                        obj8 = b10.n(descriptor2, 0, new f(SearchableSelectItem$$serializer.INSTANCE), obj8);
                        i17 |= 1;
                        i14 = 10;
                        i15 = 9;
                        i16 = 7;
                    case 1:
                        i19 = b10.i(descriptor2, 1);
                        i17 |= 2;
                        i14 = 10;
                        i15 = 9;
                    case 2:
                        obj = b10.y(descriptor2, 2, new f(m0.f30651a), obj);
                        i17 |= 4;
                        i14 = 10;
                        i15 = 9;
                    case 3:
                        str3 = b10.m(descriptor2, 3);
                        i17 |= 8;
                        i14 = 10;
                    case 4:
                        c10 = 5;
                        str4 = b10.m(descriptor2, 4);
                        i17 |= 16;
                        i14 = 10;
                    case 5:
                        c10 = 5;
                        obj2 = b10.n(descriptor2, 5, a2.f30576a, obj2);
                        i17 |= 32;
                        i14 = 10;
                    case 6:
                        obj6 = b10.n(descriptor2, 6, a2.f30576a, obj6);
                        i17 |= 64;
                    case 7:
                        i20 = b10.i(descriptor2, i16);
                        i17 |= 128;
                    case 8:
                        i18 = b10.i(descriptor2, 8);
                        i17 |= 256;
                    case 9:
                        z12 = b10.C(descriptor2, i15);
                        i17 |= 512;
                    case 10:
                        obj7 = b10.y(descriptor2, i14, ActionComponentState.Serializer.INSTANCE, obj7);
                        i17 |= 1024;
                    default:
                        throw new n(o10);
                }
            }
            obj3 = obj6;
            obj4 = obj7;
            i13 = i17;
            i11 = i20;
            i10 = i18;
            i12 = i19;
            str2 = str3;
            str = str4;
            z10 = z12;
            obj5 = obj8;
        }
        b10.c(descriptor2);
        return new UserSelectComponent(i13, (List) obj5, i12, (List) obj, str2, str, (String) obj2, (String) obj3, i11, i10, z10, (ActionComponentState) obj4, null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UserSelectComponent value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        UserSelectComponent.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
