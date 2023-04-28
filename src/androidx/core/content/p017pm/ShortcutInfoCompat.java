package androidx.core.content.p017pm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.app.Person;
import androidx.core.content.C2348g;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p073e1.C6550a;

/* renamed from: androidx.core.content.pm.ShortcutInfoCompat */
/* loaded from: classes.dex */
public class ShortcutInfoCompat {

    /* renamed from: A */
    int f35642A;

    /* renamed from: a */
    Context f3236a;

    /* renamed from: b */
    String f3237b;

    /* renamed from: c */
    String f3238c;

    /* renamed from: d */
    Intent[] f3239d;

    /* renamed from: e */
    ComponentName f3240e;

    /* renamed from: f */
    CharSequence f3241f;

    /* renamed from: g */
    CharSequence f3242g;

    /* renamed from: h */
    CharSequence f3243h;

    /* renamed from: i */
    IconCompat f3244i;

    /* renamed from: j */
    boolean f3245j;

    /* renamed from: k */
    Person[] f3246k;

    /* renamed from: l */
    Set<String> f3247l;

    /* renamed from: m */
    C2348g f3248m;

    /* renamed from: n */
    boolean f3249n;

    /* renamed from: o */
    int f3250o;

    /* renamed from: p */
    PersistableBundle f3251p;

    /* renamed from: q */
    long f3252q;

    /* renamed from: r */
    UserHandle f3253r;

    /* renamed from: s */
    boolean f3254s;

    /* renamed from: t */
    boolean f3255t;

    /* renamed from: u */
    boolean f3256u;

    /* renamed from: v */
    boolean f3257v;

    /* renamed from: w */
    boolean f3258w;

    /* renamed from: x */
    boolean f3259x = true;

    /* renamed from: y */
    boolean f3260y;

    /* renamed from: z */
    int f3261z;

    ShortcutInfoCompat() {
    }

