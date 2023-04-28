package p297q8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7548n0;
import p119g9.C7557q0;
import p132h8.AbstractC7935a;
import p132h8.C7937c;
import p348t7.C12999p;

/* renamed from: q8.a */
/* loaded from: classes7.dex */
public class C12041a implements AbstractC7935a<C12041a> {

    /* renamed from: a */
    public final int f27023a;

    /* renamed from: b */
    public final int f27024b;

    /* renamed from: c */
    public final int f27025c;

    /* renamed from: d */
    public final boolean f27026d;

    /* renamed from: e */
    public final C0383a f27027e;

    /* renamed from: f */
    public final C12042b[] f27028f;

    /* renamed from: g */
    public final long f27029g;

    /* renamed from: h */
    public final long f27030h;

    /* renamed from: q8.a$a */
    /* loaded from: classes7.dex */
    public static class C0383a {

        /* renamed from: a */
        public final UUID f27031a;

        /* renamed from: b */
        public final byte[] f27032b;

        /* renamed from: c */
        public final C12999p[] f27033c;

        public C0383a(UUID uuid, byte[] bArr, C12999p[] pVarArr) {
            this.f27031a = uuid;
            this.f27032b = bArr;
            this.f27033c = pVarArr;
        }
    }

    public C12041a(int i, int i2, long j, long j2, long j3, int i3, boolean z, C0383a aVar, C12042b[] bVarArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : C7557q0.m22198I0(j2, 1000000L, j), j3 != 0 ? C7557q0.m22198I0(j3, 1000000L, j) : -9223372036854775807L, i3, z, aVar, bVarArr);
    }

    /* renamed from: b */
    public final C12041a mo7928a(List<C7937c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C12042b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            C7937c cVar = (C7937c) arrayList.get(i);
            C12042b bVar2 = this.f27028f[cVar.f17035l];
            if (!(bVar2 == bVar || bVar == null)) {
                arrayList2.add(bVar.m7925b((C6722k[]) arrayList3.toArray(new C6722k[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f27043j[cVar.f17036m]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.m7925b((C6722k[]) arrayList3.toArray(new C6722k[0])));
        }
        return new C12041a(this.f27023a, this.f27024b, this.f27029g, this.f27030h, this.f27025c, this.f27026d, this.f27027e, (C12042b[]) arrayList2.toArray(new C12042b[0]));
    }

    /* renamed from: q8.a$b */
    /* loaded from: classes7.dex */
    public static class C12042b {

        /* renamed from: a */
        public final int f27034a;

        /* renamed from: b */
        public final String f27035b;

        /* renamed from: c */
        public final long f27036c;

        /* renamed from: d */
        public final String f27037d;

        /* renamed from: e */
        public final int f27038e;

        /* renamed from: f */
        public final int f27039f;

        /* renamed from: g */
        public final int f27040g;

        /* renamed from: h */
        public final int f27041h;

        /* renamed from: i */
        public final String f27042i;

        /* renamed from: j */
        public final C6722k[] f27043j;

        /* renamed from: k */
        public final int f27044k;

        /* renamed from: l */
        private final String f27045l;

        /* renamed from: m */
        private final String f27046m;

        /* renamed from: n */
        private final List<Long> f27047n;

        /* renamed from: o */
        private final long[] f27048o;

        /* renamed from: p */
        private final long f27049p;

        public C12042b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C6722k[] kVarArr, List<Long> list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, kVarArr, list, C7557q0.m22196J0(list, 1000000L, j), C7557q0.m22198I0(j2, 1000000L, j));
        }

        /* renamed from: a */
        public Uri m7926a(int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (this.f27043j != null) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22366f(z);
            if (this.f27047n != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C7510a.m22366f(z2);
            if (i2 >= this.f27047n.size()) {
                z3 = false;
            }
            C7510a.m22366f(z3);
            String num = Integer.toString(this.f27043j[i].f14325r);
            String l = this.f27047n.get(i2).toString();
            return C7548n0.m22233d(this.f27045l, this.f27046m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
        }

        /* renamed from: b */
        public C12042b m7925b(C6722k[] kVarArr) {
            return new C12042b(this.f27045l, this.f27046m, this.f27034a, this.f27035b, this.f27036c, this.f27037d, this.f27038e, this.f27039f, this.f27040g, this.f27041h, this.f27042i, kVarArr, this.f27047n, this.f27048o, this.f27049p);
        }

        /* renamed from: c */
        public long m7924c(int i) {
            if (i == this.f27044k - 1) {
                return this.f27049p;
            }
            long[] jArr = this.f27048o;
            return jArr[i + 1] - jArr[i];
        }

        /* renamed from: d */
        public int m7923d(long j) {
            return C7557q0.m22147i(this.f27048o, j, true, true);
        }

        /* renamed from: e */
        public long m7922e(int i) {
            return this.f27048o[i];
        }

        private C12042b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C6722k[] kVarArr, List<Long> list, long[] jArr, long j2) {
            this.f27045l = str;
            this.f27046m = str2;
            this.f27034a = i;
            this.f27035b = str3;
            this.f27036c = j;
            this.f27037d = str4;
            this.f27038e = i2;
            this.f27039f = i3;
            this.f27040g = i4;
            this.f27041h = i5;
            this.f27042i = str5;
            this.f27043j = kVarArr;
            this.f27047n = list;
            this.f27048o = jArr;
            this.f27049p = j2;
            this.f27044k = list.size();
        }
    }

    private C12041a(int i, int i2, long j, long j2, int i3, boolean z, C0383a aVar, C12042b[] bVarArr) {
        this.f27023a = i;
        this.f27024b = i2;
        this.f27029g = j;
        this.f27030h = j2;
        this.f27025c = i3;
        this.f27026d = z;
        this.f27027e = aVar;
        this.f27028f = bVarArr;
    }
}
