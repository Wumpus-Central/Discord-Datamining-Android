package com.discord.bundle_updater;

import java.util.List;
import java.util.Map;
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
import ui.n;
import vi.a;
import xi.a2;
import xi.f;
import xi.f0;
import xi.h;
import xi.m0;
import xi.r0;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/bundle_updater/BuildOverrideCookieMeta.$serializer", "Lxi/f0;", "Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "bundle_updater_release"}, k = 1, mv = {1, 8, 0})

public final class BuildOverrideCookieMeta$$serializer implements f0<BuildOverrideCookieMeta> {
    public static final BuildOverrideCookieMeta$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        BuildOverrideCookieMeta$$serializer buildOverrideCookieMeta$$serializer = new BuildOverrideCookieMeta$$serializer();
        INSTANCE = buildOverrideCookieMeta$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.bundle_updater.BuildOverrideCookieMeta", buildOverrideCookieMeta$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("expiresAt", true);
        pluginGeneratedSerialDescriptor.l("releaseChannel", true);
        pluginGeneratedSerialDescriptor.l("validForUserIds", true);
        pluginGeneratedSerialDescriptor.l("allowedVersions", true);
        pluginGeneratedSerialDescriptor.l("allowLoggedOut", true);
        pluginGeneratedSerialDescriptor.l("experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BuildOverrideCookieMeta$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f30576a;
        return new KSerializer[]{a.u(a2Var), a.u(a2Var), a.u(new f(a2Var)), a.u(new f(a2Var)), a.u(h.f30618a), a.u(new r0(a2Var, m0.f30651a))};
    }

    @Override 
    public BuildOverrideCookieMeta deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i10;
        Object obj6;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i11 = 5;
        char c10 = 2;
        boolean z10 = true;
        Object obj7 = null;
        if (b10.p()) {
            a2 a2Var = a2.f30576a;
            obj2 = b10.n(descriptor2, 0, a2Var, null);
            obj3 = b10.n(descriptor2, 1, a2Var, null);
            obj4 = b10.n(descriptor2, 2, new f(a2Var), null);
            obj = b10.n(descriptor2, 3, new f(a2Var), null);
            obj5 = b10.n(descriptor2, 4, h.f30618a, null);
            obj6 = b10.n(descriptor2, 5, new r0(a2Var, m0.f30651a), null);
            i10 = 63;
        } else {
            boolean z11 = true;
            int i12 = 0;
            Object obj8 = null;
            Object obj9 = null;
            obj = null;
            Object obj10 = null;
            Object obj11 = null;
            while (z11) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z11 = false;
                        i11 = 5;
                    case 0:
                        obj7 = b10.n(descriptor2, 0, a2.f30576a, obj7);
                        i12 |= 1;
                        c10 = c10;
                        z10 = z10;
                        i11 = 5;
                    case 1:
                        obj8 = b10.n(descriptor2, 1, a2.f30576a, obj8);
                        i12 |= 2;
                        c10 = c10;
                        z10 = true;
                    case 2:
                        obj9 = b10.n(descriptor2, 2, new f(a2.f30576a), obj9);
                        i12 |= 4;
                        c10 = 2;
                        z10 = true;
                    case 3:
                        obj = b10.n(descriptor2, 3, new f(a2.f30576a), obj);
                        i12 |= 8;
                        c10 = 2;
                        z10 = true;
                    case 4:
                        obj10 = b10.n(descriptor2, 4, h.f30618a, obj10);
                        i12 |= 16;
                        c10 = 2;
                        z10 = true;
                    case 5:
                        obj11 = b10.n(descriptor2, i11, new r0(a2.f30576a, m0.f30651a), obj11);
                        i12 |= 32;
                        c10 = 2;
                        z10 = true;
                    default:
                        throw new n(o10);
                }
            }
            i10 = i12;
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
            obj5 = obj10;
            obj6 = obj11;
        }
        b10.c(descriptor2);
        return new BuildOverrideCookieMeta(i10, (String) obj2, (String) obj3, (List) obj4, (List) obj, (Boolean) obj5, (Map) obj6, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, BuildOverrideCookieMeta value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        BuildOverrideCookieMeta.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
