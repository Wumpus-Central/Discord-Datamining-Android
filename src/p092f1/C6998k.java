package p092f1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: f1.k */
/* loaded from: classes.dex */
public final class C6998k {

    /* renamed from: a */
    private final AbstractC7001c f15265a;

    /* renamed from: f1.k$b */
    /* loaded from: classes.dex */
    private static final class C7000b implements AbstractC7001c {

        /* renamed from: a */
        private final Uri f15267a;

        /* renamed from: b */
        private final ClipDescription f15268b;

        /* renamed from: c */
        private final Uri f15269c;

        C7000b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f15267a = uri;
            this.f15268b = clipDescription;
            this.f15269c = uri2;
        }

        @Override // p092f1.C6998k.AbstractC7001c
        /* renamed from: a */
        public Object mo23706a() {
            return null;
        }

        @Override // p092f1.C6998k.AbstractC7001c
        /* renamed from: b */
        public Uri mo23705b() {
            return this.f15267a;
        }

        @Override // p092f1.C6998k.AbstractC7001c
        /* renamed from: c */
        public void mo23704c() {
        }

        @Override // p092f1.C6998k.AbstractC7001c
        public ClipDescription getDescription() {
            return this.f15268b;
        }

        @Override // p092f1.C6998k.AbstractC7001c
        /* renamed from: k */
        public Uri mo23703k() {
            return this.f15269c;
        }
    }

    /* renamed from: f1.k$c */
    /* loaded from: classes.dex */
    private interface AbstractC7001c {
        /* renamed from: a */
        Object mo23706a();

        /* renamed from: b */
        Uri mo23705b();

        /* renamed from: c */
        void mo23704c();

        ClipDescription getDescription();

        /* renamed from: k */
        Uri mo23703k();
    }

    public C6998k(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f15265a = new C6999a(uri, clipDescription, uri2);
        } else {
            this.f15265a = new C7000b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static C6998k m23707f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C6998k(new C6999a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri m23712a() {
        return this.f15265a.mo23705b();
    }

    /* renamed from: b */
    public ClipDescription m23711b() {
        return this.f15265a.getDescription();
    }

    /* renamed from: c */
    public Uri m23710c() {
        return this.f15265a.mo23703k();
    }

    /* renamed from: d */
    public void m23709d() {
        this.f15265a.mo23704c();
    }

    /* renamed from: e */
    public Object m23708e() {
        return this.f15265a.mo23706a();
    }

    /* renamed from: f1.k$a */
    /* loaded from: classes.dex */
    private static final class C6999a implements AbstractC7001c {

        /* renamed from: a */
        final InputContentInfo f15266a;

        C6999a(Object obj) {
            this.f15266a = (InputContentInfo) obj;
        }

        @Override // p092f1.C6998k.AbstractC7001c
        /* renamed from: a */
        public Object mo23706a() {
            return this.f15266a;
        }

        @Override // p092f1.C6998k.AbstractC7001c
        /* renamed from: b */
        public Uri mo23705b() {
            Uri contentUri;
            contentUri = this.f15266a.getContentUri();
            return contentUri;
        }

        @Override // p092f1.C6998k.AbstractC7001c
        /* renamed from: c */
        public void mo23704c() {
            this.f15266a.requestPermission();
        }

        @Override // p092f1.C6998k.AbstractC7001c
        public ClipDescription getDescription() {
            ClipDescription description;
            description = this.f15266a.getDescription();
            return description;
        }

        @Override // p092f1.C6998k.AbstractC7001c
        /* renamed from: k */
        public Uri mo23703k() {
            Uri linkUri;
            linkUri = this.f15266a.getLinkUri();
            return linkUri;
        }

        C6999a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f15266a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C6998k(AbstractC7001c cVar) {
        this.f15265a = cVar;
    }
}
