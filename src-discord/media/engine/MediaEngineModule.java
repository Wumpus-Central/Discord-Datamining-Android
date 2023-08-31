package com.discord.media.engine;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import com.discord.media.engine.types.Debug;
import com.discord.media.engine.video.events.ActiveSinksChangeEvent;
import com.discord.media.engine.video.events.DeviceChangedEvent;
import com.discord.media.engine.video.events.FirstFrameCallbackEvent;
import com.discord.media.engine.video.events.NoInputCallbackEvent;
import com.discord.media.engine.video.events.OnBroadcastRequestedEvent;
import com.discord.media.engine.video.events.OnBroadcastThumbnailEvent;
import com.discord.media.engine.video.events.OnVideoCallbackEvent;
import com.discord.media.engine.video.events.OnVoiceEvent;
import com.discord.media.engine.video.events.PingCallbackEvent;
import com.discord.media.engine.video.events.PingTimeoutCallbackEvent;
import com.discord.media.engine.video.events.SpeedTestPingCallbackEvent;
import com.discord.media.engine.video.events.SpeedTestPingTimeoutCallbackEvent;
import com.discord.media.engine.video.events.UserSpeakingEvent;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import java.util.Map;
import jf.x;
import kf.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@ReactModule(name = MediaEngineModule.NAME)
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 \u009a\u00012\u00020\u0001:\u0002\u009a\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J/\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007J\u001f\u0010#\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010%J\u001f\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J'\u0010*\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010,J\u001f\u0010-\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J\u001f\u0010.\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u00101J(\u00102\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u0002052\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J'\u00106\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u00107\u001a\u000205H\u0007¢\u0006\u0002\u00108J/\u00109\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0007¢\u0006\u0002\u0010=J'\u0010>\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020;H\u0007¢\u0006\u0002\u0010@J\u001f\u0010A\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010CJ\u001f\u0010D\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010E\u001a\u00020;H\u0007¢\u0006\u0002\u0010FJ'\u0010G\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010H\u001a\u0002052\u0006\u0010I\u001a\u000205H\u0007¢\u0006\u0002\u0010JJ\u001f\u0010K\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010CJ\u001f\u0010M\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010N\u001a\u000205H\u0007¢\u0006\u0002\u0010OJ\u001f\u0010P\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010Q\u001a\u000205H\u0007¢\u0006\u0002\u0010OJ\u001f\u0010R\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010S\u001a\u00020TH\u0007¢\u0006\u0002\u0010UJ\u001f\u0010V\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010W\u001a\u000205H\u0007¢\u0006\u0002\u0010OJ\u0010\u0010X\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007JF\u0010Y\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020T2$\u0010'\u001a \u0012\u0004\u0012\u00020\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020]0\\\u0012\u0004\u0012\u00020\u00170[H\u0002J(\u0010^\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007JF\u0010_\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020T2$\u0010'\u001a \u0012\u0004\u0012\u00020\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020]0\\\u0012\u0004\u0012\u00020\u00170[H\u0002J(\u0010`\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007J(\u0010a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010b\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010c\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010d\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\u0016\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010]0fH\u0016J\u0010\u0010g\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\b\u0010h\u001a\u00020\u001bH\u0016J\u0010\u0010i\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010j\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010k\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\b\u0010l\u001a\u00020\u0017H\u0016J\b\u0010m\u001a\u00020\u0017H\u0016J\u0018\u0010n\u001a\u00020\u00172\u0006\u0010o\u001a\u0002002\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010p\u001a\u00020\u00172\u0006\u0010q\u001a\u00020\u0012H\u0007J\u0010\u0010r\u001a\u00020\u00172\u0006\u0010s\u001a\u00020\u001bH\u0007J\u0010\u0010t\u001a\u00020\u00172\u0006\u0010u\u001a\u000205H\u0007J \u0010v\u001a\u00020\u00172\u0006\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00122\u0006\u0010y\u001a\u00020\u0012H\u0007J\u0010\u0010z\u001a\u00020\u00172\u0006\u0010{\u001a\u000205H\u0007J\u0010\u0010|\u001a\u00020\u00172\u0006\u0010}\u001a\u000205H\u0007J\u0011\u0010~\u001a\u00020\u00172\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0007J\u0011\u0010\u0081\u0001\u001a\u00020\u00172\u0006\u0010?\u001a\u00020;H\u0007J\u0011\u0010\u0082\u0001\u001a\u00020\u00172\u0006\u0010E\u001a\u00020;H\u0007J\u0012\u0010\u0083\u0001\u001a\u00020\u00172\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0007J\u0011\u0010\u0084\u0001\u001a\u00020\u00172\u0006\u0010?\u001a\u00020;H\u0007J\u0011\u0010\u0085\u0001\u001a\u00020\u00172\u0006\u0010S\u001a\u00020TH\u0007J\u0012\u0010\u0086\u0001\u001a\u00020\u00172\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0007J\u0011\u0010\u0087\u0001\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007J \u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J \u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J \u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010CJ \u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010S\u001a\u00020TH\u0007¢\u0006\u0002\u0010UJ)\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010S\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0003\u0010\u008d\u0001J)\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010S\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0003\u0010\u008d\u0001J \u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J\u0019\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007¢\u0006\u0003\u0010\u0091\u0001J\t\u0010\u0092\u0001\u001a\u00020\u0017H\u0007J\u0019\u0010\u0093\u0001\u001a\u00020\u00172\u0006\u0010S\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007J\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0003\u0010\u0095\u0001J\"\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00172\u0007\u0010\u0097\u0001\u001a\u00020\u00122\u0007\u0010\u0098\u0001\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010%J\u0011\u0010\u0099\u0001\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u009b\u0001"}, d2 = {"Lcom/discord/media/engine/MediaEngineModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "activityEventListener", "Lcom/facebook/react/bridge/ActivityEventListener;", "mediaEngine", "Lcom/discord/media/engine/MediaEngine;", "getMediaEngine", "()Lcom/discord/media/engine/MediaEngine;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "startNs", "", "streamConnectionId", "", "Ljava/lang/Integer;", "streamPermissions", "Landroid/content/Intent;", "addConnectionCallbacks", "", "connectionId", "addListener", "type", "", "addSpeedTestConnectionCallbacks", "connectionInstanceConfigureConnectionRetries", "baseDelayMs", "maxDelayMs", "maxAttempts", "(IIII)Lkotlin/Unit;", "connectionInstanceDestroy", "connectionInstanceDestroyUser", "userId", "(ILjava/lang/String;)Lkotlin/Unit;", "connectionInstanceGetEncryptionModes", "callback", "Lcom/facebook/react/bridge/Callback;", "(ILcom/facebook/react/bridge/Callback;)Lkotlin/Unit;", "connectionInstanceGetFilteredStats", "filter", "(IILcom/facebook/react/bridge/Callback;)Lkotlin/Unit;", "connectionInstanceGetStats", "connectionInstanceMergeUsers", "users", "Lcom/facebook/react/bridge/ReadableArray;", "(ILcom/facebook/react/bridge/ReadableArray;)Lkotlin/Unit;", "connectionInstanceSetDesktopSource", "stringId", "useVideoHook", "", "connectionInstanceSetLocalMute", "mute", "(ILjava/lang/String;Z)Lkotlin/Unit;", "connectionInstanceSetLocalPan", ViewProps.LEFT, "", ViewProps.RIGHT, "(ILjava/lang/String;FF)Lkotlin/Unit;", "connectionInstanceSetLocalVolume", "volume", "(ILjava/lang/String;F)Lkotlin/Unit;", "connectionInstanceSetMinimumOutputDelay", "delay", "(II)Lkotlin/Unit;", "connectionInstanceSetNoInputThreshold", "threshold", "(IF)Lkotlin/Unit;", "connectionInstanceSetPTTActive", AppStateModule.APP_STATE_ACTIVE, "priority", "(IZZ)Lkotlin/Unit;", "connectionInstanceSetPingInterval", "pingInterval", "connectionInstanceSetSelfDeafen", "deafened", "(IZ)Lkotlin/Unit;", "connectionInstanceSetSelfMute", "muted", "connectionInstanceSetTransportOptions", "options", "Lcom/facebook/react/bridge/ReadableMap;", "(ILcom/facebook/react/bridge/ReadableMap;)Lkotlin/Unit;", "connectionInstanceSetVideoBroadcast", "broadcasting", "connectionInstanceTriggerOnVideoCallback", "createConnection", "connectionOptions", "Lkotlin/Function2;", "", "", "createOwnStreamConnectionWithOptions", "createSpeedTestConnection", "createSpeedTestConnectionWithOptions", "createVoiceConnectionWithOptions", "getAudioSubsystem", "getCodecCapabilities", "getCodecSurvey", "getConstants", "", "getInputDevices", "getName", "getOutputDevices", "getSupportedVideoCodecs", "getVideoInputDevices", "initialize", "invalidate", "rankRtcRegions", "regionsWithIps", "removeListeners", "count", "setAVAudioSessionMode", "mode", "setAudioInputEnabled", ViewProps.ENABLED, "setBroadcastThumbnailParams", "width", "height", "intervalSeconds", "setEmitVADLevel2", "enable", "setHasFullbandPerformance", "hasFullbandPerformance", "setInputDevice", "deviceIndex", "Lcom/facebook/react/bridge/Dynamic;", "setInputVolume", "setNoInputThreshold", "setOutputDevice", "setOutputVolume", "setTransportOptions", "setVideoInputDevice", "speedTestConnectionInstanceDestroy", "speedTestConnectionInstanceGetEncryptionModes", "speedTestConnectionInstanceGetNetworkOverhead", "speedTestConnectionInstanceSetPingInterval", "speedTestConnectionInstanceSetTransportOptions", "speedTestConnectionInstanceStartSpeedTestReceiver", "(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)Lkotlin/Unit;", "speedTestConnectionInstanceStartSpeedTestSender", "speedTestConnectionInstanceStopSpeedTestReceiver", "speedTestConnectionInstanceStopSpeedTestSender", "(I)Lkotlin/Unit;", "startBroadcast", "startLocalAudioRecording", "stopBroadcast", "()Lkotlin/Unit;", "stopBroadcastWithError", "errorCode", "errorMessage", "stopLocalAudioRecording", "Companion", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MediaEngineModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "VoiceEngine";
    private static final int START_SCREENSHARE_REQUEST_CODE = 420;
    private static final String TAG = "MediaEngineModule";
    private final MediaEngine mediaEngine;
    private final ReactApplicationContext reactContext;
    private Integer streamConnectionId;
    private Intent streamPermissions;
    private final long startNs = System.nanoTime();
    private final ReactEvents reactEvents = new ReactEvents(x.a("no-input-callback", f0.b(NoInputCallbackEvent.class)), x.a("on-voice", f0.b(OnVoiceEvent.class)), x.a("device-changed", f0.b(DeviceChangedEvent.class)), x.a("on-broadcast-requested", f0.b(OnBroadcastRequestedEvent.class)), x.a("on-broadcast-thumbnail", f0.b(OnBroadcastThumbnailEvent.class)), x.a("user-speaking", f0.b(UserSpeakingEvent.class)), x.a("ping-callback", f0.b(PingCallbackEvent.class)), x.a("ping-timeout-callback", f0.b(PingTimeoutCallbackEvent.class)), x.a("on-video-callback", f0.b(OnVideoCallbackEvent.class)), x.a("active-sinks-change", f0.b(ActiveSinksChangeEvent.class)), x.a("speed-test-ping-callback", f0.b(SpeedTestPingCallbackEvent.class)), x.a("speed-test-ping-timeout-callback", f0.b(SpeedTestPingTimeoutCallbackEvent.class)), x.a("on-first-frame-callback", f0.b(FirstFrameCallbackEvent.class)));
    private final ActivityEventListener activityEventListener = new ActivityEventListener() { 
        @Override 
        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
            ReactEvents reactEvents;
            if (i11 == -1 && i10 == 420 && intent != null) {
                MediaEngineModule.this.streamPermissions = intent;
                reactEvents = MediaEngineModule.this.reactEvents;
                reactEvents.emitModuleEvent(MediaEngineModule.this.getReactContext(), new OnBroadcastRequestedEvent());
            }
        }

        @Override 
        public void onNewIntent(Intent intent) {
        }
    };

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\rH\u0082\bJ\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/media/engine/MediaEngineModule$Companion;", "", "()V", "NAME", "", "START_SCREENSHARE_REQUEST_CODE", "", "TAG", "setDeviceIndex", "", "deviceIndex", "Lcom/facebook/react/bridge/Dynamic;", "setInt", "Lkotlin/Function1;", "setString", "createScreenCaptureIntent", "Landroid/content/Intent;", "Landroid/content/Context;", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        
        public  class WhenMappings {
            public static final  int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        
        public final Intent createScreenCaptureIntent(Context context) {
            Object systemService = context.getSystemService("media_projection");
            q.f(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
            Intent createScreenCaptureIntent = ((MediaProjectionManager) systemService).createScreenCaptureIntent();
            q.g(createScreenCaptureIntent, "getSystemService(Context…eateScreenCaptureIntent()");
            return createScreenCaptureIntent;
        }

        private final void setDeviceIndex(Dynamic dynamic, Function1<? super Integer, Unit> function1, Function1<? super String, Unit> function12) {
            int i10;
            ReadableType type = dynamic.getType();
            if (type == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            }
            if (i10 == 1) {
                function1.invoke(Integer.valueOf(dynamic.asInt()));
            } else if (i10 == 2) {
                String asString = dynamic.asString();
                q.g(asString, "deviceIndex.asString()");
                function12.invoke(asString);
            } else {
                ReadableType type2 = dynamic.getType();
                throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
            }
        }
    }

    
    public MediaEngineModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.mediaEngine = new MediaEngine(reactContext, null, 2, null);
        Debug.INSTANCE.logDebugLoggingConfig();
    }

    private final void addConnectionCallbacks(int i10) {
        this.mediaEngine.connectionInstanceSetOnSpeakingCallback$media_engine_release(i10, new MediaEngineModule$addConnectionCallbacks$1(this, i10));
        this.mediaEngine.connectionInstanceSetOnPingCallback$media_engine_release(i10, new MediaEngineModule$addConnectionCallbacks$2(this, i10));
        this.mediaEngine.connectionInstanceSetOnPingTimeoutCallback$media_engine_release(i10, new MediaEngineModule$addConnectionCallbacks$3(this, i10));
        this.mediaEngine.connectionInstanceSetOnFirstFrameCallback$media_engine_release(i10, new MediaEngineModule$addConnectionCallbacks$4(this, i10));
    }

    private final void addSpeedTestConnectionCallbacks(int i10) {
        this.mediaEngine.speedTestConnectionInstanceSetOnPingCallback$media_engine_release(i10, new MediaEngineModule$addSpeedTestConnectionCallbacks$1(this, i10));
        this.mediaEngine.speedTestConnectionInstanceSetOnPingTimeoutCallback$media_engine_release(i10, new MediaEngineModule$addSpeedTestConnectionCallbacks$2(this, i10));
    }

    private final void createConnection(int i10, String str, ReadableMap readableMap, Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        this.mediaEngine.createVoiceConnection(i10, str, NativeMapExtensionsKt.toJsonString(readableMap), function2);
    }

    private final void createSpeedTestConnection(int i10, String str, ReadableMap readableMap, Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        this.mediaEngine.createSpeedTestConnection(i10, str, NativeMapExtensionsKt.toJsonString(readableMap), function2);
    }

    @ReactMethod
    public final void addListener(String type) {
        q.h(type, "type");
    }

    @ReactMethod
    public final Unit connectionInstanceConfigureConnectionRetries(int i10, int i11, int i12, int i13) {
        return this.mediaEngine.connectionInstanceConfigureConnectionRetries$media_engine_release(i10, i11, i12, i13);
    }

    @ReactMethod
    public final void connectionInstanceDestroy(int i10) {
        this.mediaEngine.connectionInstanceDestroy$media_engine_release(i10);
        Integer num = this.streamConnectionId;
        if (num != null && i10 == num.intValue()) {
            this.streamConnectionId = null;
        }
    }

    @ReactMethod
    public final Unit connectionInstanceDestroyUser(int i10, String userId) {
        q.h(userId, "userId");
        return this.mediaEngine.connectionInstanceDestroyUser$media_engine_release(i10, userId);
    }

    @ReactMethod
    public final Unit connectionInstanceGetEncryptionModes(int i10, Callback callback) {
        q.h(callback, "callback");
        return this.mediaEngine.connectionInstanceGetEncryptionModes$media_engine_release(i10, new MediaEngineModule$connectionInstanceGetEncryptionModes$1(callback));
    }

    @ReactMethod
    public final Unit connectionInstanceGetFilteredStats(int i10, int i11, Callback callback) {
        q.h(callback, "callback");
        return this.mediaEngine.connectionInstanceGetFilteredStats$media_engine_release(i10, i11, new MediaEngineModule$connectionInstanceGetFilteredStats$1(callback));
    }

    @ReactMethod
    public final Unit connectionInstanceGetStats(int i10, Callback callback) {
        q.h(callback, "callback");
        return this.mediaEngine.connectionInstanceGetStats$media_engine_release(i10, new MediaEngineModule$connectionInstanceGetStats$1(callback));
    }

    @ReactMethod
    public final Unit connectionInstanceMergeUsers(int i10, ReadableArray users) {
        q.h(users, "users");
        return this.mediaEngine.connectionInstanceMergeUsers$media_engine_release(i10, NativeArrayExtensionsKt.toJsonString(users));
    }

    @ReactMethod
    public final void connectionInstanceSetDesktopSource(int i10, String stringId, boolean z10, String type) {
        q.h(stringId, "stringId");
        q.h(type, "type");
    }

    @ReactMethod
    public final Unit connectionInstanceSetLocalMute(int i10, String userId, boolean z10) {
        q.h(userId, "userId");
        return this.mediaEngine.connectionInstanceSetLocalMute$media_engine_release(i10, userId, z10);
    }

    @ReactMethod
    public final Unit connectionInstanceSetLocalPan(int i10, String userId, float f10, float f11) {
        q.h(userId, "userId");
        return this.mediaEngine.connectionInstanceSetLocalPan$media_engine_release(i10, userId, f10, f11);
    }

    @ReactMethod
    public final Unit connectionInstanceSetLocalVolume(int i10, String userId, float f10) {
        q.h(userId, "userId");
        return this.mediaEngine.connectionInstanceSetLocalVolume$media_engine_release(i10, userId, f10);
    }

    @ReactMethod
    public final Unit connectionInstanceSetMinimumOutputDelay(int i10, int i11) {
        return this.mediaEngine.connectionInstanceSetMinimumOutputDelay$media_engine_release(i10, i11);
    }

    @ReactMethod
    public final Unit connectionInstanceSetNoInputThreshold(int i10, float f10) {
        return this.mediaEngine.connectionInstanceSetNoInputThreshold$media_engine_release(i10, f10);
    }

    @ReactMethod
    public final Unit connectionInstanceSetPTTActive(int i10, boolean z10, boolean z11) {
        return this.mediaEngine.connectionInstanceSetPTTActive$media_engine_release(i10, z10, z11);
    }

    @ReactMethod
    public final Unit connectionInstanceSetPingInterval(int i10, int i11) {
        return this.mediaEngine.connectionInstanceSetPingInterval$media_engine_release(i10, i11);
    }

    @ReactMethod
    public final Unit connectionInstanceSetSelfDeafen(int i10, boolean z10) {
        return this.mediaEngine.connectionInstanceSetSelfDeafen$media_engine_release(i10, z10);
    }

    @ReactMethod
    public final Unit connectionInstanceSetSelfMute(int i10, boolean z10) {
        return this.mediaEngine.connectionInstanceSetSelfMute$media_engine_release(i10, z10);
    }

    @ReactMethod
    public final Unit connectionInstanceSetTransportOptions(int i10, ReadableMap options) {
        q.h(options, "options");
        return this.mediaEngine.connectionInstanceSetTransportOptions$media_engine_release(i10, NativeMapExtensionsKt.toJsonString(options));
    }

    @ReactMethod
    public final Unit connectionInstanceSetVideoBroadcast(int i10, boolean z10) {
        return this.mediaEngine.connectionInstanceSetVideoBroadcast$media_engine_release(i10, z10);
    }

    @ReactMethod
    public final void connectionInstanceTriggerOnVideoCallback(int i10) {
        this.mediaEngine.connectionInstanceSetOnVideoCallback$media_engine_release(i10, new MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1(this, i10));
    }

    @ReactMethod
    public final void createOwnStreamConnectionWithOptions(int i10, String userId, ReadableMap connectionOptions, Callback callback) {
        q.h(userId, "userId");
        q.h(connectionOptions, "connectionOptions");
        q.h(callback, "callback");
        createConnection(i10, userId, connectionOptions, new MediaEngineModule$createOwnStreamConnectionWithOptions$1(callback, this, i10));
        this.streamConnectionId = Integer.valueOf(i10);
        addConnectionCallbacks(i10);
    }

    @ReactMethod
    public final void createSpeedTestConnectionWithOptions(int i10, String userId, ReadableMap connectionOptions, Callback callback) {
        q.h(userId, "userId");
        q.h(connectionOptions, "connectionOptions");
        q.h(callback, "callback");
        createSpeedTestConnection(i10, userId, connectionOptions, new MediaEngineModule$createSpeedTestConnectionWithOptions$1(callback));
        addSpeedTestConnectionCallbacks(i10);
    }

    @ReactMethod
    public final void createVoiceConnectionWithOptions(int i10, String userId, ReadableMap connectionOptions, Callback callback) {
        q.h(userId, "userId");
        q.h(connectionOptions, "connectionOptions");
        q.h(callback, "callback");
        createConnection(i10, userId, connectionOptions, new MediaEngineModule$createVoiceConnectionWithOptions$1(callback));
        addConnectionCallbacks(i10);
    }

    @ReactMethod
    public final void getAudioSubsystem(Callback callback) {
        q.h(callback, "callback");
        this.mediaEngine.getAudioSubsystem$media_engine_release(new MediaEngineModule$getAudioSubsystem$1(callback));
    }

    @ReactMethod
    public final void getCodecCapabilities(Callback callback) {
        q.h(callback, "callback");
        this.mediaEngine.getCodecCapabilities$media_engine_release(new MediaEngineModule$getCodecCapabilities$1(callback));
    }

    @ReactMethod
    public final void getCodecSurvey(Callback callback) {
        q.h(callback, "callback");
        this.mediaEngine.getCodecSurvey$media_engine_release(new MediaEngineModule$getCodecSurvey$1(callback));
    }

    @Override 
    public Map<String, Object> getConstants() {
        Map k10;
        Map k11;
        List k12;
        Map<String, Object> l10;
        k10 = v.k(x.a("MAINTAIN_RESOLUTION", 0), x.a("MAINTAIN_FRAMERATE", 1), x.a("BALANCED", 2));
        k11 = v.k(x.a("VOICE", "AVAudioSessionModeVoiceChat"), x.a("VIDEO", "AVAudioSessionModeVideoChat"), x.a("LISTEN", "AVAudioSessionModeSpokenAudio"), x.a("DEFAULT", "AVAudioSessionModeDefault"));
        k12 = j.k("voice_sound_stop_loop", "voice_relative_sounds", "voice_legacy_subsystem", "voice_experimental_subsystem", "elevated_hook", "soundshare", "soundshare_loopback", "set_audio_device_by_id", "set_video_device_by_id", "loopback", "wumpus_video", "hybrid_video", "experimental_encoders", "experiment_config", "remote_locus_network_control", "screen_previews", "window_previews", "audio_debug_state", "connection_replay", "simulcast_bugfix", "RTC_REGION_RANKING", "video_effects", "direct_video", "electron_video", "mediapipe", "fixed_keyframe_interval", "clips", "speed_test", "first_frame_callback", "remote_user_multi_stream");
        l10 = v.l(x.a("DegradationPreference", k10), x.a("AVAudioSessionMode", k11), x.a("supportedFeatures", k12));
        return l10;
    }

    @ReactMethod
    public final void getInputDevices(Callback callback) {
        q.h(callback, "callback");
        this.mediaEngine.getInputDevices$media_engine_release(new MediaEngineModule$getInputDevices$1(callback));
    }

    public final MediaEngine getMediaEngine() {
        return this.mediaEngine;
    }

    @Override 
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void getOutputDevices(Callback callback) {
        q.h(callback, "callback");
        this.mediaEngine.getOutputDevices$media_engine_release(new MediaEngineModule$getOutputDevices$1(callback));
    }

    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @ReactMethod
    public final void getSupportedVideoCodecs(Callback callback) {
        q.h(callback, "callback");
        this.mediaEngine.getSupportedVideoCodecs$media_engine_release(new MediaEngineModule$getSupportedVideoCodecs$1(callback));
    }

    @ReactMethod
    public final void getVideoInputDevices(Callback callback) {
        q.h(callback, "callback");
        this.mediaEngine.getVideoInputDevices$media_engine_release(new MediaEngineModule$getVideoInputDevices$1(callback));
    }

    @Override 
    public void initialize() {
        this.mediaEngine.setOnNoInputCallback$media_engine_release(new MediaEngineModule$initialize$1(this));
        this.mediaEngine.setOnVoiceCallback$media_engine_release(new MediaEngineModule$initialize$2(this));
        this.mediaEngine.setActiveSinksChangeCallback$media_engine_release(new MediaEngineModule$initialize$3(this));
        this.mediaEngine.setDeviceChangeCallback$media_engine_release(new MediaEngineModule$initialize$4(this));
        this.reactContext.addActivityEventListener(this.activityEventListener);
    }

    @Override 
    public void invalidate() {
        super.invalidate();
        this.reactContext.removeActivityEventListener(this.activityEventListener);
        this.mediaEngine.reset();
    }

    @ReactMethod
    public final void rankRtcRegions(ReadableArray regionsWithIps, Callback callback) {
        q.h(regionsWithIps, "regionsWithIps");
        q.h(callback, "callback");
        this.mediaEngine.rankRtcRegions$media_engine_release(NativeArrayExtensionsKt.toJsonString(regionsWithIps), new MediaEngineModule$rankRtcRegions$1(callback));
    }

    @ReactMethod
    public final void removeListeners(int i10) {
    }

    @ReactMethod
    public final void setAVAudioSessionMode(String mode) {
        q.h(mode, "mode");
    }

    @ReactMethod
    public final void setAudioInputEnabled(boolean z10) {
        this.mediaEngine.setAudioInputEnabled$media_engine_release(z10);
    }

    @ReactMethod
    public final void setBroadcastThumbnailParams(int i10, int i11, int i12) {
        this.mediaEngine.setBroadcastThumbnailParams$media_engine_release(i10, i11, i12, new MediaEngineModule$setBroadcastThumbnailParams$1(this));
    }

    @ReactMethod
    public final void setEmitVADLevel2(boolean z10) {
        this.mediaEngine.setEmitVADLevel2$media_engine_release(z10);
    }

    @ReactMethod
    public final void setHasFullbandPerformance(boolean z10) {
        this.mediaEngine.setHasFullbandPerformance$media_engine_release(z10);
    }

    @ReactMethod
    public final void setInputDevice(Dynamic deviceIndex) {
        int i10;
        q.h(deviceIndex, "deviceIndex");
        MediaEngine mediaEngine = this.mediaEngine;
        ReadableType type = deviceIndex.getType();
        if (type == null) {
            i10 = -1;
        } else {
            i10 = Companion.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i10 == 1) {
            mediaEngine.setInputDevice$media_engine_release(deviceIndex.asInt());
        } else if (i10 == 2) {
            String asString = deviceIndex.asString();
            q.g(asString, "deviceIndex.asString()");
            mediaEngine.setInputDevice$media_engine_release(asString);
        } else {
            ReadableType type2 = deviceIndex.getType();
            throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
        }
    }

    @ReactMethod
    public final void setInputVolume(float f10) {
        this.mediaEngine.setInputVolume$media_engine_release(f10);
    }

    @ReactMethod
    public final void setNoInputThreshold(float f10) {
        this.mediaEngine.setNoInputThreshold$media_engine_release(f10);
    }

    @ReactMethod
    public final void setOutputDevice(Dynamic deviceIndex) {
        int i10;
        q.h(deviceIndex, "deviceIndex");
        MediaEngine mediaEngine = this.mediaEngine;
        ReadableType type = deviceIndex.getType();
        if (type == null) {
            i10 = -1;
        } else {
            i10 = Companion.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i10 == 1) {
            mediaEngine.setOutputDevice$media_engine_release(deviceIndex.asInt());
        } else if (i10 == 2) {
            String asString = deviceIndex.asString();
            q.g(asString, "deviceIndex.asString()");
            mediaEngine.setOutputDevice$media_engine_release(asString);
        } else {
            ReadableType type2 = deviceIndex.getType();
            throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
        }
    }

    @ReactMethod
    public final void setOutputVolume(float f10) {
        this.mediaEngine.setOutputVolume$media_engine_release(f10);
    }

    @ReactMethod
    public final void setTransportOptions(ReadableMap options) {
        q.h(options, "options");
        this.mediaEngine.setTransportOptions$media_engine_release(NativeMapExtensionsKt.toJsonString(options));
    }

    @ReactMethod
    public final void setVideoInputDevice(Dynamic deviceIndex) {
        int i10;
        q.h(deviceIndex, "deviceIndex");
        MediaEngine mediaEngine = this.mediaEngine;
        ReadableType type = deviceIndex.getType();
        if (type == null) {
            i10 = -1;
        } else {
            i10 = Companion.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i10 == 1) {
            mediaEngine.setVideoInputDevice$media_engine_release(deviceIndex.asInt());
        } else if (i10 == 2) {
            String asString = deviceIndex.asString();
            q.g(asString, "deviceIndex.asString()");
            mediaEngine.setVideoInputDevice$media_engine_release(asString);
        } else {
            ReadableType type2 = deviceIndex.getType();
            throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
        }
    }

    @ReactMethod
    public final void speedTestConnectionInstanceDestroy(int i10) {
        this.mediaEngine.speedTestConnectionInstanceDestroy$media_engine_release(i10);
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceGetEncryptionModes(int i10, Callback callback) {
        q.h(callback, "callback");
        return this.mediaEngine.speedTestConnectionInstanceGetEncryptionModes$media_engine_release(i10, new MediaEngineModule$speedTestConnectionInstanceGetEncryptionModes$1(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceGetNetworkOverhead(int i10, Callback callback) {
        q.h(callback, "callback");
        return this.mediaEngine.speedTestConnectionInstanceGetNetworkOverhead$media_engine_release(i10, new MediaEngineModule$speedTestConnectionInstanceGetNetworkOverhead$1(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceSetPingInterval(int i10, int i11) {
        return this.mediaEngine.speedTestConnectionInstanceSetPingInterval$media_engine_release(i10, i11);
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceSetTransportOptions(int i10, ReadableMap options) {
        q.h(options, "options");
        return this.mediaEngine.speedTestConnectionInstanceSetTransportOptions$media_engine_release(i10, NativeMapExtensionsKt.toJsonString(options));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStartSpeedTestReceiver(int i10, ReadableMap options, Callback callback) {
        q.h(options, "options");
        q.h(callback, "callback");
        return this.mediaEngine.speedTestConnectionInstanceStartSpeedTestReceiver$media_engine_release(i10, NativeMapExtensionsKt.toJsonString(options), new MediaEngineModule$speedTestConnectionInstanceStartSpeedTestReceiver$1(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStartSpeedTestSender(int i10, ReadableMap options, Callback callback) {
        q.h(options, "options");
        q.h(callback, "callback");
        return this.mediaEngine.speedTestConnectionInstanceStartSpeedTestSender$media_engine_release(i10, NativeMapExtensionsKt.toJsonString(options), new MediaEngineModule$speedTestConnectionInstanceStartSpeedTestSender$1(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStopSpeedTestReceiver(int i10, Callback callback) {
        q.h(callback, "callback");
        return this.mediaEngine.speedTestConnectionInstanceStopSpeedTestReceiver$media_engine_release(i10, new MediaEngineModule$speedTestConnectionInstanceStopSpeedTestReceiver$1(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStopSpeedTestSender(int i10) {
        return this.mediaEngine.speedTestConnectionInstanceStopSpeedTestSender$media_engine_release(i10);
    }

    @ReactMethod
    public final void startBroadcast() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.startActivityForResult(Companion.createScreenCaptureIntent(currentActivity), START_SCREENSHARE_REQUEST_CODE);
        }
    }

    @ReactMethod
    public final void startLocalAudioRecording(ReadableMap options, Callback callback) {
        q.h(options, "options");
        q.h(callback, "callback");
        this.mediaEngine.startLocalAudioRecording$media_engine_release(NativeMapExtensionsKt.toJsonString(options), new MediaEngineModule$startLocalAudioRecording$1(callback));
    }

    @ReactMethod
    public final Unit stopBroadcast() {
        Integer num = this.streamConnectionId;
        if (num == null) {
            return null;
        }
        this.mediaEngine.connectionInstanceStopBroadcast$media_engine_release(num.intValue());
        return Unit.f21215a;
    }

    @ReactMethod
    public final Unit stopBroadcastWithError(int i10, String errorMessage) {
        q.h(errorMessage, "errorMessage");
        Integer num = this.streamConnectionId;
        if (num == null) {
            return null;
        }
        this.mediaEngine.connectionInstanceStopBroadcastWithError$media_engine_release(num.intValue(), i10, errorMessage);
        return Unit.f21215a;
    }

    @ReactMethod
    public final void stopLocalAudioRecording(Callback callback) {
        q.h(callback, "callback");
        this.mediaEngine.stopLocalAudioRecording$media_engine_release(new MediaEngineModule$stopLocalAudioRecording$1(callback));
    }
}
