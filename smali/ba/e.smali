.class public Lba/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lba/d;


# static fields
.field private static final a:Lba/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lba/e;

    invoke-direct {v0}, Lba/e;-><init>()V

    sput-object v0, Lba/e;->a:Lba/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lba/d;
    .locals 1

    sget-object v0, Lba/e;->a:Lba/e;

    return-object v0
.end method


# virtual methods
.method public final a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method
