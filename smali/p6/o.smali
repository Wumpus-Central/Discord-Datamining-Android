.class public abstract Lp6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/o$a;,
        Lp6/o$b;,
        Lp6/o$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lp6/o$a;
    .locals 1

    new-instance v0, Lp6/i$b;

    invoke-direct {v0}, Lp6/i$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lp6/o$b;
.end method

.method public abstract c()Lp6/o$c;
.end method
