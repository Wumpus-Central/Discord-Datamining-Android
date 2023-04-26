.class public final Lcom/mrousavy/camera/CameraView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleOwner;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ClickableViewAccessibility",
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mrousavy/camera/CameraView$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008*\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0017\n\u0002\u0010\u0007\n\u0002\u0008\u0010\n\u0002\u0010\u0006\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00fe\u00012\u00020\u00012\u00020\u0002:\u0002\u00ff\u0001B\u001b\u0012\u0008\u0010\u00fb\u0001\u001a\u00030\u00fa\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u00a2\u0006\u0006\u0008\u00fc\u0001\u0010\u00fd\u0001J\u0008\u0010\u0004\u001a\u00020\u0003H\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0082 J\u0008\u0010\n\u001a\u00020\u0003H\u0002J\u0013\u0010\u000b\u001a\u00020\u0003H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0008\u0010\r\u001a\u00020\u0003H\u0002J\u0012\u0010\u0010\u001a\u00020\u00032\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0008\u0010\u0012\u001a\u00020\u0011H\u0016J\u0008\u0010\u0013\u001a\u00020\u0003H\u0014J\u0008\u0010\u0014\u001a\u00020\u0003H\u0014J\u001e\u0010\u001a\u001a\u00020\u00192\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\u0008\u0012\u0004\u0012\u00020\u0016`\u0017R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR$\u0010%\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\"\u0010,\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R$\u00103\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R\"\u00107\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00084\u0010\'\u001a\u0004\u00085\u0010)\"\u0004\u00086\u0010+R$\u0010;\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00088\u0010.\u001a\u0004\u00089\u00100\"\u0004\u0008:\u00102R$\u0010>\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010.\u001a\u0004\u0008<\u00100\"\u0004\u0008=\u00102R$\u0010B\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008?\u0010.\u001a\u0004\u0008@\u00100\"\u0004\u0008A\u00102R\"\u0010E\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\'\u001a\u0004\u0008C\u0010)\"\u0004\u0008D\u0010+R$\u0010M\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008G\u0010H\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010LR$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008O\u0010P\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010TR$\u0010X\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010.\u001a\u0004\u0008V\u00100\"\u0004\u0008W\u00102R$\u0010\\\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Y\u0010 \u001a\u0004\u0008Z\u0010\"\"\u0004\u0008[\u0010$R$\u0010_\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010.\u001a\u0004\u0008]\u00100\"\u0004\u0008^\u00102R\"\u0010a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\'\u001a\u0004\u0008G\u0010)\"\u0004\u0008`\u0010+R\"\u0010e\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008b\u0010 \u001a\u0004\u0008c\u0010\"\"\u0004\u0008d\u0010$R\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008g\u0010h\u001a\u0004\u0008i\u0010j\"\u0004\u0008k\u0010lR$\u0010q\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008n\u0010 \u001a\u0004\u0008o\u0010\"\"\u0004\u0008p\u0010$R*\u0010v\u001a\u00020\u00192\u0006\u0010r\u001a\u00020\u00198\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008s\u0010\'\u001a\u0004\u0008t\u0010)\"\u0004\u0008u\u0010+R*\u0010}\u001a\u00020w2\u0006\u0010r\u001a\u00020w8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008x\u0010x\u001a\u0004\u0008y\u0010z\"\u0004\u0008{\u0010|R\u0016\u0010\u007f\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008~\u0010\'R\'\u0010\u0086\u0001\u001a\u00030\u0080\u00018\u0000X\u0080\u0004\u00a2\u0006\u0017\n\u0005\u0008h\u0010\u0081\u0001\u0012\u0006\u0008\u0084\u0001\u0010\u0085\u0001\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u001f\u0010\u0089\u0001\u001a\u000b \u0087\u0001*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0088\u0001\u0010\u001dR\'\u0010\u008d\u0001\u001a\u000b \u0087\u0001*\u0004\u0018\u00010\u001b0\u001b8\u0000X\u0080\u0004\u00a2\u0006\u000f\n\u0005\u0008\u008a\u0001\u0010\u001d\u001a\u0006\u0008\u008b\u0001\u0010\u008c\u0001R\'\u0010\u0090\u0001\u001a\u000b \u0087\u0001*\u0004\u0018\u00010\u001b0\u001b8\u0000X\u0080\u0004\u00a2\u0006\u000f\n\u0005\u0008\u008e\u0001\u0010\u001d\u001a\u0006\u0008\u008f\u0001\u0010\u008c\u0001R*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0092\u0001\u0010\u0093\u0001\u001a\u0006\u0008\u0094\u0001\u0010\u0095\u0001\"\u0006\u0008\u0096\u0001\u0010\u0097\u0001R,\u0010\u00a0\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u009a\u0001\u0010\u009b\u0001\u001a\u0006\u0008\u009c\u0001\u0010\u009d\u0001\"\u0006\u0008\u009e\u0001\u0010\u009f\u0001R,\u0010\u00a8\u0001\u001a\u0005\u0018\u00010\u00a1\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001\u001a\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001\"\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R3\u0010\u00b1\u0001\u001a\u000c\u0012\u0005\u0012\u00030\u00aa\u0001\u0018\u00010\u00a9\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001\u001a\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001\"\u0006\u0008\u00af\u0001\u0010\u00b0\u0001R\u001c\u0010\u00b5\u0001\u001a\u0005\u0018\u00010\u00b2\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001R\u001c\u0010\u00b9\u0001\u001a\u0005\u0018\u00010\u00b6\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001R,\u0010\u00c1\u0001\u001a\u0005\u0018\u00010\u00ba\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001\u001a\u0006\u0008\u00bd\u0001\u0010\u00be\u0001\"\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001R\u001a\u0010\u00c4\u0001\u001a\u00030\u00c2\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c3\u0001\u0010\u0092\u0001R\u001c\u0010\u00c8\u0001\u001a\u0005\u0018\u00010\u00c5\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c6\u0001\u0010\u00c7\u0001R\u0018\u0010\u00cc\u0001\u001a\u00030\u00c9\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001R\u0018\u0010\u00d0\u0001\u001a\u00030\u00cd\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001R\u0018\u0010\u00d4\u0001\u001a\u00030\u00d1\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d2\u0001\u0010\u00d3\u0001R\u0018\u0010\u00d8\u0001\u001a\u00030\u00d5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d6\u0001\u0010\u00d7\u0001R\u001a\u0010\u00dc\u0001\u001a\u00030\u00d9\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00da\u0001\u0010\u00db\u0001R\u0018\u0010\u00de\u0001\u001a\u00020f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00dd\u0001\u0010hR\u0018\u0010\u00e0\u0001\u001a\u00020f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00df\u0001\u0010hR\u0018\u0010\u00e2\u0001\u001a\u00020w8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00e1\u0001\u0010xR\u0018\u0010\u00e6\u0001\u001a\u00030\u00e3\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e4\u0001\u0010\u00e5\u0001R\u0018\u0010\u00e8\u0001\u001a\u00020w8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00e7\u0001\u0010xR\u001a\u0010\u00ea\u0001\u001a\u00030\u00c2\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00e9\u0001\u0010\u0092\u0001R\u001b\u0010\u00eb\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00eb\u0001\u0010\u00ec\u0001R\u0018\u0010\u00f0\u0001\u001a\u00030\u00ed\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00ee\u0001\u0010\u00ef\u0001R\u0017\u0010\u00f3\u0001\u001a\u00020N8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00f1\u0001\u0010\u00f2\u0001R\u0017\u0010\u00f5\u0001\u001a\u00020N8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00f4\u0001\u0010\u00f2\u0001R\u0015\u0010\u00f6\u0001\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008O\u0010)R\u001e\u0010\u00f9\u0001\u001a\u00020\u00198AX\u0080\u0004\u00a2\u0006\u000f\u0012\u0006\u0008\u00f8\u0001\u0010\u0085\u0001\u001a\u0005\u0008\u00f7\u0001\u0010)\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0080\u0002"
    }
    d2 = {
        "Lcom/mrousavy/camera/CameraView;",
        "Landroid/widget/FrameLayout;",
        "Landroidx/lifecycle/LifecycleOwner;",
        "",
        "y",
        "Lcom/facebook/jni/HybridData;",
        "initHybrid",
        "Landroidx/camera/core/ImageProxy;",
        "frame",
        "frameProcessorCallback",
        "x",
        "q",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "s",
        "Landroid/content/res/Configuration;",
        "newConfig",
        "onConfigurationChanged",
        "Landroidx/lifecycle/Lifecycle;",
        "getLifecycle",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "Ljava/util/ArrayList;",
        "",
        "Lkotlin/collections/ArrayList;",
        "changedProps",
        "",
        "v",
        "Ljava/util/concurrent/ExecutorService;",
        "k",
        "Ljava/util/concurrent/ExecutorService;",
        "frameProcessorThread",
        "l",
        "Ljava/lang/String;",
        "getCameraId",
        "()Ljava/lang/String;",
        "setCameraId",
        "(Ljava/lang/String;)V",
        "cameraId",
        "m",
        "Z",
        "getEnableDepthData",
        "()Z",
        "setEnableDepthData",
        "(Z)V",
        "enableDepthData",
        "n",
        "Ljava/lang/Boolean;",
        "getEnableHighQualityPhotos",
        "()Ljava/lang/Boolean;",
        "setEnableHighQualityPhotos",
        "(Ljava/lang/Boolean;)V",
        "enableHighQualityPhotos",
        "o",
        "getEnablePortraitEffectsMatteDelivery",
        "setEnablePortraitEffectsMatteDelivery",
        "enablePortraitEffectsMatteDelivery",
        "p",
        "getPhoto",
        "setPhoto",
        "photo",
        "getVideo",
        "setVideo",
        "video",
        "r",
        "getAudio",
        "setAudio",
        "audio",
        "getEnableFrameProcessor",
        "setEnableFrameProcessor",
        "enableFrameProcessor",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "t",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "getFormat",
        "()Lcom/facebook/react/bridge/ReadableMap;",
        "setFormat",
        "(Lcom/facebook/react/bridge/ReadableMap;)V",
        "format",
        "",
        "u",
        "Ljava/lang/Integer;",
        "getFps",
        "()Ljava/lang/Integer;",
        "setFps",
        "(Ljava/lang/Integer;)V",
        "fps",
        "getHdr",
        "setHdr",
        "hdr",
        "w",
        "getColorSpace",
        "setColorSpace",
        "colorSpace",
        "getLowLightBoost",
        "setLowLightBoost",
        "lowLightBoost",
        "setActive",
        "isActive",
        "z",
        "getTorch",
        "setTorch",
        "torch",
        "",
        "A",
        "F",
        "getZoom",
        "()F",
        "setZoom",
        "(F)V",
        "zoom",
        "B",
        "getOrientation",
        "setOrientation",
        "orientation",
        "value",
        "C",
        "getEnableZoomGesture",
        "setEnableZoomGesture",
        "enableZoomGesture",
        "",
        "D",
        "getFrameProcessorFps",
        "()D",
        "setFrameProcessorFps",
        "(D)V",
        "frameProcessorFps",
        "E",
        "isMounted",
        "Landroidx/camera/view/l;",
        "Landroidx/camera/view/l;",
        "getPreviewView$react_native_vision_camera_release",
        "()Landroidx/camera/view/l;",
        "getPreviewView$react_native_vision_camera_release$annotations",
        "()V",
        "previewView",
        "kotlin.jvm.PlatformType",
        "G",
        "cameraExecutor",
        "H",
        "getTakePhotoExecutor$react_native_vision_camera_release",
        "()Ljava/util/concurrent/ExecutorService;",
        "takePhotoExecutor",
        "I",
        "getRecordVideoExecutor$react_native_vision_camera_release",
        "recordVideoExecutor",
        "Lkotlinx/coroutines/CoroutineScope;",
        "J",
        "Lkotlinx/coroutines/CoroutineScope;",
        "getCoroutineScope$react_native_vision_camera_release",
        "()Lkotlinx/coroutines/CoroutineScope;",
        "setCoroutineScope$react_native_vision_camera_release",
        "(Lkotlinx/coroutines/CoroutineScope;)V",
        "coroutineScope",
        "Landroidx/camera/core/k;",
        "K",
        "Landroidx/camera/core/k;",
        "getCamera$react_native_vision_camera_release",
        "()Landroidx/camera/core/k;",
        "setCamera$react_native_vision_camera_release",
        "(Landroidx/camera/core/k;)V",
        "camera",
        "Landroidx/camera/core/g1;",
        "L",
        "Landroidx/camera/core/g1;",
        "getImageCapture$react_native_vision_camera_release",
        "()Landroidx/camera/core/g1;",
        "setImageCapture$react_native_vision_camera_release",
        "(Landroidx/camera/core/g1;)V",
        "imageCapture",
        "Li0/c1;",
        "Li0/o0;",
        "M",
        "Li0/c1;",
        "getVideoCapture$react_native_vision_camera_release",
        "()Li0/c1;",
        "setVideoCapture$react_native_vision_camera_release",
        "(Li0/c1;)V",
        "videoCapture",
        "Landroidx/camera/core/m0;",
        "N",
        "Landroidx/camera/core/m0;",
        "imageAnalysis",
        "Landroidx/camera/core/a2;",
        "O",
        "Landroidx/camera/core/a2;",
        "preview",
        "Li0/x0;",
        "P",
        "Li0/x0;",
        "getActiveVideoRecording$react_native_vision_camera_release",
        "()Li0/x0;",
        "setActiveVideoRecording$react_native_vision_camera_release",
        "(Li0/x0;)V",
        "activeVideoRecording",
        "",
        "Q",
        "lastFrameProcessorCall",
        "Landroidx/camera/extensions/ExtensionsManager;",
        "R",
        "Landroidx/camera/extensions/ExtensionsManager;",
        "extensionsManager",
        "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;",
        "S",
        "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;",
        "scaleGestureListener",
        "Landroid/view/ScaleGestureDetector;",
        "T",
        "Landroid/view/ScaleGestureDetector;",
        "scaleGestureDetector",
        "Landroid/view/View$OnTouchListener;",
        "U",
        "Landroid/view/View$OnTouchListener;",
        "touchEventListener",
        "Landroidx/lifecycle/LifecycleRegistry;",
        "V",
        "Landroidx/lifecycle/LifecycleRegistry;",
        "lifecycleRegistry",
        "Landroidx/lifecycle/Lifecycle$State;",
        "W",
        "Landroidx/lifecycle/Lifecycle$State;",
        "hostLifecycleState",
        "a0",
        "minZoom",
        "b0",
        "maxZoom",
        "c0",
        "actualFrameProcessorFps",
        "Lcom/mrousavy/camera/frameprocessor/a;",
        "d0",
        "Lcom/mrousavy/camera/frameprocessor/a;",
        "frameProcessorPerformanceDataCollector",
        "e0",
        "lastSuggestedFrameProcessorFps",
        "f0",
        "lastFrameProcessorPerformanceEvaluation",
        "mHybridData",
        "Lcom/facebook/jni/HybridData;",
        "Lcom/facebook/react/bridge/ReactContext;",
        "getReactContext",
        "()Lcom/facebook/react/bridge/ReactContext;",
        "reactContext",
        "getInputRotation",
        "()I",
        "inputRotation",
        "getOutputRotation",
        "outputRotation",
        "isReadyForNewEvaluation",
        "getFallbackToSnapshot$react_native_vision_camera_release",
        "getFallbackToSnapshot$react_native_vision_camera_release$annotations",
        "fallbackToSnapshot",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V",
        "g0",
        "c",
        "react-native-vision-camera_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g0:Lcom/mrousavy/camera/CameraView$c;

.field private static final h0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final i0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:F

.field private B:Ljava/lang/String;

.field private C:Z

.field private D:D

.field private E:Z

.field private final F:Landroidx/camera/view/l;

.field private final G:Ljava/util/concurrent/ExecutorService;

.field private final H:Ljava/util/concurrent/ExecutorService;

.field private final I:Ljava/util/concurrent/ExecutorService;

.field private J:Lkotlinx/coroutines/CoroutineScope;

.field private K:Landroidx/camera/core/k;

.field private L:Landroidx/camera/core/g1;

.field private M:Li0/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li0/c1<",
            "Li0/o0;",
            ">;"
        }
    .end annotation
