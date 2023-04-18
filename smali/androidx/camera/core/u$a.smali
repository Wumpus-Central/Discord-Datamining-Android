.class public abstract Landroidx/camera/core/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Landroidx/camera/core/u$a;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/camera/core/u$a;->b(ILjava/lang/Throwable;)Landroidx/camera/core/u$a;

    move-result-object p0

    return-object p0
.end method

.method public static b(ILjava/lang/Throwable;)Landroidx/camera/core/u$a;
    .locals 1

    new-instance v0, Landroidx/camera/core/g;

    invoke-direct {v0, p0, p1}, Landroidx/camera/core/g;-><init>(ILjava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/lang/Throwable;
.end method

.method public abstract d()I
.end method
