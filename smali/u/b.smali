.class public Lu/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    const-class v0, Lt/h;

    invoke-static {v0}, Lt/i;->a(Ljava/lang/Class;)Lw/f2;

    move-result-object v0

    check-cast v0, Lt/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    :cond_0
    return p1
.end method
