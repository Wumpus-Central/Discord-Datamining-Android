.class final Loh/d$g;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loh/d;->G1(Lmg/e;Ljava/lang/StringBuilder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ldi/g0;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Loh/d;


# direct methods
.method constructor <init>(Loh/d;)V
    .locals 0

    iput-object p1, p0, Loh/d$g;->k:Loh/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ldi/g0;)Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Loh/d$g;->k:Loh/d;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Loh/d;->w(Ldi/g0;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldi/g0;

    invoke-virtual {p0, p1}, Loh/d$g;->a(Ldi/g0;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
