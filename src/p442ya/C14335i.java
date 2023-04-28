package p442ya;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.image.ReactImageView;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import p420x9.C14004p;
import p441y9.AbstractC14320a;
import p441y9.C14323c;

/* renamed from: ya.i */
/* loaded from: classes3.dex */
public class C14335i extends AbstractC14320a {
    public static final Parcelable.Creator<C14335i> CREATOR = new C14341n();

    /* renamed from: s */
    public static final C14335i f32454s = new C14336a().m819a();
    @Deprecated

    /* renamed from: t */
    public static final C14335i f32455t;
    @Deprecated

    /* renamed from: u */
    public static final C14335i f32456u;

    /* renamed from: k */
    final int f32457k;
    @Deprecated

    /* renamed from: l */
    final int f32458l;

    /* renamed from: m */
    final int f32459m;

    /* renamed from: n */
    final int f32460n;
    @Deprecated

    /* renamed from: o */
    final boolean f32461o;

    /* renamed from: p */
    final int f32462p;

    /* renamed from: q */
    final int f32463q;

    /* renamed from: r */
    private final int f32464r;

    /* renamed from: ya.i$a */
    /* loaded from: classes3.dex */
    public static class C14336a {

        /* renamed from: a */
        private int f32465a = 3;

        /* renamed from: b */
        private int f32466b = ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS;

        /* renamed from: c */
        private int f32467c = 0;

        /* renamed from: d */
        private int f32468d = -1;

        /* renamed from: a */
        public C14335i m819a() {
            if (this.f32468d != 2 || this.f32467c != 1) {
                return new C14335i(2, 0, this.f32466b, this.f32467c, false, this.f32468d, this.f32465a, 0);
            }
            throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
        }

        /* renamed from: b */
        public C14336a m818b(int i) {
            boolean z;
            if (i == Integer.MAX_VALUE || (i > 0 && i <= 86400)) {
                z = true;
            } else {
                z = false;
            }
            C14004p.m2058c(z, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i), 86400);
            this.f32466b = i;
            return this;
        }

        /* renamed from: c */
        public final C14336a m817c(int i) {
            this.f32468d = 2;
            return this;
        }
    }

    static {
        C14336a aVar = new C14336a();
        aVar.m817c(2);
        aVar.m818b(ViewDefaults.NUMBER_OF_LINES);
        C14335i a = aVar.m819a();
        f32455t = a;
        f32456u = a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C14335i(int r2, int r3, int r4, int r5, boolean r6, int r7, int r8, int r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.f32457k = r2
            r1.f32458l = r3
            r2 = 1
            r0 = 2
            if (r3 != 0) goto L_0x000e
        L_0x000b:
            r1.f32463q = r8
            goto L_0x0019
        L_0x000e:
            if (r3 == r0) goto L_0x0017
            r8 = 3
            if (r3 == r8) goto L_0x0014
            goto L_0x000b
        L_0x0014:
            r1.f32463q = r0
            goto L_0x0019
        L_0x0017:
            r1.f32463q = r2
        L_0x0019:
            r1.f32460n = r5
            r1.f32461o = r6
            if (r6 == 0) goto L_0x0027
            r1.f32462p = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.f32459m = r2
            goto L_0x0038
        L_0x0027:
            r1.f32459m = r4
            r3 = -1
            if (r7 == r3) goto L_0x0036
            if (r7 == 0) goto L_0x0036
            if (r7 == r2) goto L_0x0036
            r2 = 6
            if (r7 == r2) goto L_0x0036
            r1.f32462p = r7
            goto L_0x0038
        L_0x0036:
            r1.f32462p = r3
        L_0x0038:
            r1.f32464r = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p442ya.C14335i.<init>(int, int, int, int, boolean, int, int, int):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14335i)) {
            return false;
        }
        C14335i iVar = (C14335i) obj;
        if (this.f32457k == iVar.f32457k && this.f32463q == iVar.f32463q && this.f32459m == iVar.f32459m && this.f32460n == iVar.f32460n && this.f32462p == iVar.f32462p && this.f32464r == iVar.f32464r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f32457k * 31) + this.f32463q) * 31) + this.f32459m) * 31) + this.f32460n) * 31) + this.f32462p) * 31) + this.f32464r;
    }

    /* renamed from: p */
    public final int m820p() {
        return this.f32464r;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        int i = this.f32459m;
        int i2 = this.f32460n;
        String str4 = "DEFAULT";
        if (i2 == 0) {
            str = str4;
        } else if (i2 != 1) {
            str = "UNKNOWN:" + i2;
        } else {
            str = "EARSHOT";
        }
        int i3 = this.f32462p;
        if (i3 == -1) {
            str2 = str4;
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i3 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i3 & 2) > 0) {
                arrayList.add("BLE");
            }
            if (arrayList.isEmpty()) {
                str2 = "UNKNOWN:" + i3;
            } else {
                str2 = arrayList.toString();
            }
        }
        int i4 = this.f32463q;
        if (i4 == 3) {
            str3 = str4;
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i4 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i4 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            if (arrayList2.isEmpty()) {
                str3 = "UNKNOWN:" + i4;
            } else {
                str3 = arrayList2.toString();
            }
        }
        int i5 = this.f32464r;
        if (i5 != 0) {
            if (i5 != 1) {
                str4 = "UNKNOWN: " + i5;
            } else {
                str4 = "ALWAYS_ON";
            }
        }
        return "Strategy{ttlSeconds=" + i + ", distanceType=" + str + ", discoveryMedium=" + str2 + ", discoveryMode=" + str3 + ", backgroundScanMode=" + str4 + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = C14323c.m857a(parcel);
        C14323c.m848j(parcel, 1, this.f32458l);
        C14323c.m848j(parcel, 2, this.f32459m);
        C14323c.m848j(parcel, 3, this.f32460n);
        C14323c.m855c(parcel, 4, this.f32461o);
        C14323c.m848j(parcel, 5, this.f32462p);
        C14323c.m848j(parcel, 6, this.f32463q);
        C14323c.m848j(parcel, 7, this.f32464r);
        C14323c.m848j(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f32457k);
        C14323c.m856b(parcel, a);
    }
}
