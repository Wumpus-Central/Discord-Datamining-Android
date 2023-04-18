.class public final Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\u0008\u0012\u0004\u0012\u00020\u0003`\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager$a;",
        "",
        "Ljava/util/ArrayList;",
        "Lcom/mrousavy/camera/frameprocessor/FrameProcessorPlugin;",
        "Lkotlin/collections/ArrayList;",
        "Plugins",
        "Ljava/util/ArrayList;",
        "b",
        "()Ljava/util/ArrayList;",
        "",
        "enableFrameProcessors",
        "Z",
        "a",
        "()Z",
        "setEnableFrameProcessors",
        "(Z)V",
        "",
        "TAG",
        "Ljava/lang/String;",
        "<init>",
        "()V",
        "react-native-vision-camera_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    invoke-static {}, Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;->c()Z

    move-result v0

    return v0
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/mrousavy/camera/frameprocessor/FrameProcessorPlugin;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;->d()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
