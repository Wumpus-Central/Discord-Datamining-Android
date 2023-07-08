package com.discord.contact_sync;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import pi.n;
import si.a2;
import si.f0;
import si.h;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/discord/contact_sync/ContactSyncBlobEntry.$serializer", "Lsi/f0;", "Lcom/discord/contact_sync/ContactSyncBlobEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "contact_sync_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ContactSyncBlobEntry$$serializer implements f0<ContactSyncBlobEntry> {
    public static final ContactSyncBlobEntry$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ContactSyncBlobEntry$$serializer contactSyncBlobEntry$$serializer = new ContactSyncBlobEntry$$serializer();
        INSTANCE = contactSyncBlobEntry$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.contact_sync.ContactSyncBlobEntry", contactSyncBlobEntry$$serializer, 6);
        pluginGeneratedSerialDescriptor.l("phone", false);
        pluginGeneratedSerialDescriptor.l("unencryptedName", false);
        pluginGeneratedSerialDescriptor.l("hasImageData", false);
        pluginGeneratedSerialDescriptor.l("deviceContactId", false);
        pluginGeneratedSerialDescriptor.l("givenName", false);
        pluginGeneratedSerialDescriptor.l("familyName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContactSyncBlobEntry$$serializer() {
    }

    @Override // si.f0
    public KSerializer<?>[] childSerializers() {
        a2 a2Var = a2.f26230a;
        return new KSerializer[]{a2Var, a2Var, h.f26272a, a2Var, a2Var, a2Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ContactSyncBlobEntry deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        boolean z10;
        String str4;
        String str5;
        int i10;
        q.g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c c10 = decoder.c(descriptor2);
        if (c10.y()) {
            str5 = c10.t(descriptor2, 0);
            str4 = c10.t(descriptor2, 1);
            z10 = c10.s(descriptor2, 2);
            str3 = c10.t(descriptor2, 3);
            str2 = c10.t(descriptor2, 4);
            str = c10.t(descriptor2, 5);
            i10 = 63;
        } else {
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            boolean z11 = true;
            boolean z12 = false;
            int i11 = 0;
            while (z11) {
                int x10 = c10.x(descriptor2);
                switch (x10) {
                    case -1:
                        z11 = false;
                        continue;
                    case 0:
                        str6 = c10.t(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        str10 = c10.t(descriptor2, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        z12 = c10.s(descriptor2, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        str8 = c10.t(descriptor2, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        str9 = c10.t(descriptor2, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        str7 = c10.t(descriptor2, 5);
                        i11 |= 32;
                        break;
                    default:
                        throw new n(x10);
                }
            }
            str = str7;
            str2 = str9;
            str5 = str6;
            str3 = str8;
            i10 = i11;
            z10 = z12;
            str4 = str10;
        }
        c10.b(descriptor2);
        return new ContactSyncBlobEntry(i10, str5, str4, z10, str3, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, pi.h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ContactSyncBlobEntry value) {
        q.g(encoder, "encoder");
        q.g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder c10 = encoder.c(descriptor2);
        ContactSyncBlobEntry.write$Self(value, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // si.f0
    public KSerializer<?>[] typeParametersSerializers() {
        return f0.a.a(this);
    }
}
