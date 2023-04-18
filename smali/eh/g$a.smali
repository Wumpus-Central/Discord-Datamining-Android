.class public final Leh/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvg/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leh/g;->b(Lvg/p;Lmg/h0;Lci/n;Lmg/k0;Leh/p;Leh/h;Lzh/r;Lbh/b;Lyg/i;Leh/x;)Lyg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Llh/b;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/b;",
            ")",
            "Ljava/util/List<",
            "Lch/a;",
            ">;"
        }
    .end annotation

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
