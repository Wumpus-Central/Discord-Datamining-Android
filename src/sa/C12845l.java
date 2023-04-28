package sa;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: sa.l */
/* loaded from: classes3.dex */
public final class C12845l extends C12848o implements AbstractC12847n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12845l(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // sa.AbstractC12847n
    /* renamed from: B */
    public final Bundle mo5280B(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel b = m5270b();
        b.writeInt(9);
        b.writeString(str);
        b.writeString(str2);
        b.writeString(str3);
        C12850q.m5267b(b, bundle);
        Parcel c = m5269c(11, b);
        Bundle bundle2 = (Bundle) C12850q.m5268a(c, Bundle.CREATOR);
        c.recycle();
        return bundle2;
    }

    @Override // sa.AbstractC12847n
    /* renamed from: J */
    public final Bundle mo5279J(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel b = m5270b();
        b.writeInt(i);
        b.writeString(str);
        b.writeString(str2);
        C12850q.m5267b(b, bundle);
        C12850q.m5267b(b, bundle2);
        Parcel c = m5269c(901, b);
        Bundle bundle3 = (Bundle) C12850q.m5268a(c, Bundle.CREATOR);
        c.recycle();
        return bundle3;
    }

    @Override // sa.AbstractC12847n
    /* renamed from: K */
    public final Bundle mo5278K(int i, String str, String str2, Bundle bundle) {
        Parcel b = m5270b();
        b.writeInt(9);
        b.writeString(str);
        b.writeString(str2);
        C12850q.m5267b(b, bundle);
        Parcel c = m5269c(12, b);
        Bundle bundle2 = (Bundle) C12850q.m5268a(c, Bundle.CREATOR);
        c.recycle();
        return bundle2;
    }

    @Override // sa.AbstractC12847n
    /* renamed from: N */
    public final Bundle mo5277N(int i, String str, String str2, String str3, String str4) {
        Parcel b = m5270b();
        b.writeInt(3);
        b.writeString(str);
        b.writeString(str2);
        b.writeString(str3);
        b.writeString(null);
        Parcel c = m5269c(3, b);
        Bundle bundle = (Bundle) C12850q.m5268a(c, Bundle.CREATOR);
        c.recycle();
        return bundle;
    }

    @Override // sa.AbstractC12847n
    /* renamed from: X */
    public final int mo5276X(int i, String str, String str2, Bundle bundle) {
        Parcel b = m5270b();
        b.writeInt(i);
        b.writeString(str);
        b.writeString(str2);
        C12850q.m5267b(b, bundle);
        Parcel c = m5269c(10, b);
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }

    @Override // sa.AbstractC12847n
    /* renamed from: f */
    public final int mo5275f(int i, String str, String str2) {
        Parcel b = m5270b();
        b.writeInt(i);
        b.writeString(str);
        b.writeString(str2);
        Parcel c = m5269c(1, b);
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }

    @Override // sa.AbstractC12847n
    /* renamed from: h */
    public final int mo5274h(int i, String str, String str2) {
        Parcel b = m5270b();
        b.writeInt(3);
        b.writeString(str);
        b.writeString(str2);
        Parcel c = m5269c(5, b);
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }

    @Override // sa.AbstractC12847n
    /* renamed from: o */
    public final Bundle mo5273o(int i, String str, String str2, String str3) {
        Parcel b = m5270b();
        b.writeInt(3);
        b.writeString(str);
        b.writeString(str2);
        b.writeString(str3);
        Parcel c = m5269c(4, b);
        Bundle bundle = (Bundle) C12850q.m5268a(c, Bundle.CREATOR);
        c.recycle();
        return bundle;
    }

    @Override // sa.AbstractC12847n
    /* renamed from: t */
    public final Bundle mo5272t(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel b = m5270b();
        b.writeInt(i);
        b.writeString(str);
        b.writeString(str2);
        b.writeString(str3);
        b.writeString(null);
        C12850q.m5267b(b, bundle);
        Parcel c = m5269c(8, b);
        Bundle bundle2 = (Bundle) C12850q.m5268a(c, Bundle.CREATOR);
        c.recycle();
        return bundle2;
    }

    @Override // sa.AbstractC12847n
    /* renamed from: u */
    public final Bundle mo5271u(int i, String str, String str2, Bundle bundle) {
        Parcel b = m5270b();
        b.writeInt(3);
        b.writeString(str);
        b.writeString(str2);
        C12850q.m5267b(b, bundle);
        Parcel c = m5269c(2, b);
        Bundle bundle2 = (Bundle) C12850q.m5268a(c, Bundle.CREATOR);
        c.recycle();
        return bundle2;
    }
}
