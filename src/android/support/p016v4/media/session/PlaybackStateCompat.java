package android.support.p016v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C1470a();

    /* renamed from: k */
    final int f563k;

    /* renamed from: l */
    final long f564l;

    /* renamed from: m */
    final long f565m;

    /* renamed from: n */
    final float f566n;

    /* renamed from: o */
    final long f567o;

    /* renamed from: p */
    final int f568p;

    /* renamed from: q */
    final CharSequence f569q;

    /* renamed from: r */
    final long f570r;

    /* renamed from: s */
    List<CustomAction> f571s;

    /* renamed from: t */
    final long f572t;

    /* renamed from: u */
    final Bundle f573u;

    /* renamed from: v */
    private PlaybackState f574v;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes.dex */
    class C1470a implements Parcelable.Creator<PlaybackStateCompat> {
        C1470a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f563k = i;
        this.f564l = j;
        this.f565m = j2;
        this.f566n = f;
        this.f567o = j3;
        this.f568p = i2;
        this.f569q = charSequence;
        this.f570r = j4;
        this.f571s = new ArrayList(list);
        this.f572t = j5;
        this.f573u = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m41038a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                arrayList.add(CustomAction.m41037a(customAction));
            }
        }
        Bundle extras = playbackState.getExtras();
        MediaSessionCompat.m41053a(extras);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras);
        playbackStateCompat.f574v = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f563k + ", position=" + this.f564l + ", buffered position=" + this.f565m + ", speed=" + this.f566n + ", updated=" + this.f570r + ", actions=" + this.f567o + ", error code=" + this.f568p + ", error message=" + this.f569q + ", custom actions=" + this.f571s + ", active item id=" + this.f572t + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f563k);
        parcel.writeLong(this.f564l);
        parcel.writeFloat(this.f566n);
        parcel.writeLong(this.f570r);
        parcel.writeLong(this.f565m);
        parcel.writeLong(this.f567o);
        TextUtils.writeToParcel(this.f569q, parcel, i);
        parcel.writeTypedList(this.f571s);
        parcel.writeLong(this.f572t);
        parcel.writeBundle(this.f573u);
        parcel.writeInt(this.f568p);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C1469a();

        /* renamed from: k */
        private final String f575k;

        /* renamed from: l */
        private final CharSequence f576l;

        /* renamed from: m */
        private final int f577m;

        /* renamed from: n */
        private final Bundle f578n;

        /* renamed from: o */
        private PlaybackState.CustomAction f579o;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes.dex */
        class C1469a implements Parcelable.Creator<CustomAction> {
            C1469a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f575k = str;
            this.f576l = charSequence;
            this.f577m = i;
            this.f578n = bundle;
        }

        /* renamed from: a */
        public static CustomAction m41037a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle extras = customAction.getExtras();
            MediaSessionCompat.m41053a(extras);
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
            customAction2.f579o = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f576l) + ", mIcon=" + this.f577m + ", mExtras=" + this.f578n;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f575k);
            TextUtils.writeToParcel(this.f576l, parcel, i);
            parcel.writeInt(this.f577m);
            parcel.writeBundle(this.f578n);
        }

        CustomAction(Parcel parcel) {
            this.f575k = parcel.readString();
            this.f576l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f577m = parcel.readInt();
            this.f578n = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f563k = parcel.readInt();
        this.f564l = parcel.readLong();
        this.f566n = parcel.readFloat();
        this.f570r = parcel.readLong();
        this.f565m = parcel.readLong();
        this.f567o = parcel.readLong();
        this.f569q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f571s = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f572t = parcel.readLong();
        this.f573u = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f568p = parcel.readInt();
    }
}
