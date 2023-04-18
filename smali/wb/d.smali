.class public Lwb/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lwb/m;FFF)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public b(Lwb/m;FFLandroid/graphics/RectF;Lwb/c;)V
    .locals 0

    invoke-interface {p5, p4}, Lwb/c;->a(Landroid/graphics/RectF;)F

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lwb/d;->a(Lwb/m;FFF)V

    return-void
.end method
