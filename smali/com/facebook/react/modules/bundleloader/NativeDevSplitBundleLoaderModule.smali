.class public Lcom/facebook/react/modules/bundleloader/NativeDevSplitBundleLoaderModule;
.super Lcom/facebook/fbreact/specs/NativeDevSplitBundleLoaderSpec;
.source "SourceFile"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "DevSplitBundleLoader"
.end annotation


# static fields
.field public static final NAME:Ljava/lang/String; = "DevSplitBundleLoader"

.field private static final REJECTION_CODE:Ljava/lang/String; = "E_BUNDLE_LOAD_ERROR"


# instance fields
.field private final mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeDevSplitBundleLoaderSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/react/modules/bundleloader/NativeDevSplitBundleLoaderModule;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 5
    .line 6
    return-void
    .line 7
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
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "DevSplitBundleLoader"

    return-object v0
.end method

.method public loadBundle(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/modules/bundleloader/NativeDevSplitBundleLoaderModule;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    new-instance v1, Lcom/facebook/react/modules/bundleloader/NativeDevSplitBundleLoaderModule$1;

    invoke-direct {v1, p0, p2}, Lcom/facebook/react/modules/bundleloader/NativeDevSplitBundleLoaderModule$1;-><init>(Lcom/facebook/react/modules/bundleloader/NativeDevSplitBundleLoaderModule;Lcom/facebook/react/bridge/Promise;)V

    invoke-interface {v0, p1, v1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->loadSplitBundleFromServer(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSplitBundleCallback;)V

    return-void
.end method
