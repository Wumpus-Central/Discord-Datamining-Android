package co.discord.media_engine;

import android.media.AudioRecord;
import android.os.Process;
import android.util.Log;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.ThreadUtils;
import org.webrtc.TimestampAligner;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0002&'B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u001b\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0082 J\t\u0010\u0017\u001a\u00020\nH\u0082 J!\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\nH\u0082 J\u0011\u0010\u0019\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0082 J)\u0010\u001a\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0082 J\u0006\u0010\u001d\u001a\u00020\u0013J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u0010#\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010%\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m15073d2 = {"Lco/discord/media_engine/SoundshareAudioSource;", "", "()V", "audioRecord", "Landroid/media/AudioRecord;", "audioThread", "Lco/discord/media_engine/SoundshareAudioSource$AudioRecordThread;", "byteBuffer", "Ljava/nio/ByteBuffer;", "nativeInstance", "", "getNativeInstance", "()J", "released", "", "channelCountToConfiguration", "", "channels", "dataIsRecorded", "", "bytes", "timestampNanos", "nativeCacheDirectBufferAddress", "nativeCreateInstance", "nativeDataIsRecorded", "nativeDestroyInstance", "nativeSetSampleFormat", "sampleRate", "bitDepth", "release", "reportSoundshareAudioSourceError", "errorMessage", "", "reportSoundshareAudioSourceInitError", "reportSoundshareAudioSourceStartError", "setSampleFormat", "startRecording", "stopRecording", "AudioRecordThread", "Companion", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class SoundshareAudioSource {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SoundshareAudioSource";
    private static volatile boolean microphoneMute;
    private AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private final long nativeInstance = nativeCreateInstance();
    private boolean released;

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m15073d2 = {"Lco/discord/media_engine/SoundshareAudioSource$AudioRecordThread;", "Ljava/lang/Thread;", "name", "", "audioRecord", "Landroid/media/AudioRecord;", "byteBuffer", "Ljava/nio/ByteBuffer;", "timestamp", "", "(Lco/discord/media_engine/SoundshareAudioSource;Ljava/lang/String;Landroid/media/AudioRecord;Ljava/nio/ByteBuffer;J)V", "emptyBytes", "", "keepAlive", "", "run", "", "stopThread", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    private final class AudioRecordThread extends Thread {
        private final AudioRecord audioRecord;
        private final ByteBuffer byteBuffer;
        private final byte[] emptyBytes;
        private volatile boolean keepAlive = true;
        final /* synthetic */ SoundshareAudioSource this$0;
        private long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioRecordThread(SoundshareAudioSource soundshareAudioSource, String name, AudioRecord audioRecord, ByteBuffer byteBuffer, long j) {
            super(name);
            C9971q.m14633g(name, "name");
            C9971q.m14633g(audioRecord, "audioRecord");
            C9971q.m14633g(byteBuffer, "byteBuffer");
            this.this$0 = soundshareAudioSource;
            this.audioRecord = audioRecord;
            this.byteBuffer = byteBuffer;
            this.timestamp = j;
            this.emptyBytes = new byte[byteBuffer.capacity()];
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z;
            Process.setThreadPriority(-19);
            Companion companion = SoundshareAudioSource.Companion;
            if (this.audioRecord.getRecordingState() == 3) {
                z = true;
            } else {
                z = false;
            }
            companion.assertTrue(z);
            while (this.keepAlive) {
                AudioRecord audioRecord = this.audioRecord;
                ByteBuffer byteBuffer = this.byteBuffer;
                int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
                this.timestamp = TimestampAligner.getRtcTimeNanos();
                if (read == this.byteBuffer.capacity()) {
                    if (SoundshareAudioSource.microphoneMute) {
                        this.byteBuffer.clear();
                        this.byteBuffer.put(this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        this.this$0.dataIsRecorded(read, this.timestamp);
                    }
                } else {
                    String str = "AudioRecord.read failed: " + read;
                    Log.e(SoundshareAudioSource.TAG, str);
                    if (read == -3) {
                        this.keepAlive = false;
                        this.this$0.reportSoundshareAudioSourceError(str);
                    }
                }
            }
            try {
                this.audioRecord.stop();
            } catch (IllegalStateException e) {
                Log.e(SoundshareAudioSource.TAG, "AudioRecord.stop failed: " + e.getMessage());
            }
        }

        public final void stopThread() {
            this.keepAlive = false;
        }
    }

    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m15073d2 = {"Lco/discord/media_engine/SoundshareAudioSource$Companion;", "", "()V", "AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS", "", "BITS_PER_SAMPLE", "", "BUFFERS_PER_SECOND", "BUFFER_SIZE_FACTOR", "CALLBACK_BUFFER_SIZE_MS", "TAG", "", "microphoneMute", "", "assertTrue", "", "condition", "setMicrophoneMute", "mute", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void assertTrue(boolean z) {
            if (!z) {
                throw new AssertionError("Expected condition to be true");
            }
        }

        public final void setMicrophoneMute(boolean z) {
            Log.w(SoundshareAudioSource.TAG, "setMicrophoneMute(" + z + ')');
            SoundshareAudioSource.microphoneMute = z;
        }
    }

    private final int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void dataIsRecorded(int i, long j) {
        if (!this.released) {
            nativeDataIsRecorded(this.nativeInstance, i, j);
        }
    }

    private final native synchronized void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    private final native synchronized long nativeCreateInstance();

    private final native void nativeDataIsRecorded(long j, int i, long j2);

    private final native synchronized void nativeDestroyInstance(long j);

    private final native void nativeSetSampleFormat(long j, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportSoundshareAudioSourceError(String str) {
        Log.e(TAG, "Run-time recording error: " + str);
    }

    private final void reportSoundshareAudioSourceInitError(String str) {
        Log.e(TAG, "Init recording error: " + str);
    }

    private final void reportSoundshareAudioSourceStartError(String str) {
        Log.e(TAG, "Start recording error: " + str);
    }

    public final long getNativeInstance() {
        return this.nativeInstance;
    }

    public final synchronized void release() {
        if (!this.released) {
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord != null) {
                audioRecord.release();
            }
            this.audioRecord = null;
            nativeDestroyInstance(this.nativeInstance);
            this.released = true;
        }
    }

    public final void setSampleFormat(int i, int i2, int i3) {
        nativeSetSampleFormat(this.nativeInstance, i, i2, i3);
    }

    public final boolean startRecording(AudioRecord audioRecord) {
        boolean z;
        C9971q.m14633g(audioRecord, "audioRecord");
        int channelCount = audioRecord.getChannelCount();
        int sampleRate = audioRecord.getSampleRate();
        if (this.audioRecord != null) {
            reportSoundshareAudioSourceInitError("StartRecording called twice without StopRecording.");
            return false;
        }
        this.audioRecord = audioRecord;
        setSampleFormat(sampleRate, 16, channelCount);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(channelCount * 2 * (sampleRate / 100));
        this.byteBuffer = byteBuffer;
        nativeCacheDirectBufferAddress(this.nativeInstance, byteBuffer);
        int minBufferSize = AudioRecord.getMinBufferSize(sampleRate, channelCountToConfiguration(channelCount), 2);
        if (minBufferSize == -2 || minBufferSize == -1) {
            reportSoundshareAudioSourceInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return false;
        }
        Math.max(minBufferSize * 2, byteBuffer.capacity());
        if (audioRecord.getState() != 1) {
            reportSoundshareAudioSourceInitError("Failed to create a new AudioRecord instance");
            release();
            return false;
        }
        try {
            Companion companion = Companion;
            if (this.audioThread == null) {
                z = true;
            } else {
                z = false;
            }
            companion.assertTrue(z);
            long rtcTimeNanos = TimestampAligner.getRtcTimeNanos();
            try {
                audioRecord.startRecording();
                if (audioRecord.getRecordingState() != 3) {
                    reportSoundshareAudioSourceStartError("AudioRecord.startRecording failed - incorrect state :" + audioRecord.getRecordingState());
                    return false;
                }
                C9971q.m14634f(byteBuffer, "byteBuffer");
                AudioRecordThread audioRecordThread = new AudioRecordThread(this, "SoundshareThread", audioRecord, byteBuffer, rtcTimeNanos);
                this.audioThread = audioRecordThread;
                C9971q.m14636d(audioRecordThread);
                audioRecordThread.start();
                return true;
            } catch (IllegalStateException e) {
                reportSoundshareAudioSourceStartError("AudioRecord.startRecording failed: " + e.getMessage());
                return false;
            }
        } catch (Throwable th2) {
            Log.e(TAG, "SoundshareAudioSource.startRecording fail hard!", th2);
            throw th2;
        }
    }

    public final boolean stopRecording() {
        AudioRecordThread audioRecordThread = this.audioThread;
        if (audioRecordThread == null) {
            return false;
        }
        audioRecordThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(audioRecordThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
            Log.e(TAG, "Join of SoundshareThread timed out");
        }
        this.audioThread = null;
        return true;
    }
}
