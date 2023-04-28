package co.discord.media_engine;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u001a\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u001a\u0010\u000f\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u001a\u0010\u0010\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u001a\u0010\u0011\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m15073d2 = {"Lco/discord/media_engine/VoiceQuality;", "", "()V", "_duration", "Lco/discord/media_engine/Duration;", "_inboundStats", "", "", "Lco/discord/media_engine/InboundAudio;", "_outboundStats", "Lco/discord/media_engine/OutboundAudio;", "getBufferStats", "", "result", "getDurationStats", "getFrameOpStats", "getMosStats", "getPacketStats", "update", "stats", "Lco/discord/media_engine/Stats;", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class VoiceQuality {
    private Map<String, InboundAudio> _inboundStats = new LinkedHashMap();
    private OutboundAudio _outboundStats = new OutboundAudio(0, 0);
    private Duration _duration = new Duration(0, 0, 0, 0);

    public final void getBufferStats(Map<String, Object> result) {
        PlayoutMetric playoutMetric;
        PlayoutMetric playoutMetric2;
        PlayoutMetric playoutMetric3;
        PlayoutMetric playoutMetric4;
        PlayoutMetric audioJitterBuffer;
        C9971q.m14633g(result, "result");
        PlayoutMetric playoutMetric5 = null;
        InboundBufferStats inboundBufferStats = null;
        for (Map.Entry<String, InboundAudio> entry : this._inboundStats.entrySet()) {
            InboundAudio value = entry.getValue();
            if (inboundBufferStats == null) {
                inboundBufferStats = value.getBufferStats();
            } else {
                PlayoutMetric audioJitterBuffer2 = inboundBufferStats.getAudioJitterBuffer();
                if (!(audioJitterBuffer2 == null || (audioJitterBuffer = value.getBufferStats().getAudioJitterBuffer()) == null || audioJitterBuffer.getP75() <= audioJitterBuffer2.getP75())) {
                    inboundBufferStats = value.getBufferStats();
                }
            }
        }
        if (inboundBufferStats != null) {
            playoutMetric = inboundBufferStats.getAudioJitterBuffer();
        } else {
            playoutMetric = null;
        }
        VoiceQualityKt.explodePlayoutMetric("audio_jitter_buffer", playoutMetric, result);
        if (inboundBufferStats != null) {
            playoutMetric2 = inboundBufferStats.getAudioJitterTarget();
        } else {
            playoutMetric2 = null;
        }
        VoiceQualityKt.explodePlayoutMetric("audio_jitter_target", playoutMetric2, result);
        if (inboundBufferStats != null) {
            playoutMetric3 = inboundBufferStats.getAudioJitterDelay();
        } else {
            playoutMetric3 = null;
        }
        VoiceQualityKt.explodePlayoutMetric("audio_jitter_delay", playoutMetric3, result);
        if (inboundBufferStats != null) {
            playoutMetric4 = inboundBufferStats.getRelativeReceptionDelay();
        } else {
            playoutMetric4 = null;
        }
        VoiceQualityKt.explodePlayoutMetric("relative_reception_delay", playoutMetric4, result);
        if (inboundBufferStats != null) {
            playoutMetric5 = inboundBufferStats.getRelativePlayoutDelay();
        }
        VoiceQualityKt.explodePlayoutMetric("relative_playout_delay", playoutMetric5, result);
    }

    public final void getDurationStats(Map<String, Object> result) {
        C9971q.m14633g(result, "result");
        result.put("duration_listening", Integer.valueOf(this._duration.getListening()));
        result.put("duration_speaking", Integer.valueOf(this._duration.getSpeaking()));
        result.put("duration_participation", Integer.valueOf(this._duration.getParticipation()));
        result.put("duration_connected", Integer.valueOf(this._duration.getConnected()));
    }

    public final void getFrameOpStats(Map<String, Object> result) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        C9971q.m14633g(result, "result");
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Long l6 = null;
        Long l7 = null;
        for (Map.Entry<String, InboundAudio> entry : this._inboundStats.entrySet()) {
            InboundAudio value = entry.getValue();
            Long silent = value.getFrameOpStats().getSilent();
            long j7 = 0;
            if (silent != null) {
                long longValue = silent.longValue();
                if (l != null) {
                    j6 = l.longValue();
                } else {
                    j6 = 0;
                }
                l = Long.valueOf(j6 + longValue);
            }
            Long normal = value.getFrameOpStats().getNormal();
            if (normal != null) {
                long longValue2 = normal.longValue();
                if (l2 != null) {
                    j5 = l2.longValue();
                } else {
                    j5 = 0;
                }
                l2 = Long.valueOf(j5 + longValue2);
            }
            Long merged = value.getFrameOpStats().getMerged();
            if (merged != null) {
                long longValue3 = merged.longValue();
                if (l3 != null) {
                    j4 = l3.longValue();
                } else {
                    j4 = 0;
                }
                l3 = Long.valueOf(j4 + longValue3);
            }
            Long expanded = value.getFrameOpStats().getExpanded();
            if (expanded != null) {
                long longValue4 = expanded.longValue();
                if (l4 != null) {
                    j3 = l4.longValue();
                } else {
                    j3 = 0;
                }
                l4 = Long.valueOf(j3 + longValue4);
            }
            Long accelerated = value.getFrameOpStats().getAccelerated();
            if (accelerated != null) {
                long longValue5 = accelerated.longValue();
                if (l5 != null) {
                    j2 = l5.longValue();
                } else {
                    j2 = 0;
                }
                l5 = Long.valueOf(j2 + longValue5);
            }
            Long preemptiveExpanded = value.getFrameOpStats().getPreemptiveExpanded();
            if (preemptiveExpanded != null) {
                long longValue6 = preemptiveExpanded.longValue();
                if (l6 != null) {
                    j = l6.longValue();
                } else {
                    j = 0;
                }
                l6 = Long.valueOf(j + longValue6);
            }
            Long cng = value.getFrameOpStats().getCng();
            if (cng != null) {
                long longValue7 = cng.longValue();
                if (l7 != null) {
                    j7 = l7.longValue();
                }
                l7 = Long.valueOf(j7 + longValue7);
            }
        }
        if (l != null) {
            result.put("frame_op_silent", Long.valueOf(l.longValue()));
        }
        if (l2 != null) {
            result.put("frame_op_normal", Long.valueOf(l2.longValue()));
        }
        if (l3 != null) {
            result.put("frame_op_merged", Long.valueOf(l3.longValue()));
        }
        if (l4 != null) {
            result.put("frame_op_expanded", Long.valueOf(l4.longValue()));
        }
        if (l5 != null) {
            result.put("frame_op_accelerated", Long.valueOf(l5.longValue()));
        }
        if (l6 != null) {
            result.put("frame_op_preemptive_expanded", Long.valueOf(l6.longValue()));
        }
        if (l7 != null) {
            result.put("frame_op_cng", Long.valueOf(l7.longValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void getMosStats(Map<String, Object> result) {
        C9971q.m14633g(result, "result");
        Object[] objArr = new Integer[5];
        int i = 0;
        objArr[0] = 0;
        objArr[1] = 0;
        objArr[2] = 0;
        objArr[3] = 0;
        objArr[4] = 0;
        double d = 0.0d;
        int i2 = 0;
        for (Map.Entry<String, InboundAudio> entry : this._inboundStats.entrySet()) {
            InboundAudio value = entry.getValue();
            d += value.getMosSum();
            i2 += value.getMosCount();
            for (int i3 = 0; i3 < 5; i3++) {
                objArr[i3] = Integer.valueOf(objArr[i3].intValue() + value.getMosBuckets()[i3].intValue());
            }
        }
        if (i2 > 0) {
            i = Double.valueOf(d / i2);
        }
        result.put("mos_mean", i);
        result.put("mos_1", objArr[1]);
        result.put("mos_2", objArr[2]);
        result.put("mos_3", objArr[3]);
        result.put("mos_4", objArr[4]);
    }

    public final void getPacketStats(Map<String, Object> result) {
        C9971q.m14633g(result, "result");
        long j = 0;
        long j2 = 0;
        for (Map.Entry<String, InboundAudio> entry : this._inboundStats.entrySet()) {
            InboundAudio value = entry.getValue();
            j += value.getPacketsReceived();
            j2 += value.getPacketsLost();
        }
        result.put("packets_sent", Long.valueOf(this._outboundStats.getPacketsSent()));
        result.put("packets_sent_lost", Integer.valueOf(this._outboundStats.getPacketsLost()));
        result.put("packets_received", Long.valueOf(j));
        result.put("packets_received_lost", Long.valueOf(j2));
    }

    public final void update(Stats stats) {
        OutboundAudio outboundAudio;
        int i;
        int i2;
        int i3;
        int i4;
        Iterator<Map.Entry<String, InboundRtpAudio>> it;
        int i5;
        InboundAudio inboundAudio;
        double d;
        int i6;
        double clamp;
        double _calculateMos;
        C9971q.m14633g(stats, "stats");
        Duration duration = this._duration;
        duration.setConnected(duration.getConnected() + 1);
        long packetsSent = this._outboundStats.getPacketsSent();
        long j = 0;
        long j2 = 0;
        for (Map.Entry<String, InboundAudio> entry : this._inboundStats.entrySet()) {
            j2 += entry.getValue().getPacketsReceived();
        }
        OutboundRtpAudio outboundRtpAudio = stats.getOutboundRtpAudio();
        int i7 = 0;
        if (outboundRtpAudio != null) {
            outboundAudio = new OutboundAudio(outboundRtpAudio.getPacketsSent(), outboundRtpAudio.getPacketsLost());
        } else {
            outboundAudio = new OutboundAudio(0L, 0);
        }
        this._outboundStats = outboundAudio;
        Iterator<Map.Entry<String, InboundRtpAudio>> it2 = stats.getInboundRtpAudio().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, InboundRtpAudio> next = it2.next();
            String key = next.getKey();
            InboundRtpAudio value = next.getValue();
            Transport transport = stats.getTransport();
            if (transport != null) {
                i4 = transport.getPing();
            } else {
                i4 = i7;
            }
            long packetsReceived = value.getPacketsReceived();
            long packetsLost = value.getPacketsLost();
            int jitterBuffer = (int) value.getJitterBuffer();
            InboundBufferStats inboundBufferStats = new InboundBufferStats(value.getAudioJitterBuffer(), value.getAudioJitterTarget(), value.getAudioJitterDelay(), value.getRelativeReceptionDelay(), value.getRelativePlayoutDelay());
            InboundFrameOpStats inboundFrameOpStats = new InboundFrameOpStats(value.getOpSilence(), value.getOpNormal(), value.getOpMerge(), value.getOpExpand(), value.getOpAccelerate(), value.getOpPreemptiveExpand(), value.getOpCNG());
            Map<String, InboundAudio> map = this._inboundStats;
            InboundAudio inboundAudio2 = map.get(key);
            if (inboundAudio2 != null) {
                long packetsReceived2 = packetsReceived - inboundAudio2.getPacketsReceived();
                it = it2;
                long packetsLost2 = packetsLost - inboundAudio2.getPacketsLost();
                Integer[] mosBuckets = inboundAudio2.getMosBuckets();
                if (packetsReceived2 <= j || packetsLost2 < j) {
                    d = 0.0d;
                } else {
                    clamp = VoiceQualityKt.clamp(packetsLost2 / (packetsReceived2 + packetsLost2), 0.0d, 1.0d);
                    _calculateMos = VoiceQualityKt._calculateMos(i4 + jitterBuffer, clamp);
                    int floor = (int) Math.floor(_calculateMos);
                    mosBuckets[floor] = Integer.valueOf(mosBuckets[floor].intValue() + 1);
                    d = _calculateMos;
                }
                double mosSum = inboundAudio2.getMosSum() + d;
                int mosCount = inboundAudio2.getMosCount();
                if (d > 0.0d) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                inboundAudio = new InboundAudio(packetsReceived, packetsLost, d, mosSum, mosCount + i6, mosBuckets, inboundBufferStats, inboundFrameOpStats);
                i5 = 0;
            } else {
                it = it2;
                i5 = 0;
                inboundAudio = new InboundAudio(packetsReceived, packetsLost, 0.0d, 0.0d, 0, new Integer[]{0, 0, 0, 0, 0}, inboundBufferStats, inboundFrameOpStats);
            }
            map.put(key, inboundAudio);
            i7 = i5;
            it2 = it;
            j = 0;
        }
        if (this._outboundStats.getPacketsSent() > packetsSent) {
            Duration duration2 = this._duration;
            duration2.setSpeaking(duration2.getSpeaking() + 1);
            i = 1;
        } else {
            i = i7;
        }
        long j3 = 0;
        for (Map.Entry<String, InboundAudio> entry2 : this._inboundStats.entrySet()) {
            j3 += entry2.getValue().getPacketsReceived();
        }
        if (j3 > j2) {
            Duration duration3 = this._duration;
            i2 = 1;
            duration3.setListening(duration3.getListening() + 1);
            i3 = 1;
        } else {
            i2 = 1;
            i3 = i7;
        }
        if (!(i == 0 && i3 == 0)) {
            Duration duration4 = this._duration;
            duration4.setParticipation(duration4.getParticipation() + i2);
        }
    }
}
