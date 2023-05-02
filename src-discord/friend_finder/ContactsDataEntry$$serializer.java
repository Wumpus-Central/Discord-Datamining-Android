package com.discord.friend_finder;

import bj.a2;
import bj.f0;
import bj.h;
import bj.v1;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import yi.n;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/friend_finder/ContactsDataEntry.$serializer", "Lbj/f0;", "Lcom/discord/friend_finder/ContactsDataEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "friend_finder_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ContactsDataEntry$$serializer implements f0<ContactsDataEntry> {
    public static final ContactsDataEntry$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ContactsDataEntry$$serializer contactsDataEntry$$serializer = new ContactsDataEntry$$serializer();
        INSTANCE = contactsDataEntry$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.friend_finder.ContactsDataEntry", contactsDataEntry$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("contactMethod", false);
        pluginGeneratedSerialDescriptor.l("contactMethodLabel", false);
        pluginGeneratedSerialDescriptor.l("contactMethodType", false);
        pluginGeneratedSerialDescriptor.l("contactNames", false);
        pluginGeneratedSerialDescriptor.l("hasImageData", false);
        pluginGeneratedSerialDescriptor.l("deviceContactIds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContactsDataEntry$$serializer() {
    }

    @Override // bj.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f5917a;
        return new KSerializer[]{a2Var, a2Var, a2Var, new v1(kotlin.jvm.internal.f0.b(ContactName.class), ContactName$$serializer.INSTANCE), h.f5959a, new v1(kotlin.jvm.internal.f0.b(String.class), a2Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ContactsDataEntry deserialize(Decoder decoder) {
        boolean z10;
        String str;
        String str2;
        String str3;
        int i10;
        Object obj;
        Object obj2;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b10 = decoder.b(descriptor2);
        char c10 = 3;
        int i11 = 2;
        if (b10.p()) {
            str3 = b10.m(descriptor2, 0);
            str2 = b10.m(descriptor2, 1);
            str = b10.m(descriptor2, 2);
            obj = b10.y(descriptor2, 3, new v1(kotlin.jvm.internal.f0.b(ContactName.class), ContactName$$serializer.INSTANCE), null);
            z10 = b10.C(descriptor2, 4);
            obj2 = b10.y(descriptor2, 5, new v1(kotlin.jvm.internal.f0.b(String.class), a2.f5917a), null);
            i10 = 63;
        } else {
            boolean z11 = true;
            int i12 = 0;
            str3 = null;
            str2 = null;
            str = null;
            Object obj3 = null;
            Object obj4 = null;
            boolean z12 = false;
            while (z11) {
                int o10 = b10.o(descriptor2);
                switch (o10) {
                    case -1:
                        z11 = false;
                        c10 = c10;
                        i11 = i11;
                    case 0:
                        c10 = c10;
                        i11 = i11;
                        str3 = b10.m(descriptor2, 0);
                        i12 |= 1;
                    case 1:
                        c10 = c10;
                        i11 = i11;
                        str2 = b10.m(descriptor2, 1);
                        i12 |= 2;
                    case 2:
                        c10 = c10;
                        i11 = i11;
                        str = b10.m(descriptor2, i11);
                        i12 |= 4;
                    case 3:
                        obj3 = b10.y(descriptor2, 3, new v1(kotlin.jvm.internal.f0.b(ContactName.class), ContactName$$serializer.INSTANCE), obj3);
                        i12 |= 8;
                        c10 = 3;
                        i11 = 2;
                    case 4:
                        z12 = b10.C(descriptor2, 4);
                        i12 |= 16;
                        c10 = 3;
                        i11 = 2;
                    case 5:
                        obj4 = b10.y(descriptor2, 5, new v1(kotlin.jvm.internal.f0.b(String.class), a2.f5917a), obj4);
                        i12 |= 32;
                        c10 = 3;
                        i11 = 2;
                    default:
                        throw new n(o10);
                }
            }
            obj2 = obj4;
            z10 = z12;
            obj = obj3;
            i10 = i12;
        }
        b10.c(descriptor2);
        return new ContactsDataEntry(i10, str3, str2, str, (ContactName[]) obj, z10, (String[]) obj2, null);
    }

    @Override // kotlinx.serialization.KSerializer, yi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ContactsDataEntry value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b10 = encoder.b(descriptor2);
        ContactsDataEntry.write$Self(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // bj.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}