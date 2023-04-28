package p008a7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: a7.t0 */
/* loaded from: classes7.dex */
final class C1323t0 extends SQLiteOpenHelper {

    /* renamed from: m */
    private static final String f205m = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: n */
    static int f206n = 5;

    /* renamed from: o */
    private static final AbstractC1324a f207o;

    /* renamed from: p */
    private static final AbstractC1324a f208p;

    /* renamed from: q */
    private static final AbstractC1324a f209q;

    /* renamed from: r */
    private static final AbstractC1324a f210r;

    /* renamed from: s */
    private static final AbstractC1324a f211s;

    /* renamed from: t */
    private static final List<AbstractC1324a> f212t;

    /* renamed from: k */
    private final int f213k;

    /* renamed from: l */
    private boolean f214l = false;

    /* renamed from: a7.t0$a */
    /* loaded from: classes7.dex */
    public interface AbstractC1324a {
        /* renamed from: a */
        void mo41353a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        AbstractC1324a o0Var = new AbstractC1324a() { // from class: a7.o0
            @Override // p008a7.C1323t0.AbstractC1324a
            /* renamed from: a */
            public final void mo41353a(SQLiteDatabase sQLiteDatabase) {
                C1323t0.m41358p(sQLiteDatabase);
            }
        };
        f207o = o0Var;
        AbstractC1324a p0Var = new AbstractC1324a() { // from class: a7.p0
            @Override // p008a7.C1323t0.AbstractC1324a
            /* renamed from: a */
            public final void mo41353a(SQLiteDatabase sQLiteDatabase) {
                C1323t0.m41357r(sQLiteDatabase);
            }
        };
        f208p = p0Var;
        AbstractC1324a q0Var = new AbstractC1324a() { // from class: a7.q0
            @Override // p008a7.C1323t0.AbstractC1324a
            /* renamed from: a */
            public final void mo41353a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f209q = q0Var;
        AbstractC1324a r0Var = new AbstractC1324a() { // from class: a7.r0
            @Override // p008a7.C1323t0.AbstractC1324a
            /* renamed from: a */
            public final void mo41353a(SQLiteDatabase sQLiteDatabase) {
                C1323t0.m41355t(sQLiteDatabase);
            }
        };
        f210r = r0Var;
        AbstractC1324a s0Var = new AbstractC1324a() { // from class: a7.s0
            @Override // p008a7.C1323t0.AbstractC1324a
            /* renamed from: a */
            public final void mo41353a(SQLiteDatabase sQLiteDatabase) {
                C1323t0.m41354z(sQLiteDatabase);
            }
        };
        f211s = s0Var;
        f212t = Arrays.asList(o0Var, p0Var, q0Var, r0Var, s0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1323t0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f213k = i;
    }

    /* renamed from: C */
    private void m41366C(SQLiteDatabase sQLiteDatabase, int i) {
        m41359n(sQLiteDatabase);
        m41365H(sQLiteDatabase, 0, i);
    }

    /* renamed from: H */
    private void m41365H(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<AbstractC1324a> list = f212t;
        if (i2 <= list.size()) {
            while (i < i2) {
                f212t.get(i).mo41353a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* renamed from: n */
    private void m41359n(SQLiteDatabase sQLiteDatabase) {
        if (!this.f214l) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m41358p(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m41357r(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m41355t(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static /* synthetic */ void m41354z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f205m);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f214l = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m41366C(sQLiteDatabase, this.f213k);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m41366C(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m41359n(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m41359n(sQLiteDatabase);
        m41365H(sQLiteDatabase, i, i2);
    }
}
