.class public abstract Lwc/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwc/f$a;,
        Lwc/f$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lwc/f$a;
    .locals 3

    new-instance v0, Lwc/b$b;

    invoke-direct {v0}, Lwc/b$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lwc/b$b;->d(J)Lwc/f$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Lwc/f$b;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()J
.end method
