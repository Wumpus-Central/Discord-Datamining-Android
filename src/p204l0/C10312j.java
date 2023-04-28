package p204l0;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import java.util.concurrent.Executor;

/* renamed from: l0.j */
/* loaded from: classes.dex */
public final class C10312j {
    /* renamed from: a */
    public static boolean m13647a(AudioRecordingConfiguration audioRecordingConfiguration) {
        boolean isClientSilenced;
        isClientSilenced = audioRecordingConfiguration.isClientSilenced();
        return isClientSilenced;
    }

    /* renamed from: b */
    public static void m13646b(AudioRecord audioRecord, Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.registerAudioRecordingCallback(executor, audioRecordingCallback);
    }

    /* renamed from: c */
    public static void m13645c(AudioRecord audioRecord, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
    }
}
