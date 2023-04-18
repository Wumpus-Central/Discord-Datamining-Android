.class public Lcom/facebook/soloader/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Z
    .locals 1

    and-int/lit8 p2, p2, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const/16 p2, 0x10

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    or-int/2addr p2, v0

    invoke-static {p1, p2}, Lcom/facebook/soloader/SoLoader;->s(Ljava/lang/String;I)Z

    move-result p1

    return p1
.end method
