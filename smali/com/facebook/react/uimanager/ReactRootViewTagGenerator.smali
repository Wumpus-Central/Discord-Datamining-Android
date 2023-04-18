.class public Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ROOT_VIEW_TAG_INCREMENT:I = 0xa

.field private static sNextRootViewTag:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized getNextRootViewTag()I
    .locals 3

    .line 1
    const-class v0, Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;->sNextRootViewTag:I

    .line 5
    .line 6
    add-int/lit8 v2, v1, 0xa

    .line 7
    .line 8
    sput v2, Lcom/facebook/react/uimanager/ReactRootViewTagGenerator;->sNextRootViewTag:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0

    .line 14
    throw v1
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
.end method
