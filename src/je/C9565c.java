package je;

import android.net.Uri;

/* renamed from: je.c */
/* loaded from: classes6.dex */
public class C9565c extends AbstractC9567d {

    /* renamed from: l */
    private final EnumC9566a f21196l;

    /* renamed from: m */
    private final String f21197m;

    /* renamed from: n */
    private final int f21198n;

    /* renamed from: je.c$a */
    /* loaded from: classes6.dex */
    public enum EnumC9566a {
        INVALID_PARAMS("Invalid parameters"),
        IO_FAILUE("Failed to open the media target for write."),
        UNSUPPORTED_URI_TYPE("URI type not supported at API level below 26"),
        NO_OUTPUT_TRACKS("No output tracks");
        

        /* renamed from: k */
        private final String f21204k;

        EnumC9566a(String str) {
            this.f21204k = str;
        }
    }

    public C9565c(EnumC9566a aVar, Uri uri, int i, Throwable th2) {
        this(aVar, uri.toString(), i, th2);
    }

    @Override // je.AbstractC9567d, java.lang.Throwable
    public String toString() {
        return super.toString() + '\n' + this.f21196l.f21204k + "\nOutput file path or Uri encoded string: " + this.f21197m + "\nMediaMuxer output format: " + this.f21198n;
    }

    public C9565c(EnumC9566a aVar, String str, int i, Throwable th2) {
        super(th2);
        this.f21196l = aVar;
        this.f21197m = str;
        this.f21198n = i;
    }
}
