package com.hammerandchisel.libdiscord;

import android.content.Context;
import co.discord.media_engine.AudioInputDeviceDescription;
import co.discord.media_engine.AudioOutputDeviceDescription;
import co.discord.media_engine.CameraEnumeratorProvider;
import co.discord.media_engine.Connection;
import co.discord.media_engine.RtcRegion;
import co.discord.media_engine.SharedEglBaseContext;
import co.discord.media_engine.StreamParameters;
import co.discord.media_engine.VideoInputDeviceDescription;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

/* loaded from: classes3.dex */
public class Discord {
    public static final int LOGLEVEL_DEBUG = 1;
    public static final int LOGLEVEL_DEFAULT = 2;
    private Context context;
    private LocalVoiceLevelChangedCallback localVoiceLevelChangedCallback;
    private long nativeInstance;

    /* loaded from: classes3.dex */
    public interface AecConfigCallback {
        void onConfigureAEC(boolean z, boolean z2, boolean z3, boolean z4, boolean z5);
    }

    /* loaded from: classes3.dex */
    public interface BuiltinAECCallback {
        void onConfigureBuiltinAEC(boolean z, boolean z2, boolean z3);
    }

    /* loaded from: classes3.dex */
    public interface ConnectToServerCallback {
        void onConnectToServer(ConnectionInfo connectionInfo, String str);
    }

    /* loaded from: classes3.dex */
    public static class ConnectionInfo {
        public boolean isConnected;
        public String localAddress;
        public int localPort;
        public String protocol;

        ConnectionInfo(boolean z, String str, String str2, int i) {
            this.isConnected = z;
            this.protocol = str;
            this.localAddress = str2;
            this.localPort = i;
        }
    }

    /* loaded from: classes3.dex */
    public interface GetAudioInputDevicesCallback {
        void onDevices(AudioInputDeviceDescription[] audioInputDeviceDescriptionArr);
    }

    /* loaded from: classes3.dex */
    public interface GetAudioOutputDevicesCallback {
        void onDevices(AudioOutputDeviceDescription[] audioOutputDeviceDescriptionArr);
    }

    /* loaded from: classes3.dex */
    public interface GetAudioSubsystemCallback {
        void onAudioSubsystem(String str, String str2);
    }

    /* loaded from: classes3.dex */
    public interface GetRankedRtcRegionsCallback {
        void onRankedRtcRegions(String[] strArr);
    }

    /* loaded from: classes3.dex */
    public interface GetSupportedVideoCodecsCallback {
        void onSupportedVideoCodecs(String[] strArr);
    }

    /* loaded from: classes3.dex */
    public interface GetVideoInputDevicesCallback {
        void onDevices(VideoInputDeviceDescription[] videoInputDeviceDescriptionArr);
    }

    /* loaded from: classes3.dex */
    public interface LocalVoiceLevelChangedCallback {
        void onLocalVoiceLevelChanged(float f, int i);
    }

    /* loaded from: classes3.dex */
    public interface NoAudioInputCallback {
        void onNoAudioInput(boolean z);
    }

    /* loaded from: classes3.dex */
    public interface OnVideoCallback {
        void onVideo(long j, int i, String str, StreamParameters[] streamParametersArr);
    }

    /* loaded from: classes3.dex */
    public interface VideoFrameCallback {
        boolean onFrame(VideoFrame videoFrame);
    }

    static {
        System.loadLibrary("discord");
    }

    public Discord(Context context, int i) {
        this.context = context;
        CameraEnumeratorProvider.maybeInit(context);
        this.nativeInstance = nativeConstructor(context, SharedEglBaseContext.getEglContext(), i);
    }

    private native long nativeConstructor(Context context, EglBase.Context context2, int i);

    private native void setLocalVoiceLevelChangedCallbackNative(boolean z);

    public native Connection connectToServer(int i, long j, String str, int i2, StreamParameters[] streamParametersArr, ConnectToServerCallback connectToServerCallback);

    public native void crash();

    public native void dispose();

    @Deprecated
    public native void enableBuiltInAEC(boolean z);

    public native void enableBuiltInAEC(boolean z, BuiltinAECCallback builtinAECCallback);

    public native void getAudioInputDevices(GetAudioInputDevicesCallback getAudioInputDevicesCallback);

    public native void getAudioOutputDevices(GetAudioOutputDevicesCallback getAudioOutputDevicesCallback);

    public native void getAudioSubsystem(GetAudioSubsystemCallback getAudioSubsystemCallback);

    public native void getRankedRtcRegions(RtcRegion[] rtcRegionArr, GetRankedRtcRegionsCallback getRankedRtcRegionsCallback);

    public native void getSupportedVideoCodecs(GetSupportedVideoCodecsCallback getSupportedVideoCodecsCallback);

    public native void getVideoInputDevices(GetVideoInputDevicesCallback getVideoInputDevicesCallback);

    public native void setAudioInputEnabled(boolean z);

    public native void setAutomaticGainControl(boolean z);

    @Deprecated
    public native void setEchoCancellation(boolean z);

    public native void setEchoCancellation(boolean z, boolean z2, AecConfigCallback aecConfigCallback);

    public native void setKeepAliveChannel(boolean z);

    public void setLocalVoiceLevelChangedCallback(LocalVoiceLevelChangedCallback localVoiceLevelChangedCallback) {
        boolean z;
        this.localVoiceLevelChangedCallback = localVoiceLevelChangedCallback;
        if (localVoiceLevelChangedCallback != null) {
            z = true;
        } else {
            z = false;
        }
        setLocalVoiceLevelChangedCallbackNative(z);
    }

    public native void setMicVolume(float f);

    public native void setNoAudioInputCallback(NoAudioInputCallback noAudioInputCallback);

    public native void setNoAudioInputThreshold(float f);

    public native void setNoiseCancellation(boolean z);

    public native void setNoiseSuppression(boolean z);

    public native void setPlayoutDevice(int i);

    public native void setRecordingDevice(int i);

    public native void setSpeakerVolume(float f);

    public native void setVideoInputDevice(int i);

    public native void setVideoOutputSink(String str, VideoFrameCallback videoFrameCallback);

    public native void signalVideoOutputSinkReady(String str);

    public Discord(Context context) {
        this(context, 2);
    }
}
