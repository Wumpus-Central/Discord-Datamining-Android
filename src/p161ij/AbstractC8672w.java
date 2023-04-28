package p161ij;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p143hj.AbstractC8071l0;

/* renamed from: ij.w */
/* loaded from: classes8.dex */
public abstract class AbstractC8672w<U, S extends AbstractC8071l0<U>> {

    /* renamed from: d */
    private static final Object f19159d = new Object();

    /* renamed from: a */
    private final Class<U> f19160a;

    /* renamed from: b */
    private final List<AbstractC8674b<U>> f19161b;

    /* renamed from: c */
    private final String f19162c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ij.w$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC8674b<U> {

        /* renamed from: a */
        private final int f19163a;

        AbstractC8674b(int i) {
            this.f19163a = i;
        }

        /* renamed from: a */
        abstract int mo18399a();

        /* renamed from: b */
        abstract AbstractC8674b<U> mo18398b(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ij.w$c */
    /* loaded from: classes8.dex */
    public static class C8675c<U> extends AbstractC8674b<U> {

        /* renamed from: b */
        private final int f19164b;

        /* renamed from: c */
        private final U f19165c;

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: a */
        int mo18399a() {
            return this.f19164b;
        }

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: b */
        AbstractC8674b<U> mo18398b(int i) {
            return new C8675c(i, this.f19164b, this.f19165c);
        }

        private C8675c(int i, int i2, U u) {
            super(i);
            if (i2 < 1 || i2 > 9) {
                throw new IllegalArgumentException("Fraction width out of bounds: " + i2);
            }
            this.f19164b = i2;
            this.f19165c = u;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ij.w$e */
    /* loaded from: classes8.dex */
    public static class C8677e<U> extends AbstractC8674b<U> {

        /* renamed from: b */
        private final int f19167b;

        /* renamed from: c */
        private final int f19168c;

        /* renamed from: d */
        private final U f19169d;

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: a */
        int mo18399a() {
            return this.f19167b;
        }

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: b */
        AbstractC8674b<U> mo18398b(int i) {
            return new C8677e(i, this.f19167b, this.f19168c, this.f19169d);
        }

        private C8677e(int i, int i2, int i3, U u) {
            super(i);
            if (i2 < 1 || i2 > 18) {
                throw new IllegalArgumentException("Min width out of bounds: " + i2);
            } else if (i3 < i2) {
                throw new IllegalArgumentException("Max width smaller than min width.");
            } else if (i3 > 18) {
                throw new IllegalArgumentException("Max width out of bounds: " + i3);
            } else if (u != null) {
                this.f19167b = i2;
                this.f19168c = i3;
                this.f19169d = u;
            } else {
                throw new NullPointerException("Missing unit.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ij.w$f */
    /* loaded from: classes8.dex */
    public static class C8678f<U> extends AbstractC8674b<U> {

        /* renamed from: b */
        private final List<AbstractC8674b<U>> f19170b;

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: a */
        int mo18399a() {
            return 0;
        }

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: b */
        AbstractC8674b<U> mo18398b(int i) {
            ArrayList arrayList = new ArrayList(this.f19170b);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractC8674b bVar = (AbstractC8674b) arrayList.get(size);
                arrayList.set(size, bVar.mo18398b(i));
                i += bVar.mo18399a();
            }
            return new C8678f(arrayList);
        }

        private C8678f(List<AbstractC8674b<U>> list) {
            super(0);
            if (!list.isEmpty()) {
                AbstractC8674b<U> bVar = list.get(0);
                C8679g gVar = C8679g.f19171b;
                if (bVar == gVar || list.get(list.size() - 1) == gVar) {
                    throw new IllegalArgumentException("Optional section must not start or end with an or-operator.");
                }
                this.f19170b = Collections.unmodifiableList(list);
                return;
            }
            throw new IllegalArgumentException("Optional section is empty.");
        }
    }

    /* renamed from: ij.w$g */
    /* loaded from: classes8.dex */
    private static class C8679g<U> extends AbstractC8674b<U> {

        /* renamed from: b */
        static final C8679g f19171b = new C8679g();

        private C8679g() {
            super(0);
        }

        /* renamed from: c */
        static <U> AbstractC8674b<U> m18400c() {
            return f19171b;
        }

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: a */
        int mo18399a() {
            return 0;
        }

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: b */
        AbstractC8674b<U> mo18398b(int i) {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ij.w$h */
    /* loaded from: classes8.dex */
    public static class C8680h<U> extends AbstractC8674b<U> {

        /* renamed from: b */
        private final C8677e<U> f19172b;

        /* renamed from: c */
        private final AbstractC8674b<U> f19173c;

        /* renamed from: d */
        private final AbstractC8661p f19174d;

        /* renamed from: e */
        private final Map<EnumC8659n, String> f19175e;

        /* renamed from: f */
        private final int f19176f;

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: a */
        int mo18399a() {
            return this.f19176f;
        }

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: b */
        AbstractC8674b<U> mo18398b(int i) {
            return new C8680h(i, this.f19172b, this.f19173c, this.f19174d, this.f19175e, this.f19176f);
        }

        private C8680h(U u, String str, AbstractC8661p pVar, Map<EnumC8659n, String> map) {
            super(0);
            this.f19172b = new C8677e<>(0, 1, 18, u);
            this.f19173c = new C8676d(str, true);
            this.f19174d = pVar;
            this.f19175e = map;
            int i = ViewDefaults.NUMBER_OF_LINES;
            for (String str2 : map.values()) {
                if (str2.length() < i) {
                    i = str2.length();
                }
            }
            this.f19176f = i;
        }

        private C8680h(int i, C8677e<U> eVar, AbstractC8674b<U> bVar, AbstractC8661p pVar, Map<EnumC8659n, String> map, int i2) {
            super(i);
            this.f19172b = eVar;
            this.f19173c = bVar;
            this.f19174d = pVar;
            this.f19175e = map;
            this.f19176f = i2;
        }
    }

    /* renamed from: ij.w$i */
    /* loaded from: classes8.dex */
    private static class C8681i<U> extends AbstractC8674b<U> {

        /* renamed from: b */
        private final char f19177b;

        /* renamed from: c */
        private final char f19178c;

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: a */
        int mo18399a() {
            return 1;
        }

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: b */
        AbstractC8674b<U> mo18398b(int i) {
            return new C8681i(i, this.f19177b, this.f19178c);
        }

        private C8681i(char c, char c2) {
            this(0, c, c2);
        }

        private C8681i(int i, char c, char c2) {
            super(i);
            this.f19177b = c;
            this.f19178c = c2;
        }
    }

    /* renamed from: ij.w$j */
    /* loaded from: classes8.dex */
    private static class C8682j<U> extends AbstractC8674b<U> {

        /* renamed from: b */
        private final boolean f19179b;

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: a */
        int mo18399a() {
            return this.f19179b ? 1 : 0;
        }

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: b */
        AbstractC8674b<U> mo18398b(int i) {
            return new C8682j(i, this.f19179b);
        }

        private C8682j(boolean z) {
            super(0);
            this.f19179b = z;
        }

        private C8682j(int i, boolean z) {
            super(i);
            this.f19179b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8672w(Class<U> cls, String str) {
        int i;
        if (cls != null) {
            int length = str.length();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ArrayList());
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt == '#') {
                    i3++;
                } else if (m18403g(charAt)) {
                    int i4 = i2 + 1;
                    while (i4 < length && str.charAt(i4) == charAt) {
                        i4++;
                    }
                    m18405d(charAt, i4 - i2, i3, arrayList);
                    i2 = i4 - 1;
                    i3 = 0;
                } else if (i3 <= 0) {
                    if (charAt == '\'') {
                        int i5 = i2 + 1;
                        i = i5;
                        while (i < length) {
                            if (str.charAt(i) == '\'') {
                                int i6 = i + 1;
                                if (i6 >= length || str.charAt(i6) != '\'') {
                                    break;
                                }
                                i = i6;
                            }
                            i++;
                        }
                        if (i >= length) {
                            throw new IllegalArgumentException("String literal in pattern not closed: " + str);
                        } else if (i5 == i) {
                            m18408a('\'', arrayList);
                        } else {
                            m18407b(str.substring(i5, i).replace("''", "'"), arrayList);
                        }
                    } else if (charAt == '[') {
                        m18401i(arrayList);
                    } else if (charAt == ']') {
                        m18404e(arrayList);
                    } else if (charAt == '.') {
                        m18402h(arrayList).add(new C8681i('.', ','));
                    } else if (charAt == ',') {
                        m18402h(arrayList).add(new C8681i(',', '.'));
                    } else if (charAt == '-') {
                        m18402h(arrayList).add(new C8682j(false));
                    } else if (charAt == '+') {
                        m18402h(arrayList).add(new C8682j(true));
                    } else if (charAt == '{') {
                        int i7 = i2 + 1;
                        i = i7;
                        while (i < length && str.charAt(i) != '}') {
                            i++;
                        }
                        m18406c(str.substring(i7, i), arrayList);
                    } else if (charAt == '|') {
                        m18402h(arrayList).add(C8679g.m18400c());
                    } else {
                        m18408a(charAt, arrayList);
                    }
                    i2 = i;
                } else {
                    throw new IllegalArgumentException("Char # must be followed by unit symbol.");
                }
                i2++;
            }
            if (arrayList.size() > 1) {
                throw new IllegalArgumentException("Open square bracket without closing one.");
            } else if (!arrayList.isEmpty()) {
                List<AbstractC8674b<U>> list = arrayList.get(0);
                if (!list.isEmpty()) {
                    AbstractC8674b<U> bVar = list.get(0);
                    C8679g gVar = C8679g.f19171b;
                    if (bVar == gVar || list.get(list.size() - 1) == gVar) {
                        throw new IllegalArgumentException("Pattern must not start or end with an or-operator.");
                    }
                    int size = list.size();
                    int a = list.get(size - 1).mo18399a();
                    for (int i8 = size - 2; i8 >= 0; i8--) {
                        AbstractC8674b<U> bVar2 = list.get(i8);
                        if (bVar2 == C8679g.f19171b) {
                            a = 0;
                        } else {
                            list.set(i8, bVar2.mo18398b(a));
                            a += bVar2.mo18399a();
                        }
                    }
                    this.f19160a = cls;
                    this.f19161b = Collections.unmodifiableList(list);
                    this.f19162c = str;
                    return;
                }
                throw new IllegalArgumentException("Missing format pattern.");
            } else {
                throw new IllegalArgumentException("Empty or invalid pattern.");
            }
        } else {
            throw new NullPointerException("Missing unit type.");
        }
    }

    /* renamed from: a */
    private void m18408a(char c, List<List<AbstractC8674b<U>>> list) {
        m18407b(String.valueOf(c), list);
    }

    /* renamed from: b */
    private void m18407b(String str, List<List<AbstractC8674b<U>>> list) {
        m18402h(list).add(new C8676d(str));
    }

    /* renamed from: c */
    private void m18406c(String str, List<List<AbstractC8674b<U>>> list) {
        Locale locale;
        String[] split = str.split(":");
        if (split.length > 9 || split.length < 4) {
            throw new IllegalArgumentException("Plural information has wrong format: " + str);
        } else if (split[0].length() == 1) {
            U f = mo11408f(split[0].charAt(0));
            String[] split2 = split[2].split("-|_");
            String str2 = split2[0];
            if (split2.length > 1) {
                String str3 = split2[1];
                if (split2.length > 2) {
                    String str4 = split2[2];
                    if (split2.length <= 3) {
                        locale = new Locale(str2, str3, str4);
                    } else {
                        throw new IllegalArgumentException("Plural information has wrong locale: " + str);
                    }
                } else {
                    locale = new Locale(str2, str3);
                }
            } else {
                locale = new Locale(str2);
            }
            EnumMap enumMap = new EnumMap(EnumC8659n.class);
            AbstractC8661p f2 = AbstractC8661p.m18418f(locale, EnumC8656k.CARDINALS);
            for (int i = 3; i < split.length; i++) {
                String[] split3 = split[i].split("=");
                if (split3.length == 2) {
                    enumMap.put((EnumMap) EnumC8659n.valueOf(split3[0]), (EnumC8659n) split3[1]);
                } else {
                    throw new IllegalArgumentException("Plural information has wrong format: " + str);
                }
            }
            if (enumMap.isEmpty()) {
                throw new IllegalArgumentException("Missing plural forms: " + str);
            } else if (enumMap.containsKey(EnumC8659n.OTHER)) {
                m18402h(list).add(new C8680h(f, split[1], f2, enumMap));
            } else {
                throw new IllegalArgumentException("Missing plural category OTHER: " + str);
            }
        } else {
            throw new IllegalArgumentException("Plural information has wrong symbol: " + str);
        }
    }

    /* renamed from: d */
    private void m18405d(char c, int i, int i2, List<List<AbstractC8674b<U>>> list) {
        U f = mo11408f(c);
        List<AbstractC8674b<U>> list2 = list.get(list.size() - 1);
        if (c != 'f') {
            list2.add(new C8677e(0, i, i + i2, f));
        } else if (i2 <= 0) {
            list2.add(new C8675c(0, i, mo11408f(c)));
        } else {
            throw new IllegalArgumentException("Combination of # and f-symbol not allowed.");
        }
    }

    /* renamed from: e */
    private static <U> void m18404e(List<List<AbstractC8674b<U>>> list) {
        int size = list.size() - 1;
        if (size >= 1) {
            list.get(size - 1).add(new C8678f(list.remove(size)));
            return;
        }
        throw new IllegalArgumentException("Closing square bracket without open one.");
    }

    /* renamed from: g */
    private static boolean m18403g(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    /* renamed from: h */
    private static <U> List<AbstractC8674b<U>> m18402h(List<List<AbstractC8674b<U>>> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: i */
    private static <U> void m18401i(List<List<AbstractC8674b<U>>> list) {
        list.add(new ArrayList());
    }

    /* renamed from: f */
    protected abstract U mo11408f(char c);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ij.w$d */
    /* loaded from: classes8.dex */
    public static class C8676d<U> extends AbstractC8674b<U> {

        /* renamed from: b */
        private final String f19166b;

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: a */
        int mo18399a() {
            return this.f19166b.length();
        }

        @Override // p161ij.AbstractC8672w.AbstractC8674b
        /* renamed from: b */
        AbstractC8674b<U> mo18398b(int i) {
            return new C8676d(i, this.f19166b);
        }

        private C8676d(String str) {
            this(str, false);
        }

        private C8676d(String str, boolean z) {
            super(0);
            if (z || !str.isEmpty()) {
                this.f19166b = str;
                return;
            }
            throw new IllegalArgumentException("Literal is empty.");
        }

        private C8676d(int i, String str) {
            super(i);
            this.f19166b = str;
        }
    }
}
