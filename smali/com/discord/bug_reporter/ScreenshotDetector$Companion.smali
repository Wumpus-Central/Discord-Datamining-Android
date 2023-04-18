.class public final Lcom/discord/bug_reporter/ScreenshotDetector$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/bug_reporter/ScreenshotDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/discord/bug_reporter/ScreenshotDetector$Companion;",
        "",
        "()V",
        "INSTANCE",
        "Lcom/discord/bug_reporter/ScreenshotDetector;",
        "get",
        "init",
        "",
        "contentResolver",
        "Landroid/content/ContentResolver;",
        "bug_reporter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/bug_reporter/ScreenshotDetector$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Lcom/discord/bug_reporter/ScreenshotDetector;
    .locals 1

    invoke-static {}, Lcom/discord/bug_reporter/ScreenshotDetector;->access$getINSTANCE$cp()Lcom/discord/bug_reporter/ScreenshotDetector;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "INSTANCE"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public final init(Landroid/content/ContentResolver;)V
    .locals 1

    .line 1
    const-string v0, "contentResolver"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/discord/bug_reporter/ScreenshotDetector;->access$getINSTANCE$cp()Lcom/discord/bug_reporter/ScreenshotDetector;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/discord/bug_reporter/ScreenshotDetector;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lcom/discord/bug_reporter/ScreenshotDetector;-><init>(Landroid/content/ContentResolver;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/discord/bug_reporter/ScreenshotDetector;->access$setINSTANCE$cp(Lcom/discord/bug_reporter/ScreenshotDetector;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
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
.end method
