package com.discord.contact_sync;

import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/contact_sync/ContactNameEntry;", "", "givenName", "", "familyName", "(Ljava/lang/String;Ljava/lang/String;)V", "getFamilyName", "()Ljava/lang/String;", "getGivenName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "contact_sync_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ContactNameEntry {
    private final String familyName;
    private final String givenName;

    public ContactNameEntry(String str, String str2) {
        this.givenName = str;
        this.familyName = str2;
    }

    public static  ContactNameEntry copy$default(ContactNameEntry contactNameEntry, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = contactNameEntry.givenName;
        }
        if ((i10 & 2) != 0) {
            str2 = contactNameEntry.familyName;
        }
        return contactNameEntry.copy(str, str2);
    }

    public final String component1() {
        return this.givenName;
    }

    public final String component2() {
        return this.familyName;
    }

    public final ContactNameEntry copy(String str, String str2) {
        return new ContactNameEntry(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactNameEntry)) {
            return false;
        }
        ContactNameEntry contactNameEntry = (ContactNameEntry) obj;
        return q.c(this.givenName, contactNameEntry.givenName) && q.c(this.familyName, contactNameEntry.familyName);
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public int hashCode() {
        String str = this.givenName;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.familyName;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.givenName;
        String str2 = this.familyName;
        return "ContactNameEntry(givenName=" + str + ", familyName=" + str2 + ")";
    }
}