.end field

.field private N:Landroidx/camera/core/m0;

.field private O:Landroidx/camera/core/a2;

.field private P:Li0/x0;

.field private Q:J

.field private R:Landroidx/camera/extensions/ExtensionsManager;

.field private final S:Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;

.field private final T:Landroid/view/ScaleGestureDetector;

.field private final U:Landroid/view/View$OnTouchListener;

.field private final V:Landroidx/lifecycle/LifecycleRegistry;

.field private W:Landroidx/lifecycle/Lifecycle$State;

.field private a0:F

.field private b0:F

.field private c0:D

.field private final d0:Lcom/mrousavy/camera/frameprocessor/a;

.field private e0:D

.field private f0:J

.field private final k:Ljava/util/concurrent/ExecutorService;

.field private l:Ljava/lang/String;

.field private m:Z

.field private mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Ld6/a;
    .end annotation
.end field

.field private n:Ljava/lang/Boolean;

.field private o:Z

.field private p:Ljava/lang/Boolean;

.field private q:Ljava/lang/Boolean;

.field private r:Ljava/lang/Boolean;

.field private s:Z

.field private t:Lcom/facebook/react/bridge/ReadableMap;

.field private u:Ljava/lang/Integer;

.field private v:Ljava/lang/Boolean;

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/Boolean;

