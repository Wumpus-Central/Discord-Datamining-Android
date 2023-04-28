package com.brentvatne.exoplayer;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p028b8.C3396a;
import p080e8.AbstractC6753i;
import p080e8.C6760m;
import p459z7.C14576a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.brentvatne.exoplayer.h */
/* loaded from: classes.dex */
public class C4155h {

    /* renamed from: c */
    static final String[] f6994c = {"onVideoLoadStart", "onVideoLoad", "onVideoError", "onVideoProgress", "onVideoSeek", "onVideoEnd", "onVideoFullscreenPlayerWillPresent", "onVideoFullscreenPlayerDidPresent", "onVideoFullscreenPlayerWillDismiss", "onVideoFullscreenPlayerDidDismiss", "onPlaybackStalled", "onPlaybackResume", "onReadyForDisplay", "onVideoBuffer", "onVideoIdle", "onTimedMetadata", "onVideoAudioBecomingNoisy", "onAudioFocusChanged", "onPlaybackRateChange", "onVideoBandwidthUpdate"};

    /* renamed from: a */
    private final RCTEventEmitter f6995a;

    /* renamed from: b */
    private int f6996b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4155h(ReactContext reactContext) {
        this.f6995a = (RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class);
    }

    /* renamed from: q */
    private void m32520q(String str, WritableMap writableMap) {
        this.f6995a.receiveEvent(this.f6996b, str, writableMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m32536a() {
        m32520q("onVideoAudioBecomingNoisy", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m32535b(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("hasAudioFocus", z);
        m32520q("onAudioFocusChanged", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m32534c(double d, int i, int i2, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("bitrate", d);
        createMap.putInt("width", i2);
        createMap.putInt("height", i);
        createMap.putString("trackId", str);
        m32520q("onVideoBandwidthUpdate", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m32533d(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isBuffering", z);
        m32520q("onVideoBuffer", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m32532e() {
        m32520q("onVideoEnd", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m32531f(String str, Exception exc) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("errorString", str);
        createMap.putString("errorException", exc.toString());
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("error", createMap);
        m32520q("onVideoError", createMap2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m32530g() {
        m32520q("onVideoFullscreenPlayerDidDismiss", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m32529h() {
        m32520q("onVideoFullscreenPlayerDidPresent", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m32528i() {
        m32520q("onVideoFullscreenPlayerWillDismiss", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m32527j() {
        m32520q("onVideoFullscreenPlayerWillPresent", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m32526k() {
        m32520q("onVideoIdle", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m32525l(double d, double d2, int i, int i2, WritableArray writableArray, WritableArray writableArray2, WritableArray writableArray3, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("duration", d / 1000.0d);
        createMap.putDouble("currentTime", d2 / 1000.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("width", i);
        createMap2.putInt("height", i2);
        if (i > i2) {
            createMap2.putString("orientation", "landscape");
        } else {
            createMap2.putString("orientation", "portrait");
        }
        createMap.putMap("naturalSize", createMap2);
        createMap.putString("trackId", str);
        createMap.putArray("videoTracks", writableArray3);
        createMap.putArray("audioTracks", writableArray);
        createMap.putArray("textTracks", writableArray2);
        createMap.putBoolean("canPlayFastForward", true);
        createMap.putBoolean("canPlaySlowForward", true);
        createMap.putBoolean("canPlaySlowReverse", true);
        createMap.putBoolean("canPlayReverse", true);
        createMap.putBoolean("canPlayFastForward", true);
        createMap.putBoolean("canStepBackward", true);
        createMap.putBoolean("canStepForward", true);
        m32520q("onVideoLoad", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m32524m() {
        m32520q("onVideoLoadStart", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m32523n(float f) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("playbackRate", f);
        m32520q("onPlaybackRateChange", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m32522o(double d, double d2, double d3, double d4) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("currentTime", d / 1000.0d);
        createMap.putDouble("playableDuration", d2 / 1000.0d);
        createMap.putDouble("seekableDuration", d3 / 1000.0d);
        createMap.putDouble("currentPlaybackTime", d4);
        m32520q("onVideoProgress", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m32521p() {
        m32520q("onReadyForDisplay", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m32519r(long j, long j2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("currentTime", j / 1000.0d);
        createMap.putDouble("seekTime", j2 / 1000.0d);
        m32520q("onVideoSeek", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m32518s(int i) {
        this.f6996b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m32517t(C14576a aVar) {
        String str;
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < aVar.m183f(); i++) {
            C14576a.AbstractC14577b e = aVar.m184e(i);
            if (e instanceof AbstractC6753i) {
                AbstractC6753i iVar = (AbstractC6753i) e;
                if (iVar instanceof C6760m) {
                    str = ((C6760m) iVar).f14414m;
                } else {
                    str = "";
                }
                String str2 = iVar.f14402k;
                WritableMap createMap = Arguments.createMap();
                createMap.putString("identifier", str2);
                createMap.putString("value", str);
                createArray.pushMap(createMap);
            } else if (e instanceof C3396a) {
                C3396a aVar2 = (C3396a) e;
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("identifier", aVar2.f5428k);
                createMap2.putString("value", aVar2.f5429l);
                createArray.pushMap(createMap2);
            }
        }
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putArray("metadata", createArray);
        m32520q("onTimedMetadata", createMap3);
    }
}
