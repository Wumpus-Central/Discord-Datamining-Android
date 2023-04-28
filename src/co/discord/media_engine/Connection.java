package co.discord.media_engine;

import co.discord.media_engine.internal.TransformStats;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoCapturer;

@Metadata(m15074d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0006[\\]^_`B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J9\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086 J\u0011\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0011H\u0086 J\u0019\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0011H\u0086 J\u0011\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0086 J\t\u0010\u0019\u001a\u00020\nH\u0086 J\u0011\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0011H\u0086 J\u0011\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0011H\u0086 J\u0011\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0086 J\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020!J\u0016\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020!2\u0006\u0010\"\u001a\u00020\rJ\u0019\u0010#\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010\"\u001a\u00020\rH\u0082 J\u0011\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0011H\u0086 J\u0019\u0010'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0011H\u0086 J\u0011\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\rH\u0086 J:\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\f\u00102\u001a\b\u0012\u0004\u0012\u00020300H\u0086 ¢\u0006\u0002\u00104J1\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\rH\u0086 J\u0011\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020=H\u0086 J\u0011\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020\u0013H\u0086 J\u0011\u0010@\u001a\u00020\n2\u0006\u0010A\u001a\u00020\rH\u0086 J\u0011\u0010B\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020CH\u0086 J\u0011\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\u0011H\u0086 J\u0011\u0010F\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0011H\u0086 J\u0019\u0010G\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0086 J\u000e\u0010H\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bJ\u0011\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020\rH\u0086 J\u0011\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\rH\u0086 J\u0011\u0010M\u001a\u00020\n2\u0006\u0010L\u001a\u00020\rH\u0086 J\u0011\u0010N\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0013H\u0086 J\u0011\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u0011H\u0086 J\u0011\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020\u0011H\u0086 J\u0011\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020\u0013H\u0086 J\u0019\u0010V\u001a\u00020\n2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0003H\u0086 J\t\u0010Z\u001a\u00020\nH\u0086 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006a"}, m15073d2 = {"Lco/discord/media_engine/Connection;", "", "nativeInstance", "", "(J)V", "getNativeInstance", "()J", "userSpeakingStatusChangedCallback", "Lco/discord/media_engine/Connection$UserSpeakingStatusChangedCallback;", "connectUser", "", "userId", "audioSsrc", "", "videoSsrc", "rtxSsrc", "isMuted", "", "volume", "", "deafenLocalUser", "willBeDeafened", "disableVideo", "willBeDisabled", "disconnectUser", "dispose", "enableDiscontinuousTransmission", ViewProps.ENABLED, "enableForwardErrorCorrection", "getEncryptionModes", "callback", "Lco/discord/media_engine/Connection$EncryptionModesCallback;", "getStats", "Lco/discord/media_engine/Connection$GetStatsCallback;", "filter", "getStatsNative", "Lco/discord/media_engine/Connection$GetStatsCallbackNative;", "muteLocalUser", "willBeMuted", "muteUser", "setAudioInputMode", "mode", "setCodecs", "audioEncoder", "Lco/discord/media_engine/AudioEncoder;", "videoEncoder", "Lco/discord/media_engine/VideoEncoder;", "audioDecoders", "", "Lco/discord/media_engine/AudioDecoder;", "videoDecoder", "Lco/discord/media_engine/VideoDecoder;", "(Lco/discord/media_engine/AudioEncoder;Lco/discord/media_engine/VideoEncoder;[Lco/discord/media_engine/AudioDecoder;[Lco/discord/media_engine/VideoDecoder;)V", "setEncodingQuality", "minBitrate", "maxBitrate", "width", "height", "framerate", "setEncryptionSettings", "settings", "Lco/discord/media_engine/EncryptionSettings;", "setExpectedPacketLossRate", "expectedPacketLossRate", "setMinimumPlayoutDelay", "delayMs", "setOnVideoCallback", "Lco/discord/media_engine/Connection$OnVideoCallback;", "setPTTActive", AppStateModule.APP_STATE_ACTIVE, "setQoS", "setUserPlayoutVolume", "setUserSpeakingStatusChangedCallback", "setVADAutoThreshold", "autoThreshold", "setVADLeadingFramesToBuffer", "numFrames", "setVADTrailingFramesToSend", "setVADTriggerThreshold", "thresholdDb", "setVADUseKrisp", "useKrisp", "setVideoBroadcast", "broadcastVideo", "simulatePacketLoss", "packetLossRate", "startScreenshareBroadcast", "capturer", "Lorg/webrtc/VideoCapturer;", MediaStreamTrack.AUDIO_TRACK_KIND, "stopScreenshareBroadcast", "EncryptionModesCallback", "GetStatsCallback", "GetStatsCallbackNative", "OnVideoCallback", "StatsFilter", "UserSpeakingStatusChangedCallback", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class Connection {
    private final long nativeInstance;
    private UserSpeakingStatusChangedCallback userSpeakingStatusChangedCallback;

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m15073d2 = {"Lco/discord/media_engine/Connection$EncryptionModesCallback;", "", "onEncryptionModes", "", "modes", "", "", "([Ljava/lang/String;)V", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public interface EncryptionModesCallback {
        void onEncryptionModes(String[] strArr);
    }

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, m15073d2 = {"Lco/discord/media_engine/Connection$GetStatsCallback;", "", "onStats", "", "stats", "Lco/discord/media_engine/Stats;", "onStatsError", "t", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public interface GetStatsCallback {
        void onStats(Stats stats);

        void onStatsError(Throwable th2);
    }

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m15073d2 = {"Lco/discord/media_engine/Connection$GetStatsCallbackNative;", "", "callback", "Lco/discord/media_engine/Connection$GetStatsCallback;", "(Lco/discord/media_engine/Connection$GetStatsCallback;)V", "getCallback", "()Lco/discord/media_engine/Connection$GetStatsCallback;", "onStats", "", "stats", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    private static final class GetStatsCallbackNative {
        private final GetStatsCallback callback;

        public GetStatsCallbackNative(GetStatsCallback callback) {
            C9971q.m14633g(callback, "callback");
            this.callback = callback;
        }

        public final GetStatsCallback getCallback() {
            return this.callback;
        }

        public final void onStats(String stats) {
            C9971q.m14633g(stats, "stats");
            try {
                this.callback.onStats(TransformStats.transform(stats));
            } catch (Exception e) {
                this.callback.onStatsError(e);
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m15073d2 = {"Lco/discord/media_engine/Connection$OnVideoCallback;", "", "onVideo", "", "userId", "", "ssrc", "", "streamIdentifier", "", "streams", "", "Lco/discord/media_engine/StreamParameters;", "(JILjava/lang/String;[Lco/discord/media_engine/StreamParameters;)V", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public interface OnVideoCallback {
        void onVideo(long j, int i, String str, StreamParameters[] streamParametersArr);
    }

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m15073d2 = {"Lco/discord/media_engine/Connection$StatsFilter;", "", "()V", "Companion", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public static final class StatsFilter {
        public static final int ALL = -1;
        public static final Companion Companion = new Companion(null);
        public static final int INBOUND = 4;
        public static final int OUTBOUND = 2;
        public static final int TRANSPORT = 1;

        @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m15073d2 = {"Lco/discord/media_engine/Connection$StatsFilter$Companion;", "", "()V", "ALL", "", "INBOUND", "OUTBOUND", "TRANSPORT", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, m15073d2 = {"Lco/discord/media_engine/Connection$UserSpeakingStatusChangedCallback;", "", "onUserSpeakingStatusChanged", "", "userId", "", "isUserSpeakingNow", "", "wantsPriority", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public interface UserSpeakingStatusChangedCallback {
        void onUserSpeakingStatusChanged(long j, boolean z, boolean z2);
    }

    private Connection(long j) {
        this.nativeInstance = j;
    }

    private final native void getStatsNative(GetStatsCallbackNative getStatsCallbackNative, int i);

    public final native void connectUser(long j, int i, int i2, int i3, boolean z, float f);

    public final native void deafenLocalUser(boolean z);

    public final native void disableVideo(long j, boolean z);

    public final native void disconnectUser(long j);

    public final native void dispose();

    public final native void enableDiscontinuousTransmission(boolean z);

    public final native void enableForwardErrorCorrection(boolean z);

    public final native void getEncryptionModes(EncryptionModesCallback encryptionModesCallback);

    public final long getNativeInstance() {
        return this.nativeInstance;
    }

    public final void getStats(GetStatsCallback callback) {
        C9971q.m14633g(callback, "callback");
        getStatsNative(new GetStatsCallbackNative(callback), -1);
    }

    public final native void muteLocalUser(boolean z);

    public final native void muteUser(long j, boolean z);

    public final native void setAudioInputMode(int i);

    public final native void setCodecs(AudioEncoder audioEncoder, VideoEncoder videoEncoder, AudioDecoder[] audioDecoderArr, VideoDecoder[] videoDecoderArr);

    public final native void setEncodingQuality(int i, int i2, int i3, int i4, int i5);

    public final native void setEncryptionSettings(EncryptionSettings encryptionSettings);

    public final native void setExpectedPacketLossRate(float f);

    public final native void setMinimumPlayoutDelay(int i);

    public final native void setOnVideoCallback(OnVideoCallback onVideoCallback);

    public final native void setPTTActive(boolean z);

    public final native void setQoS(boolean z);

    public final native void setUserPlayoutVolume(long j, float f);

    public final void setUserSpeakingStatusChangedCallback(UserSpeakingStatusChangedCallback callback) {
        C9971q.m14633g(callback, "callback");
        this.userSpeakingStatusChangedCallback = callback;
    }

    public final native void setVADAutoThreshold(int i);

    public final native void setVADLeadingFramesToBuffer(int i);

    public final native void setVADTrailingFramesToSend(int i);

    public final native void setVADTriggerThreshold(float f);

    public final native void setVADUseKrisp(boolean z);

    public final native void setVideoBroadcast(boolean z);

    public final native void simulatePacketLoss(float f);

    public final native void startScreenshareBroadcast(VideoCapturer videoCapturer, long j);

    public final native void stopScreenshareBroadcast();

    public final void getStats(GetStatsCallback callback, int i) {
        C9971q.m14633g(callback, "callback");
        getStatsNative(new GetStatsCallbackNative(callback), i);
    }
}
