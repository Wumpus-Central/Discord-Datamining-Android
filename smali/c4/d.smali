.class public Lc4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/a;


# static fields
.field private static final a:Lc4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc4/d;

    invoke-direct {v0}, Lc4/d;-><init>()V

    sput-object v0, Lc4/d;->a:Lc4/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lc4/d;
    .locals 1

    sget-object v0, Lc4/d;->a:Lc4/d;

    return-object v0
.end method


# virtual methods
.method public now()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
