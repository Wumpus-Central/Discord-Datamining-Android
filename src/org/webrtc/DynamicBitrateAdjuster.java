package org.webrtc;

/* loaded from: classes8.dex */
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, this.bitrateAdjustmentScaleExp / 20.0d);
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (this.targetBitrateBps * getBitrateAdjustmentScale());
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i) {
        int i2 = this.targetFps;
        if (i2 != 0) {
            int i3 = this.targetBitrateBps;
            double d = this.deviationBytes + (i - ((i3 / BITS_PER_BYTE) / i2));
            this.deviationBytes = d;
            this.timeSinceLastAdjustmentMs += 1000.0d / i2;
            double d2 = i3 / BITS_PER_BYTE;
            double d3 = BITRATE_ADJUSTMENT_SEC * d2;
            double min = Math.min(d, d3);
            this.deviationBytes = min;
            double max = Math.max(min, -d3);
            this.deviationBytes = max;
            if (this.timeSinceLastAdjustmentMs > 3000.0d) {
                if (max > d2) {
                    int i4 = this.bitrateAdjustmentScaleExp - ((int) ((max / d2) + 0.5d));
                    this.bitrateAdjustmentScaleExp = i4;
                    this.bitrateAdjustmentScaleExp = Math.max(i4, -20);
                    this.deviationBytes = d2;
                } else {
                    double d4 = -d2;
                    if (max < d4) {
                        int i5 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d2) + 0.5d));
                        this.bitrateAdjustmentScaleExp = i5;
                        this.bitrateAdjustmentScaleExp = Math.min(i5, 20);
                        this.deviationBytes = d4;
                    }
                }
                this.timeSinceLastAdjustmentMs = 0.0d;
            }
        }
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i, int i2) {
        int i3 = this.targetBitrateBps;
        if (i3 > 0 && i < i3) {
            this.deviationBytes = (this.deviationBytes * i) / i3;
        }
        super.setTargets(i, i2);
    }
}
