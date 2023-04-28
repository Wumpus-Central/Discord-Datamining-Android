package com.discord.user_search_worker;

import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2521f;
import bj.C2555m0;
import bj.C2574r0;
import bj.C2591x;
import java.util.List;
import java.util.Map;
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
import p450yi.C14382n;
import p470zi.C14606a;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/user_search_worker/UserSearchQuerySetPayload.$serializer", "Lbj/f0;", "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "user_search_worker_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class UserSearchQuerySetPayload$$serializer implements AbstractC2522f0<UserSearchQuerySetPayload> {
    public static final UserSearchQuerySetPayload$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserSearchQuerySetPayload$$serializer userSearchQuerySetPayload$$serializer = new UserSearchQuerySetPayload$$serializer();
        INSTANCE = userSearchQuerySetPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchQuerySetPayload", userSearchQuerySetPayload$$serializer, 6);
        pluginGeneratedSerialDescriptor.m13841l("query", false);
        pluginGeneratedSerialDescriptor.m13841l("filters", true);
        pluginGeneratedSerialDescriptor.m13841l("blacklist", true);
        pluginGeneratedSerialDescriptor.m13841l("whitelist", true);
        pluginGeneratedSerialDescriptor.m13841l("boosters", false);
        pluginGeneratedSerialDescriptor.m13841l("limit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserSearchQuerySetPayload$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{a2Var, C14606a.m13u(UserSearchQuerySetFilters$$serializer.INSTANCE), C14606a.m13u(new C2521f(a2Var)), C14606a.m13u(new C2521f(a2Var)), new C2574r0(a2Var, C2591x.f6840a), C2555m0.f6794a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UserSearchQuerySetPayload deserialize(Decoder decoder) {
        int i;
        String str;
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        int i3 = 5;
        if (b.mo13850p()) {
            str = b.mo13853m(descriptor2, 0);
            obj = b.mo13852n(descriptor2, 1, UserSearchQuerySetFilters$$serializer.INSTANCE, null);
            C2500a2 a2Var = C2500a2.f6719a;
            obj2 = b.mo13852n(descriptor2, 2, new C2521f(a2Var), null);
            obj4 = b.mo13852n(descriptor2, 3, new C2521f(a2Var), null);
            obj3 = b.mo13847y(descriptor2, 4, new C2574r0(a2Var, C2591x.f6840a), null);
            i = b.mo13855i(descriptor2, 5);
            i2 = 63;
        } else {
            boolean z = true;
            int i4 = 0;
            String str2 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            int i5 = 0;
            while (z) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z = false;
                        i3 = 5;
                    case 0:
                        str2 = b.mo13853m(descriptor2, 0);
                        i5 |= 1;
                        i3 = 5;
                    case 1:
                        obj5 = b.mo13852n(descriptor2, 1, UserSearchQuerySetFilters$$serializer.INSTANCE, obj5);
                        i5 |= 2;
                        i3 = 5;
                    case 2:
                        obj6 = b.mo13852n(descriptor2, 2, new C2521f(C2500a2.f6719a), obj6);
                        i5 |= 4;
                        i3 = 5;
                    case 3:
                        obj7 = b.mo13852n(descriptor2, 3, new C2521f(C2500a2.f6719a), obj7);
                        i5 |= 8;
                        i3 = 5;
                    case 4:
                        obj8 = b.mo13847y(descriptor2, 4, new C2574r0(C2500a2.f6719a, C2591x.f6840a), obj8);
                        i5 |= 16;
                        i3 = 5;
                    case 5:
                        i4 = b.mo13855i(descriptor2, i3);
                        i5 |= 32;
                    default:
                        throw new C14382n(o);
                }
            }
            i = i4;
            obj = obj5;
            obj2 = obj6;
            obj4 = obj7;
            obj3 = obj8;
            str = str2;
            i2 = i5;
        }
        b.mo13857c(descriptor2);
        return new UserSearchQuerySetPayload(i2, str, (UserSearchQuerySetFilters) obj, (List) obj2, (List) obj4, (Map) obj3, i, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UserSearchQuerySetPayload value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        UserSearchQuerySetPayload.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
