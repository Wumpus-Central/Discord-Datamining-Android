package co.discord.media_engine;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, m15073d2 = {"Lco/discord/media_engine/PlayoutMetric;", "", "last", "", "mean", "p75", "p95", "p99", "max", "(DDDDDD)V", "getLast", "()D", "getMax", "getMean", "getP75", "getP95", "getP99", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class PlayoutMetric {
    private final double last;
    private final double max;
    private final double mean;
    private final double p75;
    private final double p95;
    private final double p99;

    public PlayoutMetric(double d, double d2, double d3, double d4, double d5, double d6) {
        this.last = d;
        this.mean = d2;
        this.p75 = d3;
        this.p95 = d4;
        this.p99 = d5;
        this.max = d6;
    }

    public final double component1() {
        return this.last;
    }

    public final double component2() {
        return this.mean;
    }

    public final double component3() {
        return this.p75;
    }

    public final double component4() {
        return this.p95;
    }

    public final double component5() {
        return this.p99;
    }

    public final double component6() {
        return this.max;
    }

    public final PlayoutMetric copy(double d, double d2, double d3, double d4, double d5, double d6) {
        return new PlayoutMetric(d, d2, d3, d4, d5, d6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayoutMetric)) {
            return false;
        }
        PlayoutMetric playoutMetric = (PlayoutMetric) obj;
        return Double.compare(this.last, playoutMetric.last) == 0 && Double.compare(this.mean, playoutMetric.mean) == 0 && Double.compare(this.p75, playoutMetric.p75) == 0 && Double.compare(this.p95, playoutMetric.p95) == 0 && Double.compare(this.p99, playoutMetric.p99) == 0 && Double.compare(this.max, playoutMetric.max) == 0;
    }

    public final double getLast() {
        return this.last;
    }

    public final double getMax() {
        return this.max;
    }

    public final double getMean() {
        return this.mean;
    }

    public final double getP75() {
        return this.p75;
    }

    public final double getP95() {
        return this.p95;
    }

    public final double getP99() {
        return this.p99;
    }

    public int hashCode() {
        return (((((((((Double.doubleToLongBits(this.last) * 31) + Double.doubleToLongBits(this.mean)) * 31) + Double.doubleToLongBits(this.p75)) * 31) + Double.doubleToLongBits(this.p95)) * 31) + Double.doubleToLongBits(this.p99)) * 31) + Double.doubleToLongBits(this.max);
    }

    public String toString() {
        return "PlayoutMetric(last=" + this.last + ", mean=" + this.mean + ", p75=" + this.p75 + ", p95=" + this.p95 + ", p99=" + this.p99 + ", max=" + this.max + ')';
    }
}
