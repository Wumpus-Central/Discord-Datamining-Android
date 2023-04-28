package p250nj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.EnumC11039x0;
import net.time4j.base.AbstractC10814d;
import p161ij.AbstractC8684y;

/* renamed from: nj.i */
/* loaded from: classes8.dex */
public class C11162i implements AbstractC8684y {

    /* renamed from: a */
    private final String f24840a;

    /* renamed from: b */
    private final Set<String> f24841b;

    /* renamed from: c */
    private final Map<String, EnumC11039x0> f24842c;

    /* renamed from: d */
    private final Map<String, EnumC11039x0> f24843d;

    /* renamed from: e */
    private final Map<String, EnumC11039x0> f24844e;

    public C11162i() {
        HashMap hashMap;
        EnumC11039x0 x0Var;
        String str;
        URI f = AbstractC10814d.m12187c().mo12184f("i18n", C11162i.class, "data/week.data");
        InputStream e = AbstractC10814d.m12187c().mo12185e(f, true);
        if (e == null) {
            try {
                e = AbstractC10814d.m12187c().m12186d(C11162i.class, "data/week.data", true);
            } catch (IOException unused) {
            }
        }
        if (e != null) {
            this.f24840a = "@" + f;
            HashSet hashSet = new HashSet();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e, "US-ASCII"));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            this.f24841b = Collections.unmodifiableSet(hashSet);
                            this.f24842c = Collections.unmodifiableMap(hashMap2);
                            this.f24843d = Collections.unmodifiableMap(hashMap3);
                            this.f24844e = Collections.unmodifiableMap(hashMap4);
                            try {
                                e.close();
                                return;
                            } catch (IOException e2) {
                                e2.printStackTrace(System.err);
                                return;
                            }
                        } else if (!readLine.startsWith("#")) {
                            int indexOf = readLine.indexOf(61);
                            int i = 0;
                            String trim = readLine.substring(0, indexOf).trim();
                            String[] split = readLine.substring(indexOf + 1).split(" ");
                            if (trim.equals("minDays-4")) {
                                int length = split.length;
                                while (i < length) {
                                    String upperCase = split[i].trim().toUpperCase(Locale.US);
                                    if (!upperCase.isEmpty()) {
                                        hashSet.add(upperCase);
                                    }
                                    i++;
                                }
                            } else {
                                if (trim.startsWith("start-")) {
                                    str = trim.substring(6);
                                    x0Var = EnumC11039x0.SATURDAY;
                                    hashMap = hashMap3;
                                } else if (trim.startsWith("end-")) {
                                    str = trim.substring(4);
                                    x0Var = EnumC11039x0.SUNDAY;
                                    hashMap = hashMap4;
                                } else if (trim.startsWith("first-")) {
                                    str = trim.substring(6);
                                    x0Var = EnumC11039x0.MONDAY;
                                    hashMap = hashMap2;
                                } else {
                                    throw new IllegalStateException("Unexpected format: " + this.f24840a);
                                }
                                if (str.equals("sun")) {
                                    x0Var = EnumC11039x0.SUNDAY;
                                } else if (str.equals("sat")) {
                                    x0Var = EnumC11039x0.SATURDAY;
                                } else if (str.equals("fri")) {
                                    x0Var = EnumC11039x0.FRIDAY;
                                } else if (str.equals("thu")) {
                                    x0Var = EnumC11039x0.THURSDAY;
                                } else if (str.equals("wed")) {
                                    x0Var = EnumC11039x0.WEDNESDAY;
                                } else if (str.equals("tue")) {
                                    x0Var = EnumC11039x0.TUESDAY;
                                } else if (str.equals("mon")) {
                                    x0Var = EnumC11039x0.MONDAY;
                                }
                                int length2 = split.length;
                                while (i < length2) {
                                    String upperCase2 = split[i].trim().toUpperCase(Locale.US);
                                    if (!upperCase2.isEmpty()) {
                                        hashMap.put(upperCase2, x0Var);
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                } catch (UnsupportedEncodingException e3) {
                    throw new AssertionError(e3);
                } catch (Exception e4) {
                    throw new IllegalStateException("Unexpected format: " + this.f24840a, e4);
                }
            } catch (Throwable th2) {
                try {
                    e.close();
                } catch (IOException e5) {
                    e5.printStackTrace(System.err);
                }
                throw th2;
            }
        } else {
            this.f24840a = "@STATIC";
            this.f24841b = Collections.emptySet();
            this.f24842c = Collections.emptyMap();
            this.f24843d = Collections.emptyMap();
            this.f24844e = Collections.emptyMap();
            PrintStream printStream = System.err;
            printStream.println("Warning: File \"data/week.data\" not found.");
        }
    }

    @Override // p161ij.AbstractC8684y
    /* renamed from: a */
    public int mo10626a(Locale locale) {
        String country = locale.getCountry();
        EnumC11039x0 x0Var = EnumC11039x0.SUNDAY;
        if (this.f24844e.containsKey(country)) {
            x0Var = this.f24844e.get(country);
        }
        return x0Var.m11158b();
    }

    @Override // p161ij.AbstractC8684y
    /* renamed from: b */
    public int mo10625b(Locale locale) {
        if (this.f24841b.isEmpty()) {
            return new GregorianCalendar(locale).getMinimalDaysInFirstWeek();
        }
        String country = locale.getCountry();
        if ((!country.isEmpty() || !locale.getLanguage().isEmpty()) && !this.f24841b.contains(country)) {
            return 1;
        }
        return 4;
    }

    @Override // p161ij.AbstractC8684y
    /* renamed from: c */
    public int mo10624c(Locale locale) {
        String country = locale.getCountry();
        EnumC11039x0 x0Var = EnumC11039x0.SATURDAY;
        if (this.f24843d.containsKey(country)) {
            x0Var = this.f24843d.get(country);
        }
        return x0Var.m11158b();
    }

    @Override // p161ij.AbstractC8684y
    /* renamed from: d */
    public int mo10623d(Locale locale) {
        if (this.f24842c.isEmpty()) {
            int firstDayOfWeek = new GregorianCalendar(locale).getFirstDayOfWeek();
            if (firstDayOfWeek == 1) {
                return 7;
            }
            return firstDayOfWeek - 1;
        }
        String country = locale.getCountry();
        EnumC11039x0 x0Var = EnumC11039x0.MONDAY;
        if (this.f24842c.containsKey(country)) {
            x0Var = this.f24842c.get(country);
        }
        return x0Var.m11158b();
    }

    public String toString() {
        return getClass().getName() + this.f24840a;
    }
}
