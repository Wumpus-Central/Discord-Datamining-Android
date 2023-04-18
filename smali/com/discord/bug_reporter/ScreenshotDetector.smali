.class public final Lcom/discord/bug_reporter/ScreenshotDetector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/bug_reporter/ScreenshotDetector$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0015\u001a\u00020\u000fH\u0002R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/discord/bug_reporter/ScreenshotDetector;",
        "",
        "contentResolver",
        "Landroid/content/ContentResolver;",
        "(Landroid/content/ContentResolver;)V",
        "value",
        "",
        "active",
        "getActive",
        "()Z",
        "setActive",
        "(Z)V",
        "screenshotContentObserver",
        "Lcom/discord/bug_reporter/ScreenshotContentObserver;",
        "Lkotlin/Function0;",
        "",
        "screenshotListener",
        "getScreenshotListener",
        "()Lkotlin/jvm/functions/Function0;",
        "setScreenshotListener",
        "(Lkotlin/jvm/functions/Function0;)V",
        "toggleScreenshotObserver",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/discord/bug_reporter/ScreenshotDetector$Companion;

.field private static INSTANCE:Lcom/discord/bug_reporter/ScreenshotDetector;


# instance fields
.field private active:Z

.field private final screenshotContentObserver:Lcom/discord/bug_reporter/ScreenshotContentObserver;

.field private screenshotListener:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/bug_reporter/ScreenshotDetector$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/bug_reporter/ScreenshotDetector$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/bug_reporter/ScreenshotDetector;->Companion:Lcom/discord/bug_reporter/ScreenshotDetector$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 2

    .line 1
    const-string v0, "contentResolver"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/discord/bug_reporter/ScreenshotContentObserver;

    .line 10
    .line 11
    new-instance v1, Lcom/discord/bug_reporter/ScreenshotDetector$screenshotContentObserver$1;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/discord/bug_reporter/ScreenshotDetector$screenshotContentObserver$1;-><init>(Lcom/discord/bug_reporter/ScreenshotDetector;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p1, v1}, Lcom/discord/bug_reporter/ScreenshotContentObserver;-><init>(Landroid/content/ContentResolver;Lkotlin/jvm/functions/Function0;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/discord/bug_reporter/ScreenshotDetector;->screenshotContentObserver:Lcom/discord/bug_reporter/ScreenshotContentObserver;

    .line 20
    .line 21
    return-void
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

.method public static final synthetic access$getINSTANCE$cp()Lcom/discord/bug_reporter/ScreenshotDetector;
    .locals 1

    sget-object v0, Lcom/discord/bug_reporter/ScreenshotDetector;->INSTANCE:Lcom/discord/bug_reporter/ScreenshotDetector;

    return-object v0
.end method

.method public static final synthetic access$setINSTANCE$cp(Lcom/discord/bug_reporter/ScreenshotDetector;)V
    .locals 0

    sput-object p0, Lcom/discord/bug_reporter/ScreenshotDetector;->INSTANCE:Lcom/discord/bug_reporter/ScreenshotDetector;

    return-void
.end method

.method private final toggleScreenshotObserver()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/discord/bug_reporter/ScreenshotDetector;->active:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/discord/bug_reporter/ScreenshotDetector;->screenshotListener:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/discord/bug_reporter/ScreenshotDetector;->screenshotContentObserver:Lcom/discord/bug_reporter/ScreenshotContentObserver;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/discord/bug_reporter/ScreenshotContentObserver;->connect()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/discord/bug_reporter/ScreenshotDetector;->screenshotContentObserver:Lcom/discord/bug_reporter/ScreenshotContentObserver;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/discord/bug_reporter/ScreenshotContentObserver;->disconnect()V

    .line 18
    .line 19
    .line 20
    :goto_0
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


# virtual methods
.method public final getActive()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/bug_reporter/ScreenshotDetector;->active:Z

    return v0
.end method

.method public final getScreenshotListener()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/bug_reporter/ScreenshotDetector;->screenshotListener:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final setActive(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/discord/bug_reporter/ScreenshotDetector;->active:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/discord/bug_reporter/ScreenshotDetector;->toggleScreenshotObserver()V

    .line 4
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
.end method

.method public final setScreenshotListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/discord/bug_reporter/ScreenshotDetector;->screenshotListener:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/discord/bug_reporter/ScreenshotDetector;->toggleScreenshotObserver()V

    .line 4
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
.end method
