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

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Lcom/mrousavy/camera/CameraView$d;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/mrousavy/camera/CameraView$d;

    .line 11
    .line 12
    iget v3, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/mrousavy/camera/CameraView$d;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/mrousavy/camera/CameraView$d;-><init>(Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/mrousavy/camera/CameraView$d;->t:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const-string v8, "CameraView"

    .line 40
    .line 41
    const/4 v9, 0x1

    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    if-eq v4, v9, :cond_3

    .line 45
    .line 46
    if-eq v4, v6, :cond_2

    .line 47
    .line 48
    if-ne v4, v5, :cond_1

    .line 49
    .line 50
    iget-wide v3, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    .line 51
    .line 52
    iget-object v5, v2, Lcom/mrousavy/camera/CameraView$d;->q:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroidx/camera/core/m0$c;

    .line 55
    .line 56
    iget-object v11, v2, Lcom/mrousavy/camera/CameraView$d;->p:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v11, Li0/o0$h;

    .line 59
    .line 60
    iget-object v12, v2, Lcom/mrousavy/camera/CameraView$d;->o:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v12, Landroidx/camera/core/g1$e;

    .line 63
    .line 64
    iget-object v13, v2, Lcom/mrousavy/camera/CameraView$d;->n:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v13, Landroidx/camera/core/a2$b;

    .line 67
    .line 68
    iget-object v14, v2, Lcom/mrousavy/camera/CameraView$d;->m:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v14, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 71
    .line 72
    iget-object v15, v2, Lcom/mrousavy/camera/CameraView$d;->l:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v15, Landroidx/camera/lifecycle/e;

    .line 75
    .line 76
    iget-object v2, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Lcom/mrousavy/camera/CameraView;

    .line 79
    .line 80
    :try_start_0
    invoke-static {v0}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 81
    .line 82
    .line 83
    move-object/from16 v17, v8

    .line 84
    .line 85
    goto/16 :goto_f

    .line 86
    .line 87
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 90
    .line 91
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_2
    iget-wide v11, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    .line 96
    .line 97
    iget-object v4, v2, Lcom/mrousavy/camera/CameraView$d;->r:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v4, Landroidx/camera/core/m0$c;

    .line 100
    .line 101
    iget-object v13, v2, Lcom/mrousavy/camera/CameraView$d;->q:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v13, Li0/o0$h;

    .line 104
    .line 105
    iget-object v14, v2, Lcom/mrousavy/camera/CameraView$d;->p:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v14, Landroidx/camera/core/g1$e;

    .line 108
    .line 109
    iget-object v15, v2, Lcom/mrousavy/camera/CameraView$d;->o:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v15, Landroidx/camera/core/a2$b;

    .line 112
    .line 113
    iget-object v5, v2, Lcom/mrousavy/camera/CameraView$d;->n:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 116
    .line 117
    iget-object v6, v2, Lcom/mrousavy/camera/CameraView$d;->m:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 120
    .line 121
    iget-object v10, v2, Lcom/mrousavy/camera/CameraView$d;->l:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v10, Landroidx/camera/lifecycle/e;

    .line 124
    .line 125
    iget-object v7, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v7, Lcom/mrousavy/camera/CameraView;

    .line 128
    .line 129
    :try_start_1
    invoke-static {v0}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 130
    .line 131
    .line 132
    move-object v1, v3

    .line 133
    move-object/from16 v17, v8

    .line 134
    .line 135
    goto/16 :goto_c

    .line 136
    .line 137
    :cond_3
    iget-wide v4, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    .line 138
    .line 139
    iget-object v6, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v6, Lcom/mrousavy/camera/CameraView;

    .line 142
    .line 143
    :try_start_2
    invoke-static {v0}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 144
    .line 145
    .line 146
    move-wide v11, v4

    .line 147
    move-object v7, v6

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    invoke-static {v0}, Llf/t;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 153
    .line 154
    .line 155
    move-result-wide v4

    .line 156
    const-string v0, "Configuring session..."

    .line 157
    .line 158
    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    const-string v6, "android.permission.CAMERA"

    .line 166
    .line 167
    invoke-static {v0, v6}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-nez v0, :cond_23

    .line 172
    .line 173
    iget-object v0, v1, Lcom/mrousavy/camera/CameraView;->l:Ljava/lang/String;

    .line 174
    .line 175
    if-eqz v0, :cond_22

    .line 176
    .line 177
    iget-object v0, v1, Lcom/mrousavy/camera/CameraView;->t:Lcom/facebook/react/bridge/ReadableMap;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 178
    .line 179
    const-string v6, "Configuring session with Camera ID "

    .line 180
    .line 181
    if-eqz v0, :cond_5

    .line 182
    .line 183
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    iget-object v6, v1, Lcom/mrousavy/camera/CameraView;->l:Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v6, " and custom format..."

    .line 197
    .line 198
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    iget-object v6, v1, Lcom/mrousavy/camera/CameraView;->l:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string v6, " and default format options..."

    .line 223
    .line 224
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    .line 233
    .line 234
    :goto_1
    invoke-direct/range {p0 .. p0}, Lcom/mrousavy/camera/CameraView;->getReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v0}, Landroidx/camera/lifecycle/e;->g(Landroid/content/Context;)Lfc/b;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    const-string v6, "getInstance(reactContext)"

    .line 243
    .line 244
    invoke-static {v0, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iput-object v1, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    .line 248
    .line 249
    iput-wide v4, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    .line 250
    .line 251
    iput v9, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    .line 252
    .line 253
    invoke-static {v0, v2}, Lui/a;->b(Lfc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    if-ne v0, v3, :cond_6

    .line 258
    .line 259
    return-object v3

    .line 260
    :cond_6
    move-object v7, v1

    .line 261
    move-wide v11, v4

    .line 262
    :goto_2
    move-object v10, v0

    .line 263
    check-cast v10, Landroidx/camera/lifecycle/e;

    .line 264
    .line 265
    new-instance v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 266
    .line 267
    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 268
    .line 269
    .line 270
    new-instance v0, Landroidx/camera/core/t$a;

    .line 271
    .line 272
    invoke-direct {v0}, Landroidx/camera/core/t$a;-><init>()V

    .line 273
    .line 274
    .line 275
    iget-object v4, v7, Lcom/mrousavy/camera/CameraView;->l:Ljava/lang/String;

    .line 276
    .line 277
    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    invoke-static {v0, v4}, Lse/e;->b(Landroidx/camera/core/t$a;Ljava/lang/String;)Landroidx/camera/core/t$a;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0}, Landroidx/camera/core/t$a;->b()Landroidx/camera/core/t;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    const-string v4, "Builder().byID(cameraId!!).build()"

    .line 289
    .line 290
    invoke-static {v0, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    iput-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 294
    .line 295
    new-instance v5, Lcom/mrousavy/camera/CameraView$e;

    .line 296
    .line 297
    const/4 v4, 0x0

    .line 298
    invoke-direct {v5, v7, v10, v6, v4}, Lcom/mrousavy/camera/CameraView$e;-><init>(Lcom/mrousavy/camera/CameraView;Landroidx/camera/lifecycle/e;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    .line 299
    .line 300
    .line 301
    new-instance v0, Landroidx/camera/core/a2$b;

    .line 302
    .line 303
    invoke-direct {v0}, Landroidx/camera/core/a2$b;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-direct {v7}, Lcom/mrousavy/camera/CameraView;->getInputRotation()I

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    invoke-virtual {v0, v4}, Landroidx/camera/core/a2$b;->p(I)Landroidx/camera/core/a2$b;

    .line 311
    .line 312
    .line 313
    move-result-object v15

    .line 314
    const-string v0, "Builder()\n        .setTa\u2026etRotation(inputRotation)"

    .line 315
    .line 316
    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    new-instance v0, Landroidx/camera/core/g1$e;

    .line 320
    .line 321
    invoke-direct {v0}, Landroidx/camera/core/g1$e;-><init>()V

    .line 322
    .line 323
    .line 324
    invoke-direct {v7}, Lcom/mrousavy/camera/CameraView;->getOutputRotation()I

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    invoke-virtual {v0, v4}, Landroidx/camera/core/g1$e;->r(I)Landroidx/camera/core/g1$e;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v0, v9}, Landroidx/camera/core/g1$e;->i(I)Landroidx/camera/core/g1$e;

    .line 333
    .line 334
    .line 335
    move-result-object v14

    .line 336
    const-string v0, "Builder()\n        .setTa\u2026RE_MODE_MINIMIZE_LATENCY)"

    .line 337
    .line 338
    invoke-static {v14, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    new-instance v0, Li0/o0$h;

    .line 342
    .line 343
    invoke-direct {v0}, Li0/o0$h;-><init>()V

    .line 344
    .line 345
    .line 346
    iget-object v4, v7, Lcom/mrousavy/camera/CameraView;->G:Ljava/util/concurrent/ExecutorService;

    .line 347
    .line 348
    invoke-virtual {v0, v4}, Li0/o0$h;->d(Ljava/util/concurrent/Executor;)Li0/o0$h;

    .line 349
    .line 350
    .line 351
    move-result-object v13

    .line 352
    const-string v0, "Builder()\n        .setExecutor(cameraExecutor)"

    .line 353
    .line 354
    invoke-static {v13, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    new-instance v0, Landroidx/camera/core/m0$c;

    .line 358
    .line 359
    invoke-direct {v0}, Landroidx/camera/core/m0$c;-><init>()V

    .line 360
    .line 361
    .line 362
    invoke-direct {v7}, Lcom/mrousavy/camera/CameraView;->getOutputRotation()I

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    invoke-virtual {v0, v4}, Landroidx/camera/core/m0$c;->p(I)Landroidx/camera/core/m0$c;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    const/4 v4, 0x0

    .line 371
    invoke-virtual {v0, v4}, Landroidx/camera/core/m0$c;->i(I)Landroidx/camera/core/m0$c;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    iget-object v4, v7, Lcom/mrousavy/camera/CameraView;->k:Ljava/util/concurrent/ExecutorService;

    .line 376
    .line 377
    invoke-virtual {v0, v4}, Landroidx/camera/core/m0$c;->h(Ljava/util/concurrent/Executor;)Landroidx/camera/core/m0$c;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    const-string v0, "Builder()\n        .setTa\u2026tor(frameProcessorThread)"

    .line 382
    .line 383
    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->t:Lcom/facebook/react/bridge/ReadableMap;

    .line 387
    .line 388
    if-nez v0, :cond_7

    .line 389
    .line 390
    const-string v0, "No custom format has been set, CameraX will automatically determine best configuration..."

    .line 391
    .line 392
    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 393
    .line 394
    .line 395
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->F:Landroidx/camera/view/l;

    .line 396
    .line 397
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    iget-object v2, v7, Lcom/mrousavy/camera/CameraView;->F:Landroidx/camera/view/l;

    .line 402
    .line 403
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    invoke-static {v0, v2}, Lse/a;->a(II)I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    invoke-virtual {v15, v0}, Landroidx/camera/core/a2$b;->l(I)Landroidx/camera/core/a2$b;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v14, v0}, Landroidx/camera/core/g1$e;->n(I)Landroidx/camera/core/g1$e;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v4, v0}, Landroidx/camera/core/m0$c;->l(I)Landroidx/camera/core/m0$c;

    .line 418
    .line 419
    .line 420
    move-object/from16 v17, v8

    .line 421
    .line 422
    const/4 v1, 0x0

    .line 423
    goto/16 :goto_10

    .line 424
    .line 425
    :cond_7
    new-instance v9, Lse/h;

    .line 426
    .line 427
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    invoke-direct {v9, v0}, Lse/h;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 431
    .line 432
    .line 433
    new-instance v0, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 436
    .line 437
    .line 438
    const-string v1, "Using custom format - photo: "

    .line 439
    .line 440
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v9}, Lse/h;->b()Landroid/util/Size;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    const-string v1, ", video: "

    .line 451
    .line 452
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v9}, Lse/h;->c()Landroid/util/Size;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    const-string v1, " @ "

    .line 463
    .line 464
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    iget-object v1, v7, Lcom/mrousavy/camera/CameraView;->u:Ljava/lang/Integer;

    .line 468
    .line 469
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    const-string v1, " FPS"

    .line 473
    .line 474
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-static {v8, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 482
    .line 483
    .line 484
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->q:Ljava/lang/Boolean;

    .line 485
    .line 486
    move-object/from16 v16, v3

    .line 487
    .line 488
    const/4 v1, 0x1

    .line 489
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    if-eqz v0, :cond_8

    .line 498
    .line 499
    invoke-virtual {v9}, Lse/h;->c()Landroid/util/Size;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {v15, v0}, Landroidx/camera/core/a2$b;->o(Landroid/util/Size;)Landroidx/camera/core/a2$b;

    .line 504
    .line 505
    .line 506
    goto :goto_3

    .line 507
    :cond_8
    invoke-virtual {v9}, Lse/h;->b()Landroid/util/Size;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v15, v0}, Landroidx/camera/core/a2$b;->o(Landroid/util/Size;)Landroidx/camera/core/a2$b;

    .line 512
    .line 513
    .line 514
    :goto_3
    invoke-virtual {v9}, Lse/h;->b()Landroid/util/Size;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-virtual {v14, v0}, Landroidx/camera/core/g1$e;->q(Landroid/util/Size;)Landroidx/camera/core/g1$e;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v9}, Lse/h;->b()Landroid/util/Size;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-virtual {v4, v0}, Landroidx/camera/core/m0$c;->o(Landroid/util/Size;)Landroidx/camera/core/m0$c;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v9}, Lse/h;->c()Landroid/util/Size;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    invoke-virtual {v9}, Lse/h;->c()Landroid/util/Size;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 541
    .line 542
    .line 543
    move-result v1

    .line 544
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    if-ltz v0, :cond_9

    .line 549
    .line 550
    const/16 v1, 0x1e1

    .line 551
    .line 552
    if-ge v0, v1, :cond_9

    .line 553
    .line 554
    const/4 v1, 0x1

    .line 555
    goto :goto_4

    .line 556
    :cond_9
    const/4 v1, 0x0

    .line 557
    :goto_4
    if-eqz v1, :cond_a

    .line 558
    .line 559
    sget-object v0, Li0/v;->a:Li0/v;

    .line 560
    .line 561
    invoke-static {v0}, Li0/w;->d(Li0/v;)Li0/w;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-virtual {v13, v0}, Li0/o0$h;->e(Li0/w;)Li0/o0$h;

    .line 566
    .line 567
    .line 568
    goto/16 :goto_9

    .line 569
    .line 570
    :cond_a
    const/16 v1, 0x1e0

    .line 571
    .line 572
    if-gt v1, v0, :cond_b

    .line 573
    .line 574
    const/16 v1, 0x2d1

    .line 575
    .line 576
    if-ge v0, v1, :cond_b

    .line 577
    .line 578
    const/4 v1, 0x1

    .line 579
    goto :goto_5

    .line 580
    :cond_b
    const/4 v1, 0x0

    .line 581
    :goto_5
    if-eqz v1, :cond_c

    .line 582
    .line 583
    sget-object v0, Li0/v;->b:Li0/v;

    .line 584
    .line 585
    invoke-static {v0}, Li0/n;->b(Li0/v;)Li0/n;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    invoke-static {v0, v1}, Li0/w;->e(Li0/v;Li0/n;)Li0/w;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-virtual {v13, v0}, Li0/o0$h;->e(Li0/w;)Li0/o0$h;

    .line 594
    .line 595
    .line 596
    goto :goto_9

    .line 597
    :cond_c
    const/16 v1, 0x2d0

    .line 598
    .line 599
    if-gt v1, v0, :cond_d

    .line 600
    .line 601
    const/16 v1, 0x439

    .line 602
    .line 603
    if-ge v0, v1, :cond_d

    .line 604
    .line 605
    const/4 v1, 0x1

    .line 606
    goto :goto_6

    .line 607
    :cond_d
    const/4 v1, 0x0

    .line 608
    :goto_6
    if-eqz v1, :cond_e

    .line 609
    .line 610
    sget-object v0, Li0/v;->c:Li0/v;

    .line 611
    .line 612
    invoke-static {v0}, Li0/n;->b(Li0/v;)Li0/n;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    invoke-static {v0, v1}, Li0/w;->e(Li0/v;Li0/n;)Li0/w;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-virtual {v13, v0}, Li0/o0$h;->e(Li0/w;)Li0/o0$h;

    .line 621
    .line 622
    .line 623
    goto :goto_9

    .line 624
    :cond_e
    const/16 v1, 0x438

    .line 625
    .line 626
    if-gt v1, v0, :cond_f

    .line 627
    .line 628
    const/16 v1, 0x871

    .line 629
    .line 630
    if-ge v0, v1, :cond_f

    .line 631
    .line 632
    const/4 v1, 0x1

    .line 633
    goto :goto_7

    .line 634
    :cond_f
    const/4 v1, 0x0

    .line 635
    :goto_7
    if-eqz v1, :cond_10

    .line 636
    .line 637
    sget-object v0, Li0/v;->d:Li0/v;

    .line 638
    .line 639
    invoke-static {v0}, Li0/n;->b(Li0/v;)Li0/n;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    invoke-static {v0, v1}, Li0/w;->e(Li0/v;Li0/n;)Li0/w;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-virtual {v13, v0}, Li0/o0$h;->e(Li0/w;)Li0/o0$h;

    .line 648
    .line 649
    .line 650
    goto :goto_9

    .line 651
    :cond_10
    const/16 v1, 0x870

    .line 652
    .line 653
    if-gt v1, v0, :cond_11

    .line 654
    .line 655
    const/16 v1, 0x10e1

    .line 656
    .line 657
    if-ge v0, v1, :cond_11

    .line 658
    .line 659
    const/4 v0, 0x1

    .line 660
    goto :goto_8

    .line 661
    :cond_11
    const/4 v0, 0x0

    .line 662
    :goto_8
    if-eqz v0, :cond_12

    .line 663
    .line 664
    sget-object v0, Li0/v;->f:Li0/v;

    .line 665
    .line 666
    invoke-static {v0}, Li0/n;->b(Li0/v;)Li0/n;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    invoke-static {v0, v1}, Li0/w;->e(Li0/v;Li0/n;)Li0/w;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-virtual {v13, v0}, Li0/o0$h;->e(Li0/w;)Li0/o0$h;

    .line 675
    .line 676
    .line 677
    :cond_12
    :goto_9
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->u:Ljava/lang/Integer;

    .line 678
    .line 679
    if-eqz v0, :cond_17

    .line 680
    .line 681
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 682
    .line 683
    .line 684
    move-result v0

    .line 685
    invoke-virtual {v9}, Lse/h;->a()Ljava/util/List;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    instance-of v3, v1, Ljava/util/Collection;

    .line 690
    .line 691
    if-eqz v3, :cond_14

    .line 692
    .line 693
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    if-eqz v3, :cond_14

    .line 698
    .line 699
    :cond_13
    const/4 v1, 0x0

    .line 700
    goto :goto_a

    .line 701
    :cond_14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    :cond_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    if-eqz v3, :cond_13

    .line 710
    .line 711
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v3

    .line 715
    check-cast v3, Landroid/util/Range;

    .line 716
    .line 717
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 718
    .line 719
    .line 720
    move-result-object v9

    .line 721
    invoke-virtual {v3, v9}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 722
    .line 723
    .line 724
    move-result v3

    .line 725
    if-eqz v3, :cond_15

    .line 726
    .line 727
    const/4 v1, 0x1

    .line 728
    :goto_a
    if-eqz v1, :cond_16

    .line 729
    .line 730
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 731
    .line 732
    move-wide/from16 v19, v11

    .line 733
    .line 734
    int-to-double v11, v0

    .line 735
    div-double v11, v17, v11

    .line 736
    .line 737
    double-to-long v11, v11

    .line 738
    const v1, 0x3b9aca00

    .line 739
    .line 740
    .line 741
    move-object v9, v4

    .line 742
    int-to-long v3, v1

    .line 743
    mul-long/2addr v11, v3

    .line 744
    new-instance v1, Ljava/lang/StringBuilder;

    .line 745
    .line 746
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 747
    .line 748
    .line 749
    const-string v3, "Setting AE_TARGET_FPS_RANGE to "

    .line 750
    .line 751
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 755
    .line 756
    .line 757
    const/16 v3, 0x2d

    .line 758
    .line 759
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 763
    .line 764
    .line 765
    const-string v3, ", and SENSOR_FRAME_DURATION to "

    .line 766
    .line 767
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    invoke-static {v8, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 778
    .line 779
    .line 780
    new-instance v1, Lv/i;

    .line 781
    .line 782
    invoke-direct {v1, v15}, Lv/i;-><init>(Landroidx/camera/core/f0;)V

    .line 783
    .line 784
    .line 785
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 786
    .line 787
    new-instance v4, Landroid/util/Range;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 788
    .line 789
    move-object/from16 v17, v8

    .line 790
    .line 791
    :try_start_5
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 792
    .line 793
    .line 794
    move-result-object v8

    .line 795
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    invoke-direct {v4, v8, v0}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v1, v3, v4}, Lv/i;->a(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lv/i;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->SENSOR_FRAME_DURATION:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 807
    .line 808
    invoke-static {v11, v12}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    .line 809
    .line 810
    .line 811
    move-result-object v3

    .line 812
    invoke-virtual {v0, v1, v3}, Lv/i;->a(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lv/i;

    .line 813
    .line 814
    .line 815
    goto :goto_b

    .line 816
    :cond_16
    move-object/from16 v17, v8

    .line 817
    .line 818
    new-instance v1, Lcom/mrousavy/camera/t;

    .line 819
    .line 820
    invoke-direct {v1, v0}, Lcom/mrousavy/camera/t;-><init>(I)V

    .line 821
    .line 822
    .line 823
    throw v1

    .line 824
    :cond_17
    move-object v9, v4

    .line 825
    move-object/from16 v17, v8

    .line 826
    .line 827
    move-wide/from16 v19, v11

    .line 828
    .line 829
    :goto_b
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->v:Ljava/lang/Boolean;

    .line 830
    .line 831
    const/4 v1, 0x1

    .line 832
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 833
    .line 834
    .line 835
    move-result-object v3

    .line 836
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    move-result v0

    .line 840
    if-eqz v0, :cond_19

    .line 841
    .line 842
    const/4 v1, 0x2

    .line 843
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    iput-object v7, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    .line 848
    .line 849
    iput-object v10, v2, Lcom/mrousavy/camera/CameraView$d;->l:Ljava/lang/Object;

    .line 850
    .line 851
    iput-object v6, v2, Lcom/mrousavy/camera/CameraView$d;->m:Ljava/lang/Object;

    .line 852
    .line 853
    iput-object v5, v2, Lcom/mrousavy/camera/CameraView$d;->n:Ljava/lang/Object;

    .line 854
    .line 855
    iput-object v15, v2, Lcom/mrousavy/camera/CameraView$d;->o:Ljava/lang/Object;

    .line 856
    .line 857
    iput-object v14, v2, Lcom/mrousavy/camera/CameraView$d;->p:Ljava/lang/Object;

    .line 858
    .line 859
    iput-object v13, v2, Lcom/mrousavy/camera/CameraView$d;->q:Ljava/lang/Object;

    .line 860
    .line 861
    iput-object v9, v2, Lcom/mrousavy/camera/CameraView$d;->r:Ljava/lang/Object;

    .line 862
    .line 863
    move-wide/from16 v3, v19

    .line 864
    .line 865
    iput-wide v3, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    .line 866
    .line 867
    const/4 v1, 0x2

    .line 868
    iput v1, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    .line 869
    .line 870
    invoke-interface {v5, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    move-object/from16 v1, v16

    .line 875
    .line 876
    if-ne v0, v1, :cond_18

    .line 877
    .line 878
    return-object v1

    .line 879
    :cond_18
    move-wide v11, v3

    .line 880
    move-object v4, v9

    .line 881
    :goto_c
    move-object v9, v4

    .line 882
    move-wide v3, v11

    .line 883
    :goto_d
    move-object v11, v13

    .line 884
    move-object v12, v14

    .line 885
    move-object v13, v15

    .line 886
    move-object v14, v6

    .line 887
    move-object v15, v10

    .line 888
    goto :goto_e

    .line 889
    :cond_19
    move-object/from16 v1, v16

    .line 890
    .line 891
    move-wide/from16 v3, v19

    .line 892
    .line 893
    goto :goto_d

    .line 894
    :goto_e
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->x:Ljava/lang/Boolean;

    .line 895
    .line 896
    const/4 v6, 0x1

    .line 897
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 898
    .line 899
    .line 900
    move-result-object v8

    .line 901
    invoke-static {v0, v8}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 902
    .line 903
    .line 904
    move-result v0

    .line 905
    if-eqz v0, :cond_1b

    .line 906
    .line 907
    const/4 v0, 0x3

    .line 908
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 909
    .line 910
    .line 911
    move-result-object v6

    .line 912
    iput-object v7, v2, Lcom/mrousavy/camera/CameraView$d;->k:Ljava/lang/Object;

    .line 913
    .line 914
    iput-object v15, v2, Lcom/mrousavy/camera/CameraView$d;->l:Ljava/lang/Object;

    .line 915
    .line 916
    iput-object v14, v2, Lcom/mrousavy/camera/CameraView$d;->m:Ljava/lang/Object;

    .line 917
    .line 918
    iput-object v13, v2, Lcom/mrousavy/camera/CameraView$d;->n:Ljava/lang/Object;

    .line 919
    .line 920
    iput-object v12, v2, Lcom/mrousavy/camera/CameraView$d;->o:Ljava/lang/Object;

    .line 921
    .line 922
    iput-object v11, v2, Lcom/mrousavy/camera/CameraView$d;->p:Ljava/lang/Object;

    .line 923
    .line 924
    iput-object v9, v2, Lcom/mrousavy/camera/CameraView$d;->q:Ljava/lang/Object;

    .line 925
    .line 926
    const/4 v8, 0x0

    .line 927
    iput-object v8, v2, Lcom/mrousavy/camera/CameraView$d;->r:Ljava/lang/Object;

    .line 928
    .line 929
    iput-wide v3, v2, Lcom/mrousavy/camera/CameraView$d;->s:J

    .line 930
    .line 931
    const/4 v0, 0x3

    .line 932
    iput v0, v2, Lcom/mrousavy/camera/CameraView$d;->v:I

    .line 933
    .line 934
    invoke-interface {v5, v6, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    if-ne v0, v1, :cond_1a

    .line 939
    .line 940
    return-object v1

    .line 941
    :cond_1a
    move-object v2, v7

    .line 942
    move-object v5, v9

    .line 943
    :goto_f
    move-object v7, v2

    .line 944
    move-object v6, v14

    .line 945
    move-object v10, v15

    .line 946
    const/4 v1, 0x0

    .line 947
    move-object v14, v12

    .line 948
    move-object v15, v13

    .line 949
    move-object v13, v11

    .line 950
    move-wide v11, v3

    .line 951
    move-object v4, v5

    .line 952
    goto :goto_10

    .line 953
    :cond_1b
    move-object v6, v14

    .line 954
    move-object v10, v15

    .line 955
    const/4 v1, 0x0

    .line 956
    move-object v14, v12

    .line 957
    move-object v15, v13

    .line 958
    move-object v13, v11

    .line 959
    move-wide v11, v3

    .line 960
    move-object v4, v9

    .line 961
    :goto_10
    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->M:Li0/c1;

    .line 962
    .line 963
    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->L:Landroidx/camera/core/g1;

    .line 964
    .line 965
    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->N:Landroidx/camera/core/m0;

    .line 966
    .line 967
    invoke-virtual {v10}, Landroidx/camera/lifecycle/e;->n()V

    .line 968
    .line 969
    .line 970
    new-instance v0, Ljava/util/ArrayList;

    .line 971
    .line 972
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 973
    .line 974
    .line 975
    iget-object v1, v7, Lcom/mrousavy/camera/CameraView;->q:Ljava/lang/Boolean;

    .line 976
    .line 977
    const/4 v2, 0x1

    .line 978
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 979
    .line 980
    .line 981
    move-result-object v3

    .line 982
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 983
    .line 984
    .line 985
    move-result v1

    .line 986
    if-eqz v1, :cond_1c

    .line 987
    .line 988
    const-string v1, "Adding VideoCapture use-case..."
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 989
    .line 990
    move-object/from16 v2, v17

    .line 991
    .line 992
    :try_start_6
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 993
    .line 994
    .line 995
    invoke-virtual {v13}, Li0/o0$h;->b()Li0/o0;

    .line 996
    .line 997
    .line 998
    move-result-object v1

    .line 999
    const-string v3, "videoRecorderBuilder.build()"

    .line 1000
    .line 1001
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1002
    .line 1003
    .line 1004
    invoke-static {v1}, Li0/c1;->Z(Li0/h1;)Li0/c1;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->M:Li0/c1;

    .line 1009
    .line 1010
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 1011
    .line 1012
    .line 1013
    invoke-direct {v7}, Lcom/mrousavy/camera/CameraView;->getOutputRotation()I

    .line 1014
    .line 1015
    .line 1016
    move-result v3

    .line 1017
    invoke-virtual {v1, v3}, Li0/c1;->X(I)V

    .line 1018
    .line 1019
    .line 1020
    iget-object v1, v7, Lcom/mrousavy/camera/CameraView;->M:Li0/c1;

    .line 1021
    .line 1022
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1026
    .line 1027
    .line 1028
    goto :goto_11

    .line 1029
    :cond_1c
    move-object/from16 v2, v17

    .line 1030
    .line 1031
    :goto_11
    iget-object v1, v7, Lcom/mrousavy/camera/CameraView;->p:Ljava/lang/Boolean;

    .line 1032
    .line 1033
    const/4 v3, 0x1

    .line 1034
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v5

    .line 1038
    invoke-static {v1, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1039
    .line 1040
    .line 1041
    move-result v1

    .line 1042
    if-eqz v1, :cond_1e

    .line 1043
    .line 1044
    invoke-virtual {v7}, Lcom/mrousavy/camera/CameraView;->getFallbackToSnapshot$react_native_vision_camera_release()Z

    .line 1045
    .line 1046
    .line 1047
    move-result v1

    .line 1048
    if-eqz v1, :cond_1d

    .line 1049
    .line 1050
    const-string v1, "Tried to add photo use-case (`photo={true}`) but the Camera device only supports a single use-case at a time. Falling back to Snapshot capture."

    .line 1051
    .line 1052
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1053
    .line 1054
    .line 1055
    goto :goto_12

    .line 1056
    :cond_1d
    const-string v1, "Adding ImageCapture use-case..."

    .line 1057
    .line 1058
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v14}, Landroidx/camera/core/g1$e;->e()Landroidx/camera/core/g1;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->L:Landroidx/camera/core/g1;

    .line 1066
    .line 1067
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1071
    .line 1072
    .line 1073
    :cond_1e
    :goto_12
    iget-boolean v1, v7, Lcom/mrousavy/camera/CameraView;->s:Z

    .line 1074
    .line 1075
    if-eqz v1, :cond_1f

    .line 1076
    .line 1077
    const-string v1, "Adding ImageAnalysis use-case..."

    .line 1078
    .line 1079
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v4}, Landroidx/camera/core/m0$c;->e()Landroidx/camera/core/m0;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v1

    .line 1086
    iget-object v3, v7, Lcom/mrousavy/camera/CameraView;->G:Ljava/util/concurrent/ExecutorService;

    .line 1087
    .line 1088
    new-instance v4, Lcom/mrousavy/camera/h;

    .line 1089
    .line 1090
    invoke-direct {v4, v7}, Lcom/mrousavy/camera/h;-><init>(Lcom/mrousavy/camera/CameraView;)V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v1, v3, v4}, Landroidx/camera/core/m0;->Y(Ljava/util/concurrent/Executor;Landroidx/camera/core/m0$a;)V

    .line 1094
    .line 1095
    .line 1096
    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->N:Landroidx/camera/core/m0;

    .line 1097
    .line 1098
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1102
    .line 1103
    .line 1104
    :cond_1f
    invoke-virtual {v15}, Landroidx/camera/core/a2$b;->e()Landroidx/camera/core/a2;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v1

    .line 1108
    iput-object v1, v7, Lcom/mrousavy/camera/CameraView;->O:Landroidx/camera/core/a2;

    .line 1109
    .line 1110
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1111
    .line 1112
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1113
    .line 1114
    .line 1115
    const-string v3, "Attaching "

    .line 1116
    .line 1117
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1121
    .line 1122
    .line 1123
    move-result v3

    .line 1124
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1125
    .line 1126
    .line 1127
    const-string v3, " use-cases..."

    .line 1128
    .line 1129
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v1

    .line 1136
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1137
    .line 1138
    .line 1139
    iget-object v1, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 1140
    .line 1141
    check-cast v1, Landroidx/camera/core/t;

    .line 1142
    .line 1143
    new-instance v3, Lkotlin/jvm/internal/j0;

    .line 1144
    .line 1145
    const/4 v4, 0x2

    .line 1146
    invoke-direct {v3, v4}, Lkotlin/jvm/internal/j0;-><init>(I)V

    .line 1147
    .line 1148
    .line 1149
    iget-object v4, v7, Lcom/mrousavy/camera/CameraView;->O:Landroidx/camera/core/a2;

    .line 1150
    .line 1151
    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/j0;->a(Ljava/lang/Object;)V

    .line 1152
    .line 1153
    .line 1154
    const/4 v4, 0x0

    .line 1155
    new-array v5, v4, [Landroidx/camera/core/w2;

    .line 1156
    .line 1157
    invoke-interface {v0, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v0

    .line 1161
    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/j0;->b(Ljava/lang/Object;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v3}, Lkotlin/jvm/internal/j0;->c()I

    .line 1165
    .line 1166
    .line 1167
    move-result v0

    .line 1168
    new-array v0, v0, [Landroidx/camera/core/w2;

    .line 1169
    .line 1170
    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/j0;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v0

    .line 1174
    check-cast v0, [Landroidx/camera/core/w2;

    .line 1175
    .line 1176
    invoke-virtual {v10, v7, v1, v0}, Landroidx/camera/lifecycle/e;->f(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/t;[Landroidx/camera/core/w2;)Landroidx/camera/core/k;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    iput-object v0, v7, Lcom/mrousavy/camera/CameraView;->K:Landroidx/camera/core/k;

    .line 1181
    .line 1182
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->O:Landroidx/camera/core/a2;

    .line 1183
    .line 1184
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    iget-object v1, v7, Lcom/mrousavy/camera/CameraView;->F:Landroidx/camera/view/l;

    .line 1188
    .line 1189
    invoke-virtual {v1}, Landroidx/camera/view/l;->getSurfaceProvider()Landroidx/camera/core/a2$d;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v1

    .line 1193
    invoke-virtual {v0, v1}, Landroidx/camera/core/a2;->T(Landroidx/camera/core/a2$d;)V

    .line 1194
    .line 1195
    .line 1196
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->K:Landroidx/camera/core/k;

    .line 1197
    .line 1198
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 1199
    .line 1200
    .line 1201
    invoke-interface {v0}, Landroidx/camera/core/k;->a()Landroidx/camera/core/r;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v0

    .line 1205
    invoke-interface {v0}, Landroidx/camera/core/r;->i()Landroidx/lifecycle/LiveData;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v0

    .line 1213
    check-cast v0, Landroidx/camera/core/d3;

    .line 1214
    .line 1215
    const/high16 v1, 0x3f800000    # 1.0f

    .line 1216
    .line 1217
    if-eqz v0, :cond_20

    .line 1218
    .line 1219
    invoke-interface {v0}, Landroidx/camera/core/d3;->b()F

    .line 1220
    .line 1221
    .line 1222
    move-result v0

    .line 1223
    goto :goto_13

    .line 1224
    :cond_20
    move v0, v1

    .line 1225
    :goto_13
    iput v0, v7, Lcom/mrousavy/camera/CameraView;->a0:F

    .line 1226
    .line 1227
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->K:Landroidx/camera/core/k;

    .line 1228
    .line 1229
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 1230
    .line 1231
    .line 1232
    invoke-interface {v0}, Landroidx/camera/core/k;->a()Landroidx/camera/core/r;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0

    .line 1236
    invoke-interface {v0}, Landroidx/camera/core/r;->i()Landroidx/lifecycle/LiveData;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v0

    .line 1244
    check-cast v0, Landroidx/camera/core/d3;

    .line 1245
    .line 1246
    if-eqz v0, :cond_21

    .line 1247
    .line 1248
    invoke-interface {v0}, Landroidx/camera/core/d3;->a()F

    .line 1249
    .line 1250
    .line 1251
    move-result v1

    .line 1252
    :cond_21
    iput v1, v7, Lcom/mrousavy/camera/CameraView;->b0:F

    .line 1253
    .line 1254
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1255
    .line 1256
    .line 1257
    move-result-wide v0

    .line 1258
    sub-long/2addr v0, v11

    .line 1259
    const-string v3, "CameraView.performance"

    .line 1260
    .line 1261
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1262
    .line 1263
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1264
    .line 1265
    .line 1266
    const-string v5, "Session configured in "

    .line 1267
    .line 1268
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1272
    .line 1273
    .line 1274
    const-string v0, " ms! Camera: "

    .line 1275
    .line 1276
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1277
    .line 1278
    .line 1279
    iget-object v0, v7, Lcom/mrousavy/camera/CameraView;->K:Landroidx/camera/core/k;

    .line 1280
    .line 1281
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1292
    .line 1293
    .line 1294
    invoke-static {v7}, Lcom/mrousavy/camera/m;->d(Lcom/mrousavy/camera/CameraView;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 1295
    .line 1296
    .line 1297
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1298
    .line 1299
    return-object v0

    .line 1300
    :catchall_0
    move-exception v0

    .line 1301
    move-object/from16 v2, v17

    .line 1302
    .line 1303
    goto :goto_14

    .line 1304
    :cond_22
    move-object v2, v8

    .line 1305
    :try_start_7
    new-instance v0, Lcom/mrousavy/camera/d0;

    .line 1306
    .line 1307
    invoke-direct {v0}, Lcom/mrousavy/camera/d0;-><init>()V

    .line 1308
    .line 1309
    .line 1310
    throw v0

    .line 1311
    :cond_23
    move-object v2, v8

    .line 1312
    new-instance v0, Lcom/mrousavy/camera/e;

    .line 1313
    .line 1314
    invoke-direct {v0}, Lcom/mrousavy/camera/e;-><init>()V

    .line 1315
    .line 1316
    .line 1317
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 1318
    :catchall_1
    move-exception v0

    .line 1319
    goto :goto_14

    .line 1320
    :catchall_2
    move-exception v0

    .line 1321
    move-object v2, v8

    .line 1322
    :goto_14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1323
    .line 1324
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1325
    .line 1326
    .line 1327
    const-string v3, "Failed to configure session: "

    .line 1328
    .line 1329
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v3

    .line 1336
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v1

    .line 1343
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1344
    .line 1345
    .line 1346
    instance-of v1, v0, Lcom/mrousavy/camera/a;

    .line 1347
    .line 1348
    if-nez v1, :cond_28

    .line 1349
    .line 1350
    instance-of v1, v0, Ljava/lang/IllegalArgumentException;

    .line 1351
    .line 1352
    if-eqz v1, :cond_27

    .line 1353
    .line 1354
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v1

    .line 1358
    if-eqz v1, :cond_24

    .line 1359
    .line 1360
    const-string v2, "too many use cases"

    .line 1361
    .line 1362
    const/4 v3, 0x2

    .line 1363
    const/4 v4, 0x0

    .line 1364
    const/4 v5, 0x0

    .line 1365
    invoke-static {v1, v2, v5, v3, v4}, Lpi/l;->M(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 1366
    .line 1367
    .line 1368
    move-result v1

    .line 1369
    const/4 v2, 0x1

    .line 1370
    if-ne v1, v2, :cond_25

    .line 1371
    .line 1372
    move v9, v2

    .line 1373
    goto :goto_15

    .line 1374
    :cond_24
    const/4 v5, 0x0

    .line 1375
    :cond_25
    move v9, v5

    .line 1376
    :goto_15
    if-eqz v9, :cond_26

    .line 1377
    .line 1378
    new-instance v1, Lcom/mrousavy/camera/g0;

    .line 1379
    .line 1380
    invoke-direct {v1, v0}, Lcom/mrousavy/camera/g0;-><init>(Ljava/lang/Throwable;)V

    .line 1381
    .line 1382
    .line 1383
    goto :goto_16

    .line 1384
    :cond_26
    new-instance v1, Lcom/mrousavy/camera/x;

    .line 1385
    .line 1386
    invoke-direct {v1, v0}, Lcom/mrousavy/camera/x;-><init>(Ljava/lang/Throwable;)V

    .line 1387
    .line 1388
    .line 1389
    goto :goto_16

    .line 1390
    :cond_27
    new-instance v1, Lcom/mrousavy/camera/j0;

    .line 1391
    .line 1392
    invoke-direct {v1, v0}, Lcom/mrousavy/camera/j0;-><init>(Ljava/lang/Throwable;)V

    .line 1393
    .line 1394
    .line 1395
    :goto_16
    move-object v0, v1

    .line 1396
    :cond_28
    throw v0
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
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
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
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
.end method
