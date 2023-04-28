package p010a9;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p010a9.C1339f;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7570y;
import p317r8.C12453b;
import p383v8.C13452a;
import p383v8.C13453b;
import p383v8.C13454c;

/* renamed from: a9.f */
/* loaded from: classes7.dex */
public final class C1339f {

    /* renamed from: a */
    public static final Pattern f250a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f251b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map<String, Integer> f252c;

    /* renamed from: d */
    private static final Map<String, Integer> f253d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a9.f$b */
    /* loaded from: classes7.dex */
    public static class C1341b {

        /* renamed from: c */
        private static final Comparator<C1341b> f254c = new Comparator() { // from class: a9.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e;
                e = C1339f.C1341b.m41278e((C1339f.C1341b) obj, (C1339f.C1341b) obj2);
                return e;
            }
        };

        /* renamed from: a */
        private final C1342c f255a;

        /* renamed from: b */
        private final int f256b;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ int m41278e(C1341b bVar, C1341b bVar2) {
            return Integer.compare(bVar.f255a.f258b, bVar2.f255a.f258b);
        }

        private C1341b(C1342c cVar, int i) {
            this.f255a = cVar;
            this.f256b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a9.f$c */
    /* loaded from: classes7.dex */
    public static final class C1342c {

        /* renamed from: a */
        public final String f257a;

        /* renamed from: b */
        public final int f258b;

        /* renamed from: c */
        public final String f259c;

        /* renamed from: d */
        public final Set<String> f260d;

        private C1342c(String str, int i, String str2, Set<String> set) {
            this.f258b = i;
            this.f257a = str;
            this.f259c = str2;
            this.f260d = set;
        }

        /* renamed from: a */
        public static C1342c m41277a(String str, int i) {
            String str2;
            String trim = str.trim();
            C7510a.m22371a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] N0 = C7557q0.m22188N0(trim, "\\.");
            String str3 = N0[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < N0.length; i2++) {
                hashSet.add(N0[i2]);
            }
            return new C1342c(str3, i, str2, hashSet);
        }

        /* renamed from: b */
        public static C1342c m41276b() {
            return new C1342c("", 0, "", Collections.emptySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a9.f$d */
    /* loaded from: classes7.dex */
    public static final class C1343d implements Comparable<C1343d> {

        /* renamed from: k */
        public final int f261k;

        /* renamed from: l */
        public final C1337d f262l;

        public C1343d(int i, C1337d dVar) {
            this.f261k = i;
            this.f262l = dVar;
        }

        /* renamed from: a */
        public int compareTo(C1343d dVar) {
            return Integer.compare(this.f261k, dVar.f261k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a9.f$e */
    /* loaded from: classes7.dex */
    public static final class C1344e {

        /* renamed from: c */
        public CharSequence f265c;

        /* renamed from: a */
        public long f263a = 0;

        /* renamed from: b */
        public long f264b = 0;

        /* renamed from: d */
        public int f266d = 2;

        /* renamed from: e */
        public float f267e = -3.4028235E38f;

        /* renamed from: f */
        public int f268f = 1;

        /* renamed from: g */
        public int f269g = 0;

        /* renamed from: h */
        public float f270h = -3.4028235E38f;

        /* renamed from: i */
        public int f271i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f272j = 1.0f;

        /* renamed from: k */
        public int f273k = Integer.MIN_VALUE;

        /* renamed from: b */
        private static float m41273b(float f, int i) {
            int i2 = (f > (-3.4028235E38f) ? 1 : (f == (-3.4028235E38f) ? 0 : -1));
            if (i2 == 0 || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return i2 != 0 ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: c */
        private static Layout.Alignment m41272c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            C7558r.m22104h("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* renamed from: d */
        private static float m41271d(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        /* renamed from: e */
        private static float m41270e(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* renamed from: f */
        private static int m41269f(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        /* renamed from: a */
        public C1338e m41274a() {
            return new C1338e(m41268g().m6695a(), this.f263a, this.f264b);
        }

        /* renamed from: g */
        public C12453b.C0400b m41268g() {
            float f = this.f270h;
            if (f == -3.4028235E38f) {
                f = m41270e(this.f266d);
            }
            int i = this.f271i;
            if (i == Integer.MIN_VALUE) {
                i = m41269f(this.f266d);
            }
            C12453b.C0400b q = new C12453b.C0400b().m6681o(m41272c(this.f266d)).m6688h(m41273b(this.f267e, this.f268f), this.f268f).m6687i(this.f269g).m6686j(f).m6685k(i).m6683m(Math.min(this.f272j, m41271d(i, f))).m6679q(this.f273k);
            CharSequence charSequence = this.f265c;
            if (charSequence != null) {
                q.m6682n(charSequence);
            }
            return q;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f252c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f253d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m41305a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = f252c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = f253d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m41304b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                C7558r.m22104h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    /* renamed from: c */
    private static void m41303c(SpannableStringBuilder spannableStringBuilder, String str, C1342c cVar, List<C1341b> list, List<C1337d> list2) {
        int i = m41297i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C1341b.f254c);
        int i2 = cVar.f258b;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if ("rt".equals(((C1341b) arrayList.get(i4)).f255a.f257a)) {
                C1341b bVar = (C1341b) arrayList.get(i4);
                int g = m41299g(m41297i(list2, str, bVar.f255a), i, 1);
                int i5 = bVar.f255a.f258b - i3;
                int i6 = bVar.f256b - i3;
                CharSequence subSequence = spannableStringBuilder.subSequence(i5, i6);
                spannableStringBuilder.delete(i5, i6);
                spannableStringBuilder.setSpan(new C13453b(subSequence.toString(), g), i2, i5, 33);
                i3 += subSequence.length();
                i2 = i5;
            }
        }
    }

    /* renamed from: d */
    private static void m41302d(String str, C1342c cVar, List<C1341b> list, SpannableStringBuilder spannableStringBuilder, List<C1337d> list2) {
        int i = cVar.f258b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f257a;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals("c")) {
                    c = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 2:
                m41305a(spannableStringBuilder, cVar.f260d, i, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 7:
                m41303c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<C1343d> h = m41298h(list2, str, cVar);
        for (int i2 = 0; i2 < h.size(); i2++) {
            m41301e(spannableStringBuilder, h.get(i2).f262l, i, length);
        }
    }

    /* renamed from: e */
    private static void m41301e(SpannableStringBuilder spannableStringBuilder, C1337d dVar, int i, int i2) {
        if (dVar != null) {
            if (dVar.m41323i() != -1) {
                C13454c.m3648a(spannableStringBuilder, new StyleSpan(dVar.m41323i()), i, i2, 33);
            }
            if (dVar.m41320l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (dVar.m41319m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (dVar.m41321k()) {
                C13454c.m3648a(spannableStringBuilder, new ForegroundColorSpan(dVar.m41329c()), i, i2, 33);
            }
            if (dVar.m41322j()) {
                C13454c.m3648a(spannableStringBuilder, new BackgroundColorSpan(dVar.m41331a()), i, i2, 33);
            }
            if (dVar.m41328d() != null) {
                C13454c.m3648a(spannableStringBuilder, new TypefaceSpan(dVar.m41328d()), i, i2, 33);
            }
            int f = dVar.m41326f();
            if (f == 1) {
                C13454c.m3648a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.m41327e(), true), i, i2, 33);
            } else if (f == 2) {
                C13454c.m3648a(spannableStringBuilder, new RelativeSizeSpan(dVar.m41327e()), i, i2, 33);
            } else if (f == 3) {
                C13454c.m3648a(spannableStringBuilder, new RelativeSizeSpan(dVar.m41327e() / 100.0f), i, i2, 33);
            }
            if (dVar.m41330b()) {
                spannableStringBuilder.setSpan(new C13452a(), i, i2, 33);
            }
        }
    }

    /* renamed from: f */
    private static int m41300f(String str, int i) {
        int indexOf = str.indexOf(62, i);
        if (indexOf == -1) {
            return str.length();
        }
        return indexOf + 1;
    }

    /* renamed from: g */
    private static int m41299g(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static List<C1343d> m41298h(List<C1337d> list, String str, C1342c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C1337d dVar = list.get(i);
            int h = dVar.m41324h(str, cVar.f257a, cVar.f260d, cVar.f259c);
            if (h > 0) {
                arrayList.add(new C1343d(h, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    private static int m41297i(List<C1337d> list, String str, C1342c cVar) {
        List<C1343d> h = m41298h(list, str, cVar);
        for (int i = 0; i < h.size(); i++) {
            C1337d dVar = h.get(i).f262l;
            if (dVar.m41325g() != -1) {
                return dVar.m41325g();
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static String m41296j(String str) {
        String trim = str.trim();
        C7510a.m22371a(!trim.isEmpty());
        return C7557q0.m22186O0(trim, "[ \\.]")[0];
    }

    /* renamed from: k */
    private static boolean m41295k(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals("b")) {
                    c = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals("c")) {
                    c = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static C12453b m41294l(CharSequence charSequence) {
        C1344e eVar = new C1344e();
        eVar.f265c = charSequence;
        return eVar.m41268g().m6695a();
    }

    /* renamed from: m */
    public static C1338e m41293m(C7570y yVar, List<C1337d> list) {
        String p = yVar.m22000p();
        if (p == null) {
            return null;
        }
        Pattern pattern = f250a;
        Matcher matcher = pattern.matcher(p);
        if (matcher.matches()) {
            return m41292n(null, matcher, yVar, list);
        }
        String p2 = yVar.m22000p();
        if (p2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(p2);
        if (matcher2.matches()) {
            return m41292n(p.trim(), matcher2, yVar, list);
        }
        return null;
    }

    /* renamed from: n */
    private static C1338e m41292n(String str, Matcher matcher, C7570y yVar, List<C1337d> list) {
        C1344e eVar = new C1344e();
        try {
            eVar.f263a = C1347i.m41262d((String) C7510a.m22367e(matcher.group(1)));
            eVar.f264b = C1347i.m41262d((String) C7510a.m22367e(matcher.group(2)));
            m41290p((String) C7510a.m22367e(matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String p = yVar.m22000p();
            while (!TextUtils.isEmpty(p)) {
                if (sb2.length() > 0) {
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                sb2.append(p.trim());
                p = yVar.m22000p();
            }
            eVar.f265c = m41289q(str, sb2.toString(), list);
            return eVar.m41274a();
        } catch (NumberFormatException unused) {
            C7558r.m22104h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static C12453b.C0400b m41291o(String str) {
        C1344e eVar = new C1344e();
        m41290p(str, eVar);
        return eVar.m41268g();
    }

    /* renamed from: p */
    private static void m41290p(String str, C1344e eVar) {
        Matcher matcher = f251b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C7510a.m22367e(matcher.group(1));
            String str3 = (String) C7510a.m22367e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m41287s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f266d = m41284v(str3);
                } else if (ViewProps.POSITION.equals(str2)) {
                    m41285u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f272j = C1347i.m41263c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f273k = m41283w(str3);
                } else {
                    C7558r.m22104h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                C7558r.m22104h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static SpannedString m41289q(String str, String str2, List<C1337d> list) {
        boolean z;
        boolean z2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m41304b(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    if (str2.charAt(i2) == '/') {
                        z = true;
                    } else {
                        z = false;
                    }
                    i2 = m41300f(str2, i2);
                    int i4 = i2 - 2;
                    if (str2.charAt(i4) == '/') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    if (!substring.trim().isEmpty()) {
                        String j = m41296j(substring);
                        if (m41295k(j)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    C1342c cVar = (C1342c) arrayDeque.pop();
                                    m41302d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new C1341b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f257a.equals(j)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C1342c.m41277a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m41302d(str, (C1342c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m41302d(str, C1342c.m41276b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: r */
    private static int m41288r(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(ViewProps.END)) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(ViewProps.START)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                C7558r.m22104h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: s */
    private static void m41287s(String str, C1344e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f269g = m41288r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f267e = C1347i.m41263c(str);
            eVar.f268f = 0;
            return;
        }
        eVar.f267e = Integer.parseInt(str);
        eVar.f268f = 1;
    }

    /* renamed from: t */
    private static int m41286t(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals(ViewProps.END)) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(ViewProps.START)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                C7558r.m22104h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: u */
    private static void m41285u(String str, C1344e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f271i = m41286t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f270h = C1347i.m41263c(str);
    }

    /* renamed from: v */
    private static int m41284v(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(ViewProps.END)) {
                    c = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(ViewProps.LEFT)) {
                    c = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(ViewProps.RIGHT)) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(ViewProps.START)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                C7558r.m22104h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    /* renamed from: w */
    private static int m41283w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        C7558r.m22104h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
