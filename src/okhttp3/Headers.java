package okhttp3;

import ag.AbstractC1385a;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import eg.C6884j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9899f;
import kotlin.collections.C9906j;
import kotlin.collections.C9911o;
import kotlin.jvm.internal.C9941b;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C9986a;
import kotlin.ranges.IntRange;
import nf.C11098x;
import p326ri.C12718u;
import p326ri.C12719v;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u0000  2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0005\bB\u0017\b\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u0003J\u001b\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0096\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m15073d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "name", "a", "", "index", "b", "j", "", "p", "", "iterator", "Lokhttp3/Headers$a;", "f", "", "other", "", "equals", "hashCode", "toString", "", "i", "", "k", "[Ljava/lang/String;", "namesAndValues", "size", "()I", "<init>", "([Ljava/lang/String;)V", "l", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, AbstractC1385a {

    /* renamed from: l */
    public static final C11419b f25376l = new C11419b(null);

    /* renamed from: k */
    private final String[] f25377k;

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u0019\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u000f\u001a\u00020\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m15073d2 = {"Lokhttp3/Headers$a;", "", "", "line", "b", "(Ljava/lang/String;)Lokhttp3/Headers$a;", "name", "value", "a", "c", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$a;", "g", "h", "e", "Lokhttp3/Headers;", "d", "", "Ljava/util/List;", "f", "()Ljava/util/List;", "namesAndValues", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.Headers$a */
    /* loaded from: classes8.dex */
    public static final class C11418a {

        /* renamed from: a */
        private final List<String> f25378a = new ArrayList(20);

        /* renamed from: a */
        public final C11418a m10065a(String name, String value) {
            C9971q.m14633g(name, "name");
            C9971q.m14633g(value, "value");
            C11419b bVar = Headers.f25376l;
            bVar.m10054d(name);
            bVar.m10053e(value, name);
            m10063c(name, value);
            return this;
        }

        /* renamed from: b */
        public final C11418a m10064b(String line) {
            int Y;
            C9971q.m14633g(line, "line");
            Y = C12719v.m5687Y(line, ':', 1, false, 4, null);
            if (Y != -1) {
                String substring = line.substring(0, Y);
                C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = line.substring(Y + 1);
                C9971q.m14634f(substring2, "(this as java.lang.String).substring(startIndex)");
                m10063c(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                C9971q.m14634f(substring3, "(this as java.lang.String).substring(startIndex)");
                m10063c("", substring3);
            } else {
                m10063c("", line);
            }
            return this;
        }

        /* renamed from: c */
        public final C11418a m10063c(String name, String value) {
            CharSequence V0;
            C9971q.m14633g(name, "name");
            C9971q.m14633g(value, "value");
            this.f25378a.add(name);
            List<String> list = this.f25378a;
            V0 = C12719v.m5690V0(value);
            list.add(V0.toString());
            return this;
        }

        /* renamed from: d */
        public final Headers m10062d() {
            Object[] array = this.f25378a.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* JADX WARN: Incorrect condition in loop: B:7:0x0036 */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String m10061e(java.lang.String r6) {
            /*
                r5 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.C9971q.m14633g(r6, r0)
                java.util.List<java.lang.String> r0 = r5.f25378a
                int r0 = r0.size()
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                kotlin.ranges.a r0 = eg.C6882h.m23969l(r0, r2)
                kotlin.ranges.a r0 = eg.C6882h.m23966o(r0, r1)
                int r1 = r0.m14605a()
                int r2 = r0.m14604b()
                int r0 = r0.m14603f()
                if (r0 < 0) goto L_0x0027
                if (r1 > r2) goto L_0x0046
                goto L_0x0029
            L_0x0027:
                if (r1 < r2) goto L_0x0046
            L_0x0029:
                java.util.List<java.lang.String> r3 = r5.f25378a
                java.lang.Object r3 = r3.get(r1)
                java.lang.String r3 = (java.lang.String) r3
                r4 = 1
                boolean r3 = p326ri.C12707l.m5771t(r6, r3, r4)
                if (r3 == 0) goto L_0x0042
                java.util.List<java.lang.String> r6 = r5.f25378a
                int r1 = r1 + r4
                java.lang.Object r6 = r6.get(r1)
                java.lang.String r6 = (java.lang.String) r6
                return r6
            L_0x0042:
                if (r1 == r2) goto L_0x0046
                int r1 = r1 + r0
                goto L_0x0029
            L_0x0046:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.C11418a.m10061e(java.lang.String):java.lang.String");
        }

        /* renamed from: f */
        public final List<String> m10060f() {
            return this.f25378a;
        }

        /* renamed from: g */
        public final C11418a m10059g(String name) {
            boolean t;
            C9971q.m14633g(name, "name");
            int i = 0;
            while (i < this.f25378a.size()) {
                t = C12718u.m5732t(name, this.f25378a.get(i), true);
                if (t) {
                    this.f25378a.remove(i);
                    this.f25378a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: h */
        public final C11418a m10058h(String name, String value) {
            C9971q.m14633g(name, "name");
            C9971q.m14633g(value, "value");
            C11419b bVar = Headers.f25376l;
            bVar.m10054d(name);
            bVar.m10053e(value, name);
            m10059g(name);
            m10063c(name, value);
            return this;
        }
    }

    @Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m15073d2 = {"Lokhttp3/Headers$b;", "", "", "", "namesAndValues", "name", "f", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "d", "value", "e", "Lokhttp3/Headers;", "h", "([Ljava/lang/String;)Lokhttp3/Headers;", "", "g", "(Ljava/util/Map;)Lokhttp3/Headers;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.Headers$b */
    /* loaded from: classes8.dex */
    public static final class C11419b {
        private C11419b() {
        }

        public /* synthetic */ C11419b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final void m10054d(String str) {
            boolean z;
            boolean z2;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException(C12729c.m5601q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m10053e(String str, String str2) {
            boolean z;
            String str3;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\t' || (' ' <= charAt && '~' >= charAt)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C12729c.m5601q("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    if (C12729c.m5638E(str2)) {
                        str3 = "";
                    } else {
                        str3 = ": " + str;
                    }
                    sb2.append(str3);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Incorrect condition in loop: B:7:0x0026 */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String m10052f(java.lang.String[] r6, java.lang.String r7) {
            /*
                r5 = this;
                int r0 = r6.length
                r1 = 2
                int r0 = r0 - r1
                r2 = 0
                kotlin.ranges.a r0 = eg.C6882h.m23969l(r0, r2)
                kotlin.ranges.a r0 = eg.C6882h.m23966o(r0, r1)
                int r1 = r0.m14605a()
                int r2 = r0.m14604b()
                int r0 = r0.m14603f()
                if (r0 < 0) goto L_0x001d
                if (r1 > r2) goto L_0x0030
                goto L_0x001f
            L_0x001d:
                if (r1 < r2) goto L_0x0030
            L_0x001f:
                r3 = r6[r1]
                r4 = 1
                boolean r3 = p326ri.C12707l.m5771t(r7, r3, r4)
                if (r3 == 0) goto L_0x002c
                int r1 = r1 + r4
                r6 = r6[r1]
                return r6
            L_0x002c:
                if (r1 == r2) goto L_0x0030
                int r1 = r1 + r0
                goto L_0x001f
            L_0x0030:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.C11419b.m10052f(java.lang.String[], java.lang.String):java.lang.String");
        }

        /* renamed from: g */
        public final Headers m10051g(Map<String, String> toHeaders) {
            CharSequence V0;
            CharSequence V02;
            C9971q.m14633g(toHeaders, "$this$toHeaders");
            String[] strArr = new String[toHeaders.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : toHeaders.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    V0 = C12719v.m5690V0(key);
                    String obj = V0.toString();
                    if (value != null) {
                        V02 = C12719v.m5690V0(value);
                        String obj2 = V02.toString();
                        m10054d(obj);
                        m10053e(obj2, obj);
                        strArr[i] = obj;
                        strArr[i + 1] = obj2;
                        i += 2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return new Headers(strArr, null);
        }

        /* renamed from: h */
        public final Headers m10050h(String... namesAndValues) {
            boolean z;
            IntRange F;
            C9986a o;
            boolean z2;
            CharSequence V0;
            C9971q.m14633g(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Object clone = namesAndValues.clone();
                if (clone != null) {
                    String[] strArr = (String[]) clone;
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        String str = strArr[i];
                        if (str != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        } else if (str != null) {
                            V0 = C12719v.m5690V0(str);
                            strArr[i] = V0.toString();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    F = C9899f.m14962F(strArr);
                    o = C6884j.m23949o(F, 2);
                    int a = o.m14605a();
                    int b = o.m14604b();
                    int f = o.m14603f();
                    if (f < 0 ? a >= b : a <= b) {
                        while (true) {
                            String str2 = strArr[a];
                            String str3 = strArr[a + 1];
                            m10054d(str2);
                            m10053e(str3, str2);
                            if (a == b) {
                                break;
                            }
                            a += f;
                        }
                    }
                    return new Headers(strArr, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    private Headers(String[] strArr) {
        this.f25377k = strArr;
    }

    /* renamed from: g */
    public static final Headers m10069g(Map<String, String> map) {
        return f25376l.m10051g(map);
    }

    /* renamed from: a */
    public final String m10072a(String name) {
        C9971q.m14633g(name, "name");
        return f25376l.m10052f(this.f25377k, name);
    }

    /* renamed from: b */
    public final String m10071b(int i) {
        return this.f25377k[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.f25377k, ((Headers) obj).f25377k);
    }

    /* renamed from: f */
    public final C11418a m10070f() {
        C11418a aVar = new C11418a();
        C9911o.m14800z(aVar.m10060f(), this.f25377k);
        return aVar;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25377k);
    }

    /* renamed from: i */
    public final Map<String, List<String>> m10068i() {
        Comparator v;
        v = C12718u.m5730v(C9962k0.f22091a);
        TreeMap treeMap = new TreeMap(v);
        int size = size();
        for (int i = 0; i < size; i++) {
            String b = m10071b(i);
            Locale locale = Locale.US;
            C9971q.m14634f(locale, "Locale.US");
            if (b != null) {
                String lowerCase = b.toLowerCase(locale);
                C9971q.m14634f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                List list = (List) treeMap.get(lowerCase);
                if (list == null) {
                    list = new ArrayList(2);
                    treeMap.put(lowerCase, list);
                }
                list.add(m10067j(i));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return treeMap;
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = C11098x.m10921a(m10071b(i), m10067j(i));
        }
        return C9941b.m14688a(pairArr);
    }

    /* renamed from: j */
    public final String m10067j(int i) {
        return this.f25377k[(i * 2) + 1];
    }

    /* renamed from: p */
    public final List<String> m10066p(String name) {
        List<String> i;
        boolean t;
        C9971q.m14633g(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            t = C12718u.m5732t(name, m10071b(i2), true);
            if (t) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m10067j(i2));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            C9971q.m14634f(unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }
        i = C9906j.m14820i();
        return i;
    }

    public final int size() {
        return this.f25377k.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b = m10071b(i);
            String j = m10067j(i);
            sb2.append(b);
            sb2.append(": ");
            if (C12729c.m5638E(b)) {
                j = "██";
            }
            sb2.append(j);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }
}
