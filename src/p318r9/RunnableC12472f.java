package p318r9;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p011aa.C1350a;
import p384v9.AbstractC13473g;
import p384v9.C13475h;
import p400w9.C13833l;
import p420x9.C14004p;

/* renamed from: r9.f */
/* loaded from: classes5.dex */
public final class RunnableC12472f implements Runnable {

    /* renamed from: m */
    private static final C1350a f28131m = new C1350a("RevokeAccessOperation", new String[0]);

    /* renamed from: k */
    private final String f28132k;

    /* renamed from: l */
    private final C13833l f28133l = new C13833l(null);

    public RunnableC12472f(String str) {
        this.f28132k = C14004p.m2055f(str);
    }

    /* renamed from: a */
    public static AbstractC13473g m6641a(String str) {
        if (str == null) {
            return C13475h.m3611a(new Status(4), null);
        }
        RunnableC12472f fVar = new RunnableC12472f(str);
        new Thread(fVar).start();
        return fVar.f28133l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f10103r;
        try {
            String str = this.f28132k;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f10101p;
            } else {
                f28131m.m41257b("Unable to revoke access!", new Object[0]);
            }
            C1350a aVar = f28131m;
            aVar.m41258a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            f28131m.m41257b("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            f28131m.m41257b("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.f28133l.setResult(status);
    }
}
