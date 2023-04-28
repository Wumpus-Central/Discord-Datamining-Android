package p074e2;

import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: e2.c */
/* loaded from: classes.dex */
public class C6607c implements Serializable {

    /* renamed from: A */
    private static final ObjectStreamField[] f37935A = {new ObjectStreamField("path", String.class), new ObjectStreamField("clientSdk", String.class), new ObjectStreamField("parameters", Map.class), new ObjectStreamField("activityKind", EnumC6603b.class), new ObjectStreamField("suffix", String.class), new ObjectStreamField("callbackParameters", Map.class), new ObjectStreamField("partnerParameters", Map.class)};

    /* renamed from: k */
    private transient int f13873k;

    /* renamed from: l */
    private String f13874l;

    /* renamed from: m */
    private String f13875m;

    /* renamed from: n */
    private Map<String, String> f13876n;

    /* renamed from: o */
    private EnumC6603b f13877o;

    /* renamed from: p */
    private String f13878p;

    /* renamed from: q */
    private Map<String, String> f13879q;

    /* renamed from: r */
    private Map<String, String> f13880r;

    /* renamed from: s */
    private int f13881s;

    /* renamed from: t */
    private long f13882t;

    /* renamed from: u */
    private long f13883u;

    /* renamed from: v */
    private long f13884v;

    /* renamed from: w */
    private long f13885w;

    /* renamed from: x */
    private long f13886x;

    /* renamed from: y */
    private String f13887y;

    /* renamed from: z */
    private Boolean f13888z;

    public C6607c(EnumC6603b bVar) {
        EnumC6603b bVar2 = EnumC6603b.UNKNOWN;
        this.f13877o = bVar;
    }

    /* renamed from: A */
    public void m25133A(String str) {
        this.f13887y = str;
    }

    /* renamed from: B */
    public void m25132B(Map<String, String> map) {
        this.f13876n = map;
    }

    /* renamed from: C */
    public void m25131C(Map<String, String> map) {
        this.f13880r = map;
    }

    /* renamed from: D */
    public void m25130D(String str) {
        this.f13874l = str;
    }

    /* renamed from: E */
    public void m25129E(String str) {
        this.f13878p = str;
    }

    /* renamed from: a */
    public EnumC6603b m25128a() {
        return this.f13877o;
    }

    /* renamed from: b */
    public Map<String, String> m25127b() {
        return this.f13879q;
    }

    /* renamed from: c */
    public long m25126c() {
        return this.f13882t;
    }

    /* renamed from: d */
    public long m25125d() {
        return this.f13883u;
    }

    /* renamed from: e */
    public long m25124e() {
        return this.f13885w;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6607c cVar = (C6607c) obj;
        if (C6629i1.m24908j(this.f13874l, cVar.f13874l) && C6629i1.m24908j(this.f13875m, cVar.f13875m) && C6629i1.m24909i(this.f13876n, cVar.f13876n) && C6629i1.m24915f(this.f13877o, cVar.f13877o) && C6629i1.m24908j(this.f13878p, cVar.f13878p) && C6629i1.m24909i(this.f13879q, cVar.f13879q) && C6629i1.m24909i(this.f13880r, cVar.f13880r)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String m25123f() {
        return this.f13875m;
    }

    /* renamed from: g */
    public String m25122g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C6629i1.m24906l("Path:      %s\n", this.f13874l));
        sb2.append(C6629i1.m24906l("ClientSdk: %s\n", this.f13875m));
        if (this.f13876n != null) {
            sb2.append("Parameters:");
            TreeMap treeMap = new TreeMap(this.f13876n);
            List asList = Arrays.asList("app_secret", "secret_id", "event_callback_id");
            for (Map.Entry entry : treeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (!asList.contains(str)) {
                    sb2.append(C6629i1.m24906l("\n\t%-16s %s", str, entry.getValue()));
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: h */
    public String m25121h() {
        return C6629i1.m24906l("Failed to track %s%s", this.f13877o.toString(), this.f13878p);
    }

    public int hashCode() {
        if (this.f13873k == 0) {
            this.f13873k = 17;
            int P = (17 * 37) + C6629i1.m24936P(this.f13874l);
            this.f13873k = P;
            int P2 = (P * 37) + C6629i1.m24936P(this.f13875m);
            this.f13873k = P2;
            int O = (P2 * 37) + C6629i1.m24937O(this.f13876n);
            this.f13873k = O;
            int M = (O * 37) + C6629i1.m24939M(this.f13877o);
            this.f13873k = M;
            int P3 = (M * 37) + C6629i1.m24936P(this.f13878p);
            this.f13873k = P3;
            int O2 = (P3 * 37) + C6629i1.m24937O(this.f13879q);
            this.f13873k = O2;
            this.f13873k = (O2 * 37) + C6629i1.m24937O(this.f13880r);
        }
        return this.f13873k;
    }

    /* renamed from: i */
    public Boolean m25120i() {
        return this.f13888z;
    }

    /* renamed from: j */
    public long m25119j() {
        return this.f13884v;
    }

    /* renamed from: k */
    public long m25118k() {
        return this.f13886x;
    }

    /* renamed from: l */
    public String m25117l() {
        return this.f13887y;
    }

    /* renamed from: m */
    public Map<String, String> m25116m() {
        return this.f13876n;
    }

    /* renamed from: n */
    public Map<String, String> m25115n() {
        return this.f13880r;
    }

    /* renamed from: o */
    public String m25114o() {
        return this.f13874l;
    }

    /* renamed from: p */
    public int m25113p() {
        return this.f13881s;
    }

    /* renamed from: q */
    public String m25112q() {
        return this.f13878p;
    }

    /* renamed from: r */
    public int m25111r() {
        int i = this.f13881s + 1;
        this.f13881s = i;
        return i;
    }

    /* renamed from: s */
    public void m25110s(Map<String, String> map) {
        this.f13879q = map;
    }

    /* renamed from: t */
    public void m25109t(long j) {
        this.f13882t = j;
    }

    public String toString() {
        return C6629i1.m24906l("%s%s", this.f13877o.toString(), this.f13878p);
    }

    /* renamed from: u */
    public void m25108u(long j) {
        this.f13883u = j;
    }

    /* renamed from: v */
    public void m25107v(long j) {
        this.f13885w = j;
    }

    /* renamed from: w */
    public void m25106w(String str) {
        this.f13875m = str;
    }

    /* renamed from: x */
    public void m25105x(Boolean bool) {
        this.f13888z = bool;
    }

    /* renamed from: y */
    public void m25104y(long j) {
        this.f13884v = j;
    }

    /* renamed from: z */
    public void m25103z(long j) {
        this.f13886x = j;
    }
}
