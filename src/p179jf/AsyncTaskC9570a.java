package p179jf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.util.JSStackTrace;
import fk.C7366m;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.BufferedSource;
import okio.Sink;
import p001if.c;
import p139hf.AbstractC8011b;
import p163j$.util.Spliterator;
import p200kf.C9854a;

/* renamed from: jf.a */
/* loaded from: classes8.dex */
public class AsyncTaskC9570a extends AsyncTask<Void, Void, C0288a> {

    /* renamed from: a */
    private final Context f21227a;

    /* renamed from: b */
    private Uri f21228b;

    /* renamed from: c */
    private Uri f21229c;

    /* renamed from: d */
    private final int f21230d;

    /* renamed from: e */
    private final int f21231e;

    /* renamed from: f */
    private final AbstractC8011b f21232f;

    public AsyncTaskC9570a(Context context, Uri uri, Uri uri2, int i, int i2, AbstractC8011b bVar) {
        this.f21227a = context;
        this.f21228b = uri;
        this.f21229c = uri2;
        this.f21230d = i;
        this.f21231e = i2;
        this.f21232f = bVar;
    }

    /* renamed from: a */
    private boolean m15975a(Bitmap bitmap, BitmapFactory.Options options) {
        int i;
        if (bitmap != null) {
            i = bitmap.getByteCount();
        } else {
            i = 0;
        }
        if (i <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    /* renamed from: b */
    private void m15974b(Uri uri, Uri uri2) {
        Throwable th2;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        Log.d("BitmapWorkerTask", "copyFile");
        if (uri2 != null) {
            FileOutputStream fileOutputStream2 = null;
            try {
                inputStream = this.f21227a.getContentResolver().openInputStream(uri);
                try {
                    fileOutputStream = new FileOutputStream(new File(uri2.getPath()));
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th2 = th4;
                inputStream = null;
            }
            try {
                if (inputStream != null) {
                    byte[] bArr = new byte[Spliterator.IMMUTABLE];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            C9854a.m15196c(fileOutputStream);
                            C9854a.m15196c(inputStream);
                            this.f21228b = this.f21229c;
                            return;
                        }
                    }
                } else {
                    throw new NullPointerException("InputStream for given input Uri is null");
                }
            } catch (Throwable th5) {
                th2 = th5;
                fileOutputStream2 = fileOutputStream;
                C9854a.m15196c(fileOutputStream2);
                C9854a.m15196c(inputStream);
                this.f21228b = this.f21229c;
                throw th2;
            }
        } else {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
    }

    /* renamed from: d */
    private void m15972d(Uri uri, Uri uri2) {
        Throwable th2;
        Closeable closeable;
        Response response;
        Log.d("BitmapWorkerTask", "downloadFile");
        if (uri2 != null) {
            OkHttpClient okHttpClient = new OkHttpClient();
            BufferedSource bufferedSource = null;
            try {
                Response execute = okHttpClient.mo9954a(new Request.Builder().m9865l(uri.toString()).m9875b()).execute();
                try {
                    BufferedSource source = execute.m9845b().source();
                    try {
                        OutputStream openOutputStream = this.f21227a.getContentResolver().openOutputStream(uri2);
                        if (openOutputStream != null) {
                            Sink h = C7366m.m22815h(openOutputStream);
                            source.mo9723x0(h);
                            C9854a.m15196c(source);
                            C9854a.m15196c(h);
                            C9854a.m15196c(execute.m9845b());
                            okHttpClient.m9941r().m10087a();
                            this.f21228b = this.f21229c;
                            return;
                        }
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    } catch (Throwable th3) {
                        th2 = th3;
                        response = execute;
                        closeable = null;
                        bufferedSource = source;
                        C9854a.m15196c(bufferedSource);
                        C9854a.m15196c(closeable);
                        if (response != null) {
                            C9854a.m15196c(response.m9845b());
                        }
                        okHttpClient.m9941r().m10087a();
                        this.f21228b = this.f21229c;
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    response = execute;
                    closeable = null;
                }
            } catch (Throwable th5) {
                th2 = th5;
                closeable = null;
                response = null;
            }
        } else {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
    }

    /* renamed from: f */
    private void m15970f() {
        String scheme = this.f21228b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                m15972d(this.f21228b, this.f21229c);
            } catch (IOException | NullPointerException e) {
                Log.e("BitmapWorkerTask", "Downloading failed", e);
                throw e;
            }
        } else if ("content".equals(scheme)) {
            try {
                m15974b(this.f21228b, this.f21229c);
            } catch (IOException | NullPointerException e2) {
                Log.e("BitmapWorkerTask", "Copying failed", e2);
                throw e2;
            }
        } else if (!JSStackTrace.FILE_KEY.equals(scheme)) {
            Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
            throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public C0288a doInBackground(Void... voidArr) {
        InputStream openInputStream;
        if (this.f21228b == null) {
            return new C0288a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            m15970f();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = C9854a.m15198a(options, this.f21230d, this.f21231e);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z) {
                try {
                    openInputStream = this.f21227a.getContentResolver().openInputStream(this.f21228b);
                    try {
                        bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                    } finally {
                        C9854a.m15196c(openInputStream);
                    }
                } catch (IOException e) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e);
                    return new C0288a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f21228b + "]", e));
                } catch (OutOfMemoryError e2) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e2);
                    options.inSampleSize *= 2;
                }
                if (options.outWidth == -1 || options.outHeight == -1) {
                    return new C0288a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f21228b + "]"));
                }
                C9854a.m15196c(openInputStream);
                if (!m15975a(bitmap, options)) {
                    z = true;
                }
            }
            if (bitmap == null) {
                return new C0288a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f21228b + "]"));
            }
            int g = C9854a.m15192g(this.f21227a, this.f21228b);
            int e3 = C9854a.m15194e(g);
            int f = C9854a.m15193f(g);
            c cVar = new c(g, e3, f);
            Matrix matrix = new Matrix();
            if (e3 != 0) {
                matrix.preRotate(e3);
            }
            if (f != 1) {
                matrix.postScale(f, 1.0f);
            }
            if (!matrix.isIdentity()) {
                return new C0288a(C9854a.m15191h(bitmap, matrix), cVar);
            }
            return new C0288a(bitmap, cVar);
        } catch (IOException | NullPointerException e4) {
            return new C0288a(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void onPostExecute(C0288a aVar) {
        String str;
        Exception exc = aVar.f21235c;
        if (exc == null) {
            AbstractC8011b bVar = this.f21232f;
            Bitmap bitmap = aVar.f21233a;
            c cVar = aVar.f21234b;
            String path = this.f21228b.getPath();
            Uri uri = this.f21229c;
            if (uri == null) {
                str = null;
            } else {
                str = uri.getPath();
            }
            bVar.mo20858a(bitmap, cVar, path, str);
            return;
        }
        this.f21232f.onFailure(exc);
    }

    /* renamed from: jf.a$a */
    /* loaded from: classes8.dex */
    public static class C0288a {

        /* renamed from: a */
        Bitmap f21233a;

        /* renamed from: b */
        c f21234b;

        /* renamed from: c */
        Exception f21235c;

        public C0288a(Bitmap bitmap, c cVar) {
            this.f21233a = bitmap;
            this.f21234b = cVar;
        }

        public C0288a(Exception exc) {
            this.f21235c = exc;
        }
    }
}
