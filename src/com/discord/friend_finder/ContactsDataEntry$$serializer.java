package com.discord.friend_finder;

import bj.AbstractC2522f0;
import bj.C2500a2;
import bj.C2530h;
import bj.C2587v1;
import kotlin.Metadata;
import kotlin.jvm.internal.C9656f0;
import kotlin.jvm.internal.C9677q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC9967c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p450yi.C14382n;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"com/discord/friend_finder/ContactsDataEntry.$serializer", "Lbj/f0;", "Lcom/discord/friend_finder/ContactsDataEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "friend_finder_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ContactsDataEntry$$serializer implements AbstractC2522f0<ContactsDataEntry> {
    public static final ContactsDataEntry$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ContactsDataEntry$$serializer contactsDataEntry$$serializer = new ContactsDataEntry$$serializer();
        INSTANCE = contactsDataEntry$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.friend_finder.ContactsDataEntry", contactsDataEntry$$serializer, 6);
        pluginGeneratedSerialDescriptor.m13841l("contactMethod", false);
        pluginGeneratedSerialDescriptor.m13841l("contactMethodLabel", false);
        pluginGeneratedSerialDescriptor.m13841l("contactMethodType", false);
        pluginGeneratedSerialDescriptor.m13841l("contactNames", false);
        pluginGeneratedSerialDescriptor.m13841l("hasImageData", false);
        pluginGeneratedSerialDescriptor.m13841l("deviceContactIds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContactsDataEntry$$serializer() {
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] childSerializers() {
        C2500a2 a2Var = C2500a2.f6719a;
        return new KSerializer[]{a2Var, a2Var, a2Var, new C2587v1(C9656f0.m14684b(ContactName.class), ContactName$$serializer.INSTANCE), C2530h.f6761a, new C2587v1(C9656f0.m14684b(String.class), a2Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ContactsDataEntry deserialize(Decoder decoder) {
        boolean z;
        String str;
        String str2;
        String str3;
        int i;
        Object obj;
        Object obj2;
        C9677q.m14633g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC9967c b = decoder.mo13905b(descriptor2);
        char c = 3;
        int i2 = 2;
        if (b.mo13850p()) {
            str3 = b.mo13853m(descriptor2, 0);
            str2 = b.mo13853m(descriptor2, 1);
            str = b.mo13853m(descriptor2, 2);
            obj = b.mo13847y(descriptor2, 3, new C2587v1(C9656f0.m14684b(ContactName.class), ContactName$$serializer.INSTANCE), null);
            z = b.mo13861C(descriptor2, 4);
            obj2 = b.mo13847y(descriptor2, 5, new C2587v1(C9656f0.m14684b(String.class), C2500a2.f6719a), null);
            i = 63;
        } else {
            boolean z2 = true;
            int i3 = 0;
            str3 = null;
            str2 = null;
            str = null;
            Object obj3 = null;
            Object obj4 = null;
            boolean z3 = false;
            while (z2) {
                int o = b.mo13851o(descriptor2);
                switch (o) {
                    case -1:
                        z2 = false;
                        c = c;
                        i2 = i2;
                    case 0:
                        c = c;
                        i2 = i2;
                        str3 = b.mo13853m(descriptor2, 0);
                        i3 |= 1;
                    case 1:
                        c = c;
                        i2 = i2;
                        str2 = b.mo13853m(descriptor2, 1);
                        i3 |= 2;
                    case 2:
                        c = c;
                        i2 = i2;
                        str = b.mo13853m(descriptor2, i2);
                        i3 |= 4;
                    case 3:
                        obj3 = b.mo13847y(descriptor2, 3, new C2587v1(C9656f0.m14684b(ContactName.class), ContactName$$serializer.INSTANCE), obj3);
                        i3 |= 8;
                        c = 3;
                        i2 = 2;
                    case 4:
                        z3 = b.mo13861C(descriptor2, 4);
                        i3 |= 16;
                        c = 3;
                        i2 = 2;
                    case 5:
                        obj4 = b.mo13847y(descriptor2, 5, new C2587v1(C9656f0.m14684b(String.class), C2500a2.f6719a), obj4);
                        i3 |= 32;
                        c = 3;
                        i2 = 2;
                    default:
                        throw new C14382n(o);
                }
            }
            obj2 = obj4;
            z = z3;
            obj = obj3;
            i = i3;
        }
        b.mo13857c(descriptor2);
        return new ContactsDataEntry(i, str3, str2, str, (ContactName[]) obj, z, (String[]) obj2, null);
    }

    @Override // kotlinx.serialization.KSerializer, p450yi.AbstractC14372h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ContactsDataEntry value) {
        C9677q.m14633g(encoder, "encoder");
        C9677q.m14633g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder b = encoder.mo13885b(descriptor2);
        ContactsDataEntry.write$Self(value, b, descriptor2);
        b.mo13884c(descriptor2);
    }

    @Override // bj.AbstractC2522f0
    public KSerializer<?>[] typeParametersSerializers() {
        return AbstractC2522f0.C2523a.m33897a(this);
    }
}
