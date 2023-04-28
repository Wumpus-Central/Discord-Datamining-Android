package p119g9;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.react.util.JSStackTrace;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p030bc.C3452d;
import p079e7.C6713c;
import p079e7.C6722k;
import p079e7.C6728o;
import p163j$.util.DesugarTimeZone;

/* renamed from: g9.q0 */
/* loaded from: classes5.dex */
public final class C7557q0 {

    /* renamed from: a */
    public static final int f16368a;

    /* renamed from: b */
    public static final String f16369b;

    /* renamed from: c */
    public static final String f16370c;

    /* renamed from: d */
    public static final String f16371d;

    /* renamed from: e */
    public static final String f16372e;

    /* renamed from: f */
    public static final byte[] f16373f;

    /* renamed from: g */
    private static final Pattern f16374g;

    /* renamed from: h */
    private static final Pattern f16375h;

    /* renamed from: i */
    private static final Pattern f16376i;

    /* renamed from: j */
    private static final Pattern f16377j;

    /* renamed from: k */
    private static HashMap<String, String> f16378k;

    /* renamed from: l */
    private static final String[] f16379l;

    /* renamed from: m */
    private static final String[] f16380m;

    /* renamed from: n */
    private static final int[] f16381n;

    /* renamed from: o */
    private static final int[] f16382o;

