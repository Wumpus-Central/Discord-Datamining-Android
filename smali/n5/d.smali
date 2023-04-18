.class public Ln5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lx5/y;Lcom/facebook/imagepipeline/platform/g;Lq5/a;)Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;
    .locals 0

    new-instance p1, Ln5/a;

    invoke-virtual {p0}, Lx5/y;->b()Lx5/h;

    move-result-object p0

    invoke-direct {p1, p0, p2}, Ln5/a;-><init>(Lx5/h;Lq5/a;)V

    return-object p1
.end method
