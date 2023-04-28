package com.google.android.exoplayer2.upstream.cache;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import cc.AbstractC3868g2;
import cc.AbstractC3960w0;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p100f9.AbstractC7094f;
import p100f9.C7093e;
import p100f9.C7095g;
import p100f9.C7096h;
import p119g9.C7510a;
import p119g9.C7513b;
import p119g9.C7517c0;
import p119g9.C7557q0;
import p131h7.AbstractC7932b;
import p131h7.C7931a;
import p131h7.C7934d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.upstream.cache.h */
/* loaded from: classes5.dex */
public class C5304h {

    /* renamed from: a */
    private final HashMap<String, C5302g> f9836a;

    /* renamed from: b */
    private final SparseArray<String> f9837b;

    /* renamed from: c */
    private final SparseBooleanArray f9838c;

    /* renamed from: d */
    private final SparseBooleanArray f9839d;

    /* renamed from: e */
    private AbstractC5307c f9840e;

    /* renamed from: f */
    private AbstractC5307c f9841f;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.h$a */
    /* loaded from: classes5.dex */
    private static final class C5305a implements AbstractC5307c {

        /* renamed from: e */
        private static final String[] f9842e = {"id", "key", "metadata"};

        /* renamed from: a */
        private final AbstractC7932b f9843a;

        /* renamed from: b */
        private final SparseArray<C5302g> f9844b = new SparseArray<>();

        /* renamed from: c */
        private String f9845c;

        /* renamed from: d */
        private String f9846d;

        public C5305a(AbstractC7932b bVar) {
            this.f9843a = bVar;
        }

        /* renamed from: i */
        private void m29520i(SQLiteDatabase sQLiteDatabase, C5302g gVar) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C5304h.m29521t(gVar.m29552c(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(gVar.f9829a));
            contentValues.put("key", gVar.f9830b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) C7510a.m22367e(this.f9846d), null, contentValues);
        }

        /* renamed from: j */
        private static void m29519j(AbstractC7932b bVar, String str) {
            try {
                String n = m29515n(str);
                SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                C7934d.m21123c(writableDatabase, 1, str);
                m29517l(writableDatabase, n);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new C7931a(e);
            }
        }

        /* renamed from: k */
        private void m29518k(SQLiteDatabase sQLiteDatabase, int i) {
            sQLiteDatabase.delete((String) C7510a.m22367e(this.f9846d), "id = ?", new String[]{Integer.toString(i)});
        }

