package p074e2;

import com.facebook.react.uimanager.ViewProps;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Calendar;
import java.util.LinkedList;

/* renamed from: e2.d */
/* loaded from: classes.dex */
public class C6610d implements Serializable, Cloneable {

    /* renamed from: M */
    private static final ObjectStreamField[] f37936M;

    /* renamed from: k */
    private transient AbstractC6608c0 f13891k = C6639l.m24863j();

    /* renamed from: l */
    protected String f13892l = C6629i1.m24919d();

    /* renamed from: m */
    protected boolean f13893m = true;

    /* renamed from: n */
    protected boolean f13894n = false;

    /* renamed from: o */
    protected boolean f13895o = false;

    /* renamed from: p */
    protected boolean f13896p = false;

    /* renamed from: q */
    protected int f13897q = 0;

    /* renamed from: r */
    protected int f13898r = 0;

    /* renamed from: s */
    protected int f13899s = -1;

    /* renamed from: t */
    protected long f13900t = -1;

    /* renamed from: u */
    protected long f13901u = -1;

    /* renamed from: v */
    protected long f13902v = -1;

    /* renamed from: w */
    protected long f13903w = -1;

    /* renamed from: x */
    protected boolean f13904x = false;

    /* renamed from: y */
    protected LinkedList<String> f13905y = null;

    /* renamed from: z */
    protected String f13906z = null;

    /* renamed from: A */
    protected String f37937A = null;

    /* renamed from: B */
    protected long f37938B = 0;

    /* renamed from: C */
    protected long f37939C = 0;

    /* renamed from: D */
    protected String f37940D = null;

    /* renamed from: E */
    protected Boolean f37941E = null;

    /* renamed from: F */
    protected long f37942F = 0;

    /* renamed from: G */
    protected long f37943G = 0;

    /* renamed from: H */
    protected String f37944H = null;

    /* renamed from: I */
    protected long f37945I = 0;

    /* renamed from: J */
    protected long f37946J = 0;

    /* renamed from: K */
    protected String f37947K = null;

    /* renamed from: L */
    protected String f37948L = null;

    static {
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        Class cls3 = Long.TYPE;
        f37936M = new ObjectStreamField[]{new ObjectStreamField("uuid", String.class), new ObjectStreamField(ViewProps.ENABLED, cls), new ObjectStreamField("isGdprForgotten", cls), new ObjectStreamField("isThirdPartySharingDisabled", cls), new ObjectStreamField("askingAttribution", cls), new ObjectStreamField("eventCount", cls2), new ObjectStreamField("sessionCount", cls2), new ObjectStreamField("subsessionCount", cls2), new ObjectStreamField("sessionLength", cls3), new ObjectStreamField("timeSpent", cls3), new ObjectStreamField("lastActivity", cls3), new ObjectStreamField("lastInterval", cls3), new ObjectStreamField("updatePackages", cls), new ObjectStreamField("orderIds", LinkedList.class), new ObjectStreamField("pushToken", String.class), new ObjectStreamField("adid", String.class), new ObjectStreamField("clickTime", cls3), new ObjectStreamField("installBegin", cls3), new ObjectStreamField("installReferrer", String.class), new ObjectStreamField("googlePlayInstant", Boolean.class), new ObjectStreamField("clickTimeServer", cls3), new ObjectStreamField("installBeginServer", cls3), new ObjectStreamField("installVersion", String.class), new ObjectStreamField("clickTimeHuawei", cls3), new ObjectStreamField("installBeginHuawei", cls3), new ObjectStreamField("installReferrerHuawei", String.class), new ObjectStreamField("installReferrerHuaweiAppGallery", String.class)};
    }

