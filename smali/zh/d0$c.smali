.class final Lzh/d0$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzh/d0;-><init>(Lzh/m;Lzh/d0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lmg/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzh/d0;


# direct methods
.method constructor <init>(Lzh/d0;)V
    .locals 0

    iput-object p1, p0, Lzh/d0$c;->k:Lzh/d0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Lmg/h;
    .locals 1

    iget-object v0, p0, Lzh/d0$c;->k:Lzh/d0;

    invoke-static {v0, p1}, Lzh/d0;->b(Lzh/d0;I)Lmg/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lzh/d0$c;->a(I)Lmg/h;

    move-result-object p1

    return-object p1
.end method
