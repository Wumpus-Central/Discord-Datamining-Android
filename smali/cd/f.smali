.class public final Lcd/f;
.super Lcd/m;
.source "SourceFile"


# static fields
.field private static final m:Lcd/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcd/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lcd/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcd/f;->m:Lcd/f;

    .line 7
    .line 8
    sget-object v1, Lcd/m;->l:[Ljava/lang/StackTraceElement;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcd/m;-><init>()V

    return-void
.end method

.method private constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcd/m;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a()Lcd/f;
    .locals 1

    sget-boolean v0, Lcd/m;->k:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcd/f;

    invoke-direct {v0}, Lcd/f;-><init>()V

    return-object v0

    :cond_0
    sget-object v0, Lcd/f;->m:Lcd/f;

    return-object v0
.end method

.method public static b(Ljava/lang/Throwable;)Lcd/f;
    .locals 1

    sget-boolean v0, Lcd/m;->k:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcd/f;

    invoke-direct {v0, p0}, Lcd/f;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :cond_0
    sget-object p0, Lcd/f;->m:Lcd/f;

    return-object p0
.end method
