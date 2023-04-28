package p244n8;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import p119g9.C7510a;

/* renamed from: n8.e */
/* loaded from: classes7.dex */
final class C10730e {

    /* renamed from: a */
    private final LinkedHashMap<Uri, byte[]> f23795a;

    /* renamed from: n8.e$a */
    /* loaded from: classes7.dex */
    class C10731a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: k */
        final /* synthetic */ int f23796k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10731a(int i, float f, boolean z, int i2) {
            super(i, f, z);
            this.f23796k = i2;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f23796k;
        }
    }

    public C10730e(int i) {
        this.f23795a = new C10731a(i + 1, 1.0f, false, i);
    }

    /* renamed from: a */
    public byte[] m12530a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f23795a.get(uri);
    }

    /* renamed from: b */
    public byte[] m12529b(Uri uri, byte[] bArr) {
        return this.f23795a.put((Uri) C7510a.m22367e(uri), (byte[]) C7510a.m22367e(bArr));
    }

    /* renamed from: c */
    public byte[] m12528c(Uri uri) {
        return this.f23795a.remove(C7510a.m22367e(uri));
    }
}
