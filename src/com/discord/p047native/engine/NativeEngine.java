package com.discord.p047native.engine;

import android.content.Context;
import co.discord.media_engine.CameraEnumeratorProvider;
import co.discord.media_engine.SharedEglBaseContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

@Metadata(m15074d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 J2\u00020\u0001:\u0010JKLMNOPQRSTUVWXYB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086 J!\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086 J\u0006\u0010\u0012\u001a\u00020\u0013J\u0011\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0086 J\u0011\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0018H\u0086 J\u0011\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u001aH\u0086 J\u0011\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u001cH\u0086 J\u0011\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u001eH\u0086 J\u0011\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020 H\u0086 J\u0011\u0010!\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\"H\u0086 J\u0011\u0010#\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020$H\u0086 J!\u0010%\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\t\u0010(\u001a\u00020\u0013H\u0082 J\u0019\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020+H\u0086 J\u0011\u0010,\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0086 J\u0011\u0010-\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0086 J\u0011\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\fH\u0086 J\u0011\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u0005H\u0086 J\u0011\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u000203H\u0086 J\u0011\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u000203H\u0086 J\u0011\u00106\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u000207H\u0086 J\u0011\u00108\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u000209H\u0086 J\u0011\u0010:\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020;H\u0086 J\u0011\u0010<\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\fH\u0086 J\u0011\u0010=\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u0005H\u0086 J\u0011\u0010>\u001a\u00020\u00132\u0006\u00102\u001a\u000203H\u0086 J\u0011\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\fH\u0086 J\u0011\u0010A\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\fH\u0086 J\u0011\u0010B\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u0005H\u0086 J\u001b\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010EH\u0086 J\u0019\u0010F\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020GH\u0086 J\u0011\u0010H\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020IH\u0086 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Z"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine;", "", "context", "Landroid/content/Context;", "logLevel", "", "(Landroid/content/Context;I)V", "nativeInstance", "", "createSpeedTestConnection", "Lcom/discord/native/engine/NativeSpeedTestConnection;", "userId", "", "connectionOptionsJSON", "callback", "Lcom/discord/native/engine/NativeEngine$ConnectToServerCallback;", "createVoiceConnection", "Lcom/discord/native/engine/NativeConnection;", "dispose", "", "enableBuiltInAEC", "enable", "", "getAudioSubsystem", "Lcom/discord/native/engine/NativeEngine$GetAudioSubsystemCallback;", "getCodecCapabilities", "Lcom/discord/native/engine/NativeEngine$GetCodecCapabilitiesCallback;", "getCodecSurvey", "Lcom/discord/native/engine/NativeEngine$GetCodecSurveyCallback;", "getInputDevices", "Lcom/discord/native/engine/NativeEngine$GetAudioInputDevicesCallback;", "getOutputDevices", "Lcom/discord/native/engine/NativeEngine$GetAudioOutputDevicesCallback;", "getSupportedVideoCodecs", "Lcom/discord/native/engine/NativeEngine$GetSupportedVideoCodecsCallback;", "getVideoInputDevices", "Lcom/discord/native/engine/NativeEngine$GetVideoInputDevicesCallback;", "nativeCreateInstance", "eglContext", "Lorg/webrtc/EglBase$Context;", "nativeDestroyInstance", "rankRtcRegions", "regionsWithIpsJSON", "Lcom/discord/native/engine/NativeEngine$GetRankedRtcRegionsCallback;", "setAudioInputEnabled", "setEmitVADLevel2", "setInputDevice", "deviceIndex", "setInputDeviceIndex", "setInputVolume", "volume", "", "setNoInputThreshold", "threshold", "setOnDeviceChangeCallback", "Lcom/discord/native/engine/NativeEngine$DeviceChangeCallback;", "setOnNoInputCallback", "Lcom/discord/native/engine/NativeEngine$OnNoInputCallback;", "setOnVoiceCallback", "Lcom/discord/native/engine/NativeEngine$OnVoiceCallback;", "setOutputDevice", "setOutputDeviceIndex", "setOutputVolume", "setTransportOptions", "optionsJSON", "setVideoInputDevice", "setVideoInputDeviceIndex", "setVideoOutputSink", "streamIdentifier", "Lcom/discord/native/engine/NativeEngine$VideoFrameCallback;", "startLocalAudioRecording", "Lcom/discord/native/engine/NativeEngine$StartLocalAudioRecordingCallback;", "stopLocalAudioRecording", "Lcom/discord/native/engine/NativeEngine$StopLocalAudioRecordingCallback;", "Companion", "ConnectToServerCallback", "DeviceChangeCallback", "GetAudioInputDevicesCallback", "GetAudioOutputDevicesCallback", "GetAudioSubsystemCallback", "GetCodecCapabilitiesCallback", "GetCodecSurveyCallback", "GetRankedRtcRegionsCallback", "GetSupportedVideoCodecsCallback", "GetVideoInputDevicesCallback", "OnNoInputCallback", "OnVoiceCallback", "StartLocalAudioRecordingCallback", "StopLocalAudioRecordingCallback", "VideoFrameCallback", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* renamed from: com.discord.native.engine.NativeEngine */
/* loaded from: classes5.dex */
public final class NativeEngine {
    public static final Companion Companion = new Companion(null);
    public static final int LOGLEVEL_DEBUG = 1;
    public static final int LOGLEVEL_DEFAULT = 2;
    private final int logLevel;
    private final long nativeInstance;

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$Companion;", "", "()V", "LOGLEVEL_DEBUG", "", "LOGLEVEL_DEFAULT", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$Companion */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$ConnectToServerCallback;", "", "onConnectToServer", "", "info", "Lcom/discord/native/engine/ConnectionInfo;", "error", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$ConnectToServerCallback */
    /* loaded from: classes5.dex */
    public interface ConnectToServerCallback {
        void onConnectToServer(ConnectionInfo connectionInfo, String str);
    }

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$DeviceChangeCallback;", "", "onChange", "", "audioInputDevices", "", "Lcom/discord/native/engine/AudioInputDeviceDescription;", "audioOutputDevices", "Lcom/discord/native/engine/AudioOutputDeviceDescription;", "videoInputDevices", "Lcom/discord/native/engine/VideoInputDeviceDescription;", "([Lcom/discord/native/engine/AudioInputDeviceDescription;[Lcom/discord/native/engine/AudioOutputDeviceDescription;[Lcom/discord/native/engine/VideoInputDeviceDescription;)V", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$DeviceChangeCallback */
    /* loaded from: classes5.dex */
    public interface DeviceChangeCallback {
        void onChange(AudioInputDeviceDescription[] audioInputDeviceDescriptionArr, AudioOutputDeviceDescription[] audioOutputDeviceDescriptionArr, VideoInputDeviceDescription[] videoInputDeviceDescriptionArr);
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$GetAudioInputDevicesCallback;", "", "onDevices", "", "devices", "", "Lcom/discord/native/engine/AudioInputDeviceDescription;", "([Lcom/discord/native/engine/AudioInputDeviceDescription;)V", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$GetAudioInputDevicesCallback */
    /* loaded from: classes5.dex */
    public interface GetAudioInputDevicesCallback {
        void onDevices(AudioInputDeviceDescription[] audioInputDeviceDescriptionArr);
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$GetAudioOutputDevicesCallback;", "", "onDevices", "", "devices", "", "Lcom/discord/native/engine/AudioOutputDeviceDescription;", "([Lcom/discord/native/engine/AudioOutputDeviceDescription;)V", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$GetAudioOutputDevicesCallback */
    /* loaded from: classes5.dex */
    public interface GetAudioOutputDevicesCallback {
        void onDevices(AudioOutputDeviceDescription[] audioOutputDeviceDescriptionArr);
    }

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$GetAudioSubsystemCallback;", "", "onAudioSubsystem", "", "subsystem", "", "audioLayer", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$GetAudioSubsystemCallback */
    /* loaded from: classes5.dex */
    public interface GetAudioSubsystemCallback {
        void onAudioSubsystem(String str, String str2);
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$GetCodecCapabilitiesCallback;", "", "onCodecCapabilities", "", "codecs", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$GetCodecCapabilitiesCallback */
    /* loaded from: classes5.dex */
    public interface GetCodecCapabilitiesCallback {
        void onCodecCapabilities(String str);
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$GetCodecSurveyCallback;", "", "onCodecSurvey", "", "jsonStr", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$GetCodecSurveyCallback */
    /* loaded from: classes5.dex */
    public interface GetCodecSurveyCallback {
        void onCodecSurvey(String str);
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$GetRankedRtcRegionsCallback;", "", "onRankedRtcRegions", "", "regions", "", "", "([Ljava/lang/String;)V", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$GetRankedRtcRegionsCallback */
    /* loaded from: classes5.dex */
    public interface GetRankedRtcRegionsCallback {
        void onRankedRtcRegions(String[] strArr);
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$GetSupportedVideoCodecsCallback;", "", "onSupportedVideoCodecs", "", "codecs", "", "", "([Ljava/lang/String;)V", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$GetSupportedVideoCodecsCallback */
    /* loaded from: classes5.dex */
    public interface GetSupportedVideoCodecsCallback {
        void onSupportedVideoCodecs(String[] strArr);
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$GetVideoInputDevicesCallback;", "", "onDevices", "", "devices", "", "Lcom/discord/native/engine/VideoInputDeviceDescription;", "([Lcom/discord/native/engine/VideoInputDeviceDescription;)V", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$GetVideoInputDevicesCallback */
    /* loaded from: classes5.dex */
    public interface GetVideoInputDevicesCallback {
        void onDevices(VideoInputDeviceDescription[] videoInputDeviceDescriptionArr);
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$OnNoInputCallback;", "", "onNoInput", "", "input", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$OnNoInputCallback */
    /* loaded from: classes5.dex */
    public interface OnNoInputCallback {
        void onNoInput(boolean z);
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$OnVoiceCallback;", "", "onVoice", "", "level", "", "speaking", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$OnVoiceCallback */
    /* loaded from: classes5.dex */
    public interface OnVoiceCallback {
        void onVoice(float f, int i);
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$StartLocalAudioRecordingCallback;", "", "onStartLocalAudioRecording", "", "started", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$StartLocalAudioRecordingCallback */
    /* loaded from: classes5.dex */
    public interface StartLocalAudioRecordingCallback {
        void onStartLocalAudioRecording(boolean z);
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$StopLocalAudioRecordingCallback;", "", "onStopLocalAudioRecording", "", "fileName", "", "durationMs", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$StopLocalAudioRecordingCallback */
    /* loaded from: classes5.dex */
    public interface StopLocalAudioRecordingCallback {
        void onStopLocalAudioRecording(String str, int i);
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/native/engine/NativeEngine$VideoFrameCallback;", "", "onFrame", "", "frame", "Lorg/webrtc/VideoFrame;", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.native.engine.NativeEngine$VideoFrameCallback */
    /* loaded from: classes5.dex */
    public interface VideoFrameCallback {
        boolean onFrame(VideoFrame videoFrame);
    }

    static {
        System.loadLibrary("discord");
    }

    public NativeEngine(Context context, int i) {
        C9677q.m14633g(context, "context");
        this.logLevel = i;
        Context applicationContext = context.getApplicationContext();
        C9677q.m14634f(applicationContext, "context.applicationContext");
        CameraEnumeratorProvider.maybeInit(applicationContext);
        Context applicationContext2 = context.getApplicationContext();
        C9677q.m14634f(applicationContext2, "context.applicationContext");
        EglBase.Context eglContext = SharedEglBaseContext.getEglContext();
        C9677q.m14634f(eglContext, "getEglContext()");
        this.nativeInstance = nativeCreateInstance(applicationContext2, eglContext, i);
    }

    private final native long nativeCreateInstance(Context context, EglBase.Context context2, int i);

    private final native void nativeDestroyInstance();

    public final native NativeSpeedTestConnection createSpeedTestConnection(String str, String str2, ConnectToServerCallback connectToServerCallback);

    public final native NativeConnection createVoiceConnection(String str, String str2, ConnectToServerCallback connectToServerCallback);

    public final void dispose() {
        nativeDestroyInstance();
    }

    public final native void enableBuiltInAEC(boolean z);

    public final native void getAudioSubsystem(GetAudioSubsystemCallback getAudioSubsystemCallback);

    public final native void getCodecCapabilities(GetCodecCapabilitiesCallback getCodecCapabilitiesCallback);

    public final native void getCodecSurvey(GetCodecSurveyCallback getCodecSurveyCallback);

    public final native void getInputDevices(GetAudioInputDevicesCallback getAudioInputDevicesCallback);

    public final native void getOutputDevices(GetAudioOutputDevicesCallback getAudioOutputDevicesCallback);

    public final native void getSupportedVideoCodecs(GetSupportedVideoCodecsCallback getSupportedVideoCodecsCallback);

    public final native void getVideoInputDevices(GetVideoInputDevicesCallback getVideoInputDevicesCallback);

    public final native void rankRtcRegions(String str, GetRankedRtcRegionsCallback getRankedRtcRegionsCallback);

    public final native void setAudioInputEnabled(boolean z);

    public final native void setEmitVADLevel2(boolean z);

    public final native void setInputDevice(String str);

    public final native void setInputDeviceIndex(int i);

    public final native void setInputVolume(float f);

    public final native void setNoInputThreshold(float f);

    public final native void setOnDeviceChangeCallback(DeviceChangeCallback deviceChangeCallback);

    public final native void setOnNoInputCallback(OnNoInputCallback onNoInputCallback);

    public final native void setOnVoiceCallback(OnVoiceCallback onVoiceCallback);

    public final native void setOutputDevice(String str);

    public final native void setOutputDeviceIndex(int i);

    public final native void setOutputVolume(float f);

    public final native void setTransportOptions(String str);

    public final native void setVideoInputDevice(String str);

    public final native void setVideoInputDeviceIndex(int i);

    public final native void setVideoOutputSink(String str, VideoFrameCallback videoFrameCallback);

    public final native void startLocalAudioRecording(String str, StartLocalAudioRecordingCallback startLocalAudioRecordingCallback);

    public final native void stopLocalAudioRecording(StopLocalAudioRecordingCallback stopLocalAudioRecordingCallback);
}
