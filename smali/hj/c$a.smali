.class final Lhj/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhj/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhj/c;->L()Lhj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhj/e<",
        "Lnet/time4j/tz/k;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Appendable;Lfj/d;Lfj/t;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/tz/k;

    invoke-virtual {p0, p1, p2, p3, p4}, Lhj/c$a;->b(Lnet/time4j/tz/k;Ljava/lang/Appendable;Lfj/d;Lfj/t;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lnet/time4j/tz/k;Ljava/lang/Appendable;Lfj/d;Lfj/t;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/time4j/tz/k;",
            "Ljava/lang/Appendable;",
            "Lfj/d;",
            "Lfj/t<",
            "Lfj/o;",
            "TR;>;)TR;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
