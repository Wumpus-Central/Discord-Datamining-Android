package org.webrtc.audio;

import android.media.AudioTrack;
import android.os.Build;
import org.webrtc.Logging;

/* loaded from: classes8.dex */
class LowLatencyAudioBufferManager {
    private static final String TAG = "LowLatencyAudioBufferManager";
    private int prevUnderrunCount = 0;
    private int ticksUntilNextDecrease = 10;
    private boolean keepLoweringBufferSize = true;
    private int bufferIncreaseCounter = 0;

    public void maybeAdjustBufferSize(AudioTrack audioTrack) {
        int underrunCount;
        if (Build.VERSION.SDK_INT >= 26) {
            underrunCount = audioTrack.getUnderrunCount();
            if (underrunCount > this.prevUnderrunCount) {
                if (this.bufferIncreaseCounter < 5) {
                    int bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                    int playbackRate = (audioTrack.getPlaybackRate() / 100) + bufferSizeInFrames;
                    Logging.m9642d(TAG, "Underrun detected! Increasing AudioTrack buffer size from " + bufferSizeInFrames + " to " + playbackRate);
                    audioTrack.setBufferSizeInFrames(playbackRate);
                    this.bufferIncreaseCounter = this.bufferIncreaseCounter + 1;
                }
                this.keepLoweringBufferSize = false;
                this.prevUnderrunCount = underrunCount;
                this.ticksUntilNextDecrease = 10;
            } else if (this.keepLoweringBufferSize) {
                int i = this.ticksUntilNextDecrease - 1;
                this.ticksUntilNextDecrease = i;
                if (i <= 0) {
                    int playbackRate2 = audioTrack.getPlaybackRate() / 100;
                    int bufferSizeInFrames2 = audioTrack.getBufferSizeInFrames();
                    int max = Math.max(playbackRate2, bufferSizeInFrames2 - playbackRate2);
                    if (max != bufferSizeInFrames2) {
                        Logging.m9642d(TAG, "Lowering AudioTrack buffer size from " + bufferSizeInFrames2 + " to " + max);
                        audioTrack.setBufferSizeInFrames(max);
                    }
                    this.ticksUntilNextDecrease = 10;
                }
            }
        }
    }
}
