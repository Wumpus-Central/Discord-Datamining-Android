package com.discord.user_search_worker;

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
import ti.n;
import ui.a;
import wi.a2;
import wi.f0;
import wi.h;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/user_search_worker/UserSearchQuerySetFilters.$serializer", "Lwi/f0;", "Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "user_search_worker_release"}, k = 1, mv = {1, 8, 0})

public final class UserSearchQuerySetFilters$$serializer implements f0<UserSearchQuerySetFilters> {
    public static final UserSearchQuerySetFilters$$serializer INSTANCE;
    private static final  PluginGeneratedSerialDescriptor descriptor;

    static {
        UserSearchQuerySetFilters$$serializer userSearchQuerySetFilters$$serializer = new UserSearchQuerySetFilters$$serializer();
        INSTANCE = userSearchQuerySetFilters$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchQuerySetFilters", userSearchQuerySetFilters$$serializer, 3);
        pluginGeneratedSerialDescriptor.l("guild", true);
        pluginGeneratedSerialDescriptor.l("friends", true);
        pluginGeneratedSerialDescriptor.l("strict", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserSearchQuerySetFilters$$serializer() {
    }

    @Override 
    public KSerializer<?>[] childSerializers() {
        h hVar = h.f29582a;
        return new KSerializer[]{a.u(a2.f29540a), a.u(hVar), a.u(hVar)};
    }

    @Override 
    public UserSearchQuerySetFilters deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        q.h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        Object obj4 = null;
        if (c10.y()) {
            obj3 = c10.v(descriptor2, 0, a2.f29540a, null);
            h hVar = h.f29582a;
            obj = c10.v(descriptor2, 1, hVar, null);
            obj2 = c10.v(descriptor2, 2, hVar, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj5 = null;
            Object obj6 = null;
            while (z10) {
                int x10 = c10.x(descriptor2);
                if (x10 == -1) {
                    z10 = false;
                } else if (x10 == 0) {
                    obj4 = c10.v(descriptor2, 0, a2.f29540a, obj4);
                    i11 |= 1;
                } else if (x10 == 1) {
                    obj5 = c10.v(descriptor2, 1, h.f29582a, obj5);
                    i11 |= 2;
                } else if (x10 == 2) {
                    obj6 = c10.v(descriptor2, 2, h.f29582a, obj6);
                    i11 |= 4;
                } else {
                    throw new n(x10);
                }
            }
            obj = obj5;
            obj2 = obj6;
            i10 = i11;
            obj3 = obj4;
        }
        c10.b(descriptor2);
        return new UserSearchQuerySetFilters(i10, (String) obj3, (Boolean) obj, (Boolean) obj2, (SerializationConstructorMarker) null);
    }

    @Override 
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UserSearchQuerySetFilters value) {
        q.h(encoder, "encoder");
        q.h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        UserSearchQuerySetFilters.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override 
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
