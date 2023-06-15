package com.discord.media.engine;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.discord.async_init.AsyncInitDispatcher;
import com.discord.logging.Log;
import com.discord.media.engine.types.Debug;
import com.discord.media.engine.types.NativeTypeExtensionsKt;
import com.discord.media.engine.video.AttachedVideoSinks;
import com.discord.media.engine.video.screen_capture.ScreenCapturer;
import com.discord.media.engine.video.screen_capture.ThumbnailEmitter;
import com.discord.p000native.engine.AudioInputDeviceDescription;
import com.discord.p000native.engine.AudioOutputDeviceDescription;
import com.discord.p000native.engine.ConnectionInfo;
import com.discord.p000native.engine.NativeConnection;
import com.discord.p000native.engine.NativeEngine;
import com.discord.p000native.engine.NativeSpeedTestConnection;
import com.discord.p000native.engine.VideoInputDeviceDescription;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.util.JSStackTrace;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.y0;
import oj.u;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoFrame;
import org.webrtc.voiceengine.WebRtcAudioManager;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b^\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ó\u00012\u00020\u0001:\u0004ó\u0001ô\u0001B\u001f\u0012\b\u0010Ö\u0001\u001a\u00030Õ\u0001\u0012\n\b\u0002\u0010ð\u0001\u001a\u00030ï\u0001¢\u0006\u0006\bñ\u0001\u0010ò\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\r\u001a\u00020\bJ#\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u00020\b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0015H\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0015H\u0000¢\u0006\u0004\b#\u0010!J\u0017\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000fH\u0000¢\u0006\u0004\b&\u0010'J5\u0010-\u001a\u00020\b2$\u0010+\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\b,\u0010\u0012J\u0017\u00101\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0002H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0004H\u0000¢\u0006\u0004\b/\u0010\u001dJ5\u00103\u001a\u00020\b2$\u0010+\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\b2\u0010\u0012J\u0017\u00105\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0002H\u0000¢\u0006\u0004\b4\u00100J\u0017\u00105\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0004H\u0000¢\u0006\u0004\b4\u0010\u001dJ5\u00107\u001a\u00020\b2$\u0010+\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\b6\u0010\u0012J\u0017\u0010:\u001a\u00020\b2\u0006\u00108\u001a\u00020\u0004H\u0000¢\u0006\u0004\b9\u0010\u001dJ\u0017\u0010:\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u0002H\u0000¢\u0006\u0004\b9\u00100Je\u0010>\u001a\u00020\b2T\u0010+\u001aP\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*0)\u0012\u0004\u0012\u00020\b0;H\u0000¢\u0006\u0004\b<\u0010=J-\u0010C\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u00042\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0001¢\u0006\u0004\bA\u0010BJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010D\u001a\u00020\u0015H\u0000¢\u0006\u0004\bE\u0010!J)\u0010H\u001a\u00020\b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0004\bG\u0010\u0017J)\u0010K\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040I\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bJ\u0010\u0012J#\u0010M\u001a\u00020\b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bL\u0010\u0012J#\u0010O\u001a\u00020\b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bN\u0010\u0012J1\u0010R\u001a\u00020\b2\u0006\u0010P\u001a\u00020\u00042\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040I\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bQ\u0010BJ+\u0010T\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00042\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bS\u0010BJ)\u0010V\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0004\bU\u0010\u0017J\u0017\u0010Y\u001a\u00020\b2\u0006\u0010W\u001a\u00020\u000fH\u0000¢\u0006\u0004\bX\u0010'JD\u0010\\\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00042$\u0010+\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*\u0012\u0004\u0012\u00020\b0\u0014J3\u0010_\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0004\b]\u0010^J?\u0010c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0`H\u0000¢\u0006\u0004\ba\u0010bJ?\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0`H\u0000¢\u0006\u0004\bd\u0010bJC\u0010i\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022(\u0010\u0010\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060fj\u0002`g\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0`H\u0000¢\u0006\u0004\bh\u0010bJ\u0017\u0010k\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bj\u00100J\u001f\u0010p\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010m\u001a\u00020lH\u0000¢\u0006\u0004\bn\u0010oJ;\u0010v\u001a\u00020\b2\u0006\u0010q\u001a\u00020\u00022\u0006\u0010r\u001a\u00020\u00022\u0006\u0010s\u001a\u00020\u00022\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0004\bt\u0010uJ\u0017\u0010x\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bw\u00100J'\u0010}\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010y\u001a\u00020\u00022\u0006\u0010z\u001a\u00020\u0004H\u0000¢\u0006\u0004\b{\u0010|J5\u0010\u0083\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010~\u001a\u00020\u00022\u0006\u0010\u007f\u001a\u00020\u00022\u0007\u0010\u0080\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J6\u0010\u0086\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040I\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J$\u0010\u0089\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J%\u0010\u008c\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u008a\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u0088\u0001J$\u0010\u008e\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u0004H\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u0088\u0001J%\u0010\u0092\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u008f\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J6\u0010\u0097\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00042\u0007\u0010\u0093\u0001\u001a\u00020\u00152\u0007\u0010\u0094\u0001\u001a\u00020\u0015H\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J,\u0010\u009a\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0015H\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J-\u0010\u009e\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00042\u0007\u0010\u009b\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J%\u0010¡\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u009f\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0006\b \u0001\u0010\u0091\u0001J%\u0010¤\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010¢\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0006\b£\u0001\u0010\u0091\u0001J%\u0010¨\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010¥\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J$\u0010«\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0015H\u0000¢\u0006\u0006\b©\u0001\u0010ª\u0001J.\u0010°\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010¬\u0001\u001a\u00020\u000f2\u0007\u0010\u00ad\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0006\b®\u0001\u0010¯\u0001J0\u0010²\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0006\b±\u0001\u0010\u0085\u0001J%\u0010µ\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010³\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b´\u0001\u0010§\u0001J9\u0010¹\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010¶\u0001\u001a\u00020\u00022\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0006\b·\u0001\u0010¸\u0001JE\u0010º\u0001\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u00042$\u0010+\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010*\u0012\u0004\u0012\u00020\b0\u0014JA\u0010¼\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0`H\u0000¢\u0006\u0005\b»\u0001\u0010bJA\u0010¾\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0`H\u0000¢\u0006\u0005\b½\u0001\u0010bJ\u0019\u0010À\u0001\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0005\b¿\u0001\u00100J6\u0010Â\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040I\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0006\bÁ\u0001\u0010\u0085\u0001J0\u0010Ä\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u000eH\u0000¢\u0006\u0006\bÃ\u0001\u0010\u0085\u0001J>\u0010Ç\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001c\u0010Ê\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0006\bÈ\u0001\u0010É\u0001J3\u0010Î\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\r\u0010+\u001a\t\u0012\u0004\u0012\u00020\b0Ë\u0001H\u0000¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J5\u0010Ð\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0014H\u0000¢\u0006\u0005\bÏ\u0001\u0010^J$\u0010Ò\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0006\bÑ\u0001\u0010\u0088\u0001J%\u0010Ô\u0001\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010³\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\bÓ\u0001\u0010§\u0001R\u0018\u0010Ö\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0017\u0010Ø\u0001\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u0010Û\u0001\u001a\u00030Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0018\u0010Þ\u0001\u001a\u00030Ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001c\u0010á\u0001\u001a\u0005\u0018\u00010à\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u0018\u0010ä\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0018\u0010ç\u0001\u001a\u00030æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u001c\u0010ê\u0001\u001a\u0005\u0018\u00010é\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0018\u0010î\u0001\u001a\u00030é\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010í\u0001¨\u0006õ\u0001"}, d2 = {"Lcom/discord/media/engine/MediaEngine;", "", "", "connectionId", "", JSStackTrace.METHOD_NAME_KEY, "Lcom/discord/native/engine/NativeConnection;", "getConnection", "", "stopScreenCapturerForConnection", "forceStopScreenCapturer", "Lcom/discord/native/engine/NativeSpeedTestConnection;", "getSpeedTestConnection", "reset", "Lkotlin/Function1;", "", "cb", "setOnNoInputCallback$media_engine_release", "(Lkotlin/jvm/functions/Function1;)V", "setOnNoInputCallback", "Lkotlin/Function2;", "", "setOnVoiceCallback$media_engine_release", "(Lkotlin/jvm/functions/Function2;)V", "setOnVoiceCallback", "setActiveSinksChangeCallback$media_engine_release", "setActiveSinksChangeCallback", "optionsJSON", "setTransportOptions$media_engine_release", "(Ljava/lang/String;)V", "setTransportOptions", "volume", "setInputVolume$media_engine_release", "(F)V", "setInputVolume", "setOutputVolume$media_engine_release", "setOutputVolume", "enable", "setEmitVADLevel2$media_engine_release", "(Z)V", "setEmitVADLevel2", "", "", "callback", "getInputDevices$media_engine_release", "getInputDevices", "deviceIndex", "setInputDevice$media_engine_release", "(I)V", "setInputDevice", "getOutputDevices$media_engine_release", "getOutputDevices", "setOutputDevice$media_engine_release", "setOutputDevice", "getVideoInputDevices$media_engine_release", "getVideoInputDevices", "deviceName", "setVideoInputDevice$media_engine_release", "setVideoInputDevice", "Lkotlin/Function3;", "setDeviceChangeCallback$media_engine_release", "(Lkotlin/jvm/functions/Function3;)V", "setDeviceChangeCallback", "streamIdentifier", "Lorg/webrtc/VideoFrame;", "setVideoOutputSink$media_engine_release", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "setVideoOutputSink", "threshold", "setNoInputThreshold$media_engine_release", "setNoInputThreshold", "getAudioSubsystem$media_engine_release", "getAudioSubsystem", "", "getSupportedVideoCodecs$media_engine_release", "getSupportedVideoCodecs", "getCodecCapabilities$media_engine_release", "getCodecCapabilities", "getCodecSurvey$media_engine_release", "getCodecSurvey", "regionsWithIpsJSON", "rankRtcRegions$media_engine_release", "rankRtcRegions", "startLocalAudioRecording$media_engine_release", "startLocalAudioRecording", "stopLocalAudioRecording$media_engine_release", "stopLocalAudioRecording", ViewProps.ENABLED, "setAudioInputEnabled$media_engine_release", "setAudioInputEnabled", "userId", "connectionOptionsJSON", "createVoiceConnection", "connectionInstanceSetOnSpeakingCallback$media_engine_release", "(ILkotlin/jvm/functions/Function2;)Lkotlin/Unit;", "connectionInstanceSetOnSpeakingCallback", "Lkotlin/Function4;", "connectionInstanceSetOnPingCallback$media_engine_release", "(ILkotlin/jvm/functions/Function4;)Lkotlin/Unit;", "connectionInstanceSetOnPingCallback", "connectionInstanceSetOnPingTimeoutCallback$media_engine_release", "connectionInstanceSetOnPingTimeoutCallback", "", "Lcom/discord/media/engine/types/SSRC64;", "connectionInstanceSetOnVideoCallback$media_engine_release", "connectionInstanceSetOnVideoCallback", "connectionInstanceDestroy$media_engine_release", "connectionInstanceDestroy", "Landroid/content/Intent;", "permissions", "connectionInstanceStartBroadcast$media_engine_release", "(ILandroid/content/Intent;)V", "connectionInstanceStartBroadcast", "width", "height", "intervalSeconds", "setBroadcastThumbnailParams$media_engine_release", "(IIILkotlin/jvm/functions/Function1;)V", "setBroadcastThumbnailParams", "connectionInstanceStopBroadcast$media_engine_release", "connectionInstanceStopBroadcast", "errorCode", "errorMessage", "connectionInstanceStopBroadcastWithError$media_engine_release", "(IILjava/lang/String;)V", "connectionInstanceStopBroadcastWithError", "baseDelayMs", "maxDelayMs", "maxAttempts", "connectionInstanceConfigureConnectionRetries$media_engine_release", "(IIII)Lkotlin/Unit;", "connectionInstanceConfigureConnectionRetries", "connectionInstanceGetEncryptionModes$media_engine_release", "(ILkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "connectionInstanceGetEncryptionModes", "connectionInstanceSetTransportOptions$media_engine_release", "(ILjava/lang/String;)Lkotlin/Unit;", "connectionInstanceSetTransportOptions", "usersJSON", "connectionInstanceMergeUsers$media_engine_release", "connectionInstanceMergeUsers", "connectionInstanceDestroyUser$media_engine_release", "connectionInstanceDestroyUser", "broadcasting", "connectionInstanceSetVideoBroadcast$media_engine_release", "(IZ)Lkotlin/Unit;", "connectionInstanceSetVideoBroadcast", ViewProps.LEFT, ViewProps.RIGHT, "connectionInstanceSetLocalPan$media_engine_release", "(ILjava/lang/String;FF)Lkotlin/Unit;", "connectionInstanceSetLocalPan", "connectionInstanceSetLocalVolume$media_engine_release", "(ILjava/lang/String;F)Lkotlin/Unit;", "connectionInstanceSetLocalVolume", "mute", "connectionInstanceSetLocalMute$media_engine_release", "(ILjava/lang/String;Z)Lkotlin/Unit;", "connectionInstanceSetLocalMute", "muted", "connectionInstanceSetSelfMute$media_engine_release", "connectionInstanceSetSelfMute", "deafened", "connectionInstanceSetSelfDeafen$media_engine_release", "connectionInstanceSetSelfDeafen", "delay", "connectionInstanceSetMinimumOutputDelay$media_engine_release", "(II)Lkotlin/Unit;", "connectionInstanceSetMinimumOutputDelay", "connectionInstanceSetNoInputThreshold$media_engine_release", "(IF)Lkotlin/Unit;", "connectionInstanceSetNoInputThreshold", AppStateModule.APP_STATE_ACTIVE, "priority", "connectionInstanceSetPTTActive$media_engine_release", "(IZZ)Lkotlin/Unit;", "connectionInstanceSetPTTActive", "connectionInstanceGetStats$media_engine_release", "connectionInstanceGetStats", "pingInterval", "connectionInstanceSetPingInterval$media_engine_release", "connectionInstanceSetPingInterval", "filter", "connectionInstanceGetFilteredStats$media_engine_release", "(IILkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "connectionInstanceGetFilteredStats", "createSpeedTestConnection", "speedTestConnectionInstanceSetOnPingCallback$media_engine_release", "speedTestConnectionInstanceSetOnPingCallback", "speedTestConnectionInstanceSetOnPingTimeoutCallback$media_engine_release", "speedTestConnectionInstanceSetOnPingTimeoutCallback", "speedTestConnectionInstanceDestroy$media_engine_release", "speedTestConnectionInstanceDestroy", "speedTestConnectionInstanceGetEncryptionModes$media_engine_release", "speedTestConnectionInstanceGetEncryptionModes", "speedTestConnectionInstanceGetNetworkOverhead$media_engine_release", "speedTestConnectionInstanceGetNetworkOverhead", "speedTestConnectionInstanceStartSpeedTestSender$media_engine_release", "(ILjava/lang/String;Lkotlin/jvm/functions/Function2;)Lkotlin/Unit;", "speedTestConnectionInstanceStartSpeedTestSender", "speedTestConnectionInstanceStopSpeedTestSender$media_engine_release", "(I)Lkotlin/Unit;", "speedTestConnectionInstanceStopSpeedTestSender", "Lkotlin/Function0;", "speedTestConnectionInstanceStartSpeedTestReceiver$media_engine_release", "(ILjava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;", "speedTestConnectionInstanceStartSpeedTestReceiver", "speedTestConnectionInstanceStopSpeedTestReceiver$media_engine_release", "speedTestConnectionInstanceStopSpeedTestReceiver", "speedTestConnectionInstanceSetTransportOptions$media_engine_release", "speedTestConnectionInstanceSetTransportOptions", "speedTestConnectionInstanceSetPingInterval$media_engine_release", "speedTestConnectionInstanceSetPingInterval", "Landroid/content/Context;", "context", "Landroid/content/Context;", "instanceCreationNs", "J", "Lcom/discord/media/engine/MediaEngineNativeConnections;", "engineConnections", "Lcom/discord/media/engine/MediaEngineNativeConnections;", "Lcom/discord/media/engine/MediaEngineNativeSpeedTestConnections;", "engineSpeedTestConnections", "Lcom/discord/media/engine/MediaEngineNativeSpeedTestConnections;", "Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;", "screenCapturer", "Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;", "Lcom/discord/async_init/AsyncInitDispatcher;", "dispatcher", "Lcom/discord/async_init/AsyncInitDispatcher;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/discord/native/engine/NativeEngine;", "engineInstance", "Lcom/discord/native/engine/NativeEngine;", "getEngine", "()Lcom/discord/native/engine/NativeEngine;", "engine", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Companion", "ScreenCapturerForConnection", "media_engine_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class MediaEngine {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> OPEN_SL_DEVICE_ALLOW_LIST;
    private static final String TAG = "MediaEngine";
    private static final int THUMBNAIL_JPEG_QUALITY = 92;
    private final Context context;
    private final CoroutineScope coroutineScope;
    private final AsyncInitDispatcher dispatcher;
    private final MediaEngineNativeConnections engineConnections;
    private NativeEngine engineInstance;
    private final MediaEngineNativeSpeedTestConnections engineSpeedTestConnections;
    private final long instanceCreationNs;
    private ScreenCapturerForConnection screenCapturer;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\f\u0010\r\u001a\u00020\u000e*\u00020\u000bH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/discord/media/engine/MediaEngine$Companion;", "", "()V", "OPEN_SL_DEVICE_ALLOW_LIST", "", "", "TAG", "THUMBNAIL_JPEG_QUALITY", "", "encodeThumbnail", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compressToJpegBytes", "", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final byte[] compressToJpegBytes(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 92, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            q.f(byteArray, "ByteArrayOutputStream()\n…           .toByteArray()");
            return byteArray;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object encodeThumbnail(android.graphics.Bitmap r6, kotlin.coroutines.Continuation<? super java.lang.String> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.discord.media.engine.MediaEngine$Companion$encodeThumbnail$1
                if (r0 == 0) goto L_0x0013
                r0 = r7
                com.discord.media.engine.MediaEngine$Companion$encodeThumbnail$1 r0 = (com.discord.media.engine.MediaEngine$Companion$encodeThumbnail$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                com.discord.media.engine.MediaEngine$Companion$encodeThumbnail$1 r0 = new com.discord.media.engine.MediaEngine$Companion$encodeThumbnail$1
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = qg.b.d()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r6 = r0.L$0
                java.lang.String r6 = (java.lang.String) r6
                kg.t.b(r7)
                goto L_0x0062
            L_0x0030:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0038:
                java.lang.Object r6 = r0.L$0
                byte[] r6 = (byte[]) r6
                kg.t.b(r7)
                goto L_0x0052
            L_0x0040:
                kg.t.b(r7)
                byte[] r6 = r5.compressToJpegBytes(r6)
                r0.L$0 = r6
                r0.label = r4
                java.lang.Object r7 = kotlinx.coroutines.z2.a(r0)
                if (r7 != r1) goto L_0x0052
                return r1
            L_0x0052:
                r7 = 0
                java.lang.String r6 = android.util.Base64.encodeToString(r6, r7)
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r7 = kotlinx.coroutines.z2.a(r0)
                if (r7 != r1) goto L_0x0062
                return r1
            L_0x0062:
                java.lang.String r7 = "string"
                kotlin.jvm.internal.q.f(r6, r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.media.engine.MediaEngine.Companion.encodeThumbnail(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/discord/media/engine/MediaEngine$ScreenCapturerForConnection;", "", "screenCapturer", "Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;", "connectionId", "", "(Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;I)V", "getConnectionId", "()I", "getScreenCapturer", "()Lcom/discord/media/engine/video/screen_capture/ScreenCapturer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "release", "", "toString", "", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class ScreenCapturerForConnection {
        private final int connectionId;
        private final ScreenCapturer screenCapturer;

        public ScreenCapturerForConnection(ScreenCapturer screenCapturer, int i10) {
            q.g(screenCapturer, "screenCapturer");
            this.screenCapturer = screenCapturer;
            this.connectionId = i10;
        }

        public static /* synthetic */ ScreenCapturerForConnection copy$default(ScreenCapturerForConnection screenCapturerForConnection, ScreenCapturer screenCapturer, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                screenCapturer = screenCapturerForConnection.screenCapturer;
            }
            if ((i11 & 2) != 0) {
                i10 = screenCapturerForConnection.connectionId;
            }
            return screenCapturerForConnection.copy(screenCapturer, i10);
        }

        public final ScreenCapturer component1() {
            return this.screenCapturer;
        }

        public final int component2() {
            return this.connectionId;
        }

        public final ScreenCapturerForConnection copy(ScreenCapturer screenCapturer, int i10) {
            q.g(screenCapturer, "screenCapturer");
            return new ScreenCapturerForConnection(screenCapturer, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenCapturerForConnection)) {
                return false;
            }
            ScreenCapturerForConnection screenCapturerForConnection = (ScreenCapturerForConnection) obj;
            return q.b(this.screenCapturer, screenCapturerForConnection.screenCapturer) && this.connectionId == screenCapturerForConnection.connectionId;
        }

        public final int getConnectionId() {
            return this.connectionId;
        }

        public final ScreenCapturer getScreenCapturer() {
            return this.screenCapturer;
        }

        public int hashCode() {
            return (this.screenCapturer.hashCode() * 31) + this.connectionId;
        }

        public final void release() {
            this.screenCapturer.release();
        }

        public String toString() {
            ScreenCapturer screenCapturer = this.screenCapturer;
            int i10 = this.connectionId;
            return "ScreenCapturerForConnection(screenCapturer=" + screenCapturer + ", connectionId=" + i10 + ")";
        }
    }

    static {
        Set<String> i10;
        i10 = w.i("Pixel", "Pixel XL", "Pixel 3a XL", "Pixel 4", "Pixel 4 XL", "Pixel 5");
        OPEN_SL_DEVICE_ALLOW_LIST = i10;
    }

    public MediaEngine(Context context, CoroutineDispatcher coroutineDispatcher) {
        q.g(context, "context");
        q.g(coroutineDispatcher, "coroutineDispatcher");
        this.context = context;
        this.instanceCreationNs = System.nanoTime();
        this.engineConnections = new MediaEngineNativeConnections();
        this.engineSpeedTestConnections = new MediaEngineNativeSpeedTestConnections();
        this.dispatcher = new AsyncInitDispatcher(TAG, 0L, 2, null);
        this.coroutineScope = k0.a(coroutineDispatcher.f0(new j0(TAG)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectionInstanceGetEncryptionModes$lambda$53(Function1 callback, String[] modes) {
        q.g(callback, "$callback");
        q.g(modes, "modes");
        callback.invoke(modes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectionInstanceGetFilteredStats$lambda$55(Function1 callback, String stats) {
        q.g(callback, "$callback");
        q.g(stats, "stats");
        callback.invoke(stats);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectionInstanceGetStats$lambda$54(Function1 callback, String stats) {
        q.g(callback, "$callback");
        q.g(stats, "stats");
        callback.invoke(stats);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectionInstanceSetOnPingCallback$lambda$48(Function4 cb2, int i10, String server, int i11, int i12) {
        q.g(cb2, "$cb");
        q.g(server, "server");
        cb2.invoke(Integer.valueOf(i10), server, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectionInstanceSetOnPingTimeoutCallback$lambda$49(Function4 cb2, String server, int i10, int i11, int i12) {
        q.g(cb2, "$cb");
        q.g(server, "server");
        cb2.invoke(server, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectionInstanceSetOnSpeakingCallback$lambda$47(Function2 cb2, String userId, int i10) {
        q.g(cb2, "$cb");
        q.g(userId, "userId");
        cb2.invoke(userId, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectionInstanceSetOnVideoCallback$lambda$50(Function4 cb2, String userId, long j10, String streamId, String videoStreamParametersJSON) {
        q.g(cb2, "$cb");
        q.g(userId, "userId");
        q.g(streamId, "streamId");
        q.g(videoStreamParametersJSON, "videoStreamParametersJSON");
        cb2.invoke(userId, Long.valueOf(j10), streamId, videoStreamParametersJSON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSpeedTestConnection$lambda$56(Function2 callback, ConnectionInfo connectionInfo, String errorMessage) {
        q.g(callback, "$callback");
        q.g(connectionInfo, "connectionInfo");
        q.g(errorMessage, "errorMessage");
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, "On created with " + connectionInfo + ", " + errorMessage, (Throwable) null, 4, (Object) null);
        callback.invoke(errorMessage, NativeTypeExtensionsKt.toMap(connectionInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createVoiceConnection$lambda$45(Function2 callback, ConnectionInfo connectionInfo, String errorMessage) {
        q.g(callback, "$callback");
        q.g(connectionInfo, "connectionInfo");
        q.g(errorMessage, "errorMessage");
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, "On created with " + connectionInfo + ", " + errorMessage, (Throwable) null, 4, (Object) null);
        callback.invoke(errorMessage, NativeTypeExtensionsKt.toMap(connectionInfo));
    }

    private final void forceStopScreenCapturer() {
        ScreenCapturerForConnection screenCapturerForConnection = this.screenCapturer;
        if (screenCapturerForConnection != null) {
            screenCapturerForConnection.release();
        }
        this.screenCapturer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCodecCapabilities$lambda$32$lambda$31(Function1 callback, String codecs) {
        q.g(callback, "$callback");
        q.g(codecs, "codecs");
        callback.invoke(codecs);
    }

    private final NativeConnection getConnection(int i10, String str) {
        NativeConnection nativeConnection = this.engineConnections.get(i10);
        if (nativeConnection == null) {
            Log log = Log.INSTANCE;
            Log.w$default(log, TAG, "[" + str + "] no NativeConnection for connectionId=" + i10 + ", returning null", (Throwable) null, 4, (Object) null);
        }
        return nativeConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NativeEngine getEngine() {
        NativeEngine nativeEngine = this.engineInstance;
        if (nativeEngine != null) {
            return nativeEngine;
        }
        Debug debug = Debug.INSTANCE;
        System.nanoTime();
        WebRtcAudioManager.setBlacklistDeviceForOpenSLESUsage(!OPEN_SL_DEVICE_ALLOW_LIST.contains(Build.MODEL));
        NativeEngine nativeEngine2 = new NativeEngine(this.context, 2);
        nativeEngine2.enableBuiltInAEC(true);
        nativeEngine2.setAudioInputEnabled(false);
        this.engineInstance = nativeEngine2;
        this.dispatcher.setInitialized(true);
        return nativeEngine2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getInputDevices$lambda$10$lambda$9(Function1 callback, AudioInputDeviceDescription[] devices) {
        q.g(callback, "$callback");
        q.g(devices, "devices");
        callback.invoke(NativeTypeExtensionsKt.toListOfMaps(devices));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOutputDevices$lambda$15$lambda$14(Function1 callback, AudioOutputDeviceDescription[] devices) {
        q.g(callback, "$callback");
        q.g(devices, "devices");
        callback.invoke(NativeTypeExtensionsKt.toListOfMaps(devices));
    }

    private final NativeSpeedTestConnection getSpeedTestConnection(int i10, String str) {
        NativeSpeedTestConnection nativeSpeedTestConnection = this.engineSpeedTestConnections.get(i10);
        if (nativeSpeedTestConnection == null) {
            Log log = Log.INSTANCE;
            Log.w$default(log, TAG, "[" + str + "] no NativeSpeedTestConnection for connectionId=" + i10 + ", returning null", (Throwable) null, 4, (Object) null);
        }
        return nativeSpeedTestConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSupportedVideoCodecs$lambda$29$lambda$28(Function1 callback, String[] codecs) {
        q.g(callback, "$callback");
        q.g(codecs, "codecs");
        callback.invoke(codecs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getVideoInputDevices$lambda$20$lambda$19(Function1 callback, VideoInputDeviceDescription[] videoInputDevices) {
        q.g(callback, "$callback");
        q.g(videoInputDevices, "videoInputDevices");
        callback.invoke(NativeTypeExtensionsKt.toListOfMaps(videoInputDevices));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rankRtcRegions$lambda$38$lambda$37(Function1 callback, String[] regions) {
        q.g(callback, "$callback");
        q.g(regions, "regions");
        callback.invoke(regions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void speedTestConnectionInstanceGetEncryptionModes$lambda$60(Function1 callback, String[] modes) {
        q.g(callback, "$callback");
        q.g(modes, "modes");
        callback.invoke(modes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void speedTestConnectionInstanceGetNetworkOverhead$lambda$61(Function1 callback, int i10) {
        q.g(callback, "$callback");
        callback.invoke(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void speedTestConnectionInstanceSetOnPingCallback$lambda$58(Function4 cb2, int i10, String server, int i11, int i12) {
        q.g(cb2, "$cb");
        q.g(server, "server");
        cb2.invoke(Integer.valueOf(i10), server, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void speedTestConnectionInstanceSetOnPingTimeoutCallback$lambda$59(Function4 cb2, String server, int i10, int i11, int i12) {
        q.g(cb2, "$cb");
        q.g(server, "server");
        cb2.invoke(server, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void speedTestConnectionInstanceStartSpeedTestReceiver$lambda$63(Function0 callback) {
        q.g(callback, "$callback");
        callback.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void speedTestConnectionInstanceStartSpeedTestSender$lambda$62(Function2 callback, int i10, String desc) {
        q.g(callback, "$callback");
        q.g(desc, "desc");
        callback.invoke(Integer.valueOf(i10), desc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void speedTestConnectionInstanceStopSpeedTestReceiver$lambda$64(Function2 callback, int i10, String results) {
        q.g(callback, "$callback");
        q.g(results, "results");
        callback.invoke(Integer.valueOf(i10), results);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLocalAudioRecording$lambda$40(Function1 callback, boolean z10) {
        q.g(callback, "$callback");
        callback.invoke(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopLocalAudioRecording$lambda$42$lambda$41(Function2 callback, String fileName, int i10) {
        q.g(callback, "$callback");
        q.g(fileName, "fileName");
        callback.invoke(fileName, Integer.valueOf(i10));
    }

    private final void stopScreenCapturerForConnection(int i10) {
        ScreenCapturerForConnection screenCapturerForConnection = this.screenCapturer;
        boolean z10 = false;
        if (screenCapturerForConnection != null && screenCapturerForConnection.getConnectionId() == i10) {
            z10 = true;
        }
        if (z10) {
            ScreenCapturerForConnection screenCapturerForConnection2 = this.screenCapturer;
            if (screenCapturerForConnection2 != null) {
                screenCapturerForConnection2.release();
            }
            this.screenCapturer = null;
        }
    }

    public final Unit connectionInstanceConfigureConnectionRetries$media_engine_release(int i10, int i11, int i12, int i13) {
        NativeConnection connection = getConnection(i10, "configureConnectionRetries");
        if (connection == null) {
            return null;
        }
        connection.configureConnectionRetries(i11, i12, i13);
        return Unit.f22104a;
    }

    public final void connectionInstanceDestroy$media_engine_release(int i10) {
        stopScreenCapturerForConnection(i10);
        this.engineConnections.removeAndDispose(i10);
    }

    public final Unit connectionInstanceDestroyUser$media_engine_release(int i10, String userId) {
        q.g(userId, "userId");
        NativeConnection connection = getConnection(i10, "destroyUser");
        if (connection == null) {
            return null;
        }
        connection.destroyUser(userId);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceGetEncryptionModes$media_engine_release(int i10, final Function1<? super String[], Unit> callback) {
        q.g(callback, "callback");
        NativeConnection connection = getConnection(i10, "getEncryptionModes");
        if (connection == null) {
            return null;
        }
        connection.getEncryptionModes(new NativeConnection.GetEncryptionModesCallback() { // from class: com.discord.media.engine.y
            @Override // com.discord.p000native.engine.NativeConnection.GetEncryptionModesCallback
            public final void onEncryptionModes(String[] strArr) {
                MediaEngine.connectionInstanceGetEncryptionModes$lambda$53(Function1.this, strArr);
            }
        });
        return Unit.f22104a;
    }

    public final Unit connectionInstanceGetFilteredStats$media_engine_release(int i10, int i11, final Function1<? super String, Unit> callback) {
        q.g(callback, "callback");
        NativeConnection connection = getConnection(i10, "getFilteredStats");
        if (connection == null) {
            return null;
        }
        connection.getFilteredStats(i11, new NativeConnection.GetStatsCallback() { // from class: com.discord.media.engine.h
            @Override // com.discord.p000native.engine.NativeConnection.GetStatsCallback
            public final void onStats(String str) {
                MediaEngine.connectionInstanceGetFilteredStats$lambda$55(Function1.this, str);
            }
        });
        return Unit.f22104a;
    }

    public final Unit connectionInstanceGetStats$media_engine_release(int i10, final Function1<? super String, Unit> callback) {
        q.g(callback, "callback");
        NativeConnection connection = getConnection(i10, "getStats");
        if (connection == null) {
            return null;
        }
        connection.getStats(new NativeConnection.GetStatsCallback() { // from class: com.discord.media.engine.p
            @Override // com.discord.p000native.engine.NativeConnection.GetStatsCallback
            public final void onStats(String str) {
                MediaEngine.connectionInstanceGetStats$lambda$54(Function1.this, str);
            }
        });
        return Unit.f22104a;
    }

    public final Unit connectionInstanceMergeUsers$media_engine_release(int i10, String usersJSON) {
        q.g(usersJSON, "usersJSON");
        NativeConnection connection = getConnection(i10, "mergeUsers");
        if (connection == null) {
            return null;
        }
        connection.mergeUsers(usersJSON);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetLocalMute$media_engine_release(int i10, String userId, boolean z10) {
        q.g(userId, "userId");
        NativeConnection connection = getConnection(i10, "setLocalMute");
        if (connection == null) {
            return null;
        }
        connection.setLocalMute(userId, z10);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetLocalPan$media_engine_release(int i10, String userId, float f10, float f11) {
        q.g(userId, "userId");
        NativeConnection connection = getConnection(i10, "setLocalPan");
        if (connection == null) {
            return null;
        }
        connection.setLocalPan(userId, f10, f11);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetLocalVolume$media_engine_release(int i10, String userId, float f10) {
        q.g(userId, "userId");
        NativeConnection connection = getConnection(i10, "setLocalVolume");
        if (connection == null) {
            return null;
        }
        connection.setLocalVolume(userId, f10);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetMinimumOutputDelay$media_engine_release(int i10, int i11) {
        NativeConnection connection = getConnection(i10, "setMinimumOutputDelay");
        if (connection == null) {
            return null;
        }
        connection.setMinimumOutputDelay(i11);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetNoInputThreshold$media_engine_release(int i10, float f10) {
        NativeConnection connection = getConnection(i10, "setNoInputThreshold");
        if (connection == null) {
            return null;
        }
        connection.setNoInputThreshold(f10);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetOnPingCallback$media_engine_release(int i10, final Function4<? super Integer, ? super String, ? super Integer, ? super Integer, Unit> cb2) {
        q.g(cb2, "cb");
        NativeConnection connection = getConnection(i10, "setOnPingCallback");
        if (connection == null) {
            return null;
        }
        connection.setOnPingCallback(new NativeConnection.OnPingCallback() { // from class: com.discord.media.engine.e
            @Override // com.discord.p000native.engine.NativeConnection.OnPingCallback
            public final void onPing(int i11, String str, int i12, int i13) {
                MediaEngine.connectionInstanceSetOnPingCallback$lambda$48(Function4.this, i11, str, i12, i13);
            }
        });
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetOnPingTimeoutCallback$media_engine_release(int i10, final Function4<? super String, ? super Integer, ? super Integer, ? super Integer, Unit> cb2) {
        q.g(cb2, "cb");
        NativeConnection connection = getConnection(i10, "setOnPingTimeoutCallback");
        if (connection == null) {
            return null;
        }
        connection.setOnPingTimeoutCallback(new NativeConnection.OnPingTimeoutCallback() { // from class: com.discord.media.engine.j
            @Override // com.discord.p000native.engine.NativeConnection.OnPingTimeoutCallback
            public final void onPingTimeout(String str, int i11, int i12, int i13) {
                MediaEngine.connectionInstanceSetOnPingTimeoutCallback$lambda$49(Function4.this, str, i11, i12, i13);
            }
        });
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetOnSpeakingCallback$media_engine_release(int i10, final Function2<? super String, ? super Integer, Unit> cb2) {
        q.g(cb2, "cb");
        NativeConnection connection = getConnection(i10, "setOnSpeakingCallback");
        if (connection == null) {
            return null;
        }
        connection.setOnSpeakingCallback(new NativeConnection.OnSpeakingCallback() { // from class: com.discord.media.engine.x
            @Override // com.discord.p000native.engine.NativeConnection.OnSpeakingCallback
            public final void onSpeaking(String str, int i11) {
                MediaEngine.connectionInstanceSetOnSpeakingCallback$lambda$47(Function2.this, str, i11);
            }
        });
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetOnVideoCallback$media_engine_release(int i10, final Function4<? super String, ? super Long, ? super String, ? super String, Unit> cb2) {
        q.g(cb2, "cb");
        NativeConnection connection = getConnection(i10, "setOnVideoCallback");
        if (connection == null) {
            return null;
        }
        connection.setOnVideoCallback(new NativeConnection.OnVideoCallback() { // from class: com.discord.media.engine.c
            @Override // com.discord.p000native.engine.NativeConnection.OnVideoCallback
            public final void onVideo(String str, long j10, String str2, String str3) {
                MediaEngine.connectionInstanceSetOnVideoCallback$lambda$50(Function4.this, str, j10, str2, str3);
            }
        });
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetPTTActive$media_engine_release(int i10, boolean z10, boolean z11) {
        NativeConnection connection = getConnection(i10, "setPTTActive");
        if (connection == null) {
            return null;
        }
        connection.setPTTActive(z10, z11);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetPingInterval$media_engine_release(int i10, int i11) {
        NativeConnection connection = getConnection(i10, "setPingInterval");
        if (connection == null) {
            return null;
        }
        connection.setPingInterval(i11);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetSelfDeafen$media_engine_release(int i10, boolean z10) {
        NativeConnection connection = getConnection(i10, "setSelfDeafen");
        if (connection == null) {
            return null;
        }
        connection.setSelfDeafen(z10);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetSelfMute$media_engine_release(int i10, boolean z10) {
        NativeConnection connection = getConnection(i10, "setSelfMute");
        if (connection == null) {
            return null;
        }
        connection.setSelfMute(z10);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetTransportOptions$media_engine_release(int i10, String optionsJSON) {
        q.g(optionsJSON, "optionsJSON");
        NativeConnection connection = getConnection(i10, "setTransportOptions");
        if (connection == null) {
            return null;
        }
        connection.setTransportOptions(optionsJSON);
        return Unit.f22104a;
    }

    public final Unit connectionInstanceSetVideoBroadcast$media_engine_release(int i10, boolean z10) {
        NativeConnection connection = getConnection(i10, "setVideoBroadcast");
        if (connection == null) {
            return null;
        }
        connection.setVideoBroadcast(z10);
        return Unit.f22104a;
    }

    public final void connectionInstanceStartBroadcast$media_engine_release(int i10, Intent permissions) {
        q.g(permissions, "permissions");
        NativeConnection connection = getConnection(i10, "startBroadcast");
        if (connection != null) {
            forceStopScreenCapturer();
            ScreenCapturer screenCapturer = new ScreenCapturer(permissions);
            this.screenCapturer = new ScreenCapturerForConnection(screenCapturer, i10);
            connection.startBroadcast(screenCapturer, screenCapturer.getSoundshare().getNativeInstance());
        }
    }

    public final void connectionInstanceStopBroadcast$media_engine_release(int i10) {
        NativeConnection connection = getConnection(i10, "stopBroadcast");
        if (connection != null) {
            connection.stopBroadcast();
        }
        stopScreenCapturerForConnection(i10);
    }

    public final void connectionInstanceStopBroadcastWithError$media_engine_release(int i10, int i11, String errorMessage) {
        q.g(errorMessage, "errorMessage");
        NativeConnection connection = getConnection(i10, "stopBroadcastWithError");
        if (connection != null) {
            connection.stopBroadcast();
        }
        stopScreenCapturerForConnection(i10);
    }

    public final void createSpeedTestConnection(int i10, String userId, String connectionOptionsJSON, final Function2<? super String, ? super Map<String, ? extends Object>, Unit> callback) {
        q.g(userId, "userId");
        q.g(connectionOptionsJSON, "connectionOptionsJSON");
        q.g(callback, "callback");
        this.engineSpeedTestConnections.register(i10, getEngine().createSpeedTestConnection(userId, connectionOptionsJSON, new NativeEngine.ConnectToServerCallback() { // from class: com.discord.media.engine.f
            @Override // com.discord.p000native.engine.NativeEngine.ConnectToServerCallback
            public final void onConnectToServer(ConnectionInfo connectionInfo, String str) {
                MediaEngine.createSpeedTestConnection$lambda$56(Function2.this, connectionInfo, str);
            }
        }));
    }

    public final void createVoiceConnection(int i10, String userId, String connectionOptionsJSON, final Function2<? super String, ? super Map<String, ? extends Object>, Unit> callback) {
        q.g(userId, "userId");
        q.g(connectionOptionsJSON, "connectionOptionsJSON");
        q.g(callback, "callback");
        this.engineConnections.register(i10, getEngine().createVoiceConnection(userId, connectionOptionsJSON, new NativeEngine.ConnectToServerCallback() { // from class: com.discord.media.engine.g
            @Override // com.discord.p000native.engine.NativeEngine.ConnectToServerCallback
            public final void onConnectToServer(ConnectionInfo connectionInfo, String str) {
                MediaEngine.createVoiceConnection$lambda$45(Function2.this, connectionInfo, str);
            }
        }));
    }

    public final void getAudioSubsystem$media_engine_release(Function2<? super String, ? super String, Unit> cb2) {
        q.g(cb2, "cb");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getAudioSubsystem(new MediaEngine$getAudioSubsystem$1$1(cb2));
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$getAudioSubsystem$$inlined$post$default$1(this, cb2));
        }
    }

    public final void getCodecCapabilities$media_engine_release(final Function1<? super String, Unit> callback) {
        q.g(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getCodecCapabilities(new NativeEngine.GetCodecCapabilitiesCallback() { // from class: com.discord.media.engine.b
                @Override // com.discord.p000native.engine.NativeEngine.GetCodecCapabilitiesCallback
                public final void onCodecCapabilities(String str) {
                    MediaEngine.getCodecCapabilities$lambda$32$lambda$31(Function1.this, str);
                }
            });
        } else {
            callback.invoke("{}");
        }
    }

    public final void getCodecSurvey$media_engine_release(Function1<? super String, Unit> callback) {
        String str;
        List l10;
        String e02;
        Object[] o10;
        Object[] o11;
        boolean isHardwareAccelerated;
        boolean H;
        q.g(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            JSONObject jSONObject = new JSONObject();
            int i10 = 0;
            String[] strArr = new String[0];
            String[] strArr2 = new String[0];
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            q.f(codecInfos, "codecList.codecInfos");
            int length = codecInfos.length;
            int i11 = 0;
            while (i11 < length) {
                MediaCodecInfo mediaCodecInfo = codecInfos[i11];
                String name = mediaCodecInfo.getName();
                q.f(name, "codecInfo.name");
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                q.f(supportedTypes, "codecInfo.supportedTypes");
                ArrayList<String> arrayList = new ArrayList();
                int length2 = supportedTypes.length;
                int i12 = i10;
                while (i12 < length2) {
                    String type = supportedTypes[i12];
                    q.f(type, "type");
                    H = u.H(type, MediaStreamTrack.VIDEO_TRACK_KIND, false, 2, null);
                    if (H) {
                        arrayList.add(type);
                    }
                    i12++;
                    codecInfos = codecInfos;
                    length = length;
                }
                for (String str2 : arrayList) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                        if (isHardwareAccelerated) {
                            str = "(HW)";
                        } else {
                            str = "(SW)";
                        }
                    } else {
                        str = "";
                    }
                    l10 = j.l(str2, name, str);
                    e02 = r.e0(l10, " ", null, null, 0, null, null, 62, null);
                    if (mediaCodecInfo.isEncoder()) {
                        o10 = e.o(strArr, e02);
                        strArr = (String[]) o10;
                    } else {
                        o11 = e.o(strArr2, e02);
                        strArr2 = (String[]) o11;
                    }
                }
                i11++;
                i10 = 0;
                codecInfos = codecInfos;
                length = length;
            }
            jSONObject.put("available_video_encoders", new JSONArray(strArr));
            jSONObject.put("available_video_decoders", new JSONArray(strArr2));
            String jSONObject2 = jSONObject.toString();
            q.f(jSONObject2, "codecJson.toString()");
            callback.invoke(jSONObject2);
            return;
        }
        callback.invoke("{}");
    }

    public final void getInputDevices$media_engine_release(final Function1<? super List<? extends Map<String, ? extends Object>>, Unit> callback) {
        List i10;
        q.g(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getInputDevices(new NativeEngine.GetAudioInputDevicesCallback() { // from class: com.discord.media.engine.n
                @Override // com.discord.p000native.engine.NativeEngine.GetAudioInputDevicesCallback
                public final void onDevices(AudioInputDeviceDescription[] audioInputDeviceDescriptionArr) {
                    MediaEngine.getInputDevices$lambda$10$lambda$9(Function1.this, audioInputDeviceDescriptionArr);
                }
            });
            return;
        }
        i10 = j.i();
        callback.invoke(i10);
    }

    public final void getOutputDevices$media_engine_release(final Function1<? super List<? extends Map<String, ? extends Object>>, Unit> callback) {
        List i10;
        q.g(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getOutputDevices(new NativeEngine.GetAudioOutputDevicesCallback() { // from class: com.discord.media.engine.t
                @Override // com.discord.p000native.engine.NativeEngine.GetAudioOutputDevicesCallback
                public final void onDevices(AudioOutputDeviceDescription[] audioOutputDeviceDescriptionArr) {
                    MediaEngine.getOutputDevices$lambda$15$lambda$14(Function1.this, audioOutputDeviceDescriptionArr);
                }
            });
            return;
        }
        i10 = j.i();
        callback.invoke(i10);
    }

    public final void getSupportedVideoCodecs$media_engine_release(final Function1<? super String[], Unit> callback) {
        q.g(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getSupportedVideoCodecs(new NativeEngine.GetSupportedVideoCodecsCallback() { // from class: com.discord.media.engine.s
                @Override // com.discord.p000native.engine.NativeEngine.GetSupportedVideoCodecsCallback
                public final void onSupportedVideoCodecs(String[] strArr) {
                    MediaEngine.getSupportedVideoCodecs$lambda$29$lambda$28(Function1.this, strArr);
                }
            });
        } else {
            callback.invoke(new String[0]);
        }
    }

    public final void getVideoInputDevices$media_engine_release(final Function1<? super List<? extends Map<String, ? extends Object>>, Unit> callback) {
        List i10;
        q.g(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().getVideoInputDevices(new NativeEngine.GetVideoInputDevicesCallback() { // from class: com.discord.media.engine.q
                @Override // com.discord.p000native.engine.NativeEngine.GetVideoInputDevicesCallback
                public final void onDevices(VideoInputDeviceDescription[] videoInputDeviceDescriptionArr) {
                    MediaEngine.getVideoInputDevices$lambda$20$lambda$19(Function1.this, videoInputDeviceDescriptionArr);
                }
            });
            return;
        }
        i10 = j.i();
        callback.invoke(i10);
    }

    public final void rankRtcRegions$media_engine_release(String regionsWithIpsJSON, final Function1<? super String[], Unit> callback) {
        q.g(regionsWithIpsJSON, "regionsWithIpsJSON");
        q.g(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().rankRtcRegions(regionsWithIpsJSON, new NativeEngine.GetRankedRtcRegionsCallback() { // from class: com.discord.media.engine.o
                @Override // com.discord.p000native.engine.NativeEngine.GetRankedRtcRegionsCallback
                public final void onRankedRtcRegions(String[] strArr) {
                    MediaEngine.rankRtcRegions$lambda$38$lambda$37(Function1.this, strArr);
                }
            });
        } else {
            callback.invoke(new String[0]);
        }
    }

    public final void reset() {
        System.nanoTime();
        k0.f(this.coroutineScope, null, 1, null);
        this.dispatcher.reset();
        forceStopScreenCapturer();
        this.engineConnections.removeAndDisposeAll();
        NativeEngine nativeEngine = this.engineInstance;
        if (nativeEngine != null) {
            nativeEngine.dispose();
        }
        this.engineInstance = null;
        Debug debug = Debug.INSTANCE;
    }

    public final void setActiveSinksChangeCallback$media_engine_release(Function2<? super String, ? super Boolean, Unit> cb2) {
        q.g(cb2, "cb");
        AttachedVideoSinks.INSTANCE.setActiveSinksChangeCallback(cb2);
    }

    public final void setAudioInputEnabled$media_engine_release(boolean z10) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setAudioInputEnabled(z10);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setAudioInputEnabled$$inlined$post$default$1(this, z10));
        }
    }

    public final void setBroadcastThumbnailParams$media_engine_release(int i10, int i11, int i12, Function1<? super String, Unit> callback) {
        q.g(callback, "callback");
        ScreenCapturerForConnection screenCapturerForConnection = this.screenCapturer;
        if (screenCapturerForConnection != null) {
            screenCapturerForConnection.component1().setThumbnailEmitter(new ThumbnailEmitter(i10, i11, i12 * 1000, new MediaEngine$setBroadcastThumbnailParams$1$1(this, callback)));
        }
    }

    public final void setDeviceChangeCallback$media_engine_release(Function3<? super List<? extends Map<String, ? extends Object>>, ? super List<? extends Map<String, ? extends Object>>, ? super List<? extends Map<String, ? extends Object>>, Unit> callback) {
        q.g(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOnDeviceChangeCallback(new MediaEngine$setDeviceChangeCallback$1$1(callback));
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setDeviceChangeCallback$$inlined$post$default$1(this, callback));
        }
    }

    public final void setEmitVADLevel2$media_engine_release(boolean z10) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setEmitVADLevel2(z10);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setEmitVADLevel2$$inlined$post$default$1(this, z10));
        }
    }

    public final void setInputDevice$media_engine_release(int i10) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setInputDeviceIndex(i10);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setInputDevice$$inlined$post$default$1(this, i10));
        }
    }

    public final void setInputVolume$media_engine_release(float f10) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setInputVolume(f10);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setInputVolume$$inlined$post$default$1(this, f10));
        }
    }

    public final void setNoInputThreshold$media_engine_release(float f10) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setNoInputThreshold(f10);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setNoInputThreshold$$inlined$post$default$1(this, f10));
        }
    }

    public final void setOnNoInputCallback$media_engine_release(Function1<? super Boolean, Unit> cb2) {
        q.g(cb2, "cb");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOnNoInputCallback(new MediaEngine$setOnNoInputCallback$1$1(cb2));
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setOnNoInputCallback$$inlined$post$default$1(this, cb2));
        }
    }

    public final void setOnVoiceCallback$media_engine_release(Function2<? super Float, ? super Integer, Unit> cb2) {
        q.g(cb2, "cb");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOnVoiceCallback(new MediaEngine$setOnVoiceCallback$1$1(cb2));
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setOnVoiceCallback$$inlined$post$default$1(this, cb2));
        }
    }

    public final void setOutputDevice$media_engine_release(int i10) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOutputDeviceIndex(i10);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setOutputDevice$$inlined$post$default$1(this, i10));
        }
    }

    public final void setOutputVolume$media_engine_release(float f10) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOutputVolume(f10);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setOutputVolume$$inlined$post$default$1(this, f10));
        }
    }

    public final void setTransportOptions$media_engine_release(String optionsJSON) {
        q.g(optionsJSON, "optionsJSON");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setTransportOptions(optionsJSON);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setTransportOptions$$inlined$post$default$1(this, optionsJSON));
        }
    }

    public final void setVideoInputDevice$media_engine_release(String deviceName) {
        q.g(deviceName, "deviceName");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setVideoInputDevice(deviceName);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setVideoInputDevice$$inlined$post$default$1(this, deviceName));
        }
    }

    public final void setVideoOutputSink$media_engine_release(String streamIdentifier, Function1<? super VideoFrame, Boolean> function1) {
        q.g(streamIdentifier, "streamIdentifier");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        if (!asyncInitDispatcher.getInitialized()) {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setVideoOutputSink$$inlined$post$1(function1, this, streamIdentifier));
        } else if (function1 == null) {
            getEngine().setVideoOutputSink(streamIdentifier, null);
        } else {
            getEngine().setVideoOutputSink(streamIdentifier, new MediaEngine$setVideoOutputSink$1$1(function1));
        }
    }

    public final void speedTestConnectionInstanceDestroy$media_engine_release(int i10) {
        this.engineSpeedTestConnections.removeAndDispose(i10);
    }

    public final Unit speedTestConnectionInstanceGetEncryptionModes$media_engine_release(int i10, final Function1<? super String[], Unit> callback) {
        q.g(callback, "callback");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i10, "getEncryptionModes");
        if (speedTestConnection == null) {
            return null;
        }
        speedTestConnection.getEncryptionModes(new NativeSpeedTestConnection.GetEncryptionModesCallback() { // from class: com.discord.media.engine.d
            @Override // com.discord.p000native.engine.NativeSpeedTestConnection.GetEncryptionModesCallback
            public final void onEncryptionModes(String[] strArr) {
                MediaEngine.speedTestConnectionInstanceGetEncryptionModes$lambda$60(Function1.this, strArr);
            }
        });
        return Unit.f22104a;
    }

    public final Unit speedTestConnectionInstanceGetNetworkOverhead$media_engine_release(int i10, final Function1<? super Integer, Unit> callback) {
        q.g(callback, "callback");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i10, "getNetworkOverhead");
        if (speedTestConnection == null) {
            return null;
        }
        speedTestConnection.getNetworkOverhead(new NativeSpeedTestConnection.GetNetworkOverheadCallback() { // from class: com.discord.media.engine.l
            @Override // com.discord.p000native.engine.NativeSpeedTestConnection.GetNetworkOverheadCallback
            public final void onNetworkOverhead(int i11) {
                MediaEngine.speedTestConnectionInstanceGetNetworkOverhead$lambda$61(Function1.this, i11);
            }
        });
        return Unit.f22104a;
    }

    public final Unit speedTestConnectionInstanceSetOnPingCallback$media_engine_release(int i10, final Function4<? super Integer, ? super String, ? super Integer, ? super Integer, Unit> cb2) {
        q.g(cb2, "cb");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i10, "setOnPingCallback");
        if (speedTestConnection == null) {
            return null;
        }
        speedTestConnection.setOnPingCallback(new NativeSpeedTestConnection.OnPingCallback() { // from class: com.discord.media.engine.u
            @Override // com.discord.p000native.engine.NativeSpeedTestConnection.OnPingCallback
            public final void onPing(int i11, String str, int i12, int i13) {
                MediaEngine.speedTestConnectionInstanceSetOnPingCallback$lambda$58(Function4.this, i11, str, i12, i13);
            }
        });
        return Unit.f22104a;
    }

    public final Unit speedTestConnectionInstanceSetOnPingTimeoutCallback$media_engine_release(int i10, final Function4<? super String, ? super Integer, ? super Integer, ? super Integer, Unit> cb2) {
        q.g(cb2, "cb");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i10, "setOnPingTimeoutCallback");
        if (speedTestConnection == null) {
            return null;
        }
        speedTestConnection.setOnPingTimeoutCallback(new NativeSpeedTestConnection.OnPingTimeoutCallback() { // from class: com.discord.media.engine.w
            @Override // com.discord.p000native.engine.NativeSpeedTestConnection.OnPingTimeoutCallback
            public final void onPingTimeout(String str, int i11, int i12, int i13) {
                MediaEngine.speedTestConnectionInstanceSetOnPingTimeoutCallback$lambda$59(Function4.this, str, i11, i12, i13);
            }
        });
        return Unit.f22104a;
    }

    public final Unit speedTestConnectionInstanceSetPingInterval$media_engine_release(int i10, int i11) {
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i10, "setPingInterval");
        if (speedTestConnection == null) {
            return null;
        }
        speedTestConnection.setPingInterval(i11);
        return Unit.f22104a;
    }

    public final Unit speedTestConnectionInstanceSetTransportOptions$media_engine_release(int i10, String optionsJSON) {
        q.g(optionsJSON, "optionsJSON");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i10, "setTransportOptions");
        if (speedTestConnection == null) {
            return null;
        }
        speedTestConnection.setTransportOptions(optionsJSON);
        return Unit.f22104a;
    }

    public final Unit speedTestConnectionInstanceStartSpeedTestReceiver$media_engine_release(int i10, String optionsJSON, final Function0<Unit> callback) {
        q.g(optionsJSON, "optionsJSON");
        q.g(callback, "callback");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i10, "startSpeedTestReceiver");
        if (speedTestConnection == null) {
            return null;
        }
        speedTestConnection.startSpeedTestReceiver(optionsJSON, new NativeSpeedTestConnection.StartSpeedTestReceiverCallback() { // from class: com.discord.media.engine.v
            @Override // com.discord.p000native.engine.NativeSpeedTestConnection.StartSpeedTestReceiverCallback
            public final void onReady() {
                MediaEngine.speedTestConnectionInstanceStartSpeedTestReceiver$lambda$63(Function0.this);
            }
        });
        return Unit.f22104a;
    }

    public final Unit speedTestConnectionInstanceStartSpeedTestSender$media_engine_release(int i10, String optionsJSON, final Function2<? super Integer, ? super String, Unit> callback) {
        q.g(optionsJSON, "optionsJSON");
        q.g(callback, "callback");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i10, "startSpeedTestSender");
        if (speedTestConnection == null) {
            return null;
        }
        speedTestConnection.startSpeedTestSender(optionsJSON, new NativeSpeedTestConnection.StartSpeedTestSenderCallback() { // from class: com.discord.media.engine.a
            @Override // com.discord.p000native.engine.NativeSpeedTestConnection.StartSpeedTestSenderCallback
            public final void onDone(int i11, String str) {
                MediaEngine.speedTestConnectionInstanceStartSpeedTestSender$lambda$62(Function2.this, i11, str);
            }
        });
        return Unit.f22104a;
    }

    public final Unit speedTestConnectionInstanceStopSpeedTestReceiver$media_engine_release(int i10, final Function2<? super Integer, ? super String, Unit> callback) {
        q.g(callback, "callback");
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i10, "stopSpeedTestReceiver");
        if (speedTestConnection == null) {
            return null;
        }
        speedTestConnection.stopSpeedTestReceiver(new NativeSpeedTestConnection.StopSpeedTestReceiverCallback() { // from class: com.discord.media.engine.k
            @Override // com.discord.p000native.engine.NativeSpeedTestConnection.StopSpeedTestReceiverCallback
            public final void onResults(int i11, String str) {
                MediaEngine.speedTestConnectionInstanceStopSpeedTestReceiver$lambda$64(Function2.this, i11, str);
            }
        });
        return Unit.f22104a;
    }

    public final Unit speedTestConnectionInstanceStopSpeedTestSender$media_engine_release(int i10) {
        NativeSpeedTestConnection speedTestConnection = getSpeedTestConnection(i10, "stopSpeedTestSender");
        if (speedTestConnection == null) {
            return null;
        }
        speedTestConnection.stopSpeedTestSender();
        return Unit.f22104a;
    }

    public final void startLocalAudioRecording$media_engine_release(String optionsJSON, final Function1<? super Boolean, Unit> callback) {
        q.g(optionsJSON, "optionsJSON");
        q.g(callback, "callback");
        getEngine().startLocalAudioRecording(optionsJSON, new NativeEngine.StartLocalAudioRecordingCallback() { // from class: com.discord.media.engine.i
            @Override // com.discord.p000native.engine.NativeEngine.StartLocalAudioRecordingCallback
            public final void onStartLocalAudioRecording(boolean z10) {
                MediaEngine.startLocalAudioRecording$lambda$40(Function1.this, z10);
            }
        });
    }

    public final void stopLocalAudioRecording$media_engine_release(final Function2<? super String, ? super Integer, Unit> callback) {
        q.g(callback, "callback");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().stopLocalAudioRecording(new NativeEngine.StopLocalAudioRecordingCallback() { // from class: com.discord.media.engine.m
                @Override // com.discord.p000native.engine.NativeEngine.StopLocalAudioRecordingCallback
                public final void onStopLocalAudioRecording(String str, int i10) {
                    MediaEngine.stopLocalAudioRecording$lambda$42$lambda$41(Function2.this, str, i10);
                }
            });
        } else {
            callback.invoke("", 0);
        }
    }

    public final void setInputDevice$media_engine_release(String deviceIndex) {
        q.g(deviceIndex, "deviceIndex");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setInputDevice(deviceIndex);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setInputDevice$$inlined$post$default$2(this, deviceIndex));
        }
    }

    public final void setOutputDevice$media_engine_release(String deviceIndex) {
        q.g(deviceIndex, "deviceIndex");
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setOutputDevice(deviceIndex);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setOutputDevice$$inlined$post$default$2(this, deviceIndex));
        }
    }

    public final void setVideoInputDevice$media_engine_release(int i10) {
        AsyncInitDispatcher asyncInitDispatcher = this.dispatcher;
        asyncInitDispatcher.validateState();
        if (asyncInitDispatcher.getInitialized()) {
            getEngine().setVideoInputDeviceIndex(i10);
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new MediaEngine$setVideoInputDevice$$inlined$post$default$2(this, i10));
        }
    }

    public /* synthetic */ MediaEngine(Context context, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? y0.a() : coroutineDispatcher);
    }
}
