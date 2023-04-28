package p204l0;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;

/* renamed from: l0.c */
/* loaded from: classes.dex */
public final class C10305c {
    /* renamed from: a */
    public static int m13655a(AudioRecordingConfiguration audioRecordingConfiguration) {
        int clientAudioSessionId;
        clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
        return clientAudioSessionId;
    }

    /* renamed from: b */
    public static int m13654b(AudioRecord audioRecord, AudioTimestamp audioTimestamp, int i) {
        int timestamp;
        timestamp = audioRecord.getTimestamp(audioTimestamp, i);
        return timestamp;
    }
}