        /* renamed from: l */
        private static void m29517l(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        /* renamed from: m */
        private Cursor m29516m() {
            return this.f9843a.getReadableDatabase().query((String) C7510a.m22367e(this.f9846d), f9842e, null, null, null, null, null);
        }

        /* renamed from: n */
        private static String m29515n(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        /* renamed from: o */
        private void m29514o(SQLiteDatabase sQLiteDatabase) {
            C7934d.m21122d(sQLiteDatabase, 1, (String) C7510a.m22367e(this.f9845c), 1);
            m29517l(sQLiteDatabase, (String) C7510a.m22367e(this.f9846d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f9846d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: a */
        public void mo29508a(C5302g gVar, boolean z) {
            if (z) {
                this.f9844b.delete(gVar.f9829a);
            } else {
                this.f9844b.put(gVar.f9829a, null);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: b */
        public boolean mo29507b() {
            if (C7934d.m21124b(this.f9843a.getReadableDatabase(), 1, (String) C7510a.m22367e(this.f9845c)) != -1) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: c */
        public void mo29506c(HashMap<String, C5302g> hashMap) {
            if (this.f9844b.size() != 0) {
                try {
                    SQLiteDatabase writableDatabase = this.f9843a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    for (int i = 0; i < this.f9844b.size(); i++) {
                        C5302g valueAt = this.f9844b.valueAt(i);
                        if (valueAt == null) {
                            m29518k(writableDatabase, this.f9844b.keyAt(i));
                        } else {
                            m29520i(writableDatabase, valueAt);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f9844b.clear();
                    writableDatabase.endTransaction();
                } catch (SQLException e) {
                    throw new C7931a(e);
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: d */
        public void mo29505d(long j) {
            String hexString = Long.toHexString(j);
            this.f9845c = hexString;
            this.f9846d = m29515n(hexString);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: e */
        public void mo29504e(HashMap<String, C5302g> hashMap) {
            try {
                SQLiteDatabase writableDatabase = this.f9843a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                m29514o(writableDatabase);
                for (C5302g gVar : hashMap.values()) {
                    m29520i(writableDatabase, gVar);
                }
                writableDatabase.setTransactionSuccessful();
                this.f9844b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new C7931a(e);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: f */
        public void mo29503f(C5302g gVar) {
            this.f9844b.put(gVar.f9829a, gVar);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: g */
        public void mo29502g(HashMap<String, C5302g> hashMap, SparseArray<String> sparseArray) {
            boolean z;
            if (this.f9844b.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            C7510a.m22366f(z);
            try {
                if (C7934d.m21124b(this.f9843a.getReadableDatabase(), 1, (String) C7510a.m22367e(this.f9845c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f9843a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    m29514o(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                }
                Cursor m = m29516m();
                while (m.moveToNext()) {
                    C5302g gVar = new C5302g(m.getInt(0), m.getString(1), C5304h.m29524q(new DataInputStream(new ByteArrayInputStream(m.getBlob(2)))));
                    hashMap.put(gVar.f9830b, gVar);
                    sparseArray.put(gVar.f9829a, gVar.f9830b);
                }
                m.close();
            } catch (SQLiteException e) {
                hashMap.clear();
                sparseArray.clear();
                throw new C7931a(e);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: h */
        public void mo29501h() {
            m29519j(this.f9843a, (String) C7510a.m22367e(this.f9845c));
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.cache.h$b */
    /* loaded from: classes5.dex */
    private static class C5306b implements AbstractC5307c {

        /* renamed from: a */
        private final boolean f9847a;

        /* renamed from: b */
        private final Cipher f9848b;

        /* renamed from: c */
        private final SecretKeySpec f9849c;

        /* renamed from: d */
        private final SecureRandom f9850d;

        /* renamed from: e */
        private final C7513b f9851e;

        /* renamed from: f */
        private boolean f9852f;

        /* renamed from: g */
        private C7517c0 f9853g;

        public C5306b(File file, byte[] bArr, boolean z) {
            boolean z2;
            SecretKeySpec secretKeySpec;
            Cipher cipher;
            boolean z3 = false;
            if (bArr != null || !z) {
                z2 = true;
            } else {
                z2 = false;
            }
            C7510a.m22366f(z2);
            SecureRandom secureRandom = null;
            if (bArr != null) {
                C7510a.m22371a(bArr.length == 16 ? true : z3);
                try {
                    cipher = C5304h.m29532i();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                C7510a.m22371a(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.f9847a = z;
            this.f9848b = cipher;
            this.f9849c = secretKeySpec;
            this.f9850d = z ? new SecureRandom() : secureRandom;
            this.f9851e = new C7513b(file);
        }

        /* renamed from: i */
        private int m29513i(C5302g gVar, int i) {
            int i2;
            int i3;
            int hashCode = (gVar.f9829a * 31) + gVar.f9830b.hashCode();
            if (i < 2) {
                long a = C7093e.m23429a(gVar.m29552c());
                i3 = hashCode * 31;
                i2 = (int) (a ^ (a >>> 32));
            } else {
                i3 = hashCode * 31;
                i2 = gVar.m29552c().hashCode();
            }
            return i3 + i2;
        }

        /* renamed from: j */
        private C5302g m29512j(int i, DataInputStream dataInputStream) {
            C7096h hVar;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i < 2) {
                long readLong = dataInputStream.readLong();
                C7095g gVar = new C7095g();
                C7095g.m23421g(gVar, readLong);
                hVar = C7096h.f15479c.m23415e(gVar);
            } else {
                hVar = C5304h.m29524q(dataInputStream);
            }
            return new C5302g(readInt, readUTF, hVar);
        }

        /* renamed from: k */
        private boolean m29511k(HashMap<String, C5302g> hashMap, SparseArray<String> sparseArray) {
            Throwable th2;
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            boolean z;
            Throwable e;
            if (!this.f9851e.m22357c()) {
                return true;
            }
            DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(this.f9851e.m22356d());
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                int readInt = dataInputStream.readInt();
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.f9848b == null) {
                            C7557q0.m22135o(dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            this.f9848b.init(2, (Key) C7557q0.m22145j(this.f9849c), new IvParameterSpec(bArr));
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f9848b));
                        } catch (InvalidAlgorithmParameterException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    } else if (this.f9847a) {
                        this.f9852f = true;
                    }
                    int readInt2 = dataInputStream.readInt();
                    int i = 0;
                    for (int i2 = 0; i2 < readInt2; i2++) {
                        C5302g j = m29512j(readInt, dataInputStream);
                        hashMap.put(j.f9830b, j);
                        sparseArray.put(j.f9829a, j.f9830b);
                        i += m29513i(j, readInt);
                    }
                    int readInt3 = dataInputStream.readInt();
                    if (dataInputStream.read() == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (readInt3 != i || !z) {
                        C7557q0.m22135o(dataInputStream);
                        return false;
                    }
                    C7557q0.m22135o(dataInputStream);
                    return true;
                }
                C7557q0.m22135o(dataInputStream);
                return false;
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    C7557q0.m22135o(dataInputStream2);
                }
                return false;
            } catch (Throwable th4) {
                th2 = th4;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    C7557q0.m22135o(dataInputStream2);
                }
                throw th2;
            }
        }

        /* renamed from: l */
        private void m29510l(C5302g gVar, DataOutputStream dataOutputStream) {
            dataOutputStream.writeInt(gVar.f9829a);
            dataOutputStream.writeUTF(gVar.f9830b);
            C5304h.m29521t(gVar.m29552c(), dataOutputStream);
        }

        /* renamed from: m */
        private void m29509m(HashMap<String, C5302g> hashMap) {
            Throwable th2;
            int i;
            Throwable e;
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream f = this.f9851e.m22354f();
                C7517c0 c0Var = this.f9853g;
                if (c0Var == null) {
                    this.f9853g = new C7517c0(f);
                } else {
                    c0Var.m22351b(f);
                }
                C7517c0 c0Var2 = this.f9853g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(c0Var2);
                try {
                    dataOutputStream2.writeInt(2);
                    int i2 = 0;
                    if (this.f9847a) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    dataOutputStream2.writeInt(i);
                    if (this.f9847a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) C7557q0.m22145j(this.f9850d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) C7557q0.m22145j(this.f9848b)).init(1, (Key) C7557q0.m22145j(this.f9849c), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(c0Var2, this.f9848b));
                        } catch (InvalidAlgorithmParameterException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(hashMap.size());
                    for (C5302g gVar : hashMap.values()) {
                        m29510l(gVar, dataOutputStream2);
                        i2 += m29513i(gVar, 2);
                    }
                    dataOutputStream2.writeInt(i2);
                    this.f9851e.m22358b(dataOutputStream2);
                    C7557q0.m22135o(null);
                } catch (Throwable th3) {
                    th2 = th3;
                    dataOutputStream = dataOutputStream2;
                    C7557q0.m22135o(dataOutputStream);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: a */
        public void mo29508a(C5302g gVar, boolean z) {
            this.f9852f = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: b */
        public boolean mo29507b() {
            return this.f9851e.m22357c();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: c */
        public void mo29506c(HashMap<String, C5302g> hashMap) {
            if (this.f9852f) {
                mo29504e(hashMap);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: d */
        public void mo29505d(long j) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: e */
        public void mo29504e(HashMap<String, C5302g> hashMap) {
            m29509m(hashMap);
            this.f9852f = false;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: f */
        public void mo29503f(C5302g gVar) {
            this.f9852f = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: g */
        public void mo29502g(HashMap<String, C5302g> hashMap, SparseArray<String> sparseArray) {
            C7510a.m22366f(!this.f9852f);
            if (!m29511k(hashMap, sparseArray)) {
                hashMap.clear();
                sparseArray.clear();
                this.f9851e.m22359a();
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C5304h.AbstractC5307c
        /* renamed from: h */
        public void mo29501h() {
            this.f9851e.m22359a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.upstream.cache.h$c */
    /* loaded from: classes5.dex */
    public interface AbstractC5307c {
        /* renamed from: a */
        void mo29508a(C5302g gVar, boolean z);

        /* renamed from: b */
        boolean mo29507b();

        /* renamed from: c */
        void mo29506c(HashMap<String, C5302g> hashMap);

        /* renamed from: d */
        void mo29505d(long j);

        /* renamed from: e */
        void mo29504e(HashMap<String, C5302g> hashMap);

        /* renamed from: f */
        void mo29503f(C5302g gVar);

        /* renamed from: g */
        void mo29502g(HashMap<String, C5302g> hashMap, SparseArray<String> sparseArray);

        /* renamed from: h */
        void mo29501h();
    }

    public C5304h(AbstractC7932b bVar, File file, byte[] bArr, boolean z, boolean z2) {
        boolean z3;
        C5305a aVar;
        if (bVar == null && file == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        C7510a.m22366f(z3);
        this.f9836a = new HashMap<>();
        this.f9837b = new SparseArray<>();
        this.f9838c = new SparseBooleanArray();
        this.f9839d = new SparseBooleanArray();
        C5306b bVar2 = null;
        if (bVar != null) {
            aVar = new C5305a(bVar);
        } else {
            aVar = null;
        }
        bVar2 = file != null ? new C5306b(new File(file, "cached_content_index.exi"), bArr, z) : bVar2;
        if (aVar == null || (bVar2 != null && z2)) {
            this.f9840e = (AbstractC5307c) C7557q0.m22145j(bVar2);
            this.f9841f = aVar;
            return;
        }
        this.f9840e = aVar;
        this.f9841f = bVar2;
    }

    /* renamed from: d */
    private C5302g m29537d(String str) {
        int l = m29529l(this.f9837b);
        C5302g gVar = new C5302g(l, str);
        this.f9836a.put(str, gVar);
        this.f9837b.put(l, str);
        this.f9839d.put(l, true);
        this.f9840e.mo29503f(gVar);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"GetInstance"})
    /* renamed from: i */
    public static Cipher m29532i() {
        if (C7557q0.f16368a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    /* renamed from: l */
    static int m29529l(SparseArray<String> sparseArray) {
        int i;
        int size = sparseArray.size();
        int i2 = 0;
        if (size == 0) {
            i = 0;
        } else {
            i = sparseArray.keyAt(size - 1) + 1;
        }
        if (i >= 0) {
            return i;
        }
        while (i2 < size && i2 == sparseArray.keyAt(i2)) {
            i2++;
        }
        return i2;
    }

    /* renamed from: o */
    public static boolean m29526o(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static C7096h m29524q(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = C7557q0.f16373f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException("Invalid value size: " + readInt2);
            }
        }
        return new C7096h(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static void m29521t(C7096h hVar, DataOutputStream dataOutputStream) {
        Set<Map.Entry<String, byte[]>> f = hVar.m23414f();
        dataOutputStream.writeInt(f.size());
        for (Map.Entry<String, byte[]> entry : f) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    /* renamed from: e */
    public void m29536e(String str, C7095g gVar) {
        C5302g m = m29528m(str);
        if (m.m29553b(gVar)) {
            this.f9840e.mo29503f(m);
        }
    }

    /* renamed from: f */
    public int m29535f(String str) {
        return m29528m(str).f9829a;
    }

    /* renamed from: g */
    public C5302g m29534g(String str) {
        return this.f9836a.get(str);
    }

    /* renamed from: h */
    public Collection<C5302g> m29533h() {
        return Collections.unmodifiableCollection(this.f9836a.values());
    }

    /* renamed from: j */
    public AbstractC7094f m29531j(String str) {
        C5302g g = m29534g(str);
        if (g != null) {
            return g.m29552c();
        }
        return C7096h.f15479c;
    }

    /* renamed from: k */
    public String m29530k(int i) {
        return this.f9837b.get(i);
    }

    /* renamed from: m */
    public C5302g m29528m(String str) {
        C5302g gVar = this.f9836a.get(str);
        if (gVar == null) {
            return m29537d(str);
        }
        return gVar;
    }

    /* renamed from: n */
    public void m29527n(long j) {
        AbstractC5307c cVar;
        this.f9840e.mo29505d(j);
        AbstractC5307c cVar2 = this.f9841f;
        if (cVar2 != null) {
            cVar2.mo29505d(j);
        }
        if (this.f9840e.mo29507b() || (cVar = this.f9841f) == null || !cVar.mo29507b()) {
            this.f9840e.mo29502g(this.f9836a, this.f9837b);
        } else {
            this.f9841f.mo29502g(this.f9836a, this.f9837b);
            this.f9840e.mo29504e(this.f9836a);
        }
        AbstractC5307c cVar3 = this.f9841f;
        if (cVar3 != null) {
            cVar3.mo29501h();
            this.f9841f = null;
        }
    }

    /* renamed from: p */
    public void m29525p(String str) {
        C5302g gVar = this.f9836a.get(str);
        if (gVar != null && gVar.m29549f() && gVar.m29547h()) {
            this.f9836a.remove(str);
            int i = gVar.f9829a;
            boolean z = this.f9839d.get(i);
            this.f9840e.mo29508a(gVar, z);
            if (z) {
                this.f9837b.remove(i);
                this.f9839d.delete(i);
                return;
            }
            this.f9837b.put(i, null);
            this.f9838c.put(i, true);
        }
    }

    /* renamed from: r */
    public void m29523r() {
        AbstractC3868g2 j = AbstractC3960w0.m33259t(this.f9836a.keySet()).iterator();
        while (j.hasNext()) {
            m29525p((String) j.next());
        }
    }

    /* renamed from: s */
    public void m29522s() {
        this.f9840e.mo29506c(this.f9836a);
        int size = this.f9838c.size();
        for (int i = 0; i < size; i++) {
            this.f9837b.remove(this.f9838c.keyAt(i));
        }
        this.f9838c.clear();
        this.f9839d.clear();
    }
}
