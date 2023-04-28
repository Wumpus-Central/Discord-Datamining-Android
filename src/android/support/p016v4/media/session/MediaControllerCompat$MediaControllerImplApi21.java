package android.support.p016v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p016v4.media.MediaMetadataCompat;
import android.support.p016v4.media.session.AbstractC1472b;
import android.support.p016v4.media.session.AbstractC1474c;
import android.support.p016v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C2240h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p392w1.C13725a;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f545a;

    /* renamed from: b */
    private final List<AbstractC1474c> f546b;

    /* renamed from: c */
    private HashMap<AbstractC1474c, BinderC1464a> f547c;

    /* renamed from: d */
    final MediaSessionCompat.Token f548d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: k */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f549k;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f549k.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f545a) {
                    mediaControllerCompat$MediaControllerImplApi21.f548d.m41044b(AbstractC1472b.AbstractBinderC1473a.m41026b(C2240h.m38261a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f548d.m41043e(C13725a.m2860b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerCompat$MediaControllerImplApi21.m41054a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    /* loaded from: classes.dex */
    public static class BinderC1464a extends AbstractC1474c.BinderC1476b {
        BinderC1464a(AbstractC1474c cVar) {
            super(cVar);
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: G */
        public void mo41032G(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: L */
        public void mo41031L(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: T */
        public void mo41030T(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: l */
        public void mo41029l(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: r */
        public void mo41028r() {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: s */
        public void mo41027s(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    void m41054a() {
        if (this.f548d.m41045a() != null) {
            for (AbstractC1474c cVar : this.f546b) {
                BinderC1464a aVar = new BinderC1464a(cVar);
                this.f547c.put(cVar, aVar);
                cVar.f583b = aVar;
                try {
                    this.f548d.m41045a().mo41024H(aVar);
                    cVar.m41015i(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f546b.clear();
        }
    }
}
