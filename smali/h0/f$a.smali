.class abstract Lh0/f$a;
.super Lh0/f$c;
.source "SourceFile"

# interfaces
.implements Lh0/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh0/f$c;-><init>()V

    return-void
.end method

.method static g(Landroid/util/Size;II)Lh0/f$a;
    .locals 1

    new-instance v0, Lh0/b;

    invoke-direct {v0, p0, p1, p2}, Lh0/b;-><init>(Landroid/util/Size;II)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()I
.end method

.method public abstract getSize()Landroid/util/Size;
.end method
