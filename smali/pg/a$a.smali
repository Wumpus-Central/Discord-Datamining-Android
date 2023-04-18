.class Lpg/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/a;-><init>(Lci/n;Llh/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Ldi/o0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lpg/a;


# direct methods
.method constructor <init>(Lpg/a;)V
    .locals 0

    iput-object p1, p0, Lpg/a$a;->k:Lpg/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ldi/o0;
    .locals 3

    .line 1
    iget-object v0, p0, Lpg/a$a;->k:Lpg/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpg/a;->D0()Lwh/h;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Lpg/a$a$a;

    .line 8
    .line 9
    invoke-direct {v2, p0}, Lpg/a$a$a;-><init>(Lpg/a$a;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Ldi/s1;->v(Lmg/h;Lwh/h;Lkotlin/jvm/functions/Function1;)Ldi/o0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpg/a$a;->a()Ldi/o0;

    move-result-object v0

    return-object v0
.end method
