package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p326ri.C12718u;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB/\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m15073d2 = {"Lokhttp3/MediaType;", "", "Ljava/nio/charset/Charset;", "defaultValue", "c", "", "name", "e", "toString", "other", "", "equals", "", "hashCode", "a", "Ljava/lang/String;", "mediaType", "b", "g", "()Ljava/lang/String;", "type", "subtype", "", "d", "[Ljava/lang/String;", "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class MediaType {

    /* renamed from: a */
    private final String f25403a;

    /* renamed from: b */
    private final String f25404b;

    /* renamed from: c */
    private final String f25405c;

    /* renamed from: d */
    private final String[] f25406d;

    /* renamed from: g */
    public static final C11422a f25402g = new C11422a(null);

    /* renamed from: e */
    private static final Pattern f25400e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f */
    private static final Pattern f25401f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0011"}, m15073d2 = {"Lokhttp3/MediaType$a;", "", "", "Lokhttp3/MediaType;", "a", "(Ljava/lang/String;)Lokhttp3/MediaType;", "b", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: okhttp3.MediaType$a */
    /* loaded from: classes8.dex */
    public static final class C11422a {
        private C11422a() {
        }

        public /* synthetic */ C11422a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MediaType m9980a(String toMediaType) {
            boolean H;
            boolean s;
            C9971q.m14633g(toMediaType, "$this$toMediaType");
            Matcher matcher = MediaType.f25400e.matcher(toMediaType);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                C9971q.m14634f(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                C9971q.m14634f(locale, "Locale.US");
                if (group != null) {
                    String lowerCase = group.toLowerCase(locale);
                    C9971q.m14634f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String group2 = matcher.group(2);
                    C9971q.m14634f(group2, "typeSubtype.group(2)");
                    C9971q.m14634f(locale, "Locale.US");
                    if (group2 != null) {
                        String lowerCase2 = group2.toLowerCase(locale);
                        C9971q.m14634f(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                        ArrayList arrayList = new ArrayList();
                        Matcher matcher2 = MediaType.f25401f.matcher(toMediaType);
                        int end = matcher.end();
                        while (end < toMediaType.length()) {
                            matcher2.region(end, toMediaType.length());
                            if (matcher2.lookingAt()) {
                                String group3 = matcher2.group(1);
                                if (group3 == null) {
                                    end = matcher2.end();
                                } else {
                                    String group4 = matcher2.group(2);
                                    if (group4 == null) {
                                        group4 = matcher2.group(3);
                                    } else {
                                        H = C12718u.m5736H(group4, "'", false, 2, null);
                                        if (H) {
                                            s = C12718u.m5733s(group4, "'", false, 2, null);
                                            if (s && group4.length() > 2) {
                                                group4 = group4.substring(1, group4.length() - 1);
                                                C9971q.m14634f(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                            }
                                        }
                                    }
                                    arrayList.add(group3);
                                    arrayList.add(group4);
                                    end = matcher2.end();
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Parameter is not formatted correctly: \"");
                                String substring = toMediaType.substring(end);
                                C9971q.m14634f(substring, "(this as java.lang.String).substring(startIndex)");
                                sb2.append(substring);
                                sb2.append("\" for: \"");
                                sb2.append(toMediaType);
                                sb2.append('\"');
                                throw new IllegalArgumentException(sb2.toString().toString());
                            }
                        }
                        Object[] array = arrayList.toArray(new String[0]);
                        if (array != null) {
                            return new MediaType(toMediaType, lowerCase, lowerCase2, (String[]) array, null);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + toMediaType + '\"').toString());
        }

        /* renamed from: b */
        public final MediaType m9979b(String toMediaTypeOrNull) {
            C9971q.m14633g(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                return m9980a(toMediaTypeOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.f25403a = str;
        this.f25404b = str2;
        this.f25405c = str3;
        this.f25406d = strArr;
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m9984d(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.m9985c(charset);
    }

    /* renamed from: f */
    public static final MediaType m9982f(String str) {
        return f25402g.m9979b(str);
    }

    /* renamed from: c */
    public final Charset m9985c(Charset charset) {
        String e = m9983e("charset");
        if (e == null) {
            return charset;
        }
        try {
            return Charset.forName(e);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x002c */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m9983e(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C9971q.m14633g(r6, r0)
            java.lang.String[] r0 = r5.f25406d
            kotlin.ranges.IntRange r0 = kotlin.collections.C9894b.m15048F(r0)
            r1 = 2
            kotlin.ranges.a r0 = eg.C6882h.m23966o(r0, r1)
            int r1 = r0.m14605a()
            int r2 = r0.m14604b()
            int r0 = r0.m14603f()
            if (r0 < 0) goto L_0x0021
            if (r1 > r2) goto L_0x0038
            goto L_0x0023
        L_0x0021:
            if (r1 < r2) goto L_0x0038
        L_0x0023:
            java.lang.String[] r3 = r5.f25406d
            r3 = r3[r1]
            r4 = 1
            boolean r3 = p326ri.C12707l.m5771t(r3, r6, r4)
            if (r3 == 0) goto L_0x0034
            java.lang.String[] r6 = r5.f25406d
            int r1 = r1 + r4
            r6 = r6[r1]
            return r6
        L_0x0034:
            if (r1 == r2) goto L_0x0038
            int r1 = r1 + r0
            goto L_0x0023
        L_0x0038:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MediaType.m9983e(java.lang.String):java.lang.String");
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && C9971q.m14638b(((MediaType) obj).f25403a, this.f25403a);
    }

    /* renamed from: g */
    public final String m9981g() {
        return this.f25404b;
    }

    public int hashCode() {
        return this.f25403a.hashCode();
    }

    public String toString() {
        return this.f25403a;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }
}