.field private y:Z

.field private z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/mrousavy/camera/CameraView$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/mrousavy/camera/CameraView$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/mrousavy/camera/CameraView;->g0:Lcom/mrousavy/camera/CameraView$c;

    .line 8
    .line 9
    const-string v2, "cameraId"

    .line 10
    .line 11
    const-string v3, "format"

    .line 12
    .line 13
    const-string v4, "fps"

    .line 14
    .line 15
    const-string v5, "hdr"

    .line 16
    .line 17
    const-string v6, "lowLightBoost"

    .line 18
    .line 19
    const-string v7, "photo"

    .line 20
    .line 21
    const-string v8, "video"

    .line 22
    .line 23
    const-string v9, "enableFrameProcessor"

    .line 24
    .line 25
    filled-new-array/range {v2 .. v9}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lkotlin/collections/h;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lcom/mrousavy/camera/CameraView;->h0:Ljava/util/ArrayList;

    .line 34
    .line 35
    const-string v0, "zoom"

    .line 36
    .line 37
    filled-new-array {v0}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lkotlin/collections/h;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/mrousavy/camera/CameraView;->i0:Ljava/util/ArrayList;

    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "frameProcessorThread"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lcom/mrousavy/camera/CameraView;->k:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    const-string p2, "off"

    .line 17
    .line 18
    iput-object p2, p0, Lcom/mrousavy/camera/CameraView;->z:Ljava/lang/String;

    .line 19
    .line 20
    const/high16 p2, 0x3f800000    # 1.0f

    .line 21
    .line 22
    iput p2, p0, Lcom/mrousavy/camera/CameraView;->A:F

    .line 23
    .line 24
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 25
    .line 26
    iput-wide v0, p0, Lcom/mrousavy/camera/CameraView;->D:D

    .line 27
    .line 28
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/mrousavy/camera/CameraView;->G:Ljava/util/concurrent/ExecutorService;

    .line 33
    .line 34
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/mrousavy/camera/CameraView;->H:Ljava/util/concurrent/ExecutorService;

    .line 39
    .line 40
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lcom/mrousavy/camera/CameraView;->I:Ljava/util/concurrent/ExecutorService;

    .line 45
    .line 46
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lkotlinx/coroutines/k0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/mrousavy/camera/CameraView;->J:Lkotlinx/coroutines/CoroutineScope;

    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    iput-wide v0, p0, Lcom/mrousavy/camera/CameraView;->Q:J

    .line 61
    .line 62
    iput p2, p0, Lcom/mrousavy/camera/CameraView;->a0:F

    .line 63
    .line 64
    iput p2, p0, Lcom/mrousavy/camera/CameraView;->b0:F

    .line 65
    .line 66
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    .line 67
    .line 68
    iput-wide v0, p0, Lcom/mrousavy/camera/CameraView;->c0:D

    .line 69
    .line 70
    new-instance p2, Lcom/mrousavy/camera/frameprocessor/a;

    .line 71
    .line 72
    invoke-direct {p2}, Lcom/mrousavy/camera/frameprocessor/a;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lcom/mrousavy/camera/CameraView;->d0:Lcom/mrousavy/camera/frameprocessor/a;

    .line 76
    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    iput-wide v0, p0, Lcom/mrousavy/camera/CameraView;->f0:J

    .line 82
    .line 83
    sget-object p2, Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;->c:Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager$a;

    .line 84
    .line 85
    invoke-virtual {p2}, Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager$a;->a()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_0

    .line 90
    .line 91
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->initHybrid()Lcom/facebook/jni/HybridData;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    iput-object p2, p0, Lcom/mrousavy/camera/CameraView;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 96
    .line 97
    :cond_0
    new-instance p2, Landroidx/camera/view/l;

    .line 98
    .line 99
    invoke-direct {p2, p1}, Landroidx/camera/view/l;-><init>(Landroid/content/Context;)V

    .line 100
    .line 101
    .line 102
    iput-object p2, p0, Lcom/mrousavy/camera/CameraView;->F:Landroidx/camera/view/l;

    .line 103
    .line 104
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 105
    .line 106
    const/4 v1, -0x1

    .line 107
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p2}, Lse/o;->a(Landroid/view/ViewGroup;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 117
    .line 118
    .line 119
    new-instance p2, Lcom/mrousavy/camera/CameraView$a;

    .line 120
    .line 121
    invoke-direct {p2, p0}, Lcom/mrousavy/camera/CameraView$a;-><init>(Lcom/mrousavy/camera/CameraView;)V

    .line 122
    .line 123
    .line 124
    iput-object p2, p0, Lcom/mrousavy/camera/CameraView;->S:Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;

    .line 125
    .line 126
    new-instance v0, Landroid/view/ScaleGestureDetector;

    .line 127
    .line 128
    invoke-direct {v0, p1, p2}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    .line 129
    .line 130
    .line 131
    iput-object v0, p0, Lcom/mrousavy/camera/CameraView;->T:Landroid/view/ScaleGestureDetector;

    .line 132
    .line 133
    new-instance p1, Lcom/mrousavy/camera/f;

    .line 134
    .line 135
    invoke-direct {p1, p0}, Lcom/mrousavy/camera/f;-><init>(Lcom/mrousavy/camera/CameraView;)V

    .line 136
    .line 137
    .line 138
    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->U:Landroid/view/View$OnTouchListener;

    .line 139
    .line 140
    sget-object p1, Landroidx/lifecycle/Lifecycle$State;->l:Landroidx/lifecycle/Lifecycle$State;

    .line 141
    .line 142
    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->W:Landroidx/lifecycle/Lifecycle$State;

    .line 143
    .line 144
    new-instance p1, Landroidx/lifecycle/LifecycleRegistry;

    .line 145
    .line 146
    invoke-direct {p1, p0}, Landroidx/lifecycle/LifecycleRegistry;-><init>(Landroidx/lifecycle/LifecycleOwner;)V

    .line 147
    .line 148
    .line 149
    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->V:Landroidx/lifecycle/LifecycleRegistry;

    .line 150
    .line 151
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    new-instance p2, Lcom/mrousavy/camera/CameraView$b;

    .line 156
    .line 157
    invoke-direct {p2, p0}, Lcom/mrousavy/camera/CameraView$b;-><init>(Lcom/mrousavy/camera/CameraView;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 161
    .line 162
    .line 163
    return-void
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public static synthetic a(Lcom/mrousavy/camera/CameraView;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/mrousavy/camera/CameraView;->d(Lcom/mrousavy/camera/CameraView;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/mrousavy/camera/CameraView;Landroidx/camera/core/ImageProxy;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mrousavy/camera/CameraView;->r(Lcom/mrousavy/camera/CameraView;Landroidx/camera/core/ImageProxy;)V

    return-void
.end method

.method public static synthetic c(Lcom/mrousavy/camera/CameraView;Ljava/util/ArrayList;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mrousavy/camera/CameraView;->w(Lcom/mrousavy/camera/CameraView;Ljava/util/ArrayList;)V

    return-void
.end method

.method private static final d(Lcom/mrousavy/camera/CameraView;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/mrousavy/camera/CameraView;->T:Landroid/view/ScaleGestureDetector;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
.end method

.method public static final synthetic e(Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/mrousavy/camera/CameraView;->q(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f()Ljava/util/ArrayList;
    .locals 1

    sget-object v0, Lcom/mrousavy/camera/CameraView;->i0:Ljava/util/ArrayList;

    return-object v0
.end method

.method private final native frameProcessorCallback(Landroidx/camera/core/ImageProxy;)V
.end method

.method public static final synthetic g(Lcom/mrousavy/camera/CameraView;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    iget-object p0, p0, Lcom/mrousavy/camera/CameraView;->G:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public static synthetic getFallbackToSnapshot$react_native_vision_camera_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getInputRotation()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lse/g;->a(Landroid/content/Context;)I

    move-result v0

    return v0
.end method

.method private final getOutputRotation()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->B:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sparse-switch v1, :sswitch_data_0

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :sswitch_0
    const-string v1, "landscapeRight"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    goto :goto_0

    .line 26
    :sswitch_1
    const-string v1, "portrait"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    goto :goto_0

    .line 36
    :sswitch_2
    const-string v1, "portraitUpsideDown"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    const/4 v0, 0x2

    .line 45
    goto :goto_0

    .line 46
    :sswitch_3
    const-string v1, "landscapeLeft"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    :goto_0
    return v0

    .line 56
    :cond_0
    :goto_1
    new-instance v0, Lcom/mrousavy/camera/z;

    .line 57
    .line 58
    iget-object v1, p0, Lcom/mrousavy/camera/CameraView;->B:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    const-string v2, "orientation"

    .line 64
    .line 65
    invoke-direct {v0, v2, v1}, Lcom/mrousavy/camera/z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_1
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->getInputRotation()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    return v0

    .line 74
    nop

    .line 75
    :sswitch_data_0
    .sparse-switch
        -0x7893ce9e -> :sswitch_3
        -0x4100b7d1 -> :sswitch_2
        0x2b77bb9b -> :sswitch_1
        0x66705c21 -> :sswitch_0
    .end sparse-switch
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method

.method public static synthetic getPreviewView$react_native_vision_camera_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getReactContext()Lcom/facebook/react/bridge/ReactContext;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    return-object v0
.end method

.method public static final synthetic h(Lcom/mrousavy/camera/CameraView;)Landroidx/camera/extensions/ExtensionsManager;
    .locals 0

    iget-object p0, p0, Lcom/mrousavy/camera/CameraView;->R:Landroidx/camera/extensions/ExtensionsManager;

    return-object p0
.end method

.method public static final synthetic i(Lcom/mrousavy/camera/CameraView;)F
    .locals 0

    iget p0, p0, Lcom/mrousavy/camera/CameraView;->b0:F

    return p0
.end method

.method private final native initHybrid()Lcom/facebook/jni/HybridData;
.end method

.method public static final synthetic j(Lcom/mrousavy/camera/CameraView;)F
    .locals 0

    iget p0, p0, Lcom/mrousavy/camera/CameraView;->a0:F

    return p0
.end method

.method public static final synthetic k()Ljava/util/ArrayList;
    .locals 1

    sget-object v0, Lcom/mrousavy/camera/CameraView;->h0:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static final synthetic l(Lcom/mrousavy/camera/CameraView;)Lcom/facebook/react/bridge/ReactContext;
    .locals 0

    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/mrousavy/camera/CameraView;Landroidx/camera/extensions/ExtensionsManager;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->R:Landroidx/camera/extensions/ExtensionsManager;

    return-void
.end method

.method public static final synthetic n(Lcom/mrousavy/camera/CameraView;Landroidx/lifecycle/Lifecycle$State;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->W:Landroidx/lifecycle/Lifecycle$State;

    return-void
.end method

.method public static final synthetic o(Lcom/mrousavy/camera/CameraView;)V
    .locals 0

    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->x()V

    return-void
.end method

.method public static final synthetic p(Lcom/mrousavy/camera/CameraView;)V
    .locals 0

    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->y()V

    return-void
.end method

.method private final q(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lcom/mrousavy/camera/CameraView$d;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/mrousavy/camera/CameraView$d;

    iget v3, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/mrousavy/camera/CameraView$d;

    invoke-direct {v2, v1, v0}, Lcom/mrousavy/camera/CameraView$d;-><init>(Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v2, Lcom/mrousavy/camera/CameraView$d;->t:Ljava/lang/Object;

    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const-string v8, "CameraView"

    const/4 v9, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v9, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-wide v3, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    iget-object v5, v2, Lcom/mrousavy/camera/CameraView$d;->q:Ljava/lang/Object;

    check-cast v5, Landroidx/camera/core/m0$c;

    iget-object v11, v2, Lcom/mrousavy/camera/CameraView$d;->p:Ljava/lang/Object;

    check-cast v11, Li0/o0$h;

    iget-object v12, v2, Lcom/mrousavy/camera/CameraView$d;->o:Ljava/lang/Object;

    check-cast v12, Landroidx/camera/core/g1$e;

    iget-object v13, v2, Lcom/mrousavy/camera/CameraView$d;->n:Ljava/lang/Object;

    check-cast v13, Landroidx/camera/core/a2$b;

    iget-object v14, v2, Lcom/mrousavy/camera/CameraView$d;->m:Ljava/lang/Object;

    check-cast v14, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v15, v2, Lcom/mrousavy/camera/CameraView$d;->l:Ljava/lang/Object;

    check-cast v15, Landroidx/camera/lifecycle/e;

    iget-object v2, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    check-cast v2, Lcom/mrousavy/camera/CameraView;

    :try_start_0
    invoke-static {v0}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-object/from16 v17, v8

    goto/16 :goto_f

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v11, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    iget-object v4, v2, Lcom/mrousavy/camera/CameraView$d;->r:Ljava/lang/Object;

    check-cast v4, Landroidx/camera/core/m0$c;

    iget-object v13, v2, Lcom/mrousavy/camera/CameraView$d;->q:Ljava/lang/Object;

    check-cast v13, Li0/o0$h;

    iget-object v14, v2, Lcom/mrousavy/camera/CameraView$d;->p:Ljava/lang/Object;

    check-cast v14, Landroidx/camera/core/g1$e;

    iget-object v15, v2, Lcom/mrousavy/camera/CameraView$d;->o:Ljava/lang/Object;

    check-cast v15, Landroidx/camera/core/a2$b;

    iget-object v5, v2, Lcom/mrousavy/camera/CameraView$d;->n:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/functions/Function2;

    iget-object v6, v2, Lcom/mrousavy/camera/CameraView$d;->m:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v10, v2, Lcom/mrousavy/camera/CameraView$d;->l:Ljava/lang/Object;

    check-cast v10, Landroidx/camera/lifecycle/e;

    iget-object v7, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    check-cast v7, Lcom/mrousavy/camera/CameraView;

    :try_start_1
    invoke-static {v0}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v1, v3

    move-object/from16 v17, v8

    goto/16 :goto_c

    :cond_3
    iget-wide v4, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    iget-object v6, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    check-cast v6, Lcom/mrousavy/camera/CameraView;

    :try_start_2
    invoke-static {v0}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-wide v11, v4

    move-object v7, v6

    goto :goto_2

    :cond_4
    invoke-static {v0}, Llf/t;->b(Ljava/lang/Object;)V

    .line 2
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v0, "Configuring session..."

    .line 3
    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v6, "android.permission.CAMERA"

    invoke-static {v0, v6}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_23

    .line 5
    iget-object v0, v1, Lcom/mrousavy/camera/CameraView;->l:Ljava/lang/String;

    if-eqz v0, :cond_22

    .line 6
    iget-object v0, v1, Lcom/mrousavy/camera/CameraView;->t:Lcom/facebook/react/bridge/ReadableMap;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const-string v6, "Configuring session with Camera ID "

    if-eqz v0, :cond_5

    .line 7
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/mrousavy/camera/CameraView;->l:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " and custom format..."

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 8
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/mrousavy/camera/CameraView;->l:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " and default format options..."

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    :goto_1
    invoke-direct/range {p0 .. p0}, Lcom/mrousavy/camera/CameraView;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    invoke-static {v0}, Landroidx/camera/lifecycle/e;->g(Landroid/content/Context;)Lfc/b;

    move-result-object v0

    const-string v6, "getInstance(reactContext)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    iput-wide v4, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    iput v9, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    invoke-static {v0, v2}, Lui/a;->b(Lfc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    return-object v3

    :cond_6
    move-object v7, v1

    move-wide v11, v4

    .line 10
    :goto_2
    move-object v10, v0

    check-cast v10, Landroidx/camera/lifecycle/e;

    .line 11
    new-instance v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v0, Landroidx/camera/core/t$a;

    invoke-direct {v0}, Landroidx/camera/core/t$a;-><init>()V

    iget-object v4, v7, Lcom/mrousavy/camera/CameraView;->l:Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-static {v0, v4}, Lse/e;->b(Landroidx/camera/core/t$a;Ljava/lang/String;)Landroidx/camera/core/t$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/t$a;->b()Landroidx/camera/core/t;

    move-result-object v0

    const-string v4, "Builder().byID(cameraId!!).build()"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 12
    new-instance v5, Lcom/mrousavy/camera/CameraView$e;

    const/4 v4, 0x0

    invoke-direct {v5, v7, v10, v6, v4}, Lcom/mrousavy/camera/CameraView$e;-><init>(Lcom/mrousavy/camera/CameraView;Landroidx/camera/lifecycle/e;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    .line 13
    new-instance v0, Landroidx/camera/core/a2$b;

    invoke-direct {v0}, Landroidx/camera/core/a2$b;-><init>()V

    .line 14
    invoke-direct {v7}, Lcom/mrousavy/camera/CameraView;->getInputRotation()I

    move-result v4

    invoke-virtual {v0, v4}, Landroidx/camera/core/a2$b;->p(I)Landroidx/camera/core/a2$b;

    move-result-object v15

    const-string v0, "Builder()\n        .setTa\u2026etRotation(inputRotation)"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v0, Landroidx/camera/core/g1$e;

    invoke-direct {v0}, Landroidx/camera/core/g1$e;-><init>()V

    .line 16
    invoke-direct {v7}, Lcom/mrousavy/camera/CameraView;->getOutputRotation()I

    move-result v4

    invoke-virtual {v0, v4}, Landroidx/camera/core/g1$e;->r(I)Landroidx/camera/core/g1$e;

    move-result-object v0

    .line 17
    invoke-virtual {v0, v9}, Landroidx/camera/core/g1$e;->i(I)Landroidx/camera/core/g1$e;

    move-result-object v14

    const-string v0, "Builder()\n        .setTa\u2026RE_MODE_MINIMIZE_LATENCY)"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Li0/o0$h;

    invoke-direct {v0}, Li0/o0$h;-><init>()V

    .line 19
    iget-object v4, v7, Lcom/mrousavy/camera/CameraView;->G:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {v0, v4}, Li0/o0$h;->d(Ljava/util/concurrent/Executor;)Li0/o0$h;

    move-result-object v13

    const-string v0, "Builder()\n        .setExecutor(cameraExecutor)"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Landroidx/camera/core/m0$c;

    invoke-direct {v0}, Landroidx/camera/core/m0$c;-><init>()V

    .line 21
    invoke-direct {v7}, Lcom/mrousavy/camera/CameraView;->getOutputRotation()I

    move-result v4

    invoke-virtual {v0, v4}, Landroidx/camera/core/m0$c;->p(I)Landroidx/camera/core/m0$c;

    move-result-object v0

    const/4 v4, 0x0

    .line 22
    invoke-virtual {v0, v4}, Landroidx/camera/core/m0$c;->i(I)Landroidx/camera/core/m0$c;

    move-result-object v0

    .line 23
    iget-object v4, v7, Lcom/mrousavy/camera/CameraView;->k:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {v0, v4}, Landroidx/camera/core/m0$c;->h(Ljava/util/concurrent/Executor;)Landroidx/camera/core/m0$c;

    move-result-object v4

    const-string v0, "Builder()\n        .setTa\u2026tor(frameProcessorThread)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->t:Lcom/facebook/react/bridge/ReadableMap;

    if-nez v0, :cond_7

    const-string v0, "No custom format has been set, CameraX will automatically determine best configuration..."

    .line 25
    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->F:Landroidx/camera/view/l;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget-object v2, v7, Lcom/mrousavy/camera/CameraView;->F:Landroidx/camera/view/l;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-static {v0, v2}, Lse/a;->a(II)I

    move-result v0

    .line 27
    invoke-virtual {v15, v0}, Landroidx/camera/core/a2$b;->l(I)Landroidx/camera/core/a2$b;

    .line 28
    invoke-virtual {v14, v0}, Landroidx/camera/core/g1$e;->n(I)Landroidx/camera/core/g1$e;

    .line 29
    invoke-virtual {v4, v0}, Landroidx/camera/core/m0$c;->l(I)Landroidx/camera/core/m0$c;

    move-object/from16 v17, v8

    const/4 v1, 0x0

    goto/16 :goto_10

    .line 30
    :cond_7
    new-instance v9, Lse/h;

    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-direct {v9, v0}, Lse/h;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Using custom format - photo: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Lse/h;->b()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", video: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Lse/h;->c()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " @ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v7, Lcom/mrousavy/camera/CameraView;->u:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " FPS"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->q:Ljava/lang/Boolean;

    move-object/from16 v16, v3

    const/4 v1, 0x1

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 33
    invoke-virtual {v9}, Lse/h;->c()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v15, v0}, Landroidx/camera/core/a2$b;->o(Landroid/util/Size;)Landroidx/camera/core/a2$b;

    goto :goto_3

    .line 34
    :cond_8
    invoke-virtual {v9}, Lse/h;->b()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v15, v0}, Landroidx/camera/core/a2$b;->o(Landroid/util/Size;)Landroidx/camera/core/a2$b;

    .line 35
    :goto_3
    invoke-virtual {v9}, Lse/h;->b()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v14, v0}, Landroidx/camera/core/g1$e;->q(Landroid/util/Size;)Landroidx/camera/core/g1$e;

    .line 36
    invoke-virtual {v9}, Lse/h;->b()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroidx/camera/core/m0$c;->o(Landroid/util/Size;)Landroidx/camera/core/m0$c;

    .line 37
    invoke-virtual {v9}, Lse/h;->c()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {v9}, Lse/h;->c()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ltz v0, :cond_9

    const/16 v1, 0x1e1

    if-ge v0, v1, :cond_9

    const/4 v1, 0x1

    goto :goto_4

    :cond_9
    const/4 v1, 0x0

    :goto_4
    if-eqz v1, :cond_a

    .line 38
    sget-object v0, Li0/v;->a:Li0/v;

    invoke-static {v0}, Li0/w;->d(Li0/v;)Li0/w;

    move-result-object v0

    invoke-virtual {v13, v0}, Li0/o0$h;->e(Li0/w;)Li0/o0$h;

    goto/16 :goto_9

    :cond_a
    const/16 v1, 0x1e0

    if-gt v1, v0, :cond_b

    const/16 v1, 0x2d1

    if-ge v0, v1, :cond_b

    const/4 v1, 0x1

    goto :goto_5

    :cond_b
    const/4 v1, 0x0

    :goto_5
    if-eqz v1, :cond_c

    .line 39
    sget-object v0, Li0/v;->b:Li0/v;

    invoke-static {v0}, Li0/n;->b(Li0/v;)Li0/n;

    move-result-object v1

    invoke-static {v0, v1}, Li0/w;->e(Li0/v;Li0/n;)Li0/w;

    move-result-object v0

    invoke-virtual {v13, v0}, Li0/o0$h;->e(Li0/w;)Li0/o0$h;

    goto :goto_9

    :cond_c
    const/16 v1, 0x2d0

    if-gt v1, v0, :cond_d

    const/16 v1, 0x439

    if-ge v0, v1, :cond_d

    const/4 v1, 0x1

    goto :goto_6

    :cond_d
    const/4 v1, 0x0

    :goto_6
    if-eqz v1, :cond_e

    .line 40
    sget-object v0, Li0/v;->c:Li0/v;

    invoke-static {v0}, Li0/n;->b(Li0/v;)Li0/n;

    move-result-object v1

    invoke-static {v0, v1}, Li0/w;->e(Li0/v;Li0/n;)Li0/w;

    move-result-object v0

    invoke-virtual {v13, v0}, Li0/o0$h;->e(Li0/w;)Li0/o0$h;

    goto :goto_9

    :cond_e
    const/16 v1, 0x438

    if-gt v1, v0, :cond_f

    const/16 v1, 0x871

    if-ge v0, v1, :cond_f

    const/4 v1, 0x1

    goto :goto_7

    :cond_f
    const/4 v1, 0x0

    :goto_7
    if-eqz v1, :cond_10

    .line 41
    sget-object v0, Li0/v;->d:Li0/v;

    invoke-static {v0}, Li0/n;->b(Li0/v;)Li0/n;

    move-result-object v1

    invoke-static {v0, v1}, Li0/w;->e(Li0/v;Li0/n;)Li0/w;

    move-result-object v0

    invoke-virtual {v13, v0}, Li0/o0$h;->e(Li0/w;)Li0/o0$h;

    goto :goto_9

    :cond_10
    const/16 v1, 0x870

    if-gt v1, v0, :cond_11

    const/16 v1, 0x10e1

    if-ge v0, v1, :cond_11

    const/4 v0, 0x1

    goto :goto_8

    :cond_11
    const/4 v0, 0x0

    :goto_8
    if-eqz v0, :cond_12

    .line 42
    sget-object v0, Li0/v;->f:Li0/v;

    invoke-static {v0}, Li0/n;->b(Li0/v;)Li0/n;

    move-result-object v1

    invoke-static {v0, v1}, Li0/w;->e(Li0/v;Li0/n;)Li0/w;

    move-result-object v0

    invoke-virtual {v13, v0}, Li0/o0$h;->e(Li0/w;)Li0/o0$h;

    .line 43
    :cond_12
    :goto_9
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->u:Ljava/lang/Integer;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 44
    invoke-virtual {v9}, Lse/h;->a()Ljava/util/List;

    move-result-object v1

    .line 45
    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_14

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_14

    :cond_13
    const/4 v1, 0x0

    goto :goto_a

    .line 46
    :cond_14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Range;

    .line 47
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v3, v9}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v3

    if-eqz v3, :cond_15

    const/4 v1, 0x1

    :goto_a
    if-eqz v1, :cond_16

    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    move-wide/from16 v19, v11

    int-to-double v11, v0

    div-double v11, v17, v11

    double-to-long v11, v11

    const v1, 0x3b9aca00

    move-object v9, v4

    int-to-long v3, v1

    mul-long/2addr v11, v3

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Setting AE_TARGET_FPS_RANGE to "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x2d

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", and SENSOR_FRAME_DURATION to "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    new-instance v1, Lv/i;

    invoke-direct {v1, v15}, Lv/i;-><init>(Landroidx/camera/core/f0;)V

    .line 50
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    new-instance v4, Landroid/util/Range;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-object/from16 v17, v8

    :try_start_5
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v4, v8, v0}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    invoke-virtual {v1, v3, v4}, Lv/i;->a(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lv/i;

    move-result-object v0

    .line 51
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->SENSOR_FRAME_DURATION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v11, v12}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lv/i;->a(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lv/i;

    goto :goto_b

    :cond_16
    move-object/from16 v17, v8

    .line 52
    new-instance v1, Lcom/mrousavy/camera/t;

    invoke-direct {v1, v0}, Lcom/mrousavy/camera/t;-><init>(I)V

    throw v1

    :cond_17
    move-object v9, v4

    move-object/from16 v17, v8

    move-wide/from16 v19, v11

    .line 53
    :goto_b
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->v:Ljava/lang/Boolean;

    const/4 v1, 0x1

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    const/4 v1, 0x2

    .line 54
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v7, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    iput-object v10, v2, Lcom/mrousavy/camera/CameraView$d;->l:Ljava/lang/Object;

    iput-object v6, v2, Lcom/mrousavy/camera/CameraView$d;->m:Ljava/lang/Object;

    iput-object v5, v2, Lcom/mrousavy/camera/CameraView$d;->n:Ljava/lang/Object;

    iput-object v15, v2, Lcom/mrousavy/camera/CameraView$d;->o:Ljava/lang/Object;

    iput-object v14, v2, Lcom/mrousavy/camera/CameraView$d;->p:Ljava/lang/Object;

    iput-object v13, v2, Lcom/mrousavy/camera/CameraView$d;->q:Ljava/lang/Object;

    iput-object v9, v2, Lcom/mrousavy/camera/CameraView$d;->r:Ljava/lang/Object;

    move-wide/from16 v3, v19

    iput-wide v3, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    const/4 v1, 0x2

    iput v1, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    invoke-interface {v5, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v16

    if-ne v0, v1, :cond_18

    return-object v1

    :cond_18
    move-wide v11, v3

    move-object v4, v9

    :goto_c
    move-object v9, v4

    move-wide v3, v11

    :goto_d
    move-object v11, v13

    move-object v12, v14

    move-object v13, v15

    move-object v14, v6

    move-object v15, v10

    goto :goto_e

    :cond_19
    move-object/from16 v1, v16

    move-wide/from16 v3, v19

    goto :goto_d

    .line 55
    :goto_e
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->x:Ljava/lang/Boolean;

    const/4 v6, 0x1

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    const/4 v0, 0x3

    .line 56
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v7, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    iput-object v15, v2, Lcom/mrousavy/camera/CameraView$d;->l:Ljava/lang/Object;

    iput-object v14, v2, Lcom/mrousavy/camera/CameraView$d;->m:Ljava/lang/Object;

    iput-object v13, v2, Lcom/mrousavy/camera/CameraView$d;->n:Ljava/lang/Object;

    iput-object v12, v2, Lcom/mrousavy/camera/CameraView$d;->o:Ljava/lang/Object;

    iput-object v11, v2, Lcom/mrousavy/camera/CameraView$d;->p:Ljava/lang/Object;

    iput-object v9, v2, Lcom/mrousavy/camera/CameraView$d;->q:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v2, Lcom/mrousavy/camera/CameraView$d;->r:Ljava/lang/Object;

    iput-wide v3, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    const/4 v0, 0x3

    iput v0, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    invoke-interface {v5, v6, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_1a

    return-object v1

    :cond_1a
    move-object v2, v7

    move-object v5, v9

    :goto_f
    move-object v7, v2

    move-object v6, v14

    move-object v10, v15

    const/4 v1, 0x0

    move-object v14, v12

    move-object v15, v13

    move-object v13, v11

    move-wide v11, v3

    move-object v4, v5

    goto :goto_10

    :cond_1b
    move-object v6, v14

    move-object v10, v15

    const/4 v1, 0x0

    move-object v14, v12

    move-object v15, v13

    move-object v13, v11

    move-wide v11, v3

    move-object v4, v9

    .line 57
    :goto_10
    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->M:Li0/c1;

    .line 58
    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->L:Landroidx/camera/core/g1;

    .line 59
    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->N:Landroidx/camera/core/m0;

    .line 60
    invoke-virtual {v10}, Landroidx/camera/lifecycle/e;->n()V

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    iget-object v1, v7, Lcom/mrousavy/camera/CameraView;->q:Ljava/lang/Boolean;

    const/4 v2, 0x1

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    const-string v1, "Adding VideoCapture use-case..."
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v2, v17

    .line 63
    :try_start_6
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    invoke-virtual {v13}, Li0/o0$h;->b()Li0/o0;

    move-result-object v1

    const-string v3, "videoRecorderBuilder.build()"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-static {v1}, Li0/c1;->Z(Li0/h1;)Li0/c1;

    move-result-object v1

    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->M:Li0/c1;

    .line 66
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-direct {v7}, Lcom/mrousavy/camera/CameraView;->getOutputRotation()I

    move-result v3

    invoke-virtual {v1, v3}, Li0/c1;->X(I)V

    .line 67
    iget-object v1, v7, Lcom/mrousavy/camera/CameraView;->M:Li0/c1;

    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_1c
    move-object/from16 v2, v17

    .line 68
    :goto_11
    iget-object v1, v7, Lcom/mrousavy/camera/CameraView;->p:Ljava/lang/Boolean;

    const/4 v3, 0x1

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1e

    .line 69
    invoke-virtual {v7}, Lcom/mrousavy/camera/CameraView;->getFallbackToSnapshot$react_native_vision_camera_release()Z

    move-result v1

    if-eqz v1, :cond_1d

    const-string v1, "Tried to add photo use-case (`photo={true}`) but the Camera device only supports a single use-case at a time. Falling back to Snapshot capture."

    .line 70
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_12

    :cond_1d
    const-string v1, "Adding ImageCapture use-case..."

    .line 71
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    invoke-virtual {v14}, Landroidx/camera/core/g1$e;->e()Landroidx/camera/core/g1;

    move-result-object v1

    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->L:Landroidx/camera/core/g1;

    .line 73
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    :cond_1e
    :goto_12
    iget-boolean v1, v7, Lcom/mrousavy/camera/CameraView;->s:Z

    if-eqz v1, :cond_1f

    const-string v1, "Adding ImageAnalysis use-case..."

    .line 75
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    invoke-virtual {v4}, Landroidx/camera/core/m0$c;->e()Landroidx/camera/core/m0;

    move-result-object v1

    .line 77
    iget-object v3, v7, Lcom/mrousavy/camera/CameraView;->G:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lcom/mrousavy/camera/h;

    invoke-direct {v4, v7}, Lcom/mrousavy/camera/h;-><init>(Lcom/mrousavy/camera/CameraView;)V

    invoke-virtual {v1, v3, v4}, Landroidx/camera/core/m0;->Y(Ljava/util/concurrent/Executor;Landroidx/camera/core/m0$a;)V

    .line 78
    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->N:Landroidx/camera/core/m0;

    .line 79
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    :cond_1f
    invoke-virtual {v15}, Landroidx/camera/core/a2$b;->e()Landroidx/camera/core/a2;

    move-result-object v1

    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->O:Landroidx/camera/core/a2;

    .line 81
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attaching "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " use-cases..."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    iget-object v1, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/t;

    new-instance v3, Lkotlin/jvm/internal/j0;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lkotlin/jvm/internal/j0;-><init>(I)V

    iget-object v4, v7, Lcom/mrousavy/camera/CameraView;->O:Landroidx/camera/core/a2;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/j0;->a(Ljava/lang/Object;)V

    const/4 v4, 0x0

    new-array v5, v4, [Landroidx/camera/core/w2;

    .line 83
    invoke-interface {v0, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    .line 84
    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/j0;->b(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lkotlin/jvm/internal/j0;->c()I

    move-result v0

    new-array v0, v0, [Landroidx/camera/core/w2;

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/j0;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/w2;

    invoke-virtual {v10, v7, v1, v0}, Landroidx/camera/lifecycle/e;->f(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/t;[Landroidx/camera/core/w2;)Landroidx/camera/core/k;

    move-result-object v0

    iput-object v0, v7, Lcom/mrousavy/camera/CameraView;->K:Landroidx/camera/core/k;

    .line 85
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->O:Landroidx/camera/core/a2;

    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    iget-object v1, v7, Lcom/mrousavy/camera/CameraView;->F:Landroidx/camera/view/l;

    invoke-virtual {v1}, Landroidx/camera/view/l;->getSurfaceProvider()Landroidx/camera/core/a2$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/a2;->T(Landroidx/camera/core/a2$d;)V

    .line 86
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->K:Landroidx/camera/core/k;

    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-interface {v0}, Landroidx/camera/core/k;->a()Landroidx/camera/core/r;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/r;->i()Landroidx/lifecycle/LiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/d3;

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_20

    invoke-interface {v0}, Landroidx/camera/core/d3;->c()F

    move-result v0

    goto :goto_13

    :cond_20
    move v0, v1

    :goto_13
    iput v0, v7, Lcom/mrousavy/camera/CameraView;->a0:F

    .line 87
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->K:Landroidx/camera/core/k;

    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-interface {v0}, Landroidx/camera/core/k;->a()Landroidx/camera/core/r;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/r;->i()Landroidx/lifecycle/LiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/d3;

    if-eqz v0, :cond_21

    invoke-interface {v0}, Landroidx/camera/core/d3;->a()F

    move-result v1

    :cond_21
    iput v1, v7, Lcom/mrousavy/camera/CameraView;->b0:F

    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v11

    const-string v3, "CameraView.performance"

    .line 89
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Session configured in "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms! Camera: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->K:Landroidx/camera/core/k;

    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    invoke-static {v7}, Lcom/mrousavy/camera/m;->d(Lcom/mrousavy/camera/CameraView;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 91
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :catchall_0
    move-exception v0

    move-object/from16 v2, v17

    goto :goto_14

    :cond_22
    move-object v2, v8

    .line 92
    :try_start_7
    new-instance v0, Lcom/mrousavy/camera/d0;

    invoke-direct {v0}, Lcom/mrousavy/camera/d0;-><init>()V

    throw v0

    :cond_23
    move-object v2, v8

    .line 93
    new-instance v0, Lcom/mrousavy/camera/e;

    invoke-direct {v0}, Lcom/mrousavy/camera/e;-><init>()V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_14

    :catchall_2
    move-exception v0

    move-object v2, v8

    .line 94
    :goto_14
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to configure session: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    instance-of v1, v0, Lcom/mrousavy/camera/a;

    if-nez v1, :cond_28

    .line 96
    instance-of v1, v0, Ljava/lang/IllegalArgumentException;

    if-eqz v1, :cond_27

    .line 97
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_24

    const-string v2, "too many use cases"

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v3, v4}, Lpi/l;->M(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_25

    move v9, v2

    goto :goto_15

    :cond_24
    const/4 v5, 0x0

    :cond_25
    move v9, v5

    :goto_15
    if-eqz v9, :cond_26

    .line 98
    new-instance v1, Lcom/mrousavy/camera/g0;

    invoke-direct {v1, v0}, Lcom/mrousavy/camera/g0;-><init>(Ljava/lang/Throwable;)V

    goto :goto_16

    .line 99
    :cond_26
    new-instance v1, Lcom/mrousavy/camera/x;

    invoke-direct {v1, v0}, Lcom/mrousavy/camera/x;-><init>(Ljava/lang/Throwable;)V

    goto :goto_16

    .line 100
    :cond_27
    new-instance v1, Lcom/mrousavy/camera/j0;

    invoke-direct {v1, v0}, Lcom/mrousavy/camera/j0;-><init>(Ljava/lang/Throwable;)V

    :goto_16
    move-object v0, v1

    :cond_28
    throw v0
.end method

.method private static final r(Lcom/mrousavy/camera/CameraView;Landroidx/camera/core/ImageProxy;)V
    .locals 6

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "image"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-wide v2, p0, Lcom/mrousavy/camera/CameraView;->c0:D

    .line 16
    .line 17
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 18
    .line 19
    div-double/2addr v4, v2

    .line 20
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    mul-double/2addr v4, v2

    .line 26
    iget-wide v2, p0, Lcom/mrousavy/camera/CameraView;->Q:J

    .line 27
    .line 28
    sub-long v2, v0, v2

    .line 29
    .line 30
    long-to-double v2, v2

    .line 31
    cmpl-double v2, v2, v4

    .line 32
    .line 33
    if-lez v2, :cond_0

    .line 34
    .line 35
    iput-wide v0, p0, Lcom/mrousavy/camera/CameraView;->Q:J

    .line 36
    .line 37
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->d0:Lcom/mrousavy/camera/frameprocessor/a;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/mrousavy/camera/frameprocessor/a;->d()Lcom/mrousavy/camera/frameprocessor/c;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {p0, p1}, Lcom/mrousavy/camera/CameraView;->frameProcessorCallback(Landroidx/camera/core/ImageProxy;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/mrousavy/camera/frameprocessor/c;->a()Lkotlin/jvm/functions/Function0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->u()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->s()V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method private final s()V
    .locals 9

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/mrousavy/camera/CameraView;->f0:J

    .line 6
    .line 7
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->d0:Lcom/mrousavy/camera/frameprocessor/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/mrousavy/camera/frameprocessor/a;->f()D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 14
    .line 15
    div-double/2addr v2, v0

    .line 16
    const/16 v0, 0x1e

    .line 17
    .line 18
    int-to-double v0, v0

    .line 19
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iget-wide v2, p0, Lcom/mrousavy/camera/CameraView;->D:D

    .line 28
    .line 29
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    .line 30
    .line 31
    cmpg-double v4, v2, v4

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    move v4, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v4, v6

    .line 40
    :goto_0
    if-eqz v4, :cond_1

    .line 41
    .line 42
    iput-wide v0, p0, Lcom/mrousavy/camera/CameraView;->c0:D

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    iget-wide v7, p0, Lcom/mrousavy/camera/CameraView;->e0:D

    .line 46
    .line 47
    cmpg-double v4, v0, v7

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    move v4, v5

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move v4, v6

    .line 54
    :goto_1
    if-nez v4, :cond_4

    .line 55
    .line 56
    cmpg-double v4, v0, v2

    .line 57
    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move v5, v6

    .line 62
    :goto_2
    if-nez v5, :cond_4

    .line 63
    .line 64
    invoke-static {p0, v2, v3, v0, v1}, Lcom/mrousavy/camera/m;->c(Lcom/mrousavy/camera/CameraView;DD)V

    .line 65
    .line 66
    .line 67
    iput-wide v0, p0, Lcom/mrousavy/camera/CameraView;->e0:D

    .line 68
    .line 69
    :cond_4
    :goto_3
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method

.method private final u()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/mrousavy/camera/CameraView;->f0:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static final w(Lcom/mrousavy/camera/CameraView;Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$changedProps"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/mrousavy/camera/CameraView;->J:Lkotlinx/coroutines/CoroutineScope;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    new-instance v4, Lcom/mrousavy/camera/CameraView$f;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p1, p0, v0}, Lcom/mrousavy/camera/CameraView$f;-><init>(Ljava/util/ArrayList;Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method private final x()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->V:Landroidx/lifecycle/LifecycleRegistry;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LifecycleRegistry;->b()Landroidx/lifecycle/Lifecycle$State;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "lifecycleRegistry.currentState"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/mrousavy/camera/CameraView;->W:Landroidx/lifecycle/Lifecycle$State;

    .line 13
    .line 14
    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->o:Landroidx/lifecycle/Lifecycle$State;

    .line 15
    .line 16
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    iget-boolean v1, p0, Lcom/mrousavy/camera/CameraView;->y:Z

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Lcom/mrousavy/camera/CameraView;->V:Landroidx/lifecycle/LifecycleRegistry;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroidx/lifecycle/LifecycleRegistry;->o(Landroidx/lifecycle/Lifecycle$State;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v1, p0, Lcom/mrousavy/camera/CameraView;->V:Landroidx/lifecycle/LifecycleRegistry;

    .line 35
    .line 36
    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->m:Landroidx/lifecycle/Lifecycle$State;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroidx/lifecycle/LifecycleRegistry;->o(Landroidx/lifecycle/Lifecycle$State;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v2, p0, Lcom/mrousavy/camera/CameraView;->V:Landroidx/lifecycle/LifecycleRegistry;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Landroidx/lifecycle/LifecycleRegistry;->o(Landroidx/lifecycle/Lifecycle$State;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v2, "Lifecycle went from "

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, " -> "

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->V:Landroidx/lifecycle/LifecycleRegistry;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/lifecycle/LifecycleRegistry;->b()Landroidx/lifecycle/Lifecycle$State;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v0, " (isActive: "

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-boolean v0, p0, Lcom/mrousavy/camera/CameraView;->y:Z

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, " | isAttachedToWindow: "

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const/16 v0, 0x29

    .line 105
    .line 106
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const-string v1, "CameraView"

    .line 114
    .line 115
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    return-void
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method

.method private final y()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->O:Landroidx/camera/core/a2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->getInputRotation()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1}, Landroidx/camera/core/a2;->V(I)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->L:Landroidx/camera/core/g1;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->getOutputRotation()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, Landroidx/camera/core/g1;->v0(I)V

    .line 23
    .line 24
    .line 25
    :goto_1
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->M:Li0/c1;

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->getOutputRotation()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {v0, v1}, Li0/c1;->X(I)V

    .line 35
    .line 36
    .line 37
    :goto_2
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->N:Landroidx/camera/core/m0;

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->getOutputRotation()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {v0, v1}, Landroidx/camera/core/m0;->Z(I)V

    .line 47
    .line 48
    .line 49
    :goto_3
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method


# virtual methods
.method public final getActiveVideoRecording$react_native_vision_camera_release()Li0/x0;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->P:Li0/x0;

    return-object v0
.end method

.method public final getAudio()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->r:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getCamera$react_native_vision_camera_release()Landroidx/camera/core/k;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->K:Landroidx/camera/core/k;

    return-object v0
.end method

.method public final getCameraId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final getColorSpace()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final getCoroutineScope$react_native_vision_camera_release()Lkotlinx/coroutines/CoroutineScope;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->J:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final getEnableDepthData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mrousavy/camera/CameraView;->m:Z

    return v0
.end method

.method public final getEnableFrameProcessor()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mrousavy/camera/CameraView;->s:Z

    return v0
.end method

.method public final getEnableHighQualityPhotos()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->n:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getEnablePortraitEffectsMatteDelivery()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mrousavy/camera/CameraView;->o:Z

    return v0
.end method

.method public final getEnableZoomGesture()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mrousavy/camera/CameraView;->C:Z

    return v0
.end method

.method public final getFallbackToSnapshot$react_native_vision_camera_release()Z
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnsafeOptInUsageError"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->q:Ljava/lang/Boolean;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/mrousavy/camera/CameraView;->s:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->l:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v4, "camera"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    instance-of v4, v3, Landroid/hardware/camera2/CameraManager;

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    check-cast v3, Landroid/hardware/camera2/CameraManager;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v3, 0x0

    .line 39
    :goto_0
    if-eqz v3, :cond_4

    .line 40
    .line 41
    invoke-virtual {v3, v0}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v3, "cameraManger.getCameraCharacteristics(cameraId)"

    .line 46
    .line 47
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Ljava/lang/Integer;

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v4, 0x2

    .line 67
    if-ne v0, v4, :cond_3

    .line 68
    .line 69
    return v3

    .line 70
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->q:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    iget-boolean v0, p0, Lcom/mrousavy/camera/CameraView;->s:Z

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    return v3

    .line 83
    :cond_4
    return v2
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method

.method public final getFormat()Lcom/facebook/react/bridge/ReadableMap;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->t:Lcom/facebook/react/bridge/ReadableMap;

    return-object v0
.end method

.method public final getFps()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->u:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getFrameProcessorFps()D
    .locals 2

    iget-wide v0, p0, Lcom/mrousavy/camera/CameraView;->D:D

    return-wide v0
.end method

.method public final getHdr()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->v:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getImageCapture$react_native_vision_camera_release()Landroidx/camera/core/g1;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->L:Landroidx/camera/core/g1;

    return-object v0
.end method

.method public getLifecycle()Landroidx/lifecycle/Lifecycle;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->V:Landroidx/lifecycle/LifecycleRegistry;

    return-object v0
.end method

.method public final getLowLightBoost()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->x:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getOrientation()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->B:Ljava/lang/String;

    return-object v0
.end method

.method public final getPhoto()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->p:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getPreviewView$react_native_vision_camera_release()Landroidx/camera/view/l;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->F:Landroidx/camera/view/l;

    return-object v0
.end method

.method public final getRecordVideoExecutor$react_native_vision_camera_release()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->I:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public final getTakePhotoExecutor$react_native_vision_camera_release()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->H:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public final getTorch()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->z:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideo()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->q:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getVideoCapture$react_native_vision_camera_release()Li0/c1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li0/c1<",
            "Li0/o0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->M:Li0/c1;

    return-object v0
.end method

.method public final getZoom()F
    .locals 1

    iget v0, p0, Lcom/mrousavy/camera/CameraView;->A:F

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->x()V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/mrousavy/camera/CameraView;->E:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/mrousavy/camera/CameraView;->E:Z

    .line 13
    .line 14
    invoke-static {p0}, Lcom/mrousavy/camera/m;->e(Lcom/mrousavy/camera/CameraView;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object v0, Lcom/mrousavy/camera/CameraView;->h0:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/mrousavy/camera/CameraView;->v(Ljava/util/ArrayList;)Z

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->y()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/mrousavy/camera/CameraView;->x()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
.end method

.method public final setActive(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mrousavy/camera/CameraView;->y:Z

    return-void
.end method

.method public final setActiveVideoRecording$react_native_vision_camera_release(Li0/x0;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->P:Li0/x0;

    return-void
.end method

.method public final setAudio(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->r:Ljava/lang/Boolean;

    return-void
.end method

.method public final setCamera$react_native_vision_camera_release(Landroidx/camera/core/k;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->K:Landroidx/camera/core/k;

    return-void
.end method

.method public final setCameraId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->l:Ljava/lang/String;

    return-void
.end method

.method public final setColorSpace(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->w:Ljava/lang/String;

    return-void
.end method

.method public final setCoroutineScope$react_native_vision_camera_release(Lkotlinx/coroutines/CoroutineScope;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->J:Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
.end method

.method public final setEnableDepthData(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mrousavy/camera/CameraView;->m:Z

    return-void
.end method

.method public final setEnableFrameProcessor(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mrousavy/camera/CameraView;->s:Z

    return-void
.end method

.method public final setEnableHighQualityPhotos(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->n:Ljava/lang/Boolean;

    return-void
.end method

.method public final setEnablePortraitEffectsMatteDelivery(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mrousavy/camera/CameraView;->o:Z

    return-void
.end method

.method public final setEnableZoomGesture(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/mrousavy/camera/CameraView;->C:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/mrousavy/camera/CameraView;->U:Landroid/view/View$OnTouchListener;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
.end method

.method public final setFormat(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->t:Lcom/facebook/react/bridge/ReadableMap;

    return-void
.end method

.method public final setFps(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->u:Ljava/lang/Integer;

    return-void
.end method

.method public final setFrameProcessorFps(D)V
    .locals 2

    .line 1
    iput-wide p1, p0, Lcom/mrousavy/camera/CameraView;->D:D

    .line 2
    .line 3
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 4
    .line 5
    cmpg-double v0, p1, v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-wide/high16 p1, 0x403e000000000000L    # 30.0

    .line 15
    .line 16
    :cond_1
    iput-wide p1, p0, Lcom/mrousavy/camera/CameraView;->c0:D

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    iput-wide p1, p0, Lcom/mrousavy/camera/CameraView;->f0:J

    .line 23
    .line 24
    iget-object p1, p0, Lcom/mrousavy/camera/CameraView;->d0:Lcom/mrousavy/camera/frameprocessor/a;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/mrousavy/camera/frameprocessor/a;->e()V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
.end method

.method public final setHdr(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->v:Ljava/lang/Boolean;

    return-void
.end method

.method public final setImageCapture$react_native_vision_camera_release(Landroidx/camera/core/g1;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->L:Landroidx/camera/core/g1;

    return-void
.end method

.method public final setLowLightBoost(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->x:Ljava/lang/Boolean;

    return-void
.end method

.method public final setOrientation(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->B:Ljava/lang/String;

    return-void
.end method

.method public final setPhoto(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->p:Ljava/lang/Boolean;

    return-void
.end method

.method public final setTorch(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->z:Ljava/lang/String;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
.end method

.method public final setVideo(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->q:Ljava/lang/Boolean;

    return-void
.end method

.method public final setVideoCapture$react_native_vision_camera_release(Li0/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li0/c1<",
            "Li0/o0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView;->M:Li0/c1;

    return-void
.end method

.method public final setZoom(F)V
    .locals 0

    iput p1, p0, Lcom/mrousavy/camera/CameraView;->A:F

    return-void
.end method

.method public final t()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mrousavy/camera/CameraView;->y:Z

    return v0
.end method

.method public final v(Ljava/util/ArrayList;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "changedProps"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView;->F:Landroidx/camera/view/l;

    .line 7
    .line 8
    new-instance v1, Lcom/mrousavy/camera/g;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lcom/mrousavy/camera/g;-><init>(Lcom/mrousavy/camera/CameraView;Ljava/util/ArrayList;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
.end method
