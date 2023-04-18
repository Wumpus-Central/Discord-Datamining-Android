.class public abstract Lr6/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr6/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lr6/g;
    .locals 4

    new-instance v0, Lr6/b;

    sget-object v1, Lr6/g$a;->m:Lr6/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lr6/b;-><init>(Lr6/g$a;J)V

    return-object v0
.end method

.method public static d()Lr6/g;
    .locals 4

    new-instance v0, Lr6/b;

    sget-object v1, Lr6/g$a;->n:Lr6/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lr6/b;-><init>(Lr6/g$a;J)V

    return-object v0
.end method

.method public static e(J)Lr6/g;
    .locals 2

    new-instance v0, Lr6/b;

    sget-object v1, Lr6/g$a;->k:Lr6/g$a;

    invoke-direct {v0, v1, p0, p1}, Lr6/b;-><init>(Lr6/g$a;J)V

    return-object v0
.end method

.method public static f()Lr6/g;
    .locals 4

    new-instance v0, Lr6/b;

    sget-object v1, Lr6/g$a;->l:Lr6/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lr6/b;-><init>(Lr6/g$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()Lr6/g$a;
.end method
