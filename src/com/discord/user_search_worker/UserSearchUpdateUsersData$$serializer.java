package com.discord.user_search_worker;

import bj.AbstractC3644f0;
import bj.C3643f;
import com.discord.user_search_worker.UserSearchTransformedUser;
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
import p449yi.C14447n;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/user_search_worker/UserSearchUpdateUsersData.$serializer", "Lbj/f0;", "Lcom/discord/user_search_worker/UserSearchUpdateUsersData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "user_search_worker_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class UserSearchUpdateUsersData$$serializer implements AbstractC3644f0<UserSearchUpdateUsersData> {
    public static final UserSearchUpdateUsersData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserSearchUpdateUsersData$$serializer userSearchUpdateUsersData$$serializer = new UserSearchUpdateUsersData$$serializer();
        INSTANCE = userSearchUpdateUsersData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.user_search_worker.UserSearchUpdateUsersData", userSearchUpdateUsersData$$serializer, 1);
        pluginGeneratedSerialDescriptor.m13841l("payload", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserSearchUpdateUsersData$$serializer() {
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{new C3643f(UserSearchTransformedUser.Serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public UserSearchUpdateUsersData deserialize(Decoder decoder) {
        Object obj;
        C9971q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC10248c b = decoder.mo13905b(descriptor2);
        int i = 1;
        if (b.mo13850p()) {
            obj = b.mo13847y(descriptor2, 0, new C3643f(UserSearchTransformedUser.Serializer.INSTANCE), null);
        } else {
            int i2 = 0;
            obj = null;
            while (i != 0) {
                int o = b.mo13851o(descriptor2);
                if (o == -1) {
                    i = 0;
                } else if (o == 0) {
                    obj = b.mo13847y(descriptor2, 0, new C3643f(UserSearchTransformedUser.Serializer.INSTANCE), obj);
                    i2 |= 1;
                } else {
                    throw new C14447n(o);
                }
            }
            i = i2;
        }
        b.mo13857c(descriptor2);
        return new UserSearchUpdateUsersData(i, (List) obj, null);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, UserSearchUpdateUsersData value) {
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        UserSearchUpdateUsersData.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC3644f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC3644f0.C3645a.m33897a(this);
    }
}
