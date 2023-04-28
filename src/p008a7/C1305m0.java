package p008a7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p027b7.AbstractC3394b;
import p027b7.C3393a;
import p040c7.AbstractC3770a;
import p060d7.C6400a;
import p279p6.C11572b;
import p315r6.AbstractC12420i;
import p315r6.AbstractC12430o;
import p315r6.C12419h;
import p347t6.AbstractC12970a;
import p381v6.C13439a;
import p381v6.C13440b;
import p381v6.C13442c;
import p381v6.C13445d;
import p381v6.C13447e;
import p381v6.C13449f;
import p397w6.C13750a;

/* renamed from: a7.m0 */
/* loaded from: classes7.dex */
public class C1305m0 implements AbstractC1282d, AbstractC3394b, AbstractC1280c {

    /* renamed from: p */
    private static final C11572b f178p = C11572b.m9324b("proto");

    /* renamed from: k */
    private final C1323t0 f179k;

    /* renamed from: l */
    private final AbstractC3770a f180l;

    /* renamed from: m */
    private final AbstractC3770a f181m;

    /* renamed from: n */
    private final AbstractC1284e f182n;

    /* renamed from: o */
    private final AbstractC12970a<String> f183o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a7.m0$b */
    /* loaded from: classes7.dex */
    public interface AbstractC1307b<T, U> {
        U apply(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a7.m0$c */
    /* loaded from: classes7.dex */
    public static class C1308c {

        /* renamed from: a */
        final String f184a;

        /* renamed from: b */
        final String f185b;

        private C1308c(String str, String str2) {
            this.f184a = str;
            this.f185b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a7.m0$d */
    /* loaded from: classes7.dex */
    public interface AbstractC1309d<T> {
        /* renamed from: a */
        T mo41349a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1305m0(AbstractC3770a aVar, AbstractC3770a aVar2, AbstractC1284e eVar, C1323t0 t0Var, AbstractC12970a<String> aVar3) {
        this.f179k = t0Var;
        this.f180l = aVar;
        this.f181m = aVar2;
        this.f182n = eVar;
        this.f183o = aVar3;
    }

    /* renamed from: A1 */
    private void m41453A1(C13439a.C0436a aVar, Map<String, List<C13442c>> map) {
        for (Map.Entry<String, List<C13442c>> entry : map.entrySet()) {
            aVar.m3684a(C13445d.m3667c().m3664c(entry.getKey()).m3665b(entry.getValue()).m3666a());
        }
    }

    /* renamed from: B1 */
    private byte[] m41452B1(long j) {
        return (byte[]) m41444F1(m41433P0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new AbstractC1307b() { // from class: a7.a0
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                byte[] q1;
                q1 = C1305m0.m41388q1((Cursor) obj);
                return q1;
            }
        });
    }

    /* renamed from: C1 */
    private <T> T m41449C1(AbstractC1309d<T> dVar, AbstractC1307b<Throwable, T> bVar) {
        long a = this.f181m.mo33601a();
        while (true) {
            try {
                return dVar.mo41349a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f181m.mo33601a() >= this.f182n.mo41487b() + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: D1 */
    private static C11572b m41447D1(String str) {
        if (str == null) {
            return f178p;
        }
        return C11572b.m9324b(str);
    }

    /* renamed from: E1 */
    private static String m41446E1(Iterable<AbstractC1300k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC1300k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().mo41455c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: F1 */
    static <T> T m41444F1(Cursor cursor, AbstractC1307b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: L0 */
    private C13442c.EnumC13444b m41437L0(int i) {
        C13442c.EnumC13444b bVar = C13442c.EnumC13444b.REASON_UNKNOWN;
        if (i == bVar.getNumber()) {
            return bVar;
        }
        C13442c.EnumC13444b bVar2 = C13442c.EnumC13444b.MESSAGE_TOO_OLD;
        if (i == bVar2.getNumber()) {
            return bVar2;
        }
        C13442c.EnumC13444b bVar3 = C13442c.EnumC13444b.CACHE_FULL;
        if (i == bVar3.getNumber()) {
            return bVar3;
        }
        C13442c.EnumC13444b bVar4 = C13442c.EnumC13444b.PAYLOAD_TOO_BIG;
        if (i == bVar4.getNumber()) {
            return bVar4;
        }
        C13442c.EnumC13444b bVar5 = C13442c.EnumC13444b.MAX_RETRIES_REACHED;
        if (i == bVar5.getNumber()) {
            return bVar5;
        }
        C13442c.EnumC13444b bVar6 = C13442c.EnumC13444b.INVALID_PAYLOD;
        if (i == bVar6.getNumber()) {
            return bVar6;
        }
        C13442c.EnumC13444b bVar7 = C13442c.EnumC13444b.SERVER_ERROR;
        if (i == bVar7.getNumber()) {
            return bVar7;
        }
        C13750a.m2814a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    /* renamed from: M0 */
    private void m41436M0(final SQLiteDatabase sQLiteDatabase) {
        m41449C1(new AbstractC1309d() { // from class: a7.g0
            @Override // p008a7.C1305m0.AbstractC1309d
            /* renamed from: a */
            public final Object mo41349a() {
                Object beginTransaction;
                beginTransaction = sQLiteDatabase.beginTransaction();
                return beginTransaction;
            }
        }, new AbstractC1307b() { // from class: a7.h0
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Object b1;
                b1 = C1305m0.m41413b1((Throwable) obj);
                return b1;
            }
        });
    }

    /* renamed from: N0 */
    private long m41435N0(SQLiteDatabase sQLiteDatabase, AbstractC12430o oVar) {
        Long U0 = m41424U0(sQLiteDatabase, oVar);
        if (U0 != null) {
            return U0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.mo6801b());
        contentValues.put("priority", Integer.valueOf(C6400a.m25618a(oVar.mo6799d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.mo6800c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.mo6800c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: Q0 */
    private C13440b m41431Q0() {
        return C13440b.m3678b().m3676b(C13447e.m3661c().m3659b(m41434O0()).m3658c(AbstractC1284e.f162a.mo41483f()).m3660a()).m3677a();
    }

    /* renamed from: R0 */
    private long m41429R0() {
        return m41433P0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: S0 */
    private long m41427S0() {
        return m41433P0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: T0 */
    private C13449f m41426T0() {
        final long a = this.f180l.mo33601a();
        return (C13449f) m41423V0(new AbstractC1307b() { // from class: a7.c0
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                C13449f f1;
                f1 = C1305m0.m41407f1(a, (SQLiteDatabase) obj);
                return f1;
            }
        });
    }

    /* renamed from: U0 */
    private Long m41424U0(SQLiteDatabase sQLiteDatabase, AbstractC12430o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.mo6801b(), String.valueOf(C6400a.m25618a(oVar.mo6799d()))));
        if (oVar.mo6800c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.mo6800c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m41444F1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new AbstractC1307b() { // from class: a7.z
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Long g1;
                g1 = C1305m0.m41405g1((Cursor) obj);
                return g1;
            }
        });
    }

    /* renamed from: W0 */
    private boolean m41422W0() {
        if (m41429R0() * m41427S0() >= this.f182n.mo41483f()) {
            return true;
        }
        return false;
    }

    /* renamed from: X0 */
    private List<AbstractC1300k> m41421X0(List<AbstractC1300k> list, Map<Long, Set<C1308c>> map) {
        ListIterator<AbstractC1300k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC1300k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo41455c()))) {
                AbstractC12420i.AbstractC12421a l = next.mo41456b().m6834l();
                for (C1308c cVar : map.get(Long.valueOf(next.mo41455c()))) {
                    l.m6831c(cVar.f184a, cVar.f185b);
                }
                listIterator.set(AbstractC1300k.m41457a(next.mo41455c(), next.mo41454d(), l.mo6830d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ Object m41419Y0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo41406g(i, C13442c.EnumC13444b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public /* synthetic */ Integer m41417Z0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m41444F1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new AbstractC1307b() { // from class: a7.r
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Object Y0;
                Y0 = C1305m0.this.m41419Y0((Cursor) obj);
                return Y0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public static /* synthetic */ Object m41413b1(Throwable th2) {
        throw new C3393a("Timed out while trying to acquire the lock.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public static /* synthetic */ SQLiteDatabase m41412c1(Throwable th2) {
        throw new C3393a("Timed out while trying to open db.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public static /* synthetic */ Long m41411d1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public static /* synthetic */ C13449f m41409e1(long j, Cursor cursor) {
        cursor.moveToNext();
        return C13449f.m3655c().m3652c(cursor.getLong(0)).m3653b(j).m3654a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f1 */
    public static /* synthetic */ C13449f m41407f1(final long j, SQLiteDatabase sQLiteDatabase) {
        return (C13449f) m41444F1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new AbstractC1307b() { // from class: a7.d0
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                C13449f e1;
                e1 = C1305m0.m41409e1(j, (Cursor) obj);
                return e1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public static /* synthetic */ Long m41405g1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ Boolean m41404h1(AbstractC12430o oVar, SQLiteDatabase sQLiteDatabase) {
        Long U0 = m41424U0(sQLiteDatabase, oVar);
        if (U0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m41444F1(m41433P0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{U0.toString()}), new AbstractC1307b() { // from class: a7.y
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public static /* synthetic */ List m41402i1(SQLiteDatabase sQLiteDatabase) {
        return (List) m41444F1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new AbstractC1307b() { // from class: a7.j0
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                List j1;
                j1 = C1305m0.m41400j1((Cursor) obj);
                return j1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public static /* synthetic */ List m41400j1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC12430o.m6802a().mo6795b(cursor.getString(1)).mo6793d(C6400a.m25617b(cursor.getInt(2))).mo6794c(m41370z1(cursor.getString(3))).mo6796a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ List m41399k1(AbstractC12430o oVar, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC1300k> x1 = m41375x1(sQLiteDatabase, oVar);
        return m41421X0(x1, m41373y1(sQLiteDatabase, x1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ C13439a m41397l1(Map map, C13439a.C0436a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C13442c.EnumC13444b L0 = m41437L0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C13442c.m3673c().m3670c(L0).m3671b(j).m3672a());
        }
        m41453A1(aVar, map);
        aVar.m3680e(m41426T0());
        aVar.m3681d(m41431Q0());
        aVar.m3682c(this.f183o.get());
        return aVar.m3683b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ C13439a m41395m1(String str, final Map map, final C13439a.C0436a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C13439a) m41444F1(sQLiteDatabase.rawQuery(str, new String[0]), new AbstractC1307b() { // from class: a7.b0
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                C13439a l1;
                l1 = C1305m0.this.m41397l1(map, aVar, (Cursor) obj);
                return l1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ Object m41393n1(List list, AbstractC12430o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            AbstractC12420i.AbstractC12421a k = AbstractC12420i.m6845a().mo6824j(cursor.getString(1)).mo6825i(cursor.getLong(2)).mo6823k(cursor.getLong(3));
            if (z) {
                k.mo6826h(new C12419h(m41447D1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.mo6826h(new C12419h(m41447D1(cursor.getString(4)), m41452B1(j)));
            }
            if (!cursor.isNull(6)) {
                k.mo6827g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC1300k.m41457a(j, oVar, k.mo6830d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static /* synthetic */ Object m41392o1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C1308c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ Long m41390p1(AbstractC12420i iVar, AbstractC12430o oVar, SQLiteDatabase sQLiteDatabase) {
        boolean z;
        byte[] bArr;
        if (m41422W0()) {
            mo41406g(1L, C13442c.EnumC13444b.CACHE_FULL, iVar.mo6836j());
            return -1L;
        }
        long N0 = m41435N0(sQLiteDatabase, oVar);
        int e = this.f182n.mo41484e();
        byte[] a = iVar.mo6841e().m6847a();
        if (a.length <= e) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(N0));
        contentValues.put("transport_name", iVar.mo6836j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.mo6840f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.mo6835k()));
        contentValues.put("payload_encoding", iVar.mo6841e().m6846b().m9325a());
        contentValues.put("code", iVar.mo6842d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = a;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(a.length / e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.m6837i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static /* synthetic */ byte[] m41388q1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public /* synthetic */ Object m41386r1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo41406g(i, C13442c.EnumC13444b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public /* synthetic */ Object m41384s1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m41444F1(sQLiteDatabase.rawQuery(str2, null), new AbstractC1307b() { // from class: a7.x
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Object r1;
                r1 = C1305m0.this.m41386r1((Cursor) obj);
                return r1;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public static /* synthetic */ Boolean m41382t1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public static /* synthetic */ Object m41380u1(String str, C13442c.EnumC13444b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m41444F1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new AbstractC1307b() { // from class: a7.v
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Boolean t1;
                t1 = C1305m0.m41382t1((Cursor) obj);
                return t1;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public static /* synthetic */ Object m41379v1(long j, AbstractC12430o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.mo6801b(), String.valueOf(C6400a.m25618a(oVar.mo6799d()))}) < 1) {
            contentValues.put("backend_name", oVar.mo6801b());
            contentValues.put("priority", Integer.valueOf(C6400a.m25618a(oVar.mo6799d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public /* synthetic */ Object m41376w1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f180l.mo33601a()).execute();
        return null;
    }

    /* renamed from: x1 */
    private List<AbstractC1300k> m41375x1(SQLiteDatabase sQLiteDatabase, final AbstractC12430o oVar) {
        final ArrayList arrayList = new ArrayList();
        Long U0 = m41424U0(sQLiteDatabase, oVar);
        if (U0 == null) {
            return arrayList;
        }
        m41444F1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{U0.toString()}, null, null, null, String.valueOf(this.f182n.mo41485d())), new AbstractC1307b() { // from class: a7.u
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Object n1;
                n1 = C1305m0.this.m41393n1(arrayList, oVar, (Cursor) obj);
                return n1;
            }
        });
        return arrayList;
    }

    /* renamed from: y1 */
    private Map<Long, Set<C1308c>> m41373y1(SQLiteDatabase sQLiteDatabase, List<AbstractC1300k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb2.append(list.get(i).mo41455c());
            if (i < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m41444F1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new AbstractC1307b() { // from class: a7.s
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Object o1;
                o1 = C1305m0.m41392o1(hashMap, (Cursor) obj);
                return o1;
            }
        });
        return hashMap;
    }

    /* renamed from: z1 */
    private static byte[] m41370z1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Override // p008a7.AbstractC1282d
    /* renamed from: C0 */
    public AbstractC1300k mo41450C0(final AbstractC12430o oVar, final AbstractC12420i iVar) {
        C13750a.m2813b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.mo6799d(), iVar.mo6836j(), oVar.mo6801b());
        long longValue = ((Long) m41423V0(new AbstractC1307b() { // from class: a7.l0
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Long p1;
                p1 = C1305m0.this.m41390p1(iVar, oVar, (SQLiteDatabase) obj);
                return p1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC1300k.m41457a(longValue, oVar, iVar);
    }

    @Override // p008a7.AbstractC1282d
    /* renamed from: D0 */
    public Iterable<AbstractC1300k> mo41448D0(final AbstractC12430o oVar) {
        return (Iterable) m41423V0(new AbstractC1307b() { // from class: a7.p
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                List k1;
                k1 = C1305m0.this.m41399k1(oVar, (SQLiteDatabase) obj);
                return k1;
            }
        });
    }

    /* renamed from: O0 */
    long m41434O0() {
        return m41429R0() * m41427S0();
    }

    /* renamed from: P0 */
    SQLiteDatabase m41433P0() {
        final C1323t0 t0Var = this.f179k;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) m41449C1(new AbstractC1309d() { // from class: a7.w
            @Override // p008a7.C1305m0.AbstractC1309d
            /* renamed from: a */
            public final Object mo41349a() {
                return C1323t0.this.getWritableDatabase();
            }
        }, new AbstractC1307b() { // from class: a7.e0
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                SQLiteDatabase c1;
                c1 = C1305m0.m41412c1((Throwable) obj);
                return c1;
            }
        });
    }

    /* renamed from: V0 */
    <T> T m41423V0(AbstractC1307b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase P0 = m41433P0();
        P0.beginTransaction();
        try {
            T apply = bVar.apply(P0);
            P0.setTransactionSuccessful();
            return apply;
        } finally {
            P0.endTransaction();
        }
    }

    @Override // p008a7.AbstractC1282d
    /* renamed from: Z */
    public void mo41418Z(Iterable<AbstractC1300k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m41446E1(iterable);
            m41423V0(new AbstractC1307b() { // from class: a7.q
                @Override // p008a7.C1305m0.AbstractC1307b
                public final Object apply(Object obj) {
                    Object s1;
                    s1 = C1305m0.this.m41384s1(str, r3, (SQLiteDatabase) obj);
                    return s1;
                }
            });
        }
    }

    @Override // p008a7.AbstractC1280c
    /* renamed from: b */
    public void mo41415b() {
        m41423V0(new AbstractC1307b() { // from class: a7.o
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Object w1;
                w1 = C1305m0.this.m41376w1((SQLiteDatabase) obj);
                return w1;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f179k.close();
    }

    @Override // p008a7.AbstractC1282d
    /* renamed from: e */
    public int mo41410e() {
        final long a = this.f180l.mo33601a() - this.f182n.mo41486c();
        return ((Integer) m41423V0(new AbstractC1307b() { // from class: a7.i0
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Integer Z0;
                Z0 = C1305m0.this.m41417Z0(a, (SQLiteDatabase) obj);
                return Z0;
            }
        })).intValue();
    }

    @Override // p008a7.AbstractC1280c
    /* renamed from: g */
    public void mo41406g(final long j, final C13442c.EnumC13444b bVar, final String str) {
        m41423V0(new AbstractC1307b() { // from class: a7.m
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Object u1;
                u1 = C1305m0.m41380u1(str, bVar, j, (SQLiteDatabase) obj);
                return u1;
            }
        });
    }

    @Override // p027b7.AbstractC3394b
    /* renamed from: h */
    public <T> T mo34521h(AbstractC3394b.AbstractC3395a<T> aVar) {
        SQLiteDatabase P0 = m41433P0();
        m41436M0(P0);
        try {
            T execute = aVar.execute();
            P0.setTransactionSuccessful();
            return execute;
        } finally {
            P0.endTransaction();
        }
    }

    @Override // p008a7.AbstractC1280c
    /* renamed from: i */
    public C13439a mo41403i() {
        final C13439a.C0436a e = C13439a.m3686e();
        final HashMap hashMap = new HashMap();
        return (C13439a) m41423V0(new AbstractC1307b() { // from class: a7.t
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                C13439a m1;
                m1 = C1305m0.this.m41395m1(r2, hashMap, e, (SQLiteDatabase) obj);
                return m1;
            }
        });
    }

    @Override // p008a7.AbstractC1282d
    /* renamed from: m */
    public void mo41396m(Iterable<AbstractC1300k> iterable) {
        if (iterable.iterator().hasNext()) {
            m41433P0().compileStatement("DELETE FROM events WHERE _id in " + m41446E1(iterable)).execute();
        }
    }

    @Override // p008a7.AbstractC1282d
    /* renamed from: q0 */
    public boolean mo41389q0(final AbstractC12430o oVar) {
        return ((Boolean) m41423V0(new AbstractC1307b() { // from class: a7.k0
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Boolean h1;
                h1 = C1305m0.this.m41404h1(oVar, (SQLiteDatabase) obj);
                return h1;
            }
        })).booleanValue();
    }

    @Override // p008a7.AbstractC1282d
    /* renamed from: u */
    public long mo41381u(AbstractC12430o oVar) {
        return ((Long) m41444F1(m41433P0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.mo6801b(), String.valueOf(C6400a.m25618a(oVar.mo6799d()))}), new AbstractC1307b() { // from class: a7.f0
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Long d1;
                d1 = C1305m0.m41411d1((Cursor) obj);
                return d1;
            }
        })).longValue();
    }

    @Override // p008a7.AbstractC1282d
    /* renamed from: w */
    public Iterable<AbstractC12430o> mo41378w() {
        return (Iterable) m41423V0(new AbstractC1307b() { // from class: a7.l
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                List i1;
                i1 = C1305m0.m41402i1((SQLiteDatabase) obj);
                return i1;
            }
        });
    }

    @Override // p008a7.AbstractC1282d
    /* renamed from: y0 */
    public void mo41374y0(final AbstractC12430o oVar, final long j) {
        m41423V0(new AbstractC1307b() { // from class: a7.n
            @Override // p008a7.C1305m0.AbstractC1307b
            public final Object apply(Object obj) {
                Object v1;
                v1 = C1305m0.m41379v1(j, oVar, (SQLiteDatabase) obj);
                return v1;
            }
        });
    }
}
