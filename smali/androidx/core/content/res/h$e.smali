.class public abstract Landroidx/core/content/res/h$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/content/res/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/core/content/res/h$e;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/content/res/h$e;->f(I)V

    return-void
.end method

.method public static synthetic b(Landroidx/core/content/res/h$e;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/content/res/h$e;->g(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public static e(Landroid/os/Handler;)Landroid/os/Handler;
    .locals 1

    if-nez p0, :cond_0

    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :cond_0
    return-object p0
.end method

.method private synthetic f(I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/core/content/res/h$e;->h(I)V

    return-void
.end method

.method private synthetic g(Landroid/graphics/Typeface;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/core/content/res/h$e;->i(Landroid/graphics/Typeface;)V

    return-void
.end method


# virtual methods
.method public final c(ILandroid/os/Handler;)V
    .locals 1

    invoke-static {p2}, Landroidx/core/content/res/h$e;->e(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object p2

    new-instance v0, Landroidx/core/content/res/j;

    invoke-direct {v0, p0, p1}, Landroidx/core/content/res/j;-><init>(Landroidx/core/content/res/h$e;I)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final d(Landroid/graphics/Typeface;Landroid/os/Handler;)V
    .locals 1

    invoke-static {p2}, Landroidx/core/content/res/h$e;->e(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object p2

    new-instance v0, Landroidx/core/content/res/i;

    invoke-direct {v0, p0, p1}, Landroidx/core/content/res/i;-><init>(Landroidx/core/content/res/h$e;Landroid/graphics/Typeface;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public abstract h(I)V
.end method

.method public abstract i(Landroid/graphics/Typeface;)V
.end method
