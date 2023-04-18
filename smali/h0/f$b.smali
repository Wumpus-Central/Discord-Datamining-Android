.class abstract Lh0/f$b;
.super Lh0/f$c;
.source "SourceFile"

# interfaces
.implements Lh0/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh0/f$c;-><init>()V

    return-void
.end method

.method static g(II)Lh0/f$b;
    .locals 1

    new-instance v0, Lh0/c;

    invoke-direct {v0, p0, p1}, Lh0/c;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()I
.end method
