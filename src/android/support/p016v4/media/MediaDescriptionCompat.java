package android.support.p016v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C1460a();

    /* renamed from: k */
    private final String f520k;

    /* renamed from: l */
    private final CharSequence f521l;

    /* renamed from: m */
    private final CharSequence f522m;

    /* renamed from: n */
    private final CharSequence f523n;

    /* renamed from: o */
    private final Bitmap f524o;

    /* renamed from: p */
    private final Uri f525p;

    /* renamed from: q */
    private final Bundle f526q;

    /* renamed from: r */
    private final Uri f527r;

    /* renamed from: s */
    private MediaDescription f528s;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    class C1460a implements Parcelable.Creator<MediaDescriptionCompat> {
        C1460a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m41072a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    /* loaded from: classes.dex */
    public static final class C1461b {

        /* renamed from: a */
        private String f529a;

        /* renamed from: b */
        private CharSequence f530b;

        /* renamed from: c */
        private CharSequence f531c;

        /* renamed from: d */
        private CharSequence f532d;

        /* renamed from: e */
        private Bitmap f533e;

        /* renamed from: f */
        private Uri f534f;

        /* renamed from: g */
        private Bundle f535g;

        /* renamed from: h */
        private Uri f536h;

        /* renamed from: a */
        public MediaDescriptionCompat m41068a() {
            return new MediaDescriptionCompat(this.f529a, this.f530b, this.f531c, this.f532d, this.f533e, this.f534f, this.f535g, this.f536h);
        }

        /* renamed from: b */
        public C1461b m41067b(CharSequence charSequence) {
            this.f532d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C1461b m41066c(Bundle bundle) {
            this.f535g = bundle;
            return this;
        }

        /* renamed from: d */
        public C1461b m41065d(Bitmap bitmap) {
            this.f533e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C1461b m41064e(Uri uri) {
            this.f534f = uri;
            return this;
        }

        /* renamed from: f */
        public C1461b m41063f(String str) {
            this.f529a = str;
            return this;
        }

        /* renamed from: g */
        public C1461b m41062g(Uri uri) {
            this.f536h = uri;
            return this;
        }

        /* renamed from: h */
        public C1461b m41061h(CharSequence charSequence) {
            this.f531c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C1461b m41060i(CharSequence charSequence) {
            this.f530b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f520k = str;
        this.f521l = charSequence;
        this.f522m = charSequence2;
        this.f523n = charSequence3;
        this.f524o = bitmap;
        this.f525p = uri;
        this.f526q = bundle;
        this.f527r = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.p016v4.media.MediaDescriptionCompat m41072a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0079
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = r8.getMediaId()
            r1.m41063f(r2)
            java.lang.CharSequence r2 = r8.getTitle()
            r1.m41060i(r2)
            java.lang.CharSequence r2 = r8.getSubtitle()
            r1.m41061h(r2)
            java.lang.CharSequence r2 = r8.getDescription()
            r1.m41067b(r2)
            android.graphics.Bitmap r2 = r8.getIconBitmap()
            r1.m41065d(r2)
            android.net.Uri r2 = r8.getIconUri()
            r1.m41064e(r2)
            android.os.Bundle r2 = r8.getExtras()
            if (r2 == 0) goto L_0x003e
            android.os.Bundle r2 = android.support.p016v4.media.session.MediaSessionCompat.m41052b(r2)
        L_0x003e:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0049
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004a
        L_0x0049:
            r4 = r0
        L_0x004a:
            if (r4 == 0) goto L_0x0062
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005c
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005c
            goto L_0x0063
        L_0x005c:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0062:
            r0 = r2
        L_0x0063:
            r1.m41066c(r0)
            if (r4 == 0) goto L_0x006c
            r1.m41062g(r4)
            goto L_0x0073
        L_0x006c:
            android.net.Uri r0 = r8.getMediaUri()
            r1.m41062g(r0)
        L_0x0073:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.m41068a()
            r0.f528s = r8
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p016v4.media.MediaDescriptionCompat.m41072a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object m41071b() {
        MediaDescription mediaDescription = this.f528s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f520k);
        builder.setTitle(this.f521l);
        builder.setSubtitle(this.f522m);
        builder.setDescription(this.f523n);
        builder.setIconBitmap(this.f524o);
        builder.setIconUri(this.f525p);
        builder.setExtras(this.f526q);
        builder.setMediaUri(this.f527r);
        MediaDescription build = builder.build();
        this.f528s = build;
        return build;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f521l) + ", " + ((Object) this.f522m) + ", " + ((Object) this.f523n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) m41071b()).writeToParcel(parcel, i);
    }
}