    /* renamed from: a */
    private PersistableBundle m38097a() {
        if (this.f3251p == null) {
            this.f3251p = new PersistableBundle();
        }
        Person[] personArr = this.f3246k;
        if (personArr != null && personArr.length > 0) {
            this.f3251p.putInt("extraPersonCount", personArr.length);
            int i = 0;
            while (i < this.f3246k.length) {
                PersistableBundle persistableBundle = this.f3251p;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extraPerson_");
                int i2 = i + 1;
                sb2.append(i2);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f3246k[i].m38395l());
                i = i2;
            }
        }
        C2348g gVar = this.f3248m;
        if (gVar != null) {
            this.f3251p.putString("extraLocusId", gVar.m38105a());
        }
        this.f3251p.putBoolean("extraLongLived", this.f3249n);
        return this.f3251p;
    }

    /* renamed from: b */
    public ComponentName m38096b() {
        return this.f3240e;
    }

    /* renamed from: c */
    public Set<String> m38095c() {
        return this.f3247l;
    }

    /* renamed from: d */
    public CharSequence m38094d() {
        return this.f3243h;
    }

    /* renamed from: e */
    public IconCompat m38093e() {
        return this.f3244i;
    }

    /* renamed from: f */
    public String m38092f() {
        return this.f3237b;
    }

    /* renamed from: g */
    public Intent[] m38091g() {
        Intent[] intentArr = this.f3239d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    /* renamed from: h */
    public CharSequence m38090h() {
        return this.f3242g;
    }

    /* renamed from: i */
    public int m38089i() {
        return this.f3250o;
    }

    /* renamed from: j */
    public CharSequence m38088j() {
        return this.f3241f;
    }

    /* renamed from: k */
    public boolean m38087k(int i) {
        return (i & this.f35642A) != 0;
    }

    /* renamed from: l */
    public ShortcutInfo m38086l() {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        shortLabel = new ShortcutInfo.Builder(this.f3236a, this.f3237b).setShortLabel(this.f3241f);
        intents = shortLabel.setIntents(this.f3239d);
        IconCompat iconCompat = this.f3244i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m37858y(this.f3236a));
        }
        if (!TextUtils.isEmpty(this.f3242g)) {
            intents.setLongLabel(this.f3242g);
        }
        if (!TextUtils.isEmpty(this.f3243h)) {
            intents.setDisabledMessage(this.f3243h);
        }
        ComponentName componentName = this.f3240e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f3247l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f3250o);
        PersistableBundle persistableBundle = this.f3251p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Person[] personArr = this.f3246k;
            if (personArr != null && personArr.length > 0) {
                int length = personArr.length;
                android.app.Person[] personArr2 = new android.app.Person[length];
                for (int i = 0; i < length; i++) {
                    personArr2[i] = this.f3246k[i].m38397j();
                }
                intents.setPersons(personArr2);
            }
            C2348g gVar = this.f3248m;
            if (gVar != null) {
                intents.setLocusId(gVar.m38103c());
            }
            intents.setLongLived(this.f3249n);
        } else {
            intents.setExtras(m38097a());
        }
        build = intents.build();
        return build;
    }

    /* renamed from: androidx.core.content.pm.ShortcutInfoCompat$a */
    /* loaded from: classes.dex */
    public static class C2351a {

        /* renamed from: a */
        private final ShortcutInfoCompat f3262a;

        /* renamed from: b */
        private boolean f3263b;

        /* renamed from: c */
        private Set<String> f3264c;

        /* renamed from: d */
        private Map<String, Map<String, List<String>>> f3265d;

        /* renamed from: e */
        private Uri f3266e;

        public C2351a(Context context, String str) {
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.f3262a = shortcutInfoCompat;
            shortcutInfoCompat.f3236a = context;
            shortcutInfoCompat.f3237b = str;
        }

        /* renamed from: a */
        public ShortcutInfoCompat m38085a() {
            String[] strArr;
            if (!TextUtils.isEmpty(this.f3262a.f3241f)) {
                ShortcutInfoCompat shortcutInfoCompat = this.f3262a;
                Intent[] intentArr = shortcutInfoCompat.f3239d;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                if (this.f3263b) {
                    if (shortcutInfoCompat.f3248m == null) {
                        shortcutInfoCompat.f3248m = new C2348g(shortcutInfoCompat.f3237b);
                    }
                    this.f3262a.f3249n = true;
                }
                if (this.f3264c != null) {
                    ShortcutInfoCompat shortcutInfoCompat2 = this.f3262a;
                    if (shortcutInfoCompat2.f3247l == null) {
                        shortcutInfoCompat2.f3247l = new HashSet();
                    }
                    this.f3262a.f3247l.addAll(this.f3264c);
                }
                if (this.f3265d != null) {
                    ShortcutInfoCompat shortcutInfoCompat3 = this.f3262a;
                    if (shortcutInfoCompat3.f3251p == null) {
                        shortcutInfoCompat3.f3251p = new PersistableBundle();
                    }
                    for (String str : this.f3265d.keySet()) {
                        Map<String, List<String>> map = this.f3265d.get(str);
                        this.f3262a.f3251p.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                        for (String str2 : map.keySet()) {
                            List<String> list = map.get(str2);
                            PersistableBundle persistableBundle = this.f3262a.f3251p;
                            String str3 = str + "/" + str2;
                            if (list == null) {
                                strArr = new String[0];
                            } else {
                                strArr = (String[]) list.toArray(new String[0]);
                            }
                            persistableBundle.putStringArray(str3, strArr);
                        }
                    }
                }
                if (this.f3266e != null) {
                    ShortcutInfoCompat shortcutInfoCompat4 = this.f3262a;
                    if (shortcutInfoCompat4.f3251p == null) {
                        shortcutInfoCompat4.f3251p = new PersistableBundle();
                    }
                    this.f3262a.f3251p.putString("extraSliceUri", C6550a.m25323a(this.f3266e));
                }
                return this.f3262a;
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        /* renamed from: b */
        public C2351a m38084b(ComponentName componentName) {
            this.f3262a.f3240e = componentName;
            return this;
        }

        /* renamed from: c */
        public C2351a m38083c(Set<String> set) {
            this.f3262a.f3247l = set;
            return this;
        }

        /* renamed from: d */
        public C2351a m38082d(CharSequence charSequence) {
            this.f3262a.f3243h = charSequence;
            return this;
        }

        /* renamed from: e */
        public C2351a m38081e(IconCompat iconCompat) {
            this.f3262a.f3244i = iconCompat;
            return this;
        }

        /* renamed from: f */
        public C2351a m38080f(Intent intent) {
            return m38079g(new Intent[]{intent});
        }

        /* renamed from: g */
        public C2351a m38079g(Intent[] intentArr) {
            this.f3262a.f3239d = intentArr;
            return this;
        }

        /* renamed from: h */
        public C2351a m38078h(C2348g gVar) {
            this.f3262a.f3248m = gVar;
            return this;
        }

        /* renamed from: i */
        public C2351a m38077i(CharSequence charSequence) {
            this.f3262a.f3242g = charSequence;
            return this;
        }

        /* renamed from: j */
        public C2351a m38076j(boolean z) {
            this.f3262a.f3249n = z;
            return this;
        }

        /* renamed from: k */
        public C2351a m38075k(Person[] personArr) {
            this.f3262a.f3246k = personArr;
            return this;
        }

        /* renamed from: l */
        public C2351a m38074l(int i) {
            this.f3262a.f3250o = i;
            return this;
        }

        /* renamed from: m */
        public C2351a m38073m(CharSequence charSequence) {
            this.f3262a.f3241f = charSequence;
            return this;
        }

        public C2351a(ShortcutInfoCompat shortcutInfoCompat) {
            ShortcutInfoCompat shortcutInfoCompat2 = new ShortcutInfoCompat();
            this.f3262a = shortcutInfoCompat2;
            shortcutInfoCompat2.f3236a = shortcutInfoCompat.f3236a;
            shortcutInfoCompat2.f3237b = shortcutInfoCompat.f3237b;
            shortcutInfoCompat2.f3238c = shortcutInfoCompat.f3238c;
            Intent[] intentArr = shortcutInfoCompat.f3239d;
            shortcutInfoCompat2.f3239d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            shortcutInfoCompat2.f3240e = shortcutInfoCompat.f3240e;
            shortcutInfoCompat2.f3241f = shortcutInfoCompat.f3241f;
            shortcutInfoCompat2.f3242g = shortcutInfoCompat.f3242g;
            shortcutInfoCompat2.f3243h = shortcutInfoCompat.f3243h;
            shortcutInfoCompat2.f3261z = shortcutInfoCompat.f3261z;
            shortcutInfoCompat2.f3244i = shortcutInfoCompat.f3244i;
            shortcutInfoCompat2.f3245j = shortcutInfoCompat.f3245j;
            shortcutInfoCompat2.f3253r = shortcutInfoCompat.f3253r;
            shortcutInfoCompat2.f3252q = shortcutInfoCompat.f3252q;
            shortcutInfoCompat2.f3254s = shortcutInfoCompat.f3254s;
            shortcutInfoCompat2.f3255t = shortcutInfoCompat.f3255t;
            shortcutInfoCompat2.f3256u = shortcutInfoCompat.f3256u;
            shortcutInfoCompat2.f3257v = shortcutInfoCompat.f3257v;
            shortcutInfoCompat2.f3258w = shortcutInfoCompat.f3258w;
            shortcutInfoCompat2.f3259x = shortcutInfoCompat.f3259x;
            shortcutInfoCompat2.f3248m = shortcutInfoCompat.f3248m;
            shortcutInfoCompat2.f3249n = shortcutInfoCompat.f3249n;
            shortcutInfoCompat2.f3260y = shortcutInfoCompat.f3260y;
            shortcutInfoCompat2.f3250o = shortcutInfoCompat.f3250o;
            Person[] personArr = shortcutInfoCompat.f3246k;
            if (personArr != null) {
                shortcutInfoCompat2.f3246k = (Person[]) Arrays.copyOf(personArr, personArr.length);
            }
            if (shortcutInfoCompat.f3247l != null) {
                shortcutInfoCompat2.f3247l = new HashSet(shortcutInfoCompat.f3247l);
            }
            PersistableBundle persistableBundle = shortcutInfoCompat.f3251p;
            if (persistableBundle != null) {
                shortcutInfoCompat2.f3251p = persistableBundle;
            }
            shortcutInfoCompat2.f35642A = shortcutInfoCompat.f35642A;
        }
    }
}
