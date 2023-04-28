package com.mrousavy.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.AbstractC1874k;
import androidx.camera.core.C1770a2;
import androidx.camera.core.C1813g1;
import androidx.camera.core.C1885m0;
import androidx.camera.core.C1921t;
import androidx.camera.core.ImageProxy;
import androidx.camera.extensions.ExtensionsManager;
import androidx.camera.lifecycle.C1978e;
import androidx.camera.view.C2066l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.mrousavy.camera.frameprocessor.C6047a;
import com.mrousavy.camera.frameprocessor.C6049c;
import com.mrousavy.camera.frameprocessor.FrameProcessorRuntimeManager;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9906j;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C10129j;
import kotlinx.coroutines.C10135k0;
import kotlinx.coroutines.C10230y0;
import kotlinx.coroutines.CoroutineScope;
import org.webrtc.MediaStreamTrack;
import p078e6.AbstractC6709a;
import p145i0.C8115c1;
import p145i0.C8166o0;
import p145i0.C8201x0;
import p353te.C13063g;
import p353te.C13071o;

@Metadata(m15074d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 þ\u00012\u00020\u00012\u00020\u0002:\u0002ÿ\u0001B\u001b\u0012\b\u0010û\u0001\u001a\u00030ú\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0006\bü\u0001\u0010ý\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0082 J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0013\u0010\u000b\u001a\u00020\u0003H\u0083@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0003H\u0002J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0003H\u0014J\u001e\u0010\u001a\u001a\u00020\u00192\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010%\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010,\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00103\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)\"\u0004\b6\u0010+R$\u0010;\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u00100\"\u0004\b:\u00102R$\u0010>\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010.\u001a\u0004\b<\u00100\"\u0004\b=\u00102R$\u0010B\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010.\u001a\u0004\b@\u00100\"\u0004\bA\u00102R\"\u0010E\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010'\u001a\u0004\bC\u0010)\"\u0004\bD\u0010+R$\u0010M\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010X\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010.\u001a\u0004\bV\u00100\"\u0004\bW\u00102R$\u0010\\\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010 \u001a\u0004\bZ\u0010\"\"\u0004\b[\u0010$R$\u0010_\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010.\u001a\u0004\b]\u00100\"\u0004\b^\u00102R\"\u0010a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010'\u001a\u0004\bG\u0010)\"\u0004\b`\u0010+R\"\u0010e\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010 \u001a\u0004\bc\u0010\"\"\u0004\bd\u0010$R\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010q\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010 \u001a\u0004\bo\u0010\"\"\u0004\bp\u0010$R*\u0010v\u001a\u00020\u00192\u0006\u0010r\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010'\u001a\u0004\bt\u0010)\"\u0004\bu\u0010+R*\u0010}\u001a\u00020w2\u0006\u0010r\u001a\u00020w8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010'R'\u0010\u0086\u0001\u001a\u00030\u0080\u00018\u0000X\u0080\u0004¢\u0006\u0017\n\u0005\bh\u0010\u0081\u0001\u0012\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001f\u0010\u0089\u0001\u001a\u000b \u0087\u0001*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u001dR'\u0010\u008d\u0001\u001a\u000b \u0087\u0001*\u0004\u0018\u00010\u001b0\u001b8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010\u001d\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R'\u0010\u0090\u0001\u001a\u000b \u0087\u0001*\u0004\u0018\u00010\u001b0\u001b8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u008e\u0001\u0010\u001d\u001a\u0006\b\u008f\u0001\u0010\u008c\u0001R*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R,\u0010 \u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R,\u0010¨\u0001\u001a\u0005\u0018\u00010¡\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R3\u0010±\u0001\u001a\f\u0012\u0005\u0012\u00030ª\u0001\u0018\u00010©\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u001c\u0010µ\u0001\u001a\u0005\u0018\u00010²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001c\u0010¹\u0001\u001a\u0005\u0018\u00010¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R,\u0010Á\u0001\u001a\u0005\u0018\u00010º\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R\u001a\u0010Ä\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010\u0092\u0001R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010Å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010Ì\u0001\u001a\u00030É\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ô\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010Ø\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001a\u0010Ü\u0001\u001a\u00030Ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0018\u0010Þ\u0001\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÝ\u0001\u0010hR\u0018\u0010à\u0001\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bß\u0001\u0010hR\u0018\u0010â\u0001\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bá\u0001\u0010xR\u0018\u0010æ\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0018\u0010è\u0001\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bç\u0001\u0010xR\u001a\u0010ê\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010\u0092\u0001R\u001b\u0010ë\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0018\u0010ð\u0001\u001a\u00030í\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bî\u0001\u0010ï\u0001R\u0017\u0010ó\u0001\u001a\u00020N8BX\u0082\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010ò\u0001R\u0017\u0010õ\u0001\u001a\u00020N8BX\u0082\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010ò\u0001R\u0015\u0010ö\u0001\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010)R\u001e\u0010ù\u0001\u001a\u00020\u00198AX\u0080\u0004¢\u0006\u000f\u0012\u0006\bø\u0001\u0010\u0085\u0001\u001a\u0005\b÷\u0001\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0080\u0002"}, m15073d2 = {"Lcom/mrousavy/camera/CameraView;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/LifecycleOwner;", "", "y", "Lcom/facebook/jni/HybridData;", "initHybrid", "Landroidx/camera/core/ImageProxy;", "frame", "frameProcessorCallback", "x", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "onAttachedToWindow", "onDetachedFromWindow", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "changedProps", "", "v", "Ljava/util/concurrent/ExecutorService;", "k", "Ljava/util/concurrent/ExecutorService;", "frameProcessorThread", "l", "Ljava/lang/String;", "getCameraId", "()Ljava/lang/String;", "setCameraId", "(Ljava/lang/String;)V", "cameraId", "m", "Z", "getEnableDepthData", "()Z", "setEnableDepthData", "(Z)V", "enableDepthData", "n", "Ljava/lang/Boolean;", "getEnableHighQualityPhotos", "()Ljava/lang/Boolean;", "setEnableHighQualityPhotos", "(Ljava/lang/Boolean;)V", "enableHighQualityPhotos", "o", "getEnablePortraitEffectsMatteDelivery", "setEnablePortraitEffectsMatteDelivery", "enablePortraitEffectsMatteDelivery", "p", "getPhoto", "setPhoto", "photo", "getVideo", "setVideo", MediaStreamTrack.VIDEO_TRACK_KIND, "r", "getAudio", "setAudio", MediaStreamTrack.AUDIO_TRACK_KIND, "getEnableFrameProcessor", "setEnableFrameProcessor", "enableFrameProcessor", "Lcom/facebook/react/bridge/ReadableMap;", "t", "Lcom/facebook/react/bridge/ReadableMap;", "getFormat", "()Lcom/facebook/react/bridge/ReadableMap;", "setFormat", "(Lcom/facebook/react/bridge/ReadableMap;)V", "format", "", "u", "Ljava/lang/Integer;", "getFps", "()Ljava/lang/Integer;", "setFps", "(Ljava/lang/Integer;)V", "fps", "getHdr", "setHdr", "hdr", "w", "getColorSpace", "setColorSpace", "colorSpace", "getLowLightBoost", "setLowLightBoost", "lowLightBoost", "setActive", "isActive", "z", "getTorch", "setTorch", "torch", "", "A", "F", "getZoom", "()F", "setZoom", "(F)V", "zoom", "B", "getOrientation", "setOrientation", "orientation", "value", "C", "getEnableZoomGesture", "setEnableZoomGesture", "enableZoomGesture", "", "D", "getFrameProcessorFps", "()D", "setFrameProcessorFps", "(D)V", "frameProcessorFps", "E", "isMounted", "Landroidx/camera/view/l;", "Landroidx/camera/view/l;", "getPreviewView$react_native_vision_camera_release", "()Landroidx/camera/view/l;", "getPreviewView$react_native_vision_camera_release$annotations", "()V", "previewView", "kotlin.jvm.PlatformType", "G", "cameraExecutor", "H", "getTakePhotoExecutor$react_native_vision_camera_release", "()Ljava/util/concurrent/ExecutorService;", "takePhotoExecutor", "I", "getRecordVideoExecutor$react_native_vision_camera_release", "recordVideoExecutor", "Lkotlinx/coroutines/CoroutineScope;", "J", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$react_native_vision_camera_release", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope$react_native_vision_camera_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "coroutineScope", "Landroidx/camera/core/k;", "K", "Landroidx/camera/core/k;", "getCamera$react_native_vision_camera_release", "()Landroidx/camera/core/k;", "setCamera$react_native_vision_camera_release", "(Landroidx/camera/core/k;)V", "camera", "Landroidx/camera/core/g1;", "L", "Landroidx/camera/core/g1;", "getImageCapture$react_native_vision_camera_release", "()Landroidx/camera/core/g1;", "setImageCapture$react_native_vision_camera_release", "(Landroidx/camera/core/g1;)V", "imageCapture", "Li0/c1;", "Li0/o0;", "M", "Li0/c1;", "getVideoCapture$react_native_vision_camera_release", "()Li0/c1;", "setVideoCapture$react_native_vision_camera_release", "(Li0/c1;)V", "videoCapture", "Landroidx/camera/core/m0;", "N", "Landroidx/camera/core/m0;", "imageAnalysis", "Landroidx/camera/core/a2;", "O", "Landroidx/camera/core/a2;", "preview", "Li0/x0;", "P", "Li0/x0;", "getActiveVideoRecording$react_native_vision_camera_release", "()Li0/x0;", "setActiveVideoRecording$react_native_vision_camera_release", "(Li0/x0;)V", "activeVideoRecording", "", "Q", "lastFrameProcessorCall", "Landroidx/camera/extensions/ExtensionsManager;", "R", "Landroidx/camera/extensions/ExtensionsManager;", "extensionsManager", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "S", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "scaleGestureListener", "Landroid/view/ScaleGestureDetector;", "T", "Landroid/view/ScaleGestureDetector;", "scaleGestureDetector", "Landroid/view/View$OnTouchListener;", "U", "Landroid/view/View$OnTouchListener;", "touchEventListener", "Landroidx/lifecycle/LifecycleRegistry;", "V", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/lifecycle/Lifecycle$State;", "W", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "a0", "minZoom", "b0", "maxZoom", "c0", "actualFrameProcessorFps", "Lcom/mrousavy/camera/frameprocessor/a;", "d0", "Lcom/mrousavy/camera/frameprocessor/a;", "frameProcessorPerformanceDataCollector", "e0", "lastSuggestedFrameProcessorFps", "f0", "lastFrameProcessorPerformanceEvaluation", "mHybridData", "Lcom/facebook/jni/HybridData;", "Lcom/facebook/react/bridge/ReactContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "reactContext", "getInputRotation", "()I", "inputRotation", "getOutputRotation", "outputRotation", "isReadyForNewEvaluation", "getFallbackToSnapshot$react_native_vision_camera_release", "getFallbackToSnapshot$react_native_vision_camera_release$annotations", "fallbackToSnapshot", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V", "g0", "c", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
@SuppressLint({"ClickableViewAccessibility", "ViewConstructor"})
/* loaded from: classes6.dex */
public final class CameraView extends FrameLayout implements LifecycleOwner {

    /* renamed from: g0 */
    public static final C6023c f12217g0 = new C6023c(null);

    /* renamed from: h0 */
    private static final ArrayList<String> f12218h0;

    /* renamed from: i0 */
    private static final ArrayList<String> f12219i0;

    /* renamed from: B */
    private String f37645B;

    /* renamed from: C */
    private boolean f37646C;

    /* renamed from: E */
    private boolean f37648E;

    /* renamed from: F */
    private final C2066l f37649F;

    /* renamed from: K */
    private AbstractC1874k f37654K;

    /* renamed from: L */
    private C1813g1 f37655L;

    /* renamed from: M */
    private C8115c1<C8166o0> f37656M;

    /* renamed from: N */
    private C1885m0 f37657N;

    /* renamed from: O */
    private C1770a2 f37658O;

    /* renamed from: P */
    private C8201x0 f37659P;

    /* renamed from: R */
    private ExtensionsManager f37661R;

    /* renamed from: S */
    private final ScaleGestureDetector.SimpleOnScaleGestureListener f37662S;

    /* renamed from: T */
    private final ScaleGestureDetector f37663T;

    /* renamed from: U */
    private final View.OnTouchListener f37664U;

    /* renamed from: V */
    private final LifecycleRegistry f37665V;

    /* renamed from: W */
    private Lifecycle.State f37666W;

    /* renamed from: e0 */
    private double f12224e0;

    /* renamed from: k */
    private final ExecutorService f12226k;

    /* renamed from: l */
    private String f12227l;

    /* renamed from: m */
    private boolean f12228m;
    @AbstractC6709a
    private HybridData mHybridData;

    /* renamed from: n */
    private Boolean f12229n;

    /* renamed from: o */
    private boolean f12230o;

    /* renamed from: p */
    private Boolean f12231p;

    /* renamed from: q */
    private Boolean f12232q;

    /* renamed from: r */
    private Boolean f12233r;

    /* renamed from: s */
    private boolean f12234s;

    /* renamed from: t */
    private ReadableMap f12235t;

    /* renamed from: u */
    private Integer f12236u;

    /* renamed from: v */
    private Boolean f12237v;

    /* renamed from: w */
    private String f12238w;

    /* renamed from: x */
    private Boolean f12239x;

    /* renamed from: y */
    private boolean f12240y;

    /* renamed from: z */
    private String f12241z = "off";

    /* renamed from: A */
    private float f37644A = 1.0f;

    /* renamed from: D */
    private double f37647D = 1.0d;

    /* renamed from: G */
    private final ExecutorService f37650G = Executors.newSingleThreadExecutor();

    /* renamed from: H */
    private final ExecutorService f37651H = Executors.newSingleThreadExecutor();

    /* renamed from: I */
    private final ExecutorService f37652I = Executors.newSingleThreadExecutor();

    /* renamed from: J */
    private CoroutineScope f37653J = C10135k0.m14187a(C10230y0.m13945c());

    /* renamed from: Q */
    private long f37660Q = System.currentTimeMillis();

    /* renamed from: a0 */
    private float f12220a0 = 1.0f;

    /* renamed from: b0 */
    private float f12221b0 = 1.0f;

    /* renamed from: c0 */
    private double f12222c0 = 30.0d;

    /* renamed from: d0 */
    private final C6047a f12223d0 = new C6047a();

    /* renamed from: f0 */
    private long f12225f0 = System.currentTimeMillis();

    @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"com/mrousavy/camera/CameraView$a", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "Landroid/view/ScaleGestureDetector;", "detector", "", "onScale", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.CameraView$a */
    /* loaded from: classes6.dex */
    public static final class C6021a extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        C6021a() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            C9971q.m14633g(detector, "detector");
            CameraView cameraView = CameraView.this;
            cameraView.setZoom(Math.max(Math.min(cameraView.getZoom() * detector.getScaleFactor(), CameraView.this.f12221b0), CameraView.this.f12220a0));
            CameraView.this.m26410v(CameraView.f12219i0);
            return true;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"com/mrousavy/camera/CameraView$b", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "onHostResume", "onHostPause", "onHostDestroy", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.CameraView$b */
    /* loaded from: classes6.dex */
    public static final class C6022b implements LifecycleEventListener {
        C6022b() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            CameraView.this.f37666W = Lifecycle.State.DESTROYED;
            CameraView.this.m26408x();
            CameraView.this.f37650G.shutdown();
            CameraView.this.getTakePhotoExecutor$react_native_vision_camera_release().shutdown();
            CameraView.this.getRecordVideoExecutor$react_native_vision_camera_release().shutdown();
            CameraView.this.getReactContext().removeLifecycleEventListener(this);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
            CameraView.this.f37666W = Lifecycle.State.CREATED;
            CameraView.this.m26408x();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            CameraView.this.f37666W = Lifecycle.State.RESUMED;
            CameraView.this.m26408x();
            CameraView.this.m26410v(CameraView.f12218h0);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, m15073d2 = {"Lcom/mrousavy/camera/CameraView$c;", "", "", "TAG", "Ljava/lang/String;", "TAG_PERF", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "arrayListOfZoom", "Ljava/util/ArrayList;", "propsThatRequireSessionReconfiguration", "<init>", "()V", "react-native-vision-camera_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.CameraView$c */
    /* loaded from: classes6.dex */
    public static final class C6023c {
        private C6023c() {
        }

        public /* synthetic */ C6023c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView", m14701f = "CameraView.kt", m14700l = {368, 449, 452}, m14699m = "configureSession")
    /* renamed from: com.mrousavy.camera.CameraView$d */
    /* loaded from: classes6.dex */
    public static final class C6024d extends AbstractC9930d {

        /* renamed from: k */
        Object f12244k;

        /* renamed from: l */
        Object f12245l;

        /* renamed from: m */
        Object f12246m;

        /* renamed from: n */
        Object f12247n;

        /* renamed from: o */
        Object f12248o;

        /* renamed from: p */
        Object f12249p;

        /* renamed from: q */
        Object f12250q;

        /* renamed from: r */
        Object f12251r;

        /* renamed from: s */
        long f12252s;

        /* renamed from: t */
        /* synthetic */ Object f12253t;

        /* renamed from: v */
        int f12255v;

        C6024d(Continuation<? super C6024d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            this.f12253t = obj;
            this.f12255v |= Integer.MIN_VALUE;
            return CameraView.this.m26415q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m15073d2 = {"", "extension", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView$configureSession$tryEnableExtension$1", m14701f = "CameraView.kt", m14700l = {375}, m14699m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraView$e */
    /* loaded from: classes6.dex */
    public static final class C6025e extends AbstractC9938k implements Function2<Integer, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        Object f12256k;

        /* renamed from: l */
        int f12257l;

        /* renamed from: m */
        /* synthetic */ int f12258m;

        /* renamed from: o */
        final /* synthetic */ C1978e f12260o;

        /* renamed from: p */
        final /* synthetic */ Ref$ObjectRef<C1921t> f12261p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6025e(C1978e eVar, Ref$ObjectRef<C1921t> ref$ObjectRef, Continuation<? super C6025e> continuation) {
            super(2, continuation);
            this.f12260o = eVar;
            this.f12261p = ref$ObjectRef;
        }

        /* renamed from: a */
        public final Object m26406a(int i, Continuation<? super Unit> continuation) {
            return ((C6025e) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C6025e eVar = new C6025e(this.f12260o, this.f12261p, continuation);
            eVar.f12258m = ((Number) obj).intValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return m26406a(num.intValue(), continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
        /* JADX WARN: Type inference failed for: r7v4, types: [androidx.camera.core.t, T, java.lang.Object] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = tf.C13075b.m4650d()
                int r1 = r6.f12257l
                r2 = 1
                java.lang.String r3 = "CameraView"
                if (r1 == 0) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                int r0 = r6.f12258m
                java.lang.Object r1 = r6.f12256k
                com.mrousavy.camera.CameraView r1 = (com.mrousavy.camera.CameraView) r1
                nf.C11093t.m10930b(r7)
                goto L_0x0051
            L_0x0017:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001f:
                nf.C11093t.m10930b(r7)
                int r7 = r6.f12258m
                com.mrousavy.camera.CameraView r1 = com.mrousavy.camera.CameraView.this
                androidx.camera.extensions.ExtensionsManager r1 = com.mrousavy.camera.CameraView.m26424h(r1)
                if (r1 != 0) goto L_0x0057
                java.lang.String r1 = "Initializing ExtensionsManager..."
                android.util.Log.i(r3, r1)
                com.mrousavy.camera.CameraView r1 = com.mrousavy.camera.CameraView.this
                android.content.Context r4 = r1.getContext()
                androidx.camera.lifecycle.e r5 = r6.f12260o
                gc.b r4 = androidx.camera.extensions.ExtensionsManager.m39398c(r4, r5)
                java.lang.String r5 = "getInstanceAsync(context, cameraProvider)"
                kotlin.jvm.internal.C9971q.m14634f(r4, r5)
                r6.f12256k = r1
                r6.f12258m = r7
                r6.f12257l = r2
                java.lang.Object r2 = p408wi.C13889a.m2379b(r4, r6)
                if (r2 != r0) goto L_0x004f
                return r0
            L_0x004f:
                r0 = r7
                r7 = r2
            L_0x0051:
                androidx.camera.extensions.ExtensionsManager r7 = (androidx.camera.extensions.ExtensionsManager) r7
                com.mrousavy.camera.CameraView.m26419m(r1, r7)
                r7 = r0
            L_0x0057:
                com.mrousavy.camera.CameraView r0 = com.mrousavy.camera.CameraView.this
                androidx.camera.extensions.ExtensionsManager r0 = com.mrousavy.camera.CameraView.m26424h(r0)
                kotlin.jvm.internal.C9971q.m14636d(r0)
                kotlin.jvm.internal.Ref$ObjectRef<androidx.camera.core.t> r1 = r6.f12261p
                T r1 = r1.f22069k
                androidx.camera.core.t r1 = (androidx.camera.core.C1921t) r1
                boolean r0 = r0.m39395f(r1, r7)
                if (r0 == 0) goto L_0x00a4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Enabling extension "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r1 = "..."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.i(r3, r0)
                kotlin.jvm.internal.Ref$ObjectRef<androidx.camera.core.t> r0 = r6.f12261p
                com.mrousavy.camera.CameraView r1 = com.mrousavy.camera.CameraView.this
                androidx.camera.extensions.ExtensionsManager r1 = com.mrousavy.camera.CameraView.m26424h(r1)
                kotlin.jvm.internal.C9971q.m14636d(r1)
                kotlin.jvm.internal.Ref$ObjectRef<androidx.camera.core.t> r2 = r6.f12261p
                T r2 = r2.f22069k
                androidx.camera.core.t r2 = (androidx.camera.core.C1921t) r2
                androidx.camera.core.t r7 = r1.m39399b(r2, r7)
                java.lang.String r1 = "extensionsManager!!.getE…ameraSelector, extension)"
                kotlin.jvm.internal.C9971q.m14634f(r7, r1)
                r0.f22069k = r7
                kotlin.Unit r7 = kotlin.Unit.f22042a
                return r7
            L_0x00a4:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Extension "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r1 = " is not available for the given Camera!"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.e(r3, r0)
                r0 = 2
                if (r7 == r0) goto L_0x00e5
                r0 = 3
                if (r7 == r0) goto L_0x00df
                java.lang.Error r0 = new java.lang.Error
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid extension supplied! Extension "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = " is not available."
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                goto L_0x00ea
            L_0x00df:
                com.mrousavy.camera.b0 r0 = new com.mrousavy.camera.b0
                r0.<init>()
                goto L_0x00ea
            L_0x00e5:
                com.mrousavy.camera.u r0 = new com.mrousavy.camera.u
                r0.<init>()
            L_0x00ea:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView.C6025e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.mrousavy.camera.CameraView$update$1$1", m14701f = "CameraView.kt", m14700l = {329}, m14699m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraView$f */
    /* loaded from: classes6.dex */
    public static final class C6026f extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: k */
        int f12262k;

        /* renamed from: l */
        int f12263l;

        /* renamed from: m */
        int f12264m;

        /* renamed from: n */
        int f12265n;

        /* renamed from: o */
        final /* synthetic */ ArrayList<String> f12266o;

        /* renamed from: p */
        final /* synthetic */ CameraView f12267p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6026f(ArrayList<String> arrayList, CameraView cameraView, Continuation<? super C6026f> continuation) {
            super(2, continuation);
            this.f12266o = arrayList;
            this.f12267p = cameraView;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C6026f(this.f12266o, this.f12267p, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C6026f) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:6:0x0011, B:10:0x0021, B:12:0x002e, B:18:0x003e, B:24:0x004e, B:27:0x0059, B:29:0x0063, B:31:0x006a, B:37:0x0083, B:39:0x00af, B:41:0x00cd), top: B:46:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:6:0x0011, B:10:0x0021, B:12:0x002e, B:18:0x003e, B:24:0x004e, B:27:0x0059, B:29:0x0063, B:31:0x006a, B:37:0x0083, B:39:0x00af, B:41:0x00cd), top: B:46:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:6:0x0011, B:10:0x0021, B:12:0x002e, B:18:0x003e, B:24:0x004e, B:27:0x0059, B:29:0x0063, B:31:0x006a, B:37:0x0083, B:39:0x00af, B:41:0x00cd), top: B:46:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:6:0x0011, B:10:0x0021, B:12:0x002e, B:18:0x003e, B:24:0x004e, B:27:0x0059, B:29:0x0063, B:31:0x006a, B:37:0x0083, B:39:0x00af, B:41:0x00cd), top: B:46:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:6:0x0011, B:10:0x0021, B:12:0x002e, B:18:0x003e, B:24:0x004e, B:27:0x0059, B:29:0x0063, B:31:0x006a, B:37:0x0083, B:39:0x00af, B:41:0x00cd), top: B:46:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00cd A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #0 {all -> 0x00d3, blocks: (B:6:0x0011, B:10:0x0021, B:12:0x002e, B:18:0x003e, B:24:0x004e, B:27:0x0059, B:29:0x0063, B:31:0x006a, B:37:0x0083, B:39:0x00af, B:41:0x00cd), top: B:46:0x0007 }] */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView.C6026f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        ArrayList<String> e;
        ArrayList<String> e2;
        e = C9906j.m14824e("cameraId", "format", "fps", "hdr", "lowLightBoost", "photo", MediaStreamTrack.VIDEO_TRACK_KIND, "enableFrameProcessor");
        f12218h0 = e;
        e2 = C9906j.m14824e("zoom");
        f12219i0 = e2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraView(Context context, ExecutorService frameProcessorThread) {
        super(context);
        C9971q.m14633g(context, "context");
        C9971q.m14633g(frameProcessorThread, "frameProcessorThread");
        this.f12226k = frameProcessorThread;
        if (FrameProcessorRuntimeManager.f12303c.m26392a()) {
            this.mHybridData = initHybrid();
        }
        C2066l lVar = new C2066l(context);
        this.f37649F = lVar;
        lVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C13071o.m4657a(lVar);
        addView(lVar);
        C6021a aVar = new C6021a();
        this.f37662S = aVar;
        this.f37663T = new ScaleGestureDetector(context, aVar);
        this.f37664U = new View.OnTouchListener() { // from class: com.mrousavy.camera.f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean d;
                d = CameraView.m26429d(CameraView.this, view, motionEvent);
                return d;
            }
        };
        this.f37666W = Lifecycle.State.INITIALIZED;
        this.f37665V = new LifecycleRegistry(this);
        getReactContext().addLifecycleEventListener(new C6022b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m26429d(CameraView this$0, View view, MotionEvent motionEvent) {
        C9971q.m14633g(this$0, "this$0");
        return this$0.f37663T.onTouchEvent(motionEvent);
    }

    private final native void frameProcessorCallback(ImageProxy imageProxy);

    /* renamed from: getFallbackToSnapshot$react_native_vision_camera_release$annotations */
    public static /* synthetic */ void m26425x5c3495a9() {
    }

    private final int getInputRotation() {
        Context context = getContext();
        C9971q.m14634f(context, "context");
        return C13063g.m4669a(context);
    }

    private final int getOutputRotation() {
        String str = this.f37645B;
        if (str == null) {
            return getInputRotation();
        }
        C9971q.m14636d(str);
        switch (str.hashCode()) {
            case -2022952606:
                if (str.equals("landscapeLeft")) {
                    return 3;
                }
                break;
            case -1090566097:
                if (str.equals("portraitUpsideDown")) {
                    return 2;
                }
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    return 0;
                }
                break;
            case 1718639649:
                if (str.equals("landscapeRight")) {
                    return 1;
                }
                break;
        }
        String str2 = this.f37645B;
        C9971q.m14636d(str2);
        throw new C6086z("orientation", str2);
    }

    public static /* synthetic */ void getPreviewView$react_native_vision_camera_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReactContext getReactContext() {
        Context context = getContext();
        C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    private final native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0514: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:148:0x0514 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x038a A[Catch: all -> 0x0513, TryCatch #0 {all -> 0x0513, blocks: (B:101:0x0316, B:102:0x032f, B:103:0x0336, B:105:0x033c, B:107:0x0349, B:114:0x037d, B:116:0x038a, B:122:0x03c0), top: B:174:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0413 A[Catch: all -> 0x0525, TryCatch #1 {all -> 0x0525, blocks: (B:126:0x03df, B:128:0x0406, B:130:0x0413, B:132:0x0419, B:133:0x041f, B:134:0x0430, B:136:0x0434, B:137:0x044f, B:139:0x04c2, B:141:0x04c8, B:143:0x04df, B:144:0x04e3, B:150:0x0518, B:151:0x051d, B:152:0x051e, B:153:0x0524), top: B:174:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0434 A[Catch: all -> 0x0525, TryCatch #1 {all -> 0x0525, blocks: (B:126:0x03df, B:128:0x0406, B:130:0x0413, B:132:0x0419, B:133:0x041f, B:134:0x0430, B:136:0x0434, B:137:0x044f, B:139:0x04c2, B:141:0x04c8, B:143:0x04df, B:144:0x04e3, B:150:0x0518, B:151:0x051d, B:152:0x051e, B:153:0x0524), top: B:174:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04c2 A[Catch: all -> 0x0525, TryCatch #1 {all -> 0x0525, blocks: (B:126:0x03df, B:128:0x0406, B:130:0x0413, B:132:0x0419, B:133:0x041f, B:134:0x0430, B:136:0x0434, B:137:0x044f, B:139:0x04c2, B:141:0x04c8, B:143:0x04df, B:144:0x04e3, B:150:0x0518, B:151:0x051d, B:152:0x051e, B:153:0x0524), top: B:174:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04df A[Catch: all -> 0x0525, TryCatch #1 {all -> 0x0525, blocks: (B:126:0x03df, B:128:0x0406, B:130:0x0413, B:132:0x0419, B:133:0x041f, B:134:0x0430, B:136:0x0434, B:137:0x044f, B:139:0x04c2, B:141:0x04c8, B:143:0x04df, B:144:0x04e3, B:150:0x0518, B:151:0x051d, B:152:0x051e, B:153:0x0524), top: B:174:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185 A[Catch: all -> 0x0527, TryCatch #2 {all -> 0x0527, blocks: (B:14:0x004f, B:19:0x0080, B:22:0x008e, B:25:0x0097, B:27:0x00ac, B:29:0x00b0, B:32:0x00b6, B:33:0x00d0, B:34:0x00e9, B:38:0x0105, B:40:0x0185, B:41:0x01a8, B:43:0x01f2, B:44:0x01fa, B:45:0x0201, B:52:0x022e, B:60:0x0246, B:68:0x0261, B:76:0x027c, B:84:0x0297, B:85:0x02a4, B:87:0x02a8, B:89:0x02b4, B:92:0x02bc, B:93:0x02c0, B:95:0x02c6, B:99:0x02d9), top: B:174:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a8 A[Catch: all -> 0x0527, TryCatch #2 {all -> 0x0527, blocks: (B:14:0x004f, B:19:0x0080, B:22:0x008e, B:25:0x0097, B:27:0x00ac, B:29:0x00b0, B:32:0x00b6, B:33:0x00d0, B:34:0x00e9, B:38:0x0105, B:40:0x0185, B:41:0x01a8, B:43:0x01f2, B:44:0x01fa, B:45:0x0201, B:52:0x022e, B:60:0x0246, B:68:0x0261, B:76:0x027c, B:84:0x0297, B:85:0x02a4, B:87:0x02a8, B:89:0x02b4, B:92:0x02bc, B:93:0x02c0, B:95:0x02c6, B:99:0x02d9), top: B:174:0x0029 }] */
    /* JADX WARN: Type inference failed for: r0v42, types: [androidx.camera.core.t, T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.camera.core.m0, i0.c1<i0.o0>, androidx.camera.core.g1] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.mrousavy.camera.CameraView$d, kotlin.coroutines.Continuation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Unknown variable types count: 2 */
    @android.annotation.SuppressLint({"RestrictedApi"})
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26415q(kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraView.m26415q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m26414r(CameraView this$0, ImageProxy image) {
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(image, "image");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this$0.f37660Q > (1.0d / this$0.f12222c0) * 1000.0d) {
            this$0.f37660Q = currentTimeMillis;
            C6049c d = this$0.f12223d0.m26386d();
            this$0.frameProcessorCallback(image);
            d.m26383a().invoke();
        }
        image.close();
        if (this$0.m26411u()) {
            this$0.m26413s();
        }
    }

    /* renamed from: s */
    private final void m26413s() {
        boolean z;
        boolean z2;
        this.f12225f0 = System.currentTimeMillis();
        double floor = Math.floor(Math.min(1.0d / this.f12223d0.m26384f(), 30));
        double d = this.f37647D;
        boolean z3 = true;
        if (d == -1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f12222c0 = floor;
            return;
        }
        if (floor == this.f12224e0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (floor != d) {
                z3 = false;
            }
            if (!z3) {
                C6063m.m26378c(this, d, floor);
                this.f12224e0 = floor;
            }
        }
    }

    /* renamed from: u */
    private final boolean m26411u() {
        return System.currentTimeMillis() - this.f12225f0 > 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m26409w(CameraView this$0, ArrayList changedProps) {
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(changedProps, "$changedProps");
        C10129j.m14195d(this$0.f37653J, null, null, new C6026f(changedProps, this$0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m26408x() {
        Lifecycle.State b = this.f37665V.mo35843b();
        C9971q.m14634f(b, "lifecycleRegistry.currentState");
        Lifecycle.State state = this.f37666W;
        Lifecycle.State state2 = Lifecycle.State.RESUMED;
        if (state != state2) {
            this.f37665V.m35830o(state);
        } else if (!this.f12240y || !isAttachedToWindow()) {
            this.f37665V.m35830o(Lifecycle.State.CREATED);
        } else {
            this.f37665V.m35830o(state2);
        }
        Log.d("CameraView", "Lifecycle went from " + b.name() + " -> " + this.f37665V.mo35843b().name() + " (isActive: " + this.f12240y + " | isAttachedToWindow: " + isAttachedToWindow() + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"RestrictedApi"})
    /* renamed from: y */
    public final void m26407y() {
        C1770a2 a2Var = this.f37658O;
        if (a2Var != null) {
            a2Var.m39874V(getInputRotation());
        }
        C1813g1 g1Var = this.f37655L;
        if (g1Var != null) {
            g1Var.m39745v0(getOutputRotation());
        }
        C8115c1<C8166o0> c1Var = this.f37656M;
        if (c1Var != null) {
            c1Var.m20552X(getOutputRotation());
        }
        C1885m0 m0Var = this.f37657N;
        if (m0Var != null) {
            m0Var.m39584Z(getOutputRotation());
        }
    }

    public final C8201x0 getActiveVideoRecording$react_native_vision_camera_release() {
        return this.f37659P;
    }

    public final Boolean getAudio() {
        return this.f12233r;
    }

    public final AbstractC1874k getCamera$react_native_vision_camera_release() {
        return this.f37654K;
    }

    public final String getCameraId() {
        return this.f12227l;
    }

    public final String getColorSpace() {
        return this.f12238w;
    }

    public final CoroutineScope getCoroutineScope$react_native_vision_camera_release() {
        return this.f37653J;
    }

    public final boolean getEnableDepthData() {
        return this.f12228m;
    }

    public final boolean getEnableFrameProcessor() {
        return this.f12234s;
    }

    public final Boolean getEnableHighQualityPhotos() {
        return this.f12229n;
    }

    public final boolean getEnablePortraitEffectsMatteDelivery() {
        return this.f12230o;
    }

    public final boolean getEnableZoomGesture() {
        return this.f37646C;
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public final boolean getFallbackToSnapshot$react_native_vision_camera_release() {
        String str;
        CameraManager cameraManager;
        Boolean bool = this.f12232q;
        Boolean bool2 = Boolean.TRUE;
        if ((C9971q.m14638b(bool, bool2) || this.f12234s) && (str = this.f12227l) != null) {
            Object systemService = getReactContext().getSystemService("camera");
            if (systemService instanceof CameraManager) {
                cameraManager = (CameraManager) systemService;
            } else {
                cameraManager = null;
            }
            if (cameraManager != null) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                C9971q.m14634f(cameraCharacteristics, "cameraManger.getCameraCharacteristics(cameraId)");
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
                if (C9971q.m14638b(this.f12232q, bool2) && this.f12234s) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ReadableMap getFormat() {
        return this.f12235t;
    }

    public final Integer getFps() {
        return this.f12236u;
    }

    public final double getFrameProcessorFps() {
        return this.f37647D;
    }

    public final Boolean getHdr() {
        return this.f12237v;
    }

    public final C1813g1 getImageCapture$react_native_vision_camera_release() {
        return this.f37655L;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.f37665V;
    }

    public final Boolean getLowLightBoost() {
        return this.f12239x;
    }

    public final String getOrientation() {
        return this.f37645B;
    }

    public final Boolean getPhoto() {
        return this.f12231p;
    }

    public final C2066l getPreviewView$react_native_vision_camera_release() {
        return this.f37649F;
    }

    public final ExecutorService getRecordVideoExecutor$react_native_vision_camera_release() {
        return this.f37652I;
    }

    public final ExecutorService getTakePhotoExecutor$react_native_vision_camera_release() {
        return this.f37651H;
    }

    public final String getTorch() {
        return this.f12241z;
    }

    public final Boolean getVideo() {
        return this.f12232q;
    }

    public final C8115c1<C8166o0> getVideoCapture$react_native_vision_camera_release() {
        return this.f37656M;
    }

    public final float getZoom() {
        return this.f37644A;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m26408x();
        if (!this.f37648E) {
            this.f37648E = true;
            C6063m.m26376e(this);
        }
        m26410v(f12218h0);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m26407y();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m26408x();
    }

    public final void setActive(boolean z) {
        this.f12240y = z;
    }

    public final void setActiveVideoRecording$react_native_vision_camera_release(C8201x0 x0Var) {
        this.f37659P = x0Var;
    }

    public final void setAudio(Boolean bool) {
        this.f12233r = bool;
    }

    public final void setCamera$react_native_vision_camera_release(AbstractC1874k kVar) {
        this.f37654K = kVar;
    }

    public final void setCameraId(String str) {
        this.f12227l = str;
    }

    public final void setColorSpace(String str) {
        this.f12238w = str;
    }

    public final void setCoroutineScope$react_native_vision_camera_release(CoroutineScope coroutineScope) {
        C9971q.m14633g(coroutineScope, "<set-?>");
        this.f37653J = coroutineScope;
    }

    public final void setEnableDepthData(boolean z) {
        this.f12228m = z;
    }

    public final void setEnableFrameProcessor(boolean z) {
        this.f12234s = z;
    }

    public final void setEnableHighQualityPhotos(Boolean bool) {
        this.f12229n = bool;
    }

    public final void setEnablePortraitEffectsMatteDelivery(boolean z) {
        this.f12230o = z;
    }

    public final void setEnableZoomGesture(boolean z) {
        View.OnTouchListener onTouchListener;
        this.f37646C = z;
        if (z) {
            onTouchListener = this.f37664U;
        } else {
            onTouchListener = null;
        }
        setOnTouchListener(onTouchListener);
    }

    public final void setFormat(ReadableMap readableMap) {
        this.f12235t = readableMap;
    }

    public final void setFps(Integer num) {
        this.f12236u = num;
    }

    public final void setFrameProcessorFps(double d) {
        boolean z;
        this.f37647D = d;
        if (d == -1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d = 30.0d;
        }
        this.f12222c0 = d;
        this.f12225f0 = System.currentTimeMillis();
        this.f12223d0.m26385e();
    }

    public final void setHdr(Boolean bool) {
        this.f12237v = bool;
    }

    public final void setImageCapture$react_native_vision_camera_release(C1813g1 g1Var) {
        this.f37655L = g1Var;
    }

    public final void setLowLightBoost(Boolean bool) {
        this.f12239x = bool;
    }

    public final void setOrientation(String str) {
        this.f37645B = str;
    }

    public final void setPhoto(Boolean bool) {
        this.f12231p = bool;
    }

    public final void setTorch(String str) {
        C9971q.m14633g(str, "<set-?>");
        this.f12241z = str;
    }

    public final void setVideo(Boolean bool) {
        this.f12232q = bool;
    }

    public final void setVideoCapture$react_native_vision_camera_release(C8115c1<C8166o0> c1Var) {
        this.f37656M = c1Var;
    }

    public final void setZoom(float f) {
        this.f37644A = f;
    }

    /* renamed from: t */
    public final boolean m26412t() {
        return this.f12240y;
    }

    /* renamed from: v */
    public final boolean m26410v(final ArrayList<String> changedProps) {
        C9971q.m14633g(changedProps, "changedProps");
        return this.f37649F.post(new Runnable() { // from class: com.mrousavy.camera.g
            @Override // java.lang.Runnable
            public final void run() {
                CameraView.m26409w(CameraView.this, changedProps);
            }
        });
    }
}
