package com.discord.contact_sync;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.n1;

@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201B]\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013¨\u00062"}, d2 = {"Lcom/discord/contact_sync/ContactSyncBlobEntry;", "", "seen1", "", "phone", "", "unencryptedName", "hasImageData", "", "deviceContactId", "givenName", "familyName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceContactId$annotations", "()V", "getDeviceContactId", "()Ljava/lang/String;", "getFamilyName$annotations", "getFamilyName", "getGivenName$annotations", "getGivenName", "getHasImageData$annotations", "getHasImageData", "()Z", "getPhone", "getUnencryptedName$annotations", "getUnencryptedName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "contact_sync_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactSyncBlobEntry {
    public static final Companion Companion = new Companion(null);
    private final String deviceContactId;
    private final String familyName;
    private final String givenName;
    private final boolean hasImageData;
    private final String phone;
    private final String unencryptedName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/contact_sync/ContactSyncBlobEntry$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/contact_sync/ContactSyncBlobEntry;", "contact_sync_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContactSyncBlobEntry> serializer() {
            return ContactSyncBlobEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContactSyncBlobEntry(int i10, String str, String str2, boolean z10, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i10 & 63)) {
            n1.b(i10, 63, ContactSyncBlobEntry$$serializer.INSTANCE.getDescriptor());
        }
        this.phone = str;
        this.unencryptedName = str2;
        this.hasImageData = z10;
        this.deviceContactId = str3;
        this.givenName = str4;
        this.familyName = str5;
    }

    public static /* synthetic */ ContactSyncBlobEntry copy$default(ContactSyncBlobEntry contactSyncBlobEntry, String str, String str2, boolean z10, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = contactSyncBlobEntry.phone;
        }
        if ((i10 & 2) != 0) {
            str2 = contactSyncBlobEntry.unencryptedName;
        }
        if ((i10 & 4) != 0) {
            z10 = contactSyncBlobEntry.hasImageData;
        }
        if ((i10 & 8) != 0) {
            str3 = contactSyncBlobEntry.deviceContactId;
        }
        if ((i10 & 16) != 0) {
            str4 = contactSyncBlobEntry.givenName;
        }
        if ((i10 & 32) != 0) {
            str5 = contactSyncBlobEntry.familyName;
        }
        return contactSyncBlobEntry.copy(str, str2, z10, str3, str4, str5);
    }

    public static /* synthetic */ void getDeviceContactId$annotations() {
    }

    public static /* synthetic */ void getFamilyName$annotations() {
    }

    public static /* synthetic */ void getGivenName$annotations() {
    }

    public static /* synthetic */ void getHasImageData$annotations() {
    }

    public static /* synthetic */ void getUnencryptedName$annotations() {
    }

    public static final void write$Self(ContactSyncBlobEntry self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.z(serialDesc, 0, self.phone);
        output.z(serialDesc, 1, self.unencryptedName);
        output.y(serialDesc, 2, self.hasImageData);
        output.z(serialDesc, 3, self.deviceContactId);
        output.z(serialDesc, 4, self.givenName);
        output.z(serialDesc, 5, self.familyName);
    }

    public final String component1() {
        return this.phone;
    }

    public final String component2() {
        return this.unencryptedName;
    }

    public final boolean component3() {
        return this.hasImageData;
    }

    public final String component4() {
        return this.deviceContactId;
    }

    public final String component5() {
        return this.givenName;
    }

    public final String component6() {
        return this.familyName;
    }

    public final ContactSyncBlobEntry copy(String phone, String unencryptedName, boolean z10, String deviceContactId, String givenName, String familyName) {
        q.g(phone, "phone");
        q.g(unencryptedName, "unencryptedName");
        q.g(deviceContactId, "deviceContactId");
        q.g(givenName, "givenName");
        q.g(familyName, "familyName");
        return new ContactSyncBlobEntry(phone, unencryptedName, z10, deviceContactId, givenName, familyName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactSyncBlobEntry)) {
            return false;
        }
        ContactSyncBlobEntry contactSyncBlobEntry = (ContactSyncBlobEntry) obj;
        return q.b(this.phone, contactSyncBlobEntry.phone) && q.b(this.unencryptedName, contactSyncBlobEntry.unencryptedName) && this.hasImageData == contactSyncBlobEntry.hasImageData && q.b(this.deviceContactId, contactSyncBlobEntry.deviceContactId) && q.b(this.givenName, contactSyncBlobEntry.givenName) && q.b(this.familyName, contactSyncBlobEntry.familyName);
    }

    public final String getDeviceContactId() {
        return this.deviceContactId;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final boolean getHasImageData() {
        return this.hasImageData;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getUnencryptedName() {
        return this.unencryptedName;
    }

    public int hashCode() {
        int hashCode = ((this.phone.hashCode() * 31) + this.unencryptedName.hashCode()) * 31;
        boolean z10 = this.hasImageData;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return ((((((hashCode + i10) * 31) + this.deviceContactId.hashCode()) * 31) + this.givenName.hashCode()) * 31) + this.familyName.hashCode();
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.unencryptedName;
        boolean z10 = this.hasImageData;
        String str3 = this.deviceContactId;
        String str4 = this.givenName;
        String str5 = this.familyName;
        return "ContactSyncBlobEntry(phone=" + str + ", unencryptedName=" + str2 + ", hasImageData=" + z10 + ", deviceContactId=" + str3 + ", givenName=" + str4 + ", familyName=" + str5 + ")";
    }

    public ContactSyncBlobEntry(String phone, String unencryptedName, boolean z10, String deviceContactId, String givenName, String familyName) {
        q.g(phone, "phone");
        q.g(unencryptedName, "unencryptedName");
        q.g(deviceContactId, "deviceContactId");
        q.g(givenName, "givenName");
        q.g(familyName, "familyName");
        this.phone = phone;
        this.unencryptedName = unencryptedName;
        this.hasImageData = z10;
        this.deviceContactId = deviceContactId;
        this.givenName = givenName;
        this.familyName = familyName;
    }
}
