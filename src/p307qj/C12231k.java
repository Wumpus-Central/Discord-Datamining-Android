package p307qj;

import co.discord.media_engine.C4081a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlinx.serialization.json.C10286l;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p326ri.C12718u;
import p326ri.C12719v;
import p327rj.C12727a;
import p327rj.C12729c;
import p409wj.C13893c;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u0000 &2\u00020\u0001:\u0002\f\u0011BQ\b\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0017J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001d\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010!\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010#\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e¨\u0006'"}, m15073d2 = {"Lqj/k;", "", "other", "", "equals", "", "hashCode", "", "toString", "forObsoleteRfc2965", "f", "(Z)Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "name", "b", "g", "value", "", "c", "J", "expiresAt", "()J", "d", "domain", "path", "Z", "secure", "()Z", "httpOnly", "h", "persistent", "i", "hostOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "n", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: qj.k */
/* loaded from: classes8.dex */
public final class C12231k {

    /* renamed from: a */
    private final String f27521a;

    /* renamed from: b */
    private final String f27522b;

    /* renamed from: c */
    private final long f27523c;

    /* renamed from: d */
    private final String f27524d;

    /* renamed from: e */
    private final String f27525e;

    /* renamed from: f */
    private final boolean f27526f;

    /* renamed from: g */
    private final boolean f27527g;

    /* renamed from: h */
    private final boolean f27528h;

    /* renamed from: i */
    private final boolean f27529i;

    /* renamed from: n */
    public static final C12233b f27520n = new C12233b(null);

