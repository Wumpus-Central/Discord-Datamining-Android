package p403wc;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p136hc.C7984d;
import p163j$.util.Spliterator;

/* renamed from: wc.c */
/* loaded from: classes3.dex */
public class C13862c {

    /* renamed from: a */
    private File f31211a;

    /* renamed from: b */
    private final C7984d f31212b;

    /* renamed from: wc.c$a */
    /* loaded from: classes3.dex */
    public enum EnumC13863a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C13862c(C7984d dVar) {
        this.f31212b = dVar;
    }

    /* renamed from: a */
    private File m2516a() {
        if (this.f31211a == null) {
            synchronized (this) {
                if (this.f31211a == null) {
                    File filesDir = this.f31212b.m20967j().getFilesDir();
                    this.f31211a = new File(filesDir, "PersistedInstallation." + this.f31212b.m20963n() + ".json");
                }
            }
        }
        return this.f31211a;
    }

    /* renamed from: c */
    private JSONObject m2514c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Spliterator.SUBSIZED];
        try {
            FileInputStream fileInputStream = new FileInputStream(m2516a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, Spliterator.SUBSIZED);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public AbstractC13864d m2515b(AbstractC13864d dVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo2509d());
            jSONObject.put("Status", dVar.mo2506g().ordinal());
            jSONObject.put("AuthToken", dVar.mo2511b());
            jSONObject.put("RefreshToken", dVar.mo2507f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo2505h());
            jSONObject.put("ExpiresInSecs", dVar.mo2510c());
            jSONObject.put("FisError", dVar.mo2508e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f31212b.m20967j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(m2516a())) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    /* renamed from: d */
    public AbstractC13864d m2513d() {
        JSONObject c = m2514c();
        String optString = c.optString("Fid", null);
        int optInt = c.optInt("Status", EnumC13863a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c.optString("AuthToken", null);
        String optString3 = c.optString("RefreshToken", null);
        long optLong = c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = c.optLong("ExpiresInSecs", 0L);
        return AbstractC13864d.m2512a().mo2489d(optString).mo2486g(EnumC13863a.values()[optInt]).mo2491b(optString2).mo2487f(optString3).mo2485h(optLong).mo2490c(optLong2).mo2488e(c.optString("FisError", null)).mo2492a();
    }
}
