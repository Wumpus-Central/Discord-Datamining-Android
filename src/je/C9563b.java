package je;

import android.net.Uri;

/* renamed from: je.b */
/* loaded from: classes6.dex */
public class C9563b extends AbstractC9567d {

    /* renamed from: l */
    private final EnumC9564a f21191l;

    /* renamed from: m */
    private final Uri f21192m;

    /* renamed from: je.b$a */
    /* loaded from: classes6.dex */
    public enum EnumC9564a {
        DATA_SOURCE("data source error");
        

        /* renamed from: k */
        private final String f21195k;

        EnumC9564a(String str) {
            this.f21195k = str;
        }
    }

    public C9563b(EnumC9564a aVar, Uri uri, Throwable th2) {
        super(th2);
        this.f21191l = aVar;
        this.f21192m = uri;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Failed to create media source due to a " + this.f21191l.f21195k;
    }

    @Override // je.AbstractC9567d, java.lang.Throwable
    public String toString() {
        return super.toString() + "\nFailed to create media source due to a " + this.f21191l.f21195k + "\nUri: " + this.f21192m;
    }
}