    /* renamed from: j */
    private static final Pattern f27516j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f27517k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f27518l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f27519m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, m15073d2 = {"Lqj/k$a;", "", "", "domain", "", "hostOnly", "c", "name", "d", "value", "e", "b", "Lqj/k;", "a", "Ljava/lang/String;", "", "J", "expiresAt", "path", "f", "Z", "secure", "g", "httpOnly", "h", "persistent", "i", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.k$a */
    /* loaded from: classes8.dex */
    public static final class C12232a {

        /* renamed from: a */
        private String f27530a;

        /* renamed from: b */
        private String f27531b;

        /* renamed from: d */
        private String f27533d;

        /* renamed from: f */
        private boolean f27535f;

        /* renamed from: g */
        private boolean f27536g;

        /* renamed from: h */
        private boolean f27537h;

        /* renamed from: i */
        private boolean f27538i;

        /* renamed from: c */
        private long f27532c = 253402300799999L;

        /* renamed from: e */
        private String f27534e = "/";

        /* renamed from: c */
        private final C12232a m7321c(String str, boolean z) {
            String e = C12727a.m5644e(str);
            if (e != null) {
                this.f27533d = e;
                this.f27538i = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        /* renamed from: a */
        public final C12231k m7323a() {
            String str = this.f27530a;
            if (str != null) {
                String str2 = this.f27531b;
                if (str2 != null) {
                    long j = this.f27532c;
                    String str3 = this.f27533d;
                    if (str3 != null) {
                        return new C12231k(str, str2, j, str3, this.f27534e, this.f27535f, this.f27536g, this.f27537h, this.f27538i, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        /* renamed from: b */
        public final C12232a m7322b(String domain) {
            C9971q.m14633g(domain, "domain");
            return m7321c(domain, false);
        }

        /* renamed from: d */
        public final C12232a m7320d(String name) {
            CharSequence V0;
            C9971q.m14633g(name, "name");
            V0 = C12719v.m5690V0(name);
            if (C9971q.m14638b(V0.toString(), name)) {
                this.f27530a = name;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        /* renamed from: e */
        public final C12232a m7319e(String value) {
            CharSequence V0;
            C9971q.m14633g(value, "value");
            V0 = C12719v.m5690V0(value);
            if (C9971q.m14638b(V0.toString(), value)) {
                this.f27531b = value;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }
    }

    @Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J)\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0007R\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010#\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006'"}, m15073d2 = {"Lqj/k$b;", "", "", "urlHost", "domain", "", "b", "s", "", "pos", "limit", "", "g", "input", "invert", "a", "h", "f", "Lokhttp3/HttpUrl;", "url", "setCookie", "Lqj/k;", "c", "currentTimeMillis", "d", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lqj/k;", "Lokhttp3/Headers;", "headers", "", "e", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: qj.k$b */
    /* loaded from: classes8.dex */
    public static final class C12233b {
        private C12233b() {
        }

        public /* synthetic */ C12233b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final int m7318a(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                boolean z2 = true;
                if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || '9' < charAt) && (('a' > charAt || 'z' < charAt) && (('A' > charAt || 'Z' < charAt) && charAt != ':')))) {
                    z2 = false;
                }
                if (z2 == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* renamed from: b */
        private final boolean m7317b(String str, String str2) {
            boolean s;
            if (C9971q.m14638b(str, str2)) {
                return true;
            }
            s = C12718u.m5733s(str, str2, false, 2, null);
            if (!s || str.charAt((str.length() - str2.length()) - 1) != '.' || C12729c.m5612f(str)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private final String m7313f(String str) {
            boolean s;
            String p0;
            s = C12718u.m5733s(str, ".", false, 2, null);
            if (!s) {
                p0 = C12719v.m5670p0(str, ".");
                String e = C12727a.m5644e(p0);
                if (e != null) {
                    return e;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: g */
        private final long m7312g(String str, int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int Z;
            int a = m7318a(str, i, i2, false);
            Matcher matcher = C12231k.f27519m.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (a < i2) {
                int a2 = m7318a(str, a + 1, i2, true);
                matcher.region(a, a2);
                if (i4 == -1 && matcher.usePattern(C12231k.f27519m).matches()) {
                    String group = matcher.group(1);
                    C9971q.m14634f(group, "matcher.group(1)");
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C9971q.m14634f(group2, "matcher.group(2)");
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C9971q.m14634f(group3, "matcher.group(3)");
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(C12231k.f27518l).matches()) {
                    String group4 = matcher.group(1);
                    C9971q.m14634f(group4, "matcher.group(1)");
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(C12231k.f27517k).matches()) {
                    String group5 = matcher.group(1);
                    C9971q.m14634f(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C9971q.m14634f(locale, "Locale.US");
                    if (group5 != null) {
                        String lowerCase = group5.toLowerCase(locale);
                        C9971q.m14634f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern = C12231k.f27517k.pattern();
                        C9971q.m14634f(pattern, "MONTH_PATTERN.pattern()");
                        Z = C12719v.m5686Z(pattern, lowerCase, 0, false, 6, null);
                        i6 = Z / 4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (i3 == -1 && matcher.usePattern(C12231k.f27516j).matches()) {
                    String group6 = matcher.group(1);
                    C9971q.m14634f(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
                a = m7318a(str, a2 + 1, i2, false);
            }
            if (70 <= i3 && 99 >= i3) {
                i3 += 1900;
            }
            if (i3 >= 0 && 69 >= i3) {
                i3 += 2000;
            }
            if (i3 >= 1601) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i6 != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (1 <= i5 && 31 >= i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (i4 >= 0 && 23 >= i4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            if (i7 >= 0 && 59 >= i7) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                if (i8 >= 0 && 59 >= i8) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(C12729c.f28587f);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i3);
                                    gregorianCalendar.set(2, i6 - 1);
                                    gregorianCalendar.set(5, i5);
                                    gregorianCalendar.set(11, i4);
                                    gregorianCalendar.set(12, i7);
                                    gregorianCalendar.set(13, i8);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: h */
        private final long m7311h(String str) {
            boolean H;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new Regex("-?\\d+").m14583g(str)) {
                    H = C12718u.m5736H(str, "-", false, 2, null);
                    if (H) {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
                throw e;
            }
        }

        /* renamed from: c */
        public final C12231k m7316c(HttpUrl url, String setCookie) {
            C9971q.m14633g(url, "url");
            C9971q.m14633g(setCookie, "setCookie");
            return m7315d(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x0102, code lost:
            if (r1 > 253402300799999L) goto L_0x010a;
         */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x015a  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p307qj.C12231k m7315d(long r26, okhttp3.HttpUrl r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 379
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p307qj.C12231k.C12233b.m7315d(long, okhttp3.HttpUrl, java.lang.String):qj.k");
        }

        /* renamed from: e */
        public final List<C12231k> m7314e(HttpUrl url, Headers headers) {
            List<C12231k> i;
            C9971q.m14633g(url, "url");
            C9971q.m14633g(headers, "headers");
            List<String> p = headers.m10066p("Set-Cookie");
            int size = p.size();
            ArrayList arrayList = null;
            for (int i2 = 0; i2 < size; i2++) {
                C12231k c = m7316c(url, p.get(i2));
                if (c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c);
                }
            }
            if (arrayList != null) {
                List<C12231k> unmodifiableList = Collections.unmodifiableList(arrayList);
                C9971q.m14634f(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            i = C9906j.m14820i();
            return i;
        }
    }

    private C12231k(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f27521a = str;
        this.f27522b = str2;
        this.f27523c = j;
        this.f27524d = str3;
        this.f27525e = str4;
        this.f27526f = z;
        this.f27527g = z2;
        this.f27528h = z3;
        this.f27529i = z4;
    }

    /* renamed from: e */
    public final String m7326e() {
        return this.f27521a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12231k) {
            C12231k kVar = (C12231k) obj;
            if (C9971q.m14638b(kVar.f27521a, this.f27521a) && C9971q.m14638b(kVar.f27522b, this.f27522b) && kVar.f27523c == this.f27523c && C9971q.m14638b(kVar.f27524d, this.f27524d) && C9971q.m14638b(kVar.f27525e, this.f27525e) && kVar.f27526f == this.f27526f && kVar.f27527g == this.f27527g && kVar.f27528h == this.f27528h && kVar.f27529i == this.f27529i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String m7325f(boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27521a);
        sb2.append('=');
        sb2.append(this.f27522b);
        if (this.f27528h) {
            if (this.f27523c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(C13893c.m2375b(new Date(this.f27523c)));
            }
        }
        if (!this.f27529i) {
            sb2.append("; domain=");
            if (z) {
                sb2.append(".");
            }
            sb2.append(this.f27524d);
        }
        sb2.append("; path=");
        sb2.append(this.f27525e);
        if (this.f27526f) {
            sb2.append("; secure");
        }
        if (this.f27527g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "toString()");
        return sb3;
    }

    /* renamed from: g */
    public final String m7324g() {
        return this.f27522b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f27521a.hashCode()) * 31) + this.f27522b.hashCode()) * 31) + C4081a.m32873a(this.f27523c)) * 31) + this.f27524d.hashCode()) * 31) + this.f27525e.hashCode()) * 31) + C10286l.m13693a(this.f27526f)) * 31) + C10286l.m13693a(this.f27527g)) * 31) + C10286l.m13693a(this.f27528h)) * 31) + C10286l.m13693a(this.f27529i);
    }

    public String toString() {
        return m7325f(false);
    }

    public /* synthetic */ C12231k(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }
}
