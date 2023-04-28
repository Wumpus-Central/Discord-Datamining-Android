package p321rc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p163j$.time.ZoneOffset;
import p163j$.time.format.DateTimeFormatter;
import p163j$.util.DateRetargetClass;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rc.l */
/* loaded from: classes3.dex */
public class C12566l {

    /* renamed from: a */
    private final SharedPreferences f28255a;

    public C12566l(Context context, String str) {
        this.f28255a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    private synchronized void m6547a() {
        long j = this.f28255a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f28255a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f28255a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f28255a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: d */
    private synchronized String m6544d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: e */
    private synchronized String m6543e(String str) {
        for (Map.Entry<String, ?> entry : this.f28255a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: h */
    private synchronized void m6540h(String str) {
        String e = m6543e(str);
        if (e != null) {
            HashSet hashSet = new HashSet(this.f28255a.getStringSet(e, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f28255a.edit().remove(e).commit();
            } else {
                this.f28255a.edit().putStringSet(e, hashSet).commit();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m6546b() {
        SharedPreferences.Editor edit = this.f28255a.edit();
        for (Map.Entry<String, ?> entry : this.f28255a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List<AbstractC12567m> m6545c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f28255a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(AbstractC12567m.m6535a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        m6536l(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: f */
    synchronized boolean m6542f(long j, long j2) {
        return m6544d(j).equals(m6544d(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void m6541g() {
        String d = m6544d(System.currentTimeMillis());
        this.f28255a.edit().putString("last-used-date", d).commit();
        m6540h(d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean m6539i(long j) {
        return m6538j("fire-global", j);
    }

    /* renamed from: j */
    synchronized boolean m6538j(String str, long j) {
        if (!this.f28255a.contains(str)) {
            this.f28255a.edit().putLong(str, j).commit();
            return true;
        } else if (m6542f(this.f28255a.getLong(str, -1L), j)) {
            return false;
        } else {
            this.f28255a.edit().putLong(str, j).commit();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void m6537k(long j, String str) {
        String d = m6544d(j);
        if (!this.f28255a.getString("last-used-date", "").equals(d)) {
            long j2 = this.f28255a.getLong("fire-count", 0L);
            if (j2 + 1 == 30) {
                m6547a();
                j2 = this.f28255a.getLong("fire-count", 0L);
            }
            HashSet hashSet = new HashSet(this.f28255a.getStringSet(str, new HashSet()));
            hashSet.add(d);
            this.f28255a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", d).commit();
        }
    }

    /* renamed from: l */
    synchronized void m6536l(long j) {
        this.f28255a.edit().putLong("fire-global", j).commit();
    }
}