    static {
        int i;
        String str = Build.VERSION.CODENAME;
        if ("S".equals(str)) {
            i = 31;
        } else if ("R".equals(str)) {
            i = 30;
        } else {
            i = Build.VERSION.SDK_INT;
        }
        f16368a = i;
        String str2 = Build.DEVICE;
        f16369b = str2;
        String str3 = Build.MANUFACTURER;
        f16370c = str3;
        String str4 = Build.MODEL;
        f16371d = str4;
        f16372e = str2 + ", " + str4 + ", " + str3 + ", " + i;
        f16373f = new byte[0];
        f16374g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f16375h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f16376i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f16377j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f16379l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f16380m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f16381n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f16382o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, ItemTouchHelper.AbstractC3083c.DEFAULT_DRAG_ANIMATION_DURATION, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, ItemTouchHelper.AbstractC3083c.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};
    }

    /* renamed from: A */
    public static Handler m22215A(Handler.Callback callback) {
        return m22119w(m22185P(), callback);
    }

    /* renamed from: A0 */
    public static <T> T[] m22214A0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    /* renamed from: B */
    private static HashMap<String, String> m22213B() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f16379l.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f16379l;
            if (i >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* renamed from: B0 */
    public static <T> T[] m22212B0(T[] tArr, int i) {
        boolean z;
        if (i <= tArr.length) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    /* renamed from: C */
    public static Uri m22211C(Uri uri) {
        String U0 = m22174U0(uri.getPath());
        if (U0 == null) {
            return uri;
        }
        Matcher matcher = f16377j.matcher(U0);
        if (!matcher.matches() || matcher.group(1) != null) {
            return uri;
        }
        return Uri.withAppendedPath(uri, "Manifest");
    }

    /* renamed from: C0 */
    public static <T> T[] m22210C0(T[] tArr, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        if (i2 > tArr.length) {
            z2 = false;
        }
        C7510a.m22371a(z2);
        return (T[]) Arrays.copyOfRange(tArr, i, i2);
    }

    /* renamed from: D */
    public static String m22209D(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: D0 */
    public static long m22208D0(String str) {
        Matcher matcher = f16374g.matcher(str);
        if (matcher.matches()) {
            int i = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i != 0) {
                return timeInMillis - (i * 60000);
            }
            return timeInMillis;
        }
        throw new C6728o("Invalid date/time format: " + str);
    }

    /* renamed from: E */
    public static String m22207E(byte[] bArr) {
        return new String(bArr, C3452d.f5595c);
    }

    /* renamed from: E0 */
    public static long m22206E0(String str) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        Matcher matcher = f16375h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d6 = 0.0d;
        if (group != null) {
            d = Double.parseDouble(group) * 3.1556908E7d;
        } else {
            d = 0.0d;
        }
        String group2 = matcher.group(5);
        if (group2 != null) {
            d2 = Double.parseDouble(group2) * 2629739.0d;
        } else {
            d2 = 0.0d;
        }
        double d7 = d + d2;
        String group3 = matcher.group(7);
        if (group3 != null) {
            d3 = Double.parseDouble(group3) * 86400.0d;
        } else {
            d3 = 0.0d;
        }
        double d8 = d7 + d3;
        String group4 = matcher.group(10);
        if (group4 != null) {
            d4 = Double.parseDouble(group4) * 3600.0d;
        } else {
            d4 = 0.0d;
        }
        double d9 = d8 + d4;
        String group5 = matcher.group(12);
        if (group5 != null) {
            d5 = Double.parseDouble(group5) * 60.0d;
        } else {
            d5 = 0.0d;
        }
        double d10 = d9 + d5;
        String group6 = matcher.group(14);
        if (group6 != null) {
            d6 = Double.parseDouble(group6);
        }
        long j = (long) ((d10 + d6) * 1000.0d);
        if (isEmpty) {
            return -j;
        }
        return j;
    }

    /* renamed from: F */
    public static String m22205F(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, C3452d.f5595c);
    }

    /* renamed from: F0 */
    public static boolean m22204F0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: G */
    public static int m22203G(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f16368a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: G0 */
    public static boolean m22202G0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: H */
    public static int m22201H(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i2;
        }
        return Integer.reverseBytes(i2);
    }

    /* renamed from: H0 */
    public static <T> void m22200H0(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: I */
    public static byte[] m22199I(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: I0 */
    public static long m22198I0(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (j * (j2 / j3));
    }

    /* renamed from: J */
    public static int m22197J(String str, int i) {
        int i2 = 0;
        for (String str2 : m22184P0(str)) {
            if (i == C7562u.m22074n(str2)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: J0 */
    public static long[] m22196J0(List<Long> list, long j, long j2) {
        int size = list.size();
        long[] jArr = new long[size];
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        int i2 = 0;
        if (i >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() / j3;
                i2++;
            }
        } else if (i >= 0 || j % j2 != 0) {
            double d = j / j2;
            while (i2 < size) {
                jArr[i2] = (long) (list.get(i2).longValue() * d);
                i2++;
            }
        } else {
            long j4 = j / j2;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() * j4;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: K */
    public static String m22195K(String str, int i) {
        String[] P0 = m22184P0(str);
        if (P0.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : P0) {
            if (i == C7562u.m22074n(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    /* renamed from: K0 */
    public static void m22194K0(long[] jArr, long j, long j2) {
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        int i2 = 0;
        if (i >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j3;
                i2++;
            }
        } else if (i >= 0 || j % j2 != 0) {
            double d = j / j2;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d);
                i2++;
            }
        } else {
            long j4 = j / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
        }
    }

    /* renamed from: L */
    public static String m22193L(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb2.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    /* renamed from: L0 */
    public static void m22192L0(Throwable th2) {
        m22190M0(th2);
    }

    /* renamed from: M */
    public static String m22191M(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return m22170W0(networkCountryIso);
            }
        }
        return m22170W0(Locale.getDefault().getCountry());
    }

    /* renamed from: M0 */
    private static <T extends Throwable> void m22190M0(Throwable th2) {
        throw th2;
    }

    /* renamed from: N */
    public static Point m22189N(Context context) {
        return m22187O(context, ((WindowManager) C7510a.m22367e((WindowManager) context.getSystemService("window"))).getDefaultDisplay());
    }

    /* renamed from: N0 */
    public static String[] m22188N0(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: O */
    public static Point m22187O(Context context, Display display) {
        String str;
        int i = f16368a;
        if (i <= 29 && display.getDisplayId() == 0 && m22126s0(context)) {
            if ("Sony".equals(f16370c) && f16371d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            if (i < 28) {
                str = m22144j0("sys.display-size");
            } else {
                str = m22144j0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] N0 = m22188N0(str.trim(), "x");
                    if (N0.length == 2) {
                        int parseInt = Integer.parseInt(N0[0]);
                        int parseInt2 = Integer.parseInt(N0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                C7558r.m22109c("Util", "Invalid display size: " + str);
            }
        }
        Point point = new Point();
        int i2 = f16368a;
        if (i2 >= 23) {
            m22179S(display, point);
        } else if (i2 >= 17) {
            m22181R(display, point);
        } else {
            m22183Q(display, point);
        }
        return point;
    }

    /* renamed from: O0 */
    public static String[] m22186O0(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: P */
    public static Looper m22185P() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    /* renamed from: P0 */
    public static String[] m22184P0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return m22188N0(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: Q */
    private static void m22183Q(Display display, Point point) {
        display.getSize(point);
    }

    /* renamed from: Q0 */
    public static long m22182Q0(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    /* renamed from: R */
    private static void m22181R(Display display, Point point) {
        display.getRealSize(point);
    }

    /* renamed from: R0 */
    public static boolean m22180R0(SQLiteDatabase sQLiteDatabase, String str) {
        if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private static void m22179S(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* renamed from: S0 */
    public static byte[] m22178S0(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: T */
    public static UUID m22177T(String str) {
        String U0 = m22174U0(str);
        U0.hashCode();
        char c = 65535;
        switch (U0.hashCode()) {
            case -1860423953:
                if (U0.equals("playready")) {
                    c = 0;
                    break;
                }
                break;
            case -1400551171:
                if (U0.equals("widevine")) {
                    c = 1;
                    break;
                }
                break;
            case 790309106:
                if (U0.equals("clearkey")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C6713c.f14281e;
            case 1:
                return C6713c.f14280d;
            case 2:
                return C6713c.f14279c;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    /* renamed from: T0 */
    public static long m22176T0(int i, int i2) {
        return m22172V0(i2) | (m22172V0(i) << 32);
    }

    /* renamed from: U */
    public static String m22175U(Locale locale) {
        return f16368a >= 21 ? m22173V(locale) : locale.toString();
    }

    /* renamed from: U0 */
    public static String m22174U0(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    /* renamed from: V */
    private static String m22173V(Locale locale) {
        return locale.toLanguageTag();
    }

    /* renamed from: V0 */
    public static long m22172V0(int i) {
        return i & 4294967295L;
    }

    /* renamed from: W */
    public static long m22171W(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    /* renamed from: W0 */
    public static String m22170W0(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    /* renamed from: X */
    private static int m22169X(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                if (f16368a >= 29) {
                    return 9;
                }
                return 0;
        }
    }

    /* renamed from: X0 */
    public static CharSequence m22168X0(CharSequence charSequence, int i) {
        return charSequence.length() <= i ? charSequence : charSequence.subSequence(0, i);
    }

    /* renamed from: Y */
    public static int m22167Y(Context context) {
        ConnectivityManager connectivityManager;
        int i = 0;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type == 6) {
                            return 5;
                        }
                        if (type != 9) {
                            return 8;
                        }
                        return 7;
                    }
                }
                return m22169X(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* renamed from: Y0 */
    public static String m22166Y0(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 * 2);
        StringBuilder sb2 = new StringBuilder(i4);
        Matcher matcher = f16376i.matcher(str);
        while (i2 > 0 && matcher.find()) {
            sb2.append((CharSequence) str, i, matcher.start());
            sb2.append((char) Integer.parseInt((String) C7510a.m22367e(matcher.group(1)), 16));
            i = matcher.end();
            i2--;
        }
        if (i < length) {
            sb2.append((CharSequence) str, i, length);
        }
        if (sb2.length() != i4) {
            return null;
        }
        return sb2.toString();
    }

    /* renamed from: Z */
    public static long m22165Z(long j) {
        if (j == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    /* renamed from: Z0 */
    public static void m22164Z0(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a0 */
    public static int m22162a0(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: b */
    public static long m22161b(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    /* renamed from: b0 */
    public static C6722k m22160b0(int i, int i2, int i3) {
        return new C6722k.C6724b().m24488e0("audio/raw").m24516H(i2).m24486f0(i3).m24499Y(i).m24519E();
    }

    /* renamed from: c */
    public static boolean m22159c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c0 */
    public static int m22158c0(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    /* renamed from: d */
    public static <T extends Comparable<? super T>> int m22157d(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(t) == 0);
            if (z) {
                i = binarySearch - 1;
            } else {
                i = binarySearch;
            }
        }
        if (z2) {
            return Math.min(list.size() - 1, i);
        }
        return i;
    }

    /* renamed from: d0 */
    public static long m22156d0(long j, float f) {
        return f == 1.0f ? j : Math.round(j / f);
    }

    /* renamed from: e */
    public static int m22155e(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            if (z) {
                i = binarySearch - 1;
            } else {
                i = binarySearch;
            }
        }
        if (z2) {
            return Math.min(jArr.length - 1, i);
        }
        return i;
    }

    /* renamed from: e0 */
    public static int m22154e0(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: f */
    public static int m22153f(C7560s sVar, long j, boolean z, boolean z2) {
        int i;
        int c = sVar.m22092c() - 1;
        int i2 = 0;
        while (i2 <= c) {
            int i3 = (i2 + c) >>> 1;
            if (sVar.m22093b(i3) < j) {
                i2 = i3 + 1;
            } else {
                c = i3 - 1;
            }
        }
        if (z && (i = c + 1) < sVar.m22092c() && sVar.m22093b(i) == j) {
            return i;
        }
        if (!z2 || c != -1) {
            return c;
        }
        return 0;
    }

    /* renamed from: f0 */
    public static String m22152f0(StringBuilder sb2, Formatter formatter, long j) {
        String str;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        if (j < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j) + 500) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        sb2.setLength(0);
        if (j4 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
    }

    /* renamed from: g */
    public static <T extends Comparable<? super T>> int m22151g(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(t) == 0);
            if (z) {
                i = binarySearch + 1;
            } else {
                i = binarySearch;
            }
        }
        if (z2) {
            return Math.max(0, i);
        }
        return i;
    }

    /* renamed from: g0 */
    public static String[] m22150g0() {
        String[] h0 = m22148h0();
        for (int i = 0; i < h0.length; i++) {
            h0[i] = m22114y0(h0[i]);
        }
        return h0;
    }

    /* renamed from: h */
    public static int m22149h(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i);
            if (z) {
                i2 = binarySearch + 1;
            } else {
                i2 = binarySearch;
            }
        }
        if (z2) {
            return Math.max(0, i2);
        }
        return i2;
    }

    /* renamed from: h0 */
    private static String[] m22148h0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f16368a >= 24 ? m22146i0(configuration) : new String[]{m22175U(configuration.locale)};
    }

    /* renamed from: i */
    public static int m22147i(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            if (z) {
                i = binarySearch + 1;
            } else {
                i = binarySearch;
            }
        }
        if (z2) {
            return Math.max(0, i);
        }
        return i;
    }

    /* renamed from: i0 */
    private static String[] m22146i0(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return m22188N0(languageTags, ",");
    }

    /* renamed from: j */
    public static <T> T m22145j(T t) {
        return t;
    }

    /* renamed from: j0 */
    private static String m22144j0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            C7558r.m22108d("Util", "Failed to read system property " + str, e);
            return null;
        }
    }

    /* renamed from: k */
    public static <T> T[] m22143k(T[] tArr) {
        return tArr;
    }

    /* renamed from: k0 */
    public static String m22142k0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.13.3";
    }

    /* renamed from: l */
    public static int m22141l(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: l0 */
    public static byte[] m22140l0(String str) {
        return str.getBytes(C3452d.f5595c);
    }

    /* renamed from: m */
    public static long m22139m(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    /* renamed from: m0 */
    public static int m22138m0(String str) {
        String U0 = m22174U0(str);
        if (U0.endsWith(".mpd")) {
            return 0;
        }
        if (U0.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = f16377j.matcher(U0);
        if (!matcher.matches()) {
            return 3;
        }
        String group = matcher.group(2);
        if (group == null) {
            return 1;
        }
        if (group.contains("format=mpd-time-csf")) {
            return 0;
        }
        if (group.contains("format=m3u8-aapl")) {
            return 2;
        }
        return 1;
    }

    /* renamed from: n */
    public static void m22137n(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: n0 */
    public static boolean m22136n0(C7570y yVar, C7570y yVar2, Inflater inflater) {
        if (yVar.m22015a() <= 0) {
            return false;
        }
        if (yVar2.m22014b() < yVar.m22015a()) {
            yVar2.m22013c(yVar.m22015a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(yVar.m22012d(), yVar.m22011e(), yVar.m22015a());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(yVar2.m22012d(), i, yVar2.m22014b() - i);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    } else if (i == yVar2.m22014b()) {
                        yVar2.m22013c(yVar2.m22014b() * 2);
                    }
                } else {
                    yVar2.m22018O(i);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: o */
    public static void m22135o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: o0 */
    public static boolean m22134o0(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: p */
    public static int m22133p(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: p0 */
    public static boolean m22132p0(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: q */
    public static float m22131q(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: q0 */
    public static boolean m22130q0(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: r */
    public static int m22129r(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: r0 */
    public static boolean m22128r0(Uri uri) {
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || JSStackTrace.FILE_KEY.equals(scheme)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static long m22127s(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: s0 */
    public static boolean m22126s0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m22125t(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (m22159c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static /* synthetic */ Thread m22124t0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: u */
    public static int m22123u(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f16381n[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* renamed from: u0 */
    public static int m22122u0(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: v */
    public static int m22121v(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f16382o[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    /* renamed from: v0 */
    private static String m22120v0(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f16380m;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                return strArr[i + 1] + str.substring(strArr[i].length());
            }
            i += 2;
        }
    }

    /* renamed from: w */
    public static Handler m22119w(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: w0 */
    public static <T> void m22118w0(List<T> list, int i, int i2, int i3) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(Math.min(i3, list.size()), arrayDeque);
    }

    /* renamed from: x */
    public static Handler m22117x() {
        return m22115y(null);
    }

    /* renamed from: x0 */
    public static ExecutorService m22116x0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: g9.p0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread t0;
                t0 = C7557q0.m22124t0(str, runnable);
                return t0;
            }
        });
    }

    /* renamed from: y */
    public static Handler m22115y(Handler.Callback callback) {
        return m22119w((Looper) C7510a.m22364h(Looper.myLooper()), callback);
    }

    /* renamed from: y0 */
    public static String m22114y0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String U0 = m22174U0(str);
        String str2 = m22186O0(U0, "-")[0];
        if (f16378k == null) {
            f16378k = m22213B();
        }
        String str3 = f16378k.get(str2);
        if (str3 != null) {
            U0 = str3 + U0.substring(str2.length());
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            return m22120v0(U0);
        }
        return U0;
    }

    /* renamed from: z */
    public static Handler m22113z() {
        return m22215A(null);
    }

    /* renamed from: z0 */
    public static <T> T[] m22112z0(T[] tArr, T t) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t;
        return (T[]) m22143k(copyOf);
    }
}
