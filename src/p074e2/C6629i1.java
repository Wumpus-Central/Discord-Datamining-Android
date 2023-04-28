package p074e2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p074e2.C6693z;
import p112g2.AbstractC7394a;
import p112g2.C7401e;

/* renamed from: e2.i1 */
/* loaded from: classes.dex */
public class C6629i1 {

    /* renamed from: a */
    public static final DecimalFormat f13988a = m24926Z();

    /* renamed from: b */
    public static final SimpleDateFormat f13989b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z", Locale.US);

    /* renamed from: c */
    private static volatile C7401e f13990c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.i1$a */
    /* loaded from: classes.dex */
    public static class CallableC6630a implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Context f13991a;

        CallableC6630a(Context context) {
            this.f13991a = context;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            try {
                return C6692y0.m24633e(this.f13991a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.i1$b */
    /* loaded from: classes.dex */
    public static class CallableC6631b implements Callable<String> {

        /* renamed from: a */
        final /* synthetic */ Context f13992a;

        /* renamed from: b */
        final /* synthetic */ Object f13993b;

        CallableC6631b(Context context, Object obj) {
            this.f13992a = context;
            this.f13993b = obj;
        }

        /* renamed from: a */
        public String call() {
            return C6692y0.m24630h(this.f13992a, this.f13993b);
        }
    }

    /* renamed from: e2.i1$c */
    /* loaded from: classes.dex */
    static class CallableC6632c implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Context f13994a;

        /* renamed from: b */
        final /* synthetic */ Object f13995b;

        CallableC6632c(Context context, Object obj) {
            this.f13994a = context;
            this.f13995b = obj;
        }

        /* renamed from: a */
        public Boolean call() {
            return C6692y0.m24626l(this.f13994a, this.f13995b);
        }
    }

    /* renamed from: e2.i1$d */
    /* loaded from: classes.dex */
    static class C6633d extends AbstractC7394a<Object, Void> {
        C6633d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: e */
        public Void mo22749a(Object... objArr) {
            ((Runnable) objArr[0]).run();
            return null;
        }
    }

    /* renamed from: e2.i1$e */
    /* loaded from: classes.dex */
    static class C6634e extends AbstractC7394a<Context, String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC6658o0 f13996a;

        C6634e(AbstractC6658o0 o0Var) {
            this.f13996a = o0Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: e */
        public String mo22749a(Context... contextArr) {
            AbstractC6608c0 j = C6639l.m24863j();
            String s = C6629i1.m24899s(contextArr[0]);
            j.mo24884c("GoogleAdId read " + s, new Object[0]);
            return s;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: f */
        public void mo22747c(String str) {
            C6639l.m24863j();
            this.f13996a.mo24789a(str);
        }
    }

    /* renamed from: A */
    public static String m24951A(Context context, Object obj, long j) {
        return (String) m24916e0(context, new CallableC6631b(context, obj), j);
    }

    /* renamed from: B */
    public static String m24950B(String str, Throwable th2) {
        if (th2 != null) {
            return m24906l("%s: %s", str, th2);
        }
        return m24906l("%s", str);
    }

    /* renamed from: C */
    public static String m24949C(Exception exc) {
        if (!m24943I(exc)) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int indexOf = stringWriter2.indexOf("Caused by:");
        return stringWriter2.substring(indexOf, stringWriter2.indexOf(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, indexOf));
    }

    /* renamed from: D */
    private static String m24948D(String str) {
        String[] split;
        if (str != null && str.contains("@") && (split = str.split("@")) != null && split.length == 2) {
            return split[0];
        }
        return null;
    }

    /* renamed from: E */
    public static String m24947E(String str) {
        String[] split;
        String D = m24948D(str);
        if (D == null || (split = D.split("\\d+", 2)) == null || split.length == 0) {
            return null;
        }
        return split[0];
    }

    /* renamed from: F */
    public static String m24946F() {
        return "android4.28.8";
    }

    /* renamed from: G */
    public static String[] m24945G() {
        return Build.SUPPORTED_ABIS;
    }

    /* renamed from: H */
    public static long m24944H(int i, EnumC6687w wVar) {
        int i2 = wVar.f14193k;
        if (i < i2) {
            return 0L;
        }
        return (long) (Math.min(((long) Math.pow(2.0d, i - i2)) * wVar.f14194l, wVar.f14195m) * m24924a0(wVar.f14196n, wVar.f14197o));
    }

    /* renamed from: I */
    public static boolean m24943I(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    /* renamed from: J */
    public static String m24942J(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(bytes, 0, bytes.length);
            return m24921c(instance.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: K */
    public static int m24941K(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* renamed from: L */
    public static int m24940L(Double d) {
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }

    /* renamed from: M */
    public static int m24939M(Enum r0) {
        if (r0 == null) {
            return 0;
        }
        return r0.hashCode();
    }

    /* renamed from: N */
    public static int m24938N(Long l) {
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    /* renamed from: O */
    public static int m24937O(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: P */
    public static int m24936P(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: Q */
    private static boolean m24935Q(C6690x0 x0Var, C6610d dVar) {
        if (x0Var.f14225b == dVar.f37938B && x0Var.f14226c == dVar.f37939C && x0Var.f14227d == dVar.f37942F && x0Var.f14228e == dVar.f37943G && m24908j(x0Var.f14224a, dVar.f37940D) && m24908j(x0Var.f14229f, dVar.f37944H) && m24917e(x0Var.f14230g, dVar.f37941E)) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private static boolean m24934R(C6690x0 x0Var, C6610d dVar) {
        if (x0Var.f14225b == dVar.f37945I && x0Var.f14226c == dVar.f37946J && m24908j(x0Var.f14224a, dVar.f37947K)) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private static boolean m24933S(C6690x0 x0Var, C6610d dVar) {
        if (x0Var.f14225b == dVar.f37945I && x0Var.f14226c == dVar.f37946J && m24908j(x0Var.f14224a, dVar.f37948L)) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public static boolean m24932T(C6690x0 x0Var, String str, C6610d dVar) {
        if (str.equals("google")) {
            return m24935Q(x0Var, dVar);
        }
        if (str.equals("huawei_ads")) {
            return m24934R(x0Var, dVar);
        }
        if (str.equals("huawei_app_gallery")) {
            return m24933S(x0Var, dVar);
        }
        return false;
    }

    /* renamed from: U */
    public static Boolean m24931U(Context context, Object obj, long j) {
        return (Boolean) m24916e0(context, new CallableC6632c(context, obj), j);
    }

    /* renamed from: V */
    public static boolean m24930V(Uri uri) {
        String uri2;
        if (uri == null || (uri2 = uri.toString()) == null || uri2.length() == 0 || uri2.matches("^(fb|vk)[0-9]{5,}[^:]*://authorize.*access_token=.*")) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public static boolean m24929W(String str, String str2, String str3) {
        if (str == null) {
            m24896v().mo24885b("%s parameter %s is missing", str3, str2);
            return false;
        } else if (!str.equals("")) {
            return true;
        } else {
            m24896v().mo24885b("%s parameter %s is empty", str3, str2);
            return false;
        }
    }

    /* renamed from: X */
    public static String m24928X(String str) {
        return m24942J(str, "MD5");
    }

    /* renamed from: Y */
    public static Map<String, String> m24927Y(Map<String, String> map, Map<String, String> map2, String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        AbstractC6608c0 v = m24896v();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String str2 = (String) hashMap.put(entry.getKey(), entry.getValue());
            if (str2 != null) {
                v.mo24886a("Key %s with value %s from %s parameter was replaced by value %s", entry.getKey(), str2, str, entry.getValue());
            }
        }
        return hashMap;
    }

    /* renamed from: Z */
    private static DecimalFormat m24926Z() {
        return new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
    }

    /* renamed from: a0 */
    private static double m24924a0(double d, double d2) {
        return (new Random().nextDouble() * (d2 - d)) + d;
    }

    /* renamed from: b */
    public static boolean m24923b(Context context, String str) {
        try {
            if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            m24896v().mo24884c("Unable to check permission '%s' with message (%s)", str, e.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T m24922b0(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.Class<T> r10) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            java.io.FileInputStream r7 = r7.openFileInput(r8)     // Catch: Exception -> 0x007d, FileNotFoundException -> 0x008f
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            r8.<init>(r7)     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch: Exception -> 0x006b, FileNotFoundException -> 0x0071
            r7.<init>(r8)     // Catch: Exception -> 0x006b, FileNotFoundException -> 0x0071
            java.lang.Object r8 = r7.readObject()     // Catch: Exception -> 0x002b, ClassCastException -> 0x0041, ClassNotFoundException -> 0x0056
            java.lang.Object r3 = r10.cast(r8)     // Catch: Exception -> 0x002b, ClassCastException -> 0x0041, ClassNotFoundException -> 0x0056
            e2.c0 r8 = m24896v()     // Catch: Exception -> 0x002b, ClassCastException -> 0x0041, ClassNotFoundException -> 0x0056
            java.lang.String r10 = "Read %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: Exception -> 0x002b, ClassCastException -> 0x0041, ClassNotFoundException -> 0x0056
            r4[r1] = r9     // Catch: Exception -> 0x002b, ClassCastException -> 0x0041, ClassNotFoundException -> 0x0056
            r4[r2] = r3     // Catch: Exception -> 0x002b, ClassCastException -> 0x0041, ClassNotFoundException -> 0x0056
            r8.mo24884c(r10, r4)     // Catch: Exception -> 0x002b, ClassCastException -> 0x0041, ClassNotFoundException -> 0x0056
            goto L_0x00a0
        L_0x002b:
            r8 = move-exception
            e2.c0 r10 = m24896v()     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            java.lang.String r4 = "Failed to read %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            r5[r1] = r9     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            java.lang.String r8 = r8.getMessage()     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            r5[r2] = r8     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            r10.mo24885b(r4, r5)     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            goto L_0x00a0
        L_0x0041:
            r8 = move-exception
            e2.c0 r10 = m24896v()     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            java.lang.String r4 = "Failed to cast %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            r5[r1] = r9     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            java.lang.String r8 = r8.getMessage()     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            r5[r2] = r8     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            r10.mo24885b(r4, r5)     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            goto L_0x00a0
        L_0x0056:
            r8 = move-exception
            e2.c0 r10 = m24896v()     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            java.lang.String r4 = "Failed to find %s class (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            r5[r1] = r9     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            java.lang.String r8 = r8.getMessage()     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            r5[r2] = r8     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            r10.mo24885b(r4, r5)     // Catch: Exception -> 0x0074, FileNotFoundException -> 0x0079
            goto L_0x00a0
        L_0x006b:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
            goto L_0x007f
        L_0x0071:
            r7 = r3
            r3 = r8
            goto L_0x0090
        L_0x0074:
            r8 = move-exception
            r6 = r3
            r3 = r7
            r7 = r6
            goto L_0x007f
        L_0x0079:
            r6 = r3
            r3 = r7
            r7 = r6
            goto L_0x0090
        L_0x007d:
            r8 = move-exception
            r7 = r3
        L_0x007f:
            e2.c0 r10 = m24896v()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r9
            r4[r2] = r8
            java.lang.String r8 = "Failed to open %s file for reading (%s)"
            r10.mo24885b(r8, r4)
            goto L_0x009d
        L_0x008f:
            r7 = r3
        L_0x0090:
            e2.c0 r8 = m24896v()
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r1] = r9
            java.lang.String r4 = "%s file not found"
            r8.mo24884c(r4, r10)
        L_0x009d:
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x00a0:
            if (r7 == 0) goto L_0x00b6
            r7.close()     // Catch: Exception -> 0x00a6
            goto L_0x00b6
        L_0x00a6:
            r7 = move-exception
            e2.c0 r8 = m24896v()
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r1] = r9
            r10[r2] = r7
            java.lang.String r7 = "Failed to close %s file for reading (%s)"
            r8.mo24885b(r7, r10)
        L_0x00b6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p074e2.C6629i1.m24922b0(android.content.Context, java.lang.String, java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* renamed from: c */
    public static String m24921c(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return m24906l("%0" + (bArr.length << 1) + "x", bigInteger);
    }

    /* renamed from: c0 */
    public static boolean m24920c0(Context context, String str) {
        try {
            if (context.getPackageManager().resolveContentProvider(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static String m24919d() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: d0 */
    public static void m24918d0(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runnable.run();
        } else {
            new C6633d().m22748b(runnable);
        }
    }

    /* renamed from: e */
    public static boolean m24917e(Boolean bool, Boolean bool2) {
        return m24909i(bool, bool2);
    }

    /* renamed from: e0 */
    private static <R> R m24916e0(Context context, Callable<R> callable, long j) {
        if (f13990c == null) {
            synchronized (C6629i1.class) {
                if (f13990c == null) {
                    f13990c = new C7401e("PlayAdIdLibrary", true);
                }
            }
        }
        try {
            return (R) f13990c.m22736d(callable, 0L).get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m24915f(Enum r0, Enum r1) {
        return m24909i(r0, r1);
    }

    /* renamed from: f0 */
    public static String m24914f0(String str) {
        return m24942J(str, "SHA-1");
    }

    /* renamed from: g */
    public static boolean m24913g(Integer num, Integer num2) {
        return m24909i(num, num2);
    }

    /* renamed from: g0 */
    public static String m24912g0(String str) {
        return m24942J(str, "SHA-256");
    }

    /* renamed from: h */
    public static boolean m24911h(Long l, Long l2) {
        return m24909i(l, l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> void m24910h0(T r5, android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r7, r2)     // Catch: Exception -> 0x0037
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch: Exception -> 0x0035
            r7.<init>(r6)     // Catch: Exception -> 0x0035
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch: Exception -> 0x0032
            r6.<init>(r7)     // Catch: Exception -> 0x0032
            r6.writeObject(r5)     // Catch: NotSerializableException -> 0x0024, Exception -> 0x0035
            e2.c0 r7 = m24896v()     // Catch: NotSerializableException -> 0x0024, Exception -> 0x0035
            java.lang.String r3 = "Wrote %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: NotSerializableException -> 0x0024, Exception -> 0x0035
            r4[r2] = r8     // Catch: NotSerializableException -> 0x0024, Exception -> 0x0035
            r4[r1] = r5     // Catch: NotSerializableException -> 0x0024, Exception -> 0x0035
            r7.mo24884c(r3, r4)     // Catch: NotSerializableException -> 0x0024, Exception -> 0x0035
            goto L_0x0048
        L_0x0024:
            e2.c0 r5 = m24896v()     // Catch: Exception -> 0x0035
            java.lang.String r7 = "Failed to serialize %s"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: Exception -> 0x0035
            r3[r2] = r8     // Catch: Exception -> 0x0035
            r5.mo24885b(r7, r3)     // Catch: Exception -> 0x0035
            goto L_0x0048
        L_0x0032:
            r5 = move-exception
            r6 = r7
            goto L_0x0039
        L_0x0035:
            r5 = move-exception
            goto L_0x0039
        L_0x0037:
            r5 = move-exception
            r6 = 0
        L_0x0039:
            e2.c0 r7 = m24896v()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r2] = r8
            r3[r1] = r5
            java.lang.String r5 = "Failed to open %s for writing (%s)"
            r7.mo24885b(r5, r3)
        L_0x0048:
            if (r6 == 0) goto L_0x005e
            r6.close()     // Catch: Exception -> 0x004e
            goto L_0x005e
        L_0x004e:
            r5 = move-exception
            e2.c0 r6 = m24896v()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r2] = r8
            r7[r1] = r5
            java.lang.String r5 = "Failed to close %s file for writing (%s)"
            r6.mo24885b(r5, r7)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p074e2.C6629i1.m24910h0(java.lang.Object, android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: i */
    public static boolean m24909i(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : obj.equals(obj2);
    }

    /* renamed from: j */
    public static boolean m24908j(String str, String str2) {
        return m24909i(str, str2);
    }

    /* renamed from: k */
    public static boolean m24907k(Double d, Double d2) {
        return (d == null || d2 == null) ? d == null && d2 == null : Double.doubleToLongBits(d.doubleValue()) == Double.doubleToLongBits(d2.doubleValue());
    }

    /* renamed from: l */
    public static String m24906l(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: m */
    public static Object m24905m(Context context, long j) {
        return m24916e0(context, new CallableC6630a(context), j);
    }

    /* renamed from: n */
    public static String m24904n(Context context) {
        return C6667t.m24782a(context);
    }

    /* renamed from: o */
    public static int m24903o(Context context) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            m24896v().mo24886a("Couldn't read connectivity type (%s)", e.getMessage());
        }
        if (connectivityManager == null) {
            return -1;
        }
        int i = Build.VERSION.SDK_INT;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return -1;
        }
        if (networkCapabilities.hasTransport(1)) {
            return 1;
        }
        if (networkCapabilities.hasTransport(0)) {
            return 0;
        }
        if (networkCapabilities.hasTransport(3)) {
            return 3;
        }
        if (networkCapabilities.hasTransport(4)) {
            return 4;
        }
        if (networkCapabilities.hasTransport(2)) {
            return 2;
        }
        if (i < 26) {
            return -1;
        }
        if (networkCapabilities.hasTransport(5)) {
            return 5;
        }
        if (i < 27) {
            return -1;
        }
        if (networkCapabilities.hasTransport(6)) {
            return 6;
        }
        return -1;
    }

    /* renamed from: p */
    public static String m24902p() {
        return null;
    }

    /* renamed from: q */
    public static String m24901q(ContentResolver contentResolver) {
        if (contentResolver == null) {
            return null;
        }
        try {
            return Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static Boolean m24900r(ContentResolver contentResolver) {
        boolean z;
        try {
            if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static String m24899s(Context context) {
        Object m;
        String str = null;
        try {
            C6693z.C6695b a = C6693z.m24625a(context, 11000L);
            if (a != null) {
                str = a.m24623a();
            }
        } catch (Exception unused) {
        }
        if (str != null || (m = m24905m(context, 11000L)) == null) {
            return str;
        }
        return m24951A(context, m, 1000L);
    }

    /* renamed from: t */
    public static void m24898t(Context context, AbstractC6658o0 o0Var) {
        AbstractC6608c0 j = C6639l.m24863j();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            j.mo24884c("GoogleAdId being read in the background", new Object[0]);
            String s = m24899s(context);
            j.mo24884c("GoogleAdId read " + s, new Object[0]);
            o0Var.mo24789a(s);
            return;
        }
        j.mo24884c("GoogleAdId being read in the foreground", new Object[0]);
        new C6634e(o0Var).m22748b(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r2 = r4.getLocales();
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Locale m24897u(android.content.res.Configuration r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x0018
            android.os.LocaleList r2 = androidx.appcompat.app.C1536e.m40809a(r4)
            if (r2 == 0) goto L_0x0018
            boolean r3 = p074e2.C6626h1.m24961a(r2)
            if (r3 != 0) goto L_0x0018
            r4 = 0
            java.util.Locale r4 = androidx.core.p018os.C2453o.m37721a(r2, r4)
            return r4
        L_0x0018:
            if (r0 >= r1) goto L_0x001d
            java.util.Locale r4 = r4.locale
            return r4
        L_0x001d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p074e2.C6629i1.m24897u(android.content.res.Configuration):java.util.Locale");
    }

    /* renamed from: v */
    private static AbstractC6608c0 m24896v() {
        return C6639l.m24863j();
    }

    /* renamed from: w */
    public static String m24895w(Context context) {
        return C6640l0.m24846a(context);
    }

    /* renamed from: x */
    public static String m24894x(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(0, 3);
            }
            C6639l.m24863j().mo24886a("Couldn't receive networkOperator string to read MCC", new Object[0]);
            return null;
        } catch (Exception unused) {
            C6639l.m24863j().mo24886a("Couldn't return mcc", new Object[0]);
            return null;
        }
    }

    /* renamed from: y */
    public static String m24893y(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(3);
            }
            C6639l.m24863j().mo24886a("Couldn't receive networkOperator string to read MNC", new Object[0]);
            return null;
        } catch (Exception unused) {
            C6639l.m24863j().mo24886a("Couldn't return mnc", new Object[0]);
            return null;
        }
    }

    /* renamed from: z */
    public static int m24892z(Context context) {
        int i;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (Build.VERSION.SDK_INT >= 30) {
                i = telephonyManager.getDataNetworkType();
            } else {
                i = telephonyManager.getNetworkType();
            }
            return i;
        } catch (Exception e) {
            m24896v().mo24886a("Couldn't read network type (%s)", e.getMessage());
            return -1;
        }
    }
}
