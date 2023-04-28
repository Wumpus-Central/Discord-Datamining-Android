package p081e9;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.C5288a;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: e9.r */
/* loaded from: classes5.dex */
public final class C6787r extends AbstractC6771f {

    /* renamed from: e */
    private RandomAccessFile f14493e;

    /* renamed from: f */
    private Uri f14494f;

    /* renamed from: g */
    private long f14495g;

    /* renamed from: h */
    private boolean f14496h;

    /* renamed from: e9.r$a */
    /* loaded from: classes5.dex */
    public static class C6788a extends IOException {
        public C6788a(IOException iOException) {
            super(iOException);
        }

        public C6788a(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public C6787r() {
        super(false);
    }

    /* renamed from: s */
    private static RandomAccessFile m24323s(Uri uri) {
        try {
            return new RandomAccessFile((String) C7510a.m22367e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new C6788a(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e);
            }
            throw new C6788a(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        try {
            Uri uri = aVar.f9746a;
            this.f14494f = uri;
            m24358q(aVar);
            RandomAccessFile s = m24323s(uri);
            this.f14493e = s;
            s.seek(aVar.f9752g);
            long j = aVar.f9753h;
            if (j == -1) {
                j = this.f14493e.length() - aVar.f9752g;
            }
            this.f14495g = j;
            if (j >= 0) {
                this.f14496h = true;
                m24357r(aVar);
                return this.f14495g;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C6788a(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f14494f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14493e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C6788a(e);
            }
        } finally {
            this.f14493e = null;
            if (this.f14496h) {
                this.f14496h = false;
                m24359p();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        return this.f14494f;
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f14495g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) C7557q0.m22145j(this.f14493e)).read(bArr, i, (int) Math.min(this.f14495g, i2));
            if (read > 0) {
                this.f14495g -= read;
                m24360o(read);
            }
            return read;
        } catch (IOException e) {
            throw new C6788a(e);
        }
    }
}