    /* renamed from: e */
    private static String m25098e(long j) {
        Calendar.getInstance().setTimeInMillis(j);
        return C6629i1.m24906l("%02d:%02d:%02d", 11, 12, 13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m25101a(String str) {
        if (this.f13905y == null) {
            this.f13905y = new LinkedList<>();
        }
        if (this.f13905y.size() >= 10) {
            this.f13905y.removeLast();
        }
        this.f13905y.addFirst(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public boolean m25100c(String str) {
        LinkedList<String> linkedList = this.f13905y;
        if (linkedList == null) {
            return false;
        }
        return linkedList.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m25099d(long j) {
        this.f13899s = 1;
        this.f13900t = 0L;
        this.f13901u = 0L;
        this.f13902v = j;
        this.f13903w = -1L;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6610d dVar = (C6610d) obj;
        if (C6629i1.m24908j(this.f13892l, dVar.f13892l) && C6629i1.m24917e(Boolean.valueOf(this.f13893m), Boolean.valueOf(dVar.f13893m)) && C6629i1.m24917e(Boolean.valueOf(this.f13894n), Boolean.valueOf(dVar.f13894n)) && C6629i1.m24917e(Boolean.valueOf(this.f13895o), Boolean.valueOf(dVar.f13895o)) && C6629i1.m24917e(Boolean.valueOf(this.f13896p), Boolean.valueOf(dVar.f13896p)) && C6629i1.m24913g(Integer.valueOf(this.f13897q), Integer.valueOf(dVar.f13897q)) && C6629i1.m24913g(Integer.valueOf(this.f13898r), Integer.valueOf(dVar.f13898r)) && C6629i1.m24913g(Integer.valueOf(this.f13899s), Integer.valueOf(dVar.f13899s)) && C6629i1.m24911h(Long.valueOf(this.f13900t), Long.valueOf(dVar.f13900t)) && C6629i1.m24911h(Long.valueOf(this.f13901u), Long.valueOf(dVar.f13901u)) && C6629i1.m24911h(Long.valueOf(this.f13903w), Long.valueOf(dVar.f13903w)) && C6629i1.m24917e(Boolean.valueOf(this.f13904x), Boolean.valueOf(dVar.f13904x)) && C6629i1.m24909i(this.f13905y, dVar.f13905y) && C6629i1.m24908j(this.f13906z, dVar.f13906z) && C6629i1.m24908j(this.f37937A, dVar.f37937A) && C6629i1.m24911h(Long.valueOf(this.f37938B), Long.valueOf(dVar.f37938B)) && C6629i1.m24911h(Long.valueOf(this.f37939C), Long.valueOf(dVar.f37939C)) && C6629i1.m24908j(this.f37940D, dVar.f37940D) && C6629i1.m24917e(this.f37941E, dVar.f37941E) && C6629i1.m24911h(Long.valueOf(this.f37942F), Long.valueOf(dVar.f37942F)) && C6629i1.m24911h(Long.valueOf(this.f37943G), Long.valueOf(dVar.f37943G)) && C6629i1.m24908j(this.f37944H, dVar.f37944H) && C6629i1.m24911h(Long.valueOf(this.f37945I), Long.valueOf(dVar.f37945I)) && C6629i1.m24911h(Long.valueOf(this.f37946J), Long.valueOf(dVar.f37946J)) && C6629i1.m24908j(this.f37947K, dVar.f37947K) && C6629i1.m24908j(this.f37948L, dVar.f37948L)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((629 + C6629i1.m24936P(this.f13892l)) * 37) + C6629i1.m24941K(Boolean.valueOf(this.f13893m))) * 37) + C6629i1.m24941K(Boolean.valueOf(this.f13894n))) * 37) + C6629i1.m24941K(Boolean.valueOf(this.f13895o))) * 37) + C6629i1.m24941K(Boolean.valueOf(this.f13896p))) * 37) + this.f13897q) * 37) + this.f13898r) * 37) + this.f13899s) * 37) + C6629i1.m24938N(Long.valueOf(this.f13900t))) * 37) + C6629i1.m24938N(Long.valueOf(this.f13901u))) * 37) + C6629i1.m24938N(Long.valueOf(this.f13903w))) * 37) + C6629i1.m24941K(Boolean.valueOf(this.f13904x))) * 37) + C6629i1.m24937O(this.f13905y)) * 37) + C6629i1.m24936P(this.f13906z)) * 37) + C6629i1.m24936P(this.f37937A)) * 37) + C6629i1.m24938N(Long.valueOf(this.f37938B))) * 37) + C6629i1.m24938N(Long.valueOf(this.f37939C))) * 37) + C6629i1.m24936P(this.f37940D)) * 37) + C6629i1.m24941K(this.f37941E)) * 37) + C6629i1.m24938N(Long.valueOf(this.f37942F))) * 37) + C6629i1.m24938N(Long.valueOf(this.f37943G))) * 37) + C6629i1.m24936P(this.f37944H)) * 37) + C6629i1.m24938N(Long.valueOf(this.f37945I))) * 37) + C6629i1.m24938N(Long.valueOf(this.f37946J))) * 37) + C6629i1.m24936P(this.f37947K)) * 37) + C6629i1.m24936P(this.f37948L);
    }

    public String toString() {
        return C6629i1.m24906l("ec:%d sc:%d ssc:%d sl:%.1f ts:%.1f la:%s uuid:%s", Integer.valueOf(this.f13897q), Integer.valueOf(this.f13898r), Integer.valueOf(this.f13899s), Double.valueOf(this.f13900t / 1000.0d), Double.valueOf(this.f13901u / 1000.0d), m25098e(this.f13902v), this.f13892l);
    }
}
