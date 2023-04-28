package p291q2;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p343t2.C12945f;

/* renamed from: q2.a */
/* loaded from: classes.dex */
public class C11972a implements AbstractC11975d {

    /* renamed from: k */
    private final HttpURLConnection f26807k;

    public C11972a(HttpURLConnection httpURLConnection) {
        this.f26807k = httpURLConnection;
    }

    /* renamed from: b */
    private String m8094b(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // p291q2.AbstractC11975d
    /* renamed from: I */
    public String mo8092I() {
        return this.f26807k.getContentType();
    }

    @Override // p291q2.AbstractC11975d
    /* renamed from: L */
    public InputStream mo8091L() {
        return this.f26807k.getInputStream();
    }

    @Override // p291q2.AbstractC11975d
    /* renamed from: X */
    public boolean mo8090X() {
        try {
            return this.f26807k.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26807k.disconnect();
    }

    @Override // p291q2.AbstractC11975d
    /* renamed from: k0 */
    public String mo8089k0() {
        try {
            if (mo8090X()) {
                return null;
            }
            return "Unable to fetch " + this.f26807k.getURL() + ". Failed with " + this.f26807k.getResponseCode() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + m8094b(this.f26807k);
        } catch (IOException e) {
            C12945f.m5008d("get error failed ", e);
            return e.getMessage();
        }
    }
}
