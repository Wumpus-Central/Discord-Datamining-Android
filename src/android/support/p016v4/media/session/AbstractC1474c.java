package android.support.p016v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p016v4.media.MediaMetadataCompat;
import android.support.p016v4.media.session.AbstractC1471a;
import android.support.p016v4.media.session.MediaSessionCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes.dex */
public abstract class AbstractC1474c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final MediaController.Callback f582a = new C1475a(this);

    /* renamed from: b */
    AbstractC1471a f583b;

    /* renamed from: android.support.v4.media.session.c$a */
    /* loaded from: classes.dex */
    private static class C1475a extends MediaController.Callback {

        /* renamed from: a */
        private final WeakReference<AbstractC1474c> f584a;

        C1475a(AbstractC1474c cVar) {
            this.f584a = new WeakReference<>(cVar);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            AbstractC1474c cVar = this.f584a.get();
            if (cVar != null) {
                cVar.m41023a(new C1477d(playbackInfo.getPlaybackType(), AudioAttributesCompat.m35705c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m41053a(bundle);
            AbstractC1474c cVar = this.f584a.get();
            if (cVar != null) {
                cVar.m41022b(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            AbstractC1474c cVar = this.f584a.get();
            if (cVar != null) {
                cVar.m41021c(MediaMetadataCompat.m41059a(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            AbstractC1474c cVar = this.f584a.get();
            if (cVar != null && cVar.f583b == null) {
                cVar.m41020d(PlaybackStateCompat.m41038a(playbackState));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            AbstractC1474c cVar = this.f584a.get();
            if (cVar != null) {
                cVar.m41019e(MediaSessionCompat.QueueItem.m41050b(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            AbstractC1474c cVar = this.f584a.get();
            if (cVar != null) {
                cVar.m41018f(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            AbstractC1474c cVar = this.f584a.get();
            if (cVar != null) {
                cVar.m41017g();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m41053a(bundle);
            AbstractC1474c cVar = this.f584a.get();
            if (cVar != null) {
                AbstractC1471a aVar = cVar.f583b;
                cVar.m41016h(str, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$b */
    /* loaded from: classes.dex */
    public static class BinderC1476b extends AbstractC1471a.AbstractBinderC0009a {

        /* renamed from: a */
        private final WeakReference<AbstractC1474c> f585a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public BinderC1476b(AbstractC1474c cVar) {
            this.f585a = new WeakReference<>(cVar);
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: P */
        public void mo41014P(boolean z) {
            AbstractC1474c cVar = this.f585a.get();
            if (cVar != null) {
                cVar.m41015i(11, Boolean.valueOf(z), null);
            }
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: S */
        public void mo41013S(boolean z) {
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: a0 */
        public void mo41012a0(PlaybackStateCompat playbackStateCompat) {
            AbstractC1474c cVar = this.f585a.get();
            if (cVar != null) {
                cVar.m41015i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: b0 */
        public void mo41011b0(String str, Bundle bundle) {
            AbstractC1474c cVar = this.f585a.get();
            if (cVar != null) {
                cVar.m41015i(1, str, bundle);
            }
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: k */
        public void mo41010k() {
            AbstractC1474c cVar = this.f585a.get();
            if (cVar != null) {
                cVar.m41015i(13, null, null);
            }
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        public void onRepeatModeChanged(int i) {
            AbstractC1474c cVar = this.f585a.get();
            if (cVar != null) {
                cVar.m41015i(9, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.p016v4.media.session.AbstractC1471a
        /* renamed from: v */
        public void mo41009v(int i) {
            AbstractC1474c cVar = this.f585a.get();
            if (cVar != null) {
                cVar.m41015i(12, Integer.valueOf(i), null);
            }
        }
    }

    /* renamed from: a */
    public void m41023a(C1477d dVar) {
    }

    /* renamed from: b */
    public void m41022b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m41015i(8, null, null);
    }

    /* renamed from: c */
    public void m41021c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void m41020d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void m41019e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void m41018f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void m41017g() {
    }

    /* renamed from: h */
    public void m41016h(String str, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m41015i(int i, Object obj, Bundle bundle) {
    }
}
