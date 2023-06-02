package com.discord.user_search_worker;

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
import uj.n;
import vj.a;
import xj.a2;
import xj.f;
import xj.f0;
import xj.m0;
import xj.r0;
import xj.x;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/user_search_worker/UserSearchQuerySetPayload.$serializer", "Lxj/f0;", "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "user_search_worker_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class UserSearchQuerySetPayload$$serializer implements f0<UserSearchQuerySetPayload> {
    public static final UserSearchQuerySetPayload$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserSearchQuerySetPayload$$serializer userSearchQuerySetPayload$$serializer = new UserSearchQuerySetPayload$$serializer();
        INSTANCE = userSearchQuerySetPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchQuerySetPayload", userSearchQuerySetPayload$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("query", false);
        pluginGeneratedSerialDescriptor.l("filters", true);
        pluginGeneratedSerialDescriptor.l("blacklist", true);
        pluginGeneratedSerialDescriptor.l("whitelist", true);
        pluginGeneratedSerialDescriptor.l("boosters", false);
        pluginGeneratedSerialDescriptor.l("limit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserSearchQuerySetPayload$$serializer() {
    }

    @Override // xj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f32313a;
        return new KSerializer[]{a2Var, a.u(UserSearchQuerySetFilters$$serializer.INSTANCE), a.u(new f(a2Var)), a.u(new f(a2Var)), new r0(a2Var, x.f32434a), m0.f32388a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UserSearchQuerySetPayload deserialize(Decoder decoder) {
        int i10;
        String str;
        int i11;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        int i12 = 5;
        if (b10.p()) {
            str = b10.m(descriptor2, 0);
            obj = b10.n(descriptor2, 1, UserSearchQuerySetFilters$$serializer.INSTANCE, null);
            a2 a2Var = a2.f32313a;
            obj2 = b10.n(descriptor2, 2, new f(a2Var), null);
            obj4 = b10.n(descriptor2, 3, new f(a2Var), null);
            obj3 = b10.y(descriptor2, 4, new r0(a2Var, x.f32434a), null);
            i10 = b10.i(descriptor2, 5);
            i11 = 63;
        } else {
            boolean z10 = true;
            int i13 = 0;
            String str2 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            int i14 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z10 = false;
                        i12 = 5;
                    case 0:
                        str2 = b10.m(descriptor2, 0);
                        i14 |= 1;
                        i12 = 5;
                    case 1:
                        obj5 = b10.n(descriptor2, 1, UserSearchQuerySetFilters$$serializer.INSTANCE, obj5);
                        i14 |= 2;
                        i12 = 5;
                    case 2:
                        obj6 = b10.n(descriptor2, 2, new f(a2.f32313a), obj6);
                        i14 |= 4;
                        i12 = 5;
                    case 3:
                        obj7 = b10.n(descriptor2, 3, new f(a2.f32313a), obj7);
                        i14 |= 8;
                        i12 = 5;
                    case 4:
                        obj8 = b10.y(descriptor2, 4, new r0(a2.f32313a, x.f32434a), obj8);
                        i14 |= 16;
                        i12 = 5;
                    case 5:
                        i13 = b10.i(descriptor2, i12);
                        i14 |= 32;
                    default:
                        throw new n(o10);
                }
            }
            i10 = i13;
            obj = obj5;
            obj2 = obj6;
            obj4 = obj7;
            obj3 = obj8;
            str = str2;
            i11 = i14;
        }
        b10.c(descriptor2);
        return new UserSearchQuerySetPayload(i11, str, (UserSearchQuerySetFilters) obj, (List) obj2, (List) obj4, (Map) obj3, i10, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, uj.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UserSearchQuerySetPayload value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        UserSearchQuerySetPayload.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // xj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
