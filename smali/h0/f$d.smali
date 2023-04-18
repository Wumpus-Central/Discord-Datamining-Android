.class abstract Lh0/f$d;
.super Lh0/f$c;
.source "SourceFile"

# interfaces
.implements Lh0/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "d"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh0/f$c;-><init>()V

    return-void
.end method

.method static g(Landroid/view/Surface;)Lh0/f$d;
    .locals 1

    new-instance v0, Lh0/d;

    invoke-direct {v0, p0}, Lh0/d;-><init>(Landroid/view/Surface;)V

    return-object v0
.end method


# virtual methods
.method public abstract getSurface()Landroid/view/Surface;
.end method
