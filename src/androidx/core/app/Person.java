package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class Person {

    /* renamed from: a */
    CharSequence f3156a;

    /* renamed from: b */
    IconCompat f3157b;

    /* renamed from: c */
    String f3158c;

    /* renamed from: d */
    String f3159d;

    /* renamed from: e */
    boolean f3160e;

    /* renamed from: f */
    boolean f3161f;

    /* renamed from: androidx.core.app.Person$a */
    /* loaded from: classes.dex */
    static class C2184a {
        /* renamed from: a */
        static Person m38394a(PersistableBundle persistableBundle) {
            return new C2186c().m38385f(persistableBundle.getString("name")).m38384g(persistableBundle.getString("uri")).m38386e(persistableBundle.getString("key")).m38389b(persistableBundle.getBoolean("isBot")).m38387d(persistableBundle.getBoolean("isImportant")).m38390a();
        }

        /* renamed from: b */
        static PersistableBundle m38393b(Person person) {
            String str;
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = person.f3156a;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            persistableBundle.putString("name", str);
            persistableBundle.putString("uri", person.f3158c);
            persistableBundle.putString("key", person.f3159d);
            persistableBundle.putBoolean("isBot", person.f3160e);
            persistableBundle.putBoolean("isImportant", person.f3161f);
            return persistableBundle;
        }
    }

    /* renamed from: androidx.core.app.Person$b */
    /* loaded from: classes.dex */
    static class C2185b {
        /* renamed from: a */
        static Person m38392a(android.app.Person person) {
            CharSequence name;
            Icon icon;
            IconCompat iconCompat;
            String uri;
            String key;
            boolean isBot;
            boolean isImportant;
            Icon icon2;
            C2186c cVar = new C2186c();
            name = person.getName();
            C2186c f = cVar.m38385f(name);
            icon = person.getIcon();
            if (icon != null) {
                icon2 = person.getIcon();
                iconCompat = IconCompat.m37880c(icon2);
            } else {
                iconCompat = null;
            }
            C2186c c = f.m38388c(iconCompat);
            uri = person.getUri();
            C2186c g = c.m38384g(uri);
            key = person.getKey();
            C2186c e = g.m38386e(key);
            isBot = person.isBot();
            C2186c b = e.m38389b(isBot);
            isImportant = person.isImportant();
            return b.m38387d(isImportant).m38390a();
        }

        /* renamed from: b */
        static android.app.Person m38391b(Person person) {
            Person.Builder name;
            Icon icon;
            Person.Builder icon2;
            Person.Builder uri;
            Person.Builder key;
            Person.Builder bot;
            Person.Builder important;
            android.app.Person build;
            name = new Person.Builder().setName(person.m38402e());
            if (person.m38404c() != null) {
                icon = person.m38404c().m37859x();
            } else {
                icon = null;
            }
            icon2 = name.setIcon(icon);
            uri = icon2.setUri(person.m38401f());
            key = uri.setKey(person.m38403d());
            bot = key.setBot(person.m38400g());
            important = bot.setImportant(person.m38399h());
            build = important.build();
            return build;
        }
    }

    /* renamed from: androidx.core.app.Person$c */
    /* loaded from: classes.dex */
    public static class C2186c {

        /* renamed from: a */
        CharSequence f3162a;

        /* renamed from: b */
        IconCompat f3163b;

        /* renamed from: c */
        String f3164c;

        /* renamed from: d */
        String f3165d;

        /* renamed from: e */
        boolean f3166e;

        /* renamed from: f */
        boolean f3167f;

        /* renamed from: a */
        public Person m38390a() {
            return new Person(this);
        }

        /* renamed from: b */
        public C2186c m38389b(boolean z) {
            this.f3166e = z;
            return this;
        }

        /* renamed from: c */
        public C2186c m38388c(IconCompat iconCompat) {
            this.f3163b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public C2186c m38387d(boolean z) {
            this.f3167f = z;
            return this;
        }

        /* renamed from: e */
        public C2186c m38386e(String str) {
            this.f3165d = str;
            return this;
        }

        /* renamed from: f */
        public C2186c m38385f(CharSequence charSequence) {
            this.f3162a = charSequence;
            return this;
        }

        /* renamed from: g */
        public C2186c m38384g(String str) {
            this.f3164c = str;
            return this;
        }
    }

    Person(C2186c cVar) {
        this.f3156a = cVar.f3162a;
        this.f3157b = cVar.f3163b;
        this.f3158c = cVar.f3164c;
        this.f3159d = cVar.f3165d;
        this.f3160e = cVar.f3166e;
        this.f3161f = cVar.f3167f;
    }

    /* renamed from: a */
    public static Person m38406a(android.app.Person person) {
        return C2185b.m38392a(person);
    }

    /* renamed from: b */
    public static Person m38405b(Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        C2186c f = new C2186c().m38385f(bundle.getCharSequence("name"));
        if (bundle2 != null) {
            iconCompat = IconCompat.m37881b(bundle2);
        } else {
            iconCompat = null;
        }
        return f.m38388c(iconCompat).m38384g(bundle.getString("uri")).m38386e(bundle.getString("key")).m38389b(bundle.getBoolean("isBot")).m38387d(bundle.getBoolean("isImportant")).m38390a();
    }

    /* renamed from: c */
    public IconCompat m38404c() {
        return this.f3157b;
    }

    /* renamed from: d */
    public String m38403d() {
        return this.f3159d;
    }

    /* renamed from: e */
    public CharSequence m38402e() {
        return this.f3156a;
    }

    /* renamed from: f */
    public String m38401f() {
        return this.f3158c;
    }

    /* renamed from: g */
    public boolean m38400g() {
        return this.f3160e;
    }

    /* renamed from: h */
    public boolean m38399h() {
        return this.f3161f;
    }

    /* renamed from: i */
    public String m38398i() {
        String str = this.f3158c;
        if (str != null) {
            return str;
        }
        if (this.f3156a == null) {
            return "";
        }
        return "name:" + ((Object) this.f3156a);
    }

    /* renamed from: j */
    public android.app.Person m38397j() {
        return C2185b.m38391b(this);
    }

    /* renamed from: k */
    public Bundle m38396k() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f3156a);
        IconCompat iconCompat = this.f3157b;
        if (iconCompat != null) {
            bundle = iconCompat.m37860w();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f3158c);
        bundle2.putString("key", this.f3159d);
        bundle2.putBoolean("isBot", this.f3160e);
        bundle2.putBoolean("isImportant", this.f3161f);
        return bundle2;
    }

    /* renamed from: l */
    public PersistableBundle m38395l() {
        return C2184a.m38393b(this);
    }
}
