package p155ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;
import qa.C12074k;

/* renamed from: ia.y */
/* loaded from: classes5.dex */
public class C8380y extends AbstractC14320a {
    public static final Parcelable.Creator<C8380y> CREATOR = new C8329d0();

    /* renamed from: m */
    public static final C8380y f18275m = new C8380y(EnumC8381a.SUPPORTED.toString(), null);

    /* renamed from: n */
    public static final C8380y f18276n = new C8380y(EnumC8381a.NOT_SUPPORTED.toString(), null);

    /* renamed from: k */
    private final EnumC8381a f18277k;

    /* renamed from: l */
    private final String f18278l;

    /* renamed from: ia.y$a */
    /* loaded from: classes5.dex */
    public enum EnumC8381a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");
        
        public static final Parcelable.Creator<EnumC8381a> CREATOR = new C8339g1();

        /* renamed from: k */
        private final String f18283k;

        EnumC8381a(String str) {
            this.f18283k = str;
        }

        /* renamed from: a */
        public static EnumC8381a m19883a(String str) {
            EnumC8381a[] values;
            for (EnumC8381a aVar : values()) {
                if (str.equals(aVar.f18283k)) {
                    return aVar;
                }
            }
            throw new C8382b(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f18283k;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f18283k);
        }
    }

    /* renamed from: ia.y$b */
    /* loaded from: classes5.dex */
    public static class C8382b extends Exception {
        public C8382b(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8380y(String str, String str2) {
        C14004p.m2051j(str);
        try {
            this.f18277k = EnumC8381a.m19883a(str);
            this.f18278l = str2;
        } catch (C8382b e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8380y)) {
            return false;
        }
        C8380y yVar = (C8380y) obj;
        if (!C12074k.m7878a(this.f18277k, yVar.f18277k) || !C12074k.m7878a(this.f18278l, yVar.f18278l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18277k, this.f18278l});
    }

    /* renamed from: p */
    public String m19885p() {
        return this.f18278l;
    }

    /* renamed from: r */
    public String m19884r() {
        return this.f18277k.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m842p(parcel, 2, m19884r(), false);
        C14323c.m842p(parcel, 3, m19885p(), false);
        C14323c.m856b(parcel, a);
    }
}
