.class public Lcom/facebook/react/bridge/ReactCxxErrorHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Ld6/a;
.end annotation


# static fields
.field private static mHandleErrorFunc:Ljava/lang/reflect/Method;

.field private static mObject:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static handleError(Ljava/lang/String;)V
    .locals 2
    .annotation build Ld6/a;
    .end annotation

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactCxxErrorHandler;->mHandleErrorFunc:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/Exception;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    aput-object v1, v0, p0

    .line 15
    .line 16
    sget-object p0, Lcom/facebook/react/bridge/ReactCxxErrorHandler;->mHandleErrorFunc:Ljava/lang/reflect/Method;

    .line 17
    .line 18
    sget-object v1, Lcom/facebook/react/bridge/ReactCxxErrorHandler;->mObject:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception p0

    .line 25
    const-string v0, "ReactCxxErrorHandler"

    .line 26
    .line 27
    const-string v1, "Failed to invole error hanlder function"

    .line 28
    .line 29
    invoke-static {v0, v1, p0}, Lw3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_0
    return-void
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
.end method

.method public static setHandleErrorFunc(Ljava/lang/Object;Ljava/lang/reflect/Method;)V
    .locals 0
    .annotation build Ld6/a;
    .end annotation

    .line 1
    sput-object p0, Lcom/facebook/react/bridge/ReactCxxErrorHandler;->mObject:Ljava/lang/Object;

    .line 2
    .line 3
    sput-object p1, Lcom/facebook/react/bridge/ReactCxxErrorHandler;->mHandleErrorFunc:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    return-void
    .line 6
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
