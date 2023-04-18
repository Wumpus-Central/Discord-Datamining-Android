.class public final Lcd/j;
.super Lcd/m;
.source "SourceFile"


# static fields
.field private static final m:Lcd/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcd/j;

    .line 2
    .line 3
    invoke-direct {v0}, Lcd/j;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcd/j;->m:Lcd/j;

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

    invoke-direct {p0}, Lcd/m;-><init>()V

    return-void
.end method

.method public static a()Lcd/j;
    .locals 1

    sget-object v0, Lcd/j;->m:Lcd/j;

    return-object v0
.end method
