package p291q2;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: q2.b */
/* loaded from: classes.dex */
public class C11973b implements AbstractC11977f {
    @Override // p291q2.AbstractC11977f
    /* renamed from: a */
    public AbstractC11975d mo8087a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C11972a(httpURLConnection);
    }
}
