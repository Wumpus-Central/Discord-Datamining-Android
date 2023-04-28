package com.discord.media.engine;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import com.discord.media.engine.types.Debug;
import com.discord.media.engine.video.events.ActiveSinksChangeEvent;
import com.discord.media.engine.video.events.DeviceChangedEvent;
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
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9656f0;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C10853x;
import p268of.C11053v;

@ReactModule(name = MediaEngineModule.NAME)
@Metadata(m15074d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 \u0098\u00012\u00020\u0001:\u0002\u0098\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J/\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007J\u001f\u0010#\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010%J\u001f\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J'\u0010*\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010,J\u001f\u0010-\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J\u001f\u0010.\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u00101J(\u00102\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u0002052\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J'\u00106\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u00107\u001a\u000205H\u0007¢\u0006\u0002\u00108J/\u00109\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0007¢\u0006\u0002\u0010=J'\u0010>\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020;H\u0007¢\u0006\u0002\u0010@J\u001f\u0010A\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010CJ\u001f\u0010D\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010E\u001a\u00020;H\u0007¢\u0006\u0002\u0010FJ'\u0010G\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010H\u001a\u0002052\u0006\u0010I\u001a\u000205H\u0007¢\u0006\u0002\u0010JJ\u001f\u0010K\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010CJ\u001f\u0010M\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010N\u001a\u000205H\u0007¢\u0006\u0002\u0010OJ\u001f\u0010P\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010Q\u001a\u000205H\u0007¢\u0006\u0002\u0010OJ\u001f\u0010R\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010S\u001a\u00020TH\u0007¢\u0006\u0002\u0010UJ\u001f\u0010V\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010W\u001a\u000205H\u0007¢\u0006\u0002\u0010OJ\u0010\u0010X\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007JF\u0010Y\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020T2$\u0010'\u001a \u0012\u0004\u0012\u00020\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020]0\\\u0012\u0004\u0012\u00020\u00170[H\u0002J(\u0010^\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007JF\u0010_\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020T2$\u0010'\u001a \u0012\u0004\u0012\u00020\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020]0\\\u0012\u0004\u0012\u00020\u00170[H\u0002J(\u0010`\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007J(\u0010a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010b\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010c\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010d\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\u0016\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010]0fH\u0016J\u0010\u0010g\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\b\u0010h\u001a\u00020\u001bH\u0016J\u0010\u0010i\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010j\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010k\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\b\u0010l\u001a\u00020\u0017H\u0016J\b\u0010m\u001a\u00020\u0017H\u0016J\u0018\u0010n\u001a\u00020\u00172\u0006\u0010o\u001a\u0002002\u0006\u0010'\u001a\u00020(H\u0007J\u0010\u0010p\u001a\u00020\u00172\u0006\u0010q\u001a\u00020\u0012H\u0007J\u0010\u0010r\u001a\u00020\u00172\u0006\u0010s\u001a\u00020\u001bH\u0007J\u0010\u0010t\u001a\u00020\u00172\u0006\u0010u\u001a\u000205H\u0007J \u0010v\u001a\u00020\u00172\u0006\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00122\u0006\u0010y\u001a\u00020\u0012H\u0007J\u0010\u0010z\u001a\u00020\u00172\u0006\u0010{\u001a\u000205H\u0007J\u0010\u0010|\u001a\u00020\u00172\u0006\u0010}\u001a\u00020~H\u0007J\u0010\u0010\u007f\u001a\u00020\u00172\u0006\u0010?\u001a\u00020;H\u0007J\u0011\u0010\u0080\u0001\u001a\u00020\u00172\u0006\u0010E\u001a\u00020;H\u0007J\u0011\u0010\u0081\u0001\u001a\u00020\u00172\u0006\u0010}\u001a\u00020~H\u0007J\u0011\u0010\u0082\u0001\u001a\u00020\u00172\u0006\u0010?\u001a\u00020;H\u0007J\u0011\u0010\u0083\u0001\u001a\u00020\u00172\u0006\u0010S\u001a\u00020TH\u0007J\u0011\u0010\u0084\u0001\u001a\u00020\u00172\u0006\u0010}\u001a\u00020~H\u0007J\u0011\u0010\u0085\u0001\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007J \u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J \u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J \u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010CJ \u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010S\u001a\u00020TH\u0007¢\u0006\u0002\u0010UJ)\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010S\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0003\u0010\u008b\u0001J)\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010S\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0003\u0010\u008b\u0001J \u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J\u0019\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007¢\u0006\u0003\u0010\u008f\u0001J\t\u0010\u0090\u0001\u001a\u00020\u0017H\u0007J\u0019\u0010\u0091\u0001\u001a\u00020\u00172\u0006\u0010S\u001a\u00020T2\u0006\u0010'\u001a\u00020(H\u0007J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0003\u0010\u0093\u0001J\"\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00172\u0007\u0010\u0095\u0001\u001a\u00020\u00122\u0007\u0010\u0096\u0001\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010%J\u0011\u0010\u0097\u0001\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0099\u0001"}, m15073d2 = {"Lcom/discord/media/engine/MediaEngineModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "activityEventListener", "Lcom/facebook/react/bridge/ActivityEventListener;", "mediaEngine", "Lcom/discord/media/engine/MediaEngine;", "getMediaEngine", "()Lcom/discord/media/engine/MediaEngine;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "startNs", "", "streamConnectionId", "", "Ljava/lang/Integer;", "streamPermissions", "Landroid/content/Intent;", "addConnectionCallbacks", "", "connectionId", "addListener", "type", "", "addSpeedTestConnectionCallbacks", "connectionInstanceConfigureConnectionRetries", "baseDelayMs", "maxDelayMs", "maxAttempts", "(IIII)Lkotlin/Unit;", "connectionInstanceDestroy", "connectionInstanceDestroyUser", "userId", "(ILjava/lang/String;)Lkotlin/Unit;", "connectionInstanceGetEncryptionModes", "callback", "Lcom/facebook/react/bridge/Callback;", "(ILcom/facebook/react/bridge/Callback;)Lkotlin/Unit;", "connectionInstanceGetFilteredStats", "filter", "(IILcom/facebook/react/bridge/Callback;)Lkotlin/Unit;", "connectionInstanceGetStats", "connectionInstanceMergeUsers", "users", "Lcom/facebook/react/bridge/ReadableArray;", "(ILcom/facebook/react/bridge/ReadableArray;)Lkotlin/Unit;", "connectionInstanceSetDesktopSource", "stringId", "useVideoHook", "", "connectionInstanceSetLocalMute", "mute", "(ILjava/lang/String;Z)Lkotlin/Unit;", "connectionInstanceSetLocalPan", ViewProps.LEFT, "", ViewProps.RIGHT, "(ILjava/lang/String;FF)Lkotlin/Unit;", "connectionInstanceSetLocalVolume", "volume", "(ILjava/lang/String;F)Lkotlin/Unit;", "connectionInstanceSetMinimumOutputDelay", "delay", "(II)Lkotlin/Unit;", "connectionInstanceSetNoInputThreshold", "threshold", "(IF)Lkotlin/Unit;", "connectionInstanceSetPTTActive", AppStateModule.APP_STATE_ACTIVE, "priority", "(IZZ)Lkotlin/Unit;", "connectionInstanceSetPingInterval", "pingInterval", "connectionInstanceSetSelfDeafen", "deafened", "(IZ)Lkotlin/Unit;", "connectionInstanceSetSelfMute", "muted", "connectionInstanceSetTransportOptions", "options", "Lcom/facebook/react/bridge/ReadableMap;", "(ILcom/facebook/react/bridge/ReadableMap;)Lkotlin/Unit;", "connectionInstanceSetVideoBroadcast", "broadcasting", "connectionInstanceTriggerOnVideoCallback", "createConnection", "connectionOptions", "Lkotlin/Function2;", "", "", "createOwnStreamConnectionWithOptions", "createSpeedTestConnection", "createSpeedTestConnectionWithOptions", "createVoiceConnectionWithOptions", "getAudioSubsystem", "getCodecCapabilities", "getCodecSurvey", "getConstants", "", "getInputDevices", "getName", "getOutputDevices", "getSupportedVideoCodecs", "getVideoInputDevices", "initialize", "invalidate", "rankRtcRegions", "regionsWithIps", "removeListeners", "count", "setAVAudioSessionMode", "mode", "setAudioInputEnabled", ViewProps.ENABLED, "setBroadcastThumbnailParams", "width", "height", "intervalSeconds", "setEmitVADLevel2", "enable", "setInputDevice", "deviceIndex", "Lcom/facebook/react/bridge/Dynamic;", "setInputVolume", "setNoInputThreshold", "setOutputDevice", "setOutputVolume", "setTransportOptions", "setVideoInputDevice", "speedTestConnectionInstanceDestroy", "speedTestConnectionInstanceGetEncryptionModes", "speedTestConnectionInstanceGetNetworkOverhead", "speedTestConnectionInstanceSetPingInterval", "speedTestConnectionInstanceSetTransportOptions", "speedTestConnectionInstanceStartSpeedTestReceiver", "(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)Lkotlin/Unit;", "speedTestConnectionInstanceStartSpeedTestSender", "speedTestConnectionInstanceStopSpeedTestReceiver", "speedTestConnectionInstanceStopSpeedTestSender", "(I)Lkotlin/Unit;", "startBroadcast", "startLocalAudioRecording", "stopBroadcast", "()Lkotlin/Unit;", "stopBroadcastWithError", "errorCode", "errorMessage", "stopLocalAudioRecording", "Companion", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
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
    private final ReactEvents reactEvents = new ReactEvents(C10853x.m10921a("no-input-callback", C9656f0.m14684b(NoInputCallbackEvent.class)), C10853x.m10921a("on-voice", C9656f0.m14684b(OnVoiceEvent.class)), C10853x.m10921a("device-changed", C9656f0.m14684b(DeviceChangedEvent.class)), C10853x.m10921a("on-broadcast-requested", C9656f0.m14684b(OnBroadcastRequestedEvent.class)), C10853x.m10921a("on-broadcast-thumbnail", C9656f0.m14684b(OnBroadcastThumbnailEvent.class)), C10853x.m10921a("user-speaking", C9656f0.m14684b(UserSpeakingEvent.class)), C10853x.m10921a("ping-callback", C9656f0.m14684b(PingCallbackEvent.class)), C10853x.m10921a("ping-timeout-callback", C9656f0.m14684b(PingTimeoutCallbackEvent.class)), C10853x.m10921a("on-video-callback", C9656f0.m14684b(OnVideoCallbackEvent.class)), C10853x.m10921a("active-sinks-change", C9656f0.m14684b(ActiveSinksChangeEvent.class)), C10853x.m10921a("speed-test-ping-callback", C9656f0.m14684b(SpeedTestPingCallbackEvent.class)), C10853x.m10921a("speed-test-ping-timeout-callback", C9656f0.m14684b(SpeedTestPingTimeoutCallbackEvent.class)));
    private final ActivityEventListener activityEventListener = new ActivityEventListener() { // from class: com.discord.media.engine.MediaEngineModule$activityEventListener$1
        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            ReactEvents reactEvents;
            if (i2 == -1 && i == 420 && intent != null) {
                MediaEngineModule.this.streamPermissions = intent;
                reactEvents = MediaEngineModule.this.reactEvents;
                reactEvents.emitModuleEvent(MediaEngineModule.this.getReactContext(), new OnBroadcastRequestedEvent());
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }
    };

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\rH\u0082\bJ\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m15073d2 = {"Lcom/discord/media/engine/MediaEngineModule$Companion;", "", "()V", "NAME", "", "START_SCREENSHARE_REQUEST_CODE", "", "TAG", "setDeviceIndex", "", "deviceIndex", "Lcom/facebook/react/bridge/Dynamic;", "setInt", "Lkotlin/Function1;", "setString", "createScreenCaptureIntent", "Landroid/content/Intent;", "Landroid/content/Context;", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {

        @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes5.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Intent createScreenCaptureIntent(Context context) {
            Object systemService = context.getSystemService("media_projection");
            C9677q.m14635e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
            Intent createScreenCaptureIntent = ((MediaProjectionManager) systemService).createScreenCaptureIntent();
            C9677q.m14634f(createScreenCaptureIntent, "getSystemService(Context…eateScreenCaptureIntent()");
            return createScreenCaptureIntent;
        }

        private final void setDeviceIndex(Dynamic dynamic, Function1<? super Integer, Unit> function1, Function1<? super String, Unit> function12) {
            int i;
            ReadableType type = dynamic.getType();
            if (type == null) {
                i = -1;
            } else {
                i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            }
            if (i == 1) {
                function1.invoke(Integer.valueOf(dynamic.asInt()));
            } else if (i == 2) {
                String asString = dynamic.asString();
                C9677q.m14634f(asString, "deviceIndex.asString()");
                function12.invoke(asString);
            } else {
                ReadableType type2 = dynamic.getType();
                throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9677q.m14633g(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.mediaEngine = new MediaEngine(reactContext, null, 2, null);
        Debug.INSTANCE.logDebugLoggingConfig();
    }

    private final void addConnectionCallbacks(int i) {
        this.mediaEngine.connectionInstanceSetOnSpeakingCallback$media_engine_release(i, new MediaEngineModule$addConnectionCallbacks$1(this, i));
        this.mediaEngine.connectionInstanceSetOnPingCallback$media_engine_release(i, new MediaEngineModule$addConnectionCallbacks$2(this, i));
        this.mediaEngine.connectionInstanceSetOnPingTimeoutCallback$media_engine_release(i, new MediaEngineModule$addConnectionCallbacks$3(this, i));
    }

    private final void addSpeedTestConnectionCallbacks(int i) {
        this.mediaEngine.m32151x6d509b9d(i, new MediaEngineModule$addSpeedTestConnectionCallbacks$1(this, i));
        this.mediaEngine.m32150xa1587fea(i, new MediaEngineModule$addSpeedTestConnectionCallbacks$2(this, i));
    }

    private final void createConnection(int i, String str, ReadableMap readableMap, Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        this.mediaEngine.createVoiceConnection(i, str, NativeMapExtensionsKt.toJsonString(readableMap), function2);
    }

    private final void createSpeedTestConnection(int i, String str, ReadableMap readableMap, Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        this.mediaEngine.createSpeedTestConnection(i, str, NativeMapExtensionsKt.toJsonString(readableMap), function2);
    }

    @ReactMethod
    public final void addListener(String type) {
        C9677q.m14633g(type, "type");
    }

    @ReactMethod
    public final Unit connectionInstanceConfigureConnectionRetries(int i, int i2, int i3, int i4) {
        return this.mediaEngine.m32170x39e7e3d4(i, i2, i3, i4);
    }

    @ReactMethod
    public final void connectionInstanceDestroy(int i) {
        this.mediaEngine.connectionInstanceDestroy$media_engine_release(i);
        Integer num = this.streamConnectionId;
        if (num != null && i == num.intValue()) {
            this.streamConnectionId = null;
        }
    }

    @ReactMethod
    public final Unit connectionInstanceDestroyUser(int i, String userId) {
        C9677q.m14633g(userId, "userId");
        return this.mediaEngine.connectionInstanceDestroyUser$media_engine_release(i, userId);
    }

    @ReactMethod
    public final Unit connectionInstanceGetEncryptionModes(int i, Callback callback) {
        C9677q.m14633g(callback, "callback");
        return this.mediaEngine.connectionInstanceGetEncryptionModes$media_engine_release(i, new MediaEngineModule$connectionInstanceGetEncryptionModes$1(callback));
    }

    @ReactMethod
    public final Unit connectionInstanceGetFilteredStats(int i, int i2, Callback callback) {
        C9677q.m14633g(callback, "callback");
        return this.mediaEngine.connectionInstanceGetFilteredStats$media_engine_release(i, i2, new MediaEngineModule$connectionInstanceGetFilteredStats$1(callback));
    }

    @ReactMethod
    public final Unit connectionInstanceGetStats(int i, Callback callback) {
        C9677q.m14633g(callback, "callback");
        return this.mediaEngine.connectionInstanceGetStats$media_engine_release(i, new MediaEngineModule$connectionInstanceGetStats$1(callback));
    }

    @ReactMethod
    public final Unit connectionInstanceMergeUsers(int i, ReadableArray users) {
        C9677q.m14633g(users, "users");
        return this.mediaEngine.connectionInstanceMergeUsers$media_engine_release(i, NativeArrayExtensionsKt.toJsonString(users));
    }

    @ReactMethod
    public final void connectionInstanceSetDesktopSource(int i, String stringId, boolean z, String type) {
        C9677q.m14633g(stringId, "stringId");
        C9677q.m14633g(type, "type");
    }

    @ReactMethod
    public final Unit connectionInstanceSetLocalMute(int i, String userId, boolean z) {
        C9677q.m14633g(userId, "userId");
        return this.mediaEngine.connectionInstanceSetLocalMute$media_engine_release(i, userId, z);
    }

    @ReactMethod
    public final Unit connectionInstanceSetLocalPan(int i, String userId, float f, float f2) {
        C9677q.m14633g(userId, "userId");
        return this.mediaEngine.connectionInstanceSetLocalPan$media_engine_release(i, userId, f, f2);
    }

    @ReactMethod
    public final Unit connectionInstanceSetLocalVolume(int i, String userId, float f) {
        C9677q.m14633g(userId, "userId");
        return this.mediaEngine.connectionInstanceSetLocalVolume$media_engine_release(i, userId, f);
    }

    @ReactMethod
    public final Unit connectionInstanceSetMinimumOutputDelay(int i, int i2) {
        return this.mediaEngine.connectionInstanceSetMinimumOutputDelay$media_engine_release(i, i2);
    }

    @ReactMethod
    public final Unit connectionInstanceSetNoInputThreshold(int i, float f) {
        return this.mediaEngine.connectionInstanceSetNoInputThreshold$media_engine_release(i, f);
    }

    @ReactMethod
    public final Unit connectionInstanceSetPTTActive(int i, boolean z, boolean z2) {
        return this.mediaEngine.connectionInstanceSetPTTActive$media_engine_release(i, z, z2);
    }

    @ReactMethod
    public final Unit connectionInstanceSetPingInterval(int i, int i2) {
        return this.mediaEngine.connectionInstanceSetPingInterval$media_engine_release(i, i2);
    }

    @ReactMethod
    public final Unit connectionInstanceSetSelfDeafen(int i, boolean z) {
        return this.mediaEngine.connectionInstanceSetSelfDeafen$media_engine_release(i, z);
    }

    @ReactMethod
    public final Unit connectionInstanceSetSelfMute(int i, boolean z) {
        return this.mediaEngine.connectionInstanceSetSelfMute$media_engine_release(i, z);
    }

    @ReactMethod
    public final Unit connectionInstanceSetTransportOptions(int i, ReadableMap options) {
        C9677q.m14633g(options, "options");
        return this.mediaEngine.connectionInstanceSetTransportOptions$media_engine_release(i, NativeMapExtensionsKt.toJsonString(options));
    }

    @ReactMethod
    public final Unit connectionInstanceSetVideoBroadcast(int i, boolean z) {
        return this.mediaEngine.connectionInstanceSetVideoBroadcast$media_engine_release(i, z);
    }

    @ReactMethod
    public final void connectionInstanceTriggerOnVideoCallback(int i) {
        this.mediaEngine.connectionInstanceSetOnVideoCallback$media_engine_release(i, new MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1(this, i));
    }

    @ReactMethod
    public final void createOwnStreamConnectionWithOptions(int i, String userId, ReadableMap connectionOptions, Callback callback) {
        C9677q.m14633g(userId, "userId");
        C9677q.m14633g(connectionOptions, "connectionOptions");
        C9677q.m14633g(callback, "callback");
        createConnection(i, userId, connectionOptions, new MediaEngineModule$createOwnStreamConnectionWithOptions$1(callback, this, i));
        this.streamConnectionId = Integer.valueOf(i);
        addConnectionCallbacks(i);
    }

    @ReactMethod
    public final void createSpeedTestConnectionWithOptions(int i, String userId, ReadableMap connectionOptions, Callback callback) {
        C9677q.m14633g(userId, "userId");
        C9677q.m14633g(connectionOptions, "connectionOptions");
        C9677q.m14633g(callback, "callback");
        createSpeedTestConnection(i, userId, connectionOptions, new MediaEngineModule$createSpeedTestConnectionWithOptions$1(callback));
        addSpeedTestConnectionCallbacks(i);
    }

    @ReactMethod
    public final void createVoiceConnectionWithOptions(int i, String userId, ReadableMap connectionOptions, Callback callback) {
        C9677q.m14633g(userId, "userId");
        C9677q.m14633g(connectionOptions, "connectionOptions");
        C9677q.m14633g(callback, "callback");
        createConnection(i, userId, connectionOptions, new MediaEngineModule$createVoiceConnectionWithOptions$1(callback));
        addConnectionCallbacks(i);
    }

    @ReactMethod
    public final void getAudioSubsystem(Callback callback) {
        C9677q.m14633g(callback, "callback");
        this.mediaEngine.getAudioSubsystem$media_engine_release(new MediaEngineModule$getAudioSubsystem$1(callback));
    }

    @ReactMethod
    public final void getCodecCapabilities(Callback callback) {
        C9677q.m14633g(callback, "callback");
        this.mediaEngine.getCodecCapabilities$media_engine_release(new MediaEngineModule$getCodecCapabilities$1(callback));
    }

    @ReactMethod
    public final void getCodecSurvey(Callback callback) {
        C9677q.m14633g(callback, "callback");
        this.mediaEngine.getCodecSurvey$media_engine_release(new MediaEngineModule$getCodecSurvey$1(callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map k;
        Map k2;
        Map<String, Object> l;
        k = C11053v.m10248k(C10853x.m10921a("MAINTAIN_RESOLUTION", 0), C10853x.m10921a("MAINTAIN_FRAMERATE", 1), C10853x.m10921a("BALANCED", 2));
        k2 = C11053v.m10248k(C10853x.m10921a("VOICE", "AVAudioSessionModeVoiceChat"), C10853x.m10921a("VIDEO", "AVAudioSessionModeVideoChat"), C10853x.m10921a("LISTEN", "AVAudioSessionModeSpokenAudio"), C10853x.m10921a("DEFAULT", "AVAudioSessionModeDefault"));
        l = C11053v.m10247l(C10853x.m10921a("DegradationPreference", k), C10853x.m10921a("AVAudioSessionMode", k2));
        return l;
    }

    @ReactMethod
    public final void getInputDevices(Callback callback) {
        C9677q.m14633g(callback, "callback");
        this.mediaEngine.getInputDevices$media_engine_release(new MediaEngineModule$getInputDevices$1(callback));
    }

    public final MediaEngine getMediaEngine() {
        return this.mediaEngine;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void getOutputDevices(Callback callback) {
        C9677q.m14633g(callback, "callback");
        this.mediaEngine.getOutputDevices$media_engine_release(new MediaEngineModule$getOutputDevices$1(callback));
    }

    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @ReactMethod
    public final void getSupportedVideoCodecs(Callback callback) {
        C9677q.m14633g(callback, "callback");
        this.mediaEngine.getSupportedVideoCodecs$media_engine_release(new MediaEngineModule$getSupportedVideoCodecs$1(callback));
    }

    @ReactMethod
    public final void getVideoInputDevices(Callback callback) {
        C9677q.m14633g(callback, "callback");
        this.mediaEngine.getVideoInputDevices$media_engine_release(new MediaEngineModule$getVideoInputDevices$1(callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mediaEngine.setOnNoInputCallback$media_engine_release(new MediaEngineModule$initialize$1(this));
        this.mediaEngine.setOnVoiceCallback$media_engine_release(new MediaEngineModule$initialize$2(this));
        this.mediaEngine.setActiveSinksChangeCallback$media_engine_release(new MediaEngineModule$initialize$3(this));
        this.mediaEngine.setDeviceChangeCallback$media_engine_release(new MediaEngineModule$initialize$4(this));
        this.reactContext.addActivityEventListener(this.activityEventListener);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        this.reactContext.removeActivityEventListener(this.activityEventListener);
        this.mediaEngine.reset();
    }

    @ReactMethod
    public final void rankRtcRegions(ReadableArray regionsWithIps, Callback callback) {
        C9677q.m14633g(regionsWithIps, "regionsWithIps");
        C9677q.m14633g(callback, "callback");
        this.mediaEngine.rankRtcRegions$media_engine_release(NativeArrayExtensionsKt.toJsonString(regionsWithIps), new MediaEngineModule$rankRtcRegions$1(callback));
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }

    @ReactMethod
    public final void setAVAudioSessionMode(String mode) {
        C9677q.m14633g(mode, "mode");
    }

    @ReactMethod
    public final void setAudioInputEnabled(boolean z) {
        this.mediaEngine.setAudioInputEnabled$media_engine_release(z);
    }

    @ReactMethod
    public final void setBroadcastThumbnailParams(int i, int i2, int i3) {
        this.mediaEngine.setBroadcastThumbnailParams$media_engine_release(i, i2, i3, new MediaEngineModule$setBroadcastThumbnailParams$1(this));
    }

    @ReactMethod
    public final void setEmitVADLevel2(boolean z) {
        this.mediaEngine.setEmitVADLevel2$media_engine_release(z);
    }

    @ReactMethod
    public final void setInputDevice(Dynamic deviceIndex) {
        int i;
        C9677q.m14633g(deviceIndex, "deviceIndex");
        MediaEngine mediaEngine = this.mediaEngine;
        ReadableType type = deviceIndex.getType();
        if (type == null) {
            i = -1;
        } else {
            i = Companion.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i == 1) {
            mediaEngine.setInputDevice$media_engine_release(deviceIndex.asInt());
        } else if (i == 2) {
            String asString = deviceIndex.asString();
            C9677q.m14634f(asString, "deviceIndex.asString()");
            mediaEngine.setInputDevice$media_engine_release(asString);
        } else {
            ReadableType type2 = deviceIndex.getType();
            throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
        }
    }

    @ReactMethod
    public final void setInputVolume(float f) {
        this.mediaEngine.setInputVolume$media_engine_release(f);
    }

    @ReactMethod
    public final void setNoInputThreshold(float f) {
        this.mediaEngine.setNoInputThreshold$media_engine_release(f);
    }

    @ReactMethod
    public final void setOutputDevice(Dynamic deviceIndex) {
        int i;
        C9677q.m14633g(deviceIndex, "deviceIndex");
        MediaEngine mediaEngine = this.mediaEngine;
        ReadableType type = deviceIndex.getType();
        if (type == null) {
            i = -1;
        } else {
            i = Companion.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i == 1) {
            mediaEngine.setOutputDevice$media_engine_release(deviceIndex.asInt());
        } else if (i == 2) {
            String asString = deviceIndex.asString();
            C9677q.m14634f(asString, "deviceIndex.asString()");
            mediaEngine.setOutputDevice$media_engine_release(asString);
        } else {
            ReadableType type2 = deviceIndex.getType();
            throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
        }
    }

    @ReactMethod
    public final void setOutputVolume(float f) {
        this.mediaEngine.setOutputVolume$media_engine_release(f);
    }

    @ReactMethod
    public final void setTransportOptions(ReadableMap options) {
        C9677q.m14633g(options, "options");
        this.mediaEngine.setTransportOptions$media_engine_release(NativeMapExtensionsKt.toJsonString(options));
    }

    @ReactMethod
    public final void setVideoInputDevice(Dynamic deviceIndex) {
        int i;
        C9677q.m14633g(deviceIndex, "deviceIndex");
        MediaEngine mediaEngine = this.mediaEngine;
        ReadableType type = deviceIndex.getType();
        if (type == null) {
            i = -1;
        } else {
            i = Companion.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i == 1) {
            mediaEngine.setVideoInputDevice$media_engine_release(deviceIndex.asInt());
        } else if (i == 2) {
            String asString = deviceIndex.asString();
            C9677q.m14634f(asString, "deviceIndex.asString()");
            mediaEngine.setVideoInputDevice$media_engine_release(asString);
        } else {
            ReadableType type2 = deviceIndex.getType();
            throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
        }
    }

    @ReactMethod
    public final void speedTestConnectionInstanceDestroy(int i) {
        this.mediaEngine.speedTestConnectionInstanceDestroy$media_engine_release(i);
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceGetEncryptionModes(int i, Callback callback) {
        C9677q.m14633g(callback, "callback");
        return this.mediaEngine.m32153xbe1ad786(i, new C3451x4986bf9e(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceGetNetworkOverhead(int i, Callback callback) {
        C9677q.m14633g(callback, "callback");
        return this.mediaEngine.m32152x85215b11(i, new C3452x456029f3(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceSetPingInterval(int i, int i2) {
        return this.mediaEngine.speedTestConnectionInstanceSetPingInterval$media_engine_release(i, i2);
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceSetTransportOptions(int i, ReadableMap options) {
        C9677q.m14633g(options, "options");
        return this.mediaEngine.m32149x61bcaa9e(i, NativeMapExtensionsKt.toJsonString(options));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStartSpeedTestReceiver(int i, ReadableMap options, Callback callback) {
        C9677q.m14633g(options, "options");
        C9677q.m14633g(callback, "callback");
        return this.mediaEngine.m32148xbe00c5d7(i, NativeMapExtensionsKt.toJsonString(options), new C3453x1ec661ed(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStartSpeedTestSender(int i, ReadableMap options, Callback callback) {
        C9677q.m14633g(options, "options");
        C9677q.m14633g(callback, "callback");
        return this.mediaEngine.m32147xdd2d891(i, NativeMapExtensionsKt.toJsonString(options), new C3454x14b0f3(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStopSpeedTestReceiver(int i, Callback callback) {
        C9677q.m14633g(callback, "callback");
        return this.mediaEngine.m32146x8100080f(i, new C3455xe61d2dd9(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStopSpeedTestSender(int i) {
        return this.mediaEngine.m32145x5dad48c9(i);
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
        C9677q.m14633g(options, "options");
        C9677q.m14633g(callback, "callback");
        this.mediaEngine.startLocalAudioRecording$media_engine_release(NativeMapExtensionsKt.toJsonString(options), new MediaEngineModule$startLocalAudioRecording$1(callback));
    }

    @ReactMethod
    public final Unit stopBroadcast() {
        Integer num = this.streamConnectionId;
        if (num == null) {
            return null;
        }
        this.mediaEngine.connectionInstanceStopBroadcast$media_engine_release(num.intValue());
        return Unit.f25780a;
    }

    @ReactMethod
    public final Unit stopBroadcastWithError(int i, String errorMessage) {
        C9677q.m14633g(errorMessage, "errorMessage");
        Integer num = this.streamConnectionId;
        if (num == null) {
            return null;
        }
        this.mediaEngine.connectionInstanceStopBroadcastWithError$media_engine_release(num.intValue(), i, errorMessage);
        return Unit.f25780a;
    }

    @ReactMethod
    public final void stopLocalAudioRecording(Callback callback) {
        C9677q.m14633g(callback, "callback");
        this.mediaEngine.stopLocalAudioRecording$media_engine_release(new MediaEngineModule$stopLocalAudioRecording$1(callback));
    }
}
