.class Lcom/facebook/react/devsupport/WindowOverlayCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ANDROID_OREO:I = 0x1a

.field private static final TYPE_APPLICATION_OVERLAY:I = 0x7f6

.field static final TYPE_SYSTEM_ALERT:I

.field static final TYPE_SYSTEM_OVERLAY:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x7f6

    .line 4
    .line 5
    const/16 v2, 0x1a

    .line 6
    .line 7
    if-ge v0, v2, :cond_0

    .line 8
    .line 9
    const/16 v3, 0x7d3

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v3, v1

    .line 13
    :goto_0
    sput v3, Lcom/facebook/react/devsupport/WindowOverlayCompat;->TYPE_SYSTEM_ALERT:I

    .line 14
    .line 15
    if-ge v0, v2, :cond_1

    .line 16
    .line 17
    const/16 v1, 0x7d6

    .line 18
    .line 19
    :cond_1
    sput v1, Lcom/facebook/react/devsupport/WindowOverlayCompat;->TYPE_SYSTEM_OVERLAY:I

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
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
