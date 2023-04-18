.class Lpg/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/s;->z0()Lmg/h1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ldi/o0;",
        "Ldi/o0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lpg/s;


# direct methods
.method constructor <init>(Lpg/s;)V
    .locals 0

    iput-object p1, p0, Lpg/s$b;->k:Lpg/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ldi/o0;)Ldi/o0;
    .locals 1

    iget-object v0, p0, Lpg/s$b;->k:Lpg/s;

    invoke-static {v0, p1}, Lpg/s;->F0(Lpg/s;Ldi/o0;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldi/o0;

    invoke-virtual {p0, p1}, Lpg/s$b;->a(Ldi/o0;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method
