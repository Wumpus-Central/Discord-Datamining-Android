package com.discord.rlottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.BV.LinearGradient.LinearGradientManager;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.rlottie.RLottieDrawable;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.q;
import oj.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\b\u0016\u0018\u0000 \u007f2\u00020\u00012\u00020\u0002:\u0003\u007f\u0080\u0001BC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBO\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0018J\u0010\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010'J\u0006\u0010X\u001a\u00020VJ\b\u0010Y\u001a\u00020VH\u0002J\u0006\u0010Z\u001a\u00020VJ\b\u0010[\u001a\u00020VH\u0002J\u0010\u0010\\\u001a\u00020V2\u0006\u0010]\u001a\u00020^H\u0016J\b\u0010_\u001a\u00020\u0006H\u0016J\b\u0010`\u001a\u00020\u0006H\u0016J\b\u0010a\u001a\u00020\u0006H\u0016J\b\u0010b\u001a\u00020\u0006H\u0016J\b\u0010c\u001a\u00020\u0006H\u0016J\u0006\u0010d\u001a\u00020\tJ\b\u0010e\u001a\u00020\tH\u0002J\b\u0010f\u001a\u00020VH\u0002J\b\u00101\u001a\u00020\tH\u0016J\u0010\u0010g\u001a\u00020V2\u0006\u0010h\u001a\u00020,H\u0014J\u0006\u0010i\u001a\u00020VJ\b\u0010j\u001a\u00020VH\u0002J\u0010\u0010k\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010'J\u001b\u0010l\u001a\u00020V2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010;¢\u0006\u0002\u0010nJ\b\u0010o\u001a\u00020VH\u0002J\u0006\u0010p\u001a\u00020\tJ\b\u0010q\u001a\u00020\tH\u0002J\u000e\u0010r\u001a\u00020V2\u0006\u0010s\u001a\u00020\tJ\u0010\u0010t\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010'J\u0016\u0010u\u001a\u00020V2\u0006\u0010v\u001a\u00020\u00142\u0006\u0010w\u001a\u00020\u0006J\u000e\u0010x\u001a\u00020V2\u0006\u0010s\u001a\u00020FJ\u000e\u0010y\u001a\u00020V2\u0006\u0010z\u001a\u00020\fJ\u001c\u0010{\u001a\u00020V2\u0014\u0010|\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000109J\b\u0010}\u001a\u00020VH\u0016J\b\u0010~\u001a\u00020VH\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010!\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u000e\u00100\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000609X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010;X\u0082\u000e¢\u0006\u0004\n\u0002\u0010<R\u000e\u0010=\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010>\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u001cR\u001c\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010'0B0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000609X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010;X\u0082\u000e¢\u0006\u0004\n\u0002\u0010<R\u000e\u0010E\u001a\u00020FX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010G\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u001cR\u000e\u0010I\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0081\u0001"}, d2 = {"Lcom/discord/rlottie/RLottieDrawable;", "Landroid/graphics/drawable/BitmapDrawable;", "Landroid/graphics/drawable/Animatable;", JSStackTrace.FILE_KEY, "Ljava/io/File;", "w", "", "h", "precache", "", "limitFps", "screenRefreshRate", "", "colorReplacement", "", "(Ljava/io/File;IIZZF[I)V", "context", "Landroid/content/Context;", "rawRes", ZeroconfModule.KEY_SERVICE_NAME, "", "width", "height", "startDecode", "(Landroid/content/Context;ILjava/lang/String;IIFZ[I)V", "animatedBitmap", "Landroid/graphics/Bitmap;", "getAnimatedBitmap", "()Landroid/graphics/Bitmap;", "applyTransformation", "applyingLayerColors", "autoRepeatPlayCount", "<set-?>", "backgroundBitmap", "getBackgroundBitmap", "cacheGenerateTask", "Ljava/lang/Runnable;", "currentFrame", "currentParentView", "Landroid/view/View;", "customEndFrame", "decodeSingleFrame", "destroyWhenDone", "dstRect", "Landroid/graphics/Rect;", "forceFrameRedraw", "isCurrentParentViewMaster", "()Z", "isRecycled", "isRunning", "lastFrameTime", "", "loadFrameRunnable", "loadFrameTask", "metaData", "nativePtr", "newColorUpdates", "Ljava/util/HashMap;", "newReplaceColors", "", "[Ljava/lang/Integer;", "nextFrameIsLast", "nextRenderingBitmap", "getNextRenderingBitmap", "parentViews", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "pendingColorUpdates", "pendingReplaceColors", "playbackMode", "Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;", "renderingBitmap", "getRenderingBitmap", ViewProps.SCALE_X, ViewProps.SCALE_Y, "shouldLimitFps", "singleFrameDecoded", "timeBetweenFrames", "uiRunnable", "uiRunnableCacheFinished", "uiRunnableGenerateCache", "uiRunnableGenerateCacheQueue", "uiRunnableLastFrame", "uiRunnableNoFrame", "vibrationPattern", "addParentView", "", "view", "beginApplyLayerColors", "checkRunningTasks", "commitApplyLayerColors", "decodeFrameFinishedInternal", "draw", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "getIntrinsicWidth", "getMinimumHeight", "getMinimumWidth", "getOpacity", "hasBitmap", "hasParentView", "invalidateInternal", "onBoundsChange", "bounds", "recycle", "recycleResources", "removeParentView", "replaceColors", LinearGradientManager.PROP_COLORS, "([Ljava/lang/Integer;)V", "requestRedrawColors", "restart", "scheduleNextGetFrame", "setAllowDecodeSingleFrame", "value", "setCurrentParentView", "setLayerColor", "layerName", ViewProps.COLOR, "setPlaybackMode", "setProgress", "oldProgress", "setVibrationPattern", "pattern", ViewProps.START, "stop", "Companion", "PlaybackMode", "rlottie_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes5.dex */
public class RLottieDrawable extends BitmapDrawable implements Animatable {
    private static ThreadPoolExecutor lottieCacheGenerateQueue;
    private boolean applyTransformation;
    private boolean applyingLayerColors;
    private int autoRepeatPlayCount;
    private volatile Bitmap backgroundBitmap;
    private Runnable cacheGenerateTask;
    private int currentFrame;
    private View currentParentView;
    private int customEndFrame;
    private boolean decodeSingleFrame;
    private boolean destroyWhenDone;
    private final Rect dstRect;
    private boolean forceFrameRedraw;
    private int height;
    private volatile boolean isRecycled;
    private volatile boolean isRunning;
    private long lastFrameTime;
    private final Runnable loadFrameRunnable;
    private Runnable loadFrameTask;
    private final int[] metaData;
    private volatile long nativePtr;
    private final HashMap<String, Integer> newColorUpdates;
    private Integer[] newReplaceColors;
    private volatile boolean nextFrameIsLast;
    private volatile Bitmap nextRenderingBitmap;
    private final ArrayList<WeakReference<View>> parentViews;
    private volatile HashMap<String, Integer> pendingColorUpdates;
    private Integer[] pendingReplaceColors;
    private PlaybackMode playbackMode;
    private volatile Bitmap renderingBitmap;
    private float scaleX;
    private float scaleY;
    private float screenRefreshRate;
    private boolean shouldLimitFps;
    private boolean singleFrameDecoded;
    private int timeBetweenFrames;
    private final Runnable uiRunnable;
    private final Runnable uiRunnableCacheFinished;
    private final Runnable uiRunnableGenerateCache;
    private final Runnable uiRunnableGenerateCacheQueue;
    private final Runnable uiRunnableLastFrame;
    private final Runnable uiRunnableNoFrame;
    private HashMap<Integer, Integer> vibrationPattern;
    private int width;
    public static final Companion Companion = new Companion(null);
    private static final Handler uiHandler = new Handler(Looper.getMainLooper());
    private static byte[] readBuffer = new byte[65536];
    private static final byte[] buffer = new byte[4096];
    private static final ExecutorService loadFrameRunnableQueue = Executors.newCachedThreadPool();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0017H\u0082 J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0082 J+\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0082 J\u0011\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0082 JA\u0010!\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0017H\u0082 J\u0019\u0010'\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0015H\u0082 J!\u0010(\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0012H\u0082 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/discord/rlottie/RLottieDrawable$Companion;", "", "()V", "buffer", "", "loadFrameRunnableQueue", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "lottieCacheGenerateQueue", "Ljava/util/concurrent/ThreadPoolExecutor;", "readBuffer", "uiHandler", "Landroid/os/Handler;", "create", "", "src", "", "w", "", "h", "params", "", "precache", "", "colorReplacement", "limitFps", "createCache", "", "ptr", "createWithJson", "json", ZeroconfModule.KEY_SERVICE_NAME, "destroy", "getFrame", "frame", "bitmap", "Landroid/graphics/Bitmap;", "stride", "clear", "replaceColors", "setLayerColor", "layer", ViewProps.COLOR, "rlottie_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final native long create(String str, int i10, int i11, int[] iArr, boolean z10, int[] iArr2, boolean z11);

        /* JADX INFO: Access modifiers changed from: private */
        public final native void createCache(long j10, int i10, int i11);

        /* JADX INFO: Access modifiers changed from: private */
        public final native long createWithJson(String str, String str2, int[] iArr, int[] iArr2);

        /* JADX INFO: Access modifiers changed from: private */
        public final native void destroy(long j10);

        /* JADX INFO: Access modifiers changed from: private */
        public final native int getFrame(long j10, int i10, Bitmap bitmap, int i11, int i12, int i13, boolean z10);

        /* JADX INFO: Access modifiers changed from: private */
        public final native void replaceColors(long j10, int[] iArr);

        /* JADX INFO: Access modifiers changed from: private */
        public final native void setLayerColor(long j10, String str, int i10);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;", "", "(Ljava/lang/String;I)V", "LOOP", "ONCE", "FREEZE", "rlottie_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes5.dex */
    public enum PlaybackMode {
        LOOP,
        ONCE,
        FREEZE
    }

    public RLottieDrawable(Context context, int i10, String str, int i11, int i12, float f10) {
        this(context, i10, str, i11, i12, f10, false, null, 192, null);
    }

    public RLottieDrawable(Context context, int i10, String str, int i11, int i12, float f10, boolean z10) {
        this(context, i10, str, i11, i12, f10, z10, null, 128, null);
    }

    public RLottieDrawable(File file, int i10, int i11, boolean z10, boolean z11, float f10) {
        this(file, i10, i11, z10, z11, f10, null, 64, null);
    }

    public /* synthetic */ RLottieDrawable(File file, int i10, int i11, boolean z10, boolean z11, float f10, int[] iArr, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i10, i11, z10, z11, f10, (i12 & 64) != 0 ? null : iArr);
    }

    private final void checkRunningTasks() {
        if (this.cacheGenerateTask != null) {
            ThreadPoolExecutor threadPoolExecutor = lottieCacheGenerateQueue;
            if (threadPoolExecutor == null) {
                q.s();
            }
            if (threadPoolExecutor.remove(this.cacheGenerateTask)) {
                this.cacheGenerateTask = null;
            }
        }
        if (!hasParentView() && this.nextRenderingBitmap != null && this.loadFrameTask != null) {
            this.loadFrameTask = null;
            this.nextRenderingBitmap = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decodeFrameFinishedInternal() {
        if (this.destroyWhenDone) {
            checkRunningTasks();
            if (this.loadFrameTask == null && this.cacheGenerateTask == null && this.nativePtr != 0) {
                Companion.destroy(this.nativePtr);
                this.nativePtr = 0L;
            }
        }
        if (this.nativePtr == 0) {
            recycleResources();
            return;
        }
        if (!hasParentView()) {
            stop();
        }
        scheduleNextGetFrame();
    }

    private final boolean hasParentView() {
        if (getCallback() != null) {
            return true;
        }
        for (int size = this.parentViews.size(); size > 0; size--) {
            if (this.parentViews.get(0).get() != null) {
                return true;
            }
            this.parentViews.remove(0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateInternal() {
        int size = this.parentViews.size();
        int i10 = 0;
        while (i10 < size) {
            View view = this.parentViews.get(i10).get();
            if (view != null) {
                view.invalidate();
            } else {
                this.parentViews.remove(i10);
                size--;
                i10--;
            }
            i10++;
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    private final boolean isCurrentParentViewMaster() {
        if (getCallback() != null) {
            return true;
        }
        for (int size = this.parentViews.size(); size > 0; size--) {
            if (this.parentViews.get(0).get() == null) {
                this.parentViews.remove(0);
            } else if (this.parentViews.get(0).get() == this.currentParentView) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    private final void recycleResources() {
        if (this.renderingBitmap != null) {
            Bitmap bitmap = this.renderingBitmap;
            if (bitmap == null) {
                q.s();
            }
            bitmap.recycle();
            this.renderingBitmap = null;
        }
        if (this.backgroundBitmap != null) {
            Bitmap bitmap2 = this.backgroundBitmap;
            if (bitmap2 == null) {
                q.s();
            }
            bitmap2.recycle();
            this.backgroundBitmap = null;
        }
    }

    private final void requestRedrawColors() {
        if (!this.applyingLayerColors && !this.isRunning && this.decodeSingleFrame) {
            if (this.currentFrame <= 2) {
                this.currentFrame = 0;
            }
            this.nextFrameIsLast = false;
            this.singleFrameDecoded = false;
            if (!scheduleNextGetFrame()) {
                this.forceFrameRedraw = true;
            }
        }
        invalidateInternal();
    }

    private final boolean scheduleNextGetFrame() {
        if (this.loadFrameTask != null || this.nextRenderingBitmap != null || this.nativePtr == 0 || this.destroyWhenDone) {
            return false;
        }
        if (!this.isRunning) {
            boolean z10 = this.decodeSingleFrame;
            if (!z10) {
                return false;
            }
            if (z10 && this.singleFrameDecoded) {
                return false;
            }
        }
        if (!this.newColorUpdates.isEmpty()) {
            this.pendingColorUpdates.putAll(this.newColorUpdates);
            this.newColorUpdates.clear();
        }
        Integer[] numArr = this.newReplaceColors;
        if (numArr != null) {
            this.pendingReplaceColors = numArr;
            this.newReplaceColors = null;
        }
        ExecutorService executorService = loadFrameRunnableQueue;
        Runnable runnable = this.loadFrameRunnable;
        this.loadFrameTask = runnable;
        executorService.execute(runnable);
        return true;
    }

    public final void addParentView(View view) {
        if (view != null) {
            int size = this.parentViews.size();
            int i10 = 0;
            while (i10 < size) {
                if (this.parentViews.get(i10).get() != view) {
                    if (this.parentViews.get(i10).get() == null) {
                        this.parentViews.remove(i10);
                        size--;
                        i10--;
                    }
                    i10++;
                } else {
                    return;
                }
            }
            this.parentViews.add(0, new WeakReference<>(view));
        }
    }

    public final void beginApplyLayerColors() {
        this.applyingLayerColors = true;
    }

    public final void commitApplyLayerColors() {
        if (this.applyingLayerColors) {
            this.applyingLayerColors = false;
            if (!this.isRunning && this.decodeSingleFrame) {
                if (this.currentFrame <= 2) {
                    this.currentFrame = 0;
                }
                this.nextFrameIsLast = false;
                this.singleFrameDecoded = false;
                if (!scheduleNextGetFrame()) {
                    this.forceFrameRedraw = true;
                }
            }
            invalidateInternal();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10;
        View view;
        int i11;
        q.h(canvas, "canvas");
        if (this.nativePtr != 0 && !this.destroyWhenDone) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - this.lastFrameTime);
            float f10 = 60;
            if (this.screenRefreshRate <= f10) {
                i10 = this.timeBetweenFrames - 6;
            } else {
                i10 = this.timeBetweenFrames;
            }
            if (this.isRunning) {
                if (this.renderingBitmap == null && this.nextRenderingBitmap == null) {
                    scheduleNextGetFrame();
                } else if (this.nextRenderingBitmap != null && ((this.renderingBitmap == null || abs >= i10) && isCurrentParentViewMaster())) {
                    HashMap<Integer, Integer> hashMap = this.vibrationPattern;
                    if (!(hashMap == null || this.currentParentView == null)) {
                        if (hashMap == null) {
                            q.s();
                        }
                        Integer num = hashMap.get(Integer.valueOf(this.currentFrame - 1));
                        if (!(num == null || (view = this.currentParentView) == null)) {
                            if (num.intValue() == 1) {
                                i11 = 0;
                            } else {
                                i11 = 3;
                            }
                            view.performHapticFeedback(i11, 2);
                        }
                    }
                    this.backgroundBitmap = this.renderingBitmap;
                    this.renderingBitmap = this.nextRenderingBitmap;
                    if (this.nextFrameIsLast) {
                        stop();
                    }
                    this.loadFrameTask = null;
                    this.singleFrameDecoded = true;
                    this.nextRenderingBitmap = null;
                    if (this.screenRefreshRate > f10) {
                        elapsedRealtime -= Math.min(16L, abs - i10);
                    }
                    this.lastFrameTime = elapsedRealtime;
                    scheduleNextGetFrame();
                }
            } else if ((this.forceFrameRedraw || (this.decodeSingleFrame && abs >= i10)) && this.nextRenderingBitmap != null) {
                this.backgroundBitmap = this.renderingBitmap;
                this.renderingBitmap = this.nextRenderingBitmap;
                this.loadFrameTask = null;
                this.singleFrameDecoded = true;
                this.nextRenderingBitmap = null;
                if (this.screenRefreshRate > f10) {
                    elapsedRealtime -= Math.min(16L, abs - i10);
                }
                this.lastFrameTime = elapsedRealtime;
                if (this.forceFrameRedraw) {
                    this.singleFrameDecoded = false;
                    this.forceFrameRedraw = false;
                }
                scheduleNextGetFrame();
            }
            if (this.renderingBitmap != null) {
                if (this.applyTransformation) {
                    this.dstRect.set(getBounds());
                    this.scaleX = this.dstRect.width() / this.width;
                    this.scaleY = this.dstRect.height() / this.height;
                    this.applyTransformation = false;
                }
                canvas.save();
                Rect rect = this.dstRect;
                canvas.translate(rect.left, rect.top);
                canvas.scale(this.scaleX, this.scaleY);
                Bitmap bitmap = this.renderingBitmap;
                if (bitmap == null) {
                    q.s();
                }
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, getPaint());
                if (this.isRunning) {
                    invalidateInternal();
                }
                canvas.restore();
            }
        }
    }

    public final Bitmap getAnimatedBitmap() {
        if (this.renderingBitmap != null) {
            return this.renderingBitmap;
        }
        if (this.nextRenderingBitmap != null) {
            return this.nextRenderingBitmap;
        }
        return null;
    }

    public final Bitmap getBackgroundBitmap() {
        return this.backgroundBitmap;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.height;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.width;
    }

    public final Bitmap getNextRenderingBitmap() {
        return this.nextRenderingBitmap;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public final Bitmap getRenderingBitmap() {
        return this.renderingBitmap;
    }

    public final boolean hasBitmap() {
        return (this.nativePtr == 0 || (this.renderingBitmap == null && this.nextRenderingBitmap == null)) ? false : true;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        q.h(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.applyTransformation = true;
    }

    public final void recycle() {
        this.isRunning = false;
        this.isRecycled = true;
        checkRunningTasks();
        if (this.loadFrameTask == null && this.cacheGenerateTask == null) {
            if (this.nativePtr != 0) {
                Companion.destroy(this.nativePtr);
                this.nativePtr = 0L;
            }
            recycleResources();
            return;
        }
        this.destroyWhenDone = true;
    }

    public final void removeParentView(View view) {
        if (view != null) {
            int size = this.parentViews.size();
            int i10 = 0;
            while (i10 < size) {
                View view2 = this.parentViews.get(i10).get();
                if (view2 == view || view2 == null) {
                    this.parentViews.remove(i10);
                    size--;
                    i10--;
                }
                i10++;
            }
        }
    }

    public final void replaceColors(Integer[] numArr) {
        this.newReplaceColors = numArr;
        requestRedrawColors();
    }

    public final boolean restart() {
        PlaybackMode playbackMode = this.playbackMode;
        PlaybackMode playbackMode2 = PlaybackMode.ONCE;
        if (playbackMode.compareTo(playbackMode2) < 0 || this.autoRepeatPlayCount == 0) {
            return false;
        }
        this.autoRepeatPlayCount = 0;
        this.playbackMode = playbackMode2;
        start();
        return true;
    }

    public final void setAllowDecodeSingleFrame(boolean z10) {
        this.decodeSingleFrame = z10;
        if (z10) {
            scheduleNextGetFrame();
        }
    }

    public final void setCurrentParentView(View view) {
        this.currentParentView = view;
    }

    public final void setLayerColor(String layerName, int i10) {
        q.h(layerName, "layerName");
        this.newColorUpdates.put(layerName, Integer.valueOf(i10));
        requestRedrawColors();
    }

    public final void setPlaybackMode(PlaybackMode value) {
        q.h(value, "value");
        if (this.playbackMode != PlaybackMode.ONCE || value != PlaybackMode.FREEZE || this.currentFrame == 0) {
            this.playbackMode = value;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r3 > 1.0f) goto L_0x0005;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setProgress(float r3) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0007
        L_0x0005:
            r3 = r0
            goto L_0x000e
        L_0x0007:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x000e
            goto L_0x0005
        L_0x000e:
            int[] r0 = r2.metaData
            r1 = 0
            r0 = r0[r1]
            float r0 = (float) r0
            float r0 = r0 * r3
            int r3 = (int) r0
            r2.currentFrame = r3
            r2.nextFrameIsLast = r1
            r2.singleFrameDecoded = r1
            boolean r3 = r2.scheduleNextGetFrame()
            if (r3 != 0) goto L_0x0025
            r3 = 1
            r2.forceFrameRedraw = r3
        L_0x0025:
            r2.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.rlottie.RLottieDrawable.setProgress(float):void");
    }

    public final void setVibrationPattern(HashMap<Integer, Integer> hashMap) {
        this.vibrationPattern = hashMap;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.isRunning) {
            return;
        }
        if (this.playbackMode.compareTo(PlaybackMode.ONCE) < 0 || this.autoRepeatPlayCount == 0) {
            this.isRunning = true;
            scheduleNextGetFrame();
            invalidateInternal();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.isRunning = false;
    }

    public RLottieDrawable(File file, int i10, int i11, boolean z10, boolean z11, float f10, int[] iArr) {
        q.h(file, "file");
        int[] iArr2 = new int[3];
        this.metaData = iArr2;
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap<>();
        this.pendingColorUpdates = new HashMap<>();
        this.playbackMode = PlaybackMode.LOOP;
        this.screenRefreshRate = 60.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new Rect();
        this.parentViews = new ArrayList<>();
        this.uiRunnableNoFrame = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableNoFrame$1
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.loadFrameTask = null;
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableCacheFinished = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableCacheFinished$1
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.cacheGenerateTask = null;
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnable = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableLastFrame = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableLastFrame$1
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.isRunning = false;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableGenerateCacheQueue = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableGenerateCacheQueue$1
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable;
                long j10;
                int i12;
                int i13;
                Handler handler;
                Runnable runnable2;
                runnable = RLottieDrawable.this.cacheGenerateTask;
                if (runnable != null) {
                    RLottieDrawable.Companion companion = RLottieDrawable.Companion;
                    j10 = RLottieDrawable.this.nativePtr;
                    i12 = RLottieDrawable.this.width;
                    i13 = RLottieDrawable.this.height;
                    companion.createCache(j10, i12, i13);
                    handler = RLottieDrawable.uiHandler;
                    runnable2 = RLottieDrawable.this.uiRunnableCacheFinished;
                    handler.post(runnable2);
                }
            }
        };
        this.uiRunnableGenerateCache = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableGenerateCache$1
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
                r0 = com.discord.rlottie.RLottieDrawable.lottieCacheGenerateQueue;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r4 = this;
                    com.discord.rlottie.RLottieDrawable r0 = com.discord.rlottie.RLottieDrawable.this
                    boolean r0 = com.discord.rlottie.RLottieDrawable.access$isRecycled$p(r0)
                    if (r0 != 0) goto L_0x0030
                    com.discord.rlottie.RLottieDrawable r0 = com.discord.rlottie.RLottieDrawable.this
                    boolean r0 = com.discord.rlottie.RLottieDrawable.access$getDestroyWhenDone$p(r0)
                    if (r0 != 0) goto L_0x0030
                    com.discord.rlottie.RLottieDrawable r0 = com.discord.rlottie.RLottieDrawable.this
                    long r0 = com.discord.rlottie.RLottieDrawable.access$getNativePtr$p(r0)
                    r2 = 0
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 == 0) goto L_0x0030
                    java.util.concurrent.ThreadPoolExecutor r0 = com.discord.rlottie.RLottieDrawable.access$getLottieCacheGenerateQueue$cp()
                    if (r0 == 0) goto L_0x0030
                    com.discord.rlottie.RLottieDrawable r1 = com.discord.rlottie.RLottieDrawable.this
                    java.lang.Runnable r1 = com.discord.rlottie.RLottieDrawable.access$getUiRunnableGenerateCacheQueue$p(r1)
                    com.discord.rlottie.RLottieDrawable r2 = com.discord.rlottie.RLottieDrawable.this
                    com.discord.rlottie.RLottieDrawable.access$setCacheGenerateTask$p(r2, r1)
                    r0.execute(r1)
                L_0x0030:
                    com.discord.rlottie.RLottieDrawable r0 = com.discord.rlottie.RLottieDrawable.this
                    com.discord.rlottie.RLottieDrawable.access$decodeFrameFinishedInternal(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.discord.rlottie.RLottieDrawable$uiRunnableGenerateCache$1.run():void");
            }
        };
        this.loadFrameRunnable = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$loadFrameRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z12;
                long j10;
                int i12;
                int i13;
                Handler handler;
                Runnable runnable;
                Integer[] numArr;
                long j11;
                int i14;
                int i15;
                int i16;
                int frame;
                int[] iArr3;
                boolean z13;
                int i17;
                int[] iArr4;
                RLottieDrawable.PlaybackMode playbackMode;
                RLottieDrawable.PlaybackMode playbackMode2;
                int i18;
                RLottieDrawable.PlaybackMode playbackMode3;
                int i19;
                int i20;
                Handler handler2;
                Runnable runnable2;
                int[] iArr5;
                Handler handler3;
                Runnable runnable3;
                long j12;
                int[] n02;
                HashMap hashMap;
                HashMap hashMap2;
                HashMap hashMap3;
                long j13;
                Handler handler4;
                Runnable runnable4;
                z12 = RLottieDrawable.this.isRecycled;
                if (!z12) {
                    j10 = RLottieDrawable.this.nativePtr;
                    if (j10 == 0) {
                        handler4 = RLottieDrawable.uiHandler;
                        runnable4 = RLottieDrawable.this.uiRunnableNoFrame;
                        handler4.post(runnable4);
                        return;
                    }
                    if (RLottieDrawable.this.getBackgroundBitmap() == null) {
                        try {
                            RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                            i12 = rLottieDrawable.width;
                            i13 = RLottieDrawable.this.height;
                            rLottieDrawable.backgroundBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
                        } catch (Throwable th2) {
                            Log.e("RLottieDrawable", "Error Loading Frame in Runnable", th2);
                        }
                    }
                    if (RLottieDrawable.this.getBackgroundBitmap() != null) {
                        try {
                            hashMap = RLottieDrawable.this.pendingColorUpdates;
                            if (!hashMap.isEmpty()) {
                                hashMap2 = RLottieDrawable.this.pendingColorUpdates;
                                for (Map.Entry entry : hashMap2.entrySet()) {
                                    int intValue = ((Number) entry.getValue()).intValue();
                                    RLottieDrawable.Companion companion = RLottieDrawable.Companion;
                                    j13 = RLottieDrawable.this.nativePtr;
                                    companion.setLayerColor(j13, (String) entry.getKey(), intValue);
                                }
                                hashMap3 = RLottieDrawable.this.pendingColorUpdates;
                                hashMap3.clear();
                            }
                        } catch (Exception unused) {
                        }
                        numArr = RLottieDrawable.this.pendingReplaceColors;
                        if (numArr != null) {
                            RLottieDrawable.Companion companion2 = RLottieDrawable.Companion;
                            j12 = RLottieDrawable.this.nativePtr;
                            n02 = f.n0(numArr);
                            companion2.replaceColors(j12, n02);
                        }
                        RLottieDrawable.this.pendingReplaceColors = null;
                        try {
                            RLottieDrawable.Companion companion3 = RLottieDrawable.Companion;
                            j11 = RLottieDrawable.this.nativePtr;
                            i14 = RLottieDrawable.this.currentFrame;
                            Bitmap backgroundBitmap = RLottieDrawable.this.getBackgroundBitmap();
                            if (backgroundBitmap == null) {
                                q.s();
                            }
                            i15 = RLottieDrawable.this.width;
                            i16 = RLottieDrawable.this.height;
                            Bitmap backgroundBitmap2 = RLottieDrawable.this.getBackgroundBitmap();
                            if (backgroundBitmap2 == null) {
                                q.s();
                            }
                            frame = companion3.getFrame(j11, i14, backgroundBitmap, i15, i16, backgroundBitmap2.getRowBytes(), true);
                            if (frame == -1) {
                                handler3 = RLottieDrawable.uiHandler;
                                runnable3 = RLottieDrawable.this.uiRunnableNoFrame;
                                handler3.post(runnable3);
                                return;
                            }
                            iArr3 = RLottieDrawable.this.metaData;
                            int i21 = 2;
                            if (iArr3[2] != 0) {
                                handler2 = RLottieDrawable.uiHandler;
                                runnable2 = RLottieDrawable.this.uiRunnableGenerateCache;
                                handler2.post(runnable2);
                                iArr5 = RLottieDrawable.this.metaData;
                                iArr5[2] = 0;
                            }
                            RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
                            rLottieDrawable2.nextRenderingBitmap = rLottieDrawable2.getBackgroundBitmap();
                            z13 = RLottieDrawable.this.shouldLimitFps;
                            if (!z13) {
                                i21 = 1;
                            }
                            i17 = RLottieDrawable.this.currentFrame;
                            int i22 = i17 + i21;
                            iArr4 = RLottieDrawable.this.metaData;
                            if (i22 < iArr4[0]) {
                                playbackMode3 = RLottieDrawable.this.playbackMode;
                                if (playbackMode3 == RLottieDrawable.PlaybackMode.FREEZE) {
                                    RLottieDrawable.this.nextFrameIsLast = true;
                                    RLottieDrawable rLottieDrawable3 = RLottieDrawable.this;
                                    i20 = rLottieDrawable3.autoRepeatPlayCount;
                                    rLottieDrawable3.autoRepeatPlayCount = i20 + 1;
                                } else {
                                    RLottieDrawable rLottieDrawable4 = RLottieDrawable.this;
                                    i19 = rLottieDrawable4.currentFrame;
                                    rLottieDrawable4.currentFrame = i19 + i21;
                                    RLottieDrawable.this.nextFrameIsLast = false;
                                }
                            } else {
                                playbackMode = RLottieDrawable.this.playbackMode;
                                if (playbackMode == RLottieDrawable.PlaybackMode.LOOP) {
                                    RLottieDrawable.this.currentFrame = 0;
                                    RLottieDrawable.this.nextFrameIsLast = false;
                                } else {
                                    playbackMode2 = RLottieDrawable.this.playbackMode;
                                    if (playbackMode2 == RLottieDrawable.PlaybackMode.ONCE) {
                                        RLottieDrawable.this.currentFrame = 0;
                                        RLottieDrawable.this.nextFrameIsLast = true;
                                        RLottieDrawable rLottieDrawable5 = RLottieDrawable.this;
                                        i18 = rLottieDrawable5.autoRepeatPlayCount;
                                        rLottieDrawable5.autoRepeatPlayCount = i18 + 1;
                                    } else {
                                        RLottieDrawable.this.nextFrameIsLast = true;
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            Log.e("RLottieDrawable", "Error loading frame", e10);
                        }
                    }
                    handler = RLottieDrawable.uiHandler;
                    runnable = RLottieDrawable.this.uiRunnable;
                    handler.post(runnable);
                }
            }
        };
        this.width = i10;
        this.height = i11;
        this.shouldLimitFps = z11;
        this.screenRefreshRate = f10;
        Paint paint = getPaint();
        q.c(paint, "paint");
        paint.setFlags(2);
        Companion companion = Companion;
        String absolutePath = file.getAbsolutePath();
        q.c(absolutePath, "file.absolutePath");
        this.nativePtr = companion.create(absolutePath, i10, i11, iArr2, z10, iArr, this.shouldLimitFps);
        if (z10 && lottieCacheGenerateQueue == null) {
            lottieCacheGenerateQueue = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
        if (this.nativePtr == 0) {
            file.delete();
        }
        if (this.shouldLimitFps && iArr2[1] < 60) {
            this.shouldLimitFps = false;
        }
        this.timeBetweenFrames = Math.max(this.shouldLimitFps ? 33 : 16, (int) (1000.0f / iArr2[1]));
    }

    public /* synthetic */ RLottieDrawable(Context context, int i10, String str, int i11, int i12, float f10, boolean z10, int[] iArr, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i10, str, i11, i12, f10, (i13 & 64) != 0 ? true : z10, (i13 & 128) != 0 ? null : iArr);
    }

    public RLottieDrawable(Context context, int i10, String name, int i11, int i12, float f10, boolean z10, int[] iArr) {
        q.h(context, "context");
        q.h(name, "name");
        this.metaData = new int[3];
        this.customEndFrame = -1;
        this.newColorUpdates = new HashMap<>();
        this.pendingColorUpdates = new HashMap<>();
        this.playbackMode = PlaybackMode.LOOP;
        this.screenRefreshRate = 60.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new Rect();
        this.parentViews = new ArrayList<>();
        this.uiRunnableNoFrame = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableNoFrame$1
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.loadFrameTask = null;
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableCacheFinished = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableCacheFinished$1
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.cacheGenerateTask = null;
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnable = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableLastFrame = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableLastFrame$1
            @Override // java.lang.Runnable
            public final void run() {
                RLottieDrawable.this.singleFrameDecoded = true;
                RLottieDrawable.this.isRunning = false;
                RLottieDrawable.this.invalidateInternal();
                RLottieDrawable.this.decodeFrameFinishedInternal();
            }
        };
        this.uiRunnableGenerateCacheQueue = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableGenerateCacheQueue$1
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable;
                long j10;
                int i122;
                int i13;
                Handler handler;
                Runnable runnable2;
                runnable = RLottieDrawable.this.cacheGenerateTask;
                if (runnable != null) {
                    RLottieDrawable.Companion companion = RLottieDrawable.Companion;
                    j10 = RLottieDrawable.this.nativePtr;
                    i122 = RLottieDrawable.this.width;
                    i13 = RLottieDrawable.this.height;
                    companion.createCache(j10, i122, i13);
                    handler = RLottieDrawable.uiHandler;
                    runnable2 = RLottieDrawable.this.uiRunnableCacheFinished;
                    handler.post(runnable2);
                }
            }
        };
        this.uiRunnableGenerateCache = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$uiRunnableGenerateCache$1
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r4 = this;
                    com.discord.rlottie.RLottieDrawable r0 = com.discord.rlottie.RLottieDrawable.this
                    boolean r0 = com.discord.rlottie.RLottieDrawable.access$isRecycled$p(r0)
                    if (r0 != 0) goto L_0x0030
                    com.discord.rlottie.RLottieDrawable r0 = com.discord.rlottie.RLottieDrawable.this
                    boolean r0 = com.discord.rlottie.RLottieDrawable.access$getDestroyWhenDone$p(r0)
                    if (r0 != 0) goto L_0x0030
                    com.discord.rlottie.RLottieDrawable r0 = com.discord.rlottie.RLottieDrawable.this
                    long r0 = com.discord.rlottie.RLottieDrawable.access$getNativePtr$p(r0)
                    r2 = 0
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r0 == 0) goto L_0x0030
                    java.util.concurrent.ThreadPoolExecutor r0 = com.discord.rlottie.RLottieDrawable.access$getLottieCacheGenerateQueue$cp()
                    if (r0 == 0) goto L_0x0030
                    com.discord.rlottie.RLottieDrawable r1 = com.discord.rlottie.RLottieDrawable.this
                    java.lang.Runnable r1 = com.discord.rlottie.RLottieDrawable.access$getUiRunnableGenerateCacheQueue$p(r1)
                    com.discord.rlottie.RLottieDrawable r2 = com.discord.rlottie.RLottieDrawable.this
                    com.discord.rlottie.RLottieDrawable.access$setCacheGenerateTask$p(r2, r1)
                    r0.execute(r1)
                L_0x0030:
                    com.discord.rlottie.RLottieDrawable r0 = com.discord.rlottie.RLottieDrawable.this
                    com.discord.rlottie.RLottieDrawable.access$decodeFrameFinishedInternal(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.discord.rlottie.RLottieDrawable$uiRunnableGenerateCache$1.run():void");
            }
        };
        this.loadFrameRunnable = new Runnable() { // from class: com.discord.rlottie.RLottieDrawable$loadFrameRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z12;
                long j10;
                int i122;
                int i13;
                Handler handler;
                Runnable runnable;
                Integer[] numArr;
                long j11;
                int i14;
                int i15;
                int i16;
                int frame;
                int[] iArr3;
                boolean z13;
                int i17;
                int[] iArr4;
                RLottieDrawable.PlaybackMode playbackMode;
                RLottieDrawable.PlaybackMode playbackMode2;
                int i18;
                RLottieDrawable.PlaybackMode playbackMode3;
                int i19;
                int i20;
                Handler handler2;
                Runnable runnable2;
                int[] iArr5;
                Handler handler3;
                Runnable runnable3;
                long j12;
                int[] n02;
                HashMap hashMap;
                HashMap hashMap2;
                HashMap hashMap3;
                long j13;
                Handler handler4;
                Runnable runnable4;
                z12 = RLottieDrawable.this.isRecycled;
                if (!z12) {
                    j10 = RLottieDrawable.this.nativePtr;
                    if (j10 == 0) {
                        handler4 = RLottieDrawable.uiHandler;
                        runnable4 = RLottieDrawable.this.uiRunnableNoFrame;
                        handler4.post(runnable4);
                        return;
                    }
                    if (RLottieDrawable.this.getBackgroundBitmap() == null) {
                        try {
                            RLottieDrawable rLottieDrawable = RLottieDrawable.this;
                            i122 = rLottieDrawable.width;
                            i13 = RLottieDrawable.this.height;
                            rLottieDrawable.backgroundBitmap = Bitmap.createBitmap(i122, i13, Bitmap.Config.ARGB_8888);
                        } catch (Throwable th2) {
                            Log.e("RLottieDrawable", "Error Loading Frame in Runnable", th2);
                        }
                    }
                    if (RLottieDrawable.this.getBackgroundBitmap() != null) {
                        try {
                            hashMap = RLottieDrawable.this.pendingColorUpdates;
                            if (!hashMap.isEmpty()) {
                                hashMap2 = RLottieDrawable.this.pendingColorUpdates;
                                for (Map.Entry entry : hashMap2.entrySet()) {
                                    int intValue = ((Number) entry.getValue()).intValue();
                                    RLottieDrawable.Companion companion = RLottieDrawable.Companion;
                                    j13 = RLottieDrawable.this.nativePtr;
                                    companion.setLayerColor(j13, (String) entry.getKey(), intValue);
                                }
                                hashMap3 = RLottieDrawable.this.pendingColorUpdates;
                                hashMap3.clear();
                            }
                        } catch (Exception unused) {
                        }
                        numArr = RLottieDrawable.this.pendingReplaceColors;
                        if (numArr != null) {
                            RLottieDrawable.Companion companion2 = RLottieDrawable.Companion;
                            j12 = RLottieDrawable.this.nativePtr;
                            n02 = f.n0(numArr);
                            companion2.replaceColors(j12, n02);
                        }
                        RLottieDrawable.this.pendingReplaceColors = null;
                        try {
                            RLottieDrawable.Companion companion3 = RLottieDrawable.Companion;
                            j11 = RLottieDrawable.this.nativePtr;
                            i14 = RLottieDrawable.this.currentFrame;
                            Bitmap backgroundBitmap = RLottieDrawable.this.getBackgroundBitmap();
                            if (backgroundBitmap == null) {
                                q.s();
                            }
                            i15 = RLottieDrawable.this.width;
                            i16 = RLottieDrawable.this.height;
                            Bitmap backgroundBitmap2 = RLottieDrawable.this.getBackgroundBitmap();
                            if (backgroundBitmap2 == null) {
                                q.s();
                            }
                            frame = companion3.getFrame(j11, i14, backgroundBitmap, i15, i16, backgroundBitmap2.getRowBytes(), true);
                            if (frame == -1) {
                                handler3 = RLottieDrawable.uiHandler;
                                runnable3 = RLottieDrawable.this.uiRunnableNoFrame;
                                handler3.post(runnable3);
                                return;
                            }
                            iArr3 = RLottieDrawable.this.metaData;
                            int i21 = 2;
                            if (iArr3[2] != 0) {
                                handler2 = RLottieDrawable.uiHandler;
                                runnable2 = RLottieDrawable.this.uiRunnableGenerateCache;
                                handler2.post(runnable2);
                                iArr5 = RLottieDrawable.this.metaData;
                                iArr5[2] = 0;
                            }
                            RLottieDrawable rLottieDrawable2 = RLottieDrawable.this;
                            rLottieDrawable2.nextRenderingBitmap = rLottieDrawable2.getBackgroundBitmap();
                            z13 = RLottieDrawable.this.shouldLimitFps;
                            if (!z13) {
                                i21 = 1;
                            }
                            i17 = RLottieDrawable.this.currentFrame;
                            int i22 = i17 + i21;
                            iArr4 = RLottieDrawable.this.metaData;
                            if (i22 < iArr4[0]) {
                                playbackMode3 = RLottieDrawable.this.playbackMode;
                                if (playbackMode3 == RLottieDrawable.PlaybackMode.FREEZE) {
                                    RLottieDrawable.this.nextFrameIsLast = true;
                                    RLottieDrawable rLottieDrawable3 = RLottieDrawable.this;
                                    i20 = rLottieDrawable3.autoRepeatPlayCount;
                                    rLottieDrawable3.autoRepeatPlayCount = i20 + 1;
                                } else {
                                    RLottieDrawable rLottieDrawable4 = RLottieDrawable.this;
                                    i19 = rLottieDrawable4.currentFrame;
                                    rLottieDrawable4.currentFrame = i19 + i21;
                                    RLottieDrawable.this.nextFrameIsLast = false;
                                }
                            } else {
                                playbackMode = RLottieDrawable.this.playbackMode;
                                if (playbackMode == RLottieDrawable.PlaybackMode.LOOP) {
                                    RLottieDrawable.this.currentFrame = 0;
                                    RLottieDrawable.this.nextFrameIsLast = false;
                                } else {
                                    playbackMode2 = RLottieDrawable.this.playbackMode;
                                    if (playbackMode2 == RLottieDrawable.PlaybackMode.ONCE) {
                                        RLottieDrawable.this.currentFrame = 0;
                                        RLottieDrawable.this.nextFrameIsLast = true;
                                        RLottieDrawable rLottieDrawable5 = RLottieDrawable.this;
                                        i18 = rLottieDrawable5.autoRepeatPlayCount;
                                        rLottieDrawable5.autoRepeatPlayCount = i18 + 1;
                                    } else {
                                        RLottieDrawable.this.nextFrameIsLast = true;
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            Log.e("RLottieDrawable", "Error loading frame", e10);
                        }
                    }
                    handler = RLottieDrawable.uiHandler;
                    runnable = RLottieDrawable.this.uiRunnable;
                    handler.post(runnable);
                }
            }
        };
        try {
            InputStream openRawResource = context.getResources().openRawResource(i10);
            q.c(openRawResource, "context.resources.openRawResource(rawRes)");
            e0 e0Var = new e0();
            int i13 = 0;
            while (true) {
                byte[] bArr = buffer;
                int read = openRawResource.read(bArr, 0, bArr.length);
                e0Var.f22146k = read;
                if (read <= 0) {
                    break;
                }
                byte[] bArr2 = readBuffer;
                if (bArr2.length < read + i13) {
                    byte[] bArr3 = new byte[bArr2.length * 2];
                    System.arraycopy(bArr2, 0, bArr3, 0, i13);
                    readBuffer = bArr3;
                }
                System.arraycopy(bArr, 0, readBuffer, i13, e0Var.f22146k);
                i13 += e0Var.f22146k;
            }
            String str = new String(readBuffer, 0, i13, d.f26400b);
            openRawResource.close();
            this.width = i11;
            this.height = i12;
            this.screenRefreshRate = f10;
            Paint paint = getPaint();
            q.c(paint, "paint");
            paint.setFlags(2);
            this.nativePtr = Companion.createWithJson(str, name, this.metaData, iArr);
            this.timeBetweenFrames = Math.max(16, (int) (1000.0f / this.metaData[1]));
            this.playbackMode = PlaybackMode.LOOP;
            if (z10) {
                setAllowDecodeSingleFrame(true);
            }
        } catch (Throwable th2) {
            Log.e("RLottieDrawable", "Error Constructing", th2);
        }
    }
}
